package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afen implements defpackage.aisp {
    public final java.lang.Object a;
    private final /* synthetic */ int b;

    public afen(int i) {
        this.b = i;
        this.a = new java.util.ArrayList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.aisp
    public final java.util.Iterator a() {
        return this.b != 0 ? this.a.iterator() : new defpackage.afem(this);
    }

    public afen(java.io.BufferedReader bufferedReader, int i) {
        this.b = i;
        this.a = bufferedReader;
    }
}
