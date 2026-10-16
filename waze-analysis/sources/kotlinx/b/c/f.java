package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends bt {

    /* renamed from: a, reason: collision with root package name */
    private boolean[] f51075a;

    /* renamed from: b, reason: collision with root package name */
    private int f51076b;

    public f(boolean[] zArr) {
        h.g.b.x.f(zArr, "bufferWithData");
        this.f51075a = zArr;
        this.f51076b = zArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f51076b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f51075a, this.f51076b);
        h.g.b.x.e(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    public final void c(boolean z) {
        f fVar = this;
        fVar.d(fVar.a() + 1);
        boolean[] zArr = this.f51075a;
        int i2 = this.f51076b;
        this.f51076b = i2 + 1;
        zArr[i2] = z;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        boolean[] zArr = this.f51075a;
        int length = zArr.length;
        if (length < i2) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(zArrCopyOf, "copyOf(...)");
            this.f51075a = zArrCopyOf;
        }
    }
}
