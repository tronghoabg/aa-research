package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class bg<H> extends defpackage.be {
    public final android.app.Activity b;
    public final android.content.Context c;
    public final android.os.Handler d;
    public final defpackage.bt e;

    public bg(android.app.Activity activity, android.content.Context context, android.os.Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
        this.e = new defpackage.bt();
    }

    @Override // defpackage.be
    public android.view.View a(int i) {
        throw null;
    }

    @Override // defpackage.be
    public boolean b() {
        return true;
    }

    public android.view.LayoutInflater c() {
        throw null;
    }

    public abstract java.lang.Object e();

    public boolean o(java.lang.String str) {
        str.getClass();
        return false;
    }

    public void u(java.lang.String[] strArr) {
        strArr.getClass();
    }

    public final void v(android.content.Intent intent, int i, android.os.Bundle bundle) {
        intent.getClass();
        if (i != -1) {
            throw new java.lang.IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.c.startActivity(intent, bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bg(android.content.Context context, android.os.Handler handler) {
        this(context instanceof android.app.Activity ? (android.app.Activity) context : null, context, handler);
        handler.getClass();
    }

    public void j() {
    }

    public void q(java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }
}
