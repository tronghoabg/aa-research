package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq extends bt {

    /* renamed from: a, reason: collision with root package name */
    private int[] f50967a;

    /* renamed from: b, reason: collision with root package name */
    private int f50968b;

    public aq(int[] iArr) {
        h.g.b.x.f(iArr, "bufferWithData");
        this.f50967a = iArr;
        this.f50968b = iArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f50968b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        int[] iArrCopyOf = Arrays.copyOf(this.f50967a, this.f50968b);
        h.g.b.x.e(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    public final void c(int i2) {
        aq aqVar = this;
        aqVar.d(aqVar.a() + 1);
        int[] iArr = this.f50967a;
        int i3 = this.f50968b;
        this.f50968b = i3 + 1;
        iArr[i3] = i2;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        int[] iArr = this.f50967a;
        int length = iArr.length;
        if (length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(iArrCopyOf, "copyOf(...)");
            this.f50967a = iArrCopyOf;
        }
    }
}
