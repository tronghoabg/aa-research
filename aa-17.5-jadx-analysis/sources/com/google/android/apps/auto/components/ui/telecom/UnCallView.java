package com.google.android.apps.auto.components.ui.telecom;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.apps.auto.components.metadataview.MetadataView;
import com.google.android.apps.auto.components.ui.actionpanel.ExpandingActionPanel;
import com.google.android.apps.auto.components.ui.image.CrossfadeImageView;
import com.google.android.apps.auto.sdk.ui.FloatingActionButton;
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
import defpackage.onh;
import defpackage.org;
import defpackage.oxc;
import defpackage.yfq;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzz;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class UnCallView extends FrameLayout implements onf {
    public static final /* synthetic */ int n = 0;
    private static final yph o = yph.c("GH.UnCallView");
    public one a;
    ExpandingActionPanel b;
    public final Handler c;
    FloatingActionButton d;
    ImageButton e;
    ImageButton f;
    ImageButton g;
    ImageButton h;
    ImageButton i;
    ImageButton[] j;
    FrameLayout k;
    public final Runnable l;
    public mlq m;
    private MetadataView p;
    private final Context q;
    private CrossfadeImageView r;
    private int s;
    private int t;
    private final ncp u;

    public UnCallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new oez(this, 8, null);
        this.q = context;
        this.c = new Handler(Looper.getMainLooper());
        this.u = new ncp(context);
        this.a = one.a().a();
        this.m = new mlq(null);
    }

    private final void f(View view, boolean z) {
        view.setEnabled(z);
        view.setAlpha(dvb.a(this.q.getResources(), true != z ? R.dimen.button_disabled_alpha : R.dimen.button_enabled_alpha));
    }

    private final void g() {
        ((ype) ((ype) o.f()).ai((char) 6051)).u("Stopping call duration updater.");
        this.c.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.onf
    public final void a() {
        g();
        this.b.b(false);
        this.r.b(this.s, false);
        hrt.c(getContext()).i(this.r.a);
        this.p.b();
    }

    @Override // defpackage.onf
    public final void b(one oneVar) {
        ImageButton[] imageButtonArr;
        boolean z;
        this.a = oneVar;
        int i = 0;
        this.r.b(this.s, false);
        int i2 = 1;
        f(this.h, true);
        f(this.i, true);
        f(this.k, true);
        f(this.f, true);
        int i3 = 0;
        while (true) {
            imageButtonArr = this.j;
            int length = imageButtonArr.length;
            if (i3 >= 4) {
                break;
            }
            f(imageButtonArr[i3], true);
            i3++;
        }
        int i4 = oneVar.k;
        if (i4 == 2) {
            one oneVar2 = this.a;
            boolean z2 = oneVar2.q;
            this.e = z2 ? imageButtonArr[0] : this.h;
            this.g = imageButtonArr[1];
            if (z2) {
                this.u.f(this.h, this.t, new ong(this, 11));
            } else {
                i2 = 0;
            }
            ncp ncpVar = this.u;
            ncpVar.e(this.f, this.t, new ong(this, 14));
            ncpVar.i(this.e, this.t, 0, new ong(this, 15));
            ncpVar.g(this.g, this.t, 0, new ong(this, 16));
            ArrayList arrayList = new ArrayList();
            if (oneVar2.d) {
                arrayList.add(this.g);
            }
            if (i2 != 0) {
                arrayList.add(this.e);
            }
            this.b.a(arrayList, false);
            this.b.e(this.k);
            this.b.d(this.h);
        } else if (i4 != 3) {
            ((ype) o.l().ai((char) 6049)).w("Call state won't change. Unknown CallType:%d.", i4);
        } else {
            one oneVar3 = this.a;
            boolean z3 = oneVar3.q;
            this.e = z3 ? imageButtonArr[0] : this.h;
            ImageButton imageButton = imageButtonArr[1];
            this.g = imageButtonArr[2];
            if (z3) {
                this.u.f(this.h, this.t, new ong(this, 17));
                if (oneVar3.c) {
                    f(this.h, false);
                }
                z = true;
            } else {
                z = false;
            }
            ncp ncpVar2 = this.u;
            ncpVar2.j(this.i, this.t, new ong(this, 18));
            ncpVar2.i(this.e, this.t, 0, new ong(this, 19));
            boolean z4 = oneVar3.c;
            if (z4) {
                f(this.e, false);
            }
            boolean z5 = oneVar3.n;
            if (z5) {
                ncpVar2.h(imageButton, this.t, new ong(this, 20));
            }
            ncpVar2.g(this.g, this.t, 0, new onh(this, i2));
            ncpVar2.e(this.f, this.t, new onh(this, i));
            if (z4) {
                f(this.f, false);
                f(this.k, false);
            }
            this.b.e(this.i);
            this.b.d(this.h);
            ArrayList arrayList2 = new ArrayList();
            if (z) {
                arrayList2.add(this.e);
            }
            if (oneVar3.d) {
                arrayList2.add(this.g);
            }
            if (z5) {
                arrayList2.add(imageButton);
            }
            arrayList2.add(this.k);
            this.b.a(arrayList2, false);
        }
        ImageButton imageButton2 = this.g;
        if (imageButton2 != null) {
            imageButton2.setActivated(oneVar.c);
        }
        this.f.setImageDrawable(this.q.getDrawable(oneVar.b));
        ImageButton imageButton3 = this.e;
        if (imageButton3 != null) {
            imageButton3.setActivated(oneVar.a);
        }
        g();
        if (oneVar.h) {
            ((ype) ((ype) o.f()).ai((char) 6050)).u("Starting call duration updater.");
            this.c.postDelayed(this.l, 1000L);
        }
        e(oneVar);
    }

    @Override // defpackage.onf
    public final boolean c() {
        return this.b.g();
    }

    @Override // defpackage.onf
    public final void d(mlq mlqVar) {
        if (mlqVar == null) {
            this.m = new mlq(null);
        } else {
            this.m = mlqVar;
        }
    }

    public final void e(one oneVar) {
        String str;
        String strV = oneVar.c ? odn.a().v(getContext(), oneVar.g, null) : oneVar.a ? odn.a().t(getContext(), oneVar.g, null) : odn.a().x(getContext(), oneVar.g, oneVar.f, null);
        String str2 = oneVar.e;
        lyv lyvVarA = lyw.a();
        lyvVarA.a = str2;
        lyvVarA.b = strV;
        lyvVarA.g = oneVar.i;
        lyvVarA.h = oneVar.j;
        lyvVarA.c(750L);
        lyvVarA.f = oneVar.l;
        Context context = this.q;
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
        this.p.e(lyvVarA.a());
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
        Context context = this.q;
        this.t = resources.getColor(R.color.gearhead_sdk_tint_light, context.getTheme());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.un_ar_icon_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        ImageButton[] imageButtonArr = new ImageButton[4];
        for (int i = 0; i < 4; i++) {
            ImageButton imageButton = new ImageButton(context, null, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel);
            imageButtonArr[i] = imageButton;
            imageButton.setLayoutParams(layoutParams);
        }
        this.j = new ImageButton[4];
        int i2 = 0;
        while (true) {
            ImageButton[] imageButtonArr2 = this.j;
            int length = imageButtonArr2.length;
            if (i2 >= 4) {
                this.h = imageButtonArr[1];
                this.i = imageButtonArr[2];
                this.d = (FloatingActionButton) inflate(context, R.layout.end_call_fab, null);
                oxc oxcVar = new oxc(context);
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.declineCallBackgroundColor, typedValue, true);
                oxcVar.b(typedValue.data);
                this.d.setBackground(oxcVar);
                this.d.setOnClickListener(new ong(this, 12));
                this.d.setFocusable(true);
                FrameLayout frameLayout = (FrameLayout) inflate(context, R.layout.dialer_audio_route_selector, null);
                this.k = frameLayout;
                frameLayout.setOnClickListener(new ong(this, 13));
                ImageButton imageButton2 = (ImageButton) this.k.findViewById(R.id.dialer_audio_route_button);
                this.f = imageButton2;
                this.u.e(imageButton2, this.t, null);
                this.r = (CrossfadeImageView) findViewById(R.id.un_contact_image);
                MetadataView metadataView = (MetadataView) inflate(context, R.layout.metadata_view, null);
                this.p = metadataView;
                metadataView.i(2);
                this.p.c(getResources().getDimensionPixelSize(R.dimen.metadata_coolwalk_small_image_size));
                ExpandingActionPanel expandingActionPanel = (ExpandingActionPanel) findViewById(R.id.expanding_action_panel);
                this.b = expandingActionPanel;
                expandingActionPanel.k = true;
                expandingActionPanel.e = yzz.PHONE_FACET;
                expandingActionPanel.f(this.p);
                this.b.d(this.h);
                this.b.c(this.d);
                this.b.e(this.i);
                this.b.setVisibility(0);
                int iA = org.a(getContext(), R.attr.gearheadCfAppBackground);
                this.s = iA;
                this.b.setBackgroundColor(iA);
                a();
                return;
            }
            imageButtonArr2[i2] = new ImageButton(context, null, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel);
            this.j[i2].setLayoutParams(layoutParams);
            i2++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return c() || super.onRequestFocusInDescendants(i, rect);
    }
}
