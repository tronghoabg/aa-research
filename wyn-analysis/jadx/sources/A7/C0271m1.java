package A7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zznm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m7.C3493a;
import n7.C3597b;

/* renamed from: A7.m1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0271m1 extends Y {

    /* renamed from: c, reason: collision with root package name */
    public final ServiceConnectionC0291t1 f953c;

    /* renamed from: d, reason: collision with root package name */
    public F f954d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Boolean f955e;

    /* renamed from: f, reason: collision with root package name */
    public final C0274n1 f956f;

    /* renamed from: g, reason: collision with root package name */
    public final A2.d f957g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f958h;

    /* renamed from: i, reason: collision with root package name */
    public final C0274n1 f959i;

    public C0271m1(C0273n0 c0273n0) {
        super(c0273n0);
        this.f958h = new ArrayList();
        this.f957g = new A2.d(c0273n0.f985n);
        this.f953c = new ServiceConnectionC0291t1(this);
        this.f956f = new C0274n1(this, c0273n0, 0);
        this.f959i = new C0274n1(this, c0273n0, 1);
    }

    @Override // A7.Y
    public final boolean j0() {
        return false;
    }

    public final void k0(C0242d c0242d) {
        boolean zL0;
        c0();
        h0();
        H hK = ((C0273n0) this.f421a).k();
        hK.b0();
        byte[] bArrT0 = U1.T0(c0242d);
        if (bArrT0.length > 131072) {
            hK.zzj().f606g.c("Conditional user property too long for local database. Sending directly to service");
            zL0 = false;
        } else {
            zL0 = hK.l0(2, bArrT0);
        }
        boolean z2 = zL0;
        m0(new RunnableC0280p1(this, w0(true), z2, new C0242d(c0242d), c0242d));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ba A[Catch: all -> 0x0101, SQLiteFullException -> 0x0111, SQLiteException -> 0x019c, SQLiteDatabaseLockedException -> 0x024f, TryCatch #1 {SQLiteFullException -> 0x0111, blocks: (B:59:0x00f8, B:61:0x00fd, B:79:0x0132, B:80:0x0135, B:78:0x012e, B:91:0x014f, B:93:0x0163, B:100:0x017a, B:101:0x017e, B:102:0x0181, B:98:0x0174, B:108:0x0198, B:120:0x01ba, B:121:0x01be, B:122:0x01c1, B:118:0x01b4, B:129:0x01cd, B:130:0x01d9, B:149:0x021c, B:151:0x0236, B:152:0x0241), top: B:268:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x027d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01e4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(A7.F r31, f7.AbstractC2614a r32, A7.N1 r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0271m1.l0(A7.F, f7.a, A7.N1):void");
    }

    public final void m0(Runnable runnable) {
        c0();
        if (r0()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f958h;
        if (arrayList.size() >= 1000) {
            zzj().f605f.c("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f959i.b(60000L);
        p0();
    }

    public final void n0(AtomicReference atomicReference) {
        c0();
        h0();
        m0(new RunnableC0299w0(this, atomicReference, w0(false), 5));
    }

    public final void o0(boolean z2) {
        c0();
        h0();
        boolean zZza = zznm.zza();
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        if ((!zZza || !c0273n0.f979g.o0(null, AbstractC0304y.f1162X0)) && z2) {
            c0273n0.k().m0();
        }
        if (s0()) {
            m0(new RunnableC0283q1(this, w0(false), 4));
        }
    }

    public final void p0() {
        c0();
        h0();
        if (r0()) {
            return;
        }
        if (!t0()) {
            if (((C0273n0) this.f421a).f979g.r0()) {
                return;
            }
            List<ResolveInfo> listQueryIntentServices = ((C0273n0) this.f421a).f973a.getPackageManager().queryIntentServices(new Intent().setClassName(((C0273n0) this.f421a).f973a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                zzj().f605f.c("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            intent.setComponent(new ComponentName(((C0273n0) this.f421a).f973a, "com.google.android.gms.measurement.AppMeasurementService"));
            this.f953c.a(intent);
            return;
        }
        ServiceConnectionC0291t1 serviceConnectionC0291t1 = this.f953c;
        serviceConnectionC0291t1.f1067c.c0();
        Context context = ((C0273n0) serviceConnectionC0291t1.f1067c.f421a).f973a;
        synchronized (serviceConnectionC0291t1) {
            try {
                if (serviceConnectionC0291t1.f1065a) {
                    serviceConnectionC0291t1.f1067c.zzj().f612n.c("Connection attempt already in progress");
                    return;
                }
                if (serviceConnectionC0291t1.f1066b != null && (serviceConnectionC0291t1.f1066b.isConnecting() || serviceConnectionC0291t1.f1066b.isConnected())) {
                    serviceConnectionC0291t1.f1067c.zzj().f612n.c("Already awaiting connection attempt");
                    return;
                }
                serviceConnectionC0291t1.f1066b = new K(context, Looper.getMainLooper(), serviceConnectionC0291t1, serviceConnectionC0291t1, 93);
                serviceConnectionC0291t1.f1067c.zzj().f612n.c("Connecting to remote service");
                serviceConnectionC0291t1.f1065a = true;
                AbstractC1732v.i(serviceConnectionC0291t1.f1066b);
                serviceConnectionC0291t1.f1066b.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q0() {
        c0();
        h0();
        ServiceConnectionC0291t1 serviceConnectionC0291t1 = this.f953c;
        if (serviceConnectionC0291t1.f1066b != null && (serviceConnectionC0291t1.f1066b.isConnected() || serviceConnectionC0291t1.f1066b.isConnecting())) {
            serviceConnectionC0291t1.f1066b.disconnect();
        }
        serviceConnectionC0291t1.f1066b = null;
        try {
            C3493a.b().c(((C0273n0) this.f421a).f973a, this.f953c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f954d = null;
    }

    public final boolean r0() {
        c0();
        h0();
        return this.f954d != null;
    }

    public final boolean s0() {
        c0();
        h0();
        return !t0() || b0().i1() >= ((Integer) AbstractC0304y.f1215t0.a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t0() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0271m1.t0():boolean");
    }

    public final void u0() {
        c0();
        N nZzj = zzj();
        ArrayList arrayList = this.f958h;
        nZzj.f612n.d("Processing queued up service tasks", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e7) {
                zzj().f605f.d("Task exception while flushing queue", e7);
            }
        }
        arrayList.clear();
        this.f959i.a();
    }

    public final void v0() {
        c0();
        A2.d dVar = this.f957g;
        ((C3597b) dVar.f272c).getClass();
        dVar.f271b = SystemClock.elapsedRealtime();
        this.f956f.b(((Long) AbstractC0304y.f1139M.a(null)).longValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:62|(5:64|(1:66)|67|68|83)(1:69)|162|70|(1:67)(5:73|74|166|75|(0)(3:164|78|83))|68|83) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x031e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0269  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A7.N1 w0(boolean r47) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0271m1.w0(boolean):A7.N1");
    }
}
