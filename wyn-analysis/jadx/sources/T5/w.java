package T5;

import android.util.SparseArray;
import f6.C2584N;
import java.io.EOFException;
import java.io.InterruptedIOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class w implements J5.k {

    /* renamed from: e, reason: collision with root package name */
    public boolean f11722e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11723f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11724g;

    /* renamed from: h, reason: collision with root package name */
    public long f11725h;

    /* renamed from: i, reason: collision with root package name */
    public M5.a f11726i;

    /* renamed from: j, reason: collision with root package name */
    public C2584N f11727j;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final u6.t f11718a = new u6.t(0);

    /* renamed from: c, reason: collision with root package name */
    public final Y4.b f11720c = new Y4.b(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f11719b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final u f11721d = new u(0);

    @Override // J5.k
    public final void a(long j8, long j10) {
        u6.t tVar = this.f11718a;
        boolean z2 = tVar.d() == -9223372036854775807L;
        if (!z2) {
            long jC = tVar.c();
            z2 = (jC == -9223372036854775807L || jC == 0 || jC == j10) ? false : true;
        }
        if (z2) {
            tVar.e(j10);
        }
        M5.a aVar = this.f11726i;
        if (aVar != null) {
            aVar.D(j10);
        }
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f11719b;
            if (i5 >= sparseArray.size()) {
                return;
            }
            v vVar = (v) sparseArray.valueAt(i5);
            vVar.f11716f = false;
            vVar.f11711a.a();
            i5++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024c  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // J5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(J5.l r28, J5.n r29) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.w.g(J5.l, J5.n):int");
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f11727j = c2584n;
    }

    @Override // J5.k
    public final boolean i(J5.l lVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        J5.h hVar = (J5.h) lVar;
        hVar.c(bArr, 0, 14, false);
        if (442 == (((bArr[0] & ForkServer.ERROR) << 24) | ((bArr[1] & ForkServer.ERROR) << 16) | ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hVar.b(bArr[13] & 7, false);
            hVar.c(bArr, 0, 3, false);
            if (1 == (((bArr[0] & ForkServer.ERROR) << 16) | ((bArr[1] & ForkServer.ERROR) << 8) | (bArr[2] & ForkServer.ERROR))) {
                return true;
            }
        }
        return false;
    }

    @Override // J5.k
    public final void release() {
    }
}
