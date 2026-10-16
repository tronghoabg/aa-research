package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class alh extends defpackage.alg {
    @Override // defpackage.alg
    public final void c(long j, float f) {
        if (!java.lang.Float.isNaN(f)) {
            this.a.setZoom(f);
        }
        this.a.show(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)));
    }
}
