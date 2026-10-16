package defpackage;

/* loaded from: classes2.dex */
final class mfx implements mdl {
    private int a = 0;

    @Override // defpackage.mdl
    public final void a() {
        lvl.E().b("NLPF.PollerToken");
        ((mfp) luk.b().a()).b.a(mgl.i);
    }

    @Override // defpackage.mdl
    public final void b() {
        yph yphVar = mfy.a;
        ((ype) ((ype) yphVar.f()).ai((char) 4870)).u("Permission polling timed out waiting for permission to be accepted");
        if (this.a >= 2) {
            ((ype) ((ype) yphVar.f()).ai((char) 4871)).u("No more polling attempts left, stopping listening for permission updates");
            return;
        }
        ((ype) ((ype) yphVar.f()).ai(4872)).w("Poll attempt: %d", this.a);
        lvl.E().a(lgv.b().a(), this, "NLPF.PollerToken");
        this.a++;
    }
}
