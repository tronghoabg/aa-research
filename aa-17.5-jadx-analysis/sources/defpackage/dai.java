package defpackage;

import android.view.Choreographer;

/* loaded from: classes.dex */
final class dai implements Choreographer.FrameCallback {
    final /* synthetic */ aitf a;
    final /* synthetic */ afec b;

    public dai(aitf aitfVar, afec afecVar) {
        this.a = aitfVar;
        this.b = afecVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object aezvVar;
        try {
            aezvVar = this.b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            aezvVar = new aezv(th);
        }
        this.a.w(aezvVar);
    }
}
