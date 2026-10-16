package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class fd {
    final int a;
    int b;
    int c;
    int d;
    android.view.ViewGroup e;
    android.view.View f;
    android.view.View g;
    public defpackage.hh h;
    hd i;
    android.content.Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    android.os.Bundle p;

    public fd(int i) {
        this.a = i;
    }

    final void a(defpackage.hh hhVar) {
        hd hdVar;
        defpackage.hh hhVar2 = this.h;
        if (hhVar == hhVar2) {
            return;
        }
        if (hhVar2 != null) {
            hhVar2.m(this.i);
        }
        this.h = hhVar;
        if (hhVar == null || (hdVar = this.i) == null) {
            return;
        }
        hhVar.g(hdVar);
    }
}
