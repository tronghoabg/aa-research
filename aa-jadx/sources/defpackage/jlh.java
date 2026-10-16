package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jlh {
    private static final defpackage.yqm e = defpackage.yqm.c("CAR.SETUP.FRX");
    public int a = -1;
    public int b = -1;
    public android.content.Intent c;
    public boolean d;

    public final void a(android.content.Context context) {
        defpackage.ysr.bk(this.a != -1, "connectionType is required");
        defpackage.ysr.bk(this.b != -1, "aaSupportResult is required");
        defpackage.ysr.bk(this.c != null, "continueIntent is required");
        ((defpackage.yqj) e.l().ai(2291)).S("Launching: connectionType: %d, aaSupportedResult: %d, continueIntent set? %b, skipToUsbReset? %b", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Boolean.valueOf(this.c != null), java.lang.Boolean.valueOf(this.d));
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(defpackage.iuf.d);
        intent.putExtra("PreSetup.AA_SUPPORT_RESULT", this.b);
        intent.putExtra("PreSetup.CONTINUE_INTENT", this.c);
        intent.putExtra("connection_type", this.a);
        intent.putExtra("PreSetup.SKIP_TO_USB_RESET", this.d);
        intent.setFlags(276889600);
        context.startActivity(intent);
    }
}
