package androidx.camera.camera2.pipe.compat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ConcurrentSessionSequencers_Factory implements c.b.c<ConcurrentSessionSequencers> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final ConcurrentSessionSequencers_Factory INSTANCE = new ConcurrentSessionSequencers_Factory();

        private InstanceHolder() {
        }
    }

    public static ConcurrentSessionSequencers_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ConcurrentSessionSequencers newInstance() {
        return new ConcurrentSessionSequencers();
    }

    @Override // g.a.a, f.a.a
    public ConcurrentSessionSequencers get() {
        return newInstance();
    }
}
