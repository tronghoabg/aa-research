package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa extends bt {

    /* renamed from: a, reason: collision with root package name */
    private double[] f50943a;

    /* renamed from: b, reason: collision with root package name */
    private int f50944b;

    public aa(double[] dArr) {
        h.g.b.x.f(dArr, "bufferWithData");
        this.f50943a = dArr;
        this.f50944b = dArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f50944b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        double[] dArrCopyOf = Arrays.copyOf(this.f50943a, this.f50944b);
        h.g.b.x.e(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    public final void c(double d2) {
        aa aaVar = this;
        aaVar.d(aaVar.a() + 1);
        double[] dArr = this.f50943a;
        int i2 = this.f50944b;
        this.f50944b = i2 + 1;
        dArr[i2] = d2;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        double[] dArr = this.f50943a;
        int length = dArr.length;
        if (length < i2) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(dArrCopyOf, "copyOf(...)");
            this.f50943a = dArrCopyOf;
        }
    }
}
