package Va;

import com.tapjoy.TJSplitWebView;
import java.util.ArrayList;

/* renamed from: Va.r6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1124r6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        TJSplitWebView tJSplitWebView = (TJSplitWebView) arrayList.get(0);
        int i5 = C1225z6.f14838T + 81;
        C1225z6.f14837S = i5 % 128;
        if (i5 % 2 != 0) {
            C1225z6.L0(tJSplitWebView);
            throw null;
        }
        String strL0 = C1225z6.L0(tJSplitWebView);
        C1225z6.f14838T = (C1225z6.f14837S + 49) % 128;
        return strL0;
    }
}
