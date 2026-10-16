package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dix extends defpackage.ebl {
    final /* synthetic */ aiuf a;
    final /* synthetic */ defpackage.dhl b;
    final /* synthetic */ android.content.Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dix(aiuf aiufVar, defpackage.dhl dhlVar, android.content.Context context) {
        super(null);
        this.a = aiufVar;
        this.b = dhlVar;
        this.c = context;
    }

    @Override // defpackage.ebl
    public final void a(int i) {
        java.lang.String str;
        if (i == -3) {
            str = "Generic error loading font, for example variation settings were not parsable";
        } else if (i == -2) {
            str = "The given provider cannot be authenticated with the certificates given.";
        } else if (i == -1) {
            str = "The requested provider was not found on this device.";
        } else if (i == 1) {
            str = "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml";
        } else if (i != 2) {
            str = i != 3 ? "Unknown error code" : "The given query was not supported by this provider.";
        } else {
            str = "The provider found the queried font, but it is currently unavailable.";
        }
        defpackage.dhl dhlVar = this.b;
        this.a.g(new java.lang.IllegalStateException("Failed to load " + dhlVar + " (reason=" + i + ", " + str + ")"));
    }

    @Override // defpackage.ebl
    public final void b(android.graphics.Typeface typeface) {
        java.lang.ThreadLocal threadLocal = defpackage.diz.a;
        if (typeface == null) {
            typeface = null;
        } else {
            defpackage.dij dijVar = this.b.b;
            if (!dijVar.a.isEmpty()) {
                java.lang.ThreadLocal threadLocal2 = defpackage.diz.a;
                android.graphics.Paint paint = (android.graphics.Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new android.graphics.Paint();
                    threadLocal2.set(paint);
                }
                android.content.Context context = this.c;
                a$.ExternalSyntheticApiModelOutline1.m(paint, (java.lang.String) null);
                paint.setTypeface(typeface);
                a$.ExternalSyntheticApiModelOutline1.m(paint, defpackage.day.s(dijVar, context));
                typeface = paint.getTypeface();
            }
        }
        this.a.w(typeface);
    }
}
