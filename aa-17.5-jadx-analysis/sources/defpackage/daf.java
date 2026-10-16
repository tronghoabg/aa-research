package defpackage;

import android.view.Choreographer;
import java.util.List;

/* loaded from: classes.dex */
public final class daf implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ dag a;

    public daf(dag dagVar) {
        this.a = dagVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        dag dagVar = this.a;
        dagVar.d.removeCallbacks(this);
        dagVar.b();
        synchronized (dagVar.e) {
            if (dagVar.h) {
                dagVar.h = false;
                List list = dagVar.f;
                dagVar.f = dagVar.g;
                dagVar.g = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        dag dagVar = this.a;
        dagVar.b();
        synchronized (dagVar.e) {
            if (dagVar.f.isEmpty()) {
                dagVar.c.removeFrameCallback(this);
                dagVar.h = false;
            }
        }
    }
}
