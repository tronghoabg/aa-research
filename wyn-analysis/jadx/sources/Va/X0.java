package Va;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class X0 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13839a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Z0 f13840b;

    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        boolean z2;
        switch (this.f13839a) {
            case 0:
                Z0.f13886P = (Z0.f13887Q + 101) % 128;
                Object objU = AbstractC1104pb.U(arrayList, 0, String.class);
                int i5 = Z0.f13886P + 11;
                Z0.f13887Q = i5 % 128;
                if (i5 % 2 == 0) {
                    int i10 = 6 / 0;
                }
                String str = (String) objU;
                Z0 z02 = this.f13840b;
                z02.getClass();
                int i11 = Z0.f13886P + 89;
                int i12 = i11 % 128;
                Z0.f13887Q = i12;
                int i13 = i11 % 2;
                z02.f13889M = str;
                if (i13 == 0) {
                    throw null;
                }
                int i14 = i12 + 117;
                int i15 = i14 % 128;
                Z0.f13886P = i15;
                if (i14 % 2 != 0) {
                    int i16 = 34 / 0;
                }
                Z0.f13887Q = (i15 + 119) % 128;
                return str;
            case 1:
                Z0 z03 = this.f13840b;
                z03.getClass();
                int i17 = Z0.f13886P;
                Z0.f13887Q = (i17 + 79) % 128;
                if (z03.f13889M != null) {
                    Z0.f13887Q = (i17 + 87) % 128;
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                String str2 = (String) arrayList.get(0);
                int i18 = Z0.f13886P + 13;
                Z0.f13887Q = i18 % 128;
                Class clsY0 = this.f13840b.y0(str2, i18 % 2 == 0);
                int i19 = Z0.f13887Q + 97;
                Z0.f13886P = i19 % 128;
                if (i19 % 2 == 0) {
                    return clsY0;
                }
                throw null;
        }
    }
}
