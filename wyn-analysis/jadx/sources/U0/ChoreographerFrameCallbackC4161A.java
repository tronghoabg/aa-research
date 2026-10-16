package u0;

import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: u0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC4161A implements Choreographer.FrameCallback, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f46078a;

    public ChoreographerFrameCallbackC4161A(B b5) {
        this.f46078a = b5;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        this.f46078a.f46083c.removeCallbacks(this);
        B.z(this.f46078a);
        B b5 = this.f46078a;
        synchronized (b5.f46084d) {
            if (b5.f46089i) {
                b5.f46089i = false;
                ArrayList arrayList = b5.f46086f;
                b5.f46086f = b5.f46087g;
                b5.f46087g = arrayList;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((Choreographer.FrameCallback) arrayList.get(i5)).doFrame(j8);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        B.z(this.f46078a);
        B b5 = this.f46078a;
        synchronized (b5.f46084d) {
            if (b5.f46086f.isEmpty()) {
                b5.f46082b.removeFrameCallback(this);
                b5.f46089i = false;
            }
        }
    }
}
