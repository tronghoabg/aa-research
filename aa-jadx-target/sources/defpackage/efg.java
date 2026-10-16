package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class efg {
    public final java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    private final java.lang.Object d;

    public efg(defpackage.ehq ehqVar, defpackage.afdo afdoVar) {
        afdoVar.getClass();
        this.d = ehqVar;
        this.a = afdoVar;
        this.b = new ehv();
        this.c = defpackage.afce.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [afdo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ehq, java.lang.Object] */
    public final defpackage.efh a() {
        ?? r0 = this.b;
        ?? r1 = this.c;
        r1.getClass();
        return new defpackage.egk(this.d, defpackage.afga.aa(new defpackage.efb((java.util.List) r1, (defpackage.afdk) null, 0)), r0, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    public final void b(java.util.List list) {
        this.c = defpackage.afga.aS(this.c, list);
    }

    public final se c() {
        java.lang.Object obj = this.d;
        android.content.Intent intent = (android.content.Intent) obj;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(((sk) this.a).b().a());
        java.lang.Object obj2 = this.c;
        if (obj2 != null) {
            intent.putExtras((android.os.Bundle) obj2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        android.os.LocaleList localeListM$1 = a$.ExternalSyntheticApiModelOutline2.m$1();
        java.lang.String languageTag = a$.ExternalSyntheticApiModelOutline2.m(localeListM$1) > 0 ? a$.ExternalSyntheticApiModelOutline2.m(localeListM$1, 0).toLanguageTag() : null;
        if (!android.text.TextUtils.isEmpty(languageTag)) {
            android.os.Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new android.os.Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            if (this.b == null) {
                this.b = android.app.ActivityOptions.makeBasic();
            }
            axd$.ExternalSyntheticApiModelOutline0.m((android.app.ActivityOptions) this.b, false);
        }
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            if (this.b == null) {
                this.b = android.app.ActivityOptions.makeBasic();
            }
            b$.ExternalSyntheticApiModelOutline0.m((android.app.ActivityOptions) this.b, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        java.lang.Object obj3 = this.b;
        return new se(obj, obj3 != null ? ((android.app.ActivityOptions) obj3).toBundle() : null);
    }

    public efg() {
        this.d = new android.content.Intent("android.intent.action.VIEW");
        this.a = new sk((byte[]) null);
    }
}
