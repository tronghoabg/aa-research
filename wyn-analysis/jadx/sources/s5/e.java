package S5;

import E5.S;
import E5.T;
import G5.AbstractC0521b;
import N2.i;
import S3.s;
import com.applovin.shadow.okio.Utf8;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import l8.AbstractC3409K;
import org.apache.tika.fork.ForkServer;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class e extends i {

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f11018p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f11019q = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: o, reason: collision with root package name */
    public boolean f11020o;

    public static boolean g(Y4.b bVar, byte[] bArr) {
        if (bVar.a() < bArr.length) {
            return false;
        }
        int i5 = bVar.f16680b;
        byte[] bArr2 = new byte[bArr.length];
        bVar.c(0, bArr.length, bArr2);
        bVar.A(i5);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // N2.i
    public final long c(Y4.b bVar) {
        int i5;
        byte[] bArr = bVar.f16679a;
        byte b5 = bArr[0];
        int i10 = b5 & ForkServer.ERROR;
        int i11 = b5 & 3;
        if (i11 != 0) {
            i5 = 2;
            if (i11 != 1 && i11 != 2) {
                i5 = bArr[1] & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i5 = 1;
        }
        int i12 = i10 >> 3;
        return (this.f8370f * (i5 * (i12 >= 16 ? UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL << r0 : i12 >= 12 ? 10000 << (i12 & 1) : (i12 & 3) == 3 ? 60000 : 10000 << r0))) / 1000000;
    }

    @Override // N2.i
    public final boolean e(Y4.b bVar, long j8, s sVar) {
        if (g(bVar, f11018p)) {
            byte[] bArrCopyOf = Arrays.copyOf(bVar.f16679a, bVar.f16681c);
            int i5 = bArrCopyOf[9] & ForkServer.ERROR;
            ArrayList arrayListA = AbstractC0521b.a(bArrCopyOf);
            if (((T) sVar.f11009b) == null) {
                S s10 = new S();
                s10.k = "audio/opus";
                s10.f3217x = i5;
                s10.f3218y = 48000;
                s10.f3206m = arrayListA;
                sVar.f11009b = new T(s10);
                return true;
            }
        } else {
            if (!g(bVar, f11019q)) {
                AbstractC4256a.j((T) sVar.f11009b);
                return false;
            }
            AbstractC4256a.j((T) sVar.f11009b);
            if (!this.f11020o) {
                this.f11020o = true;
                bVar.B(8);
                W5.c cVarM0 = android.support.v4.media.session.b.m0(AbstractC3409K.k((String[]) android.support.v4.media.session.b.p0(bVar, false, false).f10967a));
                if (cVarM0 != null) {
                    S sA = ((T) sVar.f11009b).a();
                    W5.c cVar = ((T) sVar.f11009b).f3237j;
                    if (cVar != null) {
                        cVarM0 = cVarM0.c(cVar.f15149a);
                    }
                    sA.f3203i = cVarM0;
                    sVar.f11009b = new T(sA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // N2.i
    public final void f(boolean z2) {
        super.f(z2);
        if (z2) {
            this.f11020o = false;
        }
    }
}
