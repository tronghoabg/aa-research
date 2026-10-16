package androidx.fragment.app;

import android.os.Bundle;
import android.support.v4.app.ar;
import android.support.v4.app.ca;
import h.ab;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentKt {
    public static final void clearFragmentResult(ar arVar, String str) {
        x.f(arVar, "<this>");
        x.f(str, "requestKey");
        arVar.getParentFragmentManager().J(str);
    }

    public static final void clearFragmentResultListener(ar arVar, String str) {
        x.f(arVar, "<this>");
        x.f(str, "requestKey");
        arVar.getParentFragmentManager().K(str);
    }

    public static final void setFragmentResult(ar arVar, String str, Bundle bundle) {
        x.f(arVar, "<this>");
        x.f(str, "requestKey");
        x.f(bundle, "result");
        arVar.getParentFragmentManager().aD(str, bundle);
    }

    public static final void setFragmentResultListener(ar arVar, String str, final p<? super String, ? super Bundle, ab> pVar) {
        x.f(arVar, "<this>");
        x.f(str, "requestKey");
        x.f(pVar, "listener");
        arVar.getParentFragmentManager().aE(str, arVar, new ca() { // from class: androidx.fragment.app.FragmentKt$$ExternalSyntheticLambda0
            @Override // android.support.v4.app.ca
            public final void onFragmentResult(String str2, Bundle bundle) {
                FragmentKt.setFragmentResultListener$lambda$0(pVar, str2, bundle);
            }
        });
    }

    static final void setFragmentResultListener$lambda$0(p pVar, String str, Bundle bundle) {
        x.f(str, "requestKey");
        x.f(bundle, "result");
        pVar.invoke(str, bundle);
    }
}
