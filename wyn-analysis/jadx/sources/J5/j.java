package J5;

import E5.T;
import java.io.EOFException;
import t6.InterfaceC4141i;

/* loaded from: classes3.dex */
public final class j implements w {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5653a = new byte[4096];

    @Override // J5.w
    public final void c(int i5, Y4.b bVar) {
        bVar.B(i5);
    }

    @Override // J5.w
    public final int d(InterfaceC4141i interfaceC4141i, int i5, boolean z2) throws EOFException {
        byte[] bArr = this.f5653a;
        int i10 = interfaceC4141i.read(bArr, 0, Math.min(bArr.length, i5));
        if (i10 != -1) {
            return i10;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // J5.w
    public final void e(int i5, Y4.b bVar) {
        bVar.B(i5);
    }

    @Override // J5.w
    public final void a(T t10) {
    }

    @Override // J5.w
    public final void b(long j8, int i5, int i10, int i11, v vVar) {
    }
}
