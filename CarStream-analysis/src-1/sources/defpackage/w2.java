package defpackage;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class w2 implements x9, y9 {
    public final /* synthetic */ x2 a;

    @Override // defpackage.y9
    public void a(float f) {
        long jK = z6.k();
        r8 r8Var = this.a.b;
        if (r8Var == null || jK <= 0) {
            return;
        }
        r8Var.seekTo((long) (f * jK));
    }

    @Override // defpackage.x9
    public void b(float f) {
        x2 x2Var = this.a;
        x2Var.f.setProgress((int) (r1.getMax() * f));
        ua.k(x2Var.i, f, z6.k());
    }
}
