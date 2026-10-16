package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mwr {
    private static final defpackage.zbe a = defpackage.zbe.DASHBOARD;

    public static final void a(defpackage.zbd zbdVar, android.content.ComponentName componentName) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, a, zbdVar);
        if (componentName != null) {
            rrvVarH.p(componentName);
        }
        defpackage.omf.u().F(rrvVarH.l());
    }

    public static final void b(defpackage.zbd zbdVar, java.lang.String str) {
        a(zbdVar, str != null ? new android.content.ComponentName(str, "") : null);
    }

    public static final void c(defpackage.zbd zbdVar, java.lang.Integer num) {
        defpackage.rrv rrvVarK;
        if (num != null) {
            rrvVarK = defpackage.oeh.a().i(num.intValue(), a, zbdVar);
        } else {
            rrvVarK = defpackage.oeh.a().k(a, zbdVar);
        }
        defpackage.omf.u().F(rrvVarK.l());
    }
}
