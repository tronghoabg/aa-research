package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.gms.car.CarCall;
import com.google.android.libraries.geo.mapcore.renderer.LayeredLabelRenderer;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class qrv {
    public qrv() {
    }

    public static ryf A(String str) {
        ryf ryfVar = ryf.a;
        if (TextUtils.isEmpty(str)) {
            return ryfVar;
        }
        try {
            ryf ryfVarValueOf = ryf.valueOf(str.toUpperCase(Locale.US));
            if (Build.VERSION.SDK_INT >= (ryfVarValueOf == ryf.b ? 33 : 30)) {
                return ryfVarValueOf;
            }
            return null;
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new IllegalStateException(String.format("Unknown USB reset method %s", str), e);
        }
    }

    public static aekf B(abcs abcsVar) {
        aeke aekeVar = new aeke(16);
        for (int i = 0; i < abcsVar.p.size(); i++) {
            aekeVar.c(abcsVar.p.e(i));
        }
        return aekeVar;
    }

    public static boolean C(udx udxVar, udx udxVar2) {
        if (D(udxVar) && D(udxVar2)) {
            return (Objects.equals(udxVar.m(), udxVar2.m()) || (udxVar.d() != 0 && udxVar.d() == udxVar2.d())) && !Objects.equals(udxVar.i(), udxVar2.i());
        }
        return false;
    }

    public static boolean D(udx udxVar) {
        return (udxVar.i() == null || udxVar.m() == null) ? false : true;
    }

    public static boolean E(ttn ttnVar, ttn ttnVar2, int i, float f) {
        if (ttnVar2 == null || ttnVar == null) {
            return true;
        }
        if (ttnVar.equals(ttnVar2)) {
            return false;
        }
        float f2 = ttnVar.l;
        float f3 = ttnVar2.l;
        if (((int) (f2 + f2)) == ((int) (f3 + f3)) && Math.abs(f2 - f3) < 0.1f && Math.abs(uzg.b(ttnVar.n - ttnVar2.n)) < 3.0f && Math.abs(ttnVar.m - ttnVar2.m) < 1.0f) {
            float fC = tsw.c(f2, i, f);
            if (ttnVar.h.d(ttnVar2.h) / (fC * fC) < 0.010000001f) {
                tto ttoVar = ttnVar.o;
                tto ttoVar2 = ttnVar2.o;
                float f4 = ttoVar.b - ttoVar2.b;
                float f5 = ttoVar.c - ttoVar2.c;
                return (f4 * f4) + (f5 * f5) >= 0.010000001f;
            }
        }
        return true;
    }

    public static boolean F(int i) {
        return i == 3;
    }

    public static void G(uax uaxVar, SparseArray sparseArray, abeg abegVar) {
        abch abchVar = abegVar.d;
        if (abchVar == null) {
            abchVar = abch.a;
        }
        int i = abchVar.c;
        abeg abegVar2 = (abeg) sparseArray.get(i);
        if (abegVar2 != null) {
            float fV = uqw.v(uaxVar.a(abegVar2), abegVar2.k);
            float fV2 = uqw.v(uaxVar.a(abegVar), abegVar.k);
            yde ydeVar = yde.b;
            abej abejVar = abegVar2.c;
            if (abejVar == null) {
                abejVar = abej.a;
            }
            int i2 = abejVar.b & 1;
            abej abejVar2 = abegVar.c;
            if (abejVar2 == null) {
                abejVar2 = abej.a;
            }
            if (ydeVar.g(1 == i2, 1 == (abejVar2.b & 1)).c(abegVar2.g, abegVar.g).b(fV, fV2).d(abegVar2.f, abegVar.f).a() >= 0) {
                return;
            }
        }
        sparseArray.put(i, abegVar);
    }

    public static boolean H(int i) {
        return i == 2;
    }

    public static float I(ubq ubqVar) {
        return ubqVar.h().a.g;
    }

    public static int J(ubq ubqVar) {
        return (int) ubqVar.h().a.e;
    }

    public static long K(ubq ubqVar, ube ubeVar) {
        return ubqVar.h().a(ubeVar);
    }

    public static uds L(ubq ubqVar) {
        return ubqVar.h().j;
    }

    public static udx M(ubq ubqVar) {
        return ubqVar.h().d;
    }

    public static ueu N(ubq ubqVar) {
        return ubqVar.h().b;
    }

    public static abcs O(ubq ubqVar) {
        return ubqVar.h().c;
    }

    public static abje P(ubq ubqVar) {
        return ubqVar.h().a;
    }

    public static void Q(ubq ubqVar, int i) {
        ubqVar.h().c(i);
    }

    public static void R(ubq ubqVar, int i) {
        ubqVar.h().e(i);
    }

    public static void S(ubq ubqVar, boolean z) {
        ubqVar.h().i = z;
    }

    public static void T(ubq ubqVar, ubf ubfVar, float f) {
        if (ubfVar instanceof ubq) {
            ubv ubvVarH = ubqVar.h();
            ubv ubvVarH2 = ((ubq) ubfVar).h();
            if (ubvVarH.i() || ubvVarH2.i() || f < ubvVarH2.a.g) {
                return;
            }
            abje abjeVar = ubvVarH.a;
            if ((abjeVar.b & 16384) != 0) {
                List list = ubvVarH.f;
                int i = abjeVar.t;
                if (i < list.size()) {
                    ubvVarH.g = (abfc) list.get(i);
                    ubvVarH.e = (List) Collection.EL.stream(ubvVarH2.b()).map(new ric(19)).collect(Collectors.toCollection(new maf(6)));
                }
            }
        }
    }

    public static void U(ubq ubqVar, long j, ube ubeVar) {
        ubqVar.h().f(j, ubeVar);
    }

    public static void V(abjb abjbVar, tpf tpfVar) {
        int i;
        abji abjiVar;
        int i2 = abjbVar.c;
        if (i2 != 5) {
            abht abhtVar = abjbVar.e;
            if (abhtVar == null) {
                abhtVar = abht.a;
            }
            abka abkaVar = abhtVar.c;
            if (abkaVar == null) {
                abkaVar = abka.a;
            }
            float f = abkaVar.c;
            abht abhtVar2 = abjbVar.e;
            abka abkaVar2 = (abhtVar2 == null ? abht.a : abhtVar2).c;
            if (abkaVar2 == null) {
                abkaVar2 = abka.a;
            }
            float f2 = abkaVar2.d;
            abka abkaVar3 = (abhtVar2 == null ? abht.a : abhtVar2).d;
            if (abkaVar3 == null) {
                abkaVar3 = abka.a;
            }
            float f3 = f + (abkaVar3.c / 2.0f);
            if (abhtVar2 == null) {
                abhtVar2 = abht.a;
            }
            abka abkaVar4 = abhtVar2.d;
            if (abkaVar4 == null) {
                abkaVar4 = abka.a;
            }
            tpfVar.n(f3, f2 + (abkaVar4.d / 2.0f));
            return;
        }
        abht abhtVar3 = (i2 == 5 ? (abji) abjbVar.d : abji.a).f;
        if (abhtVar3 == null) {
            abhtVar3 = abht.a;
        }
        abka abkaVar5 = abhtVar3.c;
        if (abkaVar5 == null) {
            abkaVar5 = abka.a;
        }
        float f4 = abkaVar5.c;
        int i3 = abjbVar.c;
        abht abhtVar4 = (i3 == 5 ? (abji) abjbVar.d : abji.a).f;
        if (abhtVar4 == null) {
            abhtVar4 = abht.a;
        }
        abka abkaVar6 = abhtVar4.c;
        if (abkaVar6 == null) {
            abkaVar6 = abka.a;
        }
        float f5 = abkaVar6.d;
        if (i3 == 5) {
            abjiVar = (abji) abjbVar.d;
            i = 5;
        } else {
            i = i3;
            abjiVar = abji.a;
        }
        abht abhtVar5 = abjiVar.f;
        if (abhtVar5 == null) {
            abhtVar5 = abht.a;
        }
        abka abkaVar7 = abhtVar5.d;
        if (abkaVar7 == null) {
            abkaVar7 = abka.a;
        }
        float f6 = f4 + (abkaVar7.c / 2.0f);
        abht abhtVar6 = (i == 5 ? (abji) abjbVar.d : abji.a).f;
        if (abhtVar6 == null) {
            abhtVar6 = abht.a;
        }
        abka abkaVar8 = abhtVar6.d;
        if (abkaVar8 == null) {
            abkaVar8 = abka.a;
        }
        tpfVar.n(f6, f5 + (abkaVar8.d / 2.0f));
    }

    public static boolean W(ubq ubqVar) {
        return ubqVar.h().g != null;
    }

    public static boolean X(ubq ubqVar) {
        return ubqVar.h().i;
    }

    public static boolean Y(ubq ubqVar) {
        return ubqVar.h().i();
    }

    public static boolean Z(abje abjeVar, List list, List list2) {
        int i;
        if (LayeredLabelRenderer.a() && !aa(abjeVar)) {
            if (abjeVar.o > 0) {
                return true;
            }
            if (list == null && list2 == null) {
                return false;
            }
            if (list2 != null && (abjeVar.b & 16384) != 0 && (i = abjeVar.t) < list2.size()) {
                abfc abfcVar = (abfc) list2.get(i);
                if ((abfcVar.b & 1) != 0) {
                    abca abcaVar = abfcVar.c;
                    if (abcaVar == null) {
                        abcaVar = abca.a;
                    }
                    if (!abcaVar.b.isEmpty() || !abcaVar.c.isEmpty()) {
                        return true;
                    }
                }
            }
            for (abjb abjbVar : abjeVar.f) {
                int i2 = abjbVar.c;
                if (i2 == 4) {
                    if ((i2 == 4 ? (abjd) abjbVar.d : abjd.a).b.size() > 1 && (abjbVar.b & 4) != 0) {
                        int size = list.size();
                        int i3 = abjbVar.f;
                        if (size > i3 && (((abal) list.get(i3)).b & 1) != 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean aa(abje abjeVar) {
        int iAp;
        return (abjeVar.k || ((iAp = a.ap(abjeVar.j)) != 0 && iAp == 3)) && abjeVar.f.size() == 1;
    }

    public static int ab(ubq ubqVar, long j) {
        return ubqVar.h().j(j);
    }

    public static uzc ac(uew uewVar) {
        uev uevVar = uewVar.i;
        return new uzc(Math.round(uevVar.a), Math.round(uevVar.b), Math.round(uevVar.c), Math.round(uevVar.d));
    }

    public static void ad(abht abhtVar, float f, double d, tpf tpfVar, tpf tpfVar2, uew uewVar) {
        xxh xxhVarH = xxh.h(tpfVar);
        abka abkaVar = abhtVar.c;
        if (abkaVar == null) {
            abkaVar = abka.a;
        }
        abka abkaVar2 = abhtVar.d;
        if (abkaVar2 == null) {
            abkaVar2 = abka.a;
        }
        tpf tpfVar3 = (tpf) ((xxm) xxhVarH).a;
        float f2 = tpfVar3.b;
        float f3 = tpfVar3.c;
        float f4 = abkaVar.c;
        float f5 = f4 * f;
        float f6 = abkaVar.d;
        float f7 = f6 * f;
        float f8 = (f4 + abkaVar2.c) * f;
        float f9 = (f6 + abkaVar2.d) * f;
        float f10 = (f5 + f8) * 0.5f;
        float f11 = (f7 + f9) * 0.5f;
        uewVar.h((f10 * f2) - (f11 * f3), (f11 * f2) + (f10 * f3), d, (f8 - f5) * 0.5f, (f9 - f7) * 0.5f);
        uewVar.d(tpfVar2);
    }

    public static /* synthetic */ String ae(int i) {
        return i != 1 ? i != 2 ? "BLANK" : "TEXT" : "ICON";
    }

    public static void af(nzj nzjVar, tpf tpfVar, double d, float f, float f2, ucd ucdVar) {
        if (nzjVar != null) {
            ucdVar.a.A((too) nzjVar.c);
            ucdVar.c.o((tpf) nzjVar.b);
            ucdVar.d.o((tpf) nzjVar.a);
            ucdVar.e = 2;
            return;
        }
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f3 = fCos * f;
        float f4 = f * fSin;
        float f5 = (-fSin) * f2;
        float f6 = fCos * f2;
        ucdVar.c.n(f3, f4);
        ucdVar.d.n(f5, f6);
        ucdVar.b.n(tpfVar.b - ((f3 + f5) / 2.0f), tpfVar.c - ((f4 + f6) / 2.0f));
        ucdVar.e = 3;
    }

    public static qrv ag(xxh xxhVar) {
        if (xxhVar.f()) {
            return new qrv(null);
        }
        return null;
    }

    private static boolean ah(Context context, String str) {
        if (dup.c(context, str) == 0) {
            rrd.d(2, "GH.FGSServiceUtil", null, "Has %s permission", str);
            return true;
        }
        rrd.d(3, "GH.FGSServiceUtil", null, "Does not have %s permission", str);
        return false;
    }

    public static void m(Context context, yze yzeVar, int i, yzf yzfVar) {
        yzeVar.getClass();
        if (yzeVar == yze.PROTOCOL_IO_ERROR || yzeVar == yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER || yzeVar == yze.PROTOCOL_BYEBYE_REQUESTED_BY_CAR || yzeVar == yze.PREFLIGHT_FAILED || yzeVar == yze.SESSION_OBSOLETE_DUE_TO_NEW_CONNECTION || yzfVar == yzf.BYEBYE_TIMEOUT) {
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(rhz.g);
        intent.addFlags(268435456);
        intent.putExtra("connection_type", i);
        intent.putExtra("error_code", yzeVar.D);
        if (!woy.am(null)) {
            intent.putExtra("error_details", (String) null);
        }
        if (yzfVar != null) {
            intent.putExtra("error_detail_code", yzfVar.az);
        }
        context.startActivity(intent);
    }

    public static String n(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? i != 130 ? String.valueOf(i) : "down" : "right" : "up" : "left" : "forward" : "backward";
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "LEGACY_GMSCORE_FAILURE";
            case 3:
                return "GEARHEAD_BINDING_FAILURE";
            case 4:
                return "GEARHEAD_BINDING_INTERRUPTED";
            case 5:
                return "GEARHEAD_CAR_SERVICE_FAILURE";
            case 6:
                return "GEARHEAD_BINDING_DIED";
            default:
                return "null";
        }
    }

    public static boolean p(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (bArr[i3] != 0) {
                return true;
            }
        }
        return false;
    }

    public static ProgressBar q(Resources resources, ViewGroup viewGroup) {
        ProgressBar progressBar = (ProgressBar) viewGroup.findViewById(R.id.progress_bar);
        progressBar.setIndeterminateDrawable(new vkd(resources.getDimensionPixelSize(R.dimen.car_frx_progress_thickness), new int[]{resources.getColor(R.color.car_frx_progress_color)}));
        progressBar.setProgressDrawable(new vka(resources.getDimensionPixelSize(R.dimen.car_frx_progress_thickness), resources.getColor(R.color.car_frx_progress_color)));
        return progressBar;
    }

    public static String r(Context context, String str) {
        return "<a href=\"https://support.google.com/androidauto/" + str + "\">" + context.getResources().getString(R.string.common_learn_more) + "</a>";
    }

    public static void s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(new int[]{R.attr.carFrxButtonBarLayout});
        viewGroup.addView(layoutInflater.inflate(typedArrayObtainStyledAttributes.getResourceId(0, R.layout.car_frx_buttons), viewGroup, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean t(sdk sdkVar) {
        return sdkVar.d() && sdkVar.b() && sdkVar.c();
    }

    public static /* synthetic */ boolean u(String str) {
        return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_APPLICATION_INSTALLATION_ALLOWED".equals(str) || "EVENT_APPLICATION_INSTALLATION_CANCELLED".equals(str)) ? false : true;
    }

    public static int[] v() {
        return new int[]{1};
    }

    public static void w(Object obj, String str, StringBuilder sb, rbz rbzVar) {
        yfq yfqVarH;
        View view = (View) obj;
        sb.append(rbz.a(view));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            yfl yflVar = new yfl(4);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                yflVar.i(viewGroup.getChildAt(i));
            }
            yfqVarH = yflVar.g();
        } else {
            int i2 = yfq.d;
            yfqVarH = yls.a;
        }
        ynp ynpVarListIterator = yfqVarH.listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            E next = ynpVarListIterator.next();
            sb.append('\n');
            sb.append(str);
            if (ynpVarListIterator.hasNext()) {
                sb.append("├── ");
                w(next, str.concat("│   "), sb, rbzVar);
            } else {
                sb.append("└── ");
                w(next, str.concat("    "), sb, rbzVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int x(Context context, List list) {
        ynp ynpVarListIterator = ((yfq) list).listIterator(0);
        int i = 0;
        while (ynpVarListIterator.hasNext()) {
            Integer num = (Integer) ynpVarListIterator.next();
            int iIntValue = num.intValue();
            if (iIntValue != 8) {
                if (iIntValue != 128) {
                    i |= iIntValue;
                    rrd.d(2, "GH.FGSServiceUtil", null, "Skipping permission checks for %d foreground service type", num);
                } else if (ah(context, "android.permission.RECORD_AUDIO")) {
                    i |= iIntValue;
                }
            } else if (ah(context, "android.permission.ACCESS_COARSE_LOCATION") || ah(context, "android.permission.ACCESS_FINE_LOCATION")) {
                i |= iIntValue;
            }
        }
        return i;
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "PRE_SETUP" : "USB_MONITOR" : "CRASH_HANDLER" : "DEATH_RECIPIENT" : "UNKNOWN";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int z(String str) {
        switch (str.hashCode()) {
            case -2074104415:
                if (str.equals("PRE_SETUP")) {
                    return 5;
                }
                break;
            case -563112609:
                if (str.equals("USB_MONITOR")) {
                    return 4;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return 1;
                }
                break;
            case 858471886:
                if (str.equals("DEATH_RECIPIENT")) {
                    return 2;
                }
                break;
            case 2029551218:
                if (str.equals("CRASH_HANDLER")) {
                    return 3;
                }
                break;
        }
        throw new IllegalArgumentException();
    }

    public qrv(byte[] bArr) {
    }

    @Deprecated
    public void a(KeyEvent keyEvent) {
    }

    public void c(CarCall carCall) {
    }

    public void d(CarCall carCall) {
    }

    public void e(CarCall carCall) {
    }

    public void f(CarCall carCall, List list) {
    }

    public void g(CarCall carCall, List list) {
    }

    public void h(CarCall carCall, List list) {
    }

    public void i(CarCall carCall, CarCall.Details details) {
    }

    public void j(CarCall carCall, CarCall carCall2) {
    }

    public void k(CarCall carCall, String str) {
    }

    public void l(CarCall carCall, int i) {
    }

    public void b(boolean z, int i, int i2) {
    }
}
