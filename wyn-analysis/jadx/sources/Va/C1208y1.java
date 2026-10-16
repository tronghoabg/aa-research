package Va;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.unity3d.services.core.webview.WebViewApp;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: Va.y1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1208y1 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14800a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Z0 f14801b;

    public /* synthetic */ C1208y1(int i5) {
        this.f14800a = i5;
    }

    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        switch (this.f14800a) {
            case 0:
                Context context = (Context) arrayList.get(0);
                String str = (String) arrayList.get(1);
                String str2 = (String) arrayList.get(2);
                E1.f13299T = (E1.f13300U + 51) % 128;
                ((E1) this.f14801b).getClass();
                AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(context);
                C1220z1 c1220z1 = new C1220z1();
                c1220z1.f14831a = str;
                appLovinCommunicator.subscribe(c1220z1, str2);
                int i5 = (E1.f13299T + 123) % 128;
                E1.f13300U = i5;
                int i10 = i5 + 99;
                E1.f13299T = i10 % 128;
                if (i10 % 2 == 0) {
                    return null;
                }
                throw null;
            case 1:
                int i11 = K1.f13473S + 113;
                K1.f13474T = i11 % 128;
                int i12 = i11 % 2;
                ((K1) this.f14801b).getClass();
                K1.J0();
                if (i12 == 0) {
                    int i13 = 26 / 0;
                }
                int i14 = K1.f13474T + 47;
                K1.f13473S = i14 % 128;
                if (i14 % 2 == 0) {
                    return null;
                }
                throw null;
            case 2:
                WeakHashMap weakHashMap = (WeakHashMap) arrayList.get(0);
                C1082o2.f14450T = (C1082o2.f14451U + 119) % 128;
                C1082o2 c1082o2 = (C1082o2) this.f14801b;
                c1082o2.getClass();
                C1069n2 c1069n2 = new C1069n2(c1082o2, weakHashMap, ra2);
                int i15 = C1082o2.f14451U;
                int i16 = i15 + 101;
                C1082o2.f14450T = i16 % 128;
                if (i16 % 2 != 0) {
                    throw null;
                }
                C1082o2.f14450T = (i15 + 117) % 128;
                return c1069n2;
            default:
                Object obj = arrayList.get(0);
                P6 p62 = (P6) this.f14801b;
                p62.getClass();
                O6 o62 = new O6(p62, (WebViewApp) obj, ra2);
                P6.f13596U = (P6.f13595T + 85) % 128;
                return o62;
        }
    }
}
