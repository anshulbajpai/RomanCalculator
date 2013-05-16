public class SymbolChain{

    private final Symbol first;
    private final Symbol second;

    public SymbolChain(Symbol first, Symbol second) {

        this.first = first;
        this.second = second;
    }

    public SymbolChain(Symbol onlySymbol) {
        this(onlySymbol,new NullSymbol());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SymbolChain that = (SymbolChain) o;

        if (first != null ? !first.equals(that.first) : that.first != null) return false;
        if (second != null ? !second.equals(that.second) : that.second != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
