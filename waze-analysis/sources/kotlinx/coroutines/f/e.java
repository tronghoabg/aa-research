package kotlinx.coroutines.f;

import h.g.b.au;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class e extends g {

    /* renamed from: b, reason: collision with root package name */
    public static final e f51960b = new e();

    private e() {
        super(k.f51969c, k.f51970d, k.f51971e, k.f51967a);
    }

    @Override // kotlinx.coroutines.f.g, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.ab
    public final ab limitedParallelism(int i2, String str) {
        au.m(i2);
        return i2 >= k.f51969c ? au.l(this, str) : super.limitedParallelism(i2, str);
    }

    @Override // kotlinx.coroutines.ab
    public final String toString() {
        return "Dispatchers.Default";
    }
}
