package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.format.DateFormat;
import android.util.Pair;
import android.util.SparseBooleanArray;
import com.google.android.gms.car.AudioPolicyMixData;
import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CreateAudioPolicyRequest;
import com.google.android.gms.car.CreateAudioRecordRequest;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import com.google.android.gms.car.diagnostics.ConnectionState;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qso implements qsk, rej, rwe, rut {
    public static final ypf a = ols.R("CAR.SERVICE");
    private qsj A;
    private ruw B;
    private final Context C;
    private HandlerThread D;
    private rjb E;
    private final rxr G;
    private final rhw H;
    private final boolean I;
    private final ygr J;
    public final rwb b;
    public final qss d;
    public final Context e;
    public volatile int h;
    public qrg i;
    public CarInfoInternal j;
    public final rwz n;
    private volatile boolean p;
    private CountDownLatch q;
    private final qst r;
    private qsm s;
    private CarBluetoothData v;
    private qsn w;
    private int x;
    private volatile qqt y;
    private volatile qqv z;
    public final Map c = new ConcurrentHashMap();
    final Handler f = new sss(Looper.getMainLooper());
    public final SparseBooleanArray g = new SparseBooleanArray();
    private final Object t = new Object();
    private boolean u = false;
    public volatile yze k = yze.UNKNOWN_CODE;
    public final Set l = DesugarCollections.synchronizedSet(EnumSet.noneOf(rwd.class));
    public volatile boolean m = false;
    private final Object F = new Object();
    private final Set K = Collections.newSetFromMap(new ConcurrentHashMap());
    protected final wyd o = new wyd(this, null);

    protected qso(qss qssVar, Context context, Context context2, qst qstVar, rxr rxrVar, rhw rhwVar) {
        this.d = qssVar;
        this.C = context;
        this.e = context2;
        rxa rxaVar = new rxa(qstVar, context2);
        this.n = rxaVar;
        this.r = qstVar;
        this.G = rxrVar;
        this.H = rhwVar;
        this.I = true;
        ygp ygpVar = new ygp();
        ygpVar.c(raj.c);
        ygpVar.c(raj.d);
        ygpVar.c(raj.e);
        ygpVar.c(raj.f);
        ygpVar.c(raj.g);
        ygpVar.c(raj.h);
        ygpVar.c(raj.i);
        ygpVar.c(raj.j);
        ygpVar.c(raj.k);
        ygpVar.c(raj.l);
        ygpVar.c(raj.m);
        ygpVar.c(raj.n);
        ygpVar.c(raj.o);
        ygpVar.c(raj.s);
        ygpVar.c(raj.y);
        ygpVar.c(raj.z);
        ygpVar.c(raj.t);
        ygpVar.c(raj.x);
        ygpVar.c(raj.u);
        adbb adbbVar = adbb.a;
        adbbVar.gu().b();
        if (adbbVar.gu().a()) {
            ygpVar.c(raj.v);
        }
        ygr ygrVarG = ygpVar.g();
        yy yyVar = new yy(ygrVarG.size());
        yy yyVar2 = new yy(raj.values().length - ygrVarG.size());
        for (raj rajVar : raj.values()) {
            if (ygrVarG.contains(rajVar)) {
                yyVar.add(rajVar.name());
            } else {
                yyVar2.add(rajVar.name());
            }
        }
        a.l().ai(7862).M("Initialized module features, in memory, in CarServiceBinderImpl. enabled=%s; disabled=%s", yyVar, yyVar2);
        this.J = ygr.n(yyVar);
        this.b = new rwf(rxaVar);
    }

    private static final void C(yzy yzyVar) {
        if (rhw.a.contains(yzyVar)) {
            throw new UnsupportedOperationException(String.format("This method should only be called on the car module living in gearhead: %d", Integer.valueOf(yzyVar.a())));
        }
    }

    private final void v(yzy yzyVar) {
        if (this.K.add(yzyVar)) {
            this.n.b(rrc.h(yxy.CAR_SERVICE, yzz.CAR_SERVICE, yzyVar).l());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ff A[Catch: all -> 0x03b8, TRY_LEAVE, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032f A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x033c A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0346 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, qwg] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.bluetooth.BluetoothProfile, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, rwz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void y(com.google.android.gms.car.diagnostics.CriticalError r13) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qso.y(com.google.android.gms.car.diagnostics.CriticalError):void");
    }

    @Override // defpackage.qsk
    public final qvr A() throws IllegalStateException {
        v(yzy.zO);
        m();
        qrg qrgVar = this.i;
        if (qrgVar != null) {
            return qrgVar;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qsk
    public final qvx B() {
        v(yzy.zK);
        return rhx.b;
    }

    @Override // defpackage.qsk
    public final qyh J() {
        yzy yzyVar = yzy.zF;
        v(yzyVar);
        C(yzyVar);
        m();
        qsj qsjVar = this.A;
        if (qsjVar == null || !qsjVar.m()) {
            throw new IllegalStateException("CarNotConnected");
        }
        return qsjVar;
    }

    @Override // defpackage.qsk
    public final rjb P() {
        rjb rjbVar;
        yzy yzyVar = yzy.zY;
        v(yzyVar);
        C(yzyVar);
        int callingUid = Binder.getCallingUid();
        ygr ygrVar = rix.a;
        Context context = this.C;
        if (Collections.disjoint(Arrays.asList(context.getPackageManager().getPackagesForUid(callingUid)), rix.a)) {
            throw new SecurityException("Calling package not allowed.");
        }
        synchronized (this.F) {
            if (this.E == null) {
                this.E = new qrr(context, this.b);
            }
            rjbVar = this.E;
        }
        return rjbVar;
    }

    @Override // defpackage.qsk
    public final String Y(String str, String str2) {
        yzy yzyVar = yzy.zT;
        v(yzyVar);
        C(yzyVar);
        return this.r.b(str, str2);
    }

    @Override // defpackage.qsk
    public final void aA(byte[] bArr, int i) {
        yzy yzyVar = yzy.Ai;
        v(yzyVar);
        C(yzyVar);
        yxc yxcVarB = yxc.b(i);
        if (yxcVarB == null) {
            yxcVarB = yxc.UNKNOWN_EVENT_TYPE;
            a.h().ai(7837).w("Saw unknown CarEventType: %d.", i);
        }
        this.n.a(bArr, yxcVarB);
    }

    @Override // defpackage.qsk
    public final void aC(CarFrxEvent carFrxEvent) {
        yzy yzyVar = yzy.zZ;
        v(yzyVar);
        C(yzyVar);
        abnp abnpVarN = yyd.a.n();
        int i = carFrxEvent.a;
        if (i >= 0) {
            abnpVarN.t();
            yyd yydVar = (yyd) abnpVarN.b;
            yydVar.b |= 1;
            yydVar.c = i;
        }
        int i2 = carFrxEvent.b;
        if (i2 >= 0) {
            abnpVarN.t();
            yyd yydVar2 = (yyd) abnpVarN.b;
            yydVar2.b |= 2;
            yydVar2.d = i2;
        }
        int i3 = carFrxEvent.c;
        if (i3 >= 0) {
            abnpVarN.t();
            yyd yydVar3 = (yyd) abnpVarN.b;
            yydVar3.b |= 4;
            yydVar3.e = i3;
        }
        rwz rwzVar = this.n;
        abnp abnpVarN2 = yxb.a.n();
        yyd yydVar4 = (yyd) abnpVarN.q();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yydVar4.getClass();
        yxbVar.h = yydVar4;
        yxbVar.b |= 16;
        yxc yxcVar = yxc.FRX_STATE_CHANGE;
        int i4 = yfq.d;
        ((rxa) rwzVar).g(abnpVarN2, yxcVar, yls.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    @Override // defpackage.qsk
    public final void aM(final qwg qwgVar) {
        CountDownLatch countDownLatch;
        yzy yzyVar = yzy.zD;
        v(yzyVar);
        C(yzyVar);
        ypf ypfVar = a;
        ypfVar.l().ai(7853).y("Registering %s", qwgVar.asBinder());
        Map map = this.c;
        final int callingUid = Binder.getCallingUid();
        synchronized (map) {
            aagd aagdVar = new aagd(qwgVar, new IBinder.DeathRecipient() { // from class: qsl
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    qso qsoVar = this.a;
                    qsoVar.q(qwgVar.asBinder());
                    Context context = qsoVar.e;
                    yyv yyvVar = yyv.CAR_CONNECTION_LISTENER_BINDER_DIED;
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                    String str = packagesForUid != null ? packagesForUid[0] : "unknown";
                    qso.a.h().ai(7861).y("Binder died: %s", str);
                    rwz rwzVar = qsoVar.n;
                    yyw yywVar = yyw.CS_BINDER_DIED;
                    abnp abnpVarN = yyz.a.n();
                    abnpVarN.t();
                    yyz yyzVar = (yyz) abnpVarN.b;
                    yyzVar.b |= 1;
                    yyzVar.c = 27;
                    int i = yyvVar.fI;
                    abnpVarN.t();
                    yyz yyzVar2 = (yyz) abnpVarN.b;
                    yyzVar2.b |= 2;
                    yyzVar2.d = i;
                    int i2 = yywVar.y;
                    abnpVarN.t();
                    yyz yyzVar3 = (yyz) abnpVarN.b;
                    yyzVar3.b |= 256;
                    yyzVar3.i = i2;
                    abnpVarN.t();
                    yyz yyzVar4 = (yyz) abnpVarN.b;
                    str.getClass();
                    yyzVar4.b |= 128;
                    yyzVar4.h = str;
                    ((rxa) rwzVar).f((yyz) abnpVarN.q());
                }
            });
            boolean zIsEmpty = map.isEmpty();
            if (map.put(qwgVar.asBinder(), aagdVar) != null) {
                ypfVar.f().ai(7855).u("listener already on list");
                return;
            }
            if (zIsEmpty) {
                countDownLatch = new CountDownLatch(1);
                this.q = countDownLatch;
                rbe.j(new qqy(this, countDownLatch, 3, (byte[]) null));
            } else {
                countDownLatch = this.q;
            }
            if (Looper.getMainLooper() == Looper.myLooper() && countDownLatch.getCount() != 0) {
                o();
                countDownLatch.countDown();
            }
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                a.g().ai(7854).u("Failed to wait for initialization...");
            }
            synchronized (this.c) {
                try {
                    if (this.o.k()) {
                        qwgVar.b(this.h);
                    }
                    qwgVar.asBinder().linkToDeath(aagdVar.b, 0);
                } catch (RemoteException unused) {
                    q(qwgVar.asBinder());
                }
            }
        }
    }

    @Override // defpackage.qsk
    public final void aR(String str, boolean z) {
        yzy yzyVar = yzy.zV;
        v(yzyVar);
        C(yzyVar);
        this.r.c(str, z);
    }

    @Override // defpackage.qsk
    public final void aW(String str, String str2) {
        yzy yzyVar = yzy.zU;
        v(yzyVar);
        C(yzyVar);
        this.r.b.edit().putString(str, str2).apply();
    }

    @Override // defpackage.qsk
    public final List ad(String str, List list) {
        yzy yzyVar = yzy.Ak;
        v(yzyVar);
        C(yzyVar);
        if ("car_module_feature_set".equals(str)) {
            return new ArrayList(this.J);
        }
        return new ArrayList(this.r.b.getStringSet(str, list != null ? new HashSet<>(list) : Collections.EMPTY_SET));
    }

    @Override // defpackage.qsk
    public final void b() {
        ypf ypfVar = a;
        ypfVar.l().ai(7832).u("completeStartup, car service ready");
        this.r.i();
        synchronized (this.t) {
            if (u()) {
                this.b.d(rwa.c);
            } else {
                ypfVar.l().ai(7833).u("car disconnected while service discovery");
            }
        }
    }

    @Override // defpackage.qsk
    public final void bg(qwg qwgVar) {
        yzy yzyVar = yzy.zE;
        v(yzyVar);
        C(yzyVar);
        q(qwgVar.asBinder());
    }

    @Override // defpackage.qsk
    public final boolean bp(String str, boolean z) {
        yzy yzyVar = yzy.zP;
        v(yzyVar);
        C(yzyVar);
        if ("car_force_logging".equals(str) && this.h == 0) {
            return true;
        }
        return this.r.d(str, z);
    }

    @Override // defpackage.qsk
    public final boolean bq(String str, boolean z) {
        yzy yzyVar = yzy.At;
        v(yzyVar);
        C(yzyVar);
        if (str.equals(roy.FULLSCREEN_PRESENTATION.f)) {
            return aday.a.gu().a();
        }
        if (str.equals(roy.USE_NORMAL_SETTINGS_ACCESSORS.f) || str.equals(roy.SHOULD_LOG_CAR_CLIENT_TOKEN_CONNECTION_EVENT.f)) {
            return true;
        }
        return z;
    }

    @Override // defpackage.qsk
    public final boolean bs() {
        yzy yzyVar = yzy.zB;
        v(yzyVar);
        C(yzyVar);
        return this.o.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // defpackage.qsk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qso.c():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qsk
    public final void d(PrintWriter printWriter) {
        String string;
        String string2;
        rwb rwbVar = this.b;
        printWriter.println("connected in service:" + u() + ", connected in client:" + rwbVar.a().equals(rwa.c));
        Map map = this.c;
        printWriter.println("num car connection listeners:" + map.size());
        try {
            for (Map.Entry entry : map.entrySet()) {
                printWriter.println("listener " + String.valueOf(entry.getKey()) + ":" + rbe.c(this.C, ((aagd) entry.getValue()).a));
            }
        } catch (ConcurrentModificationException unused) {
        }
        if (u()) {
            printWriter.println("connection type:" + this.h);
        } else {
            printWriter.println("last connection type:" + this.x);
        }
        if (this.j != null) {
            printWriter.println((true != u() ? "last car info:" : "car info:").concat(String.valueOf(String.valueOf(this.j))));
        }
        printWriter.println("\nCarServiceSettings");
        for (Map.Entry<String, ?> entry2 : this.r.b.getAll().entrySet()) {
            printWriter.println(entry2.getKey() + ": " + String.valueOf(entry2.getValue()));
        }
        this.G.c(printWriter);
        if (u()) {
            qqv qqvVar = this.z;
            if (qqvVar != null) {
                printWriter.println("\nCarAudioService");
                printWriter.println("Audio Sources");
                printWriter.println("force single channel capturing:" + qqvVar.h);
                qpo[] qpoVarArr = qqvVar.k;
                int length = qpoVarArr.length;
                for (int i = 0; i < 3; i++) {
                    qpo qpoVar = qpoVarArr[i];
                    if (qpoVar != null) {
                        qpj qpjVar = qpoVar.e;
                        boolean z = qpjVar != null && ((qpl) qpjVar).d;
                        printWriter.println("stream type: " + qpoVar.d + " has focus:" + z + " config chosen:" + String.valueOf(qpoVar.h));
                        printWriter.println("Supported configs");
                        List list = qpoVar.g;
                        if (list != null) {
                            ynp ynpVarListIterator = ((yfq) list).listIterator(0);
                            while (ynpVarListIterator.hasNext()) {
                                xhf xhfVar = (xhf) ynpVarListIterator.next();
                                if (xhfVar != null) {
                                    printWriter.println("num bits:" + xhfVar.d + " num chs:" + xhfVar.e + " sampling rate:" + xhfVar.c);
                                }
                            }
                        } else {
                            printWriter.println("null configs");
                        }
                    } else {
                        printWriter.println("null source service");
                    }
                }
                printWriter.println("Audio Source BHs");
                rek[] rekVarArr = qqvVar.e;
                int length2 = rekVarArr.length;
                for (int i2 = 0; i2 < 3; i2++) {
                    rek rekVar = rekVarArr[i2];
                    if (rekVar != null) {
                        rekVar.gl(printWriter);
                    } else {
                        printWriter.println("null source service BH");
                    }
                }
                printWriter.println("Audio Focus");
                qqt qqtVar = (qqt) qqvVar.f;
                printWriter.println("car focus state:" + roc.s(qqtVar.g) + " focusRequestSentToCar:" + roc.r(qqtVar.h));
                rfr rfrVar = ((rfq) qqtVar.d).d;
                synchronized (rfrVar.d) {
                    string2 = rfrVar.c.toString();
                }
                printWriter.println("Audio focus grants: ".concat(String.valueOf(string2)));
                printWriter.print("per channel focus states:");
                qpx qpxVar = qqtVar.b;
                printWriter.print("AudioStreamsManagerImpl per channel focus states:");
                int[] iArr = qpxVar.d;
                int length3 = iArr.length;
                for (int i3 = 0; i3 < 3; i3++) {
                    int i4 = iArr[i3];
                    printWriter.print(" ");
                    printWriter.print(Integer.toHexString(i4));
                }
                printWriter.println(" ");
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                printWriter.println("num focus response fails:" + qqtVar.o + " last focus response fail time:" + qqtVar.p + " while now is:" + jElapsedRealtime);
            }
            qsj qsjVar = this.A;
            if (qsjVar != null) {
                printWriter.println("\nCarSensorService");
                qsjVar.gl(printWriter);
            }
            qrg qrgVar = this.i;
            if (t()) {
                printWriter.println("\nBluetoothService");
                printWriter.println("Preferred pairing method: ".concat(String.valueOf(String.valueOf(qrgVar.c))));
                rhg rhgVar = qrgVar.d;
                if (rhgVar == null) {
                    string = "null";
                } else {
                    StringBuilder sb = new StringBuilder("Phone MAC addr=");
                    rgk rgkVar = rhgVar.d;
                    sb.append(rgkVar == null ? "null" : rgkVar.c());
                    sb.append(", peer MAC addr=");
                    rgl rglVar = rhgVar.f;
                    sb.append(rglVar == null ? "null" : rglVar.b());
                    sb.append(", init status=");
                    sb.append(rhgVar.n);
                    sb.append(", ProfileUtil=");
                    sb.append(rhgVar.o);
                    sb.append(", reqd pairing method=");
                    sb.append(rhgVar.p);
                    sb.append(", reqd pairing key=");
                    sb.append(rhgVar.q);
                    sb.append(", auth data from client=");
                    sb.append(rhgVar.r);
                    string = sb.toString();
                }
                printWriter.println("BluetoothUtil info: ".concat(string));
                rgs rgsVar = qrgVar.e;
                kwp kwpVar = rgsVar.p;
                int i5 = rgsVar.n;
                int i6 = rgsVar.o;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
                StringBuilder sb2 = new StringBuilder("-------- BluetoothDumpManager --------\n");
                sb2.append(String.format("unpairAttempts= %d, consecutiveUnpairAttempts= %d\n", Integer.valueOf(i5), Integer.valueOf(i6)));
                sb2.append("\nBluetoothFsmState records:");
                yec yecVar = (yec) kwpVar.a;
                sb2.append(true != yecVar.isEmpty() ? "\n" : "NULL\n");
                Iterator it = yecVar.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    sb2.append(String.format("  %s : %s\n", simpleDateFormat.format(new Date(((Long) pair.first).longValue())), pair.second));
                }
                printWriter.println("BluetoothFsm info: ".concat(sb2.toString()));
                Iterator it2 = qrgVar.f.iterator();
                while (it2.hasNext()) {
                    printWriter.println("Client: ".concat(String.valueOf(String.valueOf(((qrf) it2.next()).a.asBinder()))));
                }
                printWriter.println("Initialization status: " + qrgVar.b);
            }
            ruw ruwVar = this.B;
            if (ruwVar != null) {
                printWriter.println("\nProtocolManager");
                rta rtaVar = ruwVar.d;
                if (rtaVar != null) {
                    printWriter.println("\nChannelManager");
                    rld rldVar = rtaVar.t;
                    if (rldVar.e) {
                        printWriter.println("\nGalSnoop message buffer:");
                        rldVar.b(rtaVar.u, printWriter);
                    } else {
                        printWriter.println("\nGalSnoop disabled");
                    }
                }
            }
            rwb rwbVar2 = this.b;
            printWriter.println("Dumping history of connection state for Car Module:");
            rwf rwfVar = (rwf) rwbVar2;
            for (ConnectionState connectionState : rwfVar.b()) {
                printWriter.println(connectionState.a + ":" + String.valueOf(rwa.values()[connectionState.b]));
            }
            printWriter.println("Dumping history of connection state for Car Module (human readable timestamps):");
            for (ConnectionState connectionState2 : rwfVar.b()) {
                printWriter.println(String.valueOf(DateFormat.format("yyyy-MM-dd kk:mm:ss.SSS", connectionState2.a)) + " (" + (SystemClock.elapsedRealtime() - connectionState2.d) + " elapsed realtime millis):" + String.valueOf(rwa.values()[connectionState2.b]));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, qwg] */
    @Override // defpackage.qsk
    public final void e() {
        Map map = this.c;
        synchronized (map) {
            a.f().ai(7841).w("Notifying car connection listeners of setup failure (%d listeners)", map.size());
            for (aagd aagdVar : map.values()) {
                try {
                    aagdVar.c.a(1);
                } catch (RemoteException unused) {
                    a.h().ai(7842).w("Unable to notify setup failure on listener(pid=%d)", aagdVar.a);
                }
            }
        }
    }

    @Override // defpackage.qsk
    public final void f(CriticalError criticalError) {
        a.l().ai(7843).u("onCarDisconnected");
        spu.as(Looper.myLooper() == this.f.getLooper(), "Teardown should happen in the default handler thread.");
        y(criticalError);
        if (this.p) {
            return;
        }
        this.d.h();
    }

    @Override // defpackage.qsk
    public final void g() {
        ypf ypfVar = a;
        ypfVar.l().ai(7848).u("CarServiceBinderImpl::onPreflightComplete");
        if (!t()) {
            ypfVar.l().ai(7849).u("Bluetooth service null, skipping notifying");
            return;
        }
        qrg qrgVar = this.i;
        qrg.a.l().ai(7730).u("Car is authorized (preflight complete)");
        qrgVar.e.c(rgo.EVENT_USER_AUTHORIZED);
    }

    @Override // defpackage.qsk
    public final int h() {
        yzy yzyVar = yzy.zC;
        v(yzyVar);
        C(yzyVar);
        return this.o.h();
    }

    @Override // defpackage.qsk
    public final void i(CarInfoInternal carInfoInternal, ruw ruwVar, int i, int i2, boolean z, CarBluetoothData carBluetoothData) throws SecurityException, IllegalArgumentException {
        int i3;
        int i4;
        boolean z2 = this.I;
        if (z2) {
            qsu.d();
        }
        if (!z2) {
            this.d.f();
        }
        this.v = carBluetoothData;
        ypf ypfVar = a;
        ypfVar.l().ai(7850).w("prepareConnectionForServiceDiscovery, connectionType:%d", i);
        Process.setThreadPriority(-8);
        synchronized (this.t) {
            if (u()) {
                ols.M(this.e, yxi.CAR_SERVICE_PREPARING_FOR_SERVICE_DISCOVERY_WHEN_CONNECTED);
                if (z2) {
                    ypfVar.l().ai(7852).u("Requesting tearDownCarState to clear previous session state");
                    y(CriticalError.a(yze.SESSION_OBSOLETE_DUE_TO_NEW_CONNECTION, yzf.UNKNOWN_DETAIL));
                }
            }
            if (z2) {
                this.d.f();
            }
            int i5 = 2;
            if (!z2 && u()) {
                i4 = i;
            } else {
                if (u()) {
                    throw new IllegalStateException("initializeConnectedToCarState must only be called when not already connected/connecting");
                }
                this.b.d(rwa.b);
                this.j = carInfoInternal;
                this.B = ruwVar;
                this.h = i;
                HandlerThread handlerThread = new HandlerThread("Looper");
                this.D = handlerThread;
                handlerThread.start();
                if (i == 1) {
                    this.w = new qsn(this);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
                    ypfVar.l().ai(7857).u("Register usbDisconnectReceiver");
                    dup.e(this.e, this.w, intentFilter, null, 2);
                    i3 = 1;
                } else {
                    i3 = i;
                }
                qsm qsmVar = new qsm(this);
                this.s = qsmVar;
                if (!qsmVar.c) {
                    qsmVar.c = true;
                    qsmVar.b = Thread.getDefaultUncaughtExceptionHandler();
                    Thread.setDefaultUncaughtExceptionHandler(qsmVar);
                }
                i4 = i3;
            }
            this.u = z;
            if (!z) {
                this.n.d(yzz.AUDIO_SERVICE_MIGRATION, yzy.yo);
            }
            ((rxa) this.n).b = i2;
            this.m = false;
            this.k = yze.UNKNOWN_CODE;
            SparseBooleanArray sparseBooleanArray = this.g;
            synchronized (sparseBooleanArray) {
                sparseBooleanArray.clear();
            }
            this.l.clear();
            if (z) {
                this.y = null;
            } else {
                rwz rwzVar = this.n;
                rwzVar.d(yzz.AUDIO_SERVICE_MIGRATION, yzy.yq);
                this.y = new qqt(this.e, rwzVar, new qfe(this, i5), this.o, this);
            }
            Context context = this.e;
            qtf qtfVar = new qtf(context, this.D);
            qsj qsjVar = this.A;
            if (qsjVar == null) {
                qsj qsjVar2 = new qsj(this.o, this.b, context);
                this.A = qsjVar2;
                qsjVar2.d = qtfVar;
            } else {
                qsjVar.d = qtfVar;
                qtfVar.f(qsjVar);
            }
            this.t.notifyAll();
            if (!z) {
                ruw ruwVar2 = this.B;
                qqt qqtVar = this.y;
                rth rthVar = ruwVar2.d.g;
                rthVar.i = qqtVar;
                rthVar.i.d(rthVar);
                synchronized (rthVar.g) {
                    Queue<Pair> queue = rthVar.h;
                    for (Pair pair : queue) {
                        rthVar.i.f((xhj) pair.first, ((Boolean) pair.second).booleanValue());
                    }
                    queue.clear();
                }
            }
        }
        if (aczv.a.gu().ad() && i4 == 2) {
            a.l().ai(7851).u("Not starting USB monitoring for WIFI connection.");
            this.G.e(this);
        } else {
            this.G.d(this, 1000);
        }
    }

    @Override // defpackage.qsk
    public final void j() {
        a.l().ai(7863).u("tearDown");
        if (this.I) {
            qsu.d();
        }
        y(CriticalError.a(yze.UNKNOWN_CODE, yzf.UNKNOWN_DETAIL));
        r();
        this.d.h();
    }

    public final qqv k() {
        this.o.j();
        qqv qqvVar = this.z;
        if (qqvVar != null) {
            return qqvVar;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.rwc
    public final CarInfo l() {
        CarInfoInternal carInfoInternal = this.j;
        if (carInfoInternal != null) {
            return carInfoInternal.a;
        }
        return null;
    }

    public final void m() {
        this.b.c();
    }

    @Override // defpackage.rwe
    public final void n(yze yzeVar, yzf yzfVar, String str) {
        this.f.post(new xx((Object) this, yzeVar, yzfVar, str, 18));
    }

    public final void o() {
        ypf ypfVar = a;
        ypfVar.l().ai(7844).u("CSB onClientsConnected");
        if (this.p) {
            ypfVar.f().ai(7845).u("Already connected");
        } else {
            this.p = true;
        }
    }

    @Override // defpackage.rut
    public final void p(yze yzeVar, yzf yzfVar, String str) {
        SparseBooleanArray sparseBooleanArray = this.g;
        synchronized (sparseBooleanArray) {
            sparseBooleanArray.put(yzeVar.D, true);
        }
        if (yzeVar != yze.CONNECTION_ERROR || this.h != 1) {
            n(yzeVar, yzfVar, str);
            return;
        }
        SparseBooleanArray sparseBooleanArray2 = this.g;
        synchronized (sparseBooleanArray2) {
            if (sparseBooleanArray2.get(3, false)) {
                return;
            }
            this.f.postDelayed(new xx((Object) this, yzeVar, yzfVar, str, 19), 1500L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    public final void q(IBinder iBinder) {
        ypf ypfVar = a;
        ypfVar.l().ai(7858).y("Removing %s", iBinder);
        Map map = this.c;
        synchronized (map) {
            aagd aagdVar = (aagd) map.get(iBinder);
            if (aagdVar == null) {
                ypfVar.f().ai(7859).u("listener not found in list");
                return;
            }
            map.remove(iBinder);
            iBinder.unlinkToDeath(aagdVar.b, 0);
            if (map.isEmpty()) {
                this.q = null;
                rbe.j(new qjv(this, 15, null));
            }
        }
    }

    public final void r() {
        ypf ypfVar = a;
        ypfVar.l().ai(7867).u("tearDownClientState");
        spu.as(Looper.myLooper() == this.f.getLooper(), "Tear down must happen in default handler thread.");
        if (this.p) {
            this.p = false;
        } else {
            ypfVar.f().ai(7868).u("Skip, no clients bound.");
        }
    }

    @Override // defpackage.qsk
    @ResultIgnorabilityUnspecified
    public final CarInfo s() {
        yzy yzyVar = yzy.zz;
        v(yzyVar);
        C(yzyVar);
        m();
        return l();
    }

    public final boolean t() {
        qrg qrgVar = this.i;
        return (qrgVar == null || qrgVar.b == -6) ? false : true;
    }

    public final boolean u() {
        rwa rwaVarA = this.b.a();
        return rwaVarA.equals(rwa.c) || rwaVarA.equals(rwa.b);
    }

    @Override // defpackage.qsk
    public final qug w(CreateAudioPolicyRequest createAudioPolicyRequest, qud qudVar, quj qujVar) {
        yzy yzyVar = yzy.AL;
        v(yzyVar);
        C(yzyVar);
        spu.ax(createAudioPolicyRequest, "request");
        spu.ax(qudVar, "deathNotifier");
        ypf ypfVar = rgb.a;
        rhj rhjVar = new rhj(this.e);
        if (qujVar != null) {
            rhjVar.h(new rfz(qujVar));
        }
        yfl yflVar = new yfl(4);
        for (AudioPolicyMixData audioPolicyMixData : createAudioPolicyRequest.a) {
            yflVar.i(Integer.valueOf(rhjVar.g(audioPolicyMixData.a, audioPolicyMixData.b, audioPolicyMixData.c)));
        }
        return new rgb(rhjVar.k(), qudVar, yflVar.g(), this.n);
    }

    @Override // defpackage.qsk
    public final qum x(CreateAudioRecordRequest createAudioRecordRequest, qud qudVar) {
        rge rgeVarA;
        yzy yzyVar = yzy.AN;
        v(yzyVar);
        C(yzyVar);
        spu.ax(createAudioRecordRequest, "request");
        spu.ax(qudVar, "deathNotifier");
        ypf ypfVar = rgd.a;
        if (createAudioRecordRequest.a) {
            woy.aa(!spu.c(), "createViaReflection is only allowed prior to Android Q");
            rgeVarA = roc.b(createAudioRecordRequest.b, createAudioRecordRequest.c);
        } else {
            rgeVarA = roc.a(createAudioRecordRequest.d, createAudioRecordRequest.c, createAudioRecordRequest.e, createAudioRecordRequest.f, createAudioRecordRequest.b);
        }
        if (rgeVarA == null) {
            return null;
        }
        return new rgd(rgeVarA, qudVar, this.n);
    }

    @Override // defpackage.qsk
    public final qvb z() {
        yzy yzyVar = yzy.zG;
        v(yzyVar);
        C(yzyVar);
        return k();
    }

    @Override // defpackage.qsk
    public final qsk a() {
        return this;
    }
}
