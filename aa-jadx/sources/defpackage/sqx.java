package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sqx {
    public static final defpackage.sqx a = new defpackage.sqx();
    private defpackage.lhe b = null;

    public static defpackage.lhe b(android.content.Context context) {
        return a.a(context);
    }

    public final synchronized defpackage.lhe a(android.content.Context context) {
        defpackage.lhe lheVar;
        lheVar = this.b;
        if (lheVar == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            lheVar = new defpackage.lhe(context);
            this.b = lheVar;
        }
        return lheVar;
    }
}
