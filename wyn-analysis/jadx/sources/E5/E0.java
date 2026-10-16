package E5;

import A7.V1;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3022a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3023b;

    /* renamed from: c, reason: collision with root package name */
    public final F f3024c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f3025d;

    /* renamed from: e, reason: collision with root package name */
    public V1 f3026e;

    /* renamed from: f, reason: collision with root package name */
    public int f3027f;

    /* renamed from: g, reason: collision with root package name */
    public int f3028g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3029h;

    public E0(Context context, Handler handler, F f10) {
        Context applicationContext = context.getApplicationContext();
        this.f3022a = applicationContext;
        this.f3023b = handler;
        this.f3024c = f10;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        AbstractC4256a.j(audioManager);
        this.f3025d = audioManager;
        this.f3027f = 3;
        this.f3028g = a(audioManager, 3);
        int i5 = this.f3027f;
        this.f3029h = u6.v.f46721a >= 23 ? audioManager.isStreamMute(i5) : a(audioManager, i5) == 0;
        V1 v1 = new V1(this, 1);
        try {
            u6.v.C(applicationContext, v1, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f3026e = v1;
        } catch (RuntimeException e7) {
            AbstractC4256a.D(e7, "StreamVolumeManager", "Error registering stream volume receiver");
        }
    }

    public static int a(AudioManager audioManager, int i5) {
        try {
            return audioManager.getStreamVolume(i5);
        } catch (RuntimeException e7) {
            AbstractC4256a.D(e7, "StreamVolumeManager", "Could not retrieve stream volume for stream type " + i5);
            return audioManager.getStreamMaxVolume(i5);
        }
    }

    public final void b() {
        int i5 = this.f3027f;
        AudioManager audioManager = this.f3025d;
        final int iA = a(audioManager, i5);
        int i10 = this.f3027f;
        final boolean zIsStreamMute = u6.v.f46721a >= 23 ? audioManager.isStreamMute(i10) : a(audioManager, i10) == 0;
        if (this.f3028g == iA && this.f3029h == zIsStreamMute) {
            return;
        }
        this.f3028g = iA;
        this.f3029h = zIsStreamMute;
        this.f3024c.f3030a.f3091l.p(30, new u6.g() { // from class: E5.D
            @Override // u6.g
            public final void invoke(Object obj) {
                ((u0) obj).t(iA, zIsStreamMute);
            }
        });
    }
}
