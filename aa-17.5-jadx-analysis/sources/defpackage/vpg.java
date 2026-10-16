package defpackage;

/* loaded from: classes3.dex */
public final class vpg implements vpi {
    private final ajgw a;
    private final Comparable b;

    public vpg(ajgw ajgwVar, Comparable comparable) {
        this.a = ajgwVar;
        this.b = comparable;
    }

    @Override // defpackage.vpi
    public final long a() {
        return this.a.e(null);
    }

    @Override // defpackage.vpi
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((vpg) obj).b);
    }
}
