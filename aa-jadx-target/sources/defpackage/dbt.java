package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dbt {
    public final defpackage.affc a;
    public int b = 0;
    public boolean c;
    public final android.view.GestureDetector d;

    public dbt(android.content.Context context, defpackage.affc affcVar) {
        this.a = affcVar;
        this.d = new android.view.GestureDetector(context, new defpackage.dbs(this));
    }

    public final void a() {
        this.b = 0;
        this.c = true;
    }
}
