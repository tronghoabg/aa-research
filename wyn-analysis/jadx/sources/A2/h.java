package a2;

import android.os.SystemClock;
import java.util.List;
import n2.AbstractC3580c;

/* loaded from: classes.dex */
public final class h extends AbstractC3580c {

    /* renamed from: g, reason: collision with root package name */
    public int f17165g;

    @Override // n2.q
    public final void l(long j8, long j10, long j11, List list, l2.m[] mVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m(this.f17165g, jElapsedRealtime)) {
            for (int i5 = this.f40808b - 1; i5 >= 0; i5--) {
                if (!m(i5, jElapsedRealtime)) {
                    this.f17165g = i5;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // n2.q
    public final int n() {
        return this.f17165g;
    }

    @Override // n2.q
    public final Object p() {
        return null;
    }

    @Override // n2.q
    public final int u() {
        return 0;
    }
}
