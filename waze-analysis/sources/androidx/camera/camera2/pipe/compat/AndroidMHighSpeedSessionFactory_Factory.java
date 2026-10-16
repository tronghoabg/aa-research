package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidMHighSpeedSessionFactory_Factory implements c.b.c<AndroidMHighSpeedSessionFactory> {
    private final c.b.e<StreamGraphImpl> streamGraphProvider;
    private final c.b.e<Threads> threadsProvider;

    private AndroidMHighSpeedSessionFactory_Factory(c.b.e<StreamGraphImpl> eVar, c.b.e<Threads> eVar2) {
        this.streamGraphProvider = eVar;
        this.threadsProvider = eVar2;
    }

    public static AndroidMHighSpeedSessionFactory_Factory create(c.b.e<StreamGraphImpl> eVar, c.b.e<Threads> eVar2) {
        return new AndroidMHighSpeedSessionFactory_Factory(eVar, eVar2);
    }

    public static AndroidMHighSpeedSessionFactory newInstance(StreamGraphImpl streamGraphImpl, Threads threads) {
        return new AndroidMHighSpeedSessionFactory(streamGraphImpl, threads);
    }

    @Override // g.a.a, f.a.a
    public AndroidMHighSpeedSessionFactory get() {
        return newInstance(this.streamGraphProvider.get(), this.threadsProvider.get());
    }
}
