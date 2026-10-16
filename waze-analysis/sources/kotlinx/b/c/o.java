package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends bt {

    /* renamed from: a, reason: collision with root package name */
    private char[] f51087a;

    /* renamed from: b, reason: collision with root package name */
    private int f51088b;

    public o(char[] cArr) {
        h.g.b.x.f(cArr, "bufferWithData");
        this.f51087a = cArr;
        this.f51088b = cArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f51088b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        char[] cArrCopyOf = Arrays.copyOf(this.f51087a, this.f51088b);
        h.g.b.x.e(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    public final void c(char c2) {
        o oVar = this;
        oVar.d(oVar.a() + 1);
        char[] cArr = this.f51087a;
        int i2 = this.f51088b;
        this.f51088b = i2 + 1;
        cArr[i2] = c2;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        char[] cArr = this.f51087a;
        int length = cArr.length;
        if (length < i2) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(cArrCopyOf, "copyOf(...)");
            this.f51087a = cArrCopyOf;
        }
    }
}
