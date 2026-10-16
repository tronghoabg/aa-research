package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah extends bt {

    /* renamed from: a, reason: collision with root package name */
    private float[] f50958a;

    /* renamed from: b, reason: collision with root package name */
    private int f50959b;

    public ah(float[] fArr) {
        h.g.b.x.f(fArr, "bufferWithData");
        this.f50958a = fArr;
        this.f50959b = fArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f50959b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        float[] fArrCopyOf = Arrays.copyOf(this.f50958a, this.f50959b);
        h.g.b.x.e(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public final void c(float f2) {
        ah ahVar = this;
        ahVar.d(ahVar.a() + 1);
        float[] fArr = this.f50958a;
        int i2 = this.f50959b;
        this.f50959b = i2 + 1;
        fArr[i2] = f2;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        float[] fArr = this.f50958a;
        int length = fArr.length;
        if (length < i2) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(fArrCopyOf, "copyOf(...)");
            this.f50958a = fArrCopyOf;
        }
    }
}
