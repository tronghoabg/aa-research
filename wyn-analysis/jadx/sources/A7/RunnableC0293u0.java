package A7;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.io.IOException;
import n7.C3597b;

/* renamed from: A7.u0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0293u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1075a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ BinderC0287s0 f1076b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ N1 f1077c;

    public /* synthetic */ RunnableC0293u0(int i5) {
        this.f1075a = i5;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f1075a) {
            case 0:
                L1 l12 = this.f1076b.f1045a;
                l12.Z();
                l12.T(this.f1077c);
                break;
            case 1:
                L1 l13 = this.f1076b.f1045a;
                l13.Z();
                l13.S(this.f1077c);
                break;
            case 2:
                BinderC0287s0 binderC0287s0 = this.f1076b;
                binderC0287s0.f1045a.Z();
                binderC0287s0.f1045a.N(this.f1077c);
                break;
            case 3:
                BinderC0287s0 binderC0287s02 = this.f1076b;
                binderC0287s02.f1045a.Z();
                L1 l14 = binderC0287s02.f1045a;
                l14.zzl().c0();
                l14.a0();
                N1 n12 = this.f1077c;
                AbstractC1732v.f(n12.f619a);
                l14.c(n12);
                break;
            case 4:
                BinderC0287s0 binderC0287s03 = this.f1076b;
                binderC0287s03.f1045a.Z();
                L1 l15 = binderC0287s03.f1045a;
                l15.zzl().c0();
                l15.a0();
                N1 n13 = this.f1077c;
                AbstractC1732v.i(n13);
                String str = n13.f619a;
                AbstractC1732v.f(str);
                if (l15.O().o0(null, AbstractC0304y.f1174c1)) {
                    int i5 = 0;
                    if (l15.O().o0(null, AbstractC0304y.f1195k0)) {
                        ((C3597b) l15.zzb()).getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int iI0 = l15.O().i0(null, AbstractC0304y.f1157V);
                        l15.O();
                        long jLongValue = jCurrentTimeMillis - ((Long) AbstractC0304y.f1178e.a(null)).longValue();
                        while (i5 < iI0 && l15.x(jLongValue, null)) {
                            i5++;
                        }
                    } else {
                        l15.O();
                        long jIntValue = ((Integer) AbstractC0304y.f1197l.a(null)).intValue();
                        while (i5 < jIntValue && l15.x(0L, str)) {
                            i5++;
                        }
                    }
                    if (l15.O().o0(null, AbstractC0304y.f1198l0)) {
                        l15.B();
                        break;
                    }
                }
                break;
            case 5:
                BinderC0287s0 binderC0287s04 = this.f1076b;
                binderC0287s04.f1045a.Z();
                L1 l16 = binderC0287s04.f1045a;
                l16.zzl().c0();
                l16.a0();
                N1 n14 = this.f1077c;
                AbstractC1732v.f(n14.f619a);
                l16.T(n14);
                l16.S(n14);
                break;
            default:
                BinderC0287s0 binderC0287s05 = this.f1076b;
                binderC0287s05.f1045a.Z();
                binderC0287s05.f1045a.P(this.f1077c);
                break;
        }
    }

    public /* synthetic */ RunnableC0293u0(BinderC0287s0 binderC0287s0, N1 n12, int i5) {
        this.f1075a = i5;
        this.f1077c = n12;
        this.f1076b = binderC0287s0;
    }
}
