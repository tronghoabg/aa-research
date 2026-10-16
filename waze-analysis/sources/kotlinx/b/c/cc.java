package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cc extends bt {

    /* renamed from: a, reason: collision with root package name */
    private short[] f51031a;

    /* renamed from: b, reason: collision with root package name */
    private int f51032b;

    public cc(short[] sArr) {
        h.g.b.x.f(sArr, "bufferWithData");
        this.f51031a = sArr;
        this.f51032b = sArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f51032b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        short[] sArrCopyOf = Arrays.copyOf(this.f51031a, this.f51032b);
        h.g.b.x.e(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    public final void c(short s) {
        cc ccVar = this;
        ccVar.d(ccVar.a() + 1);
        short[] sArr = this.f51031a;
        int i2 = this.f51032b;
        this.f51032b = i2 + 1;
        sArr[i2] = s;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        short[] sArr = this.f51031a;
        int length = sArr.length;
        if (length < i2) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(sArrCopyOf, "copyOf(...)");
            this.f51031a = sArrCopyOf;
        }
    }
}
