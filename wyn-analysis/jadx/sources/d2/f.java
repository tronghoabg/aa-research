package d2;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f extends T1.d {

    /* renamed from: j, reason: collision with root package name */
    public long f33986j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f33987l;

    @Override // T1.d
    public final void o() {
        super.o();
        this.k = 0;
    }

    public final boolean t(T1.d dVar) {
        ByteBuffer byteBuffer;
        Q1.k.c(!dVar.h(1073741824));
        Q1.k.c(!dVar.h(268435456));
        Q1.k.c(!dVar.h(4));
        if (u()) {
            if (this.k >= this.f33987l) {
                return false;
            }
            ByteBuffer byteBuffer2 = dVar.f11358e;
            if (byteBuffer2 != null && (byteBuffer = this.f11358e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i5 = this.k;
        this.k = i5 + 1;
        if (i5 == 0) {
            this.f11360g = dVar.f11360g;
            if (dVar.h(1)) {
                this.f4893b = 1;
            }
        }
        ByteBuffer byteBuffer3 = dVar.f11358e;
        if (byteBuffer3 != null) {
            r(byteBuffer3.remaining());
            this.f11358e.put(byteBuffer3);
        }
        this.f33986j = dVar.f11360g;
        return true;
    }

    public final boolean u() {
        return this.k > 0;
    }
}
