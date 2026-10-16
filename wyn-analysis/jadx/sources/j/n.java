package j;

import U8.v0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes.dex */
public final class n extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38476b;

    public /* synthetic */ n(Object obj, int i5) {
        this.f38475a = i5;
        this.f38476b = obj;
    }

    @Override // U8.v0, k1.Y
    public void d() {
        Object obj = this.f38476b;
        switch (this.f38475a) {
            case 0:
                ((m) obj).f38474b.f38548v.setVisibility(0);
                break;
            case 1:
                w wVar = (w) obj;
                wVar.f38548v.setVisibility(0);
                if (wVar.f38548v.getParent() instanceof View) {
                    View view = (View) wVar.f38548v.getParent();
                    WeakHashMap weakHashMap = S.f38779a;
                    k1.H.c(view);
                    break;
                }
                break;
        }
    }

    @Override // k1.Y
    public final void e() {
        Object obj = this.f38476b;
        switch (this.f38475a) {
            case 0:
                w wVar = ((m) obj).f38474b;
                wVar.f38548v.setAlpha(1.0f);
                wVar.f38551y.d(null);
                wVar.f38551y = null;
                break;
            case 1:
                w wVar2 = (w) obj;
                wVar2.f38548v.setAlpha(1.0f);
                wVar2.f38551y.d(null);
                wVar2.f38551y = null;
                break;
            default:
                Y2.B b5 = (Y2.B) obj;
                ((w) b5.f16384c).f38548v.setVisibility(8);
                w wVar3 = (w) b5.f16384c;
                PopupWindow popupWindow = wVar3.f38549w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (wVar3.f38548v.getParent() instanceof View) {
                    View view = (View) wVar3.f38548v.getParent();
                    WeakHashMap weakHashMap = S.f38779a;
                    k1.H.c(view);
                }
                wVar3.f38548v.e();
                wVar3.f38551y.d(null);
                wVar3.f38551y = null;
                ViewGroup viewGroup = wVar3.f38505A;
                WeakHashMap weakHashMap2 = S.f38779a;
                k1.H.c(viewGroup);
                break;
        }
    }
}
