package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lua {
    public static final defpackage.ltz a = new defpackage.ltz();
    public static final defpackage.afhl b = new defpackage.lco(defpackage.mkp.b, 9);

    public static final defpackage.lua a() {
        return (defpackage.lua) b.getValue(a, defpackage.ltz.a[0]);
    }

    private static final void d(defpackage.zbd zbdVar, android.content.ComponentName componentName) {
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEMORY, zbdVar);
        rrvVarH.p(componentName);
        oimVarU.F(rrvVarH.l());
    }

    public final void b(android.content.ComponentName componentName) {
        d(defpackage.zbd.MH, componentName);
    }

    public final void c(int i, android.content.ComponentName componentName) {
        defpackage.zbd zbdVar;
        if (i == 5) {
            zbdVar = defpackage.zbd.Mz;
        } else if (i == 10) {
            zbdVar = defpackage.zbd.MA;
        } else if (i == 15) {
            zbdVar = defpackage.zbd.MB;
        } else if (i == 20) {
            zbdVar = defpackage.zbd.MC;
        } else if (i == 40) {
            zbdVar = defpackage.zbd.MD;
        } else if (i != 60) {
            zbdVar = i != 80 ? defpackage.zbd.MG : defpackage.zbd.MF;
        } else {
            zbdVar = defpackage.zbd.ME;
        }
        d(zbdVar, componentName);
    }
}
