package com.google.android.apps.auto.components.ui.media;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.metadataview.MetadataView;
import com.google.android.apps.auto.components.nocontentview.NoContentView;
import com.google.android.apps.auto.components.ui.actionpanel.ExpandingActionPanel;
import com.google.android.apps.auto.components.ui.image.CrossfadeImageView;
import com.google.android.apps.auto.components.ui.media.MediaPlaybackView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.projection.gearhead.R;
import defpackage.abzy;
import defpackage.abzz;
import defpackage.acrz;
import defpackage.acsx;
import defpackage.ajmd;
import defpackage.dvd;
import defpackage.dvw;
import defpackage.ebf;
import defpackage.emp;
import defpackage.h;
import defpackage.hx;
import defpackage.jzv;
import defpackage.krj;
import defpackage.leh;
import defpackage.ljv;
import defpackage.lmd;
import defpackage.lyy;
import defpackage.mki;
import defpackage.nmp;
import defpackage.nrd;
import defpackage.oez;
import defpackage.ohu;
import defpackage.oin;
import defpackage.oit;
import defpackage.oll;
import defpackage.olm;
import defpackage.omn;
import defpackage.omo;
import defpackage.omp;
import defpackage.omq;
import defpackage.omr;
import defpackage.oms;
import defpackage.omt;
import defpackage.omu;
import defpackage.omx;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.woy;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class MediaPlaybackView extends FrameLayout implements lyy {
    public static final yph a = yph.c("GH.MediaPlaybackView");
    public static final Duration b = Duration.ofMillis(750);
    private omx A;
    private Uri B;
    private long C;
    private dvw D;
    private final Runnable E;
    private final View.OnClickListener F;
    public final boolean c;
    public ljv d;
    public omu e;
    public NoContentView f;
    public MetadataView g;
    View h;
    ImageButton i;
    public ImageButton j;
    public PlayPauseStopCoolwalkButton k;
    SeekableLinearProgressIndicator l;
    public Instant m;
    public ImageButton n;
    public ExpandingActionPanel o;
    CrossfadeImageView p;
    ImageButton[] q;
    public ComponentName r;
    final ajmd s;
    private final boolean t;
    private lmd u;
    private boolean v;
    private boolean w;
    private boolean x;
    private AnimatorSet y;
    private Context z;

    public MediaPlaybackView(Context context) {
        super(context);
        leh.a();
        this.c = true;
        this.t = acsx.N();
        this.w = false;
        this.x = false;
        this.C = -1L;
        this.E = new oez(this, 3, null);
        this.F = new nmp(this, 20);
        this.s = new ajmd(this, null);
        olm.a();
        new oll(context, new jzv(this, 8));
    }

    private final String j() {
        AaPlaybackState aaPlaybackStateC;
        ljv ljvVar = this.d;
        if (ljvVar == null || (aaPlaybackStateC = ljvVar.c()) == null) {
            return null;
        }
        return omu.d(omu.a(aaPlaybackStateC));
    }

    private final void k() {
        this.p.b(getResources().getColor(R.color.boardwalk_black), true);
    }

    private final void l() {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.q));
        arrayList.add(0, this.i);
        int i = 0;
        while (i < arrayList.size()) {
            if (((ImageButton) arrayList.get(i)).getVisibility() == 4) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        this.o.d(this.j);
        this.o.e(this.n);
        this.o.a(arrayList, this.i.getVisibility() == 4);
    }

    private final boolean n(int i) {
        if (!this.c) {
            this.x = nrd.a().d();
            this.w = nrd.a().f();
        }
        boolean z = false;
        if (i == 0 && this.o.getVisibility() == 0 && (this.x || this.w)) {
            z = true;
        }
        if (z) {
            post(new oez(this, 2));
        }
        return z;
    }

    public final rrc a(yzy yzyVar) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzyVar);
        ComponentName componentName = this.r;
        if (componentName != null) {
            rrbVarH.p(componentName);
        }
        return (rrc) rrbVarH.l();
    }

    public final void b(int i) {
        abzy abzyVar = new abzy(i);
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        animatorSet2.setDuration(500L);
        if (this.c) {
            boolean zB = leh.a().b() ? olm.b(this.z) : true;
            abzz abzzVar = abzyVar.a;
            int i2 = true != zB ? 40 : 85;
            int i3 = true != zB ? 95 : 20;
            int iA = abzzVar.a(i2);
            int iA2 = abzzVar.a(i3);
            new oms(this.z).setValue(this.k, iA2);
            this.y.playTogether(ObjectAnimator.ofObject(this.k, omp.a, omo.a, new omn(iA, iA)), ObjectAnimator.ofArgb(((CoolwalkButton) this.k).b, omr.a, iA), ObjectAnimator.ofArgb(((CoolwalkButton) this.k).b, omt.a, iA2));
        } else {
            oms omsVar = new oms(this.z);
            PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton = this.k;
            abzz abzzVar2 = abzyVar.a;
            omsVar.setValue(playPauseStopCoolwalkButton, abzzVar2.a(10));
            this.y.playTogether(ObjectAnimator.ofObject(this.k, omp.a, omo.a, new omn(abzzVar2.a(90), abzzVar2.a(70))), ObjectAnimator.ofArgb(((CoolwalkButton) this.k).b, omr.a, abzzVar2.a(90)));
        }
        this.y.start();
    }

    public final void c(boolean z) {
        this.v = z;
        lmd lmdVar = this.u;
        if (lmdVar != null) {
            g(lmdVar);
            if (z) {
                ebf.j().F(a(yzy.gP));
            }
        }
    }

    public final void d(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.g.f(i, i2);
        MetadataView metadataView = this.g;
        metadataView.h(metadataView.b, i);
        metadataView.h(metadataView.d, i);
        setBackgroundColor(i3);
        ExpandingActionPanel expandingActionPanel = this.o;
        expandingActionPanel.m.setImageTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_activated}, new int[0]}, new int[]{i5, i6}));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.mutate();
        gradientDrawable.setColors(new int[]{dvd.e(i3, 77), dvd.e(i3, 217), i3});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setGradientCenter(0.5f, 0.35f);
        expandingActionPanel.l.setBackground(gradientDrawable);
        this.i.setColorFilter(i6);
        this.j.setColorFilter(i6);
        this.n.setColorFilter(i6);
        ImageButton[] imageButtonArr = this.q;
        int length = imageButtonArr.length;
        for (int i8 = 0; i8 < 5; i8++) {
            imageButtonArr[i8].setColorFilter(i6);
        }
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) this.l.findViewById(R.id.progress_indicator);
        if (acsx.N()) {
            linearProgressIndicator.f(dvd.e(i4, 61));
            this.h.setBackgroundColor(dvd.e(i7, 204));
        } else {
            linearProgressIndicator.f(i5);
        }
        linearProgressIndicator.j(i4);
        ((ImageView) this.l.findViewById(R.id.indicator_thumb)).setColorFilter(i4);
        l();
    }

    public final void e() {
        String strJ = j();
        if (TextUtils.isEmpty(strJ) || this.v) {
            return;
        }
        this.g.d(strJ);
    }

    @Override // defpackage.lyy
    public final void f() {
        if (this.t) {
            k();
        }
        b(this.d.a().h);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.lmd r12) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.ui.media.MediaPlaybackView.g(lmd):void");
    }

    @Override // defpackage.lyy
    public final void h(final Bitmap bitmap) {
        this.p.a(false);
        if (this.C != -1) {
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fC);
            oit.a();
            rrbVarH.u(SystemClock.elapsedRealtime() - this.C);
            ComponentName componentName = this.r;
            if (componentName != null) {
                rrbVarH.p(componentName);
            }
            ebf.j().F(rrbVarH.l());
            this.C = -1L;
        }
        dvw dvwVar = this.D;
        if (dvwVar != null) {
            dvwVar.a();
        }
        final dvw dvwVar2 = new dvw();
        mki.a.d.execute(new Runnable() { // from class: omv
            @Override // java.lang.Runnable
            public final void run() {
                int iIntValue;
                boolean z;
                wer.b();
                MediaPlaybackView mediaPlaybackView = this.a;
                boolean z2 = mediaPlaybackView.c;
                Bitmap bitmap2 = bitmap;
                if (z2 && acsx.u()) {
                    iIntValue = ((gjn) mki.a.i(gjn.class)).a(bitmap2);
                } else {
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        wer.b();
                    }
                    leh.a();
                    Bitmap bitmapB = omu.b(bitmap2);
                    int width = bitmapB.getWidth();
                    int height = bitmapB.getHeight();
                    int[] iArr = new int[width * height];
                    bitmapB.getPixels(iArr, 0, width, 0, 0, width, height);
                    Map mapI = abzi.i(iArr);
                    ArrayList arrayList = new ArrayList();
                    int[] iArr2 = new int[360];
                    double dIntValue = 0.0d;
                    for (Map.Entry entry : mapI.entrySet()) {
                        abzv abzvVar = new abzv(((Integer) entry.getKey()).intValue());
                        arrayList.add(abzvVar);
                        int iFloor = (int) Math.floor(abzvVar.a);
                        iArr2[iFloor] = iArr2[iFloor] + ((Integer) entry.getValue()).intValue();
                        dIntValue += ((Integer) entry.getValue()).intValue();
                    }
                    double[] dArr = new double[360];
                    for (int i = 0; i < 360; i++) {
                        double d = iArr2[i] / dIntValue;
                        for (int i2 = i - 14; i2 < i + 16; i2++) {
                            int iDM = woy.dM(i2);
                            dArr[iDM] = dArr[iDM] + d;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        abzv abzvVar2 = (abzv) arrayList.get(i3);
                        double d2 = dArr[woy.dM((int) Math.round(abzvVar2.a))];
                        double d3 = abzvVar2.b;
                        if (d3 >= 5.0d && d2 > 0.01d) {
                            arrayList2.add(new acae(abzvVar2, (d2 * 100.0d * 0.7d) + ((d3 - 48.0d) * (d3 < 48.0d ? 0.1d : 0.3d))));
                        }
                    }
                    Collections.sort(arrayList2, new acad(0));
                    ArrayList arrayList3 = new ArrayList();
                    for (int i4 = 90; i4 >= 15; i4--) {
                        arrayList3.clear();
                        int size2 = arrayList2.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj = ((acae) arrayList2.get(i5)).b;
                            int size3 = arrayList3.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size3) {
                                    arrayList3.add(obj);
                                    break;
                                }
                                abzv abzvVar3 = (abzv) arrayList3.get(i6);
                                i6++;
                                if (180.0d - Math.abs(Math.abs(((abzv) obj).a - abzvVar3.a) - 180.0d) < i4) {
                                    break;
                                }
                            }
                            i5++;
                            if (arrayList3.size() > 0) {
                                break;
                            }
                        }
                        if (arrayList3.size() > 0) {
                            break;
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    if (arrayList3.isEmpty()) {
                        arrayList4.add(-1);
                    }
                    int size4 = arrayList3.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        arrayList4.add(Integer.valueOf(((abzv) arrayList3.get(i7)).c));
                    }
                    iIntValue = ((Integer) arrayList4.get(0)).intValue();
                    ((ype) MediaPlaybackView.a.l().ai((char) 6023)).w("Using UiHelper extracted color %s", iIntValue);
                }
                dvw dvwVar3 = dvwVar2;
                synchronized (dvwVar3) {
                    z = dvwVar3.a;
                }
                if (z) {
                    return;
                }
                mediaPlaybackView.post(new hhx(mediaPlaybackView, iIntValue, 14));
            }
        });
        this.D = dvwVar2;
    }

    public final void i(AaPlaybackState aaPlaybackState) {
        float dimensionPixelSize;
        ljv ljvVar;
        View.OnClickListener onClickListener;
        String str;
        String str2;
        String str3;
        String str4;
        ljv ljvVar2;
        String str5;
        boolean z;
        int iQ = aaPlaybackState.Q();
        Runnable runnable = this.E;
        if (iQ == 3) {
            post(runnable);
        } else {
            removeCallbacks(runnable);
        }
        e();
        int iQ2 = aaPlaybackState.Q();
        PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton = this.k;
        playPauseStopCoolwalkButton.c = iQ2;
        if (iQ2 == 3 || iQ2 == 6) {
            playPauseStopCoolwalkButton.d = (aaPlaybackState.R() & 2) != 0 ? 1 : 2;
            dimensionPixelSize = this.k.getResources().getDimensionPixelSize(R.dimen.play_button_rounded_corners);
        } else {
            playPauseStopCoolwalkButton.d = 1;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.play_button_width_height) / 2.0f;
        }
        PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton2 = this.k;
        omq omqVar = omq.a;
        oin oinVar = new oin(9);
        playPauseStopCoolwalkButton2.getClass();
        Object tag = playPauseStopCoolwalkButton2.getTag(R.id.spring_animation);
        emp empVar = tag instanceof emp ? (emp) tag : null;
        if (empVar == null) {
            empVar = new emp(playPauseStopCoolwalkButton2, omqVar, dimensionPixelSize);
            playPauseStopCoolwalkButton2.setTag(R.id.spring_animation, empVar);
        }
        oinVar.invoke(empVar.s);
        empVar.k(dimensionPixelSize);
        this.k.refreshDrawableState();
        omx omxVar = this.A;
        omxVar.b = this.d;
        int iQ3 = aaPlaybackState.Q();
        if (iQ3 != 6) {
            Handler handler = omxVar.d;
            Runnable runnable2 = omxVar.f;
            handler.removeCallbacks(runnable2);
            omxVar.c = false;
            ajmd ajmdVar = omxVar.g;
            ajmdVar.j(false);
            ajmdVar.k(omu.a(aaPlaybackState), 2);
            if (iQ3 == 3) {
                handler.post(omxVar.e);
            } else {
                handler.removeCallbacks(omxVar.e);
                handler.removeCallbacks(runnable2);
                omxVar.c = false;
            }
        } else if (!omxVar.c) {
            omxVar.d.postDelayed(omxVar.f, 1000L);
            omxVar.c = true;
        }
        lmd lmdVarB = this.d.b();
        if (lmdVarB != null) {
            this.l.setEnabled((aaPlaybackState.R() & 256) != 0 && lmdVarB.O("android.media.metadata.DURATION") >= 0);
        }
        omu omuVar = this.e;
        ljv ljvVar3 = this.d;
        ImageButton imageButton = this.i;
        ImageButton imageButton2 = this.j;
        ImageButton imageButton3 = this.n;
        ImageButton[] imageButtonArr = this.q;
        View.OnClickListener onClickListener2 = this.F;
        long jR = aaPlaybackState.R();
        ArrayList arrayList = new ArrayList(aaPlaybackState.V());
        if (imageButton2 != null) {
            boolean zL = omu.l(ljvVar3, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS");
            if ((jR & 16) != 0) {
                str5 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS";
                z = true;
            } else {
                str5 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS";
                z = false;
            }
            str = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS";
            onClickListener = onClickListener2;
            str2 = str5;
            omuVar.m(imageButton2, R.drawable.gs_skip_previous_vd_theme_48, zL, z, arrayList, ljvVar3, onClickListener);
            ljvVar = ljvVar3;
        } else {
            ljvVar = ljvVar3;
            onClickListener = onClickListener2;
            str = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS";
            str2 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS";
        }
        if (imageButton3 != null) {
            str3 = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT";
            ljv ljvVar4 = ljvVar;
            str4 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT";
            omuVar.m(imageButton3, R.drawable.gs_skip_next_vd_theme_48, omu.l(ljvVar, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"), (jR & 32) != 0, arrayList, ljvVar4, onClickListener);
            ljvVar = ljvVar4;
        } else {
            str3 = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT";
            str4 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT";
        }
        if (imageButton != null) {
            boolean zL2 = omu.l(ljvVar, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE");
            leh.a();
            ljvVar2 = ljvVar;
            omuVar.m(imageButton, R.drawable.gs_queue_music_vd_theme_48, zL2, false, arrayList, ljvVar2, onClickListener);
        } else {
            ljvVar2 = ljvVar;
        }
        if (imageButtonArr != null) {
            for (int i = 0; i < 5; i++) {
                omuVar.m(imageButtonArr[i], 0, false, false, arrayList, ljvVar2, onClickListener);
            }
        }
        l();
        if (omu.l(this.d, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE")) {
            ohu.a().b(a(yzy.fJ));
        }
        if (omu.l(this.d, str2, str)) {
            ohu.a().b(a(yzy.fK));
        }
        if (omu.l(this.d, str4, str3)) {
            ohu.a().b(a(yzy.fL));
        }
    }

    @Override // defpackage.lyy
    public final void m() {
        if (this.t) {
            k();
        }
        b(this.d.a().h);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.o.dispatchApplyWindowInsets(windowInsets);
        this.f.dispatchApplyWindowInsets(windowInsets);
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    public final void onFinishInflate() throws Resources.NotFoundException {
        byte[] bArr;
        super.onFinishInflate();
        this.z = getContext();
        this.f = (NoContentView) findViewById(R.id.no_content_view);
        this.e = new omu();
        findViewById(R.id.playback_content_container);
        ExpandingActionPanel expandingActionPanel = (ExpandingActionPanel) findViewById(R.id.expanding_action_panel);
        this.o = expandingActionPanel;
        expandingActionPanel.setVisibility(0);
        this.o.e = yzz.MEDIA_FACET;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.un_ar_icon_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        this.q = new ImageButton[5];
        int i = 0;
        while (true) {
            ImageButton[] imageButtonArr = this.q;
            int length = imageButtonArr.length;
            bArr = null;
            if (i >= 5) {
                break;
            }
            imageButtonArr[i] = new ImageButton(this.z, null, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel);
            this.q[i].setLayoutParams(layoutParams);
            i++;
        }
        ImageButton imageButton = new ImageButton(this.z, null, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel);
        this.n = imageButton;
        imageButton.setLayoutParams(layoutParams);
        ImageButton imageButton2 = new ImageButton(this.z, null, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel);
        this.j = imageButton2;
        imageButton2.setLayoutParams(layoutParams);
        ImageButton imageButton3 = new ImageButton(this.z, null, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel);
        this.i = imageButton3;
        imageButton3.setLayoutParams(layoutParams);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.z);
        leh.a();
        MetadataView metadataView = (MetadataView) layoutInflaterFrom.inflate(R.layout.material_media_metadata_view, (ViewGroup) null);
        this.g = metadataView;
        metadataView.f = this;
        metadataView.i(3);
        this.o.f(this.g);
        if (acrz.s()) {
        }
        CrossfadeImageView crossfadeImageView = (CrossfadeImageView) findViewById(R.id.album_art);
        this.p = crossfadeImageView;
        if (crossfadeImageView != null) {
            boolean z = this.t;
            crossfadeImageView.setVisibility(true != z ? 8 : 0);
            if (z) {
                k();
            }
        }
        View viewFindViewById = findViewById(R.id.playback_scrim);
        this.h = viewFindViewById;
        boolean z2 = this.c;
        if (z2) {
            this.x = nrd.a().d();
            this.w = nrd.a().f();
            if (!this.t) {
                this.h.setVisibility(8);
                View viewFindViewById2 = findViewById(R.id.playback_background_gradient);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setVisibility(8);
                }
            }
        } else {
            viewFindViewById.setBackgroundColor(getResources().getColor(R.color.playback_scrim_coolwalk));
        }
        SeekableLinearProgressIndicator seekableLinearProgressIndicator = (SeekableLinearProgressIndicator) LayoutInflater.from(this.z).inflate(z2 ? R.layout.material_seekable_linear_progress_indicator : R.layout.seekable_linear_progress_indicator, (ViewGroup) null);
        this.l = seekableLinearProgressIndicator;
        seekableLinearProgressIndicator.h = this.s;
        this.A = new omx(this.l.g);
        this.l.d.setOnFocusChangeListener(new krj((Object) this, 5));
        this.z.getResources().getDimension(R.dimen.seek_bar_top_padding);
        leh.a();
        if (z2) {
            MetadataView metadataView2 = this.g;
            SeekableLinearProgressIndicator seekableLinearProgressIndicator2 = this.l;
            LinearLayout linearLayout = metadataView2.e;
            if (linearLayout == null) {
                ((ype) ((ype) MetadataView.a.h()).ai((char) 4464)).u("No media seekbar present in layout");
            } else {
                linearLayout.removeAllViews();
                metadataView2.e.setVisibility(8);
                if (seekableLinearProgressIndicator2 != null) {
                    metadataView2.e.addView(seekableLinearProgressIndicator2);
                    metadataView2.e.setVisibility(0);
                }
            }
        } else {
            ExpandingActionPanel expandingActionPanel2 = this.o;
            SeekableLinearProgressIndicator seekableLinearProgressIndicator3 = this.l;
            RelativeLayout relativeLayout = expandingActionPanel2.g;
            if (relativeLayout == null) {
                ((ype) ((ype) ExpandingActionPanel.a.h()).ai((char) 6002)).u("No abovePanelHolder present in layout");
            } else {
                relativeLayout.removeAllViews();
                if (seekableLinearProgressIndicator3 != null) {
                    expandingActionPanel2.g.addView(seekableLinearProgressIndicator3);
                }
            }
            ExpandingActionPanel expandingActionPanel3 = this.o;
            int dimension = (int) this.z.getResources().getDimension(R.dimen.seek_bar_height);
            woy.Z(expandingActionPanel3.g.getChildAt(0) != null);
            h hVar = new h();
            hVar.e(expandingActionPanel3.j);
            hVar.d(R.id.metadata_holder, 4);
            hVar.g(R.id.metadata_holder, 4, R.id.metadata_inset);
            hVar.a(R.id.metadata_holder).D = dimension;
            hVar.d(R.id.action_panel_above_panel_holder, 3);
            hVar.g(R.id.action_panel_above_panel_holder, 4, R.id.above_panel_holder_bottom_guideline);
            hVar.b(expandingActionPanel3.j);
            expandingActionPanel3.g.getChildAt(0).getViewTreeObserver().addOnGlobalLayoutListener(new hx(expandingActionPanel3, 6, bArr));
        }
        PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton = (PlayPauseStopCoolwalkButton) LayoutInflater.from(this.z).inflate(z2 ? R.layout.play_pause_stop_button_material_layout : R.layout.play_pause_stop_button_coolwalk_layout, (ViewGroup) null);
        this.k = playPauseStopCoolwalkButton;
        View.OnClickListener onClickListener = this.F;
        playPauseStopCoolwalkButton.setOnClickListener(onClickListener);
        this.k.setDuplicateParentStateEnabled(true);
        this.o.c(this.k);
        this.o.i.setBackgroundResource(0);
        this.j.setOnClickListener(onClickListener);
        this.n.setOnClickListener(onClickListener);
        this.i.setOnClickListener(onClickListener);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return n(getVisibility()) || super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (getVisibility() != i) {
            n(i);
        }
        super.setVisibility(i);
    }

    public MediaPlaybackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        leh.a();
        this.c = true;
        this.t = acsx.N();
        this.w = false;
        this.x = false;
        this.C = -1L;
        this.E = new oez(this, 3, null);
        this.F = new nmp(this, 20);
        this.s = new ajmd(this, null);
        olm.a();
        new oll(context, new jzv(this, 8));
    }

    public MediaPlaybackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        leh.a();
        this.c = true;
        this.t = acsx.N();
        this.w = false;
        this.x = false;
        this.C = -1L;
        this.E = new oez(this, 3, null);
        this.F = new nmp(this, 20);
        this.s = new ajmd(this, null);
        olm.a();
        new oll(context, new jzv(this, 8));
    }

    public MediaPlaybackView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        leh.a();
        this.c = true;
        this.t = acsx.N();
        this.w = false;
        this.x = false;
        this.C = -1L;
        this.E = new oez(this, 3, null);
        this.F = new nmp(this, 20);
        this.s = new ajmd(this, null);
        olm.a();
        new oll(context, new jzv(this, 8));
    }
}
