package com.waze.view.popups.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.card.MaterialCardView;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.car_lib.be;
import com.waze.config.ConfigValues;
import com.waze.modules.navigation.ah;
import com.waze.modules.navigation.ai;
import com.waze.modules.navigation.aj;
import com.waze.navigate.AddressItem;
import com.waze.navigate.location_preview.ba;
import com.waze.sharedui.views.ProgressAnimation;
import com.waze.trip_overview.cb;
import com.waze.ui.z.as;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final g f45195a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.view.popups.b.m f45196b;

    /* renamed from: c, reason: collision with root package name */
    private AddressItem f45197c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f45198d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45199e;

    /* renamed from: f, reason: collision with root package name */
    private int f45200f;

    /* renamed from: g, reason: collision with root package name */
    private int f45201g;

    /* renamed from: h, reason: collision with root package name */
    private int f45202h;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f45203i;

    /* renamed from: j, reason: collision with root package name */
    private final NativeManager f45204j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f45205k;

    /* renamed from: l, reason: collision with root package name */
    private ae f45206l;
    private final com.google.firebase.messaging.l m;

    public h(Context context, com.google.firebase.messaging.l lVar, com.waze.view.popups.b.m mVar, g gVar) {
        super(context);
        this.f45204j = NativeManager.getInstance();
        this.m = lVar;
        this.f45196b = mVar;
        this.f45195a = gVar;
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.details_popup, this);
        MaterialCardView materialCardView = (MaterialCardView) findViewById(R.id.DetailsBubble);
        com.google.android.material.k.p pVar = new com.google.android.material.k.p(materialCardView.b());
        pVar.j(new com.google.android.material.k.af(G(12)));
        materialCardView.e(pVar.i());
        setPadding(0, 0, 0, G(20));
        setClipChildren(false);
        setClipToPadding(false);
        setGravity(81);
        ((ProgressAnimation) findViewById(R.id.ExtraInfoLoader)).a();
    }

    public static /* synthetic */ void A(h hVar, AddressItem addressItem) {
        hVar.L(com.waze.map.f.c.f28884c);
        hVar.f45195a.j(ah.f30292h, new ai(addressItem));
    }

    public static /* synthetic */ void B(h hVar, AddressItem addressItem) {
        hVar.L(com.waze.map.f.c.f28884c);
        com.waze.parking.d.f32954a.a().b();
        hVar.f45195a.h(addressItem, com.waze.share.z.f37757d);
    }

    public static /* synthetic */ void C(h hVar, AddressItem addressItem) {
        hVar.L(com.waze.map.f.c.f28884c);
        hVar.f45195a.j(ah.f30292h, new ai(addressItem));
    }

    public static /* synthetic */ void F(h hVar, AddressItem addressItem, int i2, com.waze.sharedui.g.t tVar, com.waze.sharedui.g.s sVar) {
        com.waze.parking.d dVarA = com.waze.parking.d.f32954a.a();
        int i3 = sVar.f39006a;
        if (i3 == 0) {
            hVar.f45195a.i(7, addressItem, i2, hVar.f45197c);
            dVarA.a(com.waze.parking.b.f32949d);
        } else if (i3 == 1) {
            hVar.f45195a.b();
        } else {
            dVarA.a(com.waze.parking.b.f32950e);
            hVar.f45195a.d();
        }
        tVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G(int i2) {
        return as.h(getResources(), i2);
    }

    private final Drawable H(int i2) {
        return ResourcesCompat.getDrawable(getContext().getResources(), i2, null);
    }

    private final void I(int i2) {
        View viewFindViewById = findViewById(i2);
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ad(this, viewFindViewById, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        setVisibility(8);
        setLayoutTransition(null);
        R(0);
        this.f45199e = false;
        this.f45198d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        ae aeVar = this.f45206l;
        if (aeVar != null) {
            aeVar.f45157a = true;
        }
        findViewById(R.id.DetailsPopupTopSpace).setVisibility(0);
        findViewById(R.id.DetailsPopupButtons).setVisibility(0);
        findViewById(R.id.DetailsPopupButtonsSeparator).setVisibility(0);
        TextView textView = (TextView) findViewById(R.id.ExtraInfo);
        if (textView.getText().length() > 0) {
            textView.setVisibility(0);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.DetailsBubbleLayout);
        viewGroup.getLayoutTransition().setDuration(150L);
        viewGroup.getLayoutTransition().addTransitionListener(new e(this, viewGroup));
        findViewById(R.id.moreActionIcon).setVisibility(8);
        I(R.id.TitleText);
        I(R.id.MsgText);
        I(R.id.ExtraInfoLayout);
    }

    private final void L(com.waze.map.f.c cVar) {
        com.waze.map.f.d dVar;
        com.waze.map.f.f fVarB = com.waze.map.g.t.b();
        switch (this.f45203i) {
            case 1:
                dVar = com.waze.map.f.d.f28892b;
                break;
            case 2:
                dVar = com.waze.map.f.d.f28899i;
                break;
            case 3:
                dVar = com.waze.map.f.d.f28901k;
                break;
            case 4:
                dVar = com.waze.map.f.d.f28902l;
                break;
            case 5:
                dVar = com.waze.map.f.d.f28893c;
                break;
            case 6:
                dVar = com.waze.map.f.d.f28894d;
                break;
            case 7:
                dVar = com.waze.map.f.d.f28896f;
                break;
            case 8:
                dVar = com.waze.map.f.d.f28897g;
                break;
            case 9:
                dVar = com.waze.map.f.d.f28898h;
                break;
            case 10:
                dVar = com.waze.map.f.d.f28895e;
                break;
            case 11:
                dVar = com.waze.map.f.d.f28900j;
                break;
            case 12:
                dVar = com.waze.map.f.d.m;
                break;
            default:
                dVar = com.waze.map.f.d.f28891a;
                break;
        }
        fVarB.d(dVar, cVar);
    }

    private final void M(int i2, int i3) {
        ImageView imageView = (ImageView) findViewById(R.id.detailsPopupImage);
        imageView.setImageResource(i2);
        imageView.setPadding(i3, i3, i3, i3);
    }

    private final void N(String str, boolean z) {
        TextView textView = (TextView) findViewById(R.id.ExtraInfo);
        ProgressAnimation progressAnimation = (ProgressAnimation) findViewById(R.id.ExtraInfoLoader);
        findViewById(R.id.ExtraInfoLayout).setVisibility(true != ((str != null && !str.isEmpty()) || z) ? 8 : 0);
        textView.setVisibility(8);
        progressAnimation.setVisibility(8);
        if (str != null && !str.isEmpty()) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        progressAnimation.setVisibility(true != z ? 4 : 0);
    }

    private final void O(String str) {
        TextView textView = (TextView) findViewById(R.id.MsgText);
        textView.setText(str);
        if (str == null || str.isEmpty()) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private final void P(int i2, int i3) {
        this.f45201g = i2;
        this.f45202h = i3 + this.f45200f;
        be beVar = new be(this, 7);
        h.g.b.x.f(this, "<this>");
        h.g.b.x.f(beVar, "action");
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.waze.ad.a.h(beVar));
        } else {
            beVar.run();
        }
    }

    private final void Q(String str) {
        ((TextView) findViewById(R.id.TitleText)).setText(str);
    }

    private final void R(int i2) {
        TextView textView = (TextView) findViewById(R.id.TitleText);
        TextView textView2 = (TextView) findViewById(R.id.MsgText);
        View viewFindViewById = findViewById(R.id.ExtraInfoLayout);
        findViewById(R.id.DetailsPopupTopSpace).setVisibility(8);
        findViewById(R.id.moreActionIcon).setVisibility(0);
        findViewById(R.id.DetailsPopupImageFrame).setVisibility(8);
        findViewById(R.id.DetailsPopupTopSpace).setVisibility(8);
        findViewById(R.id.DetailsPopupButtons).setVisibility(8);
        findViewById(R.id.DetailsPopupButtonsSeparator).setVisibility(8);
        ((LinearLayout.LayoutParams) textView.getLayoutParams()).gravity = 3;
        ((LinearLayout.LayoutParams) textView2.getLayoutParams()).gravity = 3;
        ((LinearLayout.LayoutParams) viewFindViewById.getLayoutParams()).gravity = 3;
        textView.setGravity(3);
        textView.setAnimation(null);
        textView2.setGravity(3);
        textView2.setAnimation(null);
        viewFindViewById.setAnimation(null);
        ae aeVar = new ae(this, 1);
        this.f45206l = aeVar;
        if (i2 > 0) {
            postDelayed(aeVar, i2 * 1000);
        }
        findViewById(R.id.DetailsBubble).setOnClickListener(new com.waze.settings.g(this, 16));
        findViewById(R.id.moreActionIcon).setOnClickListener(new com.waze.settings.g(this, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight();
        setTranslationX(this.f45201g - measuredWidth);
        setTranslationY(this.f45202h - measuredHeight);
    }

    private static final String T() {
        return com.waze.shared_infra.o.b.a().c(true != ((cb) com.waze.web.r.h(cb.class)).a(ah.f30292h) ? R.string.MAP_POPUP_DEFAULT_GO_BUTTON : R.string.MAP_POPUP_DIRECTIONS_BUTTON, new Object[0]);
    }

    public static /* synthetic */ void d(h hVar, com.waze.sharedui.g.t tVar, int i2, AddressItem addressItem, int i3, com.waze.sharedui.g.s sVar) {
        tVar.dismiss();
        int i4 = sVar.f39006a;
        if (i4 == 0) {
            hVar.f45195a.i(i2, addressItem, i3, hVar.f45197c);
        } else if (i4 == 1) {
            hVar.f45195a.g(addressItem.getCoordinate());
        } else {
            if (i4 != 2) {
                return;
            }
            hVar.f45195a.e(addressItem.getCoordinate());
        }
    }

    public static /* synthetic */ void n(h hVar, AddressItem addressItem) {
        hVar.L(com.waze.map.f.c.f28884c);
        hVar.f45195a.j(ah.f30292h, new ai(addressItem));
    }

    public static /* synthetic */ void p(h hVar) {
        hVar.L(com.waze.map.f.c.f28885d);
        hVar.f45195a.a();
    }

    public static /* synthetic */ void q(h hVar, AddressItem addressItem) {
        hVar.L(com.waze.map.f.c.f28885d);
        hVar.f45195a.h(addressItem, com.waze.share.z.f37756c);
    }

    public static /* synthetic */ void r(h hVar, AddressItem addressItem) {
        hVar.L(com.waze.map.f.c.f28885d);
        hVar.f45195a.h(addressItem, com.waze.share.z.f37756c);
    }

    public static /* synthetic */ void s(h hVar, AddressItem addressItem) {
        hVar.L(com.waze.map.f.c.f28885d);
        hVar.f45195a.h(addressItem, com.waze.share.z.f37756c);
    }

    public static /* synthetic */ void u(h hVar, AddressItem addressItem) {
        hVar.L(com.waze.map.f.c.f28885d);
        hVar.f45195a.h(addressItem, com.waze.share.z.f37756c);
    }

    public static /* synthetic */ void v(h hVar) {
        hVar.L(com.waze.map.f.c.f28889h);
        hVar.K();
        hVar.findViewById(R.id.DetailsBubble).setOnClickListener(null);
    }

    public static /* synthetic */ void w(final h hVar, final int i2, com.waze.shared_infra.o.a aVar, final AddressItem addressItem, final int i3) {
        hVar.L(com.waze.map.f.c.f28889h);
        if (i2 == 7) {
            final com.waze.sharedui.g.t tVar = new com.waze.sharedui.g.t(hVar.getContext(), com.waze.sharedui.g.f.COLUMN_TEXT_ICON, aVar.c(R.string.MAP_POPUP_PARKED_MENU_TITLE, new Object[0]), new com.waze.sharedui.g.s[]{new com.waze.sharedui.g.s(0, aVar.c(R.string.MAP_POPUP_MENU_PREVIEW, new Object[0]), hVar.H(R.drawable.list_icon_info)), new com.waze.sharedui.g.s(1, aVar.c(R.string.MAP_POPUP_PARKED_MENU_EDIT, new Object[0]), hVar.H(R.drawable.list_icon_change_location)), new com.waze.sharedui.g.s(2, aVar.c(R.string.MAP_POPUP_PARKED_MENU_REMOVE, new Object[0]), hVar.H(R.drawable.list_icon_remove))}, null);
            tVar.q(new com.waze.sharedui.g.q() { // from class: com.waze.view.popups.a.a
                @Override // com.waze.sharedui.g.q
                public final void a(com.waze.sharedui.g.s sVar) {
                    h.F(this.f45136a, addressItem, i3, tVar, sVar);
                }
            });
            tVar.show();
            return;
        }
        int i4 = true != "latam".equals(ConfigValues.CONFIG_VALUE_PARKING_SYMBOL_STYLE.b()) ? R.drawable.list_icon_set_parking : R.drawable.list_icon_set_parking_latam;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.waze.sharedui.g.s(0, aVar.c(R.string.MAP_POPUP_MENU_PREVIEW, new Object[0]), hVar.H(R.drawable.list_icon_info)));
        arrayList.add(new com.waze.sharedui.g.s(1, aVar.c(R.string.MAP_POPUP_MENU_SET_PARKED, new Object[0]), hVar.H(i4)));
        if (ConfigValues.CONFIG_VALUE_REPORTING_MAP_POPUP_REPORT_ENABLED.b().booleanValue()) {
            arrayList.add(new com.waze.sharedui.g.s(2, aVar.c(R.string.REPORT, new Object[0]), hVar.H(R.drawable.report_button_icon)));
        }
        final com.waze.sharedui.g.t tVar2 = new com.waze.sharedui.g.t(hVar.getContext(), com.waze.sharedui.g.f.COLUMN_TEXT_ICON, null, (com.waze.sharedui.g.s[]) arrayList.toArray(new com.waze.sharedui.g.s[0]), null);
        tVar2.q(new com.waze.sharedui.g.q() { // from class: com.waze.view.popups.a.b
            @Override // com.waze.sharedui.g.q
            public final void a(com.waze.sharedui.g.s sVar) {
                h.d(this.f45182a, tVar2, i2, addressItem, i3, sVar);
            }
        });
        tVar2.m(addressItem.getTitle());
        tVar2.show();
    }

    public static /* synthetic */ void y(h hVar, AddressItem addressItem) {
        hVar.L(com.waze.map.f.c.f28884c);
        hVar.f45195a.j(ah.s, new aj(addressItem, hVar.f45197c));
        ba.e().a(com.waze.navigate.b.b.f31032e, null);
    }

    public static /* synthetic */ void z(h hVar) {
        hVar.L(com.waze.map.f.c.f28884c);
        hVar.f45195a.f();
    }

    public final void E(String str, boolean z) {
        N(str, z);
    }

    public final int b() {
        return this.f45203i;
    }

    public final void h() {
        if (!this.f45198d) {
            this.f45199e = false;
            return;
        }
        this.f45199e = true;
        this.f45198d = false;
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(250L);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.addAnimation(new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, this.f45201g, 0, this.f45202h));
        animationSet.setInterpolator(new AnticipateInterpolator());
        startAnimation(animationSet);
        animationSet.setAnimationListener(new d(this));
        this.m.d(this);
    }

    public final void i() {
        J();
        this.m.d(this);
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.f45198d;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r17, int r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, int r24, com.waze.navigate.AddressItem r25, int r26, com.waze.navigate.AddressItem r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.view.popups.a.h.j(int, int, int, java.lang.String, java.lang.String, java.lang.String, boolean, int, com.waze.navigate.AddressItem, int, com.waze.navigate.AddressItem, int, boolean):void");
    }

    public final void k(int i2, int i3) {
        if (this.f45198d) {
            P(i2, i3);
        }
    }

    public final void l(int i2, String str, String str2) {
        if (this.f45203i == 1 && i2 == this.f45203i) {
            Q(str);
            O(str2);
        }
    }

    public final void m(Bitmap bitmap) {
        com.waze.settings.g gVar;
        if (bitmap != null) {
            ImageView imageView = (ImageView) findViewById(R.id.detailsPopupImage);
            imageView.setImageDrawable(new com.waze.sharedui.views.i(bitmap, 0));
            imageView.setPadding(0, 0, 0, 0);
            gVar = new com.waze.settings.g(this, 14);
        } else {
            M(R.drawable.map_popup_add_photo_icon, G(12));
            gVar = new com.waze.settings.g(this, 15);
        }
        findViewById(R.id.DetailsPopupImageFrame).setOnClickListener(gVar);
    }
}
