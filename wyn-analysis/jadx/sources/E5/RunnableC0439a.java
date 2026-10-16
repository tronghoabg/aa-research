package E5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: E5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0439a extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3278a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3279b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3280c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3281d;

    public /* synthetic */ RunnableC0439a(Object obj, Handler handler, Object obj2, int i5) {
        this.f3278a = i5;
        this.f3281d = obj;
        this.f3279b = handler;
        this.f3280c = obj2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f3278a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.f3279b.post(this);
                    break;
                }
                break;
            default:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.f3279b.post(this);
                    break;
                }
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3278a) {
            case 0:
                if (((C0441b) this.f3281d).f3290b) {
                    ((F) this.f3280c).f3030a.N0(-1, 3, false);
                    break;
                }
                break;
            default:
                if (((C0441b) this.f3281d).f3290b) {
                    ((U1.r) this.f3280c).f12116a.P0(-1, 3, false);
                    break;
                }
                break;
        }
    }
}
