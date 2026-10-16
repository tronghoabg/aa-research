package androidx.fragment.app;

import android.util.Log;
import g.C2653a;
import g.InterfaceC2654b;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class T implements InterfaceC2654b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f18342b;

    public /* synthetic */ T(e0 e0Var, int i5) {
        this.f18341a = i5;
        this.f18342b = e0Var;
    }

    @Override // g.InterfaceC2654b
    public final void onActivityResult(Object obj) {
        switch (this.f18341a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    iArr[i5] = ((Boolean) arrayList.get(i5)).booleanValue() ? 0 : -1;
                }
                e0 e0Var = this.f18342b;
                C1410a0 c1410a0 = (C1410a0) e0Var.f18398E.pollFirst();
                if (c1410a0 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    m0 m0Var = e0Var.f18410c;
                    String str = c1410a0.f18368a;
                    F fC = m0Var.c(str);
                    if (fC == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    } else {
                        fC.onRequestPermissionsResult(c1410a0.f18369b, strArr, iArr);
                        break;
                    }
                }
            case 1:
                C2653a c2653a = (C2653a) obj;
                e0 e0Var2 = this.f18342b;
                C1410a0 c1410a02 = (C1410a0) e0Var2.f18398E.pollLast();
                if (c1410a02 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    m0 m0Var2 = e0Var2.f18410c;
                    String str2 = c1410a02.f18368a;
                    F fC2 = m0Var2.c(str2);
                    if (fC2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        fC2.onActivityResult(c1410a02.f18369b, c2653a.f35454a, c2653a.f35455b);
                        break;
                    }
                }
            default:
                C2653a c2653a2 = (C2653a) obj;
                e0 e0Var3 = this.f18342b;
                C1410a0 c1410a03 = (C1410a0) e0Var3.f18398E.pollFirst();
                if (c1410a03 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    m0 m0Var3 = e0Var3.f18410c;
                    String str3 = c1410a03.f18368a;
                    F fC3 = m0Var3.c(str3);
                    if (fC3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        fC3.onActivityResult(c1410a03.f18369b, c2653a2.f35454a, c2653a2.f35455b);
                        break;
                    }
                }
        }
    }
}
