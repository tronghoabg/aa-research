package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Row;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.projection.gearhead.R;
import defpackage.actj;
import defpackage.ajhf;
import defpackage.ajmd;
import defpackage.gec;
import defpackage.geu;
import defpackage.ghu;
import defpackage.ghv;
import defpackage.ghw;
import defpackage.gsc;
import defpackage.him;
import defpackage.hlr;
import defpackage.hlu;
import defpackage.hmb;
import defpackage.hmd;
import defpackage.isq;
import defpackage.jxe;
import defpackage.jxt;
import defpackage.jxv;
import defpackage.jxx;
import defpackage.kdt;
import defpackage.keg;
import defpackage.kex;
import defpackage.lbh;
import defpackage.leh;
import defpackage.lgv;
import defpackage.lub;
import defpackage.lvd;
import defpackage.lwb;
import defpackage.lwo;
import defpackage.lwq;
import defpackage.lwr;
import defpackage.lwz;
import defpackage.lxr;
import defpackage.lyl;
import defpackage.lyn;
import defpackage.map;
import defpackage.mpz;
import defpackage.ncp;
import defpackage.odn;
import defpackage.ogz;
import defpackage.ohe;
import defpackage.roc;
import defpackage.sw;
import defpackage.tj;
import defpackage.whg;
import defpackage.ycm;
import defpackage.yfq;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzy;
import defpackage.yzz;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MaterialRowView extends LinearLayout {
    public static final yph a = yph.c("CarApp.H.Tem");
    public FrameLayout A;
    public TextView B;
    public LinearLayout C;
    public CarTextView D;
    public FrameLayout E;
    public ImageView F;
    public LinearLayout G;
    public LinearLayout H;
    public ImageView I;
    public TextView J;
    public View K;
    public geu L;
    public boolean M;
    public ActionButtonListView N;
    public ajmd O;
    private final int P;
    private final int Q;
    private final int R;
    private final int S;
    private final int T;
    private final int U;
    private final int V;
    private final int W;
    private final int aa;
    private ncp ab;
    private kex ac;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final hmb k;
    final int l;
    public final hmb m;
    public final Drawable n;
    public final int o;
    public final int p;
    public final int q;
    public final float r;
    public final float s;
    public LinearLayout t;
    public FrameLayout u;
    public ConstraintLayout v;
    public MaterialSwitch w;
    public LinearLayout x;
    public ShapeableImageView y;
    public FrameLayout z;

    public MaterialRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateRowIconSize, R.attr.templateRowImageSizeSmall, R.attr.templateRowImageSizeLarge, R.attr.templateRowDefaultIconTint, R.attr.templateRowSelectedTextAppearance, R.attr.templateRowImagePlaceholder, R.attr.templateRowTextHorizontalPadding, R.attr.templateRowTextHorizontalHalfPadding, R.attr.templateRowHorizontalNoItemsTextPadding, R.attr.templateRowTextDisabledColor, R.attr.templateRowImageDisabledOpacity, R.attr.templateRowActionButtonDefaultBackgroundColor, R.attr.templateRowTextReadColor, R.attr.templateRowRadioButtonColor, R.attr.templateRowRadioButtonDisabledColor, R.attr.templateRowRadioButtonUncheckedColor, R.attr.templateRowTextUnreadColor, R.attr.templateRowActionContainerGravityTopMarginTop, R.attr.templateRowImageSizeExtraSmall, R.attr.templateRowTitleEnabledColor, R.attr.templateRowSecondaryActionDefaultIconTint, R.attr.templateRowSelectionContainerHeight, R.attr.templateRowContainerGravityTopHeight, R.attr.templateRowContainerGravityCenterVerticalHeight, R.attr.templateRowConversationTextPrimaryColor, R.attr.templateRowConversationTextSecondaryColor, R.attr.templateMaterialToggleThumbTint, R.attr.templateMaterialToggleTrackTint, R.attr.templateMaterialToggleTrackDecorationTint});
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        this.f = color;
        this.l = typedArrayObtainStyledAttributes.getResourceId(4, -1);
        this.n = typedArrayObtainStyledAttributes.getDrawable(5);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.r = typedArrayObtainStyledAttributes.getFloat(10, BitmapDescriptorFactory.HUE_RED);
        this.s = typedArrayObtainStyledAttributes.getFloat(10, BitmapDescriptorFactory.HUE_RED);
        this.j = typedArrayObtainStyledAttributes.getColor(11, 0);
        this.P = typedArrayObtainStyledAttributes.getColor(12, 0);
        this.V = typedArrayObtainStyledAttributes.getColor(13, 0);
        this.W = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.aa = typedArrayObtainStyledAttributes.getColor(15, 0);
        this.Q = typedArrayObtainStyledAttributes.getColor(16, 0);
        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, 0);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, -1);
        this.g = typedArrayObtainStyledAttributes.getColor(19, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(20, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(21, 0);
        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(23, 0);
        this.R = typedArrayObtainStyledAttributes.getColor(24, 0);
        this.S = typedArrayObtainStyledAttributes.getColor(25, 0);
        typedArrayObtainStyledAttributes.recycle();
        hmb hmbVar = hmb.a;
        ghw ghwVar = ghw.b;
        this.k = new hmb(color, false, false, ghwVar, null, false, 0);
        this.m = new hmb(color2, true, false, ghwVar, null, false, 0);
    }

    public static void c(geu geuVar, ConversationItem conversationItem, String str) {
        geuVar.t().i(conversationItem.getConversationCallbackDelegate(), str);
    }

    public static void e(geu geuVar, int i) {
        geuVar.y().a(geuVar.getString(i), 0);
    }

    public static boolean k(geu geuVar, Row row) {
        if (geuVar.i().c() < 6) {
            return false;
        }
        List<Action> actions = row.getActions();
        if (actions.isEmpty()) {
            return false;
        }
        int size = actions.size();
        int i = ghu.d.e;
        if (size < i) {
            return true;
        }
        ((ype) ((ype) a.h()).ai((char) 2944)).w("Exceeded the maximum number of actions allowed for this row: %d", i);
        return true;
    }

    public static final boolean l(View view) {
        return view.getVisibility() == 0;
    }

    public static final void m(CarTextView carTextView, int i) {
        if (i > 0) {
            carTextView.c(i);
        }
    }

    public static final void n(ConversationItem conversationItem, String str) {
        if (actj.w()) {
            ogz ogzVarV = v(conversationItem, str);
            if (ogzVarV == null) {
                return;
            } else {
                ogzVarV.a();
            }
        }
        ohe oheVarW = w(conversationItem, str);
        if (oheVarW != null) {
            oheVarW.g();
        }
    }

    public static final void o(View view, int i, int i2) {
        if (l(view)) {
            if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.getClass();
                layoutParams.height = i;
                layoutParams.gravity = i2;
                view.setLayoutParams(layoutParams);
                return;
            }
            if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams2.getClass();
                layoutParams2.height = i;
                layoutParams2.gravity = i2;
                view.setLayoutParams(layoutParams2);
            }
        }
    }

    public static void p(yzy yzyVar, whg whgVar) {
        lxr.e();
        lxr.f(((lub) whgVar.c).h, yzyVar, (ComponentName) whgVar.b);
    }

    private final void q(CarTextView carTextView, boolean z) {
        if (z) {
            carTextView.setTextColor(this.Q);
            carTextView.setTypeface(Typeface.create(null, 500, false));
        } else {
            carTextView.setTextColor(this.P);
            carTextView.setTypeface(Typeface.DEFAULT);
        }
    }

    private final void r(CarTextView carTextView, boolean z, boolean z2) {
        if (z2) {
            carTextView.setTextColor(this.R);
            carTextView.setTypeface(Typeface.create(carTextView.getTypeface(), 700, false));
        } else {
            if (z) {
                carTextView.setTextColor(this.R);
            } else {
                carTextView.setTextColor(this.S);
            }
            carTextView.setTypeface(Typeface.DEFAULT);
        }
    }

    private final void s(boolean z, List list) {
        if (!z) {
            Stream map = Collection.EL.stream(list).map(new jxe(16));
            int i = yfq.d;
            list = (List) map.collect(ycm.a);
        }
        ajhf ajhfVar = new ajhf(null);
        ajhfVar.c = 3;
        ajhfVar.b = false;
        ajhfVar.d();
        ajhfVar.e();
        hlr hlrVarC = ajhfVar.c();
        ActionButtonListView actionButtonListView = this.N;
        actionButtonListView.getClass();
        actionButtonListView.b(this.L, list, hlrVarC);
        ActionButtonListView actionButtonListView2 = this.N;
        actionButtonListView2.getClass();
        actionButtonListView2.setVisibility(0);
    }

    private static whg t(geu geuVar) {
        jxv.a();
        return jxv.f(geuVar, null, false);
    }

    private final void u(lwr lwrVar, yzy yzyVar, whg whgVar) {
        yzz yzzVar = ((lub) whgVar.c).h;
        if (!lwrVar.d(yzzVar) && this.M) {
            lwrVar.c(yzzVar);
            p(yzyVar, whgVar);
        }
    }

    private static ogz v(ConversationItem conversationItem, String str) {
        if (!actj.w()) {
            return null;
        }
        return lyl.a().b(new lwb(str, conversationItem.getId()));
    }

    private static ohe w(ConversationItem conversationItem, String str) {
        return lyn.a().b(new lwb(str, conversationItem.getId()));
    }

    public final CarIcon a(Context context, boolean z, boolean z2) {
        int i = z ? R.drawable.radio_button_checked : R.drawable.radio_button_unchecked;
        int i2 = z2 ? z ? this.V : this.aa : this.W;
        tj tjVar = new tj(IconCompat.m(context, i));
        tjVar.a(CarColor.createCustom(i2, i2));
        return new CarIcon(tjVar);
    }

    public final CarTextView b(geu geuVar, CarText carText, ConversationItem conversationItem, boolean z, boolean z2) {
        CarTextView carTextView = (CarTextView) LayoutInflater.from(getContext()).inflate(R.layout.row_view_secondary_text, (ViewGroup) null);
        if (!z2) {
            carTextView.setAlpha(this.r);
        }
        hlu hluVar = new hlu();
        hluVar.a = z ? ghv.a : ghv.c;
        hluVar.d = 10;
        hluVar.c = new Rect(0, 0, (int) carTextView.getTextSize(), (int) carTextView.getTextSize());
        hluVar.e = carTextView.getCurrentTextColor();
        carTextView.b(geuVar, carText, hluVar.a());
        if (conversationItem != null) {
            carTextView.setSingleLine();
        }
        this.t.addView(carTextView);
        return carTextView;
    }

    public final void d(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.t.getLayoutParams();
        layoutParams.getClass();
        layoutParams.gravity = i;
        this.t.setLayoutParams(layoutParams);
    }

    public final void f(geu geuVar, boolean z, List list, gsc gscVar, ConversationItem conversationItem, List list2) {
        ConversationItem conversationItem2;
        List listB = lwr.b(list2, actj.b(), (int) actj.d());
        Action actionA = null;
        if (listB.isEmpty()) {
            conversationItem2 = conversationItem;
        } else {
            lwr lwrVar = (lwr) listB.get(0);
            lwq lwqVar = lwrVar.a;
            int iOrdinal = lwqVar.ordinal();
            if (iOrdinal == 1 || iOrdinal == 3) {
                whg whgVarT = t(geuVar);
                u(lwrVar, yzy.KW, whgVarT);
                sw swVar = new sw();
                swVar.e(geuVar.getString(R.string.smart_reply_action, new Object[]{lwrVar.b}));
                conversationItem2 = conversationItem;
                swVar.d(new kdt(geuVar, conversationItem2, lwrVar, whgVarT, 0));
                actionA = swVar.a();
            } else {
                int i = 7;
                if (iOrdinal != 4) {
                    int i2 = 6;
                    if (iOrdinal == 5) {
                        ComponentName componentNameA = lgv.a().a(mpz.b);
                        if (componentNameA != null && componentNameA.getPackageName() != null && (actj.z() || map.b(componentNameA))) {
                            whg whgVarT2 = t(geuVar);
                            u(lwrVar, yzy.Lb, whgVarT2);
                            sw swVar2 = new sw();
                            swVar2.c(new CarIcon(new tj(IconCompat.m(geuVar, 2131233134))));
                            swVar2.e(lwrVar.b);
                            swVar2.d(new jxx(lwrVar, whgVarT2, conversationItem, i2));
                            actionA = swVar2.a();
                        }
                    } else if (iOrdinal == 6) {
                        whg whgVarT3 = t(geuVar);
                        u(lwrVar, yzy.KY, whgVarT3);
                        sw swVar3 = new sw();
                        swVar3.c(new CarIcon(new tj(IconCompat.m(geuVar, 2131233094))));
                        swVar3.e(conversationItem.isGroupConversation() ? lwrVar.b : geuVar.getString(R.string.call_smart_action));
                        swVar3.d(new jxx(lwrVar, whgVarT3, conversationItem, 9));
                        actionA = swVar3.a();
                    } else {
                        if (iOrdinal != 7) {
                            throw new IllegalArgumentException("Invalid smartActionType: ".concat(lwqVar.toString()));
                        }
                        whg whgVarT4 = t(geuVar);
                        String str = lwrVar.d.a;
                        str.getClass();
                        u(lwrVar, yzy.KX, whgVarT4);
                        sw swVar4 = new sw();
                        swVar4.c(new CarIcon(new tj(IconCompat.m(geuVar, 2131233094))));
                        swVar4.e(odn.a().r(geuVar, str));
                        swVar4.d(new jxx(str, whgVarT4, conversationItem, 8));
                        actionA = swVar4.a();
                    }
                } else if (roc.X()) {
                    whg whgVarT5 = t(geuVar);
                    u(lwrVar, yzy.La, whgVarT5);
                    sw swVar5 = new sw();
                    swVar5.c(new CarIcon(new tj(IconCompat.m(geuVar, 2131233152))));
                    swVar5.e(geuVar.getString(R.string.share_eta_smart_action));
                    swVar5.d(new jxx(whgVarT5, geuVar, conversationItem, 10));
                    actionA = swVar5.a();
                } else if (lbh.c().b() != null) {
                    whg whgVarT6 = t(geuVar);
                    u(lwrVar, yzy.KZ, whgVarT6);
                    sw swVar6 = new sw();
                    swVar6.c(new CarIcon(new tj(IconCompat.m(geuVar, 2131233132))));
                    swVar6.e(geuVar.getString(R.string.share_location_smart_action_verbose));
                    swVar6.d(new jxx(whgVarT6, geuVar, conversationItem, i));
                    actionA = swVar6.a();
                }
                conversationItem2 = conversationItem;
            }
        }
        if (actionA == null) {
            actionA = gscVar.a(conversationItem2);
        }
        list.add(1, actionA);
        s(z, list);
    }

    public final void g(geu geuVar, him himVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        gsc gscVar = (gsc) geuVar.l(gsc.class);
        gscVar.getClass();
        ConversationItem conversationItem = himVar.k;
        conversationItem.getClass();
        jxv.a();
        String packageName = ((ComponentName) jxv.f(geuVar, null, false).b).getPackageName();
        ohe oheVarW = w(conversationItem, packageName);
        ogz ogzVarV = v(conversationItem, packageName);
        arrayList.add(gscVar.b(conversationItem));
        boolean zAnyMatch = Collection.EL.stream(conversationItem.getMessages()).anyMatch(new hmd(15));
        if (leh.a().b()) {
            r((CarTextView) findViewById(R.id.row_title), true, zAnyMatch);
            r((CarTextView) findViewById(R.id.row_secondary_title), true, zAnyMatch);
            r((CarTextView) this.t.getChildAt(1), false, zAnyMatch);
        } else {
            q((CarTextView) findViewById(R.id.row_title), zAnyMatch);
            q((CarTextView) findViewById(R.id.row_secondary_title), zAnyMatch);
            q((CarTextView) this.t.getChildAt(1), zAnyMatch);
        }
        if (ogzVarV != null) {
            kex kexVar = this.ac;
            if (kexVar != null) {
                kexVar.f();
                this.ac = null;
            }
            kex kexVar2 = new kex((lwb) ogzVarV.a, new isq(this, geuVar, himVar, z, 4));
            this.ac = kexVar2;
            kexVar2.e();
        }
        ncp ncpVar = this.ab;
        if (ncpVar != null) {
            ncpVar.p();
            this.ab = null;
        }
        if (oheVarW != null && !actj.w()) {
            ncp ncpVar2 = new ncp((lwb) oheVarW.b, new isq(this, geuVar, himVar, z, 5));
            this.ab = ncpVar2;
            ncpVar2.o();
        }
        if (actj.p() && oheVarW != null && !actj.w()) {
            sw swVar = new sw();
            swVar.d(new gec(oheVarW, 13));
            swVar.c(new CarIcon(new tj(IconCompat.m(this.L, true != oheVarW.i() ? 2131233136 : 2131233135))));
            arrayList.add(swVar.a());
        }
        if (actj.p() && ogzVarV != null && !actj.w()) {
            sw swVar2 = new sw();
            swVar2.d(new gec(ogzVarV, 14));
            swVar2.c(new CarIcon(new tj(IconCompat.m(this.L, true == ogzVarV.c() ? 2131233135 : 2131233136))));
            arrayList.add(swVar2.a());
        }
        arrayList.addAll(conversationItem.getActions());
        if (!lwo.a().b(conversationItem)) {
            arrayList.add(1, gscVar.a(conversationItem));
            s(z, arrayList);
        } else if (oheVarW != null) {
            f(geuVar, z, arrayList, gscVar, conversationItem, ((lwz) oheVarW.a).n());
        } else {
            lwo.a().d(lvd.c().d(packageName, jxt.c(geuVar, conversationItem), null, null), (int) actj.d()).fE(geuVar.c().a(), new keg(this, geuVar, z, arrayList, gscVar, conversationItem, 1));
        }
    }

    public final void h(boolean z) {
        if (l(this.G)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G.getLayoutParams();
            layoutParams.getClass();
            if (z) {
                layoutParams.height = this.U;
                layoutParams.topMargin = this.T;
                layoutParams.gravity = 48;
            } else {
                layoutParams.height = -1;
                layoutParams.topMargin = 0;
                layoutParams.gravity = 16;
            }
            this.G.setLayoutParams(layoutParams);
        }
    }

    public final void i(View view) {
        o(view, this.U, 48);
    }

    public final void j(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.y.getLayoutParams();
        layoutParams.getClass();
        layoutParams.gravity = i;
        this.y.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ncp ncpVar = this.ab;
        if (ncpVar != null) {
            ncpVar.p();
            this.ab = null;
        }
        kex kexVar = this.ac;
        if (kexVar != null) {
            kexVar.f();
            this.ac = null;
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.t = (LinearLayout) findViewById(R.id.row_text_container);
        this.u = (FrameLayout) findViewById(R.id.row_toggle_container);
        this.w = (MaterialSwitch) findViewById(R.id.row_toggle);
        this.E = (FrameLayout) findViewById(R.id.row_radio_button_container);
        this.F = (ImageView) findViewById(R.id.row_radio_button);
        this.x = (LinearLayout) findViewById(R.id.row_image_container);
        this.y = (ShapeableImageView) findViewById(R.id.row_image);
        this.v = (ConstraintLayout) findViewById(R.id.row_view_title);
        this.z = (FrameLayout) findViewById(R.id.row_decoration_container);
        this.A = (FrameLayout) findViewById(R.id.new_row_decoration_container);
        this.B = (TextView) findViewById(R.id.new_row_decoration_text);
        this.C = (LinearLayout) findViewById(R.id.row_caret_container);
        this.G = (LinearLayout) findViewById(R.id.row_action_container);
        this.H = (LinearLayout) findViewById(R.id.row_action_button);
        this.I = (ImageView) findViewById(R.id.row_action_button_icon);
        this.J = (TextView) findViewById(R.id.row_action_button_text);
        this.N = (ActionButtonListView) findViewById(R.id.row_action_button_list_view);
        this.K = findViewById(R.id.row_view_secondary_content_container);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int minimumHeight = getMinimumHeight();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            int i6 = i4 - i2 <= minimumHeight ? 16 : 48;
            View childAt = getChildAt(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.gravity = i6;
            childAt.setLayoutParams(layoutParams);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        this.M = i == 0;
        super.onWindowVisibilityChanged(i);
    }

    public MaterialRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialRowView(Context context) {
        this(context, null);
    }
}
