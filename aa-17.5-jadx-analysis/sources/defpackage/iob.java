package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import androidx.car.app.model.Action;
import com.google.android.gms.car.ActivityLaunchInfo;
import com.google.android.gms.car.CarActivityLayoutParams;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionGroup;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig;
import com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;
import j$.util.Objects;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class iob implements ixl {
    public static final Intent a;
    public static final yph b;
    static final Map c;
    public final iss A;
    private final String B;
    private final ComponentName C;
    private final ComponentName D;
    private final ComponentName E;
    private final ComponentName F;
    private final ioa G;
    private final ijx H;
    private final ixu I;
    private final xwx J;
    private final inf K;
    private final inf L;
    private final inf M;
    private ComponentName N;
    private Queue S;
    private final boolean T;
    private quy U;
    private boolean W;
    private ins X;
    private Bundle Y;
    private boolean Z;
    public final Context d;
    public final jfg e;
    public final jes f;
    public final ikz g;
    public final jew h;
    public final qup i;
    public final ixs j;
    public final jkl k;
    public final imc l;
    public final irb m;
    public volatile boolean o;
    public iod p;
    Map s;
    public boolean y;
    public final rps z;
    final yw n = new yw();
    public final Set q = new HashSet();
    public final Set r = new HashSet();
    private final Set O = new HashSet();
    private final Set P = new HashSet();
    private final Handler Q = new sss(Looper.getMainLooper(), (byte[]) null);
    private int R = 0;
    public final Map t = new HashMap();
    public final Map u = new HashMap();
    ivv v = ivv.d;
    private final Queue V = new ArrayDeque();
    public final Object w = new Object();
    public final Map x = new yw();

    static {
        Intent intent = new Intent("android.intent.action.MAIN");
        a = intent;
        b = yph.c("CAR.CAM");
        intent.addCategory("android.intent.category.HOME");
        c = new HashMap();
    }

    public iob(ioa ioaVar, Context context, jfg jfgVar, ijx ijxVar, jes jesVar, ixu ixuVar, ikz ikzVar, jew jewVar, qup qupVar, ixs ixsVar, xwx xwxVar, inf infVar, inf infVar2, inf infVar3, boolean z, jkl jklVar, imc imcVar, rps rpsVar, iss issVar, irb irbVar) {
        ikb ikbVar = null;
        this.G = ioaVar;
        this.d = context;
        this.e = jfgVar;
        this.H = ijxVar;
        this.f = jesVar;
        this.I = ixuVar;
        this.g = ikzVar;
        this.h = jewVar;
        this.i = qupVar;
        this.j = ixsVar;
        if (Build.VERSION.SDK_INT >= 35) {
            infVar.getClass();
        }
        this.K = infVar;
        this.L = infVar2;
        this.M = infVar3;
        this.T = z;
        this.J = xwxVar;
        this.k = jklVar;
        this.l = imcVar;
        this.z = rpsVar;
        this.A = issVar;
        this.m = irbVar;
        String strC = ilb.c(context);
        this.B = strC;
        a.setPackage(strC);
        ComponentName componentName = new ComponentName(strC, "com.google.android.projection.gearhead.input.RotaryInputMethodService");
        this.D = componentName;
        ComponentName componentName2 = new ComponentName(strC, "com.google.android.projection.gearhead.input.TouchInputMethodService");
        this.E = componentName2;
        this.C = new ComponentName(strC, "com.google.android.projection.gearhead.media.MediaService");
        this.F = new ComponentName(strC, "com.google.android.projection.gearhead.telecom.TelecomService");
        this.o = true;
        if (jewVar.h() == 0) {
            ComponentName componentName3 = ((ima) ioaVar).L;
            if (componentName3 != null) {
                componentName2 = componentName3;
            }
        } else {
            CarUiInfo carUiInfoV = ((ima) jesVar).v(true);
            carUiInfoV.getClass();
            componentName = carUiInfoV.b ? componentName2 : componentName;
            Intent intent = new Intent("com.google.android.gms.car.BIND_CAR_INPUT");
            intent.setComponent(componentName);
            if (ixuVar.d(intent.cloneFilter()).isEmpty()) {
                ((ype) ((ype) b.h()).ai((char) 664)).y("Unable to find the IME component %s through CarProjectionValidator", componentName);
                componentName2 = null;
            } else {
                yph yphVar = b;
                ((ype) yphVar.l().ai((char) 662)).u("Found matching IME component");
                ((ype) ((ype) yphVar.f()).ai((char) 663)).y("Using IME component %s", componentName);
                componentName2 = componentName;
            }
        }
        if (componentName2 != null) {
            spi spiVarA = spi.a();
            iuu iuuVarP = ((ima) ijxVar).p();
            if (iuuVarP == null) {
                ((ype) ((ype) ima.b.f()).ai((char) 316)).u("Display is null, so returning null CarInputService");
            } else {
                ikbVar = iuuVarP.q;
            }
            this.p = new iof(context, componentName2, spiVarA, ikbVar.g());
        }
        ((jfh) jfgVar).f.add(new ecw());
    }

    public static void R(ing ingVar) {
        ((ina) ingVar.y).R(ingVar.d(), ingVar.w, ingVar.x, true, true, false, null);
    }

    private final ygr aA(CarDisplayId carDisplayId) {
        ygp ygpVar = new ygp();
        for (CarRegionId carRegionId : this.t.keySet()) {
            if (carRegionId.h.equals(carDisplayId)) {
                ygpVar.c(carRegionId);
            }
        }
        return ygpVar.g();
    }

    private final List aB(Intent intent) {
        return this.I.d(intent);
    }

    private final void aC(CarRegionId carRegionId, CarActivityRegionLayoutConfig carActivityRegionLayoutConfig) {
        this.t.put(carRegionId, new inn(this, new fbe(carActivityRegionLayoutConfig, new imp(this, carActivityRegionLayoutConfig.b, carRegionId, 2, (char[]) null))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aD(String str, CarRegionId carRegionId) {
        ((ype) ((ype) b.h()).ai(666)).M("fallbackToDefaultComponent(). Reason: %s, region: %s", str, carRegionId);
        Pair pairAx = ax(carRegionId);
        ComponentName componentName = (ComponentName) pairAx.first;
        CarRegionId carRegionId2 = (CarRegionId) pairAx.second;
        ioc iocVar = (ioc) this.n.get(componentName);
        if (iocVar == null || iocVar.c() == null || (acny.h() && iocVar.c().s == null)) {
            at(new Intent().setComponent(componentName), carRegionId2);
            return;
        }
        ing ingVarC = iocVar.c();
        inn innVarG = g(carRegionId2);
        ing ingVar = innVarG.e;
        innVarG.e = ingVarC;
        s(ingVarC);
        ingVarC.w(new inu(ingVarC.s, ingVarC, true, new jin(null, null, null, null)));
    }

    private final void aE(CarDisplayId carDisplayId) {
        inm inmVarF = f(carDisplayId);
        List<inx> list = inmVarF.h;
        if (list.isEmpty()) {
            return;
        }
        if (!inmVarF.c) {
            ((ype) b.l().ai((char) 669)).u("Cannot flush search keys without video focus");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (inx inxVar : list) {
            long j = inxVar.a;
            if (2500 + j > jElapsedRealtime) {
                E(carDisplayId, inxVar.b, inxVar.c, inxVar.d, Duration.ofMillis(j));
            }
        }
        list.clear();
    }

    private final void aF(xke xkeVar, CarDisplayId carDisplayId) {
        CarRegionId carRegionId = new CarRegionId(0, carDisplayId);
        ComponentName componentName = ((ima) this.G).M;
        if (componentName != null) {
            ((ype) ((ype) b.f()).ai((char) 678)).y("Using app key override %s", componentName);
        } else {
            int i = xkeVar.c;
            if (i != 3) {
                if (i != 65540) {
                    ((ype) b.l().ai((char) 675)).u("Not an app key.");
                } else {
                    ((ype) b.l().ai((char) 677)).u("Got keycode for tel.");
                    if (!acny.k()) {
                        componentName = this.F;
                    }
                }
                componentName = null;
            } else {
                ((ype) b.l().ai((char) 676)).u("Got keycode for home.");
                componentName = (ComponentName) ax(carRegionId).first;
            }
        }
        Intent component = new Intent().setComponent(componentName);
        if (componentName != null) {
            at(component, carRegionId);
        }
    }

    private final void aG(CarRegionId carRegionId) {
        if (g(carRegionId).g) {
            return;
        }
        if (!f(carRegionId.h).b) {
            ((ype) b.l().ai((char) 703)).y("Waiting for video focus to pre-warm %s", carRegionId);
            return;
        }
        if (!this.Z) {
            ((ype) b.l().ai((char) 702)).y("Not ready to start pre-warms for %s", carRegionId);
            return;
        }
        long jB = acur.b();
        if (jB <= 0) {
            K(carRegionId);
        } else {
            rbe.i(new ino(this, carRegionId, 1), jB);
        }
    }

    private final void aH() {
        HashSet hashSet = new HashSet();
        int i = 0;
        for (inm inmVar : this.u.values()) {
            if (inmVar.c) {
                i++;
                for (ing ingVar : inmVar.f.v()) {
                    if (ingVar.H()) {
                        hashSet.add(ingVar.d);
                    }
                }
            }
        }
        int iJ = (int) acqy.a.gu().j();
        ivv ivvVar = (iJ != -1 && tgx.d(new ijt(12), acqy.p()).filter(new ghp(hashSet, 5)).count() >= ((long) iJ) && eqy.g(i)) ? ivv.a : eqy.g(i) ? ivv.b : ivv.d;
        if (ivvVar != this.v) {
            ((ype) b.l().ai(707)).M("Updating restriction level from %s to %s", this.v, ivvVar);
            this.v = ivvVar;
            yfq yfqVarV = this.k.V();
            int i2 = ((yls) yfqVarV).c;
            for (int i3 = 0; i3 < i2; i3++) {
                ((jkk) yfqVarV.get(i3)).V(ivvVar);
            }
        }
    }

    private final void aJ(CarRegionId carRegionId, Intent intent) {
        ActivityLaunchInfo activityLaunchInfo = new ActivityLaunchInfo(intent, carRegionId);
        aM(new ink(activityLaunchInfo, 2), activityLaunchInfo);
    }

    private final void aK(inv invVar, Object obj) {
        ArrayList arrayList = new ArrayList();
        Set<quv> set = this.r;
        set.size();
        for (quv quvVar : set) {
            if (!aX(quvVar, invVar, obj)) {
                arrayList.add(quvVar);
            }
        }
        set.removeAll(arrayList);
    }

    private final void aL(CarDisplayLayoutConfig carDisplayLayoutConfig) {
        HashSet hashSet = new HashSet();
        Set<rpg> set = this.O;
        for (rpg rpgVar : set) {
            if (!aY(rpgVar, carDisplayLayoutConfig.a, carDisplayLayoutConfig.b)) {
                hashSet.add(rpgVar);
            }
        }
        set.removeAll(hashSet);
    }

    private final void aM(inv invVar, ActivityLaunchInfo activityLaunchInfo) {
        ArrayList arrayList = new ArrayList();
        for (qus qusVar : this.P) {
            try {
                invVar.a(qusVar);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) b.f()).p(e)).ai((char) 711)).y("Error calling lifecycle listener with %s. Listener will be removed.", activityLaunchInfo);
                arrayList.add(qusVar);
            }
        }
        this.P.removeAll(arrayList);
    }

    private final void aN(ing ingVar) {
        inz inzVar = ingVar.s;
        if (inzVar == null) {
            ((ype) ((ype) b.h()).ai((char) 712)).y("Attempting to notify that %s was destroyed before it was resumed", ingVar);
            return;
        }
        ActivityLaunchInfo activityLaunchInfo = new ActivityLaunchInfo(inzVar.c, ingVar.z);
        aM(new ink(activityLaunchInfo, 1), activityLaunchInfo);
    }

    private final void aO(ing ingVar) {
        Intent intent = ingVar.s.c;
        CarRegionId carRegionId = ingVar.z;
        ActivityLaunchInfo activityLaunchInfo = new ActivityLaunchInfo(intent, carRegionId);
        aM(new ink(activityLaunchInfo, 3), activityLaunchInfo);
        if (this.l.d(carRegionId)) {
            aK(new inj(intent, 0), intent);
        }
    }

    private final void aP(ing ingVar, boolean z) {
        boolean z2;
        CarRegionId carRegionId = ingVar.z;
        inn innVarG = g(carRegionId);
        if (innVarG.j.f(ingVar)) {
            be(innVarG);
        }
        if (z) {
            ingVar.y(null);
        }
        inm inmVarF = f(carRegionId.h);
        if (inmVarF.c) {
            return;
        }
        Set set = inmVarF.a;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            } else if (carRegionId.equals(((ing) it.next()).z)) {
                z2 = true;
                break;
            }
        }
        boolean z3 = inmVarF.e;
        if (z2 || z3) {
            return;
        }
        ((ype) ((ype) b.f()).ai((char) 725)).y("saving failed-to-resume client to restore on video focus gain: %s", ingVar.d.getShortClassName());
        set.add(ingVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.lang.Runnable] */
    private final void aQ(ing ingVar) {
        ingVar.c.d();
        inn innVarG = g(ingVar.z);
        int i = innVarG.d;
        ((ype) ((ype) b.f()).ai((char) 771)).w("Default component crash #%d", i);
        if (i > 7) {
            this.N = new ComponentName(this.d, (Class<?>) ioj.class);
            bf(new ArrayList(), new Intent().setComponent(this.N), null, 1);
        } else {
            long j = (i - 2) * 2500;
            if (j < 0) {
                j = 0;
            }
            this.Q.postDelayed(innVarG.q.a, j);
        }
    }

    private final void aR(ing ingVar) {
        ype ypeVar = (ype) ((ype) b.f()).ai(775);
        Integer numValueOf = Integer.valueOf(ingVar.b());
        ComponentName componentName = ingVar.d;
        ioc iocVar = ingVar.c;
        ypeVar.R("Starting %s from history, task:%s, layer:%d", componentName, iocVar, numValueOf);
        inz inzVar = ingVar.s;
        inzVar.getClass();
        Intent intentAddFlags = inzVar.c.addFlags(1048576);
        qql qqlVar = new qql();
        qqlVar.e = ingVar.z;
        ba(intentAddFlags, qqlVar.a(), iocVar, ingVar.b());
    }

    private final synchronized void aS(Intent intent, Bundle bundle, ioc iocVar, int i) throws Throwable {
        try {
            try {
                ilb.d();
                bb(aB(intent), intent, bundle, iocVar, i, true);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void aT(CarRegionId carRegionId) {
        inn innVarG = g(carRegionId);
        ing ingVar = innVarG.e;
        if (ingVar != null) {
            ingVar.y(null);
        }
        innVarG.b = null;
        Set set = f(carRegionId.h).a;
        Iterator it = new HashSet(set).iterator();
        while (it.hasNext()) {
            ing ingVar2 = (ing) it.next();
            CarRegionId carRegionId2 = ingVar2.z;
            if (carRegionId2.equals(carRegionId)) {
                set.remove(ingVar2);
                Intent intent = ingVar2.t;
                if (intent != null) {
                    intent.removeFlags(4);
                    ingVar2.D();
                    aJ(carRegionId2, intent);
                }
            }
        }
        innVarG.a();
    }

    private final boolean aU() {
        return this.t.containsKey(CarRegionId.c);
    }

    private final boolean aV(Intent intent) {
        return aU() && intent.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.VOICEPLATE_2_ENABLED", false);
    }

    private final boolean aW(Intent intent) {
        ((ype) b.l().ai((char) 697)).y("Sending %s to be processed", intent);
        quy quyVar = this.U;
        if (quyVar != null) {
            try {
                quyVar.e(intent);
                return true;
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) b.h()).p(e)).ai(698)).M("Remote exception with %s, queuing intent %s", this.U, intent);
                this.U = null;
            }
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    private static boolean aX(quv quvVar, inv invVar, Object obj) {
        try {
            invVar.a(quvVar);
            return true;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) b.f()).p(e)).ai((char) 708)).y("Error calling ICarActivityStartListener with: %s. Listener will be removed.", obj);
            return false;
        }
    }

    private static boolean aY(rpg rpgVar, CarDisplayId carDisplayId, String str) {
        try {
            rpgVar.e(str, carDisplayId);
            return true;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) b.f()).p(e)).ai(710)).M("Error calling onDisplayLayoutUpdateComplete for %s with: %s", carDisplayId, str);
            return false;
        }
    }

    private final boolean aZ(ing ingVar) {
        inn innVarG = g(ingVar.z);
        if (ingVar != innVarG.n) {
            return false;
        }
        innVarG.n = null;
        rbr.f(innVarG.m);
        return true;
    }

    public static boolean am(Intent intent) {
        return intent != null && intent.getBooleanExtra("assistant_activity", false) && intent.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_PREWARM", false);
    }

    private final ComponentName aw(CarRegionId carRegionId) {
        return ((CarActivityRegionLayoutConfig) g(carRegionId).q.b).b.getComponent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Pair ax(CarRegionId carRegionId) {
        ComponentName componentNameAw = aw(carRegionId);
        if (componentNameAw == null) {
            yfq yfqVarB = this.l.b(carRegionId);
            int size = yfqVarB.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                CarRegionId carRegionId2 = (CarRegionId) yfqVarB.get(i);
                ComponentName componentNameAw2 = aw(carRegionId2);
                i++;
                if (componentNameAw2 != null) {
                    carRegionId = carRegionId2;
                    componentNameAw = componentNameAw2;
                    break;
                }
            }
        }
        return Pair.create(componentNameAw, carRegionId);
    }

    private final CarRegionId ay(Bundle bundle, Intent intent) {
        return bundle == null ? l(intent) : (CarRegionId) new ntn(new qql(bundle).e).i(l(intent));
    }

    private final CarActivityRegionLayoutConfig az(CarRegionId carRegionId) {
        return (CarActivityRegionLayoutConfig) g(carRegionId).q.b;
    }

    @ResultIgnorabilityUnspecified
    private final boolean ba(Intent intent, Bundle bundle, ioc iocVar, int i) {
        ilb.d();
        return bb(aB(intent), intent, bundle, iocVar, i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117 A[Catch: all -> 0x0429, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x0083, B:21:0x008b, B:24:0x00af, B:26:0x00e4, B:28:0x00ef, B:72:0x023b, B:74:0x024e, B:75:0x0256, B:77:0x028d, B:78:0x029e, B:88:0x02d4, B:89:0x02d5, B:139:0x03c1, B:140:0x03ca, B:151:0x0420, B:92:0x02e2, B:94:0x02e8, B:97:0x02f4, B:100:0x02fb, B:102:0x0305, B:104:0x0309, B:106:0x0317, B:108:0x031f, B:109:0x032c, B:111:0x0334, B:123:0x035a, B:125:0x0368, B:127:0x0370, B:114:0x0339, B:116:0x033f, B:118:0x0349, B:121:0x0350, B:128:0x037c, B:130:0x0384, B:131:0x0386, B:133:0x0394, B:135:0x039c, B:136:0x03a7, B:138:0x03af, B:29:0x00f6, B:31:0x0117, B:33:0x011b, B:36:0x0126, B:38:0x0147, B:40:0x0152, B:41:0x0159, B:43:0x016d, B:45:0x0174, B:48:0x017b, B:50:0x01a3, B:52:0x01b5, B:53:0x01c5, B:55:0x01d0, B:56:0x01ea, B:58:0x01f6, B:59:0x0202, B:67:0x0219, B:69:0x022b, B:71:0x0236, B:62:0x020b, B:66:0x0216, B:152:0x0421, B:153:0x0428, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:79:0x029f, B:81:0x02ab, B:83:0x02ae, B:84:0x02cf, B:141:0x03cb, B:143:0x03d5, B:145:0x0414, B:146:0x041b, B:144:0x03f7), top: B:160:0x000b, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017b A[Catch: all -> 0x0429, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x0083, B:21:0x008b, B:24:0x00af, B:26:0x00e4, B:28:0x00ef, B:72:0x023b, B:74:0x024e, B:75:0x0256, B:77:0x028d, B:78:0x029e, B:88:0x02d4, B:89:0x02d5, B:139:0x03c1, B:140:0x03ca, B:151:0x0420, B:92:0x02e2, B:94:0x02e8, B:97:0x02f4, B:100:0x02fb, B:102:0x0305, B:104:0x0309, B:106:0x0317, B:108:0x031f, B:109:0x032c, B:111:0x0334, B:123:0x035a, B:125:0x0368, B:127:0x0370, B:114:0x0339, B:116:0x033f, B:118:0x0349, B:121:0x0350, B:128:0x037c, B:130:0x0384, B:131:0x0386, B:133:0x0394, B:135:0x039c, B:136:0x03a7, B:138:0x03af, B:29:0x00f6, B:31:0x0117, B:33:0x011b, B:36:0x0126, B:38:0x0147, B:40:0x0152, B:41:0x0159, B:43:0x016d, B:45:0x0174, B:48:0x017b, B:50:0x01a3, B:52:0x01b5, B:53:0x01c5, B:55:0x01d0, B:56:0x01ea, B:58:0x01f6, B:59:0x0202, B:67:0x0219, B:69:0x022b, B:71:0x0236, B:62:0x020b, B:66:0x0216, B:152:0x0421, B:153:0x0428, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:79:0x029f, B:81:0x02ab, B:83:0x02ae, B:84:0x02cf, B:141:0x03cb, B:143:0x03d5, B:145:0x0414, B:146:0x041b, B:144:0x03f7), top: B:160:0x000b, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024e A[Catch: all -> 0x0429, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x0083, B:21:0x008b, B:24:0x00af, B:26:0x00e4, B:28:0x00ef, B:72:0x023b, B:74:0x024e, B:75:0x0256, B:77:0x028d, B:78:0x029e, B:88:0x02d4, B:89:0x02d5, B:139:0x03c1, B:140:0x03ca, B:151:0x0420, B:92:0x02e2, B:94:0x02e8, B:97:0x02f4, B:100:0x02fb, B:102:0x0305, B:104:0x0309, B:106:0x0317, B:108:0x031f, B:109:0x032c, B:111:0x0334, B:123:0x035a, B:125:0x0368, B:127:0x0370, B:114:0x0339, B:116:0x033f, B:118:0x0349, B:121:0x0350, B:128:0x037c, B:130:0x0384, B:131:0x0386, B:133:0x0394, B:135:0x039c, B:136:0x03a7, B:138:0x03af, B:29:0x00f6, B:31:0x0117, B:33:0x011b, B:36:0x0126, B:38:0x0147, B:40:0x0152, B:41:0x0159, B:43:0x016d, B:45:0x0174, B:48:0x017b, B:50:0x01a3, B:52:0x01b5, B:53:0x01c5, B:55:0x01d0, B:56:0x01ea, B:58:0x01f6, B:59:0x0202, B:67:0x0219, B:69:0x022b, B:71:0x0236, B:62:0x020b, B:66:0x0216, B:152:0x0421, B:153:0x0428, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:79:0x029f, B:81:0x02ab, B:83:0x02ae, B:84:0x02cf, B:141:0x03cb, B:143:0x03d5, B:145:0x0414, B:146:0x041b, B:144:0x03f7), top: B:160:0x000b, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028d A[Catch: all -> 0x0429, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x0083, B:21:0x008b, B:24:0x00af, B:26:0x00e4, B:28:0x00ef, B:72:0x023b, B:74:0x024e, B:75:0x0256, B:77:0x028d, B:78:0x029e, B:88:0x02d4, B:89:0x02d5, B:139:0x03c1, B:140:0x03ca, B:151:0x0420, B:92:0x02e2, B:94:0x02e8, B:97:0x02f4, B:100:0x02fb, B:102:0x0305, B:104:0x0309, B:106:0x0317, B:108:0x031f, B:109:0x032c, B:111:0x0334, B:123:0x035a, B:125:0x0368, B:127:0x0370, B:114:0x0339, B:116:0x033f, B:118:0x0349, B:121:0x0350, B:128:0x037c, B:130:0x0384, B:131:0x0386, B:133:0x0394, B:135:0x039c, B:136:0x03a7, B:138:0x03af, B:29:0x00f6, B:31:0x0117, B:33:0x011b, B:36:0x0126, B:38:0x0147, B:40:0x0152, B:41:0x0159, B:43:0x016d, B:45:0x0174, B:48:0x017b, B:50:0x01a3, B:52:0x01b5, B:53:0x01c5, B:55:0x01d0, B:56:0x01ea, B:58:0x01f6, B:59:0x0202, B:67:0x0219, B:69:0x022b, B:71:0x0236, B:62:0x020b, B:66:0x0216, B:152:0x0421, B:153:0x0428, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:79:0x029f, B:81:0x02ab, B:83:0x02ae, B:84:0x02cf, B:141:0x03cb, B:143:0x03d5, B:145:0x0414, B:146:0x041b, B:144:0x03f7), top: B:160:0x000b, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d5 A[Catch: all -> 0x0429, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x0083, B:21:0x008b, B:24:0x00af, B:26:0x00e4, B:28:0x00ef, B:72:0x023b, B:74:0x024e, B:75:0x0256, B:77:0x028d, B:78:0x029e, B:88:0x02d4, B:89:0x02d5, B:139:0x03c1, B:140:0x03ca, B:151:0x0420, B:92:0x02e2, B:94:0x02e8, B:97:0x02f4, B:100:0x02fb, B:102:0x0305, B:104:0x0309, B:106:0x0317, B:108:0x031f, B:109:0x032c, B:111:0x0334, B:123:0x035a, B:125:0x0368, B:127:0x0370, B:114:0x0339, B:116:0x033f, B:118:0x0349, B:121:0x0350, B:128:0x037c, B:130:0x0384, B:131:0x0386, B:133:0x0394, B:135:0x039c, B:136:0x03a7, B:138:0x03af, B:29:0x00f6, B:31:0x0117, B:33:0x011b, B:36:0x0126, B:38:0x0147, B:40:0x0152, B:41:0x0159, B:43:0x016d, B:45:0x0174, B:48:0x017b, B:50:0x01a3, B:52:0x01b5, B:53:0x01c5, B:55:0x01d0, B:56:0x01ea, B:58:0x01f6, B:59:0x0202, B:67:0x0219, B:69:0x022b, B:71:0x0236, B:62:0x020b, B:66:0x0216, B:152:0x0421, B:153:0x0428, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:79:0x029f, B:81:0x02ab, B:83:0x02ae, B:84:0x02cf, B:141:0x03cb, B:143:0x03d5, B:145:0x0414, B:146:0x041b, B:144:0x03f7), top: B:160:0x000b, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean bb(java.util.List r18, android.content.Intent r19, android.os.Bundle r20, defpackage.ioc r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iob.bb(java.util.List, android.content.Intent, android.os.Bundle, ioc, int, boolean):boolean");
    }

    private static final void bc(ing ingVar, boolean z) {
        if (z) {
            return;
        }
        boolean z2 = false;
        if (ingVar.p && !ingVar.q) {
            z2 = true;
        }
        jkk jkkVar = ingVar.y;
        ina inaVar = (ina) jkkVar;
        inaVar.R(ingVar.d(), ingVar.w, ingVar.x, true, true, z2, null);
    }

    private static final void bd(inm inmVar, Configuration configuration, int i) {
        Iterator it = inmVar.f.v().iterator();
        while (it.hasNext()) {
            ((ing) it.next()).r(configuration, i);
        }
    }

    private static final void be(inn innVar) {
        inw inwVar = innVar.o;
        if (inwVar != null) {
            ((ype) b.l().ai(756)).y("Posting resumeThenStopRunnable for %s", innVar.a);
            new sss(Looper.getMainLooper()).post(inwVar);
            innVar.o = null;
        }
    }

    @ResultIgnorabilityUnspecified
    private final synchronized void bf(List list, Intent intent, Bundle bundle, int i) {
        bb(list, intent, bundle, null, i, false);
    }

    public final synchronized void A(ing ingVar) {
        ilb.d();
        CarRegionId carRegionId = ingVar.z;
        ((ype) b.l().ai((char) 735)).y("Not releasing the ClientConnectionSemaphore for stop. wasConnecting: %b", Boolean.valueOf(g(carRegionId).j.e(ingVar)));
        bc(ingVar, aZ(ingVar));
        inz inzVar = ingVar.s;
        if (inzVar != null) {
            boolean z = ingVar.p;
            Intent intent = inzVar.c;
            if (z) {
                intent.addFlags(4);
            } else {
                intent.removeFlags(4);
            }
            ingVar.D();
            aJ(carRegionId, intent);
        }
        iod iodVar = this.p;
        if (iodVar != null) {
            iodVar.d(ingVar);
        }
    }

    public final synchronized void B(CarDisplayId carDisplayId, Configuration configuration, int i) {
        if (!this.o) {
            ((ype) ((ype) b.f()).ai(737)).R("onConfigurationChanged(%s, %s, %d) called while not connected, ignoring.", carDisplayId, configuration, Integer.valueOf(i));
            return;
        }
        ilb.d();
        int i2 = i & 519;
        if (i2 != 0) {
            if (carDisplayId != null) {
                bd(f(carDisplayId), configuration, i2);
            } else {
                Iterator it = this.u.values().iterator();
                while (it.hasNext()) {
                    bd((inm) it.next(), configuration, i2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void C(CarDisplayId carDisplayId) {
        ilb.d();
        if (!this.o) {
            ((ype) ((ype) b.f()).ai((char) 739)).y("onFocusGained(%s) called while not connected, ignoring.", carDisplayId);
            return;
        }
        inm inmVarF = f(carDisplayId);
        boolean z = inmVarF.b;
        if (!z) {
            inmVarF.b = true;
        }
        inmVarF.c = true;
        inmVarF.e = false;
        if (inmVarF.d) {
            ing ingVar = null;
            for (ing ingVar2 : f(carDisplayId).f.v()) {
                if (ingVar2.H()) {
                    if (ingVar2.z.equals(f(carDisplayId).k)) {
                        ingVar = ingVar2;
                    } else {
                        ingVar2.t();
                    }
                }
            }
            if (ingVar != null) {
                ingVar.t();
            }
        } else {
            if (this.p != null && CarDisplayId.a.equals(carDisplayId)) {
                this.p.a(true);
            }
            ing ingVar3 = null;
            for (ing ingVar4 : f(carDisplayId).a) {
                if (ingVar4 != null) {
                    if (ingVar4.z.equals(f(carDisplayId).k)) {
                        ingVar3 = ingVar4;
                    } else {
                        aR(ingVar4);
                    }
                }
            }
            if (ingVar3 != null) {
                aR(ingVar3);
            }
        }
        yno it = aA(carDisplayId).iterator();
        while (it.hasNext()) {
            CarRegionId carRegionId = (CarRegionId) it.next();
            inn innVarG = g(carRegionId);
            if (innVarG.c != null) {
                if (innVarG.b == null) {
                    ((ype) ((ype) b.f()).ai(792)).y("Starting pending intent %s", innVarG.c);
                    Intent intent = innVarG.c;
                    CarRegionId carRegionId2 = innVarG.a;
                    if (!at(intent, carRegionId2) && innVarG.c.getComponent() != null) {
                        aD("Initial activity failed to start", carRegionId2);
                    }
                }
                innVarG.c = null;
            }
            inz inzVar = innVarG.b;
            if (inzVar != null) {
                ((ype) ((ype) b.f()).ai((char) 791)).y("Starting pending client %s", inzVar);
                int i = inzVar.g;
                ba(inzVar.c, inzVar.d, inzVar.f, i);
                innVarG.b = null;
            }
            List<inz> list = innVarG.h;
            for (inz inzVar2 : list) {
                ((ype) b.l().ai((char) 793)).y("Starting pending pre-warm for %s", inzVar2);
                aS(inzVar2.c, inzVar2.d, inzVar2.f, inzVar2.g);
            }
            list.clear();
            if (!z) {
                aG(carRegionId);
            }
        }
        List<Pair> list2 = f(carDisplayId).g;
        if (!list2.isEmpty()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (Pair pair : list2) {
                if (((Long) pair.first).longValue() + 2500 >= jElapsedRealtime || ((ima) this.G).M != null) {
                    aF((xke) pair.second, carDisplayId);
                } else {
                    ((ype) b.l().ai(668)).w("Dropping expired key %d", ((xke) pair.second).c);
                }
            }
            list2.clear();
        }
        aH();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void D(CarDisplayId carDisplayId, boolean z) {
        ilb.d();
        yph yphVar = b;
        ((ype) yphVar.l().ai(740)).N("onFocusLost(%s, %b) called", carDisplayId, z);
        if (!this.o) {
            ((ype) yphVar.l().ai(742)).N("onFocusLost(%s, %b) called while not connected, ignoring.", carDisplayId, z);
            return;
        }
        Iterator it = f(carDisplayId).f.v().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ing ingVar = (ing) it.next();
            if (ingVar.H() && ingVar.n < 3) {
                z = false;
                break;
            }
        }
        inm inmVarF = f(carDisplayId);
        if (z && !inmVarF.c) {
            ((ype) ((ype) yphVar.h()).ai(741)).N("onFocusLost(%s, %b) called when video focus is already lost, ignoring.", carDisplayId, true);
            return;
        }
        inmVarF.c = false;
        inmVarF.k = j(carDisplayId).p();
        inmVarF.d = z;
        if (!z) {
            if (this.p != null && CarDisplayId.b(carDisplayId)) {
                this.p.a(false);
                this.y = false;
            }
            inm inmVarF2 = f(carDisplayId);
            rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.ACTIVITY_MANAGER, yzy.Cq);
            for (ing ingVar2 : inmVarF2.f.v()) {
                CarRegionId carRegionId = ingVar2.z;
                if (ingVar2.H()) {
                    boolean z2 = ingVar2.m;
                    ingVar2.m = false;
                    if (z2 || !inmVarF2.m.isEmpty()) {
                        ingVar2.q = true;
                        ingVar2.z();
                        Intent intent = ((CarActivityRegionLayoutConfig) g(carRegionId).q.b).a;
                        if (intent.getComponent() == null) {
                            yfq yfqVarB = this.l.b(carRegionId);
                            int size = yfqVarB.size();
                            for (int i = 0; i < size; i++) {
                                Intent intent2 = ((CarActivityRegionLayoutConfig) g((CarRegionId) yfqVarB.get(i)).q.b).a;
                                if (intent2.getComponent() != null) {
                                    intent = intent2;
                                }
                            }
                        }
                        ioc iocVar = (ioc) this.n.get(intent.getComponent());
                        if (iocVar == null) {
                            at(intent, carRegionId);
                        } else {
                            inmVarF2.a.add(iocVar.c());
                        }
                    } else {
                        ingVar2.z();
                        inmVarF2.a.add(ingVar2);
                    }
                    rrbVarH.d(ingVar2.d);
                }
            }
            inmVarF2.m.clear();
            rpz.a(this.d).c(rrbVarH.l());
        }
        yno it2 = aA(carDisplayId).iterator();
        while (it2.hasNext()) {
            g((CarRegionId) it2.next()).j.a(true);
        }
        aH();
    }

    public final synchronized void E(CarDisplayId carDisplayId, xke xkeVar, int i, int i2, Duration duration) {
        yph yphVar = b;
        ((ype) ((ype) yphVar.f()).ai(743)).S("Received keycode %s on display %s, flags %s, repeatCount %s", xkeVar == null ? null : String.format(Locale.US, "{keycode:%d, down:%b, metastate:%d, longpress:%b}", Integer.valueOf(xkeVar.c), Boolean.valueOf(xkeVar.d), Integer.valueOf(xkeVar.e), Boolean.valueOf(xkeVar.f)), carDisplayId, Integer.valueOf(i), Integer.valueOf(i2));
        ilb.d();
        if (this.o) {
            int i3 = xkeVar.c;
            if (i3 != 92 && i3 != 93 && i3 != 122 && i3 != 123) {
                inm inmVarF = f(carDisplayId);
                jkk jkkVarJ = j(carDisplayId);
                int i4 = xkeVar.c;
                if (i4 == 84) {
                    if (!inmVarF.j || !inmVarF.c) {
                        rpz.a(this.d).c(rrc.h(yxy.CAR_SERVICE, yzz.ACTIVITY_MANAGER, yzy.Cr).l());
                        ((ype) ((ype) yphVar.f()).ai((char) 750)).u("No activity shown on primary region, queuing search request");
                        inmVarF.h.add(new inx(SystemClock.elapsedRealtime(), xkeVar, i, i2));
                        jkkVarJ.U();
                        return;
                    }
                    i4 = 84;
                }
                if (i4 != 65537 && i4 != 209 && i4 != 84 && i4 != 65538 && i4 != 65540 && i4 != 3 && i4 != 187 && (!acrz.s() || xkeVar.c != 65539)) {
                    if (xkeVar.c >= 65535) {
                        ((ype) yphVar.l().ai(746)).w("Dropping untranslated key: %d", xkeVar.c);
                        return;
                    }
                    KeyEvent keyEventH = ikb.h(xkeVar, i, i2, duration);
                    ((ype) yphVar.l().ai(744)).w("Got android key event %d", keyEventH.getKeyCode());
                    int keyCode = keyEventH.getKeyCode();
                    if (keyCode != 222) {
                        switch (keyCode) {
                            default:
                                switch (keyCode) {
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                        break;
                                    default:
                                        int keyCode2 = keyEventH.getKeyCode();
                                        if (keyCode2 != 5 && keyCode2 != 6 && keyCode2 != 91) {
                                            int i5 = carDisplayId.b;
                                            jkkVarJ.ap(keyEventH);
                                            return;
                                        }
                                        ((ype) yphVar.l().ai(745)).w("Got phone key event %d", keyEventH.getKeyCode());
                                        iki ikiVar = ((ima) this.H).u.B;
                                        if (ikiVar != null) {
                                            aat aatVar = ikiVar.b;
                                            synchronized (aatVar) {
                                                for (int i6 = 0; i6 < aatVar.d; i6++) {
                                                    try {
                                                        ikh ikhVar = (ikh) aatVar.g(i6);
                                                        if (ikhVar.b > 0) {
                                                            ikhVar.a.e(keyEventH);
                                                        }
                                                    } catch (RemoteException e) {
                                                        ((ype) ((ype) ((ype) iki.a.h()).p(e)).ai(172)).u("Error calling onInput()");
                                                    }
                                                }
                                            }
                                            return;
                                        }
                                        break;
                                }
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                                U(keyEventH);
                                return;
                        }
                    }
                    U(keyEventH);
                    return;
                }
                if (!this.h.bs()) {
                    ((ype) ((ype) yphVar.f()).ai((char) 749)).u("Ignoring app-keys until car connected");
                    return;
                }
                yfy yfyVarQ = yfy.q(84, true, Integer.valueOf(Action.TYPE_APP_ICON), true, Integer.valueOf(Action.TYPE_PAN), Boolean.valueOf(acny.k()), Integer.valueOf(Action.TYPE_BACK), Boolean.valueOf(acrz.s()), 65537, true, 209, true, 187, true);
                if (yfyVarQ.containsKey(Integer.valueOf(xkeVar.c)) && ((Boolean) yfyVarQ.get(Integer.valueOf(xkeVar.c))).booleanValue()) {
                    KeyEvent keyEventH2 = ikb.h(xkeVar, i, i2, duration);
                    ((ype) ((ype) yphVar.f()).ai((char) 670)).y("Forwarding %s", keyEventH2);
                    Intent intent = new Intent("android.intent.action.projected.KEY_EVENT");
                    intent.setPackage(this.B);
                    intent.putExtra("android.intent.extra.KEY_EVENT", keyEventH2);
                    intent.putExtra("car_display_id", spu.k(carDisplayId));
                    intent.addFlags(268435456);
                    this.d.sendBroadcast(intent);
                    return;
                }
                if (!xkeVar.d) {
                    if (!((ina) jkkVarJ).C) {
                        ((ype) yphVar.l().ai(748)).w("Window manager not compositing, queuing keycode:%d", xkeVar.c);
                        inmVarF.g.add(Pair.create(Long.valueOf(SystemClock.elapsedRealtime()), xkeVar));
                        jkkVarJ.U();
                        return;
                    } else {
                        if (inmVarF.b) {
                            aF(xkeVar, carDisplayId);
                            return;
                        }
                        ((ype) yphVar.l().ai(747)).w("onKeyEvent called while not started. queuing keycode:%d", xkeVar.c);
                        inmVarF.g.add(Pair.create(Long.valueOf(SystemClock.elapsedRealtime()), xkeVar));
                        jkkVarJ.U();
                        return;
                    }
                }
            }
            ((ype) yphVar.l().ai(751)).w("Dropping unexpected keycode: %d", xkeVar.c);
        }
    }

    public final synchronized void F(ing ingVar) {
        if (ingVar instanceof ioj) {
            return;
        }
        aO(ingVar);
    }

    public final synchronized void G(CarDisplayId carDisplayId, MotionEvent motionEvent) {
        ilb.d();
        if (this.o) {
            j(carDisplayId).H(motionEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0217 A[Catch: all -> 0x02e4, TryCatch #0 {, blocks: (B:4:0x0005, B:7:0x000e, B:9:0x0026, B:11:0x0034, B:13:0x003b, B:15:0x0041, B:17:0x0053, B:21:0x007e, B:18:0x0063, B:20:0x006f, B:22:0x0081, B:24:0x008c, B:27:0x0091, B:33:0x009c, B:35:0x00a1, B:37:0x00b8, B:108:0x02da, B:38:0x00c1, B:40:0x00d4, B:42:0x00d9, B:44:0x00ea, B:46:0x00f7, B:47:0x00ff, B:48:0x0105, B:49:0x010a, B:51:0x0113, B:52:0x0131, B:53:0x0136, B:55:0x013d, B:56:0x014c, B:58:0x015d, B:59:0x0180, B:61:0x018c, B:63:0x01a2, B:66:0x01a8, B:67:0x01aa, B:68:0x01b2, B:71:0x01c1, B:73:0x01db, B:74:0x01f1, B:79:0x0203, B:83:0x0217, B:78:0x0200, B:84:0x0222, B:86:0x0240, B:87:0x026d, B:89:0x027f, B:90:0x0287, B:91:0x0292, B:105:0x02c6, B:107:0x02ce, B:113:0x02e1, B:92:0x0293, B:93:0x029d, B:95:0x02a1, B:96:0x02ab, B:98:0x02b1, B:101:0x02bb, B:103:0x02c1, B:104:0x02c5), top: B:119:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void H(com.google.android.gms.car.display.CarDisplayId r23, defpackage.iye r24) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iob.H(com.google.android.gms.car.display.CarDisplayId, iye):void");
    }

    public final synchronized void I(CarDisplayId carDisplayId, MotionEvent motionEvent) {
        ilb.d();
        if (this.o) {
            j(carDisplayId).I(motionEvent);
        }
    }

    public final synchronized void J(CarRegionId carRegionId, Runnable runnable) {
        g(carRegionId).b(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void K(CarRegionId carRegionId) {
        if (this.o) {
            inn innVarG = g(carRegionId);
            if (!innVarG.g) {
                innVarG.g = true;
                yfq yfqVarA = az(carRegionId).a();
                for (int i = 0; i < yfqVarA.size(); i++) {
                    ComponentName componentName = (ComponentName) yfqVarA.get(i);
                    Intent component = new Intent().setComponent(componentName);
                    ((ype) b.l().ai((char) 757)).y("Pre-warming %s", componentName);
                    qql qqlVar = new qql();
                    qqlVar.e = carRegionId;
                    aS(component, qqlVar.a(), null, a(component, carRegionId));
                }
            }
        }
    }

    public final synchronized void L(Intent intent) {
        ilb.d();
        ((ype) b.l().ai((char) 760)).y("Processing %s and starting it", intent);
        if (this.U == null) {
            this.V.add(intent);
        } else {
            if (aW(intent)) {
                return;
            }
            this.V.add(intent);
        }
    }

    public final synchronized void M(qus qusVar) {
        inz inzVar;
        ilb.d();
        this.P.add(qusVar);
        for (Map.Entry entry : this.t.entrySet()) {
            CarRegionId carRegionId = (CarRegionId) entry.getKey();
            ing ingVar = ((inn) entry.getValue()).e;
            if (ingVar != null && (inzVar = ingVar.s) != null && ingVar.E()) {
                ActivityLaunchInfo activityLaunchInfo = new ActivityLaunchInfo(inzVar.c, carRegionId);
                try {
                    qusVar.f(activityLaunchInfo);
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) b.h()).p(e)).ai((char) 700)).y("Error calling onActivityStarted with: %s", activityLaunchInfo);
                }
            }
        }
    }

    public final synchronized void N(quv quvVar) {
        ing ingVar;
        inz inzVar;
        ilb.d();
        if (!this.o) {
            ((ype) ((ype) b.f()).ai((char) 761)).u("registerCarActivityStartListener() called while not connected, ignoring.");
            return;
        }
        this.r.add(quvVar);
        for (Map.Entry entry : this.t.entrySet()) {
            if (this.l.d((CarRegionId) entry.getKey()) && (ingVar = ((inn) entry.getValue()).e) != null && (inzVar = ingVar.s) != null && ingVar.E()) {
                Intent intent = inzVar.c;
                aX(quvVar, new inj(intent, 2), intent);
            }
            CarRegionId carRegionId = (CarRegionId) entry.getKey();
            ing ingVar2 = ((inn) entry.getValue()).e;
            if (ingVar2 != null) {
                Intent intent2 = ingVar2.t;
                if (intent2 == null) {
                    ((ype) ((ype) b.h()).ai(694)).M("Active activity manager does not have an intent. Unable to send last activity started for %s, activityManager: %s", carRegionId, ingVar2);
                } else if (ingVar2.I()) {
                    ActivityLaunchInfo activityLaunchInfo = new ActivityLaunchInfo(intent2, carRegionId);
                    ((ype) b.l().ai((char) 692)).y("Send last activity started:%s ", activityLaunchInfo);
                    aX(quvVar, new inj(activityLaunchInfo, 1), activityLaunchInfo);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void O(quy quyVar) {
        ilb.d();
        woy.aa(this.U == null, "There can only one ICarActivityStartProcessor registered at a time");
        ((ype) ((ype) b.f()).ai(762)).M("Registering ICarActivityStartProcessor: %s, previously was %s", quyVar, this.U);
        this.U = quyVar;
        Queue queue = this.V;
        yfq yfqVarO = yfq.o(queue);
        queue.clear();
        int size = yfqVarO.size();
        for (int i = 0; i < size; i++) {
            Intent intent = (Intent) yfqVarO.get(i);
            if (!aW(intent)) {
                queue.add(intent);
            }
        }
    }

    public final synchronized void P(rpg rpgVar) {
        ilb.d();
        for (Map.Entry entry : this.u.entrySet()) {
            if (((inm) entry.getValue()).l == null) {
                ((ype) b.l().ai((char) 763)).y("Registering carDisplayLayoutUpdateComplete listener before display %s has a layout", entry.getKey());
                return;
            } else {
                if (!aY(rpgVar, (CarDisplayId) entry.getKey(), ((inm) entry.getValue()).l.toString())) {
                    return;
                }
            }
        }
        this.O.add(rpgVar);
    }

    public final synchronized void Q(CarRegionId carRegionId) {
        g(carRegionId).c();
    }

    public final synchronized void S(CarRegionId carRegionId) {
        if (!this.o) {
            ((ype) ((ype) b.f()).ai((char) 766)).u("Unable to reset client connection canceled after teardown");
            return;
        }
        boolean z = g(carRegionId).p;
        g(carRegionId).p = false;
        ((ype) b.l().ai(765)).N("Resetting canceled launch for %s from %s", carRegionId, z);
    }

    public final synchronized void T(CarRegionId carRegionId) {
        CarDisplayId carDisplayId = carRegionId.h;
        Set set = f(carDisplayId).m;
        set.remove(carRegionId);
        if (set.isEmpty()) {
            ((ype) b.l().ai((char) 767)).y("%s no longer relinquishing", carDisplayId);
        }
    }

    public final void U(KeyEvent keyEvent) {
        ((ype) ((ype) b.f()).ai((char) 772)).y("Forwarding media key %s", keyEvent);
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
        intent.setPackage(this.C.getPackageName());
        intent.addFlags(268435456);
        this.d.sendBroadcast(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void V(CarActivityLayoutConfig carActivityLayoutConfig) {
        ilb.d();
        ((ype) b.l().ai((char) 773)).y("Setting CarActivityLayout to: %s", carActivityLayoutConfig);
        eqy.e(carActivityLayoutConfig);
        woy.aa(this.t.isEmpty(), "We only support one call to setCarActivityLayoutConfig");
        yfq yfqVarA = carActivityLayoutConfig.a();
        int size = yfqVarA.size();
        for (int i = 0; i < size; i++) {
            CarDisplayLayoutConfig carDisplayLayoutConfig = (CarDisplayLayoutConfig) yfqVarA.get(i);
            yfq yfqVarA2 = carDisplayLayoutConfig.a();
            int size2 = yfqVarA2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (CarActivityRegionLayoutConfig) yfqVarA2.get(i2);
                CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
                woy.ad(!r0.containsKey(carRegionId), "Trying to set the state for %s which was already set", carRegionId);
                aC(carRegionId, carActivityRegionLayoutConfig);
            }
            f(carDisplayLayoutConfig.a).l = UUID.fromString(carDisplayLayoutConfig.b);
            aL(carDisplayLayoutConfig);
        }
    }

    public final synchronized void W(CarRegionId carRegionId) {
        if (this.o) {
            g(carRegionId).j.b();
        }
    }

    public final synchronized void X(ComponentName componentName, CarRegionId carRegionId) {
        g(carRegionId).f = componentName;
    }

    public final synchronized void Y(Bundle bundle) {
        ilb.d();
        if (bundle == null) {
            this.Y = null;
            return;
        }
        Bundle bundleDeepCopy = bundle.deepCopy();
        if (acny.a.gu().e()) {
            bundleDeepCopy.putBoolean("CANCEL_PENDING_LIFECYCLE_EVENTS_FOR_FINISH_ENABLED", true);
        }
        this.Y = bundleDeepCopy;
    }

    public final synchronized void Z(ing ingVar) {
        g(ingVar.z).d(ingVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(android.content.Intent r7, com.google.android.gms.car.display.CarRegionId r8) {
        /*
            r6 = this;
            android.content.ComponentName r0 = r7.getComponent()
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L9
            goto L1a
        L9:
            java.lang.String r3 = "assistant_activity"
            boolean r3 = r7.getBooleanExtra(r3, r1)
            if (r3 == 0) goto L1a
            boolean r6 = r6.aV(r7)
            if (r6 == 0) goto L18
            return r2
        L18:
            r6 = 4
            return r6
        L1a:
            r6 = 3
            if (r7 == 0) goto L51
            android.content.Intent r3 = defpackage.iob.a
            java.lang.String r4 = r3.getAction()
            java.lang.String r5 = r7.getAction()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L51
            java.lang.String r4 = r3.getPackage()
            java.lang.String r5 = r7.getPackage()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L51
            java.util.Set r4 = r7.getCategories()
            if (r4 == 0) goto L51
            java.util.Set r7 = r7.getCategories()
            java.util.Set r3 = r3.getCategories()
            boolean r7 = r7.containsAll(r3)
            if (r7 == 0) goto L51
            r7 = r6
            goto L6d
        L51:
            com.google.android.gms.car.display.CarRegionId r7 = com.google.android.gms.car.display.CarRegionId.d
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L5b
        L59:
            r7 = r2
            goto L6d
        L5b:
            java.util.Map r7 = defpackage.iob.c
            boolean r8 = r7.containsKey(r0)
            if (r8 == 0) goto L59
            java.lang.Object r7 = r7.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L6d:
            if (r7 == r2) goto L75
            if (r7 != r6) goto L72
            goto L76
        L72:
            r6 = r7
            r7 = r1
            goto L77
        L75:
            r6 = r7
        L76:
            r7 = r2
        L77:
            if (r7 == 0) goto L7a
            return r6
        L7a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r0
            r8[r2] = r6
            java.lang.String r6 = "Window starting in a layer we don't allow: %s trying to use layer %s"
            java.lang.String r6 = defpackage.wub.M(r6, r8)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iob.a(android.content.Intent, com.google.android.gms.car.display.CarRegionId):int");
    }

    @Override // defpackage.ixl
    public final synchronized void aI(int i, boolean z) {
        if (z) {
            char c2 = (char) i;
            Iterator it = this.u.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((inm) it.next()).f.v().iterator();
                while (it2.hasNext()) {
                    ((ing) it2.next()).p(c2);
                }
            }
        }
    }

    public final synchronized void aa(List list, Intent intent, Bundle bundle) {
        bf(list, intent, bundle, a(intent, ay(bundle, intent)));
    }

    public final synchronized void ab() {
        ilb.d();
        Iterator it = this.t.entrySet().iterator();
        while (it.hasNext()) {
            ac((CarRegionId) ((Map.Entry) it.next()).getKey());
        }
        rps rpsVar = this.z;
        rpq rpqVar = new rpq() { // from class: ini
            @Override // defpackage.rpq
            public final void a(boolean z) {
                this.a.aq();
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException();
        }
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.d(3, "CAR.PROJECTION.PLSCM", null, "doOnProjectionLifetimeDelayedStart", new Object[0]);
        }
        if (rpsVar.h(new rpp(rpsVar, new rpn(1), rpqVar))) {
            return;
        }
        ((ype) ((ype) b.f()).ai((char) 782)).u("Unable to connect to lifetime service, no pre-warming");
    }

    public final synchronized void ac(CarRegionId carRegionId) {
        ilb.d();
        if (!this.o) {
            ((ype) ((ype) b.f()).ai((char) 785)).y("startInitialIntentForRegion(%s) called while not connected, ignoring.", carRegionId);
            return;
        }
        Intent intent = ((CarActivityRegionLayoutConfig) g(carRegionId).q.b).a;
        if (!f(carRegionId.h).b) {
            g(carRegionId).c = intent;
        } else {
            if (at(intent, carRegionId) || intent.getComponent() == null) {
                return;
            }
            aD("Initial activity failed to start", carRegionId);
        }
    }

    public final synchronized void ad(rml rmlVar, EditorInfo editorInfo, ing ingVar) {
        yph yphVar = b;
        ((ype) yphVar.l().ai(788)).D("startInput/editorInfo.imeOptions=%d, region=%s", editorInfo.imeOptions, ingVar.z);
        ilb.d();
        if (!ingVar.H()) {
            ((ype) ((ype) yphVar.h()).ai((char) 790)).u("Can't start input on an unstarted activity");
            return;
        }
        iod iodVar = this.p;
        if (iodVar == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 789)).u("No ImeManager; can't start input");
        } else {
            iodVar.c(rmlVar, editorInfo, ingVar);
            this.X = new ins(rmlVar, editorInfo, ingVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void ae(CarRegionId carRegionId) {
        ilb.d();
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 796)).y("stopCarActivityManager called for %s", carRegionId);
        if (carRegionId.equals(CarRegionId.c) && !aU()) {
            carRegionId = CarRegionId.b;
        }
        if (!this.t.containsKey(carRegionId)) {
            ((ype) ((ype) yphVar.h()).ai((char) 797)).y("Attempt to stop region %s which doesn't exist", carRegionId);
            return;
        }
        yfq yfqVarB = this.l.b(carRegionId);
        int size = yfqVarB.size();
        for (int i = 0; i < size; i++) {
            aT((CarRegionId) yfqVarB.get(i));
        }
        aT(carRegionId);
    }

    public final synchronized void af() {
        ilb.d();
        this.o = false;
        Map map = this.u;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            yig yigVar = ((inm) it.next()).f;
            ArrayList arrayList = new ArrayList(yigVar.v());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ing) arrayList.get(i)).l();
            }
            yigVar.q();
        }
        this.Q.removeCallbacksAndMessages(null);
        iod iodVar = this.p;
        if (iodVar != null) {
            iodVar.b();
        }
        Map map2 = this.t;
        Iterator it2 = map2.values().iterator();
        while (it2.hasNext()) {
            ((inn) it2.next()).e();
        }
        map.clear();
        map2.clear();
    }

    public final synchronized void ag(qus qusVar) {
        ilb.d();
        this.P.remove(qusVar);
    }

    public final synchronized void ah() {
        ilb.d();
        this.U = null;
    }

    public final synchronized void ai(rpg rpgVar) {
        ilb.d();
        this.O.remove(rpgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void aj(CarActivityLayoutConfig carActivityLayoutConfig, boolean z) {
        ing ingVar;
        int i;
        yph yphVar;
        int i2;
        boolean z2;
        ing ingVarE;
        int i3;
        ilb.d();
        if (!this.o) {
            ((ype) ((ype) b.f()).ai((char) 803)).y("updateCarActivityLayoutConfig(%s) called while not connected, ignoring.", carActivityLayoutConfig);
            return;
        }
        yph yphVar2 = b;
        ((ype) yphVar2.l().ai((char) 802)).y("Updating carActivityLayoutConfig with %s", carActivityLayoutConfig);
        yfq yfqVarA = carActivityLayoutConfig.a();
        int size = yfqVarA.size();
        int i4 = 0;
        while (i4 < size) {
            CarDisplayLayoutConfig carDisplayLayoutConfig = (CarDisplayLayoutConfig) yfqVarA.get(i4);
            ygp ygpVar = new ygp();
            yfq yfqVarA2 = carDisplayLayoutConfig.a();
            int size2 = yfqVarA2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (CarActivityRegionLayoutConfig) yfqVarA2.get(i5);
                CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
                if (this.t.containsKey(carRegionId)) {
                    Intent intent = az(carRegionId).b;
                    if (intent.getComponent() != null && this.l.a(carRegionId) == null) {
                        intent.getComponent();
                        Intent intent2 = carActivityRegionLayoutConfig.b;
                        intent2.getComponent();
                        woy.O(Objects.equals(intent.getComponent(), intent2.getComponent()), "Changing the fallback intent is not supported");
                    }
                }
                ygpVar.c(carRegionId);
            }
            yno it = yrm.p(aA(carDisplayLayoutConfig.a), ygpVar.g()).f().iterator();
            while (true) {
                i3 = i4 + 1;
                if (it.hasNext()) {
                    CarRegionId carRegionId2 = (CarRegionId) it.next();
                    ((ype) yphVar2.l().ai((char) 764)).y("Removing region: %s", carRegionId2);
                    inn innVarG = g(carRegionId2);
                    Iterator it2 = new yca(f(carRegionId2.h).f).u().iterator();
                    while (it2.hasNext()) {
                        ing ingVar2 = (ing) ((Map.Entry) it2.next()).getValue();
                        if (ingVar2.z.equals(carRegionId2)) {
                            ingVar2.l();
                            R(ingVar2);
                        }
                    }
                    innVarG.e();
                    this.t.remove(carRegionId2);
                    aH();
                }
            }
            i4 = i3;
        }
        yfq yfqVarA3 = carActivityLayoutConfig.a();
        int size3 = yfqVarA3.size();
        int i6 = 0;
        while (i6 < size3) {
            CarDisplayLayoutConfig carDisplayLayoutConfig2 = (CarDisplayLayoutConfig) yfqVarA3.get(i6);
            yw ywVar = new yw();
            UUID uuidFromString = UUID.fromString(carDisplayLayoutConfig2.b);
            CarDisplayId carDisplayId = carDisplayLayoutConfig2.a;
            inm inmVarF = f(carDisplayId);
            boolean zEquals = uuidFromString.equals(inmVarF.l);
            yfq yfqVarA4 = carDisplayLayoutConfig2.a();
            int size4 = yfqVarA4.size();
            int i7 = 0;
            while (i7 < size4) {
                CarActivityRegionLayoutConfig carActivityRegionLayoutConfig2 = (CarActivityRegionLayoutConfig) yfqVarA4.get(i7);
                CarRegionId carRegionId3 = carActivityRegionLayoutConfig2.c;
                yfq yfqVar = yfqVarA3;
                if (this.t.containsKey(carRegionId3)) {
                    i = size3;
                } else {
                    i = size3;
                    ((ype) yphVar2.l().ai((char) 657)).y("Adding region %s due to layout update.", carRegionId3);
                    aC(carRegionId3, carActivityRegionLayoutConfig2);
                    Iterator it3 = this.q.iterator();
                    while (it3.hasNext()) {
                        ((ima) ((izj) it3.next()).a).n().ac(carRegionId3);
                    }
                }
                inn innVarG2 = g(carRegionId3);
                if (zEquals && carActivityRegionLayoutConfig2.equals(innVarG2.q.b)) {
                    ((ype) ((ype) yphVar2.f()).ai((char) 804)).y("No changes to CarActivityRegionLayoutConfig, skipping update for %s", carRegionId3);
                    yphVar = yphVar2;
                    i2 = i6;
                    z2 = zEquals;
                } else {
                    inn innVarG3 = g(carRegionId3);
                    yphVar = yphVar2;
                    ype ypeVar = (ype) ((ype) yphVar2.f()).ai(805);
                    fbe fbeVar = innVarG3.q;
                    i2 = i6;
                    z2 = zEquals;
                    ypeVar.R("Updating CarActivityRegionLayoutConfig for %s from %s to %s", carRegionId3, fbeVar.b, carActivityRegionLayoutConfig2);
                    fbeVar.b = carActivityRegionLayoutConfig2;
                    CarActivityLayoutParams carActivityLayoutParams = carActivityRegionLayoutConfig2.d;
                    innVarG3.i = carActivityLayoutParams.f;
                    ywVar.put(carRegionId3, carActivityLayoutParams);
                    if (z && ((ingVarE = e(carRegionId3)) == null || !ingVarE.H())) {
                        Intent intent3 = carActivityRegionLayoutConfig2.a;
                        if (intent3.getComponent() != null) {
                            ((ype) yphVar.l().ai(786)).M("Due to resize, starting %s for %s", intent3, carRegionId3);
                            ac(carRegionId3);
                        }
                    }
                }
                i7++;
                yfqVarA3 = yfqVar;
                size3 = i;
                yphVar2 = yphVar;
                i6 = i2;
                zEquals = z2;
            }
            yfq yfqVar2 = yfqVarA3;
            yph yphVar3 = yphVar2;
            int i8 = size3;
            int i9 = i6;
            yfq yfqVarA5 = carDisplayLayoutConfig2.a();
            int size5 = yfqVarA5.size();
            for (int i10 = 0; i10 < size5; i10++) {
                CarRegionId carRegionId4 = ((CarActivityRegionLayoutConfig) yfqVarA5.get(i10)).c;
                ing ingVar3 = g(carRegionId4).e;
                CarRegionGroup carRegionGroupA = this.l.a(carRegionId4);
                if (carRegionGroupA != null) {
                    CarRegionId carRegionId5 = carRegionGroupA.c;
                    if (!carRegionId5.equals(carRegionId4) && (ingVar = g(carRegionId5).e) != null && ingVar.H() && ingVar3 != null && ingVar3.H()) {
                        ((ype) yphVar3.l().ai(794)).M("Resize added region to group with primary activity. Stopping activity: %s, Primary activity: %s", ingVar3, ingVar);
                        ingVar3.y(null);
                    }
                }
            }
            for (ing ingVar4 : f(carDisplayId).f.v()) {
                CarActivityLayoutParams carActivityLayoutParams2 = (CarActivityLayoutParams) ywVar.get(ingVar4.z);
                if (carActivityLayoutParams2 != null) {
                    ingVar4.A(carActivityLayoutParams2, uuidFromString);
                }
            }
            inmVarF.l = uuidFromString;
            Iterator it4 = ywVar.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                CarRegionId carRegionId6 = (CarRegionId) entry.getKey();
                inr inrVar = g(carRegionId6).j;
                CarActivityLayoutParams carActivityLayoutParams3 = (CarActivityLayoutParams) entry.getValue();
                synchronized (inrVar.f) {
                    inq inqVar = (inq) inrVar.a.get(carRegionId6);
                    if (inqVar != null) {
                        inz inzVar = inqVar.b;
                        int i11 = carActivityLayoutParams3.c;
                        int i12 = carActivityLayoutParams3.d;
                        Rect rect = new Rect(i11, i12, carActivityLayoutParams3.a + i11, carActivityLayoutParams3.b + i12);
                        iny inyVar = new iny(inzVar);
                        inyVar.c(uuidFromString);
                        inyVar.f = rect;
                        inyVar.h(carActivityLayoutParams3.f);
                        inyVar.g(carActivityLayoutParams3.j);
                        inyVar.f(carActivityLayoutParams3.k);
                        inyVar.j(carActivityLayoutParams3.e);
                        inqVar.b = inyVar.a();
                    }
                }
            }
            aL(carDisplayLayoutConfig2);
            i6 = i9 + 1;
            yfqVarA3 = yfqVar2;
            size3 = i8;
            yphVar2 = yphVar3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void ak(CarRegionId carRegionId, Rect rect) {
        ilb.d();
        if (!this.o) {
            ((ype) ((ype) b.f()).ai(806)).M("updateInsets(%s, %s) called while not connected, ignoring.", carRegionId, rect);
            return;
        }
        woy.O(this.t.containsKey(carRegionId), "Cannot update region %s which does not exist");
        inm inmVarF = f(carRegionId.h);
        yfl yflVar = new yfl(4);
        for (ing ingVar : inmVarF.f.v()) {
            if (ingVar.z.equals(carRegionId)) {
                yflVar.i(ingVar);
            }
        }
        yfq yfqVarG = yflVar.g();
        int i = ((yls) yfqVarG).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ing) yfqVarG.get(i2)).B(rect);
        }
        g(carRegionId).i = rect;
    }

    public final synchronized boolean al(ing ingVar) {
        yig yigVar = f(ingVar.z.h).f;
        ComponentName componentName = ingVar.d;
        if (yigVar.y(componentName, ingVar)) {
            return false;
        }
        ((ype) b.l().ai((char) 656)).y("Client not found in active client list, starting new client for %s", componentName.toShortString());
        yigVar.t(componentName, ingVar);
        return true;
    }

    public final synchronized boolean an(int i) {
        for (ing ingVar : f(CarDisplayId.a).f.v()) {
            if (ingVar.k == i && ingVar.H()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean ao(int i) {
        if (!this.o) {
            ((ype) ((ype) b.f()).ai((char) 691)).w("isNewestApp(%d) called while not connected, returning false.", i);
            return false;
        }
        for (ing ingVar : f(CarDisplayId.a).f.v()) {
            if (ingVar.k == i && ingVar.d.equals(g(ingVar.z).f)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean ap(CarRegionId carRegionId) {
        if (this.o) {
            return g(carRegionId).p;
        }
        ((ype) ((ype) b.f()).ai((char) 807)).u("Connection canceled as we are tearing down");
        return true;
    }

    public final synchronized void aq() {
        ilb.d();
        this.Z = true;
        Iterator it = this.t.keySet().iterator();
        while (it.hasNext()) {
            aG((CarRegionId) it.next());
        }
    }

    @ResultIgnorabilityUnspecified
    public final synchronized void ar(CarRegionId carRegionId, ing ingVar) {
        inn innVarG = g(carRegionId);
        ing ingVar2 = innVarG.e;
        innVarG.e = ingVar;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized void as(Intent intent, Bundle bundle, int i) {
        ilb.d();
        ba(intent, bundle, null, i);
    }

    @ResultIgnorabilityUnspecified
    public final synchronized boolean at(Intent intent, CarRegionId carRegionId) {
        Bundle bundleA;
        qql qqlVar = new qql();
        qqlVar.e = carRegionId;
        bundleA = qqlVar.a();
        woy.af(f(carRegionId.h).b, "The display must be started before calling startIntentForRegion for %s on %s", intent.getComponent(), carRegionId);
        return ba(intent, bundleA, null, 1);
    }

    @ResultIgnorabilityUnspecified
    public final synchronized void au(ComponentName componentName) {
        ilb.d();
        ((ype) b.l().ai((char) 795)).y("stopCarActivityManager called for %s", componentName.getClassName());
        Iterator it = this.u.values().iterator();
        while (it.hasNext()) {
            for (ing ingVar : ((inm) it.next()).f.c(componentName)) {
                if (ingVar.H()) {
                    ingVar.y(null);
                    return;
                }
            }
        }
    }

    public final synchronized void av(ing ingVar, zwj zwjVar) {
        yph yphVar;
        int iIntValue;
        Intent intent;
        ilb.d();
        inz inzVar = ingVar.s;
        if (inzVar == null) {
            yphVar = b;
            ((ype) ((ype) yphVar.h()).ai((char) 714)).u("No StartInfo for destroyed activity, unable to notify listeners");
        } else if (ingVar.D()) {
            yphVar = b;
            ((ype) yphVar.l().ai((char) 719)).u("Sending activityStop for teardown");
            aJ(ingVar.z, inzVar.c);
        } else {
            yphVar = b;
            ((ype) yphVar.l().ai((char) 718)).u("No need to send activityStop for teardown");
        }
        if (!this.o) {
            ((ype) yphVar.l().ai((char) 717)).y("onActivityManagerDestroyed when not connected, finishing %s", ingVar);
            ingVar.l();
            aN(ingVar);
            return;
        }
        iod iodVar = this.p;
        if (iodVar != null) {
            iodVar.d(ingVar);
            if (ingVar.s != null && (intent = inzVar.c) != null && intent.getBooleanExtra("assistant_activity", false) && this.y) {
                ((ype) yphVar.l().ai((char) 716)).u("OnActivityManagerDestroyed, restoring keyboard after assistant");
                iod iodVar2 = this.p;
                ins insVar = this.X;
                iodVar2.c(insVar.a, insVar.b, insVar.c);
                this.y = false;
            }
        }
        CarRegionId carRegionId = ingVar.z;
        inn innVarG = g(carRegionId);
        boolean zF = g(carRegionId).j.f(ingVar);
        boolean zAZ = aZ(ingVar);
        int iB = ingVar.b();
        if (zF) {
            be(innVarG);
        }
        jkk jkkVar = ingVar.y;
        bc(ingVar, zAZ);
        if (zwjVar != null) {
            if (iB == 1 && innVarG.e == ingVar) {
                jkkVar.aa(carRegionId, null);
            }
            ((ype) ((ype) yphVar.f()).ai(679)).N("Crashed %s, wasConnecting:%b", ingVar, zF);
            Object obj = zwjVar.b;
            if (obj != null) {
                ((ype) ((ype) ((ype) yphVar.f()).p((Throwable) obj)).ai((char) 689)).y("FATAL onActivityManagerCrash called. Message: %s", ((RuntimeException) obj).getMessage());
            }
            ((ype) ((ype) ((ype) yphVar.f()).q(ypd.MEDIUM)).ai((char) 680)).y("onActivityManagerCrash call stack for %s", ingVar);
            if (this.T) {
                throw ((RuntimeException) new ntn(obj).h(new inl(ingVar, i)));
            }
            if (this.S == null) {
                this.S = new ArrayDeque();
            }
            this.R++;
            this.S.add(zwjVar);
            if (this.R > 5) {
                this.S.remove();
            }
            ioc iocVar = ingVar.c;
            Object obj2 = ax(carRegionId).first;
            ComponentName componentName = iocVar.d;
            if (componentName.equals(obj2)) {
                g(carRegionId).d++;
            }
            if (this.s == null) {
                this.s = new HashMap();
            }
            Pair pair = (Pair) this.s.get(componentName);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (pair == null || jElapsedRealtime - ((Long) pair.first).longValue() > 30000) {
                this.s.put(componentName, Pair.create(Long.valueOf(jElapsedRealtime), 1));
            } else {
                this.s.put(componentName, Pair.create(Long.valueOf(jElapsedRealtime), Integer.valueOf(((Integer) pair.second).intValue() + 1)));
            }
            i = (ingVar.H() || f(carRegionId.h).a.remove(ingVar)) ? 1 : 0;
            if (this.o) {
                ComponentName componentName2 = ingVar.d;
                Map map = c;
                if (map.containsKey(componentName2)) {
                    Integer num = (Integer) map.get(componentName2);
                    num.getClass();
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                ComponentName componentName3 = (ComponentName) ax(carRegionId).first;
                if (zF) {
                    if (componentName2.equals(componentName3)) {
                        ((ype) ((ype) yphVar.f()).ai((char) 687)).u("Handling crash of connecting client (default), restarting default component or fallback.");
                        aQ(ingVar);
                    } else if (iIntValue == 1) {
                        ((ype) ((ype) yphVar.f()).ai((char) 685)).u("Handling crash of connecting client (content), falling back to default component.");
                        iocVar.d();
                        aD("Crash", carRegionId);
                    } else if (iIntValue == 2 || iIntValue == 6) {
                        ((ype) ((ype) yphVar.f()).ai((char) 686)).u("Handling crash of connecting client (rail or notification), retrying");
                        ingVar.u();
                        inz inzVar2 = ingVar.s;
                        ba(inzVar2.c, inzVar2.d, null, ingVar.b());
                    } else {
                        ((ype) ((ype) yphVar.f()).ai((char) 684)).u("Handling crash of connecting client (unhandled).");
                    }
                } else if (i == 0 || iIntValue == 5) {
                    ((ype) ((ype) yphVar.f()).ai((char) 681)).u("Handling background crash");
                    iocVar.d();
                } else if (componentName2.equals(componentName3)) {
                    ((ype) ((ype) yphVar.f()).ai((char) 683)).u("Handling crash of running client, restarting default component or fallback");
                    aQ(ingVar);
                } else {
                    ((ype) ((ype) yphVar.f()).ai((char) 682)).u("Handling crash of running client, restarting component or fallback");
                    ing ingVarB = iocVar.b();
                    inz inzVar3 = ingVarB.s;
                    Intent intent2 = inzVar3.c;
                    Bundle bundle = inzVar3.d;
                    Pair pair2 = (Pair) this.s.get(componentName);
                    pair2.getClass();
                    if (((Integer) pair2.second).intValue() < 5) {
                        intent2.setComponent(ingVarB.s.a);
                        intent2.putExtra("CAR_ACTIVITY_EXTRA_CRASH_RECOVERY", true);
                        ((ype) ((ype) yphVar.f()).ai(768)).M("Restarting component with intent %s on %s", intent2, ay(bundle, intent2));
                        if (ingVarB.b() != 1) {
                            ingVarB.u();
                        } else {
                            ingVarB.c.d();
                        }
                        ba(intent2, bundle, null, ingVarB.b());
                    } else if (ingVar.b() == 1) {
                        ((ype) ((ype) yphVar.f()).ai(770)).y("Crash loop, fallback to default component. %s", ingVarB.d);
                        ingVarB.c.d();
                        aD("crashloop", carRegionId);
                    } else {
                        ((ype) ((ype) yphVar.h()).ai((char) 769)).u("Crash loop detected in non-content layer");
                    }
                }
            }
        } else {
            i = (ingVar.H() || f(carRegionId.h).a.remove(ingVar)) ? 1 : 0;
            if (ingVar.G()) {
                ingVar.l();
            } else {
                ingVar.u();
            }
            if (i != 0) {
                ing ingVarC = ingVar.c.c();
                if (ingVarC != null) {
                    ing ingVar2 = innVarG.e;
                    innVarG.e = ingVarC;
                    ingVarC.v();
                } else if (iB == 1) {
                    jkkVar.aa(carRegionId, null);
                    aD("No task available", carRegionId);
                }
            }
        }
        aN(ingVar);
    }

    public final synchronized ComponentName b(int i) {
        ComponentName componentNameC = null;
        for (ing ingVar : f(CarDisplayId.a).f.v()) {
            if (ingVar.k == i) {
                if (ingVar.H()) {
                    return ingVar.c();
                }
                if (componentNameC == null) {
                    componentNameC = ingVar.c();
                }
            }
        }
        return componentNameC;
    }

    public final Configuration c(CarDisplayId carDisplayId) {
        return (Configuration) this.J.a(carDisplayId);
    }

    public final synchronized Bundle d() {
        Bundle bundle = this.Y;
        if (bundle == null) {
            return null;
        }
        return bundle.deepCopy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized ing e(CarRegionId carRegionId) {
        ing ingVar = g(carRegionId).e;
        if (ingVar != null && ingVar.H()) {
            return ingVar;
        }
        yfq yfqVarB = this.l.b(carRegionId);
        int size = yfqVarB.size();
        for (int i = 0; i < size; i++) {
            ing ingVar2 = g((CarRegionId) yfqVarB.get(i)).e;
            if (ingVar2 != null && ingVar2.H()) {
                return ingVar2;
            }
        }
        return ingVar;
    }

    final inm f(CarDisplayId carDisplayId) {
        Map map = this.u;
        if (!map.containsKey(carDisplayId)) {
            map.put(carDisplayId, new inm());
        }
        return (inm) map.get(carDisplayId);
    }

    public final inn g(CarRegionId carRegionId) {
        Map map = this.t;
        woy.S(map.containsKey(carRegionId), "Trying to access %s which was not configured", carRegionId);
        return (inn) map.get(carRegionId);
    }

    public final synchronized jid h(ProjectionWindowAnimationParams projectionWindowAnimationParams, CarRegionId carRegionId) {
        if (projectionWindowAnimationParams.a <= 0) {
            return null;
        }
        CarActivityLayoutParams carActivityLayoutParams = ((CarActivityRegionLayoutConfig) g(carRegionId).q.b).d;
        jkk jkkVarJ = j(carRegionId.h);
        return ((ina) jkkVarJ).Y.b(roc.aG(this.d, this.B), projectionWindowAnimationParams, jkkVarJ.a(carActivityLayoutParams.a), jkkVarJ.a(carActivityLayoutParams.b));
    }

    public final synchronized jin i(jid jidVar, jid jidVar2, CarRegionId carRegionId) {
        CarActivityLayoutParams carActivityLayoutParams;
        carActivityLayoutParams = ((CarActivityRegionLayoutConfig) g(carRegionId).q.b).d;
        return new jin(jidVar, jidVar2, h(carActivityLayoutParams.h, carRegionId), h(carActivityLayoutParams.i, carRegionId));
    }

    public final jkk j(CarDisplayId carDisplayId) {
        return this.k.q(carDisplayId);
    }

    public final synchronized ProjectionWindowDecorationParams k(CarRegionId carRegionId) {
        return ((CarActivityRegionLayoutConfig) g(carRegionId).q.b).d.g;
    }

    final CarRegionId l(Intent intent) {
        return (intent != null && intent.getBooleanExtra("assistant_activity", false)) ? aV(intent) ? CarRegionId.c : CarRegionId.b : CarRegionId.a;
    }

    public final synchronized yfq m(CarRegionId carRegionId) {
        return ((CarActivityRegionLayoutConfig) g(carRegionId).q.b).d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void n(inz inzVar) {
        if (!this.o) {
            ((ype) ((ype) b.f()).ai((char) 658)).y("addPendingClient(%s) called while not connected, ignoring.", inzVar);
            return;
        }
        CarRegionId carRegionId = inzVar.i;
        g(carRegionId).b = inzVar;
        yfl yflVar = new yfl(4);
        yfq yfqVarB = this.l.b(carRegionId);
        int size = yfqVarB.size();
        for (int i = 0; i < size; i++) {
            yflVar.i(g((CarRegionId) yfqVarB.get(i)));
        }
        yfq yfqVarG = yflVar.g();
        int i2 = ((yls) yfqVarG).c;
        for (int i3 = 0; i3 < i2; i3++) {
            ((inn) yfqVarG.get(i3)).b = null;
        }
    }

    public final synchronized void o(inz inzVar) {
        if (this.o) {
            g(inzVar.i).h.add(inzVar);
        } else {
            ((ype) ((ype) b.f()).ai((char) 659)).y("addPendingPreWarm(%s) called while not connected, ignoring.", inzVar);
        }
    }

    public final synchronized void p(CarRegionId carRegionId, inw inwVar) {
        inn innVarG = g(carRegionId);
        inw inwVar2 = innVarG.o;
        if (inwVar2 != null) {
            woy.ag(inwVar2.equals(inwVar), "You cannot add %s to %s which currently has %s", inwVar, carRegionId, inwVar2);
            ((ype) ((ype) b.f()).ai((char) 660)).y("Duplicate ResumeThenStopRunnable found: %s. Nothing to add", inwVar2);
        }
        innVarG.o = inwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void q(CarRegionId carRegionId) {
        yfq yfqVarB = this.l.b(carRegionId);
        int size = yfqVarB.size();
        for (int i = 0; i < size; i++) {
            CarRegionId carRegionId2 = (CarRegionId) yfqVarB.get(i);
            ((ype) b.l().ai((char) 665)).M("Clearing any queued connections for regions grouped with %s -- %s", carRegionId, carRegionId2);
            g(carRegionId2).j.a(false);
        }
    }

    public final void r(PrintWriter printWriter) {
        printWriter.print("CarActivityManagerService ");
        printWriter.println(Integer.toHexString(System.identityHashCode(this)));
        printWriter.print("\tState:");
        printWriter.print("connected=");
        printWriter.print(this.o);
        printWriter.print(" imeManager=");
        iod iodVar = this.p;
        printWriter.print(iodVar != null ? iodVar.toString() : "null");
        printWriter.println();
        printWriter.println();
        printWriter.println("Active Clients: ");
        try {
            synchronized (this) {
                for (Map.Entry entry : this.u.entrySet()) {
                    printWriter.print("Display: ");
                    printWriter.println(entry.getKey());
                    printWriter.print("started: ");
                    printWriter.println(((inm) entry.getValue()).b);
                    printWriter.print("hasVideoFocus: ");
                    printWriter.println(((inm) entry.getValue()).c);
                    printWriter.print("transientLoss: ");
                    printWriter.println(((inm) entry.getValue()).d);
                    printWriter.print("contentShownOnPrimaryRegion: ");
                    printWriter.println(((inm) entry.getValue()).i);
                    printWriter.print("pendingKeys: ");
                    printWriter.println(((inm) entry.getValue()).g);
                    printWriter.print("pendingSearchKeys: ");
                    printWriter.println(((inm) entry.getValue()).h);
                    printWriter.print("lastFocusRegion (updated only when display loses focus): ");
                    printWriter.println(((inm) entry.getValue()).k);
                    printWriter.println("activeActivityManagers: ");
                    Iterator it = ((inm) entry.getValue()).f.v().iterator();
                    while (it.hasNext()) {
                        ((ing) it.next()).j(printWriter);
                    }
                    printWriter.println("clientsToRestore: ");
                    Iterator it2 = ((inm) entry.getValue()).a.iterator();
                    while (it2.hasNext()) {
                        ((ing) it2.next()).j(printWriter);
                    }
                }
                printWriter.println();
                for (Map.Entry entry2 : this.t.entrySet()) {
                    printWriter.print("Region: ");
                    printWriter.println(entry2.getKey());
                    printWriter.print("Pending client: ");
                    printWriter.println(((inn) entry2.getValue()).b);
                    printWriter.print("pendingIntentToLaunch: ");
                    printWriter.println(((inn) entry2.getValue()).c);
                    printWriter.print("Config: ");
                    printWriter.println(((inn) entry2.getValue()).q.b);
                    printWriter.println();
                }
            }
        } catch (ConcurrentModificationException unused) {
            printWriter.println();
            printWriter.println("ConcurrentModificationException caught");
        }
        printWriter.println();
        printWriter.println("Tasks: ");
        int i = 0;
        while (true) {
            yw ywVar = this.n;
            if (i >= ywVar.d) {
                break;
            }
            ioc iocVar = (ioc) ywVar.g(i);
            printWriter.print("CarActivityTask{#");
            printWriter.print(iocVar.b);
            printWriter.print(": mRoot=");
            printWriter.print(iocVar.d.flattenToShortString());
            printWriter.print(", mActivities=[");
            int i2 = 0;
            while (true) {
                List list = iocVar.e;
                if (i2 < list.size()) {
                    printWriter.print(((ing) list.get(i2)).i);
                    if (i2 < list.size() - 1) {
                        printWriter.print(", ");
                    }
                    i2++;
                }
            }
            printWriter.println("]}");
            i++;
        }
        printWriter.println();
        printWriter.println("Crash Report");
        printWriter.print("Total Crashes: ");
        printWriter.println(this.R);
        if (this.S != null) {
            printWriter.println("Latest Crashes:");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
            for (zwj zwjVar : this.S) {
                printWriter.print(simpleDateFormat.format(new Date(zwjVar.a)));
                printWriter.print(": ");
                Object obj = zwjVar.b;
                if (obj == null) {
                    printWriter.println("<no exception>");
                } else {
                    RuntimeException runtimeException = (RuntimeException) obj;
                    printWriter.println(runtimeException.getMessage());
                    runtimeException.printStackTrace(printWriter);
                }
            }
        }
    }

    final synchronized void s(ing ingVar) {
        Intent intent = ingVar.t;
        intent.getClass();
        ActivityLaunchInfo activityLaunchInfo = new ActivityLaunchInfo(intent, ingVar.z);
        aK(new ink(activityLaunchInfo, 0), activityLaunchInfo);
    }

    public final synchronized void t(ing ingVar) {
        if (!this.o) {
            ((ype) b.l().ai((char) 722)).y("onActivityManagerFinished when not connected, ignoring. %s", ingVar);
            return;
        }
        CarRegionId carRegionId = ingVar.z;
        inm inmVarF = f(carRegionId.h);
        inmVarF.f.C(ingVar.d, ingVar);
        inmVarF.a.remove(ingVar);
        inn innVarG = g(carRegionId);
        if (innVarG.e == ingVar) {
            innVarG.e = null;
        }
    }

    public final synchronized void u(ing ingVar) {
        aZ(ingVar);
    }

    public final synchronized void v(ing ingVar) {
        ((ype) ((ype) b.h()).ai((char) 724)).y("onActivityManagerResumeFailed for %s", ingVar.d.getShortClassName());
        ilb.d();
        aP(ingVar, true);
    }

    public final synchronized void w(ing ingVar) {
        ilb.d();
        if (!this.o) {
            ((ype) b.l().ai((char) 728)).y("onActivityManagerResumed when not connected, finishing %s", ingVar);
            ingVar.l();
            return;
        }
        CarRegionId carRegionId = ingVar.z;
        CarDisplayId carDisplayId = carRegionId.h;
        inm inmVarF = f(carDisplayId);
        if (!inmVarF.j && ingVar.b() == 1) {
            if (this.l.d(carRegionId)) {
                inmVarF.i = true;
            }
            inmVarF.j = true;
            aE(carDisplayId);
        }
        if (inmVarF.c && !inmVarF.h.isEmpty()) {
            aE(carDisplayId);
        }
        inn innVarG = g(carRegionId);
        ing ingVar2 = innVarG.e;
        innVarG.e = ingVar;
        boolean zF = g(carRegionId).j.f(ingVar);
        jkk jkkVar = ingVar.y;
        if (ingVar.b() != 1) {
            jkkVar.K(ingVar.d(), true);
        }
        if (((ina) jkkVar).C) {
            inmVarF.a.remove(ingVar);
        }
        ComponentName componentName = ingVar.d;
        if (componentName.equals(ax(carRegionId).first)) {
            innVarG.d = 0;
        }
        Context context = this.d;
        inh inhVar = inh.l;
        if (inhVar.m && CarDisplayId.a.equals(carDisplayId) && !inh.f.contains(componentName) && !inh.g.equals(componentName) && (!acur.a.gu().i() || !inh.h.equals(componentName))) {
            inhVar.m = false;
            ols.K(context, "com.google.android.gms.car.STARTUP_LATENCY_MEASUREMENT_EVENT", rry.e.ordinal(), null);
        }
        if (CarDisplayId.a.equals(carDisplayId)) {
            yfy yfyVar = inh.b;
            if (yfyVar.containsKey(componentName)) {
                tfk.a.d((tfj) yfyVar.get(componentName), 1);
            }
            yfy yfyVar2 = inh.c;
            if (yfyVar2.containsKey(componentName)) {
                tfk.a.d((tfj) yfyVar2.get(componentName), 1);
            }
            yfy yfyVar3 = inh.d;
            if (yfyVar3.containsKey(componentName)) {
                tfk.a.d((tfj) yfyVar3.get(componentName), 1);
            }
            yfy yfyVar4 = inh.e;
            if (yfyVar4.containsKey(componentName)) {
                tfk.a.d((tfj) yfyVar4.get(componentName), 1);
            }
        }
        aH();
        if (zF) {
            be(innVarG);
        }
    }

    public final synchronized void x(ing ingVar) {
        ((ype) ((ype) b.h()).ai((char) 729)).y("onActivityManagerResumedInWrongState for %s", ingVar.d.getShortClassName());
        ilb.d();
        aP(ingVar, false);
    }

    public final synchronized void y(ing ingVar) {
        if (ingVar.E()) {
            aO(ingVar);
        }
    }

    public final void z(ing ingVar) {
        Intent intent;
        iod iodVar;
        ilb.d();
        if (!this.o) {
            ((ype) b.l().ai((char) 733)).y("onActivityManagerStarted when not connected, finishing %s", ingVar);
            ingVar.l();
            return;
        }
        inz inzVar = ingVar.s;
        if (inzVar != null && (intent = inzVar.c) != null && intent.getBooleanExtra("assistant_activity", false) && (iodVar = this.p) != null && ((iof) iodVar).d == 2) {
            ((ype) b.l().ai((char) 732)).u("onActivityManagerStarted, closing keyboard since assistant triggered");
            this.y = true;
            this.p.e(this.X.c);
        }
        if (ingVar.b() != 1) {
            ingVar.y.q(ingVar.d());
        }
    }
}
