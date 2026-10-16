package defpackage;

/* loaded from: classes.dex */
public final class jea implements jcv {
    private final boolean d;
    private final /* synthetic */ int e;

    public jea(boolean z, int i) {
        this.e = i;
        this.d = z;
    }

    @Override // defpackage.jcv
    public final int a(int i) {
        return this.e != 0 ? (i == 1 || (i == 19 && !this.d)) ? 1 : 2 : (i == 18 && !this.d) ? 1 : 2;
    }
}
