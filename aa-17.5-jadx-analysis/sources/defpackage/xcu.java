package defpackage;

/* loaded from: classes3.dex */
final class xcu implements lhl {
    final /* synthetic */ xcw a;

    public xcu(xcw xcwVar) {
        this.a = xcwVar;
    }

    @Override // defpackage.lhl
    public final /* synthetic */ void a() {
        wer.c();
    }

    @Override // defpackage.lhl
    public final void b() {
        woy.aa(!this.a.j, "Cannot be stopped with pending start input");
    }

    @Override // defpackage.lhl
    public final void c() {
        xcw xcwVar = this.a;
        if (xcwVar.j) {
            xcwVar.j = false;
            xcwVar.c(xcwVar.h, xcwVar.i);
        }
    }

    @Override // defpackage.lhl
    public final boolean g(rbu rbuVar) {
        return false;
    }

    @Override // defpackage.lhl
    public final void e() {
    }

    @Override // defpackage.lhl
    public final void f() {
    }

    @Override // defpackage.lhl
    public final void d(boolean z, boolean z2) {
    }
}
