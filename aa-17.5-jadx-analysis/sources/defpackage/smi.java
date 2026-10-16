package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientThrottlingTelemetryData;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class smi implements Handler.Callback {
    public static smi d;
    public final Context g;
    public final sjv h;
    public final Handler o;
    public volatile boolean p;
    public final wcp q;
    private TelemetryData t;
    private ClientThrottlingTelemetryData u;
    private spg v;
    private spe w;
    private volatile erb x;
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status b = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object c = new Object();
    private static final Object r = new Object();
    private static volatile boolean s = false;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger i = new AtomicInteger(1);
    public final AtomicInteger j = new AtomicInteger(0);
    public final Map k = new ConcurrentHashMap(5, 0.75f, 1);
    public smb l = null;
    public final Set m = new yy(0);
    public final Set n = new yy(0);

    private smi(Context context, Looper looper, sjv sjvVar) {
        Collections.newSetFromMap(new WeakHashMap());
        Collections.newSetFromMap(new WeakHashMap());
        this.p = true;
        this.g = context;
        sss sssVar = new sss(looper, this);
        this.o = sssVar;
        this.h = sjvVar;
        this.q = new wcp(sjvVar);
        if (spl.b(context)) {
            this.p = false;
        }
        sssVar.sendMessage(sssVar.obtainMessage(6));
    }

    public static Status a(slr slrVar, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + slrVar.a() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    @ResultIgnorabilityUnspecified
    public static smi c(Context context) {
        smi smiVar;
        synchronized (c) {
            smiVar = d;
            if (smiVar == null) {
                Looper looper = soc.a().getLooper();
                boolean zA = soa.a(context.getPackageName());
                s = zA;
                smi smiVar2 = new smi(context.getApplicationContext(), looper, sjv.a);
                if (zA) {
                    snw.u = sny.a(smiVar2.g);
                }
                d = smiVar2;
                smiVar = smiVar2;
            }
        }
        return smiVar;
    }

    @ResultIgnorabilityUnspecified
    private final sme k(sla slaVar) {
        Map map = this.k;
        slr slrVar = slaVar.f;
        sme smeVar = (sme) map.get(slrVar);
        if (smeVar == null) {
            smeVar = new sme(this, slaVar);
            map.put(slrVar, smeVar);
        }
        if (smeVar.q()) {
            this.n.add(slrVar);
        }
        smeVar.d();
        return smeVar;
    }

    private final void l() {
        TelemetryData telemetryData = this.t;
        if (telemetryData != null) {
            if (telemetryData.a > 0 || g()) {
                n().a(telemetryData);
            }
            this.t = null;
        }
    }

    private final void m() {
        ClientThrottlingTelemetryData clientThrottlingTelemetryData = this.u;
        if (clientThrottlingTelemetryData != null) {
            Context context = this.g;
            spe speVar = this.w;
            if (speVar == null) {
                speVar = new spe(context);
                this.w = speVar;
            }
            speVar.a(clientThrottlingTelemetryData);
            this.u = null;
        }
    }

    private final spg n() {
        spg spgVar = this.v;
        if (spgVar != null) {
            return spgVar;
        }
        spg spgVar2 = new spg(this.g, sou.a);
        this.v = spgVar2;
        return spgVar2;
    }

    final sme b(slr slrVar) {
        return (sme) this.k.get(slrVar);
    }

    public final void d(ConnectionResult connectionResult, int i) {
        if (h(connectionResult, i)) {
            return;
        }
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void e() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void f(smb smbVar) {
        synchronized (c) {
            if (this.l != smbVar) {
                this.l = smbVar;
                this.m.clear();
            }
            this.m.addAll(smbVar.e);
        }
    }

    final boolean g() {
        if (this.f) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = sos.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int iE = this.q.e(203400000);
        return iE == -1 || iE == 0;
    }

    @ResultIgnorabilityUnspecified
    final boolean h(ConnectionResult connectionResult, int i) {
        PendingIntent pendingIntentA;
        sjv sjvVar = this.h;
        int i2 = connectionResult.c;
        if (!sjvVar.f(i2)) {
            Log.w("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(String.valueOf(String.valueOf(connectionResult))));
            return false;
        }
        Context context = this.g;
        if (thg.s(context) || (pendingIntentA = sjvVar.a(context, connectionResult)) == null) {
            return false;
        }
        sjvVar.j(context, new ConnectionResult(1, i2, ssn.a(context, GoogleApiActivity.a(context, pendingIntentA, i, true), ssn.a | 134217728), connectionResult.e, connectionResult.f));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smi.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.nok r9, int r10, defpackage.sla r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L76
            slr r3 = r11.f
            boolean r11 = r8.g()
            r0 = 0
            if (r11 != 0) goto Ld
        Lb:
            r1 = r8
            goto L62
        Ld:
            sos r11 = defpackage.sos.a()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r11 = r11.a
            r1 = 1
            if (r11 == 0) goto L48
            boolean r2 = r11.b
            if (r2 != 0) goto L1b
            goto Lb
        L1b:
            boolean r11 = r11.c
            sme r2 = r8.b(r3)
            if (r2 == 0) goto L47
            skv r4 = r2.b
            boolean r5 = r4 instanceof defpackage.snp
            if (r5 != 0) goto L2a
            goto Lb
        L2a:
            snp r4 = (defpackage.snp) r4
            boolean r5 = r4.B()
            if (r5 == 0) goto L47
            boolean r5 = r4.q()
            if (r5 != 0) goto L47
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = defpackage.sms.b(r2, r4, r10)
            if (r11 != 0) goto L3f
            goto Lb
        L3f:
            int r0 = r2.j
            int r0 = r0 + r1
            r2.j = r0
            boolean r1 = r11.c
            goto L48
        L47:
            r1 = r11
        L48:
            sms r0 = new sms
            r4 = 0
            if (r1 == 0) goto L53
            long r6 = java.lang.System.currentTimeMillis()
            goto L54
        L53:
            r6 = r4
        L54:
            if (r1 == 0) goto L5a
            long r4 = android.os.SystemClock.elapsedRealtime()
        L5a:
            r1 = r6
            r6 = r4
            r4 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
        L62:
            if (r0 == 0) goto L76
            java.lang.Object r8 = r9.a
            android.os.Handler r9 = r1.o
            r9.getClass()
            smd r10 = new smd
            r11 = 0
            r10.<init>(r9, r11)
            svz r8 = (defpackage.svz) r8
            r8.i(r10, r0)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smi.i(nok, int, sla):void");
    }

    public final erb j() {
        erb erbVar;
        erb erbVar2 = this.x;
        if (erbVar2 != null) {
            return erbVar2;
        }
        synchronized (r) {
            erbVar = this.x;
            if (erbVar == null) {
                erbVar = new erb((char[]) null, (byte[]) null);
                this.x = erbVar;
            }
        }
        return erbVar;
    }
}
