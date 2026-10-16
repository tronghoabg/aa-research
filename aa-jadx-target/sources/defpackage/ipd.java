package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ipd {
    public android.content.Intent a;
    final /* synthetic */ defpackage.iph b;

    public ipd(defpackage.iph iphVar) {
        this.b = iphVar;
    }

    public final void a(android.content.Intent intent) {
        this.a = intent;
        if (intent != null) {
            intent.putExtra("PROJECTION_CONFIGURATION", this.b.b.d());
        }
    }
}
