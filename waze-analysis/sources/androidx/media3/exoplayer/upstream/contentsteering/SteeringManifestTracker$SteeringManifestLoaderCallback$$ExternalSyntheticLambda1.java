package androidx.media3.exoplayer.upstream.contentsteering;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final /* synthetic */ class SteeringManifestTracker$SteeringManifestLoaderCallback$$ExternalSyntheticLambda1 implements Runnable {
    public /* synthetic */ SteeringManifestTracker f$0;

    public /* synthetic */ SteeringManifestTracker$SteeringManifestLoaderCallback$$ExternalSyntheticLambda1(SteeringManifestTracker steeringManifestTracker) {
        this.f$0 = steeringManifestTracker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.loadSteeringManifestImmediately();
    }
}
