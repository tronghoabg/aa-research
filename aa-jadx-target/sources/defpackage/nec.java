package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nec implements defpackage.nuy {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public nec(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    private static final java.lang.String d(nuv nuvVar) {
        android.content.ComponentName componentName;
        nvh nvhVar = nuvVar.c;
        java.lang.String str = nvhVar.f;
        return (!str.equals("com.google.android.projection.gearhead") || (componentName = nvhVar.B) == null) ? str : componentName.toString();
    }

    @Override // defpackage.nuy
    public final void a(nuv nuvVar) {
        if (this.b == 0) {
            if (nuvVar.c.x == defpackage.nve.h) {
                java.lang.Object obj = this.a;
                defpackage.rox.r(((defpackage.ned) obj).d, nuvVar.d);
                return;
            }
            return;
        }
        defpackage.mcj mcjVar = (defpackage.mcj) this.a;
        java.util.Map map = mcjVar.a;
        java.lang.String strD = d(nuvVar);
        if (map.containsKey(strD)) {
            mcjVar.a(strD).a(nuvVar.a);
        }
    }

    @Override // defpackage.nuy
    public final void b(nuv nuvVar) {
        if (this.b != 0) {
            defpackage.mci mciVarA = ((defpackage.mcj) this.a).a(d(nuvVar));
            java.lang.String str = nuvVar.b;
            long j = nuvVar.a;
            mciVarA.a.put(java.lang.Long.valueOf(j), new mch(str, j, nuvVar.c));
            return;
        }
        if (nuvVar.e && !nuvVar.c.k) {
            java.lang.Object obj = this.a;
            defpackage.rox.r(((defpackage.ned) obj).e, nuvVar.d);
        }
        if (nuvVar.c.x == defpackage.nve.h) {
            java.lang.Object obj2 = this.a;
            defpackage.rox.s(((defpackage.ned) obj2).d, nuvVar.d);
        }
    }

    @Override // defpackage.nuy
    public final void c(defpackage.ygw ygwVar) {
        if (this.b != 0) {
            return;
        }
        ygwVar.getClass();
    }
}
