package defpackage;

/* loaded from: classes3.dex */
public abstract class aiad {
    private final ahld nameResolver;
    private final agdx source;
    private final ahlh typeTable;

    private aiad(ahld ahldVar, ahlh ahlhVar, agdx agdxVar) {
        this.nameResolver = ahldVar;
        this.typeTable = ahlhVar;
        this.source = agdxVar;
    }

    public abstract ahnf debugFqName();

    public final ahld getNameResolver() {
        return this.nameResolver;
    }

    public final agdx getSource() {
        return this.source;
    }

    public final ahlh getTypeTable() {
        return this.typeTable;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + debugFqName();
    }

    public /* synthetic */ aiad(ahld ahldVar, ahlh ahlhVar, agdx agdxVar, afeu afeuVar) {
        this(ahldVar, ahlhVar, agdxVar);
    }
}
