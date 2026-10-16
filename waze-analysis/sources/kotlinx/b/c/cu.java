package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cu extends bt {

    /* renamed from: a, reason: collision with root package name */
    private short[] f51065a;

    /* renamed from: b, reason: collision with root package name */
    private int f51066b;

    public /* synthetic */ cu(short[] sArr) {
        h.g.b.x.f(sArr, "bufferWithData");
        this.f51065a = sArr;
        this.f51066b = sArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f51066b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        short[] sArrCopyOf = Arrays.copyOf(this.f51065a, this.f51066b);
        h.g.b.x.e(sArrCopyOf, "copyOf(...)");
        h.z.c(sArrCopyOf);
        return h.z.a(sArrCopyOf);
    }

    public final void c(short s) {
        cu cuVar = this;
        cuVar.d(cuVar.a() + 1);
        short[] sArr = this.f51065a;
        int i2 = this.f51066b;
        this.f51066b = i2 + 1;
        sArr[i2] = s;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        short[] sArr = this.f51065a;
        int length = sArr.length;
        if (length < i2) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(sArrCopyOf, "copyOf(...)");
            h.z.c(sArrCopyOf);
            this.f51065a = sArrCopyOf;
        }
    }
}
