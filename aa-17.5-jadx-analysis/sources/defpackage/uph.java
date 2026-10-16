package defpackage;

/* loaded from: classes3.dex */
final class uph implements plg {
    final /* synthetic */ upm a;

    public uph(upm upmVar) {
        this.a = upmVar;
    }

    @Override // defpackage.plg
    public final String a() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.plg
    public final void f(float f) {
        upm upmVar = this.a;
        xyc xycVar = upmVar.i;
        synchronized (xycVar) {
            ((plb) xycVar.gu()).l();
        }
        xyc xycVar2 = upmVar.h;
        synchronized (xycVar2) {
            ((plb) xycVar2.gu()).l();
        }
        aacq aacqVarA = ((uyw) upmVar.f).a();
        aacqVarA.a.execute(new upk(aacqVarA, 2));
    }
}
