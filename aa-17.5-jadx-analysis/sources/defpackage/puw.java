package defpackage;

import android.content.SharedPreferences;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class puw implements SharedPreferences.OnSharedPreferenceChangeListener, puv {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/network/grpc/channel/ServerChannelManager");
    public URL b;
    public final psu c;
    public final puy d;
    private final AtomicBoolean f = new AtomicBoolean(false);
    public lws e = null;

    public puw(URL url, puy puyVar, psu psuVar) {
        this.b = url;
        this.d = puyVar;
        this.c = psuVar;
    }

    @Override // defpackage.puv
    public final zgp a() {
        this.f.getAndSet(true);
        return zgl.a;
    }

    public final synchronized URL b() {
        return this.b;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
    }
}
