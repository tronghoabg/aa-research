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
import android.widget.Switch;
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
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.actj;
import defpackage.ajhf;
import defpackage.ajmd;
import defpackage.gec;
import defpackage.geu;
import defpackage.ghu;
import defpackage.ghv;
import defpackage.ghw;
import defpackage.gsc;
import defpackage.hbz;
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
import defpackage.lgv;
import defpackage.lub;
import defpackage.lvd;
import defpackage.lvi;
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
public class RowView extends LinearLayout {
    public static final yph a = yph.c("CarApp.H.Tem");
    public LinearLayout A;
    public ImageView B;
    public TextView C;
    public View D;
    public geu E;
    public boolean F;
    public ActionButtonListView G;
    public ajmd H;
    private final int I;
    private final int J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private final int Q;
    private final int R;
    private ncp S;
    private kex T;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    final int h;
    public final hmb i;
    public final Drawable j;
    public final int k;
    public final int l;
    public final float m;
    public LinearLayout n;
    public FrameLayout o;
    public ConstraintLayout p;
    public Switch q;
    public ShapeableImageView r;
    public FrameLayout s;
    public FrameLayout t;
    public TextView u;
    public ImageView v;
    public CarTextView w;
    public FrameLayout x;
    public ImageView y;
    public LinearLayout z;

    public RowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateRowIconSize, R.attr.templateRowImageSizeSmall, R.attr.templateRowImageSizeLarge, R.attr.templateRowDefaultIconTint, R.attr.templateRowSelectedTextAppearance, R.attr.templateRowImagePlaceholder, R.attr.templateRowTextHorizontalPadding, R.attr.templateRowTextHorizontalHalfPadding, R.attr.templateRowTextDisabledColor, R.attr.templateRowImageDisabledOpacity, R.attr.templateRowRadioButtonColor, R.attr.templateRowRadioButtonDisabledColor, R.attr.templateRowRadioButtonUncheckedColor, R.attr.templateRowActionButtonDefaultBackgroundColor, R.attr.templateRowTextReadColor, R.attr.templateRowTextUnreadColor, R.attr.templateRowActionGravityTopMinimumHeightThreshold, R.attr.templateRowActionGravityTopMarginTop, R.attr.templateRowImageSizeExtraSmall, R.attr.templateRowExtraSmallImageTopMargin, R.attr.templateRowTitleEnabledColor});
        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        this.b = color;
        this.h = typedArrayObtainStyledAttributes.getResourceId(4, -1);
        this.j = typedArrayObtainStyledAttributes.getDrawable(5);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.d = typedArrayObtainStyledAttributes.getColor(8, 0);
        this.m = typedArrayObtainStyledAttributes.getFloat(9, BitmapDescriptorFactory.HUE_RED);
        this.P = typedArrayObtainStyledAttributes.getColor(10, 0);
        this.Q = typedArrayObtainStyledAttributes.getColor(11, 0);
        this.R = typedArrayObtainStyledAttributes.getColor(12, 0);
        this.g = typedArrayObtainStyledAttributes.getColor(13, 0);
        this.N = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.O = typedArrayObtainStyledAttributes.getColor(15, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, 0);
        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, -1);
        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0);
        this.c = typedArrayObtainStyledAttributes.getColor(20, -1);
        typedArrayObtainStyledAttributes.recycle();
        hmb hmbVar = hmb.a;
        this.i = new hmb(color, false, false, ghw.b, null, false, 0);
    }

    public static void d(geu geuVar, ConversationItem conversationItem, String str) {
        geuVar.t().i(conversationItem.getConversationCallbackDelegate(), str);
    }

    public static void f(geu geuVar, int i) {
        geuVar.y().a(geuVar.getString(i), 0);
    }

    public static boolean j(geu geuVar, Row row) {
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
        ((ype) ((ype) a.h()).ai((char) 2962)).w("Exceeded the maximum number of actions allowed for this row: %d", i);
        return true;
    }

    public static final void l(ConversationItem conversationItem, String str) {
        if (actj.w()) {
            ogz ogzVarR = r(conversationItem, str);
            if (ogzVarR == null) {
                return;
            } else {
                ogzVarR.a();
            }
        }
        ohe oheVarS = s(conversationItem, str);
        if (oheVarS != null) {
            oheVarS.g();
        }
    }

    public static void m(yzy yzyVar, whg whgVar) {
        lxr.e();
        lxr.f(((lub) whgVar.c).h, yzyVar, (ComponentName) whgVar.b);
    }

    private final void n(CarTextView carTextView, boolean z) {
        if (z) {
            carTextView.setTextColor(this.O);
            carTextView.setTypeface(Typeface.create(null, 500, false));
        } else {
            carTextView.setTextColor(this.N);
            carTextView.setTypeface(Typeface.DEFAULT);
        }
    }

    private final void o(boolean z, List list) {
        if (!z) {
            Stream map = Collection.EL.stream(list).map(new jxe(17));
            int i = yfq.d;
            list = (List) map.collect(ycm.a);
        }
        ajhf ajhfVar = new ajhf(null);
        ajhfVar.c = 3;
        ajhfVar.b = false;
        ajhfVar.d();
        ajhfVar.e();
        hlr hlrVarC = ajhfVar.c();
        ActionButtonListView actionButtonListView = this.G;
        actionButtonListView.getClass();
        actionButtonListView.b(this.E, list, hlrVarC);
        ActionButtonListView actionButtonListView2 = this.G;
        actionButtonListView2.getClass();
        actionButtonListView2.setVisibility(0);
    }

    private static whg p(geu geuVar) {
        jxv.a();
        return jxv.f(geuVar, null, false);
    }

    private final void q(lwr lwrVar, yzy yzyVar, whg whgVar) {
        yzz yzzVar = ((lub) whgVar.c).h;
        if (!lwrVar.d(yzzVar) && this.F) {
            lwrVar.c(yzzVar);
            m(yzyVar, whgVar);
        }
    }

    private static ogz r(ConversationItem conversationItem, String str) {
        if (!actj.w()) {
            return null;
        }
        return lyl.a().b(new lwb(str, conversationItem.getId()));
    }

    private static ohe s(ConversationItem conversationItem, String str) {
        return lyn.a().b(new lwb(str, conversationItem.getId()));
    }

    public final CarIcon a(Context context, boolean z, boolean z2) {
        int i = z ? 2131233547 : 2131233548;
        int i2 = z2 ? z ? this.P : this.R : this.Q;
        tj tjVar = new tj(IconCompat.m(context, i));
        tjVar.a(CarColor.createCustom(i2, i2));
        return new CarIcon(tjVar);
    }

    public final CarTextView b(geu geuVar, CarText carText, ConversationItem conversationItem, boolean z, boolean z2) {
        CarTextView carTextView = (CarTextView) LayoutInflater.from(getContext()).inflate(R.layout.row_view_secondary_text, (ViewGroup) null);
        if (!z2) {
            carTextView.setTextColor(this.d);
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
        this.n.addView(carTextView);
        return carTextView;
    }

    public final void c(CarTextView carTextView, int i) {
        if (i > 0) {
            carTextView.c(i);
        }
    }

    public final void e(boolean z, boolean z2) {
        if (this.x.getVisibility() == 0) {
            ImageView imageView = this.y;
            geu geuVar = this.E;
            hbz.j(geuVar, a(geuVar, z, z2), imageView, this.i);
        }
        CarTextView carTextView = this.w;
        if (carTextView != null) {
            carTextView.setVisibility(true != z ? 8 : 0);
        }
    }

    public final void g(geu geuVar, boolean z, List list, gsc gscVar, ConversationItem conversationItem, List list2) {
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
                whg whgVarP = p(geuVar);
                q(lwrVar, yzy.KW, whgVarP);
                sw swVar = new sw();
                swVar.e(geuVar.getString(R.string.smart_reply_action, new Object[]{lwrVar.b}));
                conversationItem2 = conversationItem;
                swVar.d(new kdt(geuVar, conversationItem2, lwrVar, whgVarP, 2));
                actionA = swVar.a();
            } else {
                if (iOrdinal != 4) {
                    if (iOrdinal == 5) {
                        ComponentName componentNameA = lgv.a().a(mpz.b);
                        if (componentNameA != null && componentNameA.getPackageName() != null && (actj.z() || map.b(componentNameA))) {
                            whg whgVarP2 = p(geuVar);
                            q(lwrVar, yzy.Lb, whgVarP2);
                            sw swVar2 = new sw();
                            swVar2.c(new CarIcon(new tj(IconCompat.m(geuVar, 2131233134))));
                            swVar2.e(lwrVar.b);
                            swVar2.d(new jxx(lwrVar, whgVarP2, conversationItem, 11));
                            actionA = swVar2.a();
                        }
                    } else if (iOrdinal == 6) {
                        whg whgVarP3 = p(geuVar);
                        q(lwrVar, yzy.KY, whgVarP3);
                        sw swVar3 = new sw();
                        swVar3.c(new CarIcon(new tj(IconCompat.m(geuVar, 2131233094))));
                        swVar3.e(conversationItem.isGroupConversation() ? lwrVar.b : geuVar.getString(R.string.call_smart_action));
                        swVar3.d(new jxx(lwrVar, whgVarP3, conversationItem, 13));
                        actionA = swVar3.a();
                    } else {
                        if (iOrdinal != 7) {
                            throw new IllegalArgumentException("Invalid smartActionType: ".concat(lwqVar.toString()));
                        }
                        whg whgVarP4 = p(geuVar);
                        String str = lwrVar.d.a;
                        str.getClass();
                        q(lwrVar, yzy.KX, whgVarP4);
                        sw swVar4 = new sw();
                        swVar4.c(new CarIcon(new tj(IconCompat.m(geuVar, 2131233094))));
                        swVar4.e(odn.a().r(geuVar, str));
                        swVar4.d(new jxx(str, whgVarP4, conversationItem, 14));
                        actionA = swVar4.a();
                    }
                } else if (roc.X()) {
                    whg whgVarP5 = p(geuVar);
                    q(lwrVar, yzy.La, whgVarP5);
                    sw swVar5 = new sw();
                    swVar5.c(new CarIcon(new tj(IconCompat.m(geuVar, 2131233152))));
                    swVar5.e(geuVar.getString(R.string.share_eta_smart_action));
                    swVar5.d(new jxx(whgVarP5, geuVar, conversationItem, 12));
                    actionA = swVar5.a();
                } else if (lbh.c().b() != null) {
                    whg whgVarP6 = p(geuVar);
                    q(lwrVar, yzy.KZ, whgVarP6);
                    sw swVar6 = new sw();
                    swVar6.c(new CarIcon(new tj(IconCompat.m(geuVar, 2131233132))));
                    swVar6.e(geuVar.getString(R.string.share_location_smart_action_verbose));
                    swVar6.d(new jxx(whgVarP6, geuVar, conversationItem, 15));
                    actionA = swVar6.a();
                }
                conversationItem2 = conversationItem;
            }
        }
        if (actionA == null) {
            actionA = gscVar.a(conversationItem2);
        }
        list.add(1, actionA);
        o(z, list);
    }

    public final void h(geu geuVar, him himVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        gsc gscVar = (gsc) geuVar.l(gsc.class);
        gscVar.getClass();
        ConversationItem conversationItem = himVar.k;
        conversationItem.getClass();
        jxv.a();
        String packageName = ((ComponentName) jxv.f(geuVar, null, false).b).getPackageName();
        ohe oheVarS = s(conversationItem, packageName);
        ogz ogzVarR = r(conversationItem, packageName);
        arrayList.add(gscVar.b(conversationItem));
        int i = 16;
        boolean zAnyMatch = Collection.EL.stream(conversationItem.getMessages()).anyMatch(new hmd(i));
        n((CarTextView) findViewById(R.id.row_title), zAnyMatch);
        n((CarTextView) findViewById(R.id.row_secondary_title), zAnyMatch);
        n((CarTextView) this.n.getChildAt(1), zAnyMatch);
        if (ogzVarR != null) {
            kex kexVar = this.T;
            if (kexVar != null) {
                kexVar.f();
                this.T = null;
            }
            kex kexVar2 = new kex((lwb) ogzVarR.a, new isq(this, geuVar, himVar, z, 6));
            this.T = kexVar2;
            kexVar2.e();
        }
        ncp ncpVar = this.S;
        if (ncpVar != null) {
            ncpVar.p();
            this.S = null;
        }
        if (oheVarS != null && !actj.w()) {
            ncp ncpVar2 = new ncp((lwb) oheVarS.b, new isq(this, geuVar, himVar, z, 7));
            this.S = ncpVar2;
            ncpVar2.o();
        }
        if (actj.p() && ogzVarR != null) {
            sw swVar = new sw();
            swVar.d(new gec(ogzVarR, 15));
            swVar.c(new CarIcon(new tj(IconCompat.m(this.E, true != ogzVarR.c() ? 2131233136 : 2131233135))));
            arrayList.add(swVar.a());
        }
        if (actj.p() && oheVarS != null && !actj.w()) {
            sw swVar2 = new sw();
            swVar2.d(new gec(oheVarS, i));
            swVar2.c(new CarIcon(new tj(IconCompat.m(this.E, true == oheVarS.i() ? 2131233135 : 2131233136))));
            arrayList.add(swVar2.a());
        }
        arrayList.addAll(conversationItem.getActions());
        if (!lwo.a().b(conversationItem)) {
            arrayList.add(1, gscVar.a(conversationItem));
            o(z, arrayList);
        } else if (ogzVarR != null) {
            g(geuVar, z, arrayList, gscVar, conversationItem, ((lvi) ogzVarR.b).q());
        } else if (oheVarS != null) {
            g(geuVar, z, arrayList, gscVar, conversationItem, ((lwz) oheVarS.a).n());
        } else {
            lwo.a().d(lvd.c().d(packageName, jxt.c(geuVar, conversationItem), null, null), (int) actj.d()).fE(geuVar.c().a(), new keg(this, geuVar, z, arrayList, gscVar, conversationItem, 0));
        }
    }

    public final void i(View view, int i) {
        int i2;
        if (i == 1) {
            i2 = this.L;
        } else if (i == 2) {
            i2 = this.M;
        } else if (i == 4) {
            i2 = this.I;
        } else {
            if (i != 8) {
                throw new IllegalArgumentException(a.bp(i, "Unrecognized image type: "));
            }
            i2 = this.K;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        if (i2 == this.K) {
            layoutParams.topMargin = this.J;
        }
        view.setLayoutParams(layoutParams);
    }

    public final boolean k() {
        Switch r0 = this.q;
        if (r0 == null) {
            return false;
        }
        r0.toggle();
        return r0.isChecked();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ncp ncpVar = this.S;
        if (ncpVar != null) {
            ncpVar.p();
            this.S = null;
        }
        kex kexVar = this.T;
        if (kexVar != null) {
            kexVar.f();
            this.T = null;
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.n = (LinearLayout) findViewById(R.id.row_text_container);
        this.o = (FrameLayout) findViewById(R.id.row_toggle_container);
        this.q = (Switch) findViewById(R.id.row_toggle);
        this.x = (FrameLayout) findViewById(R.id.row_radio_button_container);
        this.y = (ImageView) findViewById(R.id.row_radio_button);
        this.r = (ShapeableImageView) findViewById(R.id.row_image);
        this.p = (ConstraintLayout) findViewById(R.id.row_view_title);
        this.s = (FrameLayout) findViewById(R.id.row_decoration_container);
        this.t = (FrameLayout) findViewById(R.id.new_row_decoration_container);
        this.u = (TextView) findViewById(R.id.new_row_decoration_text);
        this.v = (ImageView) findViewById(R.id.row_caret);
        this.z = (LinearLayout) findViewById(R.id.row_action_container);
        this.A = (LinearLayout) findViewById(R.id.row_action_button);
        this.B = (ImageView) findViewById(R.id.row_action_button_icon);
        this.C = (TextView) findViewById(R.id.row_action_button_text);
        this.G = (ActionButtonListView) findViewById(R.id.row_action_button_list_view);
        this.D = findViewById(R.id.row_view_secondary_content_container);
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
        this.F = i == 0;
        super.onWindowVisibilityChanged(i);
    }

    public RowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RowView(Context context) {
        this(context, null);
    }
}
