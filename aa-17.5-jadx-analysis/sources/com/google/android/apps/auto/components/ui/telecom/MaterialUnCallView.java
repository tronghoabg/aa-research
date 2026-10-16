package com.google.android.apps.auto.components.ui.telecom;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.apps.auto.components.metadataview.MetadataView;
import com.google.android.apps.auto.components.ui.actionpanel.MaterialInCallViewExpandingActionPanel;
import com.google.android.apps.auto.components.ui.image.CrossfadeImageView;
import com.google.android.projection.gearhead.R;
import defpackage.dvb;
import defpackage.hrt;
import defpackage.lyv;
import defpackage.lyw;
import defpackage.mcd;
import defpackage.mlq;
import defpackage.ncp;
import defpackage.odn;
import defpackage.oez;
import defpackage.one;
import defpackage.onf;
import defpackage.ong;
import defpackage.org;
import defpackage.yfq;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzz;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class MaterialUnCallView extends FrameLayout implements onf {
    public static final /* synthetic */ int q = 0;
    private static final yph r = yph.c("GH.UnCallView");
    public one a;
    public MaterialInCallViewExpandingActionPanel b;
    public MetadataView c;
    public final Handler d;
    public int e;
    public int f;
    ImageButton g;
    ImageButton h;
    ImageView i;
    ImageButton j;
    ImageButton k;
    ImageButton l;
    ImageButton[] m;
    FrameLayout n;
    public final Runnable o;
    public mlq p;
    private final Context s;
    private CrossfadeImageView t;
    private int u;
    private final ncp v;

    public MaterialUnCallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new oez(this, 7, null);
        this.s = context;
        this.d = new Handler(Looper.getMainLooper());
        this.v = new ncp(context);
        this.a = one.a().a();
        this.p = new mlq(null);
    }

    private final void g(View view, boolean z) {
        view.setEnabled(z);
        view.setAlpha(dvb.a(this.s.getResources(), true != z ? R.dimen.button_disabled_alpha : R.dimen.button_enabled_alpha));
    }

    private final void h() {
        ((ype) ((ype) r.f()).ai((char) 6047)).u("Stopping call duration updater.");
        this.d.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.onf
    public final void a() {
        h();
        this.b.a(false);
        this.t.b(this.u, false);
        hrt.c(getContext()).i(this.t.a);
        this.c.b();
    }

    @Override // defpackage.onf
    public final void b(one oneVar) {
        ImageButton[] imageButtonArr;
        int i;
        this.a = oneVar;
        int i2 = 0;
        this.t.b(this.u, false);
        boolean z = true;
        g(this.k, true);
        g(this.l, true);
        g(this.n, true);
        g(this.h, true);
        g(this.i, true);
        int i3 = 0;
        while (true) {
            imageButtonArr = this.m;
            int length = imageButtonArr.length;
            i = 4;
            if (i3 >= 4) {
                break;
            }
            g(imageButtonArr[i3], true);
            i3++;
        }
        int i4 = oneVar.k;
        int i5 = 3;
        int i6 = 2;
        if (i4 == 2) {
            one oneVar2 = this.a;
            boolean z2 = oneVar2.q;
            this.g = z2 ? imageButtonArr[0] : this.k;
            this.j = imageButtonArr[1];
            if (z2) {
                this.v.f(this.k, this.e, new ong(this, i6));
                i2 = 1;
            }
            ncp ncpVar = this.v;
            ncpVar.e(this.h, this.e, new ong(this, i5));
            ncpVar.i(this.g, this.e, this.f, new ong(this, i));
            ncpVar.g(this.j, this.e, this.f, new ong(this, 5));
            ArrayList arrayList = new ArrayList();
            if (oneVar2.d) {
                arrayList.add(this.j);
            }
            if (i2 != 0) {
                arrayList.add(this.g);
            }
            this.b.e(arrayList);
            this.b.c(this.n);
            MaterialInCallViewExpandingActionPanel materialInCallViewExpandingActionPanel = this.b;
            materialInCallViewExpandingActionPanel.d(materialInCallViewExpandingActionPanel.g);
            this.b.b(this.k);
        } else if (i4 != 3) {
            ((ype) r.l().ai((char) 6045)).w("Call state won't change. Unknown CallType:%d.", i4);
        } else {
            one oneVar3 = this.a;
            boolean z3 = oneVar3.q;
            this.g = z3 ? imageButtonArr[0] : this.k;
            ImageButton imageButton = imageButtonArr[1];
            this.j = imageButtonArr[2];
            if (z3) {
                this.v.f(this.k, this.e, new ong(this, 6));
                if (oneVar3.c) {
                    g(this.k, false);
                }
            } else {
                z = false;
            }
            ncp ncpVar2 = this.v;
            ncpVar2.j(this.l, this.e, new ong(this, 7));
            ncpVar2.i(this.g, this.e, this.f, new ong(this, 8));
            boolean z4 = oneVar3.c;
            if (z4) {
                g(this.g, false);
            }
            boolean z5 = oneVar3.n;
            if (z5) {
                ncpVar2.h(imageButton, this.e, new ong(this, 9));
            }
            ncpVar2.g(this.j, this.e, this.f, new ong(this, 10));
            ncpVar2.e(this.h, this.e, new ong(this, i2));
            if (z4) {
                g(this.h, false);
                g(this.i, false);
                g(this.n, false);
            }
            this.b.c(this.l);
            this.b.b(this.k);
            ArrayList arrayList2 = new ArrayList();
            if (z) {
                arrayList2.add(this.g);
            }
            if (oneVar3.d) {
                arrayList2.add(this.j);
            }
            if (z5) {
                arrayList2.add(imageButton);
            }
            arrayList2.add(this.n);
            this.b.e(arrayList2);
        }
        ImageButton imageButton2 = this.j;
        if (imageButton2 != null) {
            imageButton2.setActivated(oneVar.c);
        }
        this.h.setImageResource(oneVar.b);
        ImageButton imageButton3 = this.g;
        if (imageButton3 != null) {
            imageButton3.setActivated(oneVar.a);
        }
        h();
        if (oneVar.h) {
            ((ype) ((ype) r.f()).ai((char) 6046)).u("Starting call duration updater.");
            this.d.postDelayed(this.o, 1000L);
        }
        f(oneVar);
    }

    @Override // defpackage.onf
    public final boolean c() {
        return this.b.f.requestFocus();
    }

    @Override // defpackage.onf
    public final void d(mlq mlqVar) {
        if (mlqVar == null) {
            this.p = new mlq(null);
        } else {
            this.p = mlqVar;
        }
    }

    public final void e() throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_un_ar_icon_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        ImageButton[] imageButtonArr = new ImageButton[4];
        for (int i = 0; i < 4; i++) {
            ImageButton imageButton = new ImageButton(this.s, null, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel);
            imageButtonArr[i] = imageButton;
            imageButton.setLayoutParams(layoutParams);
        }
        this.m = new ImageButton[4];
        int i2 = 0;
        while (true) {
            ImageButton[] imageButtonArr2 = this.m;
            int length = imageButtonArr2.length;
            if (i2 >= 4) {
                this.k = imageButtonArr[1];
                this.l = imageButtonArr[2];
                FrameLayout frameLayout = (FrameLayout) inflate(this.s, R.layout.material_dialer_audio_route_selector, null);
                this.n = frameLayout;
                frameLayout.setId(R.id.expanding_action_panel_audio_route_button);
                this.n.setOnClickListener(new ong(this, 1));
                ImageButton imageButton2 = (ImageButton) this.n.findViewById(R.id.dialer_audio_route_button);
                this.h = imageButton2;
                imageButton2.setPadding(0, 0, 0, 0);
                this.h.setScaleType(ImageView.ScaleType.FIT_XY);
                ImageView imageView = (ImageView) this.n.findViewById(R.id.dialer_audio_route_chevron);
                this.i = imageView;
                imageView.setColorFilter(this.e, PorterDuff.Mode.SRC_IN);
                this.v.e(this.h, this.e, null);
                return;
            }
            imageButtonArr2[i2] = new ImageButton(this.s, null, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel);
            this.m[i2].setLayoutParams(layoutParams);
            i2++;
        }
    }

    public final void f(one oneVar) {
        String str;
        String strV = oneVar.c ? odn.a().v(getContext(), oneVar.g, oneVar.l) : oneVar.a ? odn.a().t(getContext(), oneVar.g, oneVar.l) : odn.a().x(getContext(), oneVar.g, oneVar.f, oneVar.l);
        String str2 = oneVar.e;
        lyv lyvVarA = lyw.a();
        lyvVarA.a = str2;
        lyvVarA.b = strV;
        lyvVarA.g = oneVar.i;
        lyvVarA.h = oneVar.j;
        lyvVarA.c(750L);
        Context context = this.s;
        Integer num = oneVar.p;
        String strN = mcd.A().n(context, num, oneVar.o);
        if (strN != null) {
            lyvVarA.c = strN;
            if (num != null) {
                lyvVarA.d(yfq.q(context.getDrawable(R.drawable.gs_group_vd_theme_20)));
            }
        } else if (odn.a().H(context) && (str = oneVar.m) != null) {
            lyvVarA.c = str;
        }
        this.c.e(lyvVarA.a());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.b.dispatchApplyWindowInsets(windowInsets);
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        Resources resources = getResources();
        Context context = this.s;
        this.e = resources.getColor(R.color.gearhead_sdk_tint_light, context.getTheme());
        e();
        this.t = (CrossfadeImageView) findViewById(R.id.un_contact_image);
        MetadataView metadataView = (MetadataView) inflate(context, R.layout.material_dialer_metadata_view, null);
        this.c = metadataView;
        metadataView.i(2);
        this.c.c(getResources().getDimensionPixelSize(R.dimen.metadata_material_small_image_size));
        MaterialInCallViewExpandingActionPanel materialInCallViewExpandingActionPanel = (MaterialInCallViewExpandingActionPanel) findViewById(R.id.expanding_action_panel);
        this.b = materialInCallViewExpandingActionPanel;
        materialInCallViewExpandingActionPanel.i = true;
        materialInCallViewExpandingActionPanel.d = yzz.PHONE_FACET;
        MetadataView metadataView2 = this.c;
        materialInCallViewExpandingActionPanel.h.removeAllViews();
        if (metadataView2 != null) {
            materialInCallViewExpandingActionPanel.h.addView(metadataView2);
        }
        this.b.b(this.k);
        this.b.c(this.l);
        this.b.setVisibility(0);
        int iA = org.a(getContext(), R.attr.gearheadCfAppBackground);
        this.u = iA;
        this.b.setBackgroundColor(iA);
        a();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return c() || super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.b.setBackgroundColor(i);
    }
}
