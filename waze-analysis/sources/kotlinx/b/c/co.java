package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class co extends bt {

    /* renamed from: a, reason: collision with root package name */
    private int[] f51055a;

    /* renamed from: b, reason: collision with root package name */
    private int f51056b;

    public /* synthetic */ co(int[] iArr) {
        h.g.b.x.f(iArr, "bufferWithData");
        this.f51055a = iArr;
        this.f51056b = iArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f51056b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        int[] iArrCopyOf = Arrays.copyOf(this.f51055a, this.f51056b);
        h.g.b.x.e(iArrCopyOf, "copyOf(...)");
        h.u.c(iArrCopyOf);
        return h.u.a(iArrCopyOf);
    }

    public final void c(int i2) {
        co coVar = this;
        coVar.d(coVar.a() + 1);
        int[] iArr = this.f51055a;
        int i3 = this.f51056b;
        this.f51056b = i3 + 1;
        iArr[i3] = i2;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        int[] iArr = this.f51055a;
        int length = iArr.length;
        if (length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(iArrCopyOf, "copyOf(...)");
            h.u.c(iArrCopyOf);
            this.f51055a = iArrCopyOf;
        }
    }
}
