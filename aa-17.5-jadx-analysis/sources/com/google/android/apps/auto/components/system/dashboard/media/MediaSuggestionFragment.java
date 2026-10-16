package com.google.android.apps.auto.components.system.dashboard.media;

import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewAnimator;
import com.google.android.projection.gearhead.R;
import defpackage.aezr;
import defpackage.afco;
import defpackage.airp;
import defpackage.ebf;
import defpackage.eqj;
import defpackage.esa;
import defpackage.hfr;
import defpackage.lyb;
import defpackage.med;
import defpackage.mvr;
import defpackage.mwc;
import defpackage.mzg;
import defpackage.nal;
import defpackage.nam;
import defpackage.nan;
import defpackage.nao;
import defpackage.nhx;
import defpackage.ooh;
import defpackage.tby;
import defpackage.woy;
import defpackage.yph;
import defpackage.yzy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/google/android/apps/auto/components/system/dashboard/media/MediaSuggestionFragment;", "Lcom/google/android/apps/auto/components/system/dashboard/design/AnimatedDashboardCardBase;", "Lcom/google/android/apps/auto/components/system/dashboard/design/DashboardFocusableCard;", "<init>", "()V", "viewModel", "Lcom/google/android/apps/auto/components/system/dashboard/media/MediaSuggestionFragmentViewModel;", "getViewModel", "()Lcom/google/android/apps/auto/components/system/dashboard/media/MediaSuggestionFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "focusableId", "", "getFocusableId", "()I", "onContentViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "update", "Landroid/widget/ImageView;", "imageInfo", "Lcom/android/car/libraries/apphost/external/graphics/ImageInfo;", "onResume", "MediaSuggestionRowViewHolder", "Companion", "java.com.google.android.apps.auto.components.system.dashboard.media_media"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public class MediaSuggestionFragment extends mvr {
    public static final yph a = yph.c("GH.MediaSuggFragment");
    private final aezr b;

    public MediaSuggestionFragment() {
        super(R.layout.frag_dash_media_suggestion);
        this.b = woy.dG(new hfr(esa.a, this, 11, null));
    }

    public static final int a(Context context, int i, int i2, ViewAnimator viewAnimator) {
        return viewAnimator.getHeight() / ((context.getResources().getDimensionPixelSize(R.dimen.dashboard_media_recommendation_default_album_art_size) + i) + i2);
    }

    public final nao b() {
        return (nao) this.b.a();
    }

    @Override // defpackage.tef
    public final void e(View view) throws Resources.NotFoundException {
        view.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.media_suggestions_header);
        View viewFindViewById = view.findViewById(R.id.media_suggestions_tappable_header);
        View viewFindViewById2 = view.findViewById(R.id.navigation_forward_icon);
        View viewFindViewById3 = view.findViewById(R.id.for_you_text);
        View viewFindViewById4 = view.findViewById(R.id.assistant_icon);
        ViewAnimator viewAnimator = (ViewAnimator) view.findViewById(R.id.media_suggestion_rows_container);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.media_suggestion_rows);
        viewGroup.getClass();
        airp airpVarB = ebf.b(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.media_suggestion_loading_rows);
        viewGroup2.getClass();
        airp airpVarB2 = ebf.b(viewGroup2);
        nan nanVar = new nan(viewFindViewById4, getResources().getDimension(R.dimen.dashboard_media_recommendation_assistant_attribution_margin), getResources().getDimension(R.dimen.dashboard_media_recommendation_assistant_attribution_logo_size), viewFindViewById3, viewFindViewById2);
        afco afcoVar = tby.a;
        eqj eqjVar = b().j;
        eqjVar.getClass();
        tby.j(eqjVar, new ooh(7)).fE(getViewLifecycleOwner(), new med(new lyb(constraintLayout, nanVar, 16, null), 12));
        b().c.fE(getViewLifecycleOwner(), new med(new lyb(viewFindViewById2, constraintLayout, 17), 12));
        b().b.fE(getViewLifecycleOwner(), new med(new nhx(viewFindViewById, this, view, 1), 12));
        Context context = viewGroup.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.gearhead_focus_ring_stroke_width_focused);
        int i = dimensionPixelSize + dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.dashboard_media_recommendation_album_art_margin_vertical_top) + context.getResources().getDimensionPixelSize(R.dimen.dashboard_media_recommendation_album_art_margin_vertical_bottom);
        b().a.fE(getViewLifecycleOwner(), new med(new nam(airpVarB, airpVarB2, this, view), 12));
        View viewFindViewById5 = view.findViewById(R.id.media_suggestion_1);
        if (viewFindViewById5 != null) {
            viewFindViewById5.setFocusedByDefault(true);
        }
        int i2 = dimensionPixelSize2 - i;
        b().g.fE(getViewLifecycleOwner(), new med(new mzg(viewAnimator, 19), 12));
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new nal(this, context, i, i2, viewAnimator));
        } else {
            b().a(a(context, i, i2, viewAnimator));
            b().f();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        mwc.a(yzy.Hl, null);
    }
}
