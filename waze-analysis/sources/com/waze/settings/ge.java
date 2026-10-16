package com.waze.settings;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ge implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f37299a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f37300b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f37301c;

    ge(View view, gr grVar, int i2) {
        this.f37301c = i2;
        this.f37299a = view;
        this.f37300b = grVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f37301c;
        if (i2 == 0) {
            bs bsVar = (bs) obj;
            WazeSettingsView wazeSettingsView = (WazeSettingsView) this.f37299a;
            hg hgVarE = bsVar.e();
            if (h.g.b.x.n(hgVarE, hf.f37396a)) {
                wazeSettingsView.G();
            } else {
                if (!(hgVarE instanceof he)) {
                    throw new h.i();
                }
                wazeSettingsView.m();
                String strH = ((he) bsVar.e()).h();
                wazeSettingsView.P((strH == null || strH.length() == 0) ? ((gr) this.f37300b).f37336i.c(R.string.TAP_TO_ADD, new Object[0]) : ((he) bsVar.e()).h());
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            bs bsVar2 = (bs) obj;
            hg hgVarE2 = bsVar2.e();
            if (!(hgVarE2 instanceof hf)) {
                if (!(hgVarE2 instanceof he)) {
                    throw new h.i();
                }
                com.waze.sharedui.views.ad adVar = (com.waze.sharedui.views.ad) this.f37300b;
                adVar.u(((he) bsVar2.e()).i());
                int iA = ((he) bsVar2.e()).a();
                if (iA == -1) {
                    adVar.t(com.waze.sharedui.views.ac.FOCUS);
                    ((ds) this.f37299a).R(false);
                } else if (iA != 0) {
                    adVar.t(com.waze.sharedui.views.ac.ERROR);
                } else {
                    adVar.t(com.waze.sharedui.views.ac.FOCUS);
                    ((ds) this.f37299a).R(true);
                }
            }
            return h.ab.f48028a;
        }
        bs bsVar3 = (bs) obj;
        String strI = bsVar3.i();
        if (strI == null || strI.length() == 0) {
            WazeSettingsView wazeSettingsView2 = (WazeSettingsView) this.f37300b;
            wazeSettingsView2.P(((gr) this.f37299a).f37336i.c(R.string.TAP_TO_ADD, new Object[0]));
            wazeSettingsView2.setEnabled(true);
        } else if (bsVar3.z()) {
            if (bsVar3.h() != null) {
                ((WazeSettingsView) this.f37300b).K(bsVar3.h().intValue());
            }
            WazeSettingsView wazeSettingsView3 = (WazeSettingsView) this.f37300b;
            wazeSettingsView3.P(bsVar3.i());
            wazeSettingsView3.setEnabled(true);
            gr.C((gr) this.f37299a, wazeSettingsView3);
        } else {
            WazeSettingsView wazeSettingsView4 = (WazeSettingsView) this.f37300b;
            wazeSettingsView4.setEnabled(true);
            wazeSettingsView4.P(((gr) this.f37299a).f37336i.c(R.string.EMAIL_SETTINGS_NOT_VERIFIED, new Object[0]));
            wazeSettingsView4.E(ContextCompat.getColor(wazeSettingsView4.getContext(), R.color.alarming_variant));
            ImageView imageView = new ImageView(wazeSettingsView4.getContext());
            imageView.setImageResource(R.drawable.error_icon);
            int dimension = (int) wazeSettingsView4.getResources().getDimension(R.dimen.settings_email_right_decor_margin);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
            marginLayoutParams.setMargins(dimension, dimension, dimension, dimension);
            imageView.setLayoutParams(marginLayoutParams);
            wazeSettingsView4.x(imageView);
        }
        return h.ab.f48028a;
    }

    ge(ConstraintLayout constraintLayout, Object obj, int i2) {
        this.f37301c = i2;
        this.f37300b = constraintLayout;
        this.f37299a = obj;
    }
}
