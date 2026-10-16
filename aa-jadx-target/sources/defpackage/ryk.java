package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class ryk {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqk b = defpackage.omv.n("CAR.SERVICE.USBMON.BASE");
    private static defpackage.ryk c;

    public static defpackage.ryk a(android.content.Context context) {
        return b(context, defpackage.xxe.a, new phu(3));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static defpackage.ryk b(android.content.Context r23, defpackage.xyn r24, defpackage.ryi r25) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryk.b(android.content.Context, xyn, ryi):ryk");
    }

    public abstract void c(java.io.PrintWriter printWriter);

    public abstract void d(java.lang.Object obj, int i);

    public abstract void e(java.lang.Object obj);

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public abstract boolean f();
}
