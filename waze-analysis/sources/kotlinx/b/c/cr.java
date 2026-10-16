package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cr extends bt {

    /* renamed from: a, reason: collision with root package name */
    private long[] f51060a;

    /* renamed from: b, reason: collision with root package name */
    private int f51061b;

    public /* synthetic */ cr(long[] jArr) {
        h.g.b.x.f(jArr, "bufferWithData");
        this.f51060a = jArr;
        this.f51061b = jArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f51061b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        long[] jArrCopyOf = Arrays.copyOf(this.f51060a, this.f51061b);
        h.g.b.x.e(jArrCopyOf, "copyOf(...)");
        h.w.c(jArrCopyOf);
        return h.w.a(jArrCopyOf);
    }

    public final void c(long j2) {
        cr crVar = this;
        crVar.d(crVar.a() + 1);
        long[] jArr = this.f51060a;
        int i2 = this.f51061b;
        this.f51061b = i2 + 1;
        jArr[i2] = j2;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        long[] jArr = this.f51060a;
        int length = jArr.length;
        if (length < i2) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(jArrCopyOf, "copyOf(...)");
            h.w.c(jArrCopyOf);
            this.f51060a = jArrCopyOf;
        }
    }
}
