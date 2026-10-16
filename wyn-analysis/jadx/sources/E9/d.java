package E9;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.S;
import l4.DialogC3391g;
import p.C3753d;
import p.ViewOnKeyListenerC3748C;
import p.ViewOnKeyListenerC3754e;
import q.AbstractC3798D;
import q.AbstractC3799E;
import q.J;
import q.L0;
import q.M;

/* loaded from: classes4.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3605b;

    public /* synthetic */ d(Object obj, int i5) {
        this.f3604a = i5;
        this.f3605b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i5;
        Object obj = this.f3605b;
        switch (this.f3604a) {
            case 0:
                ((e) obj).f3611i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                break;
            case 1:
                ((g) obj).f3625i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                break;
            case 2:
                DialogC3391g dialogC3391g = (DialogC3391g) obj;
                dialogC3391g.f39993h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int i10 = dialogC3391g.f40000p;
                if ((i10 == 2 || i10 == 3) && i10 == 2 && (i5 = dialogC3391g.f39988c.f39980u) >= 0) {
                    dialogC3391g.f39993h.post(new R3.c(this, i5, 4));
                    break;
                }
                break;
            case 3:
                ViewOnKeyListenerC3754e viewOnKeyListenerC3754e = (ViewOnKeyListenerC3754e) obj;
                if (viewOnKeyListenerC3754e.a()) {
                    ArrayList arrayList = viewOnKeyListenerC3754e.f43006h;
                    if (arrayList.size() > 0 && !((C3753d) arrayList.get(0)).f42997a.f43650y) {
                        View view = viewOnKeyListenerC3754e.f43012o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C3753d) it.next()).f42997a.show();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC3754e.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 4:
                ViewOnKeyListenerC3748C viewOnKeyListenerC3748C = (ViewOnKeyListenerC3748C) obj;
                if (viewOnKeyListenerC3748C.a()) {
                    L0 l02 = viewOnKeyListenerC3748C.f42967h;
                    if (!l02.f43650y) {
                        View view2 = viewOnKeyListenerC3748C.f42971m;
                        if (view2 != null && view2.isShown()) {
                            l02.show();
                            break;
                        } else {
                            viewOnKeyListenerC3748C.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 5:
                M m10 = (M) obj;
                if (!m10.getInternalPopup().a()) {
                    m10.f43678f.i(AbstractC3799E.b(m10), AbstractC3799E.a(m10));
                }
                ViewTreeObserver viewTreeObserver = m10.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC3798D.a(viewTreeObserver, this);
                    break;
                }
                break;
            default:
                J j8 = (J) obj;
                M m11 = j8.f43664H;
                j8.getClass();
                WeakHashMap weakHashMap = S.f38779a;
                if (!m11.isAttachedToWindow() || !m11.getGlobalVisibleRect(j8.f43662F)) {
                    j8.dismiss();
                    break;
                } else {
                    j8.q();
                    j8.show();
                    break;
                }
                break;
        }
    }
}
