package Va;

import com.google.android.gms.ads.AdListener;
import java.util.ArrayList;
import x6.AbstractC4480k;
import z6.AbstractC4618a;

/* renamed from: Va.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1106q0 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14518a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ W0 f14519b;

    public /* synthetic */ C1106q0(int i5) {
        this.f14518a = i5;
    }

    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        switch (this.f14518a) {
            case 0:
                W0.f13813U = (W0.f13812T + 31) % 128;
                Object objU = AbstractC1104pb.U(arrayList, 0, AdListener.class);
                int i5 = W0.f13812T + 57;
                W0.f13813U = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                T0 t02 = new T0();
                t02.f13715c = this.f14519b;
                t02.f13713a = (AdListener) objU;
                t02.f13714b = ra2;
                return t02;
            case 1:
                W0.f13812T = (W0.f13813U + 51) % 128;
                Object objU2 = AbstractC1104pb.U(arrayList, 0, AbstractC4618a.class);
                W0.f13812T = (W0.f13813U + 5) % 128;
                S0 s02 = new S0();
                s02.f13677c = this.f14519b;
                s02.f13675a = (AbstractC4618a) objU2;
                s02.f13676b = ra2;
                return s02;
            default:
                int i10 = W0.f13812T + 29;
                W0.f13813U = i10 % 128;
                AbstractC4480k abstractC4480k = (AbstractC4480k) AbstractC1104pb.U(arrayList, i10 % 2 == 0 ? 1 : 0, AbstractC4480k.class);
                U0 u02 = new U0();
                u02.f13748c = this.f14519b;
                u02.f13746a = abstractC4480k;
                u02.f13747b = ra2;
                return u02;
        }
    }
}
