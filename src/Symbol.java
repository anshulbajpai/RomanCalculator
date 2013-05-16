public class Symbol {

    private final String text;
    private final int value;

    public static final Symbol NULL = new Symbol("O",0);

    public Symbol(String text, int value) {
        this.text = text;
        this.value = value;
    }

    public int evaluate(Symbol previousSymbol) {
        if(previousSymbolIsGreater(previousSymbol)){
            return -value;
        }
        return value;
    }

    private boolean previousSymbolIsGreater(Symbol previousSymbol) {
        return previousSymbol.value > value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Symbol symbol = (Symbol) o;

        if (value != symbol.value) return false;
        if (text != null ? !text.equals(symbol.text) : symbol.text != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "text='" + text + '\'' +
                ", value=" + value +
                '}';
    }
}
