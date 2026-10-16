package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class olj extends defpackage.okb {
    public final android.content.Context a;
    final /* synthetic */ defpackage.olk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olj(defpackage.olk olkVar, android.content.Context context) {
        super(olkVar);
        this.b = olkVar;
        this.a = context;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xyn.h(new defpackage.oli(this));
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.getString(com.google.android.projection.gearhead.R.string.wifi_disabled_detected_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.getString(com.google.android.projection.gearhead.R.string.wifi_disabled_detected_message);
    }

    @Override // defpackage.okf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.okf
    public final int f() {
        return this.b.f();
    }

    @Override // defpackage.okf
    public final defpackage.xyn i() {
        return defpackage.xyn.h(new android.content.Intent("android.settings.WIFI_SETTINGS").addFlags(268435456));
    }

    @Override // defpackage.okf
    public final defpackage.xyn n() {
        return defpackage.xyn.h(this.a.getString(com.google.android.projection.gearhead.R.string.wifi_disabled_detected_notification_message));
    }
}
