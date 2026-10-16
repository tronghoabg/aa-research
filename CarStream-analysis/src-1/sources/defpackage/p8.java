package defpackage;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class p8 implements y9, x9 {
    public final /* synthetic */ z1 a;

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
        ua.k(this.a.g, f, z6.k());
    }
}
