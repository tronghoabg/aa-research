package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ixg implements defpackage.ixd {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public ixg(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ixd
    public final void a() {
        if (this.b == 0) {
            java.util.Iterator it = ((defpackage.ixh) this.a).f.iterator();
            while (it.hasNext()) {
                ((defpackage.ixd) it.next()).a();
            }
        } else {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.iro.a.f()).ai((char) 1241)).u("onCarMicClosed");
            defpackage.iro iroVar = (defpackage.iro) this.a;
            iroVar.h = false;
            iroVar.a(null);
        }
    }

    @Override // defpackage.ixd
    public final void b() {
        if (this.b == 0) {
            java.util.Iterator it = ((defpackage.ixh) this.a).f.iterator();
            while (it.hasNext()) {
                ((defpackage.ixd) it.next()).b();
            }
        } else {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.iro.a.f()).ai((char) 1242)).u("onCarMicOpened");
            defpackage.iro iroVar = (defpackage.iro) this.a;
            iroVar.h = true;
            iroVar.a(null);
        }
    }
}
