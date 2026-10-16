package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends bt {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f51080a;

    /* renamed from: b, reason: collision with root package name */
    private int f51081b;

    public i(byte[] bArr) {
        h.g.b.x.f(bArr, "bufferWithData");
        this.f51080a = bArr;
        this.f51081b = bArr.length;
        d(10);
    }

    @Override // kotlinx.b.c.bt
    public final int a() {
        return this.f51081b;
    }

    @Override // kotlinx.b.c.bt
    public final /* bridge */ /* synthetic */ Object b() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f51080a, this.f51081b);
        h.g.b.x.e(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final void c(byte b2) {
        i iVar = this;
        iVar.d(iVar.a() + 1);
        byte[] bArr = this.f51080a;
        int i2 = this.f51081b;
        this.f51081b = i2 + 1;
        bArr[i2] = b2;
    }

    @Override // kotlinx.b.c.bt
    public final void d(int i2) {
        byte[] bArr = this.f51080a;
        int length = bArr.length;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, h.k.n.h(i2, length + length));
            h.g.b.x.e(bArrCopyOf, "copyOf(...)");
            this.f51080a = bArrCopyOf;
        }
    }
}
