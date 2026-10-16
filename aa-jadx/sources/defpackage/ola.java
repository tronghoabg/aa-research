package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ola extends defpackage.okc {
    public final android.content.Context a;

    public ola(android.content.Context context) {
        super(defpackage.yyt.STARTUP_DIAGNOSTIC, false);
        this.a = context;
    }

    public static android.content.Intent c() {
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.settings.interactivetroubleshooter.InteractiveTroubleshooterActivity"));
        return intent;
    }

    @Override // defpackage.okc
    public final defpackage.okf a() {
        return new defpackage.okz(this);
    }

    @Override // defpackage.okc
    public final int d() {
        return 4;
    }

    @Override // defpackage.okc
    public final void b() {
    }
}
