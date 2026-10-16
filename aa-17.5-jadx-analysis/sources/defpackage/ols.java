package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import com.google.android.gms.car.display.CarRegionId;
import java.io.PrintWriter;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class ols {
    public static final boolean A(qrn qrnVar, String str, int i) throws qrz {
        return qrnVar.a().q(str, i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aezk, java.lang.Object] */
    public static final void B(qrn qrnVar, CarDisplayId carDisplayId, rcg rcgVar) throws qrz {
        rdx rdxVarL = ((qsz) qrnVar).d().L(carDisplayId);
        ((rox) rdxVarL.f.a()).g(new rcu(rdxVarL, rcgVar, 7));
    }

    public static final void C(qrn qrnVar, String str, boolean z) throws qrz {
        qrnVar.a().n(str, z);
    }

    public static final void D(qrn qrnVar, String str, String str2) throws qrz {
        qrnVar.a().o(str, str2);
    }

    public static final void E(qrn qrnVar, CarRegionId carRegionId) throws qrz {
        rdm rdmVarD = ((qsz) qrnVar).d();
        rdmVarD.f.g(new rcu(rdmVarD, carRegionId, 4, null));
    }

    public static final void F(qrn qrnVar, CarDisplayId carDisplayId, rcg rcgVar) throws qrz {
        rdx rdxVarL = ((qsz) qrnVar).d().L(carDisplayId);
        ((lah) rdxVarL.d).F(new rcs(rcgVar, 5));
    }

    public static /* synthetic */ String G(int i) {
        return i != 1 ? i != 2 ? "null" : "CAR_SERVICE_LITE" : "CAR_SERVICE_DEFAULT";
    }

    public static Intent H(String str, int i, long j) {
        Intent intent = new Intent(str);
        intent.putExtra("stage_state", i);
        intent.putExtra("event_time_since_boot", j);
        return intent;
    }

    public static xxh I(Intent intent, String str) {
        return intent.hasExtra(str) ? new xxm(Integer.valueOf(intent.getIntExtra(str, -1))) : xvy.a;
    }

    public static Enum J(Intent intent, Enum[] enumArr) throws rrt {
        intent.getClass();
        enumArr.getClass();
        int intExtra = intent.getIntExtra("stage_state", -1);
        if (intExtra == -1) {
            throw new rrt("missing the stage_state extra");
        }
        if (intExtra < 0 || intExtra >= enumArr.length) {
            throw new rrt(String.format("out of bounds %s extra: %d", "stage_state", Integer.valueOf(intExtra)));
        }
        return enumArr[intExtra];
    }

    public static void K(Context context, String str, int i, Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Intent intentH = H(str, i, jElapsedRealtime);
        intentH.setPackage("com.google.android.projection.gearhead");
        Intent intentH2 = H(str, i, jElapsedRealtime);
        if (bundle != null) {
            intentH.putExtras(bundle);
            intentH2.putExtras(bundle);
        }
        P(context, intentH);
        etb.a(context).d(intentH2);
    }

    public static void L(Context context, String str, Enum r2, Bundle bundle) {
        K(context, str, r2.ordinal(), bundle);
    }

    public static void M(Context context, yxi yxiVar) {
        Intent intentT = T(yxiVar);
        P(context, intentT);
        etb.a(context).d(intentT);
        if (rla.n()) {
            rla.m().k(yxiVar);
        }
    }

    public static void N(Context context, yxi yxiVar, int i) {
        Intent intentT = T(yxiVar);
        intentT.putExtra("event_detail", i);
        etb.a(context).d(intentT);
        P(context, intentT);
        if (rla.n()) {
            rla.m().k(yxiVar);
        }
    }

    public static void O(Context context, yxi yxiVar, yxo yxoVar) {
        Intent intent = new Intent("com.google.android.gms.car.CONNECTIVITY_EVENT");
        intent.putExtra("event_type", yxiVar.pC);
        intent.putExtra("event_time_since_boot", SystemClock.elapsedRealtime());
        intent.putExtra("event_detail", yxoVar.r);
        intent.setPackage("com.google.android.projection.gearhead");
        P(context, intent);
    }

    public static void P(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static void Q(Context context, rrx rrxVar, int i) {
        Bundle bundle;
        if (i != 0) {
            bundle = new Bundle();
            bundle.putInt("failure_reason", i - 1);
        } else {
            bundle = null;
        }
        K(context, "com.google.android.gms.car.AUTHORIZATION", rrxVar.ordinal(), bundle);
    }

    public static yph R(String str) {
        return new yph(yqn.d(String.valueOf(str).concat(".LITE")));
    }

    public static void S(PrintWriter printWriter) {
        tez.d(printWriter, tey.c);
    }

    private static Intent T(yxi yxiVar) {
        Intent intent = new Intent("com.google.android.gms.car.CONNECTIVITY_EVENT");
        intent.putExtra("event_type", yxiVar.pC);
        intent.putExtra("event_time_since_boot", SystemClock.elapsedRealtime());
        intent.setPackage("com.google.android.projection.gearhead");
        return intent;
    }

    public static void a(View view, Consumer consumer) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ons(view, consumer));
    }

    public static void b(View view, Function function) {
        view.getViewTreeObserver().addOnPreDrawListener(new onr(view, function));
    }

    public static void c(Window window, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            ebh.d(window, false);
            window.setNavigationBarColor(0);
            if (view != null) {
                d(view);
            }
        }
    }

    public static void d(View view) {
        final int paddingBottom = view.getPaddingBottom();
        eaj eajVar = new eaj() { // from class: onp
            @Override // defpackage.eaj
            public final ecy a(View view2, ecy ecyVar) {
                int i = ecyVar.f(2).e;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), paddingBottom + i);
                return ecyVar;
            }
        };
        int[] iArr = ebm.a;
        ebe.e(view, eajVar);
    }

    public static void e(View view, int i) {
        View view2 = (View) view.getParent();
        view2.post(new oa(view, i, view2, 10, null));
    }

    public static final void f(qrn qrnVar, CarDisplayId carDisplayId, ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) throws qrz {
        rdm rdmVarD = ((qsz) qrnVar).d();
        if (!rdmVarD.p(raj.F)) {
            throw new IllegalStateException("This API can only be used if coolwalk is enabled");
        }
        rdmVarD.f.g(new rdb(rdmVarD, carDisplayId, projectionWindowAnimationChoreography, 0));
    }

    @Deprecated
    public static final zgp g(qrn qrnVar) throws qrz {
        rdm rdmVarD = ((qsz) qrnVar).d();
        return (zgp) rdmVarD.f.b(new rcl(rdmVarD, 3));
    }

    public static final boolean h(qrn qrnVar, String str) throws qrz {
        return qrnVar.a().N(str);
    }

    public static final rnx i(qrn qrnVar) throws qrz, qsa {
        return qrnVar.a().r();
    }

    public static final roa j(qrn qrnVar) throws qrz, qsa {
        return qrnVar.a().s();
    }

    public static final qrh k(qrn qrnVar) throws qrz, qsa {
        return qrnVar.a().b();
    }

    public static final rij l(qrn qrnVar) throws qrz, qsa {
        return qrnVar.a().e();
    }

    public static final rjg m(qrn qrnVar) {
        rdm rdmVarD = ((qsz) qrnVar).d();
        return (rjg) rdmVarD.f.c(new rcl(rdmVarD, 19));
    }

    public static final rjs n(qrn qrnVar) throws qrz, qsa {
        rdm rdmVarD = ((qsz) qrnVar).d();
        return (rjs) rdmVarD.f.a(new rdw(rdmVarD, 1));
    }

    public static final rob o(qrn qrnVar, CarDisplayId carDisplayId) throws qrz, qsa {
        return qrnVar.a().t(carDisplayId);
    }

    public static final rjt p(qrn qrnVar) throws qrz, qsa {
        return ((qsz) qrnVar).d().f();
    }

    public static final rju q(qrn qrnVar) throws qrz, qsa {
        return ((qsz) qrnVar).d().g();
    }

    public static final rhj r(qrn qrnVar) throws qrz, qsa {
        rdm rdmVarD = ((qsz) qrnVar).d();
        return (rhj) rdmVarD.f.a(new rcl(rdmVarD, 15));
    }

    public static final roe s(qrn qrnVar) throws qrz {
        return qrnVar.a().w();
    }

    public static final qsb t(qrn qrnVar) throws qrz, qsa {
        return qrnVar.a().d();
    }

    @Deprecated
    public static final sab u(qrn qrnVar) throws qrz, qsa {
        return ((qsz) qrnVar).d().h(CarDisplayId.a);
    }

    public static final sab v(qrn qrnVar, CarDisplayId carDisplayId) throws qrz, qsa {
        return qrnVar.a().h(carDisplayId);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aezk, java.lang.Object] */
    public static final CarDisplayUiFeatures w(qrn qrnVar, CarDisplayId carDisplayId) throws qrz {
        rdx rdxVarL = ((qsz) qrnVar).d().L(carDisplayId);
        return (CarDisplayUiFeatures) ((rox) rdxVarL.f.a()).b(new rdw(rdxVarL, 2));
    }

    public static final rjr x(qrn qrnVar, CarDisplayId carDisplayId) throws qrz, qsa {
        rdm rdmVarD = ((qsz) qrnVar).d();
        return (rjr) rdmVarD.f.a(new rcy(rdmVarD, carDisplayId, 0));
    }

    public static final String y(qrn qrnVar, String str, String str2) throws qrz {
        return qrnVar.a().D(str, str2);
    }

    public static final boolean z(qrn qrnVar, raj rajVar) {
        return qrnVar.a().p(rajVar);
    }
}
