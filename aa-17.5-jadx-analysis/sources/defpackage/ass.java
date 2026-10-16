package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ass implements ata {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ass(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [cfm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [cfm, java.lang.Object] */
    @Override // defpackage.ata
    public final int a(int i, dlr dlrVar) {
        int i2 = this.b;
        if (i2 == 0) {
            return ((cfr) this.a).a(0, i);
        }
        if (i2 == 1) {
            return this.a.a(0, i, dlrVar);
        }
        ?? r3 = this.a;
        return i2 != 2 ? r3.a(0, i, dlrVar) : ((cfr) r3).a(0, i);
    }
}
