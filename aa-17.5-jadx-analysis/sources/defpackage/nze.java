package defpackage;

import android.animation.AnimatorSet;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment;
import com.google.android.apps.auto.components.ui.text.CountIndicatorTextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class nze implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ nze(bwq bwqVar, cil cilVar, cil cilVar2, cil cilVar3, cil cilVar4, int i) {
        this.f = i;
        this.c = bwqVar;
        this.d = cilVar;
        this.b = cilVar2;
        this.e = cilVar3;
        this.a = cilVar4;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r13v5, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int id;
        AnimatorSet animatorSet;
        CountIndicatorTextView countIndicatorTextView;
        int i = this.f;
        if (i == 0) {
            Boolean bool = (Boolean) obj;
            RailStatusBarFragment.b.l().y("Show clock: %s", bool);
            Object obj2 = this.a;
            RailStatusBarFragment railStatusBarFragment = (RailStatusBarFragment) obj2;
            TextView textView = railStatusBarFragment.f;
            if (textView == null) {
                affa.d("clock");
                textView = null;
            }
            bool.getClass();
            textView.setVisibility(true != bool.booleanValue() ? 8 : 0);
            if (railStatusBarFragment.l) {
                nso nsoVar = railStatusBarFragment.d;
                if (nsoVar.F() && !nsoVar.D()) {
                    Object obj3 = this.e;
                    Object obj4 = this.b;
                    drx drxVar = new drx();
                    ConstraintLayout constraintLayout = (ConstraintLayout) obj4;
                    drxVar.e(constraintLayout);
                    int id2 = ((ConstraintLayout) obj3).getId();
                    if (bool.booleanValue()) {
                        TextView textView2 = railStatusBarFragment.f;
                        if (textView2 == null) {
                            affa.d("clock");
                            textView2 = null;
                        }
                        id = textView2.getId();
                    } else {
                        View view = railStatusBarFragment.g;
                        if (view == null) {
                            affa.d("iconRow");
                            view = null;
                        }
                        id = view.getId();
                    }
                    drxVar.g(id2, 3, id, 3);
                    drxVar.c(constraintLayout);
                }
                Object obj5 = this.d;
                Object obj6 = this.c;
                if (bool.booleanValue()) {
                    obj6.getClass();
                    Fragment fragment = (Fragment) obj2;
                    RailStatusBarFragment.h((View) obj6, 24, fragment.requireContext());
                    obj5.getClass();
                    RailStatusBarFragment.h((View) obj5, 24, fragment.requireContext());
                } else {
                    obj6.getClass();
                    Fragment fragment2 = (Fragment) obj2;
                    RailStatusBarFragment.h((View) obj6, 28, fragment2.requireContext());
                    obj5.getClass();
                    RailStatusBarFragment.h((View) obj5, 28, fragment2.requireContext());
                }
            }
            return afak.a;
        }
        if (i == 1) {
            cis cisVar = (cis) obj;
            int i2 = nny.a;
            cisVar.getClass();
            if (cisVar.b() || cisVar.a()) {
                Object obj7 = this.d;
                int iOrdinal = ((nmr) this.c.a()).ordinal();
                if (iOrdinal == 1) {
                    ((cil) obj7).a(7);
                } else if (iOrdinal == 2) {
                    ((cil) this.b).a(7);
                } else if (iOrdinal == 3) {
                    ((cil) this.e).a(7);
                } else if (iOrdinal != 4) {
                    ((cil) obj7).a(7);
                } else {
                    ((cil) this.a).a(7);
                }
            }
            return afak.a;
        }
        if (i != 2) {
            if (i == 3) {
                axl axlVar = (axl) obj;
                axlVar.getClass();
                ?? r15 = this.d;
                List listAg = roc.ag(r15);
                axlVar.a(listAg.size(), new mzx(new ooh(4), listAg, 15, null), new nxj(listAg, 3), new cct(2039820996, true, new opc(listAg, (oqc) this.e, (axr) this.c, (afec) this.a, (bym) this.b, (bym) r15, 1)));
                return afak.a;
            }
            if (i != 4) {
                axl axlVar2 = (axl) obj;
                axlVar2.getClass();
                ?? r10 = this.d;
                axlVar2.a(r10.size(), null, new nxj(r10, 4), new cct(2039820996, true, new opc((List) r10, (Set) this.b, (List) r10, (kwp) this.c, (afec) this.e, (afec) this.a, 0)));
                return afak.a;
            }
            ((kwp) this.a).q(0);
            mlq.n(this.c).invoke(Integer.valueOf(((Number) this.d.a()).intValue()));
            mlq.m(this.b).invoke(Float.valueOf(BitmapDescriptorFactory.HUE_RED));
            mlq.l(this.e).invoke(true);
            return afak.a;
        }
        dzi dziVar = (dzi) obj;
        dziVar.getClass();
        Object obj8 = dziVar.b;
        nxs nxsVar = (nxs) dziVar.a;
        boolean zBooleanValue = ((Boolean) obj8).booleanValue();
        int i3 = nxsVar.b;
        Object obj9 = this.e;
        boolean z = (i3 <= 0 || zBooleanValue || ((RailStatusBarFragment) obj9).e) ? false : true;
        RailStatusBarFragment railStatusBarFragment2 = (RailStatusBarFragment) obj9;
        CountIndicatorTextView countIndicatorTextView2 = railStatusBarFragment2.h;
        if (countIndicatorTextView2 == null) {
            affa.d("notificationBadgeCount");
            countIndicatorTextView2 = null;
        }
        Object obj10 = this.d;
        boolean z2 = countIndicatorTextView2.getVisibility() == 0;
        obj10.getClass();
        View view2 = (View) obj10;
        boolean z3 = (z == z2 && zBooleanValue == (view2.getVisibility() == 0)) ? false : true;
        boolean z4 = nxsVar.a;
        if (z4) {
            z3 = z3 && (zBooleanValue || z);
        }
        MaterialCardView materialCardView = (MaterialCardView) this.a;
        boolean z5 = materialCardView.h != z4 || (z4 && !z);
        RailStatusBarFragment.b.l().R("onNotificationCenterStateChanged: %s, willChangeCountVisibility=%b, willChangeToggleState=%b", nxsVar, Boolean.valueOf(z3), Boolean.valueOf(z5));
        if (z3 && !z5) {
            Object obj11 = this.c;
            afec afecVar = railStatusBarFragment2.c;
            ViewParent parent = ((FrameLayout) obj11).getParent();
            parent.getClass();
            afecVar.invoke((ViewGroup) parent);
        }
        materialCardView.setChecked(z4);
        if (z && !railStatusBarFragment2.l) {
            CountIndicatorTextView countIndicatorTextView3 = railStatusBarFragment2.h;
            if (countIndicatorTextView3 == null) {
                affa.d("notificationBadgeCount");
                countIndicatorTextView3 = null;
            }
            countIndicatorTextView3.a(i3);
        }
        if (z3) {
            CountIndicatorTextView countIndicatorTextView4 = railStatusBarFragment2.h;
            if (countIndicatorTextView4 == null) {
                affa.d("notificationBadgeCount");
                countIndicatorTextView = null;
            } else {
                countIndicatorTextView = countIndicatorTextView4;
            }
            Object obj12 = this.b;
            int i4 = true != z ? 8 : 0;
            countIndicatorTextView.setVisibility(i4);
            obj12.getClass();
            ((View) obj12).setVisibility(i4);
        }
        if (z3 && !z && (animatorSet = railStatusBarFragment2.i) != null) {
            animatorSet.end();
            AnimatorSet animatorSetE = railStatusBarFragment2.e(i3, railStatusBarFragment2.d.F());
            animatorSetE.setStartDelay(0L);
            animatorSetE.start();
        }
        view2.setVisibility(true != zBooleanValue ? 8 : 0);
        return afak.a;
    }

    public /* synthetic */ nze(bym bymVar, oqc oqcVar, axr axrVar, afec afecVar, bym bymVar2, int i) {
        this.f = i;
        this.d = bymVar;
        this.e = oqcVar;
        this.c = axrVar;
        this.a = afecVar;
        this.b = bymVar2;
    }

    public /* synthetic */ nze(RailStatusBarFragment railStatusBarFragment, ImageView imageView, MaterialCardView materialCardView, FrameLayout frameLayout, ConstraintLayout constraintLayout, int i) {
        this.f = i;
        this.e = railStatusBarFragment;
        this.d = imageView;
        this.a = materialCardView;
        this.c = frameLayout;
        this.b = constraintLayout;
    }

    public /* synthetic */ nze(RailStatusBarFragment railStatusBarFragment, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, int i) {
        this.f = i;
        this.a = railStatusBarFragment;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = imageView2;
        this.e = constraintLayout2;
    }

    public /* synthetic */ nze(List list, Set set, kwp kwpVar, afec afecVar, afec afecVar2, int i) {
        this.f = i;
        this.d = list;
        this.b = set;
        this.c = kwpVar;
        this.e = afecVar;
        this.a = afecVar2;
    }

    public /* synthetic */ nze(kwp kwpVar, bym bymVar, bym bymVar2, bym bymVar3, bym bymVar4, int i) {
        this.f = i;
        this.a = kwpVar;
        this.c = bymVar;
        this.d = bymVar2;
        this.b = bymVar3;
        this.e = bymVar4;
    }
}
