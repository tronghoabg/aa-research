package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ajfe extends defpackage.ajcv {
    public final defpackage.ldx c;

    public ajfe(long j, defpackage.ajfe ajfeVar, int i) {
        super(j, ajfeVar, i);
        this.c = new defpackage.ldx(defpackage.ajfd.f);
    }

    @Override // defpackage.ajcv
    public final int a() {
        return defpackage.ajfd.f;
    }

    @Override // defpackage.ajcv
    public final void k(int i) {
        defpackage.ldx ldxVar = this.c;
        ldxVar.k(i).c(defpackage.ajfd.e);
        r();
    }

    public final java.lang.String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + "]";
    }
}
