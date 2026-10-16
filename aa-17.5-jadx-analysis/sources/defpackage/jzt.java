package defpackage;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.StandardDialpadView;
import com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.search.SearchView;

/* loaded from: classes2.dex */
public final class jzt implements View.OnTouchListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jzt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                oeb oebVar = (oeb) MaterialStandardDialpadView.b.get(view.getId());
                oebVar.getClass();
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 3) {
                            ((ype) MaterialStandardDialpadView.a.l().ai((char) 2868)).u("onDigitCancel");
                            ((MaterialStandardDialpadView) this.a).i(view);
                            break;
                        }
                    } else if (((MaterialStandardDialpadView) this.a).k(view, oebVar)) {
                        view.performClick();
                        break;
                    }
                } else {
                    ((MaterialStandardDialpadView) this.a).j(view, oebVar);
                    break;
                }
                break;
            case 1:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action != 0) {
                    if (action == 1) {
                        lk lkVar = (lk) this.a;
                        lkVar.n.removeCallbacks(lkVar.q);
                        break;
                    }
                } else {
                    lk lkVar2 = (lk) this.a;
                    PopupWindow popupWindow = lkVar2.p;
                    if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < popupWindow.getWidth() && y >= 0 && y < popupWindow.getHeight()) {
                        lkVar2.n.postDelayed(lkVar2.q, 250L);
                        break;
                    }
                }
                break;
            case 2:
                oeb oebVar2 = (oeb) StandardDialpadView.b.get(view.getId());
                oebVar2.getClass();
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 3) {
                            ((ype) StandardDialpadView.a.l().ai((char) 2883)).u("onDigitCancel");
                            ((StandardDialpadView) this.a).h(view);
                            break;
                        }
                    } else if (((StandardDialpadView) this.a).j(view, oebVar2)) {
                        view.performClick();
                        break;
                    }
                } else {
                    ((StandardDialpadView) this.a).i(view, oebVar2);
                    break;
                }
                break;
            case 3:
                ((mpi) this.a).b.run();
                break;
            case 4:
                view.getClass();
                motionEvent.getClass();
                ((RailHotseatItemView) this.a).e(view, motionEvent);
                break;
            case 5:
                view.getClass();
                motionEvent.getClass();
                ((RailHotseatItemView) this.a).e(view, motionEvent);
                break;
            case 6:
                view.getClass();
                motionEvent.getClass();
                ((RailHotseatItemView) this.a).e(view, motionEvent);
                break;
            case 7:
                if (motionEvent.getAction() == 4) {
                    Object obj = this.a;
                    if (((nqq) obj).g()) {
                        nqj nqjVarA = nqj.a.a();
                        int i = nqh.a;
                        nqjVarA.a(false);
                        ((nra) obj).i(yzy.LH);
                        break;
                    }
                }
                break;
            case 8:
                if (motionEvent.getAction() == 4) {
                    ((ocm) this.a).a();
                    break;
                }
                break;
            case 9:
                oeb oebVar3 = (oeb) com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView.b.get(view.getId());
                oebVar3.getClass();
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 3) {
                            ((ype) com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView.a.l().ai((char) 5594)).u("onDigitCancel");
                            ((com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.a).g(view);
                            break;
                        }
                    } else if (((com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.a).f(view, oebVar3)) {
                        view.performClick();
                        break;
                    }
                } else {
                    ((com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.a).c(view, oebVar3);
                    break;
                }
                break;
            case 10:
                SearchView searchView = (SearchView) this.a;
                if (searchView.j()) {
                    searchView.k.clearFocus();
                    break;
                }
                break;
            case 11:
                if (motionEvent.getAction() == 1) {
                    www wwwVar = (www) this.a;
                    if (wwwVar.p()) {
                        wwwVar.c = false;
                    }
                    wwwVar.m();
                    wwwVar.n();
                    break;
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0) {
                    Object obj2 = this.a;
                    nv nvVar = ((wzy) obj2).y.i;
                    mo moVar = (mo) obj2;
                    if (!nvVar.l.d(nvVar.o, moVar)) {
                        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
                        break;
                    } else if (moVar.a.getParent() == nvVar.o) {
                        nvVar.f();
                        nvVar.h = BitmapDescriptorFactory.HUE_RED;
                        nvVar.g = BitmapDescriptorFactory.HUE_RED;
                        nvVar.j(moVar, 2);
                        break;
                    } else {
                        Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public /* synthetic */ jzt(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
