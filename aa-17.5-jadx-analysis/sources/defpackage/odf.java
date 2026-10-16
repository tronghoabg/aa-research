package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class odf extends qjm {
    public final /* synthetic */ odg a;

    public odf(odg odgVar) {
        this.a = odgVar;
    }

    @Override // defpackage.qjm
    public final void a(String str, int i) {
        szp.u(new oa((Object) this, (CharSequence) str, i, 7));
    }

    @Override // defpackage.qjm
    public final void b(String str, int i, Bitmap bitmap) {
        szp.u(new isp(this, str, i, bitmap, 7));
    }

    @Override // defpackage.qjm
    public final void c() {
        ((ype) odg.a.l().ai((char) 5559)).u("Focus lost, dismissing transcription");
        szp.u(new nqw(this, 17));
    }

    @Override // defpackage.qjm
    public final void d(String str, String str2) {
        szp.u(new jda(this, str, str2, 20, (int[]) null));
    }

    @Override // defpackage.qjm
    public final void e(String str) {
        szp.u(new mgw(this, str, 16, null));
    }

    @Override // defpackage.qjm
    public final void f() {
        ((ype) odg.a.l().ai((char) 5560)).u("Transcription ended, dismissing transcription");
        szp.u(new nqw(this, 16));
    }

    @Override // defpackage.qjm
    public final void g(String str, int i, Bitmap bitmap, String str2) {
        szp.u(new ode(this, str, i, bitmap, str2, 0));
    }
}
