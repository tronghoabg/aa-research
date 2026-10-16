package defpackage;

/* loaded from: classes.dex */
public final class alc extends alb {
    @Override // defpackage.alb
    public final void c(long j, float f) {
        if (!Float.isNaN(f)) {
            this.a.setZoom(f);
        }
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
    }
}
