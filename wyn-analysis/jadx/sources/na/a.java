package Na;

import Ma.j;
import Oa.c;
import Oa.g;
import Oa.h;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import c8.C1581e;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import j$.util.DesugarCollections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8634a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f8635b;

    /* renamed from: c, reason: collision with root package name */
    public final C1581e f8636c;

    /* renamed from: d, reason: collision with root package name */
    public final h f8637d;

    /* renamed from: e, reason: collision with root package name */
    public float f8638e;

    public a(Handler handler, Context context, C1581e c1581e, h hVar) {
        super(handler);
        this.f8634a = context;
        this.f8635b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f8636c = c1581e;
        this.f8637d = hVar;
    }

    public final float a() {
        AudioManager audioManager = this.f8635b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        this.f8636c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f10 = streamVolume / streamMaxVolume;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public final void b() {
        float f10 = this.f8638e;
        h hVar = this.f8637d;
        hVar.f8940a = f10;
        if (hVar.f8943d == null) {
            hVar.f8943d = c.f8930c;
        }
        Iterator it = DesugarCollections.unmodifiableCollection(hVar.f8943d.f8932b).iterator();
        while (it.hasNext()) {
            Qa.a aVar = ((j) it.next()).f7610e;
            g.f8938a.a(aVar.e(), "setDeviceVolume", Float.valueOf(f10), aVar.f9929a);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        super.onChange(z2);
        float fA = a();
        if (fA != this.f8638e) {
            this.f8638e = fA;
            b();
        }
    }
}
