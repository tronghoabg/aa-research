package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.DropShadowParams;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.ProjectionWindowDragParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayBlendedUiConfig;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarDisplayNativeUiElement;
import com.google.android.gms.car.display.CarRegionGroup;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class nso implements lhg {
    public final boolean B;
    public boolean C;
    public boolean D;
    final lds E;
    private int J;
    private final Context K;
    private final int L;
    public nsj m;
    ViewGroup n;
    public final CarDisplayId o;
    public UUID p;
    public final rji q;
    final CarInfo r;
    public final sab s;
    public CarDisplay t;
    public final boolean u;
    public boolean w;
    public static final yph a = yph.c("GH.DisplayLayout");
    public static final String b = String.valueOf(nso.class.getCanonicalName()).concat(".systemLayoutRegionType");
    public static final String c = String.valueOf(nso.class.getCanonicalName()).concat(".displayId");
    public static final String d = String.valueOf(nso.class.getCanonicalName()).concat(".arguments");
    public static final ygr e = yrm.o(nsn.a, nsn.s, nsn.t, nsn.u, nsn.d, nsn.b, nsn.r, nsn.c, nsn.o, nsn.p, nsn.w, nsn.x, nsn.y);
    public static final ygr f = yrm.o(nsn.c, nsn.w, nsn.x);
    private static final ygr H = yrm.o(nsn.m, nsn.k);
    public final Map g = new EnumMap(nsn.class);
    public final ycc h = new yey();
    public final Map i = new ArrayMap();
    public final yks j = new yez(null);
    public final ymf k = new yez(null);
    public final List l = new ArrayList();
    private final int I = (int) acpc.a.gu().j();
    public nsi v = nsi.a;
    public final Set x = new yy(0);
    public final Set y = new yy(0);
    public final yks z = new yez(null);
    public final eqm A = new eqm();
    public final wyd F = new wyd(this, null);
    public final wyd G = new wyd(this);

    public nso(Context context, CarInfo carInfo, lds ldsVar, sab sabVar, CarDisplayId carDisplayId, rji rjiVar, boolean z, boolean z2, qrn qrnVar) {
        this.w = false;
        this.K = context;
        this.s = sabVar;
        this.r = carInfo;
        this.o = carDisplayId;
        this.q = rjiVar;
        this.E = ldsVar;
        this.L = carInfo.h;
        this.u = z;
        this.w = z2;
        this.B = ldz.a.a().c(qrnVar);
    }

    private static int P(boolean z, boolean z2, int i) {
        if (i == 1) {
            return true != z2 ? true != z ? R.layout.sys_ui_layout_canonical_rhd : R.layout.sys_ui_layout_canonical_vertical_rail_rhd : true != z ? R.layout.sys_ui_layout_canonical_rhd_driver_aligned_dashboard : R.layout.sys_ui_layout_canonical_vertical_rail_rhd_driver_aligned_dashboard;
        }
        return true != z2 ? true != z ? R.layout.sys_ui_layout_canonical_lhd : R.layout.sys_ui_layout_canonical_vertical_rail_lhd : true != z ? R.layout.sys_ui_layout_canonical_lhd_driver_aligned_dashboard : R.layout.sys_ui_layout_canonical_vertical_rail_lhd_driver_aligned_dashboard;
    }

    private static int Q(boolean z, boolean z2, int i) {
        if (i == 1) {
            return true != z2 ? true != z ? R.layout.sys_ui_cielo_layout_canonical_rhd : R.layout.sys_ui_cielo_layout_canonical_vertical_rail_rhd : true != z ? R.layout.sys_ui_cielo_layout_canonical_rhd_driver_aligned_dashboard : R.layout.sys_ui_cielo_layout_canonical_vertical_rail_rhd_driver_aligned_dashboard;
        }
        return true != z2 ? true != z ? R.layout.sys_ui_cielo_layout_canonical_lhd : R.layout.sys_ui_cielo_layout_canonical_vertical_rail_lhd : true != z ? R.layout.sys_ui_cielo_layout_canonical_lhd_driver_aligned_dashboard : R.layout.sys_ui_cielo_layout_canonical_vertical_rail_lhd_driver_aligned_dashboard;
    }

    private final int R(ConstraintLayout constraintLayout, boolean z, Rect rect) throws Resources.NotFoundException {
        Resources resources = constraintLayout.getContext().getResources();
        TypedValue typedValue = new TypedValue();
        resources.getValue(z ? R.dimen.driver_aligned_dashboard_guideline_ratio : R.dimen.dashboard_guideline_ratio, typedValue, true);
        float f2 = typedValue.getFloat();
        int dimension = (int) resources.getDimension(R.dimen.coolwalk_gutter_padding);
        int dimension2 = (int) resources.getDimension(R.dimen.coolwalk_vertical_rail_width);
        float f3 = constraintLayout.getContext().getResources().getConfiguration().screenWidthDp * resources.getDisplayMetrics().density;
        nsj nsjVar = this.m;
        if (nsjVar.g && nsjVar.e) {
            f3 -= dimension2 + dimension2;
        }
        float fWidth = f3 - (rect != null ? rect.width() : BitmapDescriptorFactory.HUE_RED);
        int i = ((int) (fWidth / f2)) + dimension + dimension;
        if (z) {
            i += dimension2 - dimension;
        }
        return Math.min((int) (((fWidth - dimension2) - dimension) - ((int) resources.getDimension(R.dimen.car_ime_min_width))), i);
    }

    private final int S(nsn nsnVar) {
        return ((Integer) t(nsnVar, new kqm(4), 1)).intValue();
    }

    private static int T(View view) {
        if (view.getTag(R.id.casts_left_window_inset) != null) {
            return 2;
        }
        if (view.getTag(R.id.casts_right_window_inset) != null) {
            return 4;
        }
        if (view.getTag(R.id.casts_top_window_inset) == null) {
            return view.getTag(R.id.casts_bottom_window_inset) != null ? 16 : 1;
        }
        return 8;
    }

    private static Rect U(View view, Rect rect) {
        return new Rect(view.getLeft() + rect.left, view.getTop() + rect.top, view.getRight() + rect.left, view.getBottom() + rect.top);
    }

    private final nsn V(int i) {
        if (i == -1) {
            return null;
        }
        if (i == R.id.activity) {
            return nsn.a;
        }
        if (i == R.id.demand) {
            return nsn.b;
        }
        if (i == R.id.demand_rail) {
            return nsn.c;
        }
        if (i == R.id.assistant_immersive_fullscreen) {
            return nsn.w;
        }
        if (i == R.id.assistant_immersive_partial) {
            return nsn.x;
        }
        if (i == R.id.notification) {
            return nsn.i;
        }
        if (i == R.id.notification_center) {
            return nsn.j;
        }
        if (i == R.id.status_bar) {
            return nsn.m;
        }
        if (i == R.id.ime) {
            return nsn.g;
        }
        if (i == R.id.map_ime) {
            return nsn.h;
        }
        if (i == R.id.rail) {
            return nsn.k;
        }
        if (i == R.id.cluster_launcher) {
            return nsn.n;
        }
        if (i == R.id.sliver) {
            return nsn.l;
        }
        if (i == R.id.fullscreen) {
            return nsn.o;
        }
        if (i == R.id.frx) {
            return nsn.p;
        }
        if (i == R.id.dashboard) {
            return nsn.q;
        }
        if (i == R.id.cielo_dashboard) {
            return nsn.r;
        }
        if (i == R.id.map) {
            return nsn.s;
        }
        if (i == R.id.map_compat) {
            return nsn.t;
        }
        if (i == R.id.activity_compat) {
            return nsn.u;
        }
        if (i == R.id.immersive) {
            return nsn.d;
        }
        if (i == R.id.immersive_toolbar) {
            return nsn.e;
        }
        if (i == R.id.immersive_toolbar_bottom_scrim) {
            return nsn.f;
        }
        if (i == R.id.integrated_overlay) {
            return nsn.y;
        }
        if (i == R.id.passenger_rail) {
            return nsn.z;
        }
        if (i == R.id.driver_rail) {
            return nsn.B;
        }
        if (i == R.id.ui_overlay_decorations) {
            return nsn.A;
        }
        if (i == R.id.rounded_corner_mask) {
            return nsn.C;
        }
        Context context = this.K;
        if (context == null) {
            return null;
        }
        ((ype) a.l().ai((char) 5396)).y("No window type for %s", context.getResources().getResourceName(i));
        return null;
    }

    private final CarDisplayNativeUiElement W(CarDisplayBlendedUiConfig carDisplayBlendedUiConfig, final int i, final int i2, final boolean z) {
        yfq yfqVar;
        final boolean zJ = J();
        List list = carDisplayBlendedUiConfig.b;
        if (list == null) {
            ((ype) a.l().ai((char) 5392)).u("Native UI elements are null, no native rails provided");
            int i3 = yfq.d;
            yfqVar = yls.a;
        } else {
            Stream streamFilter = Collection.EL.stream(list).filter(new mrw(5));
            int i4 = yfq.d;
            yfqVar = (yfq) streamFilter.collect(ycm.a);
        }
        return (CarDisplayNativeUiElement) Collection.EL.stream(yfqVar).filter(new Predicate() { // from class: nsa
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo56negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                yph yphVar = nso.a;
                Rect rect = ((CarDisplayNativeUiElement) obj).a;
                if (rect == null) {
                    return false;
                }
                if (z == zJ) {
                    if (nso.a(rect.right, i) == i2) {
                        return true;
                    }
                } else if (rect.left == 0) {
                    return true;
                }
                return false;
            }
        }).findFirst().orElse(null);
    }

    private static void X(ConstraintLayout constraintLayout, Rect rect) {
        drx drxVar = new drx();
        drxVar.e(constraintLayout);
        aj(drxVar, R.id.contentInset_left, rect.left, constraintLayout.getLayoutDirection() == 0);
        int i = rect.top;
        drxVar.i(R.id.contentInset_top, 0);
        drxVar.n(R.id.contentInset_top, i);
        aj(drxVar, R.id.contentInset_right, rect.right, constraintLayout.getLayoutDirection() != 0);
        int i2 = rect.bottom;
        drxVar.i(R.id.contentInset_bottom, 0);
        drxVar.o(R.id.contentInset_bottom, i2);
        drxVar.c(constraintLayout);
    }

    private final void Y(View view, CarRegionId carRegionId, int i) {
        ac(view, carRegionId, i, new vzs(this, carRegionId, 1));
    }

    private final void Z(View view, CarRegionId carRegionId, int i) {
        ac(view, carRegionId, i, new ixx(this, 4));
    }

    public static int a(float f2, float f3) {
        return (int) (f2 * (160.0f / f3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aa(androidx.constraintlayout.widget.ConstraintLayout r8, android.graphics.Rect r9, int r10, android.graphics.Rect r11) {
        /*
            r7 = this;
            drx r0 = new drx
            r0.<init>()
            r0.e(r8)
            defpackage.mmc.c()
            boolean r1 = defpackage.mmc.h()
            int r2 = r7.L
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L1b
            if (r1 == 0) goto L19
            r2 = r4
            goto L1b
        L19:
            r2 = r4
            goto L2b
        L1b:
            if (r2 != 0) goto L21
            if (r1 != 0) goto L19
            r5 = r3
            goto L22
        L21:
            r5 = r1
        L22:
            r6 = 2
            if (r2 != r6) goto L29
            if (r1 == 0) goto L29
            r2 = r4
            goto L2a
        L29:
            r2 = r3
        L2a:
            r1 = r5
        L2b:
            if (r2 == 0) goto L30
            int r9 = r9.left
            goto L32
        L30:
            int r9 = r9.right
        L32:
            nsj r5 = r7.m
            boolean r6 = r5.g
            if (r6 == 0) goto L59
            boolean r5 = r5.e
            if (r5 == 0) goto L59
            boolean r7 = r7.B
            if (r7 == 0) goto L4c
            android.content.res.Resources r7 = r8.getResources()
            r5 = 2131166047(0x7f07035f, float:1.7946328E38)
            float r7 = r7.getDimension(r5)
            goto L57
        L4c:
            android.content.res.Resources r7 = r8.getResources()
            r5 = 2131165784(0x7f070258, float:1.7945795E38)
            float r7 = r7.getDimension(r5)
        L57:
            int r7 = (int) r7
            int r10 = r10 + r7
        L59:
            if (r11 == 0) goto L68
            int r7 = r11.left
            if (r7 == 0) goto L60
            goto L61
        L60:
            r3 = r4
        L61:
            if (r3 != r2) goto L68
            int r7 = r11.width()
            int r9 = r9 + r7
        L68:
            r7 = 2131427916(0x7f0b024c, float:1.8477462E38)
            int r10 = r10 + r9
            aj(r0, r7, r10, r2)
            if (r1 == 0) goto L9d
            android.content.Context r7 = r8.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131165735(0x7f070227, float:1.7945696E38)
            float r7 = r7.getDimension(r9)
            int r7 = (int) r7
            android.content.Context r9 = r8.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131165810(0x7f070272, float:1.7945848E38)
            float r9 = r9.getDimension(r10)
            int r9 = (int) r9
            r10 = 2131427919(0x7f0b024f, float:1.8477468E38)
            drs r10 = r0.b(r10)
            drt r10 = r10.d
            int r9 = r9 + r7
            r10.ad = r9
        L9d:
            r0.c(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nso.aa(androidx.constraintlayout.widget.ConstraintLayout, android.graphics.Rect, int, android.graphics.Rect):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ab(android.view.View r34, java.util.List r35, java.util.Set r36, android.graphics.Rect r37) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nso.ab(android.view.View, java.util.List, java.util.Set, android.graphics.Rect):void");
    }

    private final void ac(View view, CarRegionId carRegionId, int i, Function function) {
        Object tag = view.getTag(i);
        if (tag instanceof String) {
            CarRegionGroup carRegionGroup = (CarRegionGroup) function.apply(new CarRegionGroup(Integer.parseInt((String) tag), this.o, carRegionId));
            this.j.t(carRegionGroup, carRegionId);
            this.i.put(carRegionId, carRegionGroup);
        }
    }

    private static boolean ad(Context context) {
        int i = context.getResources().getConfiguration().screenWidthDp;
        acxa acxaVar = acxa.a;
        int iS = (int) acxaVar.gu().s();
        return (context.getResources().getConfiguration().screenWidthDp / context.getResources().getConfiguration().screenHeightDp >= acxaVar.gu().a()) & (i >= iS);
    }

    private static boolean ae(Context context) {
        int i = context.getResources().getConfiguration().screenHeightDp;
        acxa acxaVar = acxa.a;
        int iR = (int) acxaVar.gu().r();
        boolean zBa = acxaVar.gu().ba();
        boolean z = i >= iR;
        if (zBa) {
            return z && ((double) context.getResources().getConfiguration().screenWidthDp) / ((double) context.getResources().getConfiguration().screenHeightDp) < acxaVar.gu().b();
        }
        return z;
    }

    private static boolean af(Context context) {
        return context.getResources().getConfiguration().screenHeightDp >= ((int) acxa.a.gu().t());
    }

    private static final CarDisplayBlendedUiConfig ag(CarDisplay carDisplay) {
        if (!acrz.a.gu().e()) {
            ((ype) ((ype) a.f()).ai((char) 5383)).u("Cutouts are not enabled, skipping blended UI config");
            return null;
        }
        CarDisplayBlendedUiConfig carDisplayBlendedUiConfig = carDisplay.i;
        if (carDisplayBlendedUiConfig != null) {
            ((ype) a.l().ai((char) 5382)).y("Blended UI config: %s", carDisplayBlendedUiConfig);
        }
        return carDisplayBlendedUiConfig;
    }

    private static final Integer ah(View view, int i) {
        Object tag = view.getTag(i);
        if (tag instanceof Integer) {
            return (Integer) tag;
        }
        if (!(tag instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) tag));
        } catch (NumberFormatException e2) {
            ((ype) ((ype) ((ype) a.h()).p(e2)).ai((char) 5390)).y("Failed to parse integer tag: %s", tag);
            return null;
        }
    }

    private static final boolean ai(nsn nsnVar) {
        if (nsnVar != nsn.i) {
            return false;
        }
        int i = nqe.a;
        int i2 = nqg.a;
        nqg nqgVar = nqf.a;
        return nqgVar.h() && !nqgVar.g();
    }

    private static void aj(drx drxVar, int i, int i2, boolean z) {
        drxVar.i(i, 1);
        if (z) {
            drxVar.n(i, i2);
        } else {
            drxVar.o(i, i2);
        }
    }

    private static boolean ak(int i, lds ldsVar) {
        if (acxa.W() && i < ((int) acxa.a.gu().f())) {
            return true;
        }
        int i2 = nqe.a;
        int i3 = nqg.a;
        return nqf.a.g() || ldsVar.e();
    }

    public final void A(nsg nsgVar) {
        this.x.remove(nsgVar);
    }

    public final void B(nsn nsnVar, nsk nskVar) {
        this.z.C(nsnVar, nskVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(nsi nsiVar) {
        this.v = nsiVar;
        yx yxVar = new yx((yy) this.y);
        while (yxVar.hasNext()) {
            ((ajmd) yxVar.next()).h(nsiVar);
        }
    }

    public final boolean D() {
        nsj nsjVar = this.m;
        nsjVar.getClass();
        return nsjVar.g;
    }

    public final boolean E() {
        if (!CarDisplayId.b(this.o)) {
            throw new UnsupportedOperationException("This method can only be called on the primary DisplayLayout");
        }
        int i = this.m.i - 1;
        return i == 10 || i == 11 || i == 16;
    }

    public final boolean F() {
        if (CarDisplayId.a.equals(this.o)) {
            return this.m.e;
        }
        throw new UnsupportedOperationException("This method can only be called on the primary DisplayLayout");
    }

    public final boolean G(nsn nsnVar) {
        return h(nsnVar) != null;
    }

    public final boolean H() {
        if (!this.B) {
            return false;
        }
        nsj nsjVar = this.m;
        nsjVar.getClass();
        return nsjVar.h;
    }

    public final boolean I() {
        int i = this.m.i - 1;
        return i == 12 || i == 13 || i == 17 || i == 18;
    }

    public final boolean J() {
        return this.L == 1;
    }

    public final boolean K() {
        if (m() != nsv.a) {
            return true;
        }
        nsj nsjVar = this.m;
        return nsjVar.b >= (nsjVar.i == 2 ? 730 : 800);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L() {
        /*
            r4 = this;
            rji r0 = r4.q
            rji r1 = defpackage.rji.a
            r2 = 0
            if (r0 == r1) goto L8
            return r2
        L8:
            boolean r0 = defpackage.acxa.ba()
            r1 = 1
            if (r0 == 0) goto L10
            return r1
        L10:
            nsv r0 = r4.m()
            boolean r3 = defpackage.acxa.aZ()
            if (r3 != 0) goto L28
            com.google.android.gms.car.display.CarDisplay r3 = r4.t
            r3.getClass()
            com.google.android.gms.car.display.CarDisplayBlendedUiConfig r3 = ag(r3)
            if (r3 == 0) goto L26
            goto L28
        L26:
            r3 = r2
            goto L29
        L28:
            r3 = r1
        L29:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L46;
                case 2: goto L46;
                case 3: goto L46;
                case 4: goto L38;
                case 5: goto L37;
                case 6: goto L37;
                case 7: goto L37;
                default: goto L30;
            }
        L30:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r0 = 0
            r4.<init>(r0, r0)
            throw r4
        L37:
            return r1
        L38:
            return r3
        L39:
            nsj r4 = r4.m
            int r0 = r4.c
            lds r4 = r4.j
            boolean r4 = ak(r0, r4)
            if (r4 != 0) goto L46
            return r1
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nso.L():boolean");
    }

    public final boolean M() {
        if (!lea.a().d() || !K() || this.h.a().get(nsn.r) == 0) {
            return false;
        }
        if (m() != nsv.a) {
            return true;
        }
        nsj nsjVar = this.m;
        return nsjVar.b >= (true != nsjVar.e ? 750 : 846);
    }

    public final void N(Rect rect, nsn nsnVar) throws Resources.NotFoundException {
        if (nsnVar == nsn.s && this.B && acxa.a.gu().ag()) {
            ViewGroup viewGroup = this.n;
            viewGroup.getClass();
            int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.gearhead_maps_insets);
            rect.left += dimensionPixelSize;
            rect.top += dimensionPixelSize;
            rect.right += dimensionPixelSize;
            rect.bottom += dimensionPixelSize;
        }
    }

    public final void O() {
        sab sabVar = this.s;
        sabVar.getClass();
        kgq.d(new kyi(sabVar, 12), "GH.DisplayLayout", yzz.DISPLAY_LAYOUT, yzy.rO, "Car not connected during relayout", new Object[0]);
    }

    public final int b(nsn nsnVar) {
        if (this.B) {
            return ((Integer) t(nsnVar, new kqm(8), 1)).intValue();
        }
        return 1;
    }

    @Override // defpackage.lhg
    public final void d() {
        wer.c();
        if (this.C && kio.b().q()) {
            mki.a.g();
            qrn qrnVarE = kio.b().e();
            wyd wydVar = this.G;
            rdm rdmVarD = ((qsz) qrnVarE).d();
            int i = 3;
            if (omc.c("CAR.CLIENT", 3)) {
                rrd.a("CAR.CLIENT", null, "Multi-region client enabled. UnregisterCarDisplayLayoutUpdateCompleteListener");
            }
            rdmVarD.k.F(new rcs(wydVar, i));
            this.C = false;
        }
        wyd wydVar2 = this.F;
        mhv mhvVarA = mhv.a();
        wer.c();
        mhvVarA.f.remove(wydVar2);
    }

    public final int e(nsn nsnVar) {
        if (S(nsnVar) == 1) {
            return 0;
        }
        return this.K.getResources().getInteger(R.integer.coolwalk_rounded_corner_radius);
    }

    public final int f(nsn nsnVar) {
        nsv nsvVarM = m();
        nsv nsvVar = nsv.f;
        return (nsvVarM == nsvVar && nsnVar == nsn.h) ? f(nsn.g) : (m() == nsvVar && nsnVar == nsn.d) ? f(nsn.a) : ((Integer) t(nsnVar, new kqm(5), 0)).intValue();
    }

    public final Rect g(nsn nsnVar) {
        return new Rect((Rect) t(nsnVar, new kqm(10), new Rect()));
    }

    public final Rect h(nsn nsnVar) {
        Rect rect;
        nsm nsmVar = (nsm) this.g.get(nsnVar);
        if (nsmVar == null || (rect = nsmVar.a) == null) {
            return null;
        }
        return new Rect(rect);
    }

    public final Rect i(nsn nsnVar) {
        return new Rect((Rect) t(nsnVar, new kqm(11), new Rect()));
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dzi j(defpackage.nsn r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nso.j(nsn):dzi");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nsn k(CarRegionId carRegionId) {
        ycc yccVar = this.h;
        woy.S(yccVar.containsKey(carRegionId), "Trying to find the SystemLayoutRegionType for region %s that does not exist", carRegionId);
        nsn nsnVar = (nsn) yccVar.get(carRegionId);
        nsnVar.getClass();
        return nsnVar;
    }

    public final nsu l() {
        Rect rectH = h(nsn.r);
        Rect rectH2 = h(nsn.q);
        if (rectH == null || rectH2 == null || rectH.width() <= 0 || rectH.height() <= 0 || rectH2.width() <= 0 || rectH2.height() <= 0) {
            ((ype) ((ype) a.h()).ai((char) 5397)).u("Invalid widget shade layout state");
            return null;
        }
        nsj nsjVar = this.m;
        int i = nsjVar.i;
        boolean z = nsjVar.d;
        boolean z2 = nsjVar.f;
        this.t.getClass();
        return new nsu(i, z, z2, rectH, rectH2, r8.c / 160.0f);
    }

    public final nsv m() {
        switch (this.m.i - 1) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 18:
                return nsv.a;
            case 4:
            case 5:
                return nsv.e;
            case 7:
                return nsv.b;
            case 8:
                return nsv.c;
            case 9:
                return nsv.d;
            case 10:
                return nsv.f;
            case 11:
                return nsv.g;
            case 16:
                return nsv.h;
            default:
                throw new IllegalStateException("UNKNOWN_LAYOUT is not supported as a type for display ".concat(String.valueOf(String.valueOf(this.o))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qsw n(nsn nsnVar) {
        Rect rectH = ai(nsnVar) ? h(nsn.d) : h(nsnVar);
        if (rectH == null) {
            return null;
        }
        boolean z = this.B;
        if (z && nsnVar == nsn.i && ai(nsnVar) && this.m.e) {
            Rect rect = new Rect(rectH);
            ViewGroup viewGroup = this.n;
            viewGroup.getClass();
            int dimension = (int) viewGroup.getContext().getResources().getDimension(R.dimen.floating_vertical_rail_space_width);
            if (this.m.d) {
                rect.right -= dimension;
            } else {
                rect.left += dimension;
            }
            rectH = rect;
        }
        dzi dziVarJ = j(nsnVar);
        Rect rectI = i(nsnVar);
        N(rectI, nsnVar);
        Bundle bundle = new Bundle();
        bundle.putInt(b, nsnVar.ordinal());
        bundle.putParcelable(c, this.o);
        String str = (String) t(nsnVar, new kqm(7), null);
        if (str != null) {
            bundle.putString(d, str);
        }
        int integer = rectH.top;
        int iHeight = rectH.height();
        if (z && H() && nsnVar == nsn.i) {
            ViewGroup viewGroup2 = this.n;
            viewGroup2.getClass();
            integer = viewGroup2.getContext().getResources().getInteger(R.integer.gearhead_max_notification_top_margin);
            if (rectH.top <= integer) {
                integer = 0;
            }
            int i = rectH.top - integer;
            iHeight += i;
            rectI.top += i;
        }
        qsw qswVar = new qsw(rectH.width(), iHeight, v());
        qswVar.a = rectH.left;
        qswVar.b = integer;
        qswVar.o = rectI;
        qswVar.p.putAll(bundle);
        qswVar.q = (CarRegionId) this.h.a().get(nsnVar);
        qswVar.r = u(nsnVar);
        qswVar.s = b(nsnVar);
        qswVar.u = ((Integer) t(nsnVar, new kqm(13), 0)).intValue();
        qswVar.t = p(nsnVar);
        qswVar.j = (ProjectionWindowAnimationParams) dziVarJ.a;
        qswVar.k = (ProjectionWindowAnimationParams) dziVarJ.b;
        qswVar.g = f(nsnVar);
        return qswVar;
    }

    public final qsw o(CarRegionId carRegionId) {
        nsn nsnVarK = k(carRegionId);
        return (nsnVarK == nsn.s || nsnVarK == nsn.t) ? n(nsn.h) : n(nsn.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public final ProjectionWindowDecorationParams p(nsn nsnVar) {
        ProjectionWindowDragParams projectionWindowDragParams;
        int i;
        boolean z;
        Rect rectG = g(nsnVar);
        int iS = S(nsnVar);
        DropShadowParams dropShadowParams = (DropShadowParams) t(nsnVar, new kqm(9), null);
        if (this.B && nsnVar.equals(nsn.r) && this.q == rji.a) {
            nsu nsuVarL = l();
            if (nsuVarL == null) {
                int i2 = yfq.d;
                yfq yfqVar = yls.a;
                projectionWindowDragParams = new ProjectionWindowDragParams(0, yfqVar, null, yfqVar, yfqVar);
            } else {
                int i3 = true != nsuVarL.a() ? 1 : 2;
                new ArrayList();
                new ArrayList();
                int i4 = yfq.d;
                yfq yfqVar2 = yls.a;
                yfq yfqVar3 = nsuVarL.e;
                Object[] objArr = {Integer.valueOf(((yls) yfqVar3).c - 1)};
                yrm.B(objArr, 1);
                projectionWindowDragParams = new ProjectionWindowDragParams(i3, yfqVar3, null, nsuVarL.f, new yls(objArr, 1));
            }
        } else {
            int i5 = yfq.d;
            yfq yfqVar4 = yls.a;
            projectionWindowDragParams = new ProjectionWindowDragParams(0, yfqVar4, null, yfqVar4, yfqVar4);
        }
        if (!rectG.equals(new Rect()) || iS != 1) {
            i = iS;
            z = false;
        } else {
            if (dropShadowParams == null && projectionWindowDragParams.a == 0) {
                return ProjectionWindowDecorationParams.a();
            }
            z = false;
            i = 1;
        }
        return new ProjectionWindowDecorationParams(rectG.left, rectG.top, rectG.right, rectG.bottom, i, e(nsnVar), (S(nsnVar) != 1 && (nsnVar == nsn.j || nsnVar == nsn.w || nsnVar == nsn.x || nsnVar == nsn.g || nsnVar == nsn.h)) ? 2 : 1, ((Boolean) t(nsnVar, new kqm(6), Boolean.valueOf(z))).booleanValue(), false, (leh.a.a().b() && (nsnVar == nsn.s || nsnVar == nsn.t)) ? this.I : z, dropShadowParams, projectionWindowDragParams);
    }

    public final CarRegionGroup q(CarRegionId carRegionId) {
        return (CarRegionGroup) this.i.get(carRegionId);
    }

    public final CarRegionId r(nsn nsnVar) {
        CarRegionId carRegionId;
        yew yewVar = new yew((yex) this.h.entrySet());
        while (true) {
            if (!yewVar.hasNext()) {
                carRegionId = null;
                break;
            }
            Map.Entry entry = (Map.Entry) yewVar.next();
            if (entry.getValue() == nsnVar) {
                carRegionId = (CarRegionId) entry.getKey();
                break;
            }
        }
        nsnVar.name();
        carRegionId.getClass();
        return carRegionId;
    }

    public final yfq s() {
        Stream map = Collection.EL.stream(this.h.entrySet()).filter(new iup(4)).filter(new iup(5)).map(new kqm(12));
        int i = yfq.d;
        return (yfq) map.collect(ycm.a);
    }

    public final Object t(nsn nsnVar, Function function, Object obj) {
        nsm nsmVar = (nsm) this.g.get(nsnVar);
        return nsmVar == null ? obj : function.apply(nsmVar);
    }

    public final List u(nsn nsnVar) {
        return yfq.o(this.k.c(nsnVar));
    }

    public final UUID v() {
        UUID uuid = this.p;
        uuid.getClass();
        return uuid;
    }

    public final void w(nsg nsgVar) {
        this.x.add(nsgVar);
    }

    public final void x(nsn nsnVar, nsk nskVar) {
        this.z.t(nsnVar, nskVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x044b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(com.google.android.gms.car.display.CarDisplay r48, android.graphics.Rect r49) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nso.y(com.google.android.gms.car.display.CarDisplay, android.graphics.Rect):void");
    }

    public final void z(Rect rect) {
        this.n.getClass();
        this.J = 489;
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.j.q();
        this.l.clear();
        this.k.q();
        ViewGroup viewGroup = this.n;
        ArrayList arrayList = new ArrayList();
        if (rect.left != 0) {
            arrayList.add(new Rect(0, 0, rect.left, viewGroup.getHeight()));
        }
        if (rect.top != 0) {
            arrayList.add(new Rect(0, 0, viewGroup.getWidth(), rect.top));
        }
        if (rect.right != 0) {
            arrayList.add(new Rect(viewGroup.getWidth() - rect.right, 0, viewGroup.getWidth(), viewGroup.getHeight()));
        }
        if (rect.bottom != 0) {
            arrayList.add(new Rect(0, viewGroup.getHeight() - rect.bottom, viewGroup.getWidth(), viewGroup.getHeight()));
        }
        ab(viewGroup, arrayList, new yy(0), new Rect());
    }

    @Override // defpackage.lhg
    public final void c() {
    }
}
