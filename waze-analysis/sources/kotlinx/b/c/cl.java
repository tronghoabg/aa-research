package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cl extends bt {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f51050a;

    /* renamed from: b, reason: collision with root package name */
    private int f51051b;

    public /* synthetic */ cl(byte[] bArr) {
        h.g.b.x.f(bArr, "bufferWithData");
        this.f51050a = bArr;
        this.f51051b = bArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f51051b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f51050a, this.f51051b);
        h.g.b.x.e(bArrCopyOf, "copyOf(...)");
        h.r.c(bArrCopyOf);
        return h.r.a(bArrCopyOf);
    }

    public final void c(byte b2) {
        cl clVar = this;
        clVar.d(clVar.a() + 1);
        byte[] bArr = this.f51050a;
        int i2 = this.f51051b;
        this.f51051b = i2 + 1;
        bArr[i2] = b2;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        byte[] bArr = this.f51050a;
        int length = bArr.length;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(bArrCopyOf, "copyOf(...)");
            h.r.c(bArrCopyOf);
            this.f51050a = bArrCopyOf;
        }
    }
}
