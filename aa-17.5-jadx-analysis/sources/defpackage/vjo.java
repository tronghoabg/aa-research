package defpackage;

import android.view.Choreographer;

/* loaded from: classes3.dex */
public abstract class vjo {
    private Choreographer.FrameCallback a;

    public abstract void a(long j);

    final Choreographer.FrameCallback b() {
        if (this.a == null) {
            this.a = new jgj(this, 2);
        }
        return this.a;
    }
}
