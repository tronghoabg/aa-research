package G6;

import D6.C0395s;
import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;

/* renamed from: G6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0537a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile float f4574c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public static volatile long f4575d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f4576e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f4577a;

    /* renamed from: b, reason: collision with root package name */
    public float f4578b;

    public static float e(Context context) {
        zzbio zzbioVar = zzbix.zzpP;
        C0395s c0395s = C0395s.f2489e;
        boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!zBooleanValue) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager == null) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            return streamMaxVolume == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : audioManager.getStreamVolume(3) / streamMaxVolume;
        }
        C6.n nVar = C6.n.f1857D;
        nVar.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jIntValue = ((Integer) c0395s.f2492c.zzd(zzbix.zzpQ)).intValue();
        if (f4574c != -1.0f && jCurrentTimeMillis - f4575d < jIntValue) {
            return f4574c;
        }
        synchronized (f4576e) {
            try {
                nVar.k.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (f4574c != -1.0f && jCurrentTimeMillis2 - f4575d < jIntValue) {
                    return f4574c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                if (audioManager2 == null) {
                    f4574c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    f4575d = jCurrentTimeMillis2;
                    return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                int streamVolume = audioManager2.getStreamVolume(3);
                if (streamMaxVolume2 != 0) {
                    f10 = streamVolume / streamMaxVolume2;
                }
                f4574c = f10;
                f4575d = jCurrentTimeMillis2;
                return f4574c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void a(float f10) {
        this.f4578b = f10;
    }

    public final synchronized float b() {
        if (!f()) {
            return 1.0f;
        }
        return this.f4578b;
    }

    public final synchronized void c(boolean z2) {
        this.f4577a = z2;
    }

    public final synchronized boolean d() {
        return this.f4577a;
    }

    public final synchronized boolean f() {
        return this.f4578b >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
