package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class whg {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public whg(Bundle bundle) {
        this.e = (ltz) bundle.getSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.DATA_SOURCE");
        this.d = (lua) bundle.getSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.FLOW");
        this.c = (lub) bundle.getSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.SURFACE");
        this.b = (ComponentName) bundle.getParcelable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.EXTRA_COMPONENT_NAME");
        this.a = bundle.getBoolean("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.EXTRA_CONTAINS_AUDIO_MESSAGE");
    }

    private final void f(yzy yzyVar) {
        lxr.e();
        Object obj = this.d;
        obj.getClass();
        lxr.g(((lua) obj).g, yzyVar, (ComponentName) this.b);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        e(bundle);
        return bundle;
    }

    public final void b() {
        yzy yzyVar;
        Object obj = this.d;
        if (obj == null || (yzyVar = ((lua) obj).h) == null) {
            return;
        }
        lxr.e();
        lxr.g(((lub) this.c).h, yzyVar, (ComponentName) this.b);
    }

    public final void c() {
        f(yzy.mz);
    }

    public final void d() {
        f(yzy.mA);
        if (this.a) {
            Object obj = this.d;
            if (obj == lua.ASSISTANT_READ_REPLY || obj == lua.ASSISTANT_AUTO_READ || obj == lua.ASSISTANT_VOICE_INVOCATION) {
                lxr.e();
                Object obj2 = this.c;
                Object obj3 = this.b;
                lxr.g(((lub) obj2).h, yzy.KS, (ComponentName) obj3);
                return;
            }
            if (obj == lua.ASSISTANT_DIRECT_REPLY) {
                lxr.e();
                Object obj4 = this.c;
                Object obj5 = this.b;
                lxr.g(((lub) obj4).h, yzy.KT, (ComponentName) obj5);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.Parcelable, java.lang.Object] */
    public final void e(Bundle bundle) {
        bundle.putSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.DATA_SOURCE", this.e);
        bundle.putSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.FLOW", this.d);
        bundle.putSerializable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.SURFACE", this.c);
        bundle.putParcelable("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.EXTRA_COMPONENT_NAME", this.b);
        bundle.putBoolean("com.google.android.apps.auto.components.messaging.MessagingTelemetryMetadata.EXTRA_CONTAINS_AUDIO_MESSAGE", this.a);
    }

    public whg(ltz ltzVar, lua luaVar, lub lubVar, ComponentName componentName, boolean z) {
        this.e = ltzVar;
        this.d = luaVar;
        this.c = lubVar;
        this.b = componentName;
        this.a = z;
    }

    public whg(Context context, String str, ldk ldkVar, boolean z) {
        this.b = context;
        this.c = str;
        this.e = ldkVar;
        this.d = "AIzaSyADV44UeUN18OALWuLpZEOHA0set1EQLwM";
        this.a = z;
    }
}
