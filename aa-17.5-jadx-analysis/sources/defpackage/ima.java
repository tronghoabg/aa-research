package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseBooleanArray;
import com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks;
import com.google.android.gms.car.AnalyticsSessionInfo;
import com.google.android.gms.car.CarFacet;
import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.CreateAudioPolicyRequest;
import com.google.android.gms.car.CreateAudioRecordRequest;
import com.google.android.gms.car.MediaOptions;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;
import j$.time.TimeConversions;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.stream.Stream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ima extends quo implements iku, iub, ilc, ioa, ijx, jes, jet, jev, jew, iut, jae, ixl, imh, jkl, qup, ipz {
    public final ixs E;
    public final Context F;
    public boolean J;
    public final ivb K;
    public ComponentName L;
    public ComponentName M;
    public long N;
    public final jfg O;
    public iyp P;
    public ilx R;
    public final xyc S;
    public final rbe T;
    public volatile imj U;
    public ScheduledExecutorService V;
    public boolean W;
    public final jgi X;
    public imf ac;
    public volatile rki ad;
    public volatile rjz ae;
    public wyd ag;
    private CountDownLatch ak;
    private int al;
    private int am;
    private final ilb an;
    private final iue ao;
    private final ijq ap;
    private final xyc aq;
    private imj ar;
    private Runnable at;
    private final rpz au;
    private final xyc av;
    public final jer e;
    public volatile boolean f;
    public final ikv j;
    public final Context k;
    public final ikz l;
    ilz n;
    public final iuc u;
    public volatile boolean v;
    public volatile iqw w;
    public iws x;
    public volatile iuq y;
    public static final izq a = new ilt();
    public static final yph b = yph.c("CAR.SERVICE");
    private static final ComponentName ah = new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver");
    private static final ComponentName ai = imj.b;
    public static final ComponentName c = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.RecoveryLifecycleService");
    public static final ygr d = ygr.q(jeq.a, jeq.b, jeq.c);
    private static final yfq aj = yfq.t(yxy.GEARHEAD, yxy.CONNECTIVITY, yxy.FRX, yxy.CAR_SERVICE);
    public static final vqk af = new vqk("debug.car.enable_wifi_log");
    public final Map g = new ConcurrentHashMap();
    public final Set h = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AtomicReference i = new AtomicReference();
    public final jla m = new jld();
    public final Handler o = new Handler(Looper.getMainLooper());
    public final SparseBooleanArray p = new SparseBooleanArray();
    public final Object q = new Object();
    public int r = -1;
    public volatile boolean s = false;
    public final AtomicBoolean t = new AtomicBoolean(false);
    public volatile Boolean z = null;
    public final AtomicReference A = new AtomicReference();
    public final AtomicReference B = new AtomicReference();
    public final AtomicReference C = new AtomicReference();
    public final AtomicReference D = new AtomicReference();
    public volatile yze G = yze.UNKNOWN_CODE;
    public final Set H = DesugarCollections.synchronizedSet(EnumSet.noneOf(jeu.class));
    public volatile boolean I = false;
    public final Object Q = new Object();
    private volatile ygr as = yly.a;
    private final boolean aw = acur.a.gu().g();
    ConcurrentHashMap Y = new ConcurrentHashMap();
    public final Runnable Z = new ne(this, 15, null);
    public final AtomicBoolean aa = new AtomicBoolean();
    public final irx ab = new irx();
    private int ax = -1;

    public ima(ikv ikvVar, Context context, ikz ikzVar, xyc xycVar) {
        int i = 1;
        this.aq = wub.L(new ilk(this, i));
        this.j = ikvVar;
        this.k = context;
        this.l = ikzVar;
        Context applicationContext = context.getApplicationContext();
        this.F = applicationContext;
        this.S = xycVar;
        rbe rbeVar = new rbe(true);
        this.T = rbeVar;
        ilb ilbVar = new ilb();
        this.an = ilbVar;
        this.ao = new iue();
        this.ap = new ijs(context, new ilk(this, 0));
        this.av = wub.L(new imq(i));
        this.u = new iuc(this, xycVar, this, ikzVar, this, ilbVar, this, new ilk(this, 3), context, rbeVar);
        jfh jfhVar = new jfh(xycVar, this, new ikw(context, xycVar), ikzVar, context);
        this.O = jfhVar;
        this.E = new ixs(applicationContext, jfhVar);
        jex jexVar = new jex(jfhVar);
        this.e = jexVar;
        ivs.a().a = new WeakReference(jexVar);
        ivs.a().b = new WeakReference(this);
        if (rlc.a(af)) {
            this.K = new ivb() { // from class: ill
                @Override // defpackage.ivb
                public final jen a(xjc xjcVar, int i2, boolean z) {
                    return new jfv(this.a.F);
                }
            };
        } else {
            this.K = new ivb() { // from class: ilm
                @Override // defpackage.ivb
                public final jen a(xjc xjcVar, int i2, boolean z) {
                    return new jgb(this.a.O, xjcVar, i2, z);
                }
            };
        }
        this.X = new jgi(xvx.a, jfhVar, wub.L(new ilk(this, 2)));
        this.au = rpz.a(context);
        az(ikzVar);
    }

    private static String bD(Rect rect) {
        return rect.top + "," + rect.bottom + "," + rect.left + "," + rect.right;
    }

    private static List bE(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CarInfoInternal) it.next()).a);
        }
        return arrayList;
    }

    private final void bF() {
        this.e.c();
    }

    private static void bG(qwd qwdVar) {
        ((ype) b.l().ai((char) 348)).u("Screenshot capture failed");
        try {
            qwdVar.e(null);
        } catch (RemoteException unused) {
            ((ype) ((ype) b.g()).ai((char) 349)).u("Client died whilst trying to indicate that screenshot wasn't available");
        }
    }

    private final void bH() {
        ak();
        throw new IllegalStateException("CarNotSupported");
    }

    private final void bI(yzy yzyVar) {
        if (this.aw) {
            a$$ExternalSyntheticApiModelOutline3.m37m(ConcurrentMap.EL.computeIfAbsent(this.Y, yzyVar, new ilq(0))).increment();
        }
    }

    private final boolean bJ() {
        String[] packagesForUid;
        rbe rbeVar = this.T;
        Context context = this.k;
        int callingUid = getCallingUid();
        return rbeVar.l(context, callingUid) && (packagesForUid = context.getPackageManager().getPackagesForUid(callingUid)) != null && spu.e(packagesForUid, "com.google.android.projection.gearhead.pctsverifier") >= 0;
    }

    private static final List bK(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (resolveInfo.serviceInfo != null) {
                arrayList.add(new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name));
            } else if (resolveInfo.activityInfo != null) {
                arrayList.add(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            }
        }
        return arrayList;
    }

    private static final void bL(iuu iuuVar, CarActivityLayoutConfig carActivityLayoutConfig) {
        CarDisplayLayoutConfig carDisplayLayoutConfig;
        Iterator it = carActivityLayoutConfig.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                carDisplayLayoutConfig = null;
                break;
            }
            CarDisplayId carDisplayId = iuuVar.j;
            carDisplayLayoutConfig = (CarDisplayLayoutConfig) it.next();
            if (carDisplayLayoutConfig.a.equals(carDisplayId)) {
                break;
            }
        }
        if (carDisplayLayoutConfig != null) {
            yfq yfqVarB = carDisplayLayoutConfig.b();
            iuuVar.n.b(!yfqVarB.isEmpty());
            ((ype) ((ype) b.f()).ai(408)).M("Setting critical regions for display configuration id %s: %s", carDisplayLayoutConfig.b, yfqVarB);
            jkk jkkVar = iuuVar.p;
            synchronized (((ina) jkkVar).N) {
                ((ype) ina.a.l().ai(576)).y("Setting critical regions: %s", yfqVarB);
                ((ina) jkkVar).v = ygr.n(yfqVarB);
                ((ina) jkkVar).ac();
            }
        }
    }

    public static iuc o(Optional optional) {
        optional.isPresent();
        return (iuc) optional.get();
    }

    @Override // defpackage.qup
    public final qvr A() {
        bI(yzy.zO);
        bF();
        al();
        try {
            return y().A();
        } catch (RemoteException e) {
            throw roc.aI(e);
        }
    }

    @Override // defpackage.qup
    public final qvx B() {
        bI(yzy.zK);
        al();
        try {
            return y().B();
        } catch (RemoteException e) {
            throw roc.aI(e);
        }
    }

    @Override // defpackage.quo, defpackage.qup
    public final qwl C() {
        bI(yzy.AX);
        al();
        synchronized (this.Q) {
            if (this.R == null) {
                Intent action = new Intent().setComponent((ComponentName) itx.b.gu()).setAction("com.google.android.gms.carsetup.ACTION_BIND_CAR_SETUP_SERVICE");
                this.R = new ilx(this);
                spi.a().d(this.F, action, this.R, 1);
                ilx ilxVar = this.R;
                while (ilxVar.b) {
                    try {
                        ilxVar.c.Q.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.R == null) {
                    throw new IllegalStateException("Teardown before connect");
                }
                try {
                    this.P = new iyp(this.R.a.e());
                } catch (RemoteException unused2) {
                }
                Optional optionalX = X();
                optionalX.isPresent();
                jbp jbpVar = ((iuc) optionalX.get()).s;
                if (jbpVar != null) {
                    jbpVar.h(this.P);
                }
            }
        }
        return this.P;
    }

    @Override // defpackage.quo, defpackage.qup
    public final qwu D() throws IllegalStateException {
        bI(yzy.zM);
        dlz.H(this);
        iwc iwcVar = o(X()).z;
        if (iwcVar != null) {
            return iwcVar;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.quo, defpackage.qup
    public final qxa E() {
        bI(yzy.AQ);
        aj();
        iws iwsVar = this.x;
        if (iwsVar != null) {
            return iwsVar;
        }
        throw new IllegalStateException("CarNotConnected");
    }

    @Override // defpackage.quo, defpackage.qup
    public final qxj F() throws IllegalStateException {
        bI(yzy.zH);
        if (acrh.e()) {
            dlz.H(this);
        } else {
            aj();
        }
        ikg ikgVar = o(X()).A;
        if (ikgVar != null) {
            return ikgVar;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.quo, defpackage.qup
    public final qxp G() throws IllegalStateException {
        bI(yzy.Am);
        dlz.H(this);
        return this.u.B;
    }

    @Override // defpackage.quo, defpackage.qup
    public final qxp H() throws IllegalStateException {
        bI(yzy.Am);
        dlz.H(this);
        iki ikiVar = this.u.B;
        if (ikiVar.c) {
            return ikiVar;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.quo, defpackage.qup
    public final qyb I() throws IllegalStateException {
        bI(yzy.Aa);
        dlz.H(this);
        ikp ikpVar = o(X()).D;
        if (ikpVar == null) {
            bH();
        }
        return ikpVar;
    }

    @Override // defpackage.qup
    public final qyh J() {
        bI(yzy.zF);
        bF();
        Optional optionalX = X();
        optionalX.isPresent();
        ikt iktVar = ((iuc) optionalX.get()).C;
        if (iktVar == null || !iktVar.n()) {
            throw new IllegalStateException("CarNotConnected");
        }
        return iktVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    @Override // defpackage.quo, defpackage.qup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qyq K(java.lang.String r10) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ima.K(java.lang.String):qyq");
    }

    @Override // defpackage.quo, defpackage.qup
    public final qzf L() {
        bI(yzy.Ah);
        ak();
        al();
        iuu iuuVarP = p();
        if (iuuVarP == null) {
            throw new IllegalStateException("CarNotSupported");
        }
        jkk jkkVar = iuuVarP.p;
        if (jkkVar != null) {
            return ((ina) jkkVar).ar;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.quo, defpackage.qup
    public final qzi M() {
        bI(yzy.Aj);
        al();
        return (qzi) this.aq.gu();
    }

    @Override // defpackage.quo, defpackage.qup
    public final rho N() {
        bI(yzy.AS);
        an();
        ike ikeVar = o(X()).G;
        if (ikeVar == null) {
            bH();
        }
        return ikeVar;
    }

    @Override // defpackage.quo, defpackage.qup
    public final rim O() {
        bI(yzy.AR);
        ak();
        al();
        Optional optionalX = X();
        optionalX.isPresent();
        ijv ijvVar = ((iuc) optionalX.get()).F;
        if (ijvVar == null) {
            bH();
        }
        return ijvVar;
    }

    @Override // defpackage.qup
    public final rjb P() {
        bI(yzy.zY);
        al();
        int callingUid = getCallingUid();
        yfq yfqVar = iuf.a;
        String[] packagesForUid = this.F.getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid != null) {
            Stream stream = DesugarArrays.stream(packagesForUid);
            yfq yfqVar2 = iuf.a;
            yfqVar2.getClass();
            if (!stream.noneMatch(new ghp(yfqVar2, 4))) {
                try {
                    return y().P();
                } catch (RemoteException e) {
                    throw roc.aI(e);
                }
            }
        }
        throw new SecurityException("Calling package not allowed to access diagnostics.");
    }

    @Override // defpackage.quo, defpackage.qup
    public final rjm Q(CarDisplayId carDisplayId) {
        bI(yzy.AO);
        am();
        woy.aa(acrz.r(), "Punch Through must be enabled to access the IntegratedOverlayManager");
        ak();
        iuu iuuVar = (iuu) W().get(carDisplayId);
        iuuVar.getClass();
        return iuuVar.s;
    }

    @Override // defpackage.quo, defpackage.qup
    public final rka R() {
        bI(yzy.AP);
        an();
        ak();
        woy.aa(this.ae != null, "CarDisplayActionsControllerBinder has not been initialized");
        return this.ae;
    }

    @Override // defpackage.quo, defpackage.qup
    public final rkj S() {
        bI(yzy.Az);
        ak();
        woy.aa(this.ad != null, "Car Display Manager Binder has not been initialized");
        return this.ad;
    }

    @Override // defpackage.quo, defpackage.qup
    public final rkm T() {
        bI(yzy.Bh);
        an();
        woy.aa(acrz.a.gu().t(), "Theming must be enabled to access the CarDisplayThemingManager");
        ak();
        woy.aa(this.y != null, "CarDisplayThemingManagerBinder has not been initialized");
        return this.y;
    }

    protected final sah U() throws sag {
        return new sah(this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jkl
    public final yfq V() {
        yfl yflVar = new yfl(4);
        ynp ynpVarListIterator = ((yfq) W().values()).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            jkk jkkVar = ((iuu) ynpVarListIterator.next()).p;
            jkkVar.getClass();
            yflVar.i(jkkVar);
        }
        return yflVar.g();
    }

    public final yfy W() {
        Optional optionalX = X();
        return optionalX.isEmpty() ? ylx.a : ((iuc) optionalX.get()).K;
    }

    public final Optional X() {
        return Optional.of(this.u);
    }

    @Override // defpackage.qup
    @ResultIgnorabilityUnspecified
    public final String Y(String str, String str2) {
        bI(yzy.zT);
        ikz ikzVar = this.l;
        if (!ikzVar.o(str)) {
            al();
        }
        return ikzVar.b(str, str2);
    }

    @Override // defpackage.quo, defpackage.qup
    public final String Z(String str, String str2) {
        bI(yzy.Au);
        itw itwVarA = itw.a();
        Pair pair = new Pair(str, str2);
        ConcurrentHashMap concurrentHashMap = itwVarA.c;
        war warVar = (war) concurrentHashMap.get(pair);
        if (warVar == null) {
            wap wapVar = itwVarA.a;
            String str3 = (String) pair.first;
            boolean z = war.b;
            concurrentHashMap.putIfAbsent(pair, new wal(wapVar, str3, str2, false));
            warVar = (war) concurrentHashMap.get(pair);
        }
        return (String) warVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x039e A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b3 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0459 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0499 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x049e A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04e1 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04e5 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0500 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x050b A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x051d A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0521 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0545 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0549 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0568 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x056c A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05d0 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05d4 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05e0 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0602 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0606 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0618 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x061c A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06b0 A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06bf A[Catch: all -> 0x07e6, TryCatch #4 {, blocks: (B:35:0x0138, B:37:0x013e, B:39:0x0157, B:41:0x015d, B:43:0x016b, B:45:0x016f, B:46:0x0175, B:47:0x018a, B:49:0x0192, B:51:0x0196, B:53:0x01a1, B:55:0x0214, B:59:0x0235, B:60:0x024b, B:64:0x026b, B:65:0x027d, B:67:0x0291, B:69:0x0295, B:70:0x0298, B:72:0x02a7, B:73:0x02aa, B:75:0x02ae, B:77:0x02ca, B:79:0x02d0, B:81:0x02de, B:83:0x02e2, B:85:0x0300, B:84:0x02eb, B:86:0x0307, B:88:0x0320, B:94:0x033d, B:96:0x0344, B:98:0x0348, B:99:0x0350, B:101:0x0356, B:103:0x035a, B:105:0x035e, B:107:0x0362, B:108:0x036d, B:110:0x0371, B:111:0x0373, B:114:0x0377, B:116:0x037d, B:118:0x0381, B:120:0x0385, B:124:0x0393, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03ad, B:131:0x03b3, B:133:0x03bd, B:134:0x03d7, B:141:0x03f9, B:143:0x041b, B:147:0x0434, B:148:0x0435, B:150:0x0439, B:151:0x043c, B:153:0x0440, B:154:0x0447, B:156:0x044b, B:158:0x0451, B:160:0x0459, B:161:0x045d, B:168:0x0476, B:170:0x047a, B:171:0x0481, B:174:0x0486, B:178:0x0491, B:179:0x0492, B:183:0x0498, B:184:0x0499, B:186:0x049e, B:188:0x04a8, B:190:0x04ae, B:191:0x04b5, B:193:0x04bb, B:194:0x04c7, B:195:0x04ca, B:197:0x04ce, B:198:0x04d3, B:199:0x04d5, B:203:0x04db, B:207:0x04e0, B:208:0x04e1, B:210:0x04e5, B:211:0x04fc, B:213:0x0500, B:214:0x0507, B:216:0x050b, B:217:0x0511, B:221:0x0517, B:225:0x051c, B:226:0x051d, B:228:0x0521, B:229:0x0527, B:235:0x053f, B:239:0x0544, B:240:0x0545, B:242:0x0549, B:243:0x054f, B:249:0x0562, B:253:0x0567, B:254:0x0568, B:256:0x056c, B:257:0x0570, B:260:0x0575, B:261:0x0579, B:267:0x05b0, B:271:0x05cc, B:274:0x05cf, B:275:0x05d0, B:277:0x05d4, B:278:0x05dc, B:280:0x05e0, B:281:0x05e6, B:284:0x05fc, B:288:0x0601, B:289:0x0602, B:291:0x0606, B:292:0x060a, B:296:0x0612, B:300:0x0617, B:301:0x0618, B:303:0x061c, B:304:0x062d, B:305:0x062f, B:312:0x0651, B:314:0x0660, B:315:0x067b, B:317:0x067f, B:318:0x0686, B:321:0x068b, B:322:0x0698, B:324:0x06b0, B:325:0x06b7, B:327:0x06bf, B:328:0x06c6, B:329:0x06c8, B:353:0x073b, B:354:0x0746, B:356:0x074c, B:357:0x0758, B:358:0x0784, B:370:0x07df, B:373:0x07e2, B:90:0x0324, B:92:0x032e, B:93:0x0338, B:76:0x02b5, B:376:0x07e5, B:38:0x0142, B:306:0x0630, B:307:0x0638, B:309:0x063e, B:310:0x064d, B:311:0x0650, B:230:0x0528, B:232:0x052c, B:233:0x053d, B:61:0x024c, B:62:0x0268, B:244:0x0550, B:246:0x0556, B:247:0x0560, B:262:0x057a, B:264:0x057e, B:265:0x0584, B:266:0x05af, B:258:0x0571, B:259:0x0574, B:172:0x0482, B:173:0x0485, B:112:0x0374, B:113:0x0376, B:135:0x03d8, B:136:0x03de, B:138:0x03e4, B:139:0x03f5, B:140:0x03f8, B:293:0x060b, B:294:0x0610, B:162:0x045e, B:163:0x0462, B:165:0x0468, B:166:0x0472, B:167:0x0475, B:218:0x0512, B:219:0x0515, B:330:0x06c9, B:331:0x06cd, B:333:0x06d3, B:341:0x0704, B:348:0x0725, B:342:0x0707, B:343:0x070d, B:344:0x070e, B:345:0x0713, B:346:0x0718, B:347:0x071f, B:349:0x072d, B:351:0x0733, B:352:0x073a, B:200:0x04d6, B:201:0x04d9, B:282:0x05e7, B:283:0x05fb), top: B:397:0x0138, inners: #0, #1, #2, #3, #6, #8, #9, #12, #13, #14, #15, #16, #17, #18, #19, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0630 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Object, qyw] */
    /* JADX WARN: Type inference failed for: r8v102, types: [java.lang.Object, qwg] */
    /* JADX WARN: Type inference failed for: r8v71, types: [android.os.PowerManager$OnThermalHeadroomChangedListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v74, types: [android.os.PowerManager$OnThermalStatusChangedListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object, qwx] */
    @Override // defpackage.iku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.car.diagnostics.CriticalError r27) {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ima.a(com.google.android.gms.car.diagnostics.CriticalError):void");
    }

    @Override // defpackage.qup
    public final void aA(byte[] bArr, int i) {
        bI(yzy.Ai);
        al();
        yxc yxcVarB = yxc.b(i);
        if (yxcVarB == null) {
            yxcVarB = yxc.UNKNOWN_EVENT_TYPE;
            ((ype) ((ype) b.h()).ai((char) 332)).w("Saw unknown CarEventType: %d.", i);
        }
        jfg jfgVar = this.O;
        try {
            abmc abmcVarH = yxb.a.n().h(bArr, abnj.a());
            int i2 = yfq.d;
            jfh jfhVar = (jfh) jfgVar;
            jfhVar.m((abnp) abmcVarH, yxcVarB, yls.a);
        } catch (abon unused) {
            ((ype) ((ype) jfh.a.h()).ai((char) 1992)).u("Error reading event proto");
        }
        if (i != yxc.NON_UI.aw) {
            return;
        }
        try {
            abnv abnvVarD = abnv.D(yxb.a, bArr, 0, bArr.length, abnj.a());
            abnv.U(abnvVarD);
            yxb yxbVar = (yxb) abnvVarD;
            yyz yyzVar = yxbVar.p;
            if (yyzVar == null) {
                yyzVar = yyz.a;
            }
            if (yyzVar.c == 7) {
                yyz yyzVar2 = yxbVar.p;
                if (yyzVar2 == null) {
                    yyzVar2 = yyz.a;
                }
                if (yyzVar2.d == 256) {
                    try {
                        y().aA(bArr, i);
                    } catch (RemoteException e) {
                        throw roc.aI(e);
                    }
                }
            }
        } catch (abon e2) {
            ((ype) ((ype) ((ype) b.f()).p(e2)).ai((char) 325)).u("Not a valid car Event.");
        }
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aB(CarFacet carFacet) {
        bI(yzy.zW);
        al();
        if (carFacet == null) {
            return;
        }
        jfg jfgVar = this.O;
        long jCurrentTimeMillis = System.currentTimeMillis();
        jfh jfhVar = (jfh) jfgVar;
        CarFacet carFacet2 = jfhVar.g;
        if (carFacet2 != null) {
            int iAt = a.at(carFacet2.a);
            if (iAt == 0) {
                throw null;
            }
            yxc yxcVarL = jfh.l(iAt, true);
            abnp abnpVarN = yxz.a.n();
            String str = carFacet2.b;
            if (str != null) {
                abnpVarN.t();
                yxz yxzVar = (yxz) abnpVarN.b;
                yxzVar.b |= 2;
                yxzVar.c = str;
            }
            abnp abnpVarN2 = yya.a.n();
            yxz yxzVar2 = (yxz) abnpVarN.q();
            abnpVarN2.t();
            yya yyaVar = (yya) abnpVarN2.b;
            yxzVar2.getClass();
            yyaVar.d = yxzVar2;
            yyaVar.b |= 8;
            long j = jCurrentTimeMillis - jfhVar.h;
            abnpVarN2.t();
            yya yyaVar2 = (yya) abnpVarN2.b;
            yyaVar2.b |= 4;
            yyaVar2.c = j;
            yya yyaVar3 = (yya) abnpVarN2.q();
            abnp abnpVarN3 = yxb.a.n();
            abnpVarN3.t();
            yxb yxbVar = (yxb) abnpVarN3.b;
            yyaVar3.getClass();
            yxbVar.g = yyaVar3;
            yxbVar.b |= 4;
            int i = yfq.d;
            jfhVar.m(abnpVarN3, yxcVarL, yls.a);
        }
        jfhVar.g = carFacet;
        jfhVar.h = jCurrentTimeMillis;
        int iAt2 = a.at(carFacet.a);
        if (iAt2 == 0) {
            throw null;
        }
        yxc yxcVarL2 = jfh.l(iAt2, false);
        abnp abnpVarN4 = yxz.a.n();
        String str2 = carFacet.b;
        if (str2 != null) {
            abnpVarN4.t();
            yxz yxzVar3 = (yxz) abnpVarN4.b;
            yxzVar3.b |= 2;
            yxzVar3.c = str2;
        }
        abnp abnpVarN5 = yya.a.n();
        yxz yxzVar4 = (yxz) abnpVarN4.q();
        abnpVarN5.t();
        yya yyaVar4 = (yya) abnpVarN5.b;
        yxzVar4.getClass();
        yyaVar4.d = yxzVar4;
        yyaVar4.b |= 8;
        yya yyaVar5 = (yya) abnpVarN5.q();
        abnp abnpVarN6 = yxb.a.n();
        abnpVarN6.t();
        yxb yxbVar2 = (yxb) abnpVarN6.b;
        yyaVar5.getClass();
        yxbVar2.g = yyaVar5;
        yxbVar2.b |= 4;
        int i2 = yfq.d;
        jfhVar.m(abnpVarN6, yxcVarL2, yls.a);
    }

    @Override // defpackage.qup
    public final void aC(CarFrxEvent carFrxEvent) {
        bI(yzy.zZ);
        al();
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
        jfg jfgVar = this.O;
        abnp abnpVarN2 = yxb.a.n();
        yyd yydVar4 = (yyd) abnpVarN.q();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yydVar4.getClass();
        yxbVar.h = yydVar4;
        yxbVar.b |= 16;
        yxc yxcVar = yxc.FRX_STATE_CHANGE;
        int i4 = yfq.d;
        ((jfh) jfgVar).m(abnpVarN2, yxcVar, yls.a);
    }

    public final void aD() {
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 351)).u("CSB onClientsConnected");
        if (this.f) {
            ((ype) ((ype) yphVar.f()).ai((char) 352)).u("Already connected");
        } else {
            this.f = true;
        }
    }

    public final void aE(Configuration configuration, int i) {
        this.o.post(new sha(this, configuration, i, 1));
    }

    @Override // defpackage.jbn
    public final void aF(yze yzeVar, yzf yzfVar, String str) {
        throw null;
    }

    public final void aG() {
        aE(((GearheadCarServiceCallbacks) this.j).d, sk.AUDIO_CONTENT_BUFFER_SIZE);
    }

    @Override // defpackage.jev
    public final void aH(jeu jeuVar) {
        ((ype) ((ype) b.h()).ai((char) 359)).y("onGenericThreadStuck: %s", jeuVar);
        this.H.add(jeuVar);
    }

    @Override // defpackage.ixl
    public final void aI(int i, boolean z) {
        jbp jbpVar;
        int intExtra;
        Optional optionalX = X();
        if (!optionalX.isEmpty() && (jbpVar = ((iuc) optionalX.get()).s) != null) {
            int i2 = this.am & 2;
            int iElapsedRealtime = 0;
            boolean z2 = (i & 2) != 0;
            if ((i2 != 0) != z2) {
                ((ype) ((ype) b.f()).ai((char) 376)).y("Battery state changed. Is in low power mode: %b", Boolean.valueOf(z2));
                ixs ixsVar = this.E;
                if (ixsVar.v && ixsVar.w) {
                    Intent intentE = dup.e(ixsVar.h, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, 2);
                    intExtra = intentE != null ? intentE.getIntExtra("level", 0) : 0;
                } else {
                    intExtra = ixsVar.d;
                }
                if (!ixsVar.w || Build.VERSION.SDK_INT < 31) {
                    double dAbs = Math.abs(ixsVar.d - ixsVar.b);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    iElapsedRealtime = (int) (ixsVar.d / (dAbs / ((SystemClock.elapsedRealtime() - ixsVar.c) / 1000)));
                } else {
                    Duration durationConvert = TimeConversions.convert(((ixn) ixsVar.l).a.getBatteryDischargePrediction());
                    if (durationConvert != null && !durationConvert.isNegative()) {
                        iElapsedRealtime = (int) durationConvert.toSeconds();
                    }
                }
                izu izuVar = jbpVar.d.g;
                if (izuVar.s.t(1, 4)) {
                    abnp abnpVarN = xhl.a.n();
                    abnpVarN.t();
                    xhl xhlVar = (xhl) abnpVarN.b;
                    xhlVar.b = 1 | xhlVar.b;
                    xhlVar.c = intExtra;
                    abnpVarN.t();
                    xhl xhlVar2 = (xhl) abnpVarN.b;
                    xhlVar2.b = 2 | xhlVar2.b;
                    xhlVar2.d = iElapsedRealtime;
                    abnpVarN.t();
                    xhl xhlVar3 = (xhl) abnpVarN.b;
                    xhlVar3.b |= 4;
                    xhlVar3.e = z2;
                    izuVar.k(23, (xhl) abnpVarN.q());
                } else {
                    izu.a.f().ai(1703).u("Unable to send battery status (protocol version too old)");
                }
            }
        }
        this.am = i;
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aJ(qus qusVar) {
        bI(yzy.AB);
        aj();
        al();
        if (n() == null) {
            throw new IllegalStateException("CarNotConnected");
        }
        this.o.post(new aq(this, qusVar, 8, null));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aK(quv quvVar) {
        bI(yzy.zQ);
        dlz.H(this);
        if (n() == null) {
            throw new IllegalStateException("CarNotConnected");
        }
        this.o.post(new hhw(this, quvVar, 17, (byte[]) null));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aL(quy quyVar) throws RemoteException {
        bI(yzy.Bb);
        ilb.e();
        dlz.H(this);
        this.o.post(new hhw(this, quyVar, 16, (char[]) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    @Override // defpackage.qup
    public final void aM(qwg qwgVar) {
        CountDownLatch countDownLatch;
        bI(yzy.zD);
        yph yphVar = b;
        IBinder iBinderAsBinder = qwgVar.asBinder();
        zjc zjcVar = zjc.a;
        ((ype) yphVar.l().ai((char) 368)).y("Registering %s", new zjd(zjcVar, iBinderAsBinder));
        int callingUid = Binder.getCallingUid();
        Map map = this.g;
        synchronized (map) {
            smv smvVar = new smv(qwgVar, new ilu(this, qwgVar, callingUid));
            boolean zIsEmpty = map.isEmpty();
            if (map.put(qwgVar.asBinder(), smvVar) != null) {
                ((ype) ((ype) yphVar.f()).ai(371)).y("listener %s already on list", new zjd(zjcVar, qwgVar.asBinder()));
                return;
            }
            if (zIsEmpty) {
                countDownLatch = new CountDownLatch(1);
                this.ak = countDownLatch;
                rbe.g(Looper.getMainLooper(), new aq(this, countDownLatch, 10));
            } else {
                countDownLatch = this.ak;
            }
            if (Looper.getMainLooper() == Looper.myLooper() && countDownLatch.getCount() != 0) {
                aD();
                countDownLatch.countDown();
            }
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                yphVar = b;
                ((ype) ((ype) yphVar.g()).ai((char) 370)).u("Failed to wait for initialization...");
            }
            synchronized (this.g) {
                try {
                    if (bs()) {
                        ype ypeVar = (ype) yphVar.l().ai(369);
                        iuc iucVar = this.u;
                        Integer numValueOf = Integer.valueOf(iucVar.p);
                        zjc zjcVar2 = zjc.a;
                        ypeVar.R("Notifying car connection listener with type %s. listener:%s uid:%d", new zjd(zjcVar2, numValueOf), new zjd(zjcVar2, qwgVar.asBinder()), Integer.valueOf(Binder.getCallingUid()));
                        qwgVar.b(iucVar.p);
                    }
                    qwgVar.asBinder().linkToDeath(smvVar.c, 0);
                } catch (RemoteException unused) {
                    aQ(qwgVar.asBinder());
                }
            }
        }
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aN(rpg rpgVar) {
        bI(yzy.AH);
        ak();
        al();
        this.o.post(new aq(this, rpgVar, 9, null));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aO(qyn qynVar) throws RemoteException {
        bI(yzy.Ap);
        aj();
        this.h.add(qynVar);
    }

    public final void aP() {
        if (this.at == null) {
            return;
        }
        ((ype) ((ype) b.f()).ai((char) 372)).u("Removing callback requestVideoFocusRunnable");
        this.o.removeCallbacks(this.at);
        this.at = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    public final void aQ(IBinder iBinder) {
        yph yphVar = b;
        zjc zjcVar = zjc.a;
        ((ype) yphVar.l().ai((char) 373)).y("Removing listener %s", new zjd(zjcVar, iBinder));
        Map map = this.g;
        synchronized (map) {
            smv smvVar = (smv) map.get(iBinder);
            if (smvVar == null) {
                ((ype) ((ype) yphVar.f()).ai(374)).y("listener %s not found in list", new zjd(zjcVar, iBinder));
                return;
            }
            map.remove(iBinder);
            iBinder.unlinkToDeath(smvVar.c, 0);
            if (map.isEmpty()) {
                this.ak = null;
                rbe.j(new ilp(this, 1));
            }
        }
    }

    @Override // defpackage.qup
    public final void aR(String str, boolean z) {
        bI(yzy.zV);
        al();
        this.l.e(str, z);
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aS(CarInfo carInfo, String str) throws RemoteException {
        bI(yzy.Ag);
        al();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            sah sahVarU = U();
            try {
                sbq sbqVar = sahVarU.b;
                String str2 = carInfo.d;
                String str3 = carInfo.a;
                Parcel parcelGh = sbqVar.gh();
                parcelGh.writeString(str2);
                parcelGh.writeString(str3);
                parcelGh.writeString(str);
                sbqVar.gj(5, parcelGh);
                sahVarU.close();
            } finally {
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aT(boolean z) {
        bI(yzy.Ao);
        al();
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aU(String str, int i) {
        bI(yzy.As);
        al();
        this.l.g(str, i);
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aV(MediaOptions mediaOptions) {
        bI(yzy.AV);
        ao();
        if (mediaOptions == null) {
            return;
        }
        Optional optionalX = X();
        int i = 0;
        iln ilnVar = new iln(mediaOptions, i);
        optionalX.isPresent();
        Object obj = optionalX.get();
        Object obj2 = ilnVar.a;
        irb irbVar = ((iuc) obj).y;
        if (irbVar != null) {
            ((ype) ((ype) irb.a.f()).ai((char) 1231)).y("mediaOptions override: %s", obj2);
            while (i < 3) {
                iqa iqaVar = irbVar.w[i];
                if (iqaVar != null) {
                    iqaVar.n((MediaOptions) obj2);
                }
                i++;
            }
        }
    }

    @Override // defpackage.qup
    public final void aW(String str, String str2) {
        bI(yzy.zU);
        al();
        this.l.c.edit().putString(str, str2).apply();
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aX(String str, List list) {
        bI(yzy.Al);
        al();
        if ("car_module_feature_set".equals(str)) {
            this.as = list != null ? ygr.n(list) : yly.a;
        } else {
            this.l.c.edit().putStringSet(str, list != null ? new HashSet<>(list) : yly.a).apply();
        }
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aY(boolean z) {
        bI(yzy.AU);
        ao();
        this.z = Boolean.valueOf(z);
        this.y.b(z);
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aZ(boolean z) {
        bI(yzy.AJ);
        ao();
        ((ype) ((ype) b.f()).ai((char) 384)).u("setWirelessSetting()");
        int i = true != z ? 2 : 1;
        Context context = this.k;
        context.getPackageManager().setComponentEnabledSetting(ah, i, 1);
        BluetoothAdapter bluetoothAdapterA = jfj.a(context);
        if (bluetoothAdapterA == null || !bluetoothAdapterA.isEnabled()) {
            return;
        }
        bluetoothAdapterA.disable();
        new Handler(Looper.getMainLooper()).postDelayed(new ilp(bluetoothAdapterA, 0), 2000L);
    }

    @Override // defpackage.quo, defpackage.qup
    public final List aa() throws RemoteException {
        bI(yzy.Ab);
        al();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            sah sahVarU = U();
            try {
                sbq sbqVar = sahVarU.b;
                Parcel parcelGi = sbqVar.gi(3, sbqVar.gh());
                ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(CarInfoInternal.CREATOR);
                parcelGi.recycle();
                List listBE = bE(arrayListCreateTypedArrayList);
                sahVarU.close();
                return listBE;
            } finally {
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ab(int i) {
        bI(yzy.AK);
        return ((ixu) this.S.gu()).a(qpi.values()[i]);
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ac() throws RemoteException {
        bI(yzy.Ac);
        al();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            sah sahVarU = U();
            try {
                sbq sbqVar = sahVarU.b;
                Parcel parcelGi = sbqVar.gi(4, sbqVar.gh());
                ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(CarInfoInternal.CREATOR);
                parcelGi.recycle();
                List listBE = bE(arrayListCreateTypedArrayList);
                sahVarU.close();
                return listBE;
            } finally {
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.qup
    @ResultIgnorabilityUnspecified
    public final List ad(String str, List list) {
        bI(yzy.Ak);
        ikz ikzVar = this.l;
        if (!ikzVar.o(str)) {
            al();
        }
        if ("car_module_feature_set".equals(str)) {
            return new ArrayList(this.as);
        }
        return new ArrayList(ikzVar.c(str, list != null ? new HashSet(list) : yly.a));
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ae(Intent intent, int i) {
        bI(yzy.Ae);
        return bK(((ixu) this.S.gu()).b(intent, qpi.values()[i]));
    }

    @Override // defpackage.quo, defpackage.qup
    public final List af(Intent intent, int i) {
        bI(yzy.AW);
        return ((ixu) this.S.gu()).b(intent, qpi.values()[i]);
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ag(Intent intent, int i) {
        bI(yzy.AZ);
        return bK(((ixu) this.S.gu()).e(intent, qpi.values()[i]));
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ah(Intent intent, int i) {
        bI(yzy.Ba);
        return ((ixu) this.S.gu()).e(intent, qpi.values()[i]);
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ai(Intent intent) {
        bI(yzy.zJ);
        return ((ixu) this.S.gu()).c(intent);
    }

    @Override // defpackage.jew
    public final void aj() {
        this.e.b();
    }

    @Override // defpackage.jew
    public final void ak() {
        this.e.d();
    }

    @Override // defpackage.jew
    public final void al() {
        if (!bt()) {
            throw new SecurityException("Wrong signature - go/gearhead-retail-device");
        }
    }

    final void am() {
        if (!bn()) {
            throw new SecurityException("Calling package must be Gearhead.");
        }
    }

    public final void an() {
        if (!bn() && !bJ()) {
            throw new SecurityException("Calling package must be Gearhead or PCTS.");
        }
    }

    @Override // defpackage.jew
    public final void ao() {
        if (!bJ()) {
            throw new SecurityException("Calling package must be PCTS.");
        }
    }

    @Override // defpackage.quo, defpackage.qup
    public final void ap(CarDisplayId carDisplayId, ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        bI(yzy.Bg);
        dlz.H(this);
        this.o.post(new ae(this, carDisplayId, projectionWindowAnimationChoreography, 18, (short[]) null));
    }

    @Override // defpackage.quo, defpackage.qup
    @Deprecated
    public final void aq(qwd qwdVar) {
        bI(yzy.zX);
        dlz.H(this);
        if (p().p.an(new ilv(this, qwdVar, 0))) {
            return;
        }
        bG(qwdVar);
    }

    @Override // defpackage.quo, defpackage.qup
    public final void ar(CarDisplayId carDisplayId, final qwd qwdVar) {
        bI(yzy.AG);
        aj();
        al();
        jiw jiwVar = new jiw() { // from class: ilr
            @Override // defpackage.jiw
            public final void a(Bitmap bitmap) {
                ima imaVar = this.a;
                qwd qwdVar2 = qwdVar;
                try {
                    BitmapTeleporter bitmapTeleporter = new BitmapTeleporter(bitmap);
                    bitmapTeleporter.b(imaVar.F.getCacheDir());
                    ((ype) ima.b.l().ai(327)).u("Calling callback.onScreenshotCompleted()");
                    qwdVar2.e(bitmapTeleporter);
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) ima.b.g()).p(e)).ai((char) 328)).u("Client died whilst trying to return screenshot");
                }
            }
        };
        iuu iuuVar = (iuu) W().get(carDisplayId);
        iuuVar.getClass();
        if (iuuVar.p.an(jiwVar)) {
            return;
        }
        bG(qwdVar);
    }

    @Override // defpackage.quo, defpackage.qup
    public final void as(CarRegionId carRegionId, qwd qwdVar) {
        bI(yzy.Be);
        dlz.H(this);
        ilv ilvVar = new ilv(this, qwdVar, 1, null);
        iuu iuuVar = (iuu) W().get(carRegionId.h);
        iuuVar.getClass();
        ims imsVar = ((ina) iuuVar.p).s;
        if (imsVar != null) {
            imsVar.c(carRegionId, ilvVar);
        } else {
            bG(qwdVar);
        }
    }

    public final void at(boolean z, xhv xhvVar) {
        if (!br()) {
            ((ype) ((ype) b.f()).ai((char) 314)).u("Tried to send ByeBye request when not connecting or connected");
            return;
        }
        Optional optionalX = X();
        if (optionalX.isEmpty()) {
            ((ype) ((ype) b.h()).ai((char) 313)).u("Tried to send ByeBye request with no car connection");
            return;
        }
        jbp jbpVar = ((iuc) optionalX.get()).s;
        if (jbpVar == null || !br()) {
            ((ype) ((ype) b.h()).ai((char) 312)).u("Tried to send ByeBye request to null controller");
        } else if (z) {
            jbpVar.c.b(true, xhvVar);
        } else {
            jbpVar.f(xhvVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0b32  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void au(java.io.PrintWriter r18) {
        /*
            Method dump skipped, instructions count: 3112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ima.au(java.io.PrintWriter):void");
    }

    @Override // defpackage.quo, defpackage.qup
    public final void av() throws RemoteException {
        bI(yzy.zS);
        al();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            sah sahVarU = U();
            try {
                sbq sbqVar = sahVarU.b;
                sbqVar.gj(7, sbqVar.gh());
                sahVarU.close();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                if (br()) {
                    fl(xhv.USER_SELECTION);
                }
            } finally {
            }
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aw(CarInfo carInfo) throws RemoteException {
        bI(yzy.Ad);
        al();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            sah sahVarU = U();
            try {
                sbq sbqVar = sahVarU.b;
                String str = carInfo.d;
                String str2 = carInfo.a;
                Parcel parcelGh = sbqVar.gh();
                parcelGh.writeString(str);
                parcelGh.writeString(str2);
                sbqVar.gj(6, parcelGh);
                sahVarU.close();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                if (br()) {
                    Optional optionalX = X();
                    if (optionalX.isEmpty()) {
                        return;
                    }
                    CarInfo carInfo2 = ((iuc) optionalX.get()).r.a;
                    if (carInfo.d.equals(carInfo2.d) && carInfo.a.equals(carInfo2.a)) {
                        fl(xhv.USER_SELECTION);
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    @Override // defpackage.jev
    public final void ax(yze yzeVar, yzf yzfVar, String str) {
        yzeVar.getClass();
        this.o.post(new xx((Object) this, yzeVar, yzfVar, str, 8));
    }

    public final void ay(long j, int i, CarInfoInternal carInfoInternal, jbp jbpVar, boolean z) {
        this.e.e(jeq.b);
        HandlerThread handlerThread = new HandlerThread("Looper");
        iuc iucVar = this.u;
        iucVar.o = j;
        iucVar.p = i;
        iucVar.q = this.O;
        iucVar.r = carInfoInternal;
        iucVar.s = jbpVar;
        iucVar.t = z;
        iucVar.u = handlerThread;
        ilc ilcVar = iucVar.i;
        izj izjVar = new izj(ilcVar, null);
        ima imaVar = (ima) ilcVar;
        iucVar.v = new jff(izjVar, imaVar.l, imaVar.k, i, imaVar.O);
        handlerThread.start();
        if (iucVar.p == 1) {
            Handler handler = iucVar.l;
            long j2 = iucVar.o;
            iucVar.w = new iud(handler, new ire(iucVar.c, 4));
            Context context = iucVar.k;
            iud iudVar = iucVar.w;
            iudVar.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
            ((ype) iuc.a.l().ai((char) 1346)).u("Register usbDisconnectReceiver");
            dup.e(context, iudVar, intentFilter, null, 2);
        }
        iucVar.d(yws.POOL_VIDEO);
        ilz ilzVar = new ilz(this);
        this.n = ilzVar;
        if (!ilzVar.b) {
            ilzVar.b = true;
            ilzVar.a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(ilzVar);
        }
        this.ac = new imf(carInfoInternal.a);
    }

    public final void az(ikz ikzVar) {
        ikzVar.e("toll_card_sensor_enabled", true);
        acxg acxgVar = acxg.a;
        ikzVar.g("touchpad_focus_navigation_history_max_size", (int) acxgVar.gu().c());
        ikzVar.g("touchpad_focus_navigation_history_max_age_ms", (int) acxgVar.gu().b());
        acvn acvnVar = acvn.a;
        ikzVar.g("projected_presentation_config_max_checks", (int) acvnVar.gu().c());
        ikzVar.g("projected_presentation_config_check_delay", (int) acvnVar.gu().a());
        CarInfo carInfoT = t();
        boolean z = carInfoT != null && new jbq(carInfoT.e, carInfoT.f).t(6, 0);
        yfu yfuVar = new yfu(4);
        yfuVar.e(raj.a, false);
        yfuVar.e(raj.b, false);
        yfuVar.e(raj.c, true);
        yfuVar.e(raj.d, true);
        yfuVar.e(raj.e, true);
        yfuVar.e(raj.f, true);
        yfuVar.e(raj.g, true);
        yfuVar.e(raj.h, true);
        yfuVar.e(raj.i, true);
        yfuVar.e(raj.j, true);
        yfuVar.e(raj.k, true);
        yfuVar.e(raj.l, true);
        yfuVar.e(raj.m, true);
        yfuVar.e(raj.n, true);
        yfuVar.e(raj.o, true);
        yfuVar.e(raj.p, true);
        yfuVar.e(raj.q, true);
        yfuVar.e(raj.r, false);
        yfuVar.e(raj.s, true);
        yfuVar.e(raj.t, true);
        yfuVar.e(raj.u, true);
        yfuVar.e(raj.v, true);
        yfuVar.e(raj.w, false);
        yfuVar.e(raj.x, true);
        yfuVar.e(raj.y, true);
        yfuVar.e(raj.z, true);
        yfuVar.e(raj.A, true);
        yfuVar.e(raj.B, true);
        yfuVar.e(raj.C, true);
        yfuVar.e(raj.D, true);
        yfuVar.e(raj.E, true);
        yfuVar.e(raj.F, true);
        yfuVar.e(raj.G, false);
        raj rajVar = raj.V;
        acxa acxaVar = acxa.a;
        yfuVar.e(rajVar, Boolean.valueOf(acxaVar.gu().au() || z));
        yfuVar.e(raj.X, Boolean.valueOf(acxaVar.gu().aV() || z));
        yfuVar.e(raj.W, Boolean.valueOf(acpf.a.gu().k() && Build.VERSION.SDK_INT >= 37));
        yfuVar.e(raj.H, true);
        yfuVar.e(raj.J, true);
        yfuVar.e(raj.I, false);
        yfuVar.e(raj.K, Boolean.valueOf(acvnVar.gu().d()));
        yfuVar.e(raj.L, false);
        yfuVar.e(raj.M, true);
        yfuVar.e(raj.N, true);
        yfuVar.e(raj.O, Boolean.valueOf(a.P()));
        yfuVar.e(raj.P, true);
        yfuVar.e(raj.Y, Boolean.valueOf(acpc.a.gu().x()));
        yfuVar.e(raj.aa, Boolean.valueOf(acxaVar.gu().ax()));
        yfuVar.e(raj.ac, Boolean.valueOf(acxaVar.gu().av()));
        raj rajVar2 = raj.Q;
        acrz acrzVar = acrz.a;
        yfuVar.e(rajVar2, Boolean.valueOf(acrzVar.gu().c()));
        yfuVar.e(raj.R, Boolean.valueOf(acrzVar.gu().d()));
        yfuVar.e(raj.S, Boolean.valueOf(acrzVar.gu().p()));
        yfuVar.e(raj.T, true);
        yfuVar.e(raj.U, Boolean.valueOf(acrzVar.gu().t()));
        yfuVar.e(raj.Z, Boolean.valueOf(affa.f(acon.a.gu().d(), "system_theme")));
        yfuVar.e(raj.ab, Boolean.valueOf(ecw.h(v(false))));
        raj rajVar3 = raj.ad;
        acvt acvtVar = acvt.a;
        yfuVar.e(rajVar3, Boolean.valueOf(acvtVar.gu().u()));
        yfuVar.e(raj.ae, Boolean.valueOf(acvtVar.gu().n()));
        yfuVar.e(raj.af, Boolean.valueOf(acxaVar.gu().aq()));
        yfy yfyVarD = yfuVar.d(true);
        yy yyVar = new yy(raj.values().length);
        yy yyVar2 = new yy(raj.values().length);
        for (raj rajVar4 : raj.values()) {
            woy.ad(yfyVarD.containsKey(rajVar4), "Feature %s is not in moduleFeatureEnabledMap", rajVar4.name());
            Boolean bool = (Boolean) yfyVarD.get(rajVar4);
            rajVar4.name();
            bool.getClass();
            if (bool.booleanValue()) {
                yyVar.add(rajVar4.name());
            } else {
                yyVar2.add(rajVar4.name());
            }
        }
        ((ype) b.l().ai((char) 324)).M("Initialized module features, in memory, in Android Auto. enabled=%s; disabled=%s", yyVar, yyVar2);
        this.as = ygr.n(yyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, qwg] */
    @Override // defpackage.imh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ima.b(android.os.Bundle):void");
    }

    @Override // defpackage.quo, defpackage.qup
    public final boolean bA(Intent intent, Bundle bundle) {
        bI(yzy.Ax);
        ilb.e();
        ak();
        return bz(intent, bundle, -1, false);
    }

    @Override // defpackage.quo, defpackage.qup
    public final byte[] bB() {
        jbp jbpVar;
        xob xobVar;
        bI(yzy.AY);
        ao();
        ((ype) ((ype) b.f()).ai((char) 318)).u("getServiceDisocveryResponseBytes()");
        Optional optionalX = X();
        if (optionalX.isEmpty() || (jbpVar = ((iuc) optionalX.get()).s) == null || (xobVar = jbpVar.g) == null) {
            return null;
        }
        return xobVar.h();
    }

    @Override // defpackage.quo, defpackage.qup
    public final qwq bC() throws IllegalStateException {
        bI(yzy.zN);
        dlz.H(this);
        throw new IllegalStateException("CarNotSupported");
    }

    public final void ba() {
        this.e.e(jeq.f);
        this.ar = new imj(this.o, ai, this, this, this, this.k, true, Optional.of(this.O), Optional.of(new eqy()), acso.a.gu().c());
        ilb.d();
        Looper looperMyLooper = Looper.myLooper();
        ijq ijqVar = this.ap;
        ijs ijsVar = (ijs) ijqVar;
        if (looperMyLooper != ((Handler) ijsVar.f.gu()).getLooper()) {
            throw new IllegalStateException();
        }
        synchronized (ijsVar.h) {
            for (String str : ((ijs) ijqVar).e) {
                ((ijs) ijqVar).k.put(str, new ydx(20));
                ((ijs) ijqVar).l.put(str, new ijr());
            }
            ((ijs) ijqVar).n = true;
        }
        ((Handler) ijsVar.f.gu()).post(ijsVar.g);
        this.ar.e();
        if (Build.VERSION.SDK_INT < 30 || !((Boolean) this.av.gu()).booleanValue()) {
            return;
        }
        this.o.post(this.Z);
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bb(CarRegionId carRegionId) {
        bI(yzy.Bf);
        ilb.e();
        dlz.H(this);
        this.o.post(new hhw(this, carRegionId, 15, (char[]) null));
    }

    public final void bc() {
        rps rpsVar = (rps) this.D.getAndSet(null);
        if (!acur.h() || rpsVar == null) {
            return;
        }
        rpsVar.c();
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bd(qus qusVar) {
        bI(yzy.AC);
        al();
        if (n() == null) {
            return;
        }
        this.o.post(new hhw(this, qusVar, 14, (char[]) null));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void be(quv quvVar) {
        bI(yzy.zR);
        al();
        if (n() == null) {
            return;
        }
        this.o.post(new hhw(this, quvVar, 18, (byte[]) null));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bf() throws RemoteException {
        bI(yzy.Bc);
        ilb.e();
        al();
        this.o.post(new gnu(this, 20));
    }

    @Override // defpackage.qup
    public final void bg(qwg qwgVar) {
        bI(yzy.zE);
        aQ(qwgVar.asBinder());
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bh(rpg rpgVar) {
        bI(yzy.AI);
        al();
        this.o.post(new hhw(this, rpgVar, 13, (char[]) null));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bi(qyn qynVar) throws RemoteException {
        bI(yzy.Aq);
        this.h.remove(qynVar);
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bj(CarActivityLayoutConfig carActivityLayoutConfig) {
        bI(yzy.AE);
        al();
        if (n() == null) {
            ((ype) ((ype) b.f()).ai((char) 404)).u("Unable to update CarActivityLayoutConfig since CarActivityManagerService is null.");
        } else {
            this.o.post(new hhw(this, carActivityLayoutConfig, 19, (byte[]) null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bk(CarActivityLayoutConfig carActivityLayoutConfig, boolean z) {
        imc imcVar = (imc) this.C.get();
        if (imcVar != null) {
            imcVar.c(carActivityLayoutConfig);
        }
        iob iobVarN = n();
        if (iobVarN != null) {
            iobVarN.aj(carActivityLayoutConfig, z);
        } else {
            ((ype) ((ype) b.f()).ai((char) 405)).u("Unable to update CarActivityLayoutConfig since CarActivityManagerService is null.");
        }
        ynp ynpVarListIterator = ((yfq) W().values()).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            bL((iuu) ynpVarListIterator.next(), carActivityLayoutConfig);
        }
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bl(CarRegionId carRegionId, Rect rect) {
        bI(yzy.AF);
        al();
        aj();
        if (n() == null) {
            ((ype) ((ype) b.f()).ai((char) 409)).u("Unable to update insets since CarActivityManagerService is null.");
        } else {
            this.o.post(new ae(this, carRegionId, rect, 19));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean bm() {
        Optional optionalX = X();
        if (optionalX.isEmpty()) {
            return false;
        }
        yfy yfyVar = ((iuc) optionalX.get()).K;
        if (yfyVar.isEmpty()) {
            return false;
        }
        ynp ynpVarListIterator = ((yfq) yfyVar.values()).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            if (((ina) ((iuu) ynpVarListIterator.next()).p).w == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jew
    public final boolean bn() {
        String strB;
        rbe rbeVar = this.T;
        Context context = this.k;
        int callingUid = getCallingUid();
        if (!rbeVar.l(context, callingUid)) {
            return false;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
        try {
            strB = qtr.b(context, skn.a(context).b(context.getPackageName()));
        } catch (IllegalStateException | SecurityException unused) {
            strB = "";
        }
        return packagesForUid != null && spu.e(packagesForUid, strB) >= 0;
    }

    @Override // defpackage.quo, defpackage.qup
    @ResultIgnorabilityUnspecified
    public final boolean bo() {
        bI(yzy.Ay);
        am();
        yph yphVar = b;
        ((ype) ((ype) yphVar.f()).ai((char) 303)).u("Deleting saved Android Auto module data");
        if (gjs.g(ilb.b(this.F))) {
            return true;
        }
        ((ype) ((ype) yphVar.h()).ai((char) 304)).u("Failed to delete all saved Android Auto module data");
        return false;
    }

    @Override // defpackage.qup
    @ResultIgnorabilityUnspecified
    public final boolean bp(String str, boolean z) {
        bI(yzy.zP);
        ikz ikzVar = this.l;
        if (!ikzVar.o(str)) {
            al();
        }
        return ikzVar.k(str, z);
    }

    @Override // defpackage.qup
    public final boolean bq(String str, boolean z) {
        bI(yzy.At);
        itw itwVarA = itw.a();
        Boolean boolValueOf = Boolean.valueOf(z);
        Pair pair = new Pair(str, boolValueOf);
        ConcurrentHashMap concurrentHashMap = itwVarA.b;
        war warVar = (war) concurrentHashMap.get(pair);
        if (warVar == null) {
            wap wapVar = itwVarA.a;
            String str2 = (String) pair.first;
            boolean z2 = war.b;
            concurrentHashMap.putIfAbsent(pair, new waj(wapVar, str2, boolValueOf, false));
            warVar = (war) concurrentHashMap.get(pair);
        }
        return ((Boolean) warVar.b()).booleanValue();
    }

    @Override // defpackage.jew
    public final boolean br() {
        jeq jeqVarA = this.e.a();
        return jeqVarA.equals(jeq.c) || jeqVarA.equals(jeq.b) || jeqVarA.equals(jeq.f);
    }

    @Override // defpackage.qup, defpackage.jew
    public final boolean bs() {
        bI(yzy.zB);
        return this.e.a().equals(jeq.c);
    }

    @Override // defpackage.jew
    public final boolean bt() {
        return this.T.l(this.k, getCallingUid());
    }

    @Override // defpackage.jet
    public final boolean bu(int i) {
        iob iobVarN = n();
        if (iobVarN != null) {
            return iobVarN.an(i);
        }
        return false;
    }

    @Override // defpackage.quo, defpackage.qup
    public final boolean bv(String str, int i) {
        bI(yzy.Af);
        return ((ixu) this.S.gu()).n(str, qpi.values()[i]);
    }

    @Override // defpackage.quo, defpackage.qup
    public final boolean bw(String str, int i) {
        bI(yzy.An);
        return ((ixu) this.S.gu()).o(str, qpi.values()[i]);
    }

    @Override // defpackage.quo, defpackage.qup
    public final boolean bx() {
        jbp jbpVar;
        bI(yzy.Bd);
        ao();
        yph yphVar = b;
        ((ype) ((ype) yphVar.f()).ai((char) 377)).u("sendHardShutdown()");
        Optional optionalX = X();
        if (optionalX.isEmpty() || (jbpVar = ((iuc) optionalX.get()).s) == null) {
            return false;
        }
        ((ype) ((ype) yphVar.f()).ai((char) 378)).u("Sending hard shutdown message.");
        jbpVar.d.g.k(57005, xjq.a);
        return true;
    }

    @Override // defpackage.quo, defpackage.qup
    public final boolean by(Intent intent) {
        bI(yzy.zI);
        ilb.e();
        ak();
        return bz(intent, null, -1, true);
    }

    public final boolean bz(final Intent intent, final Bundle bundle, final int i, final boolean z) {
        if (n() == null) {
            ((ype) ((ype) b.h()).ai(387)).S("CAMS is null. Ignoring startCarActivityManager(%s, %s, %d, %b)", intent, bundle, Integer.valueOf(i), Boolean.valueOf(z));
            return false;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            ((ixu) this.S.gu()).g(component.getPackageName());
        }
        mqb mqbVarD = mpl.d(intent);
        if (mqbVarD != null) {
            ((ixu) this.S.gu()).g(mqbVarD.a.getPackageName());
        }
        final yfq yfqVarC = ((ixu) this.S.gu()).c(intent);
        if (yfqVarC.isEmpty()) {
            ((ype) ((ype) b.h()).ai((char) 386)).y("Package in intent not found: %s is the service exported?", intent);
            return false;
        }
        if (intent != null && intent.hasFileDescriptors()) {
            throw new IllegalArgumentException("File descriptors passed in Intent");
        }
        this.o.post(new Runnable() { // from class: ilo
            @Override // java.lang.Runnable
            public final void run() {
                ype ypeVar = (ype) ima.b.l().ai(385);
                int i2 = i;
                Integer numValueOf = Integer.valueOf(i2);
                List list = yfqVarC;
                Intent intent2 = intent;
                Bundle bundle2 = bundle;
                boolean z2 = z;
                ypeVar.T("startCarActivityInternal(%s, %s, %d, %s, %b", intent2, bundle2, numValueOf, list, Boolean.valueOf(z2));
                iob iobVarN = this.a.n();
                if (iobVarN == null) {
                    return;
                }
                if (z2 && (intent2 == null || !intent2.getBooleanExtra("assistant_activity", false))) {
                    iobVarN.L(intent2);
                } else if (i2 == -1) {
                    iobVarN.aa(list, intent2, bundle2);
                } else {
                    iobVarN.as(intent2, bundle2, i2);
                }
            }
        });
        return true;
    }

    @Override // defpackage.ilc
    public final ikt c() {
        return new ikt(this, this.e, this.O, this.k, this.l, s(), this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.imh
    public final void d() {
        ynp ynpVarListIterator = ((yfq) W().values()).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            iur iurVar = ((iuu) ynpVarListIterator.next()).n;
            if (iurVar != null) {
                iurVar.d(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0146, code lost:
    
        if (r4 == false) goto L45;
     */
    @Override // defpackage.imh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ima.e():void");
    }

    @Override // defpackage.imh
    public final void f(Bundle bundle) {
        bundle.getBoolean("use_car_activity_animations");
        this.W = bundle.getBoolean("use_sticky_window_focus", false);
        if (bundle.getByteArray("activity_layout_config") == null) {
            ax(yze.CAR_SERVICE_INIT_ERROR, yzf.NO_ACTIVITY_LAYOUT_CONFIG, "ProjectionLifecycleService must pass a CarActivityLayoutConfig");
            return;
        }
        CarActivityLayoutConfig carActivityLayoutConfig = (CarActivityLayoutConfig) spu.h(bundle.getByteArray("activity_layout_config"), CarActivityLayoutConfig.CREATOR);
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 406)).y("Configuration updated to %s", carActivityLayoutConfig);
        bk(carActivityLayoutConfig, true);
        iob iobVarN = n();
        if (iobVarN != null) {
            iobVarN.Y(bundle.getBundle("dynamic_configuration"));
        } else {
            ((ype) ((ype) yphVar.f()).ai((char) 407)).u("Unable to update configuration since CarActivityManagerService is null.");
        }
    }

    @Override // defpackage.imh
    public final void fj() {
        if (acso.f()) {
            fl(xhv.USER_SELECTION);
        } else {
            ax(yze.PROJECTION_PROCESS_CRASH_LOOP, yzf.TOO_MANY_CRASHES, "Crash loop detected");
        }
        this.O.b(rrc.h(yxy.CAR_SERVICE, yzz.CAR_SERVICE, yzy.ug).l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.imh
    public final void fk(Bundle bundle) {
        ilb.d();
        woy.O((bundle.equals(Bundle.EMPTY) || bundle.keySet().isEmpty()) ? false : true, "Config cannot be empty.");
        synchronized (this.q) {
            if (br()) {
                Context context = this.k;
                String str = null;
                Object[] objArr = 0;
                ols.K(context, "com.google.android.gms.car.STARTUP_LATENCY_MEASUREMENT_EVENT", rry.d.ordinal(), null);
                bundle.getBoolean("use_car_activity_animations");
                this.W = bundle.getBoolean("use_sticky_window_focus", false);
                iuu iuuVarP = p();
                iuuVarP.getClass();
                if (bundle.getByteArray("activity_layout_config") == null) {
                    ax(yze.CAR_SERVICE_INIT_ERROR, yzf.NO_ACTIVITY_LAYOUT_CONFIG, "ProjectionLifecycleService must pass a CarActivityLayoutConfig");
                    return;
                }
                CarActivityLayoutConfig carActivityLayoutConfig = (CarActivityLayoutConfig) spu.h(bundle.getByteArray("activity_layout_config"), CarActivityLayoutConfig.CREATOR);
                imc imcVar = (imc) this.C.get();
                if (imcVar != null) {
                    imcVar.c(carActivityLayoutConfig);
                }
                n().V(carActivityLayoutConfig);
                iob iobVarN = n();
                izj izjVar = new izj(this, objArr == true ? 1 : 0);
                ilb.d();
                iobVarN.q.add(izjVar);
                n().Y(bundle.getBundle("dynamic_configuration"));
                imj imjVar = this.ar;
                imjVar.getClass();
                ilb.d();
                if (imjVar.k.compareTo(imi.d) >= 0) {
                    Intent intent = imjVar.l;
                    intent.getClass();
                    str = intent.getPackage();
                }
                ynp ynpVarListIterator = ((yfq) W().values()).listIterator(0);
                while (ynpVarListIterator.hasNext()) {
                    iuu iuuVar = (iuu) ynpVarListIterator.next();
                    if (str != null) {
                        try {
                            Context contextCreatePackageContext = context.createPackageContext(str, 0);
                            int iA = this.ao.a(contextCreatePackageContext);
                            if (iA != 0) {
                                ((ina) iuuVar.p).Y.m(contextCreatePackageContext, iA);
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 323)).y("Failed to initialize default content window animations for package: %s", str);
                        }
                    }
                    iuuVar.o.i();
                    bL(iuuVar, carActivityLayoutConfig);
                }
                iuc iucVar = this.u;
                if (iucVar.p != 0 && iuuVarP.o != null && this.J) {
                    ((ype) b.l().ai(367)).u("First projection start, requesting video focus for primary display immediately.");
                    iuuVarP.o.k();
                }
                ((ype) ((ype) b.f()).ai(361)).y("Starting preflight, legacyFrxRan: %b", Boolean.valueOf(this.v));
                this.ar.c(this.v, iucVar.r);
            }
        }
    }

    @Override // defpackage.iku
    public final void fl(xhv xhvVar) {
        this.o.post(new hhw(this, xhvVar, 12, (char[]) null));
    }

    @Override // defpackage.quo, defpackage.qup
    public final double ge(String str, double d2) {
        bI(yzy.Aw);
        itw itwVarA = itw.a();
        Double dValueOf = Double.valueOf(d2);
        Pair pair = new Pair(str, dValueOf);
        ConcurrentHashMap concurrentHashMap = itwVarA.e;
        war warVar = (war) concurrentHashMap.get(pair);
        if (warVar == null) {
            wap wapVar = itwVarA.a;
            String str2 = (String) pair.first;
            boolean z = war.b;
            concurrentHashMap.putIfAbsent(pair, new wak(wapVar, str2, dValueOf));
            warVar = (war) concurrentHashMap.get(pair);
        }
        return ((Double) warVar.b()).doubleValue();
    }

    @Override // defpackage.quo, defpackage.qup
    @ResultIgnorabilityUnspecified
    public final int gf(String str, int i) {
        bI(yzy.Ar);
        ikz ikzVar = this.l;
        if (!ikzVar.o(str)) {
            al();
        }
        return ikzVar.c.getInt(str, i);
    }

    @Override // defpackage.quo, defpackage.qup
    public final int gg() {
        bI(yzy.Bi);
        am();
        if (Build.VERSION.SDK_INT < 34) {
            throw new UnsupportedOperationException("Device ID not available on T-");
        }
        if (this.ax != -1) {
            ((ype) b.l().ai(321)).w("Returning cached virtual device id: %d", this.ax);
            return this.ax;
        }
        try {
            this.ax = dsg.D(this.F).f(dlz.D()).a.getDeviceId();
        } catch (Exception e) {
            ((ype) ((ype) ((ype) b.h()).p(e)).ai((char) 320)).u("Failed to retrieve virtual device id from CDM");
        }
        ((ype) b.l().ai(319)).w("Retrieved virtual device id: %d", this.ax);
        return this.ax;
    }

    @Override // defpackage.qup, defpackage.jew
    public final int h() {
        bI(yzy.zC);
        bF();
        return this.u.p;
    }

    @Override // defpackage.jew
    public final int i() {
        return this.u.p;
    }

    @Override // defpackage.quo, defpackage.qup
    public final int k(String str, int i) {
        bI(yzy.Av);
        itw itwVarA = itw.a();
        Integer numValueOf = Integer.valueOf(i);
        Pair pair = new Pair(str, numValueOf);
        ConcurrentHashMap concurrentHashMap = itwVarA.d;
        war warVar = (war) concurrentHashMap.get(pair);
        if (warVar == null) {
            wap wapVar = itwVarA.a;
            String str2 = (String) pair.first;
            boolean z = war.b;
            concurrentHashMap.putIfAbsent(pair, new wai(wapVar, str2, numValueOf));
            warVar = (war) concurrentHashMap.get(pair);
        }
        return ((Integer) warVar.b()).intValue();
    }

    public final Configuration m(CarDisplayId carDisplayId) {
        jff jffVar = this.u.v;
        jffVar.getClass();
        return jffVar.a(carDisplayId, ((GearheadCarServiceCallbacks) this.j).d);
    }

    public final iob n() {
        return (iob) this.A.get();
    }

    public final iuu p() {
        return (iuu) W().get(CarDisplayId.a);
    }

    @Override // defpackage.jkl
    public final jkk q(CarDisplayId carDisplayId) {
        iuu iuuVar = (iuu) W().get(carDisplayId);
        woy.ad(iuuVar != null, "No valid display for carDisplayId: %s", carDisplayId);
        jkk jkkVar = iuuVar.p;
        jkkVar.getClass();
        return jkkVar;
    }

    @Override // defpackage.quo, defpackage.qup
    public final AnalyticsSessionInfo r() {
        bI(yzy.AT);
        am();
        rqd rqdVarA = rqd.a();
        int i = ((jfh) this.O).i;
        Stream stream = Collection.EL.stream(aj);
        rqdVarA.getClass();
        Stream map = stream.map(new gjm(rqdVarA, 5));
        int i2 = yfq.d;
        return new AnalyticsSessionInfo(i, (yfq) map.collect(ycm.a));
    }

    @Override // defpackage.qup
    public final CarInfo s() {
        char c2;
        bI(yzy.zz);
        if (bt()) {
            bF();
            c2 = (bn() || bJ()) ? (char) 1 : (char) 2;
        } else {
            aj();
            c2 = 3;
        }
        CarInfo carInfoT = t();
        if (c2 == 1) {
            return carInfoT;
        }
        CarInfo carInfo = new CarInfo(carInfoT.a, carInfoT.b, carInfoT.c, carInfoT.d, carInfoT.e, carInfoT.f, carInfoT.g, carInfoT.h, carInfoT.i, carInfoT.j, carInfoT.k, carInfoT.l, carInfoT.m, carInfoT.n, carInfoT.o, carInfoT.p, carInfoT.q, carInfoT.r);
        if (jfr.d(carInfoT.a, carInfoT.b, carInfoT.c, carInfoT.i, carInfoT.j, (ygr) tgx.d(new ilq(15), acoe.b()).collect(ycm.b))) {
            carInfo.b = "redacted";
        }
        if (c2 != 3) {
            return carInfo;
        }
        carInfo.e = 0;
        carInfo.f = 0;
        carInfo.g = false;
        carInfo.m = false;
        carInfo.n = false;
        carInfo.o = false;
        carInfo.p = null;
        return carInfo;
    }

    @Override // defpackage.jes
    public final CarInfo t() {
        CarInfoInternal carInfoInternal;
        Optional optionalX = X();
        if (optionalX.isEmpty() || (carInfoInternal = ((iuc) optionalX.get()).r) == null) {
            return null;
        }
        return carInfoInternal.a;
    }

    @Override // defpackage.quo, defpackage.qup
    public final CarUiInfo u() {
        bI(yzy.zA);
        ak();
        CarUiInfo carUiInfoV = v(true);
        if (carUiInfoV != null) {
            return carUiInfoV;
        }
        CarUiInfo carUiInfo = new CarUiInfo(false, 1, false, false, null, false, false, 0, 0);
        ((ype) ((ype) b.g()).ai((char) 315)).y("Car UI info wasn't set. Using all false values: %s", carUiInfo);
        return carUiInfo;
    }

    public final CarUiInfo v(boolean z) {
        iuu iuuVarP = p();
        if (iuuVarP == null) {
            if (z) {
                throw new IllegalStateException("Could not get primary display CarUiInfo - no primary display");
            }
            return null;
        }
        ikb ikbVar = iuuVarP.q;
        if (ikbVar != null) {
            return ikbVar.m;
        }
        if (z) {
            throw new IllegalStateException("Could not get primary display CarUiInfo - no primary input service");
        }
        return null;
    }

    @Override // defpackage.qup
    public final qug w(CreateAudioPolicyRequest createAudioPolicyRequest, qud qudVar, quj qujVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qup
    public final qum x(CreateAudioRecordRequest createAudioRecordRequest, qud qudVar) {
        throw new UnsupportedOperationException();
    }

    public final qup y() {
        qup qupVar = (qup) this.i.get();
        woy.aa(qupVar != null, "Delegate ICar is null, cannot call to car service");
        return qupVar;
    }

    @Override // defpackage.qup
    public final qvb z() {
        bI(yzy.zG);
        aj();
        iwz iwzVar = o(X()).x;
        if (iwzVar != null) {
            return iwzVar;
        }
        throw new IllegalStateException("CarNotSupported");
    }
}
