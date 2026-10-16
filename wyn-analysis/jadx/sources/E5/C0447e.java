package E5;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;

/* renamed from: E5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0447e {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f3310a;

    /* renamed from: b, reason: collision with root package name */
    public final C0445d f3311b;

    /* renamed from: c, reason: collision with root package name */
    public F f3312c;

    /* renamed from: d, reason: collision with root package name */
    public int f3313d;

    /* renamed from: e, reason: collision with root package name */
    public float f3314e = 1.0f;

    public C0447e(Context context, Handler handler, F f10) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        audioManager.getClass();
        this.f3310a = audioManager;
        this.f3312c = f10;
        this.f3311b = new C0445d(this, handler, 0);
        this.f3313d = 0;
    }

    public final void a() {
        if (this.f3313d == 0) {
            return;
        }
        int i5 = u6.v.f46721a;
        AudioManager audioManager = this.f3310a;
        if (i5 < 26) {
            audioManager.abandonAudioFocus(this.f3311b);
        }
        b(0);
    }

    public final void b(int i5) {
        if (this.f3313d == i5) {
            return;
        }
        this.f3313d = i5;
        float f10 = i5 == 3 ? 0.2f : 1.0f;
        if (this.f3314e == f10) {
            return;
        }
        this.f3314e = f10;
        F f11 = this.f3312c;
        if (f11 != null) {
            I i10 = f11.f3030a;
            i10.F0(1, 2, Float.valueOf(i10.f3073b0 * i10.f3046A.f3314e));
        }
    }

    public final int c(int i5, boolean z2) {
        a();
        return z2 ? 1 : -1;
    }
}
