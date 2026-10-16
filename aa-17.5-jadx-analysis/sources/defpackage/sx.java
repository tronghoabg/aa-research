package defpackage;

import android.view.ViewGroup;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class sx {
    public final Object a;
    public final Object b;

    public sx(epe epeVar, afco afcoVar) {
        afcoVar.getClass();
        this.b = epeVar;
        aitu aituVar = aium.a;
        this.a = afcoVar.plus(ajct.a.i());
    }

    public static /* synthetic */ List m(String str, String str2, fca fcaVar) {
        fcaVar.getClass();
        fbk fbkVarA = fcaVar.a(str);
        try {
            fbkVarA.h(1, str2);
            ArrayList arrayList = new ArrayList();
            while (fbkVarA.k()) {
                arrayList.add(fbkVarA.d(0));
            }
            return arrayList;
        } finally {
            fbkVarA.close();
        }
    }

    public static /* synthetic */ int n(String str, String str2, fca fcaVar) {
        fcaVar.getClass();
        fbk fbkVarA = fcaVar.a(str);
        try {
            fbkVarA.h(1, str2);
            fbkVarA.k();
            return ckf.k(fcaVar);
        } finally {
            fbkVarA.close();
        }
    }

    public static /* synthetic */ List o(String str, fca fcaVar) {
        int i;
        int i2;
        Integer numValueOf;
        fcaVar.getClass();
        fbk fbkVarA = fcaVar.a(str);
        try {
            int iJ = ckf.j(fbkVarA, "id");
            int iJ2 = ckf.j(fbkVarA, "state");
            int iJ3 = ckf.j(fbkVarA, "worker_class_name");
            int iJ4 = ckf.j(fbkVarA, "input_merger_class_name");
            int iJ5 = ckf.j(fbkVarA, "input");
            int iJ6 = ckf.j(fbkVarA, "output");
            int iJ7 = ckf.j(fbkVarA, "initial_delay");
            int iJ8 = ckf.j(fbkVarA, "interval_duration");
            int iJ9 = ckf.j(fbkVarA, "flex_duration");
            int iJ10 = ckf.j(fbkVarA, "run_attempt_count");
            int iJ11 = ckf.j(fbkVarA, "backoff_policy");
            int iJ12 = ckf.j(fbkVarA, "backoff_delay_duration");
            int iJ13 = ckf.j(fbkVarA, "last_enqueue_time");
            int iJ14 = ckf.j(fbkVarA, "minimum_retention_duration");
            int iJ15 = ckf.j(fbkVarA, "schedule_requested_at");
            int iJ16 = ckf.j(fbkVarA, "run_in_foreground");
            int iJ17 = ckf.j(fbkVarA, "out_of_quota_policy");
            int iJ18 = ckf.j(fbkVarA, "period_count");
            int iJ19 = ckf.j(fbkVarA, "generation");
            int iJ20 = ckf.j(fbkVarA, "next_schedule_time_override");
            int iJ21 = ckf.j(fbkVarA, "next_schedule_time_override_generation");
            int iJ22 = ckf.j(fbkVarA, "stop_reason");
            int iJ23 = ckf.j(fbkVarA, "trace_tag");
            int iJ24 = ckf.j(fbkVarA, "backoff_on_system_interruptions");
            int iJ25 = ckf.j(fbkVarA, "required_network_type");
            int iJ26 = ckf.j(fbkVarA, "required_network_request");
            int iJ27 = ckf.j(fbkVarA, "requires_charging");
            int iJ28 = ckf.j(fbkVarA, "requires_device_idle");
            int iJ29 = ckf.j(fbkVarA, "requires_battery_not_low");
            int iJ30 = ckf.j(fbkVarA, "requires_storage_not_low");
            int iJ31 = ckf.j(fbkVarA, "trigger_content_update_delay");
            int iJ32 = ckf.j(fbkVarA, "trigger_max_content_delay");
            int iJ33 = ckf.j(fbkVarA, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (fbkVarA.k()) {
                String strD = fbkVarA.d(iJ);
                int i3 = iJ14;
                ArrayList arrayList2 = arrayList;
                fju fjuVarF = dtb.f((int) fbkVarA.b(iJ2));
                String strD2 = fbkVarA.d(iJ3);
                String strD3 = fbkVarA.d(iJ4);
                byte[] bArrL = fbkVarA.l(iJ5);
                fjc fjcVar = fjc.a;
                fjc fjcVarM = dsr.m(bArrL);
                fjc fjcVarM2 = dsr.m(fbkVarA.l(iJ6));
                long jB = fbkVarA.b(iJ7);
                long jB2 = fbkVarA.b(iJ8);
                long jB3 = fbkVarA.b(iJ9);
                int iB = (int) fbkVarA.b(iJ10);
                int i4 = iJ2;
                int i5 = iJ3;
                int i6 = dtb.i((int) fbkVarA.b(iJ11));
                long jB4 = fbkVarA.b(iJ12);
                long jB5 = fbkVarA.b(iJ13);
                long jB6 = fbkVarA.b(i3);
                int i7 = iJ15;
                long jB7 = fbkVarA.b(i7);
                int i8 = iJ;
                int i9 = iJ16;
                boolean z = ((int) fbkVarA.b(i9)) != 0;
                int i10 = iJ17;
                int i11 = iJ4;
                int iK = dtb.k((int) fbkVarA.b(i10));
                int i12 = iJ18;
                int i13 = iJ5;
                int iB2 = (int) fbkVarA.b(i12);
                int i14 = iJ19;
                int iB3 = (int) fbkVarA.b(i14);
                int i15 = iJ20;
                long jB8 = fbkVarA.b(i15);
                int i16 = iJ21;
                int iB4 = (int) fbkVarA.b(i16);
                int i17 = iJ22;
                int iB5 = (int) fbkVarA.b(i17);
                int i18 = iJ23;
                Boolean boolValueOf = null;
                String strD4 = fbkVarA.j(i18) ? null : fbkVarA.d(i18);
                int i19 = iJ24;
                if (fbkVarA.j(i19)) {
                    i = iB4;
                    i2 = i17;
                    numValueOf = null;
                } else {
                    i = iB4;
                    i2 = i17;
                    numValueOf = Integer.valueOf((int) fbkVarA.b(i19));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i20 = iJ25;
                Boolean bool = boolValueOf;
                int iJ34 = dtb.j((int) fbkVarA.b(i20));
                int i21 = iJ26;
                Cfor cforG = dtb.g(fbkVarA.l(i21));
                iJ25 = i20;
                iJ26 = i21;
                int i22 = iJ27;
                boolean z2 = ((int) fbkVarA.b(i22)) != 0;
                iJ27 = i22;
                int i23 = iJ28;
                boolean z3 = ((int) fbkVarA.b(i23)) != 0;
                int i24 = iJ29;
                boolean z4 = ((int) fbkVarA.b(i24)) != 0;
                iJ29 = i24;
                int i25 = iJ30;
                int i26 = iJ31;
                int i27 = iJ32;
                int i28 = iJ33;
                iJ33 = i28;
                arrayList2.add(new fod(strD, fjuVarF, strD2, strD3, fjcVarM, fjcVarM2, jB, jB2, jB3, new fja(cforG, iJ34, z2, z3, z4, ((int) fbkVarA.b(i25)) != 0, fbkVarA.b(i26), fbkVarA.b(i27), dtb.h(fbkVarA.l(i28))), iB, i6, jB4, jB5, jB6, jB7, z, iK, iB2, iB3, jB8, i, iB5, strD4, bool));
                iJ30 = i25;
                iJ4 = i11;
                iJ17 = i10;
                iJ19 = i14;
                iJ22 = i2;
                iJ24 = i19;
                iJ31 = i26;
                iJ32 = i27;
                iJ2 = i4;
                iJ14 = i3;
                iJ3 = i5;
                arrayList = arrayList2;
                iJ = i8;
                iJ15 = i7;
                iJ16 = i9;
                iJ20 = i15;
                iJ21 = i16;
                iJ23 = i18;
                iJ28 = i23;
                iJ5 = i13;
                iJ18 = i12;
            }
            return arrayList;
        } finally {
            fbkVarA.close();
        }
    }

    public static /* synthetic */ afak p(String str, String str2, fca fcaVar) {
        fcaVar.getClass();
        fbk fbkVarA = fcaVar.a(str);
        try {
            fbkVarA.h(1, str2);
            fbkVarA.k();
            fbkVarA.close();
            return afak.a;
        } catch (Throwable th) {
            fbkVarA.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean q(java.lang.String r3, java.lang.String r4, defpackage.fca r5) {
        /*
            r5.getClass()
            fbk r3 = r5.a(r3)
            r5 = 1
            r3.h(r5, r4)     // Catch: java.lang.Throwable -> L1f
            boolean r4 = r3.k()     // Catch: java.lang.Throwable -> L1f
            r0 = 0
            if (r4 == 0) goto L1a
            long r1 = r3.b(r0)     // Catch: java.lang.Throwable -> L1f
            int r4 = (int) r1
            if (r4 == 0) goto L1a
            goto L1b
        L1a:
            r5 = r0
        L1b:
            r3.close()
            return r5
        L1f:
            r4 = move-exception
            r3.close()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx.q(java.lang.String, java.lang.String, fca):boolean");
    }

    public static sx v(ViewGroup viewGroup) {
        return (sx) viewGroup.getTag(R.id.transition_current_scene);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final ActionStrip a() {
        if (this.a.isEmpty()) {
            throw new IllegalStateException("Action strip must contain at least one action");
        }
        return new ActionStrip(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final void b(Action action) {
        action.getClass();
        int type = action.getType();
        if (type != 1 && this.b.contains(Integer.valueOf(type))) {
            Objects.toString(action);
            throw new IllegalArgumentException("Duplicated action types are disallowed: ".concat(action.toString()));
        }
        CarText title = action.getTitle();
        if (title != null) {
            wi.a.a(title);
        }
        this.b.add(Integer.valueOf(type));
        this.a.add(action);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final btj c(btp btpVar) {
        return (btj) this.b.get(btpVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void d(btp btpVar) {
        ?? r0 = this.b;
        btj btjVar = (btj) r0.get(btpVar);
        if (btjVar != null) {
        }
        r0.remove(btpVar);
    }

    public final float e() {
        return ((amv) this.a).b();
    }

    public final float f() {
        return ((Number) ((amv) this.a).b.a()).floatValue();
    }

    public final bqr g() {
        return (bqr) ((amv) this.a).g();
    }

    public final bqr h() {
        return (bqr) ((amv) this.a).i();
    }

    public final bqr i() {
        return (bqr) ((amv) this.a).j();
    }

    public final void j(dol dolVar, float f) {
        String strG = vy.g(dolVar.b);
        dpf dpfVar = new dpf(new char[0]);
        dpfVar.q(dpn.a(dolVar.a.toString()));
        dpfVar.q(dpn.a(strG));
        dpfVar.q(new dpj(f));
        dpfVar.q(new dpj(BitmapDescriptorFactory.HUE_RED));
        ((dpg) this.b).r((String) this.a, dpfVar);
    }

    public final void k(dok dokVar, float f) {
        String strF = vy.f(dokVar.b);
        dpf dpfVar = new dpf(new char[0]);
        dpfVar.q(dpn.a(dokVar.a.toString()));
        dpfVar.q(dpn.a(strF));
        dpfVar.q(new dpj(f));
        dpfVar.q(new dpj(BitmapDescriptorFactory.HUE_RED));
        ((dpg) this.b).r((String) this.a, dpfVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    public final ctp l() {
        return (ctp) this.a.a();
    }

    public final void r() {
        synchronized (this) {
            Object obj = this.a;
            ((AtomicInteger) obj).decrementAndGet();
            if (((AtomicInteger) obj).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean s() {
        synchronized (this) {
            if (((AtomicBoolean) this.b).get()) {
                return false;
            }
            ((AtomicInteger) this.a).incrementAndGet();
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afco, java.lang.Object] */
    public final Object t(Object obj, afck afckVar) {
        Object objA = ahnc.a(this.a, new ehs(this, obj, (afck) null, 3), afckVar);
        return objA == afcr.a ? objA : afak.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afco, java.lang.Object] */
    public final Object u(eqj eqjVar, afck afckVar) {
        return ahnc.a(this.a, new ehs(this, eqjVar, (afck) null, 4), afckVar);
    }

    public final void w(gjv gjvVar, dsz dszVar) {
        ((ajdr) this.b).e(new ae(this, gjvVar, dszVar, 12));
    }

    public final void x(gjv gjvVar, int i) {
        ((ajdr) this.b).e(new fow((fkm) this.a, gjvVar, false, i));
    }

    public sx(dpl dplVar, int i) {
        this.b = dplVar;
        this.a = vy.g(i);
    }

    public sx(dpl dplVar, int i, byte[] bArr) {
        this.b = dplVar;
        this.a = vy.f(i);
    }

    public sx(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public sx(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public sx() {
        this.a = new ArrayList();
        this.b = new HashSet();
    }

    public sx(bqr bqrVar, afec afecVar) {
        this.a = new amv(bqrVar);
        this.b = afecVar;
    }

    public sx(afhe afheVar, afec afecVar) {
        this.a = afheVar;
        this.b = afecVar;
    }

    public sx(char[] cArr) {
        this.a = new AtomicInteger(0);
        this.b = new AtomicBoolean(false);
    }

    public sx(byte[] bArr) {
        this.b = new LinkedHashMap();
        this.a = new LinkedHashMap();
    }

    public sx(fkm fkmVar, ajdr ajdrVar) {
        fkmVar.getClass();
        ajdrVar.getClass();
        this.a = fkmVar;
        this.b = ajdrVar;
    }

    public sx(cxb cxbVar, ctp ctpVar) {
        this.b = cxbVar;
        this.a = new ParcelableSnapshotMutableState(ctpVar, bxp.c);
    }

    public sx(String str, String str2, byte[] bArr) {
        str2.getClass();
        this.b = str;
        this.a = str2;
    }

    public sx(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }
}
