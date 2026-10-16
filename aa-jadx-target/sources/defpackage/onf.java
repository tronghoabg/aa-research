package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class onf {
    static final j$.time.Duration a;
    public static final /* synthetic */ int h = 0;
    private static final com.google.android.apps.auto.components.graphics.icon.GhIcon i;
    public final defpackage.tgf b;
    public final one c;
    public android.graphics.Bitmap d;
    public android.net.Uri e;
    private final android.os.Handler j = new android.os.Handler(android.os.Looper.getMainLooper());
    private boolean k = false;
    final ifd f = new defpackage.onb(this);
    public final ifd g = new defpackage.onc();

    static {
        defpackage.yqm.c("GH.MediaAsyncImageLdr");
        i = new com.google.android.apps.auto.components.graphics.icon.GhIcon(8);
        a = j$.time.Duration.ofMillis(200L);
    }

    public onf(defpackage.tgf tgfVar, one oneVar) {
        this.b = tgfVar;
        this.c = oneVar;
    }

    public static boolean c(ond ondVar) {
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = ondVar.a;
        return ghIcon == null || ghIcon.b != 8 || ondVar.b;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final ond a(android.content.Context context, android.net.Uri uri) {
        if (j$.util.Objects.equals(uri, this.e)) {
            android.graphics.Bitmap bitmap = this.d;
            return new ond(bitmap == null ? i : com.google.android.apps.auto.components.graphics.icon.GhIcon.l(bitmap), this.k);
        }
        b(context);
        this.e = uri;
        this.c.b();
        defpackage.tgg.a.b(this.b);
        this.k = true;
        hsc.c(context).b().f(uri).q(this.f);
        this.j.postDelayed(new ofs(this, uri, context, 9), a.toMillis());
        return new ond(i, this.k);
    }

    public final void b(android.content.Context context) {
        hsc.c(context).i(this.f);
        this.j.postDelayed(new oft(this, context, 5), a.toMillis());
        this.d = null;
        this.e = null;
        this.k = false;
    }
}
