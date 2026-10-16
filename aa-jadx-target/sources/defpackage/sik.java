package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sik {
    protected final android.content.Context a;
    protected final java.lang.String b;
    protected defpackage.sjp c = defpackage.sjp.a;
    public zxw d;

    public sik(android.content.Context context, java.lang.String str) {
        if (context == null) {
            throw new java.lang.NullPointerException("null reference");
        }
        this.a = context;
        defpackage.sqs.ax(str);
        this.b = str;
    }

    public final defpackage.sip a() {
        return new defpackage.sip(this.a, this.b, null, this.c, 0, null, null, null, this.d);
    }

    public final void b(defpackage.sjp sjpVar) {
        defpackage.sqs.aA(sjpVar);
        this.c = sjpVar;
        defpackage.sil.b(sjpVar);
    }
}
