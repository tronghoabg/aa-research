package h.k;

import h.a.ak;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends ak {

    /* renamed from: a, reason: collision with root package name */
    private boolean f48160a = true;

    /* renamed from: b, reason: collision with root package name */
    private long f48161b = -4611686018427387903L;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48160a;
    }

    @Override // h.a.ak
    public final long nextLong() {
        long j2 = this.f48161b;
        if (j2 != 4611686018427387903L) {
            this.f48161b = 1 + j2;
            return j2;
        }
        if (!this.f48160a) {
            throw new NoSuchElementException();
        }
        this.f48160a = false;
        return j2;
    }
}
