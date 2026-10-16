package com.waze.sound;

import android.app.Application;
import android.media.AudioManager;
import android.media.AudioManager$OnModeChangedListener;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fl implements fc, com.waze.ifs.ui.y {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ao f40018a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40019b;

    /* renamed from: c, reason: collision with root package name */
    private final AudioManager f40020c;

    /* renamed from: d, reason: collision with root package name */
    private final TelephonyManager f40021d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f40022e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.af f40023f;

    public fl(Application application, com.waze.ifs.ui.z zVar, com.waze.ao aoVar, fe feVar, kotlinx.coroutines.ab abVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(application, "applicationContext");
        h.g.b.x.f(zVar, "shutdownManager");
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(feVar, "config");
        h.g.b.x.f(abVar, "ioDispatcher");
        h.g.b.x.f(eVar, "logger");
        this.f40018a = aoVar;
        this.f40019b = eVar;
        Application application2 = application;
        Object systemService = ContextCompat.getSystemService(application2, AudioManager.class);
        if (systemService == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AudioManager audioManager = (AudioManager) systemService;
        this.f40020c = audioManager;
        Object systemService2 = ContextCompat.getSystemService(application2, TelephonyManager.class);
        if (systemService2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        TelephonyManager telephonyManager = (TelephonyManager) systemService2;
        this.f40021d = telephonyManager;
        this.f40022e = kotlinx.coroutines.b.ck.b(new ff(false, false, false));
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(abVar);
        this.f40023f = afVarE;
        zVar.b(this);
        kotlinx.coroutines.aj.z(afVarE, null, null, new bi(this, (h.c.e) null, 9), 3);
        kotlinx.coroutines.aj.z(afVarE, null, null, new bi(this, (h.c.e) null, 10, (byte[]) null), 3);
        if (Build.VERSION.SDK_INT >= 31) {
            audioManager.addOnModeChangedListener(application.getMainExecutor(), new AudioManager$OnModeChangedListener() { // from class: com.waze.sound.fd
                public final void onModeChanged(int i2) {
                    fl.g(this.f40003a, i2);
                }
            });
        } else {
            telephonyManager.listen(new fk(this), 32);
        }
    }

    static final void g(fl flVar, int i2) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = flVar.f40022e;
            objD = bnVar.d();
        } while (!bnVar.f(objD, ff.d((ff) objD, false, false, i2 != 0, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(ff ffVar) {
        boolean z = false;
        if (!ffVar.c() && !ffVar.b() && ffVar.a()) {
            z = true;
        }
        this.f40019b.a("shouldRouteSoundToSpeaker: isInACall=" + ffVar.c() + ", isCarConnected=" + ffVar.b() + ", routeSoundToSpeaker=" + ffVar.a() + " -> result=" + z);
        return z;
    }

    @Override // com.waze.sound.fc
    public final kotlinx.coroutines.b.k a() {
        return new fi(this.f40022e, this);
    }

    @Override // com.waze.sound.fc
    public final void b(boolean z) {
        ConfigValues.CONFIG_VALUE_SOUND_ROUTE_TO_SPEAKER_ANDROID.d(Boolean.valueOf(z));
    }

    @Override // com.waze.sound.fc
    public final boolean c() {
        return i((ff) this.f40022e.d());
    }

    @Override // com.waze.sound.fc
    public final boolean d() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_SOUND_ROUTE_TO_SPEAKER_ANDROID.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.ifs.ui.y
    public final void onShutdown() {
        kotlinx.coroutines.aj.h(this.f40023f, null);
    }
}
