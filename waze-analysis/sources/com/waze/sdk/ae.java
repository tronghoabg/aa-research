package com.waze.sdk;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.lm;
import com.waze.navigate.eo;
import com.waze.sharedui.views.OvalButton;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae extends com.waze.view.popups.m implements ba, bc, az, ay {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35216a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f35217b;
    private final TextView A;
    private final RecyclerView B;
    private final RecyclerView C;
    private final ad D;
    private final ProgressBar E;
    private final TextView F;
    private final TextView G;
    private final TextView H;
    private final ImageView I;
    private boolean J;
    private boolean K;
    private int L;
    private int M;
    private String N;
    private String O;
    private final int P;
    private View Q;
    private boolean R;
    private String S;
    private Boolean T;
    private boolean U;
    private boolean V;
    private final GridLayoutManager W;
    private final GridLayoutManager aa;
    private final bm ab;
    private final com.waze.shared_infra.o.a ac;
    private final y ad;
    private final x ae;
    private final Comparator af;
    private int ag;
    private final com.waze.main_screen.ab.a.e ah;

    /* renamed from: c, reason: collision with root package name */
    private final eo f35218c;

    /* renamed from: e, reason: collision with root package name */
    private an f35219e;

    /* renamed from: f, reason: collision with root package name */
    private ah f35220f;

    /* renamed from: g, reason: collision with root package name */
    private final View f35221g;

    /* renamed from: h, reason: collision with root package name */
    private final View f35222h;

    /* renamed from: i, reason: collision with root package name */
    private final View f35223i;

    /* renamed from: j, reason: collision with root package name */
    private final View f35224j;

    /* renamed from: k, reason: collision with root package name */
    private final View f35225k;

    /* renamed from: l, reason: collision with root package name */
    private final View f35226l;
    private final View m;
    private final View n;
    private final OvalButton o;
    private final TextView p;
    private final OvalButton q;
    private final View r;
    private final View s;
    private final ImageView t;
    private final TextView u;
    private final View v;
    private final ImageView w;
    private final TextView x;
    private final ImageView y;
    private final ImageView z;

    static {
        HashMap map = new HashMap();
        for (w wVar : w.values()) {
            map.put(wVar.f35427j, wVar);
        }
        f35217b = DesugarCollections.unmodifiableMap(map);
    }

    public ae(Context context, com.waze.main_screen.ab.a.e eVar) {
        super(context);
        this.f35218c = (eo) com.waze.web.r.h(eo.class);
        ad adVar = new ad(this);
        this.D = adVar;
        this.J = false;
        this.P = com.waze.utils.o.e(com.waze.utils.f.NOTIFICATION);
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        this.ac = aVarA;
        this.ad = new y(this);
        this.ae = new x(this);
        this.af = new j(this);
        this.ag = 0;
        this.ah = eVar;
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.audio_control_panel, this);
        this.f35221g = findViewById(R.id.audioPanel);
        this.n = findViewById(R.id.audioPanelControlLayout);
        this.f35222h = findViewById(R.id.audioPanelPlaybackLayout);
        View viewFindViewById = findViewById(R.id.audioPanelAppListLayout);
        this.f35223i = viewFindViewById;
        this.f35224j = findViewById(R.id.audioPanelPlaylists);
        this.f35225k = findViewById(R.id.audioPanelConnectingLayout);
        this.f35226l = findViewById(R.id.audioPanelConnectionFailedLayout);
        View viewFindViewById2 = findViewById(R.id.audioPanelCloseButton);
        this.m = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new com.waze.navigate.ai(this, 18));
        this.o = (OvalButton) findViewById(R.id.audioNothingPlayingButton);
        this.p = (TextView) findViewById(R.id.audioNothingPlayingButtonText);
        OvalButton ovalButton = (OvalButton) findViewById(R.id.audioPlayPauseButton);
        this.q = ovalButton;
        this.r = findViewById(R.id.audioPlayPauseButtonText);
        this.s = findViewById(R.id.audioFastForwardButton);
        this.t = (ImageView) findViewById(R.id.audioFastForwardIcon);
        this.u = (TextView) findViewById(R.id.audioFastForwardSecs);
        this.v = findViewById(R.id.audioRewindButton);
        this.w = (ImageView) findViewById(R.id.audioRewindIcon);
        this.x = (TextView) findViewById(R.id.audioRewindSecs);
        this.y = (ImageView) findViewById(R.id.audioPanelFirstCustomAction);
        this.z = (ImageView) findViewById(R.id.audioPanelSecondCustomAction);
        ovalButton.setOnClickListener(new com.waze.navigate.ai(this, 19));
        this.G = (TextView) findViewById(R.id.audioPanelSongName);
        this.H = (TextView) findViewById(R.id.audioPanelArtistName);
        this.I = (ImageView) findViewById(R.id.audioPanelSongPoster);
        ao();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.audioPanelAppList);
        this.B = recyclerView;
        getContext();
        recyclerView.al(new LinearLayoutManager(0));
        a();
        TextView textView = (TextView) findViewById(R.id.audioPanelShowPlaybackButton);
        this.A = textView;
        textView.setText(aVarA.c(R.string.AUDIO_PANEL_SHOW_PLAYBACK, new Object[0]));
        textView.setOnClickListener(new com.waze.navigate.ai(this, 20));
        findViewById(R.id.audioPanelShowPlayListButton).setOnClickListener(new com.waze.planned_drive.af(this, 3));
        ((TextView) findViewById(R.id.audioPanelShowPlayListButtonText)).setText(aVarA.c(R.string.AUDIO_PANEL_SHOW_PLAYLIST, new Object[0]));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.audioPanelPlaylistGroups);
        this.C = recyclerView2;
        recyclerView2.k().f();
        this.E = (ProgressBar) findViewById(R.id.audioPanelPlaylistLoadingSpinner);
        TextView textView2 = (TextView) findViewById(R.id.audioPanelPlaylistNoResult);
        this.F = textView2;
        textView2.setText(aVarA.c(R.string.AUDIO_PANEL_NO_PLAYLIST, new Object[0]));
        adVar.setHasStableIds(true);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2, null);
        this.W = gridLayoutManager;
        gridLayoutManager.u(new k(this));
        getContext();
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(4, null);
        this.aa = gridLayoutManager2;
        gridLayoutManager2.u(new l(this));
        TextView textView3 = (TextView) findViewById(R.id.audioPanelClosePlaylistButton);
        textView3.setOnClickListener(new com.waze.planned_drive.af(this, 4));
        textView3.setText(aVarA.c(R.string.AUDIO_PANEL_CLOSE_PLAYLIST_LIST, new Object[0]));
        ((TextView) findViewById(R.id.audioPanelSelectAppText)).setText(aVarA.c(R.string.AUDIO_PANEL_APP_LIST_TITLE, new Object[0]));
        View[] viewArr = {viewFindViewById};
        com.waze.inbox.e eVar2 = new com.waze.inbox.e(13);
        View viewFindViewById3 = viewArr[0].findViewById(R.id.audioPanelSettingsButton);
        viewFindViewById3.setOnClickListener(eVar2);
        ((TextView) viewFindViewById3.findViewById(R.id.audioPanelSettingsButtonText)).setText(aVarA.c(R.string.AUDIO_PANEL_SETTINGS_BUTTON, new Object[0]));
        bd.d().I(this);
        bd.d().u(this);
        new m(this, context);
        this.ab = (bm) com.waze.web.r.h(bm.class);
    }

    static /* bridge */ /* synthetic */ void A(ae aeVar, String str, String str2, Drawable drawable) {
        aeVar.S = str;
        aeVar.ap(aeVar.f35225k);
        ((TextView) aeVar.findViewById(R.id.audioPanelConnectingToText)).setText(aeVar.ac.c(R.string.AUDIO_PANEL_CONNECTING_TO, new Object[0]));
        ((TextView) aeVar.findViewById(R.id.audioPanelConnectingAppName)).setText(str2);
        ((ImageView) aeVar.findViewById(R.id.audioPanelConnectingAppIcon)).setImageDrawable(drawable);
        ((ProgressBar) aeVar.findViewById(R.id.audioPanelConnectingProgress)).getIndeterminateDrawable().setColorFilter(aeVar.getResources().getColor(R.color.ProgressBlue), PorterDuff.Mode.MULTIPLY);
    }

    public static /* synthetic */ void S(ae aeVar) {
        if (aeVar.f35220f != null) {
            if (aeVar.K) {
                aeVar.ab.a(bl.f35355i, aeVar.f35219e.T());
                aeVar.f35220f.g();
            } else {
                aeVar.ab.a(bl.f35351e, aeVar.f35219e.T());
                aeVar.f35220f.h();
            }
        }
    }

    public static /* synthetic */ void T(ae aeVar, w wVar, String str) {
        bl blVar = null;
        switch (wVar.ordinal()) {
            case 0:
                blVar = bl.p;
                break;
            case 2:
                blVar = bl.o;
                break;
            case 3:
                blVar = bl.r;
                break;
            case 4:
                blVar = bl.n;
                break;
            case 6:
                blVar = bl.m;
                break;
            case 7:
                blVar = bl.q;
                break;
        }
        if (blVar != null) {
            aeVar.ab.a(blVar, aeVar.f35219e.T());
        }
        ah ahVar = aeVar.f35220f;
        if (ahVar != null) {
            ahVar.f(str);
        }
    }

    public static /* synthetic */ void U(ae aeVar, bl blVar, String str) {
        if (blVar != null) {
            aeVar.ab.a(blVar, aeVar.f35219e.T());
        }
        ah ahVar = aeVar.f35220f;
        if (ahVar != null) {
            ahVar.f(str);
        }
    }

    public static /* synthetic */ void V(ae aeVar) {
        aeVar.R = true;
        aeVar.ap(aeVar.f35223i);
        if (aeVar.Q()) {
            aeVar.ar(false);
        }
    }

    public static /* synthetic */ void W(ae aeVar) {
        aeVar.ab.a(bl.f35357k, aeVar.f35219e.T());
        ah ahVar = aeVar.f35220f;
        if (ahVar != null) {
            ahVar.k();
        }
    }

    public static /* synthetic */ void X(ae aeVar) {
        aeVar.ab.a(bl.f35348b, aeVar.f35219e.T());
        ah ahVar = aeVar.f35220f;
        if (ahVar != null) {
            ahVar.j();
        }
    }

    public static /* synthetic */ void Y(ae aeVar) {
        aeVar.ap(aeVar.f35222h);
        aeVar.R = false;
    }

    public static /* synthetic */ void Z(ae aeVar) {
        if (aeVar.J) {
            aeVar.ar(true);
        }
    }

    private static final void aA(View view, boolean z) {
        view.setEnabled(z);
        view.setAlpha(true != z ? 0.1f : 1.0f);
    }

    public static /* synthetic */ void ad(ae aeVar, bl blVar, String str) {
        if (blVar != null) {
            aeVar.ab.a(blVar, aeVar.f35219e.T());
        }
        ah ahVar = aeVar.f35220f;
        if (ahVar != null) {
            ahVar.f(str);
        }
    }

    public static /* synthetic */ void ah(ae aeVar) {
        aeVar.ab.a(bl.f35352f, aeVar.f35219e.T());
        ah ahVar = aeVar.f35220f;
        if (ahVar != null) {
            ahVar.n();
        }
    }

    public static /* synthetic */ void ai(ae aeVar) {
        aeVar.ab.a(bl.f35347a, aeVar.f35219e.T());
        ah ahVar = aeVar.f35220f;
        if (ahVar != null) {
            ahVar.m();
        }
    }

    private final Drawable al(int i2, boolean z) throws Resources.NotFoundException {
        an anVar;
        Drawable drawable = getResources().getDrawable(i2);
        if (!z || (anVar = this.f35219e) == null) {
            drawable.setColorFilter(null);
            return drawable;
        }
        drawable.setColorFilter(anVar.L(), PorterDuff.Mode.MULTIPLY);
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void am(boolean z, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7) {
        ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(com.waze.view.anim.g.f44979a);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.waze.sdk.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ae.v(this.f35373a, i2, i3, i4, i5, i6, i7, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addListener(new o(this, z));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void an(String str, String str2) {
        this.S = null;
        ap(this.f35226l);
        TextView textView = (TextView) findViewById(R.id.audioPanelConnectionFailedText);
        com.waze.shared_infra.o.a aVar = this.ac;
        textView.setText(String.format(aVar.c(R.string.AUDIO_PANEL_CONNECTION_FAIL_TEXT, new Object[0]), str2));
        TextView textView2 = (TextView) findViewById(R.id.audioPanelConnectionFailedButton);
        textView2.setText(String.format(aVar.c(R.string.AUDIO_PANEL_OPEN_APP, new Object[0]), str2));
        textView2.setVisibility(0);
        textView2.setOnClickListener(new com.waze.planned_drive.af(str, 6));
        TextView textView3 = (TextView) findViewById(R.id.audioPanelSelectAnotherAppButton);
        textView3.setOnClickListener(new com.waze.planned_drive.af(this, 7));
        textView3.setText(aVar.c(R.string.AUDIO_PANEL_SELECT_ANOTHER_APP, new Object[0]));
    }

    private final void ao() {
        this.M = 0;
        this.L = 0;
        this.ad.a();
        this.I.setImageResource(R.drawable.music_player_artwork_placeholder);
        this.G.setText("--");
        this.H.setText("--");
        aw();
        aA(this.q, false);
        ay(0L, null);
        this.y.setVisibility(8);
        this.z.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ap(View view) {
        if (this.J) {
            View view2 = this.Q;
            View view3 = this.f35223i;
            if (view2 == view3 && view == this.f35222h) {
                as(view2, view, false);
            } else if (view2 == this.f35222h && view == view3) {
                as(view2, view, true);
            } else {
                aq(view);
            }
        }
        this.Q = view;
    }

    private final void aq(View view) {
        this.f35223i.setVisibility(8);
        this.f35222h.setVisibility(8);
        this.f35225k.setVisibility(8);
        this.f35226l.setVisibility(8);
        view.setVisibility(0);
        this.Q = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ar(boolean z) {
        if (z) {
            View view = this.f35224j;
            view.setPadding(0, 0, 0, this.ag);
            view.setAlpha(0.0f);
            view.setVisibility(0);
        } else {
            this.f35221g.setAlpha(0.0f);
        }
        View view2 = this.f35221g;
        view2.getLayoutParams().width = view2.getWidth();
        view2.setLayoutParams(view2.getLayoutParams());
        int i2 = getResources().getConfiguration().orientation;
        com.waze.main_screen.ab.a.e eVar = this.ah;
        if (eVar != null) {
            eVar.b(z);
        }
        if (i2 == 1) {
            am(z, getWidth(), getWidth(), this.f35222h.getHeight(), getHeight(), 0, 0);
            return;
        }
        int[] iArr = new int[2];
        this.f35222h.findViewById(R.id.audioPanelOpenAppImage).getLocationOnScreen(iArr);
        addOnLayoutChangeListener(new n(this, iArr, z));
    }

    private final void as(View view, View view2, boolean z) {
        int height = this.Q.getHeight();
        view2.setVisibility(0);
        view.setTranslationY(0.0f);
        com.waze.view.anim.g.d(view).translationY(z ? height : -height).setDuration(400L);
        view2.setTranslationY(z ? -height : height);
        com.waze.view.anim.g.d(view2).translationY(0.0f).setDuration(400L).setListener(com.waze.view.anim.g.a(new android.support.v4.app.n(this, view, view2, 13)));
    }

    private final void at(ImageView imageView, final w wVar, Bundle bundle) {
        if (wVar == null) {
            imageView.setVisibility(8);
            return;
        }
        boolean z = false;
        imageView.setVisibility(0);
        if (bundle != null && bundle.getBoolean(wVar.f35429l, false)) {
            z = true;
        }
        imageView.setImageDrawable(al(wVar.f35428k, z));
        final String str = wVar.f35427j;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.sdk.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ae.T(this.f35370a, wVar, str);
            }
        });
    }

    private final void au() {
        String strAz = az(this.f35219e.O());
        this.o.setVisibility(strAz != null ? 8 : 0);
        this.n.setVisibility(strAz != null ? 0 : 8);
        if (strAz == null) {
            TextView textView = this.G;
            com.waze.shared_infra.o.a aVar = this.ac;
            textView.setText(aVar.c(R.string.AUDIO_PANEL_NOTHING_PLAYING_TRACK, new Object[0]));
            this.H.setText(aVar.c(R.string.AUDIO_PANEL_NOTHING_PLAYING_ALBUM, new Object[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void av() throws Resources.NotFoundException {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.surface_default));
        View view = this.m;
        view.setBackgroundTintList(colorStateListValueOf);
        view.findViewById(R.id.audioPanelCloseButtonIcon).setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.primary_variant)));
        int i2 = getResources().getConfiguration().orientation;
        boolean zT = this.f35218c.T();
        boolean zQ = Q();
        Boolean bool = this.T;
        boolean z = i2 == 1;
        if (bool != null && z == bool.booleanValue() && zT == this.U && zQ == this.V) {
            return;
        }
        int dimensionPixelSize = z ? getResources().getDimensionPixelSize(R.dimen.audio_panel_shadow_size) : 0;
        View view2 = this.f35221g;
        view2.setBackground(new com.waze.view.b.f(view2, getResources().getColor(R.color.always_dark_background_default), getResources().getDimensionPixelSize(R.dimen.audio_panel_corner_size), getResources().getColor(R.color.black_40pc), dimensionPixelSize, z || zT));
        int i3 = -dimensionPixelSize;
        ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).setMargins(i3, 0, i3, 0);
        view2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, dimensionPixelSize);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.audio_panel_close_button_right_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(0, getResources().getDimensionPixelOffset(R.dimen.audio_panel_close_button_top_margin) - dimensionPixelSize, dimensionPixelOffset + dimensionPixelSize, 0);
        view.setLayoutParams(marginLayoutParams);
        invalidate();
        this.T = Boolean.valueOf(z);
        this.U = zT;
        this.V = zQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aw() {
        int i2;
        if (!this.K) {
            this.q.B(0.0f);
            return;
        }
        int i3 = this.L;
        if (i3 > 0 && (i2 = this.M) > 0) {
            this.q.B(Math.min((i2 * 100) / i3, 100.0f));
            return;
        }
        long j2 = i3;
        OvalButton ovalButton = this.q;
        if (j2 == -1) {
            ovalButton.B(100.0f);
        } else {
            ovalButton.B(0.0f);
        }
    }

    private final void ax(boolean z) {
        GridLayoutManager gridLayoutManager = getContext().getResources().getConfiguration().orientation == 1 ? this.W : this.aa;
        RecyclerView recyclerView = this.C;
        recyclerView.al(gridLayoutManager);
        if (z) {
            recyclerView.ak(this.D);
        }
    }

    private final void ay(long j2, Bundle bundle) {
        int i2;
        int i3;
        if (bundle != null) {
            int i4 = bundle.getInt("waze.state.seekSecs");
            i3 = bundle.getInt("waze.state.fastForwardSeekSecs", i4);
            i2 = bundle.getInt("waze.state.rewindSeekSecs", i4);
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (i3 <= 0 && i2 <= 0) {
            this.t.setImageResource(R.drawable.audio_next_icon);
            this.u.setVisibility(8);
            View view = this.s;
            view.setOnClickListener(new com.waze.navigate.ai(this, 16));
            aA(view, (32 & j2) != 0);
            this.w.setImageResource(R.drawable.audio_previous_icon);
            this.x.setVisibility(8);
            View view2 = this.v;
            view2.setOnClickListener(new com.waze.navigate.ai(this, 17));
            aA(view2, (j2 & 16) != 0);
            return;
        }
        this.t.setImageResource(R.drawable.audio_forward_icon);
        TextView textView = this.u;
        textView.setText(i3 > 0 ? Integer.toString(i3) : "--");
        textView.setVisibility(0);
        View view3 = this.s;
        view3.setOnClickListener(new com.waze.navigate.ai(this, 14));
        aA(view3, (64 & j2) != 0 && i3 > 0);
        this.w.setImageResource(R.drawable.audio_backward_icon);
        TextView textView2 = this.x;
        textView2.setText(i2 > 0 ? Integer.toString(i2) : "--");
        textView2.setVisibility(0);
        View view4 = this.v;
        view4.setOnClickListener(new com.waze.navigate.ai(this, 15));
        if ((j2 & 8) != 0 && i2 > 0) {
            z = true;
        }
        aA(view4, z);
    }

    private static final String az(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return null;
        }
        String string = mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_TITLE);
        return string != null ? string : mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
    }

    public static /* synthetic */ void r(ae aeVar, View view, View view2) {
        view.setTranslationY(0.0f);
        aeVar.aq(view2);
    }

    public static /* synthetic */ void s(ae aeVar) {
        if (aeVar.f35219e != null) {
            aeVar.au();
        }
    }

    public static /* synthetic */ void u(final ae aeVar, String str, String str2, Drawable drawable) {
        if (aeVar.J || lm.d().c() == null || !lm.d().c().aK() || !ConfigManager.getInstance().getConfigValueBool(ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_NOTIFY_NOW_PLAYING)) {
            return;
        }
        if (str == null && str2 == null) {
            return;
        }
        com.waze.notifications.a aVar = new com.waze.notifications.a() { // from class: com.waze.sdk.h
            @Override // com.waze.notifications.a
            public final void a(com.waze.notifications.b.c cVar) {
                ae.x(this.f35384a, cVar);
            }
        };
        if (str == null) {
            str = str2;
        } else if (str2 != null) {
            str = str + " - " + str2;
        }
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        com.waze.notifications.b bVar = new com.waze.notifications.b(300);
        bVar.h(aVarA.c(R.string.AUDIO_PANEL_NOW_PLAYING, new Object[0]));
        bVar.b(str);
        bVar.d(drawable);
        bVar.g(ConfigValues.CONFIG_VALUE_PUSH_NOTIFICATION_SHORT_TIMEOUT_MS.b().intValue());
        bVar.c(R.drawable.clickable_notification_chevron_icon);
        bVar.e(aVar);
        com.waze.network.f.ak.d().a(bVar.a(), aeVar.P);
    }

    public static /* synthetic */ void v(ae aeVar, int i2, int i3, int i4, int i5, int i6, int i7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = aeVar.f35224j;
        view.getLayoutParams().width = (int) (i2 + ((i3 - i2) * fFloatValue));
        view.getLayoutParams().height = (int) (i4 + ((i5 - i4) * fFloatValue));
        view.setLayoutParams(view.getLayoutParams());
        float f2 = 1.0f - fFloatValue;
        view.setTranslationX(i6 * f2);
        view.setTranslationY(i7 * f2);
        view.setAlpha(fFloatValue);
        aeVar.f35221g.setAlpha(f2);
    }

    public static /* synthetic */ void w(ae aeVar, an anVar, View[] viewArr, Drawable drawable) {
        if (aeVar.f35219e == null || !anVar.T().equals(aeVar.f35219e.T())) {
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            ((ImageView) viewArr[i2].findViewById(R.id.audioPanelOpenAppImage)).setImageDrawable(drawable);
        }
    }

    public static /* synthetic */ void x(ae aeVar, com.waze.notifications.b.c cVar) {
        com.waze.main_screen.ab.a.e eVar;
        com.waze.notifications.b.c cVar2 = com.waze.notifications.b.c.f32546a;
        if (cVar.ordinal() == 2 && (eVar = aeVar.ah) != null) {
            eVar.c();
        }
    }

    @Override // com.waze.sdk.az
    public final void F(an anVar, boolean z) {
        if (!z) {
            ap(this.f35223i);
            this.R = false;
            return;
        }
        if (anVar.Q() == null) {
            return;
        }
        an anVar2 = this.f35219e;
        if (anVar2 == null || !anVar2.T().equals(anVar.T())) {
            this.S = null;
            this.f35219e = anVar;
            this.f35220f = anVar.Q();
            this.q.f(this.f35219e.L());
            OvalButton ovalButton = this.o;
            ovalButton.setOnClickListener(new com.waze.planned_drive.af(this, 5));
            ovalButton.bz(this.f35219e.L());
            TextView textView = this.p;
            com.waze.shared_infra.o.a aVar = this.ac;
            int i2 = 1;
            textView.setText(String.format(aVar.c(R.string.AUDIO_PANEL_OPEN_APP, new Object[0]), this.f35219e.S()));
            View view = this.f35222h;
            View[] viewArr = {view, this.f35224j};
            com.waze.navigate.ai aiVar = new com.waze.navigate.ai(this, 12);
            String str = String.format(aVar.c(R.string.AUDIO_PANEL_OPEN_APP, new Object[0]), this.f35219e.S());
            for (int i3 = 0; i3 < 2; i3++) {
                View view2 = viewArr[i3];
                view2.findViewById(R.id.audioPanelOpenAppButton).setOnClickListener(aiVar);
                ((ImageView) view2.findViewById(R.id.audioPanelOpenAppImage)).setImageResource(R.drawable.audio_generic_music_icon);
                TextView textView2 = (TextView) view2.findViewById(R.id.audioPanelOpenAppLabel);
                textView2.setText(str);
                textView2.setTextColor(this.f35219e.L());
                TextView textView3 = (TextView) view2.findViewById(R.id.audioPanelShowAppListButton);
                textView3.setText(aVar.c(R.string.AUDIO_PANEL_SHOW_APP_LIST, new Object[0]));
                textView3.setOnClickListener(new com.waze.navigate.ai(this, 13));
            }
            an anVar3 = this.f35219e;
            anVar3.X(getContext(), new g(this, anVar3, viewArr, i2));
            findViewById(R.id.audioPanelShowPlayListButtonImg).setBackground(al(R.drawable.circle_background, true));
            bd.d().J(this);
            bd.d().K(this);
            a();
            this.A.setVisibility(0);
            postDelayed(new com.waze.g.f(this, 18), 1500L);
            ap(view);
        }
    }

    @Override // com.waze.sdk.az
    public final void G(an anVar) {
        if (anVar.Q() == null) {
            return;
        }
        this.ae.b(getContext());
        ax(true);
    }

    @Override // com.waze.sdk.az
    public final void H(an anVar) {
        View view = this.Q;
        View view2 = this.f35225k;
        if (view == view2 && this.S.equals(anVar.T())) {
            an(anVar.T(), anVar.S());
        }
        if (this.f35219e == null || !TextUtils.equals(anVar.T(), this.f35219e.T())) {
            return;
        }
        this.f35219e = null;
        bd.d().J(null);
        bd.d().K(null);
        if (this.Q != view2) {
            ap(this.f35223i);
            this.R = false;
        }
        this.B.j().notifyDataSetChanged();
        this.A.setVisibility(8);
        ao();
    }

    @Override // com.waze.view.popups.m
    public final void I() {
        if (Q()) {
            return;
        }
        ag();
    }

    @Override // com.waze.sdk.ba
    public final void J(MediaMetadataCompat mediaMetadataCompat) {
        au();
        this.N = mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID);
        ad adVar = this.D;
        if (adVar != null) {
            adVar.notifyDataSetChanged();
        }
        int i2 = (int) mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
        this.L = i2;
        int i3 = 0;
        if (i2 > 0) {
            this.q.G(i2);
        } else {
            this.M = 0;
        }
        String strAz = az(mediaMetadataCompat);
        boolean zEquals = TextUtils.equals(strAz, this.O);
        this.O = strAz;
        TextView textView = this.G;
        if (strAz != null) {
            textView.setText(strAz);
        } else {
            textView.setText("--");
        }
        String string = mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_ARTIST);
        if (string == null) {
            string = mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST);
        }
        if (string == null) {
            string = mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
        }
        TextView textView2 = this.H;
        if (string != null) {
            textView2.setText(string);
        } else {
            textView2.setText("--");
        }
        Bitmap bitmap = mediaMetadataCompat.getBitmap(MediaMetadataCompat.METADATA_KEY_ART);
        if (bitmap == null) {
            bitmap = mediaMetadataCompat.getBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
        }
        if (bitmap != null) {
            this.I.setImageBitmap(bitmap);
        } else {
            String string2 = mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_ART_URI);
            if (string2 == null) {
                string2 = mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI);
            }
            if (string2 != null) {
                this.I.setImageResource(R.drawable.music_player_artwork_placeholder);
                com.waze.utils.i.a().c(string2, new at(this, string2, 1));
            }
        }
        if (zEquals || !this.K) {
            return;
        }
        this.f35219e.X(getContext(), new g(this, string, strAz, i3));
    }

    @Override // com.waze.view.popups.m
    public final void K() throws Resources.NotFoundException {
        ax(false);
        av();
        an anVar = this.f35219e;
        if (anVar == null || !anVar.ae()) {
            return;
        }
        this.f35224j.addOnLayoutChangeListener(new p(this));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00a7. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    @Override // com.waze.sdk.ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(android.support.v4.media.a.z r17) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sdk.ae.L(android.support.v4.media.a.z):void");
    }

    @Override // com.waze.sdk.bc
    public final void M(List list) {
        ad adVar = this.D;
        List list2 = adVar.f35213a;
        list2.clear();
        if (list == null) {
            ae aeVar = adVar.f35214b;
            aeVar.E.setVisibility(0);
            aeVar.F.setVisibility(8);
            aeVar.C.setVisibility(8);
            return;
        }
        if (list.isEmpty()) {
            ae aeVar2 = adVar.f35214b;
            aeVar2.E.setVisibility(8);
            aeVar2.F.setVisibility(0);
            aeVar2.C.setVisibility(8);
            return;
        }
        ae aeVar3 = adVar.f35214b;
        aeVar3.E.setVisibility(8);
        aeVar3.F.setVisibility(8);
        aeVar3.C.setVisibility(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bb bbVar = (bb) it.next();
            list2.add(bbVar.f35307a);
            list2.addAll(bbVar.f35308b);
        }
        adVar.notifyDataSetChanged();
    }

    public final void N(boolean z) throws Resources.NotFoundException {
        if (z) {
            aq(this.f35223i);
        } else {
            View view = this.Q;
            if (view != null) {
                aq(view);
            } else if (bd.d().c() == null) {
                aq(this.f35223i);
            } else {
                aq(this.f35222h);
            }
        }
        av();
        this.J = true;
    }

    public final void O(int i2) {
        this.ag = i2;
        View view = this.f35224j;
        if (view == null || !view.isShown()) {
            return;
        }
        view.setPadding(0, 0, 0, this.ag);
    }

    public final boolean Q() {
        View view = this.f35224j;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.waze.sdk.ay
    public final void a() {
        List<au> partnerAudioApps = SdkConfiguration.getPartnerAudioApps(getContext(), false);
        if (partnerAudioApps.isEmpty()) {
            ag();
        } else {
            Collections.sort(partnerAudioApps, this.af);
        }
        this.B.ak(new v(this, partnerAudioApps));
    }

    public final void ag() {
        if (!this.J || lm.d().c() == null || this.ah == null) {
            return;
        }
        this.J = false;
        com.waze.t.l(new com.waze.g.f(this, 17));
    }

    @Override // com.waze.sdk.ay
    public final void b() {
        a();
    }

    @Override // com.waze.view.popups.m
    public final void e() {
        ag();
    }

    @Override // com.waze.view.popups.m
    public final void f() {
        if (Q()) {
            ar(false);
            return;
        }
        View view = this.Q;
        if (view == this.f35225k) {
            return;
        }
        View view2 = this.f35226l;
        View view3 = this.f35223i;
        if (view == view2) {
            ap(view3);
        } else if (view != view3 || !this.R) {
            ag();
        } else {
            ap(this.f35222h);
            this.R = false;
        }
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.J;
    }
}
