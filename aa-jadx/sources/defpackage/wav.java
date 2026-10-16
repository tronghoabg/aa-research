package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class wav {
    public static defpackage.wav a;
    public final android.content.Context b;
    public final android.database.ContentObserver c;
    public boolean d;

    public wav(android.content.Context context) {
        this.d = false;
        this.b = context;
        this.c = new defpackage.wau();
    }

    static synchronized void a() {
        android.content.Context context;
        defpackage.wav wavVar = a;
        if (wavVar != null && (context = wavVar.b) != null && wavVar.c != null && wavVar.d) {
            context.getContentResolver().unregisterContentObserver(a.c);
        }
        a = null;
    }

    static /* synthetic */ java.lang.String b(java.lang.Object obj, defpackage.wbn wbnVar, java.lang.String str) {
        return str + wbnVar.d() + ": " + java.lang.String.valueOf(obj);
    }

    public wav() {
        this.d = false;
        this.b = null;
        this.c = null;
    }
}
