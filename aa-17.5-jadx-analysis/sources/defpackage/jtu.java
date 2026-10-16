package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.auto.sdk.ui.AutoTunedRecyclerView;
import com.google.android.projection.gearhead.R;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class jtu {
    public static final void a(fxq fxqVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cjv cjvVar;
        cjv cjvVar2;
        long jC;
        bux buxVarC = buxVar.c(1093892726);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fxqVar) : buxVarC.E(fxqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gfk gfkVar = fxqVar.a;
            cmw cmwVarA = gfkVar.a(jtk.e((fwf) buxVarC.f(fwg.a)), buxVarC, 64);
            boolean z = fxqVar.d;
            if (cmwVarA == null) {
                bxf bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bxfVarJ.c = new jtt(fxqVar, cfyVar, i, i4);
                    return;
                }
                return;
            }
            if (z) {
                buxVarC.v(-2053147144);
                if (fxqVar.h) {
                    buxVarC.v(-2053073705);
                    fwe fweVar = fxqVar.e;
                    fwd fwdVar = fweVar != null ? fweVar.b : null;
                    if (fwdVar == null) {
                        buxVarC.v(-2053024447);
                        ((bvv) buxVarC).Y(false);
                        cjvVar2 = null;
                    } else {
                        buxVarC.v(-2053024446);
                        long jQ = fww.q(new hjw(cjn.i(fwdVar.b), cjn.i(fwdVar.a)).b(buxVarC), 0L, 0, buxVarC, 14);
                        ((bvv) buxVarC).Y(false);
                        cjvVar2 = new cjv(jQ);
                    }
                    if (cjvVar2 == null) {
                        buxVarC.v(-1036049155);
                        jC = gux.c(buxVarC).C();
                        ((bvv) buxVarC).Y(false);
                    } else {
                        buxVarC.v(-1036059509);
                        ((bvv) buxVarC).Y(false);
                        jC = cjvVar2.a;
                    }
                    ((bvv) buxVarC).Y(false);
                    cjvVar = new cjv(jC);
                } else {
                    buxVarC.v(-2052731434);
                    ((bvv) buxVarC).Y(false);
                    cjvVar = null;
                }
                fxa.f(new gab(gfkVar, null, null), gut.e(cfyVar, fxqVar), cjvVar, buxVarC, 8);
                ((bvv) buxVarC).Y(false);
                bxf bxfVarJ2 = buxVarC.J();
                if (bxfVarJ2 != null) {
                    bxfVarJ2.c = new jtt(fxqVar, cfyVar, i, i3);
                    return;
                }
                return;
            }
            buxVarC.v(-2052482132);
            ((bvv) buxVarC).Y(false);
            gfa gfaVar = fxqVar.i;
            aezr aezrVar = ktf.a;
            jtk.d(gfaVar, gfkVar, kgq.g(0L, 0L, 0L, 0L, buxVarC, 255), fxqVar.e, fxqVar.f, false, bxc.i(-16017686, true, new fun(fxqVar, cfyVar, 13), buxVarC), buxVarC, 1572928, 32);
            buxVarC = buxVarC;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ3 = buxVarC.J();
        if (bxfVarJ3 != null) {
            bxfVarJ3.c = new jtt(fxqVar, cfyVar, i, 3);
        }
    }

    public static final krt b(hit hitVar) {
        hitVar.getClass();
        wnj wnjVar = hitVar.e;
        wnj wnjVar2 = hitVar.d;
        wnj wnjVar3 = hitVar.c;
        return new krt(f(hitVar.a), f(hitVar.b), f(wnjVar3), f(wnjVar2), f(wnjVar));
    }

    public static int c(View view, View view2) {
        return g(view)[1] > g(view2)[1] ? 33 : 130;
    }

    public static final void d(AutoTunedRecyclerView autoTunedRecyclerView, Context context) {
        autoTunedRecyclerView.getClass();
        context.getClass();
        int i = owx.a;
        autoTunedRecyclerView.setPadding(context.getResources().getDimensionPixelSize(R.dimen.tuned_left_right_padding_partial_screen), 0, context.getResources().getDimensionPixelSize(R.dimen.tuned_left_right_padding_partial_screen), 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) autoTunedRecyclerView.getLayoutParams();
        layoutParams.getClass();
        layoutParams.leftMargin = context.getResources().getDimensionPixelSize(R.dimen.tuned_left_right_margin_partial_screen);
        layoutParams.rightMargin = context.getResources().getDimensionPixelSize(R.dimen.tuned_left_right_margin_partial_screen);
        autoTunedRecyclerView.setLayoutParams(layoutParams);
    }

    public static final void e(AutoTunedRecyclerView autoTunedRecyclerView, Context context, boolean z, boolean z2) {
        autoTunedRecyclerView.getClass();
        context.getClass();
        ViewGroup.LayoutParams layoutParams = autoTunedRecyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(0);
        layoutParams2.setMarginEnd(h(context, R.dimen.template_recycler_view_default_margin));
        autoTunedRecyclerView.setLayoutParams(layoutParams2);
        if (z) {
            leh.a.a();
            autoTunedRecyclerView.setPadding(0, autoTunedRecyclerView.getPaddingTop(), h(context, R.dimen.template_recycler_view_full_padding), autoTunedRecyclerView.getPaddingBottom());
        } else {
            autoTunedRecyclerView.setPadding(h(context, R.dimen.tuned_paginated_buttons_left_margin), autoTunedRecyclerView.getPaddingTop(), h(context, R.dimen.tuned_right_padding_with_scrollbar), autoTunedRecyclerView.getPaddingBottom());
        }
        if (z2) {
            leh.a.a();
            autoTunedRecyclerView.setPadding(autoTunedRecyclerView.getPaddingLeft(), autoTunedRecyclerView.getPaddingTop(), h(context, R.dimen.template_recycler_view_full_padding_floating_actions_material), autoTunedRecyclerView.getPaddingBottom());
        }
    }

    private static final abzz f(wnj wnjVar) {
        HashMap map = new HashMap();
        double d = wnjVar.b;
        double d2 = wnjVar.c;
        woy.dN(d, d2, map);
        return new abzz(d, d2);
    }

    private static int[] g(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    private static final int h(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }
}
