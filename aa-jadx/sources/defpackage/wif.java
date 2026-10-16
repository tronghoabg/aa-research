package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wif {
    public final boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public wif(android.os.Bundle bundle) {
        this.e = (defpackage.luf) bundle.getSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.DATA_SOURCE");
        this.d = (defpackage.lug) bundle.getSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.FLOW");
        this.c = (defpackage.luh) bundle.getSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.SURFACE");
        this.b = (android.content.ComponentName) bundle.getParcelable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.EXTRA_COMPONENT_NAME");
        this.a = bundle.getBoolean("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.EXTRA_CONTAINS_AUDIO_MESSAGE");
    }

    private final void f(defpackage.zbd zbdVar) {
        defpackage.lxy.e();
        java.lang.Object obj = this.d;
        obj.getClass();
        defpackage.lxy.g(((defpackage.lug) obj).g, zbdVar, (android.content.ComponentName) this.b, 0L);
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        e(bundle);
        return bundle;
    }

    public final void b() {
        defpackage.zbd zbdVar;
        java.lang.Object obj = this.d;
        if (obj == null || (zbdVar = ((defpackage.lug) obj).h) == null) {
            return;
        }
        defpackage.lxy.e();
        defpackage.lxy.g(((defpackage.luh) this.c).h, zbdVar, (android.content.ComponentName) this.b, 0L);
    }

    public final void c() {
        f(defpackage.zbd.mz);
    }

    public final void d() {
        f(defpackage.zbd.mA);
        if (this.a) {
            java.lang.Object obj = this.d;
            if (obj == defpackage.lug.ASSISTANT_READ_REPLY || obj == defpackage.lug.ASSISTANT_AUTO_READ || obj == defpackage.lug.ASSISTANT_VOICE_INVOCATION) {
                defpackage.lxy.e();
                java.lang.Object obj2 = this.c;
                java.lang.Object obj3 = this.b;
                defpackage.lxy.g(((defpackage.luh) obj2).h, defpackage.zbd.KW, (android.content.ComponentName) obj3, 0L);
                return;
            }
            if (obj == defpackage.lug.ASSISTANT_DIRECT_REPLY) {
                defpackage.lxy.e();
                java.lang.Object obj4 = this.c;
                java.lang.Object obj5 = this.b;
                defpackage.lxy.g(((defpackage.luh) obj4).h, defpackage.zbd.KX, (android.content.ComponentName) obj5, 0L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.Parcelable, java.lang.Object] */
    public final void e(android.os.Bundle bundle) {
        bundle.putSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.DATA_SOURCE", this.e);
        bundle.putSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.FLOW", this.d);
        bundle.putSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.SURFACE", this.c);
        bundle.putParcelable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.EXTRA_COMPONENT_NAME", this.b);
        bundle.putBoolean("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.EXTRA_CONTAINS_AUDIO_MESSAGE", this.a);
    }

    public wif(defpackage.luf lufVar, defpackage.lug lugVar, defpackage.luh luhVar, android.content.ComponentName componentName, boolean z) {
        this.e = lufVar;
        this.d = lugVar;
        this.c = luhVar;
        this.b = componentName;
        this.a = z;
    }

    public wif(android.content.Context context, java.lang.String str, defpackage.ldp ldpVar, boolean z) {
        this.b = context;
        this.c = str;
        this.e = ldpVar;
        this.d = "AIzaSyADV44UeUN18OALWuLpZEOHA0set1EQLwM";
        this.a = z;
    }
}
