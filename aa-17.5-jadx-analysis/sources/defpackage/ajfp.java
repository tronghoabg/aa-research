package defpackage;

/* loaded from: classes3.dex */
final class ajfp implements abob {
    private final /* synthetic */ int f;
    static final abob e = new ajfp(4);
    static final abob d = new ajfp(3);
    static final abob c = new ajfp(2);
    static final abob b = new ajfp(1);
    static final abob a = new ajfp(0);

    private ajfp(int i) {
        this.f = i;
    }

    @Override // defpackage.abob
    public final boolean a(int i) {
        int i2 = this.f;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? a.aK(i) : a.aM(i) : a.aL(i) : a.aK(i) : a.aK(i);
    }
}
