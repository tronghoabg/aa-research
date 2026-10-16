package V5;

import android.os.HandlerThread;
import d2.C2386a;
import k8.InterfaceC3207p;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements InterfaceC3207p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13022b;

    public /* synthetic */ b(int i5, int i10) {
        this.f13021a = i10;
        this.f13022b = i5;
    }

    @Override // k8.InterfaceC3207p
    public final Object get() {
        switch (this.f13021a) {
            case 0:
                return new HandlerThread(Lc.b.e(this.f13022b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 1:
                return new HandlerThread(Lc.b.e(this.f13022b, "ExoPlayer:MediaCodecQueueingThread:"));
            case 2:
                return new HandlerThread(C2386a.b(this.f13022b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C2386a.b(this.f13022b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
