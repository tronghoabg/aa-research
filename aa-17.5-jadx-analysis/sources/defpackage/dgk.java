package defpackage;

import android.text.SegmentFinder;

/* loaded from: classes.dex */
public final class dgk extends SegmentFinder {
    final /* synthetic */ dgo a;

    public dgk(dgo dgoVar) {
        this.a = dgoVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.c(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.e(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.f(i);
    }
}
