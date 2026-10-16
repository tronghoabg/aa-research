package defpackage;

/* loaded from: classes3.dex */
public final class agjq {
    public static final agjp Companion = new agjp(null);
    private final ahyv deserialization;
    private final agje packagePartScopeCache;

    private agjq(ahyv ahyvVar, agje agjeVar) {
        this.deserialization = ahyvVar;
        this.packagePartScopeCache = agjeVar;
    }

    public final ahyv getDeserialization() {
        return this.deserialization;
    }

    public final agcu getModule() {
        return this.deserialization.getModuleDescriptor();
    }

    public final agje getPackagePartScopeCache() {
        return this.packagePartScopeCache;
    }

    public /* synthetic */ agjq(ahyv ahyvVar, agje agjeVar, afeu afeuVar) {
        this(ahyvVar, agjeVar);
    }
}
