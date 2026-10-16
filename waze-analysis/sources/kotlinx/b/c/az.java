package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class az extends bt {

    /* renamed from: a, reason: collision with root package name */
    private long[] f50978a;

    /* renamed from: b, reason: collision with root package name */
    private int f50979b;

    public az(long[] jArr) {
        h.g.b.x.f(jArr, "bufferWithData");
        this.f50978a = jArr;
        this.f50979b = jArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f50979b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        long[] jArrCopyOf = Arrays.copyOf(this.f50978a, this.f50979b);
        h.g.b.x.e(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    public final void c(long j2) {
        az azVar = this;
        azVar.d(azVar.a() + 1);
        long[] jArr = this.f50978a;
        int i2 = this.f50979b;
        this.f50979b = i2 + 1;
        jArr[i2] = j2;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        long[] jArr = this.f50978a;
        int length = jArr.length;
        if (length < i2) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(jArrCopyOf, "copyOf(...)");
            this.f50978a = jArrCopyOf;
        }
    }
}
