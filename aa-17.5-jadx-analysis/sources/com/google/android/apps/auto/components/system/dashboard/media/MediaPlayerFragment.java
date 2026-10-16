package com.google.android.apps.auto.components.system.dashboard.media;

import android.animation.ObjectAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton;
import com.google.android.apps.auto.components.coolwalk.card.CoolwalkCardView;
import com.google.android.apps.auto.components.coolwalk.focusring.TappableRegion;
import com.google.android.apps.auto.components.system.dashboard.design.DashboardCardView;
import com.google.android.apps.auto.components.ui.media.PlayPauseStopCoolwalkButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.projection.gearhead.R;
import defpackage.abzy;
import defpackage.acrz;
import defpackage.aezr;
import defpackage.afec;
import defpackage.affn;
import defpackage.affq;
import defpackage.afft;
import defpackage.affv;
import defpackage.afgl;
import defpackage.afia;
import defpackage.eqj;
import defpackage.esa;
import defpackage.gln;
import defpackage.kwi;
import defpackage.lrr;
import defpackage.lyb;
import defpackage.mcd;
import defpackage.med;
import defpackage.mli;
import defpackage.mnd;
import defpackage.mqm;
import defpackage.mvg;
import defpackage.mvr;
import defpackage.mwc;
import defpackage.mzg;
import defpackage.mzi;
import defpackage.mzj;
import defpackage.mzm;
import defpackage.mzp;
import defpackage.mzq;
import defpackage.mzr;
import defpackage.obt;
import defpackage.omn;
import defpackage.omp;
import defpackage.omr;
import defpackage.oms;
import defpackage.tby;
import defpackage.woy;
import defpackage.yzy;
import java.io.PrintWriter;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006*"}, d2 = {"Lcom/google/android/apps/auto/components/system/dashboard/media/MediaPlayerFragment;", "Lcom/google/android/apps/auto/components/system/dashboard/design/AnimatedDashboardCardBase;", "Lcom/google/android/apps/auto/components/system/dashboard/design/DashboardFocusableCard;", "Lcom/google/android/apps/auto/components/status/StatusReporter;", "<init>", "()V", "parent", "Lcom/google/android/apps/auto/components/system/dashboard/media/MediaPlayerFragment$Holder;", "getParent", "()Lcom/google/android/apps/auto/components/system/dashboard/media/MediaPlayerFragment$Holder;", "parent$delegate", "Lkotlin/properties/ReadOnlyProperty;", "placeholderDrawable", "Landroid/graphics/drawable/Drawable;", "focusableId", "", "getFocusableId", "()I", "viewModel", "Lcom/google/android/apps/auto/components/system/dashboard/media/MediaPlayerFragmentViewModel;", "getViewModel", "()Lcom/google/android/apps/auto/components/system/dashboard/media/MediaPlayerFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onContentViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "update", "Landroid/widget/ImageView;", "imageInfo", "Lcom/android/car/libraries/apphost/external/graphics/ImageInfo;", "reportStatus", "pw", "Ljava/io/PrintWriter;", "piiHandling", "Lcom/google/android/apps/auto/components/status/StatusReporter$Pii;", "Holder", "java.com.google.android.apps.auto.components.system.dashboard.media_media"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public class MediaPlayerFragment extends mvr implements mnd {
    static final /* synthetic */ afia[] a = {new affn(MediaPlayerFragment.class, "parent", "getParent()Lcom/google/android/apps/auto/components/system/dashboard/media/MediaPlayerFragment$Holder;", 0)};
    public static final /* synthetic */ int b = 0;
    private final afgl e;
    private final aezr f;

    public MediaPlayerFragment() {
        super(R.layout.frag_dash_media);
        getLifecycle().c(new mzq(this, 1));
        this.e = new mzr(this, 1);
        new ColorDrawable(-16777216);
        this.f = woy.dG(new mzp(new mvg(this, 10), esa.a, this, 1));
    }

    public static final ObjectAnimator a(abzy abzyVar, MediaPlayerFragment mediaPlayerFragment, kwi kwiVar) {
        return ObjectAnimator.ofArgb(kwiVar, omr.a, abzyVar != null ? mcd.l(abzyVar) : mediaPlayerFragment.requireContext().getColor(R.color.gearhead_focus_blue));
    }

    public static final void d(eqj eqjVar, MediaPlayerFragment mediaPlayerFragment, afec afecVar) {
        eqjVar.fE(mediaPlayerFragment.getViewLifecycleOwner(), new med(afecVar, 8));
    }

    private static final void g(MaterialButton materialButton, MediaPlayerFragment mediaPlayerFragment, eqj eqjVar) {
        eqjVar.fE(mediaPlayerFragment.getViewLifecycleOwner(), new med(new mzg(materialButton, 6), 8));
    }

    public final mzi b() {
        return (mzi) this.e.getValue(this, a[0]);
    }

    public final mzm c() {
        return (mzm) this.f.a();
    }

    @Override // defpackage.tef
    public final void e(View view) {
        ProgressBar progressBar;
        TappableRegion tappableRegion;
        PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton;
        final CoolwalkCardView coolwalkCardView;
        int i;
        view.getClass();
        CoolwalkCardView coolwalkCardView2 = ((DashboardCardView) view.findViewById(R.id.dash_media_card)).a;
        View viewFindViewById = view.findViewById(R.id.album_art);
        viewFindViewById.getClass();
        final ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.source_badge);
        viewFindViewById2.getClass();
        final ImageView imageView2 = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        viewFindViewById3.getClass();
        View viewFindViewById4 = view.findViewById(R.id.subtitle);
        viewFindViewById4.getClass();
        View viewFindViewById5 = view.findViewById(R.id.action_left);
        viewFindViewById5.getClass();
        final CoolwalkButton coolwalkButton = (CoolwalkButton) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.action_right);
        viewFindViewById6.getClass();
        final CoolwalkButton coolwalkButton2 = (CoolwalkButton) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.play_pause);
        viewFindViewById7.getClass();
        PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton2 = (PlayPauseStopCoolwalkButton) viewFindViewById7;
        playPauseStopCoolwalkButton2.setFocusedByDefault(true);
        View viewFindViewById8 = view.findViewById(R.id.progress);
        viewFindViewById8.getClass();
        ProgressBar progressBar2 = (ProgressBar) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.primary_target);
        viewFindViewById9.getClass();
        final TappableRegion tappableRegion2 = (TappableRegion) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.text_container_wrapper);
        viewFindViewById10.getClass();
        TappableRegion tappableRegion3 = (TappableRegion) viewFindViewById10;
        playPauseStopCoolwalkButton2.setOnClickListener(new mli(this, 13));
        d(c().o(), this, new mqm(playPauseStopCoolwalkButton2, 19));
        d(tby.t(c().l()), this, new mqm(playPauseStopCoolwalkButton2, 20));
        d(c().s(), this, new mzg(progressBar2, 1));
        d(c().h(), this, new lyb(progressBar2, this, 12, null));
        d(c().m(), this, new mzg(progressBar2, 0));
        d(c().r(), this, new mzg((TextView) viewFindViewById3, 2));
        d(c().p(), this, new mzg((TextView) viewFindViewById4, 3));
        g(coolwalkButton, this, c().n());
        g(coolwalkButton2, this, c().q());
        d(c().d, this, new mzg(imageView2, 4));
        d(c().c, this, new mzg(imageView2, 5));
        d(c().b, this, new mzg(imageView2, 7));
        tappableRegion2.setOnClickListener(new mli(this, 14));
        tappableRegion3.setOnClickListener(new mli(this, 15));
        ColorStateList colorStateListE = coolwalkCardView2.e();
        colorStateListE.getClass();
        d(c().m, this, new lyb(coolwalkCardView2, colorStateListE, 13));
        if (!imageView.isLaidOut() || imageView.isLayoutRequested()) {
            imageView.addOnLayoutChangeListener(new obt((Object) this, 1));
        } else {
            c().v(imageView.getWidth(), imageView.getHeight());
        }
        affq affqVar = new affq();
        if (!playPauseStopCoolwalkButton2.isLaidOut() || playPauseStopCoolwalkButton2.isLayoutRequested()) {
            progressBar = progressBar2;
            tappableRegion = tappableRegion3;
            playPauseStopCoolwalkButton = playPauseStopCoolwalkButton2;
            coolwalkCardView = coolwalkCardView2;
            i = 0;
            playPauseStopCoolwalkButton.addOnLayoutChangeListener(new mzj(this, affqVar, playPauseStopCoolwalkButton, playPauseStopCoolwalkButton));
        } else {
            progressBar = progressBar2;
            coolwalkCardView = coolwalkCardView2;
            i = 0;
            tappableRegion = tappableRegion3;
            playPauseStopCoolwalkButton = playPauseStopCoolwalkButton2;
            d(c().g, this, new gln(playPauseStopCoolwalkButton, affqVar, playPauseStopCoolwalkButton2, 10, null));
            affqVar.a = true;
        }
        View viewFindViewById11 = view.findViewById(R.id.album_art_scrim);
        viewFindViewById11.getClass();
        final ImageView imageView3 = (ImageView) viewFindViewById11;
        final afft afftVar = new afft();
        final afft afftVar2 = new afft();
        Drawable drawable = imageView3.getDrawable();
        drawable.getClass();
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate;
        int[] colors = gradientDrawable.getColors();
        colors.getClass();
        afftVar.a = (colors[i] >> 24) & 255;
        int[] colors2 = gradientDrawable.getColors();
        colors2.getClass();
        afftVar2.a = (colors2[1] >> 24) & 255;
        gradientDrawable.setColors(new int[]{i, i});
        imageView3.setVisibility(i);
        ProgressBar progressBar3 = progressBar;
        final affv affvVar = new affv();
        final affq affqVar2 = new affq();
        final affv affvVar2 = new affv();
        Context context = playPauseStopCoolwalkButton.getContext();
        context.getClass();
        final oms omsVar = new oms(context);
        final omn omnVar = omp.a.get(playPauseStopCoolwalkButton);
        final int iIntValue = oms.b(playPauseStopCoolwalkButton).intValue();
        final PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton3 = playPauseStopCoolwalkButton;
        final TappableRegion tappableRegion4 = tappableRegion;
        d(c().n, this, new afec() { // from class: mzh
            /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x015b  */
            @Override // defpackage.afec
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r20) {
                /*
                    Method dump skipped, instructions count: 484
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mzh.invoke(java.lang.Object):java.lang.Object");
            }
        });
        if (acrz.s()) {
            d(c().i(), this, new mzg(progressBar3, 8));
        }
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println("MediaPlayerFragment");
        c().t(printWriter);
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        lrr.a().c(this);
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        lrr.a().b(this);
        mwc.a(yzy.Hk, (ComponentName) c().j().e());
    }
}
