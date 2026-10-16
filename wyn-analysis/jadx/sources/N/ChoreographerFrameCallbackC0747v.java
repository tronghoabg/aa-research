package N;

import Ef.C0502n;
import android.view.Choreographer;

/* renamed from: N.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0747v implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7926a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0502n f7927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tf.l f7928c;

    public ChoreographerFrameCallbackC0747v(C0502n c0502n, tf.l lVar) {
        this.f7927b = c0502n;
        this.f7928c = lVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        Object objZ;
        Object objZ2;
        C0502n c0502n = this.f7927b;
        tf.l lVar = this.f7928c;
        switch (this.f7926a) {
            case 0:
                C0748w c0748w = C0748w.f7942a;
                try {
                    objZ2 = lVar.invoke(Long.valueOf(j8));
                } catch (Throwable th) {
                    objZ2 = Fe.e.z(th);
                }
                c0502n.resumeWith(objZ2);
                break;
            default:
                try {
                    objZ = lVar.invoke(Long.valueOf(j8));
                } catch (Throwable th2) {
                    objZ = Fe.e.z(th2);
                }
                c0502n.resumeWith(objZ);
                break;
        }
    }

    public ChoreographerFrameCallbackC0747v(C0502n c0502n, u0.C c10, tf.l lVar) {
        this.f7927b = c0502n;
        this.f7928c = lVar;
    }
}
