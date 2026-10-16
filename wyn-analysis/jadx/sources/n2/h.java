package N2;

import N1.B;
import N1.C;
import N1.C0764m;
import N1.C0765n;
import Q1.o;
import java.util.ArrayList;
import java.util.Arrays;
import l8.AbstractC3409K;
import org.apache.tika.fork.ForkServer;
import s2.AbstractC3991a;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f8362p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f8363q = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: o, reason: collision with root package name */
    public boolean f8364o;

    public static boolean g(o oVar, byte[] bArr) {
        if (oVar.a() < bArr.length) {
            return false;
        }
        int i5 = oVar.f9703b;
        byte[] bArr2 = new byte[bArr.length];
        oVar.f(0, bArr.length, bArr2);
        oVar.G(i5);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // N2.i
    public final long b(o oVar) {
        byte[] bArr = oVar.f9702a;
        return (this.f8370f * AbstractC3991a.l(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // N2.i
    public final boolean d(o oVar, long j8, S3.c cVar) {
        if (g(oVar, f8362p)) {
            byte[] bArrCopyOf = Arrays.copyOf(oVar.f9702a, oVar.f9704c);
            int i5 = bArrCopyOf[9] & ForkServer.ERROR;
            ArrayList arrayListC = AbstractC3991a.c(bArrCopyOf);
            if (((C0765n) cVar.f10936b) == null) {
                C0764m c0764m = new C0764m();
                c0764m.f8194m = C.m("audio/opus");
                c0764m.f8173B = i5;
                c0764m.f8174C = 48000;
                c0764m.f8197p = arrayListC;
                cVar.f10936b = new C0765n(c0764m);
                return true;
            }
        } else {
            if (!g(oVar, f8363q)) {
                Q1.k.h((C0765n) cVar.f10936b);
                return false;
            }
            Q1.k.h((C0765n) cVar.f10936b);
            if (!this.f8364o) {
                this.f8364o = true;
                oVar.H(8);
                B bU = AbstractC3991a.u(AbstractC3409K.k(AbstractC3991a.x(oVar, false, false).f44222b));
                if (bU != null) {
                    C0764m c0764mA = ((C0765n) cVar.f10936b).a();
                    c0764mA.k = bU.e(((C0765n) cVar.f10936b).f8230l);
                    cVar.f10936b = new C0765n(c0764mA);
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
            this.f8364o = false;
        }
    }
}
