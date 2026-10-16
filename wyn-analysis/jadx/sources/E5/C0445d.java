package E5;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: E5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0445d implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3300a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3302c;

    public /* synthetic */ C0445d(Object obj, Handler handler, int i5) {
        this.f3300a = i5;
        this.f3302c = obj;
        this.f3301b = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i5) {
        switch (this.f3300a) {
            case 0:
                this.f3301b.post(new RunnableC0443c(this, i5, 0));
                break;
            default:
                this.f3301b.post(new RunnableC0443c(this, i5, 1));
                break;
        }
    }
}
