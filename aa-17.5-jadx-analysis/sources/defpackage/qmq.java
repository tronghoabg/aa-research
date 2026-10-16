package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qmq extends qmf {
    public boolean a;
    public long c;
    private final qmm d;
    private final qnf e;
    private final qne f;
    private final qml g;
    private final qmv h;
    private final qmv i;
    private boolean j;
    private final ajzn k;

    protected qmq(qmh qmhVar) {
        super(qmhVar);
        this.f = new qne(qmhVar);
        this.d = new qmm(qmhVar);
        this.e = new qnf(qmhVar);
        this.g = new qml(qmhVar);
        q();
        this.k = new ajzn((byte[]) null);
        this.h = new qmo(this, qmhVar);
        this.i = new qmp(this, qmhVar);
    }

    private final void E() {
        qmq qmqVar;
        qmv qmvVar = this.h;
        if (qmvVar.e()) {
            qmqVar = this;
            super.p(2, "All hits dispatched or no network/service. Going to power save mode", null, null, null);
        } else {
            qmqVar = this;
        }
        qmvVar.c();
        qmx qmxVarK = qmqVar.k();
        if (qmxVarK.c) {
            qmxVarK.a();
        }
    }

    private final void F() {
        long jI;
        qmx qmxVarK = k();
        if (qmxVarK.a && !qmxVarK.c) {
            qlk.b();
            s();
            try {
                qmm qmmVar = this.d;
                qlk.b();
                qmmVar.s();
                jI = qmmVar.I(qmm.c, null);
            } catch (SQLiteException e) {
                super.p(6, "Failed to get min/max hit times from local store", e, null, null);
                jI = 0;
            }
            if (jI != 0) {
                q();
                long jAbs = Math.abs(System.currentTimeMillis() - jI);
                j();
                if (jAbs <= ((Long) qmy.h.f()).longValue()) {
                    j();
                    super.p(2, "Dispatch alarm scheduled (ms)", Long.valueOf(qmu.c()), null, null);
                    qmxVarK.c();
                }
            }
        }
    }

    private final void G(qmi qmiVar, qlo qloVar) {
        spu.aw(qmiVar);
        spu.aw(qloVar);
        qkx qkxVar = new qkx(this.b);
        String str = qmiVar.b;
        spu.at(str);
        Uri uriA = qky.a(str);
        ListIterator listIterator = qkxVar.b().listIterator();
        while (listIterator.hasNext()) {
            if (uriA.equals(((qlm) listIterator.next()).b())) {
                listIterator.remove();
            }
        }
        List listB = qkxVar.b();
        qmh qmhVar = qkxVar.a;
        listB.add(new qky(qmhVar, str));
        qkxVar.b = qmiVar.c;
        qlc qlcVar = new qlc(qkxVar.h);
        qmn qmnVar = qmhVar.i;
        qmh.g(qmnVar);
        qmnVar.s();
        qlcVar.c(qmnVar.a);
        qmw qmwVar = qmhVar.j;
        qmwVar.s();
        DisplayMetrics displayMetrics = qmwVar.g().b.getResources().getDisplayMetrics();
        qls qlsVar = new qls();
        qlsVar.a = roc.be(Locale.getDefault());
        qlsVar.b = displayMetrics.widthPixels;
        qlsVar.c = displayMetrics.heightPixels;
        qlcVar.c(qlsVar);
        Iterator it = qkxVar.i.iterator();
        while (it.hasNext()) {
            ((qld) it.next()).a();
        }
        qlw qlwVar = (qlw) qlcVar.a(qlw.class);
        qlwVar.a = "data";
        qlwVar.f = true;
        qlcVar.c(qloVar);
        qlr qlrVar = (qlr) qlcVar.a(qlr.class);
        qln qlnVar = (qln) qlcVar.a(qln.class);
        for (Map.Entry entry : qmiVar.e.entrySet()) {
            String strSubstring = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(strSubstring)) {
                qlnVar.a = str2;
            } else if ("av".equals(strSubstring)) {
                qlnVar.b = str2;
            } else if ("aid".equals(strSubstring)) {
                qlnVar.c = str2;
            } else if ("aiid".equals(strSubstring)) {
                qlnVar.d = str2;
            } else if ("uid".equals(strSubstring)) {
                qlwVar.c = str2;
            } else {
                spu.at(strSubstring);
                if (strSubstring != null && strSubstring.startsWith("&")) {
                    strSubstring = strSubstring.substring(1);
                }
                spu.au(strSubstring, "Name can not be empty or \"&\"");
                qlrVar.a.put(strSubstring, str2);
            }
        }
        super.p(3, "Sending installation campaign to", str, qloVar, null);
        qlcVar.d = m().a();
        qlf qlfVar = qlcVar.a;
        if (qlcVar.f) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (qlcVar.b) {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        qlc qlcVar2 = new qlc(qlcVar);
        qlcVar2.e = SystemClock.elapsedRealtime();
        long j = qlcVar2.d;
        if (j != 0) {
            qlcVar2.c = j;
        } else {
            qlcVar2.c = System.currentTimeMillis();
        }
        qlk qlkVar = qlfVar.g;
        qlcVar2.b = true;
        qlkVar.d.execute(new qfa(qlkVar, qlcVar2, 17, (short[]) null));
    }

    private final boolean H(String str) {
        return spz.b(f()).b(str) == 0;
    }

    public final void A() {
        s();
        qlk.b();
        this.j = true;
        this.g.a();
        B();
    }

    public final void B() {
        long jMin;
        long jAbs;
        qlk.b();
        s();
        if (!this.j) {
            j();
            if (a() > 0) {
                if (this.d.E()) {
                    this.f.c();
                    E();
                    return;
                }
                if (!((Boolean) qmy.z.f()).booleanValue()) {
                    qne qneVar = this.f;
                    qneVar.b();
                    if (!qneVar.c) {
                        Context contextA = qneVar.a();
                        dup.e(contextA, qneVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, 4);
                        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                        intentFilter.addCategory(contextA.getPackageName());
                        dup.e(contextA, qneVar, intentFilter, null, 4);
                        qneVar.d = qneVar.d();
                        qneVar.b.e().p(2, "Registering connectivity change receiver. Network connected", Boolean.valueOf(qneVar.d), null, null);
                        qneVar.c = true;
                    }
                    if (!qneVar.d) {
                        E();
                        F();
                        return;
                    }
                }
                F();
                long jA = a();
                long jC = m().c();
                if (jC != 0) {
                    q();
                    jMin = jA - Math.abs(System.currentTimeMillis() - jC);
                    if (jMin <= 0) {
                        j();
                        jMin = Math.min(qmu.d(), jA);
                    }
                } else {
                    j();
                    jMin = Math.min(qmu.d(), jA);
                }
                super.p(2, "Dispatch scheduled (ms)", Long.valueOf(jMin), null, null);
                qmv qmvVar = this.h;
                if (!qmvVar.e()) {
                    qmvVar.d(jMin);
                    return;
                }
                if (qmvVar.d == 0) {
                    jAbs = 0;
                } else {
                    qmh qmhVar = qmvVar.b;
                    jAbs = Math.abs(System.currentTimeMillis() - qmvVar.d);
                }
                long jMax = Math.max(1L, jMin + jAbs);
                if (qmvVar.e()) {
                    if (jMax < 0) {
                        qmvVar.c();
                        return;
                    }
                    long jAbs2 = jMax - Math.abs(System.currentTimeMillis() - qmvVar.d);
                    long j = jAbs2 >= 0 ? jAbs2 : 0L;
                    Handler handlerB = qmvVar.b();
                    Runnable runnable = qmvVar.c;
                    handlerB.removeCallbacks(runnable);
                    if (qmvVar.b().postDelayed(runnable, j)) {
                        return;
                    }
                    qmvVar.b.e().p(6, "Failed to adjust delayed post. time", Long.valueOf(j), null, null);
                    return;
                }
                return;
            }
        }
        this.f.c();
        E();
    }

    public final long C(qmi qmiVar) {
        s();
        qlk.b();
        try {
            try {
                qmm qmmVar = this.d;
                qmmVar.x();
                String str = qmiVar.a;
                qmmVar.F(str);
                String str2 = qmiVar.b;
                spu.at(str);
                spu.at(str2);
                qmmVar.s();
                qlk.b();
                long jI = qmmVar.I("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{CloudRecognizerProtocolStrings.DBG_VALUE, str, str2});
                qmiVar.d = 1 + jI;
                qmmVar.D(qmiVar);
                qmmVar.C();
                try {
                    this.d.A();
                    return jI;
                } catch (SQLiteException e) {
                    super.p(6, "Failed to end transaction", e, null, null);
                    return jI;
                }
            } catch (SQLiteException e2) {
                super.p(6, "Failed to update Analytics property", e2, null, null);
                try {
                    this.d.A();
                    return -1L;
                } catch (SQLiteException e3) {
                    super.p(6, "Failed to end transaction", e3, null, null);
                    return -1L;
                }
            }
        } finally {
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void D(defpackage.ykd r22) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmq.D(ykd):void");
    }

    public final long a() {
        j();
        long jLongValue = ((Long) qmy.e.f()).longValue();
        qni qniVarN = n();
        qniVarN.s();
        if (!qniVarN.d) {
            return jLongValue;
        }
        n().s();
        return r4.e * 1000;
    }

    @Override // defpackage.qmf
    protected final void b() {
        this.d.t();
        this.e.t();
        this.g.t();
    }

    protected final void c() {
        qnb qnbVar;
        if (this.j) {
            return;
        }
        j();
        if (qmu.k()) {
            qml qmlVar = this.g;
            if (qmlVar.v()) {
                return;
            }
            j();
            long jLongValue = ((Long) qmy.C.f()).longValue();
            ajzn ajznVar = this.k;
            if (ajznVar.e(jLongValue)) {
                ajznVar.d();
                super.p(2, "Connecting to service", null, null, null);
                qlk.b();
                qmlVar.s();
                if (qmlVar.c == null) {
                    qmk qmkVar = qmlVar.a;
                    qml qmlVar2 = qmkVar.b;
                    qlk.b();
                    Intent intent = new Intent("com.google.android.gms.analytics.service.START");
                    intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
                    Context contextF = qmlVar2.f();
                    intent.putExtra("app_package_name", contextF.getPackageName());
                    spi spiVarA = spi.a();
                    synchronized (qmkVar) {
                        qnbVar = null;
                        qmkVar.c = null;
                        qmkVar.a = true;
                        qml qmlVar3 = qmkVar.b;
                        boolean zD = spiVarA.d(contextF, intent, qmlVar3.a, 129);
                        qmlVar3.p(2, "Bind to service requested", Boolean.valueOf(zD), null, null);
                        if (zD) {
                            try {
                                qmlVar3.j();
                                qmkVar.wait(((Long) qmy.B.f()).longValue());
                            } catch (InterruptedException unused) {
                                qmkVar.b.p(5, "Wait for service connect was interrupted", null, null, null);
                            }
                            qmkVar.a = false;
                            qnb qnbVar2 = qmkVar.c;
                            qmkVar.c = null;
                            if (qnbVar2 == null) {
                                qmkVar.b.p(6, "Successfully bound to service but never got onServiceConnected callback", null, null, null);
                            }
                            qnbVar = qnbVar2;
                        } else {
                            qmkVar.a = false;
                        }
                    }
                    if (qnbVar == null) {
                        return;
                    }
                    qmlVar.c = qnbVar;
                    qmlVar.e();
                }
                super.p(2, "Connected to service", null, null, null);
                ajznVar.c();
                w();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.qna r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmq.d(qna):void");
    }

    public final void e() {
        qmq qmqVar;
        try {
            this.d.G();
            B();
            qmqVar = this;
        } catch (SQLiteException e) {
            qmqVar = this;
            super.p(5, "Failed to delete stale hits", e, null, null);
        }
        qmv qmvVar = qmqVar.i;
        qmqVar.j();
        qmvVar.d(86400000L);
    }

    public final void v(qmi qmiVar) {
        qlk.b();
        super.p(3, "Sending first hit to property", qmiVar.b, null, null);
        ajzn ajznVarW = m().w();
        j();
        if (ajznVarW.e(qmu.b())) {
            return;
        }
        String strD = m().d();
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        qlo qloVarBd = roc.bd(l(), strD);
        super.p(3, "Found relevant installation campaign", qloVarBd, null, null);
        G(qmiVar, qloVarBd);
    }

    public final void w() {
        qmq qmqVar;
        qlk.b();
        j();
        qlk.b();
        s();
        j();
        j();
        if (qmu.k()) {
            qmqVar = this;
        } else {
            super.p(5, "Service client disabled. Can't dispatch local hits to device AnalyticsService", null, null, null);
            qmqVar = this;
        }
        qml qmlVar = qmqVar.g;
        if (!qmlVar.v()) {
            super.p(2, "Service not connected", null, null, null);
            return;
        }
        qmm qmmVar = qmqVar.d;
        if (qmmVar.E()) {
            return;
        }
        super.p(2, "Dispatching local hits to device AnalyticsService", null, null, null);
        while (true) {
            try {
                qmqVar.j();
                List listE = qmmVar.e(qmu.g());
                if (listE.isEmpty()) {
                    qmqVar.B();
                    return;
                }
                while (!listE.isEmpty()) {
                    qna qnaVar = (qna) listE.get(0);
                    if (!qmlVar.w(qnaVar)) {
                        qmqVar.B();
                        return;
                    }
                    listE.remove(qnaVar);
                    try {
                        qmmVar.y(qnaVar.c);
                    } catch (SQLiteException e) {
                        super.p(6, "Failed to remove hit that was send for delivery", e, null, null);
                        qmqVar.E();
                        return;
                    }
                }
            } catch (SQLiteException e2) {
                super.p(6, "Failed to read hits from store", e2, null, null);
                qmqVar.E();
                return;
            }
        }
    }

    public final void x() {
        qlk.b();
        s();
        super.p(2, "Service disconnected", null, null, null);
    }

    public final void y(String str) {
        spu.at(str);
        qlk.b();
        j();
        qlo qloVarBd = roc.bd(l(), str);
        if (qloVarBd == null) {
            super.p(5, "Parsing failed. Ignoring invalid campaign data", str, null, null);
            return;
        }
        String strD = m().d();
        if (str.equals(strD)) {
            super.p(5, "Ignoring duplicate install campaign", null, null, null);
            return;
        }
        if (!TextUtils.isEmpty(strD)) {
            super.p(6, "Ignoring multiple install campaigns. original, new", strD, str, null);
            return;
        }
        m().e(str);
        ajzn ajznVarW = m().w();
        j();
        if (ajznVarW.e(qmu.b())) {
            super.p(5, "Campaign received too late, ignoring", qloVarBd, null, null);
            return;
        }
        super.p(3, "Received installation campaign", qloVarBd, null, null);
        Iterator it = this.d.H().iterator();
        while (it.hasNext()) {
            G((qmi) it.next(), qloVarBd);
        }
    }

    public final void z() {
        qmq qmqVar;
        boolean zBg;
        s();
        j();
        qlk.b();
        Context context = this.b.b;
        if (roc.bj(context)) {
            qmqVar = this;
            if (!roc.bi(context)) {
                super.p(6, "AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.", null, null, null);
            }
        } else {
            super.p(5, "AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.", null, null, null);
            qmqVar = this;
        }
        spu.aw(context);
        Boolean bool = qkz.a;
        if (bool != null) {
            zBg = bool.booleanValue();
        } else {
            zBg = roc.bg(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
            qkz.a = Boolean.valueOf(zBg);
        }
        if (!zBg) {
            super.p(5, "CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.", null, null, null);
        }
        qmqVar.m().a();
        if (!qmqVar.H("android.permission.ACCESS_NETWORK_STATE")) {
            super.p(6, "Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions", null, null, null);
            qmqVar.A();
        }
        if (!qmqVar.H("android.permission.INTERNET")) {
            super.p(6, "Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions", null, null, null);
            qmqVar.A();
        }
        if (roc.bi(qmqVar.f())) {
            super.p(2, "AnalyticsService registered in the app manifest and enabled", null, null, null);
        } else {
            qmqVar.j();
            super.p(5, "AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.", null, null, null);
        }
        if (!qmqVar.j) {
            qmqVar.j();
            if (!qmqVar.d.E()) {
                qmqVar.c();
            }
        }
        qmqVar.B();
    }
}
