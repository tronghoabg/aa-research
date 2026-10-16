package androidx.media3.exoplayer.upstream;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface LoaderErrorThrower {

    /* compiled from: WazeSource */
    public final class Placeholder implements LoaderErrorThrower {
        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() {
        }

        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError(int i2) {
        }
    }

    void maybeThrowError();

    void maybeThrowError(int i2);
}
