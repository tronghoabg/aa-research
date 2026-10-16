package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cex implements defpackage.bvs {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public cex(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bvs
    public final void a() {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.bwc) obj).j--;
        } else {
            ((defpackage.cey) obj).f--;
        }
    }

    @Override // defpackage.bvs
    public final void b() {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.bwc) obj).j++;
        } else {
            ((defpackage.cey) obj).f++;
        }
    }
}
