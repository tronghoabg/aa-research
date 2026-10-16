package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jeh implements defpackage.jdc {
    private final boolean d;
    private final /* synthetic */ int e;

    public jeh(boolean z, int i) {
        this.e = i;
        this.d = z;
    }

    @Override // defpackage.jdc
    public final int a(int i) {
        if (this.e != 0) {
            return (i == 1 || (i == 19 && !this.d)) ? 1 : 2;
        }
        return (i == 18 && !this.d) ? 1 : 2;
    }
}
