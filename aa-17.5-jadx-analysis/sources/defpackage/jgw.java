package defpackage;

import android.animation.ValueAnimator;
import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Surface;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.OptionalInt;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class jgw implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jgw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jid jidVarB;
        int i = 5;
        jhf jhfVar = null;
        boolean z = true;
        int i2 = 1;
        z = true;
        switch (this.b) {
            case 0:
                jgy jgyVar = (jgy) this.a;
                ((ype) jgy.a.l().ai((char) 2103)).y("%s.onWindowAttachComplete", jgyVar.b);
                ilb.d();
                if (jgyVar.m && !jgyVar.n) {
                    z = false;
                }
                jgyVar.m = false;
                jkk jkkVar = jgyVar.d;
                jhf jhfVar2 = jgyVar.h;
                if (jgyVar.o != null || jgyVar.g.v.a > 0) {
                    ina inaVar = (ina) jkkVar;
                    jii jiiVar = inaVar.Y;
                    Context contextAG = roc.aG(inaVar.l, jgyVar.c);
                    ProjectionWindowAnimationParams projectionWindowAnimationParams = jgyVar.o;
                    if (projectionWindowAnimationParams == null) {
                        projectionWindowAnimationParams = jgyVar.g.v;
                    }
                    jidVarB = jiiVar.b(contextAG, projectionWindowAnimationParams, jgyVar.t(), jgyVar.s());
                    jgyVar.o = null;
                } else {
                    jidVarB = null;
                }
                jkkVar.L(jhfVar2, z, null, jidVarB);
                return;
            case 1:
                jgs jgsVar = (jgs) this.a;
                jhg jhgVarBj = jgsVar.bj(jgsVar.o);
                float f = jgsVar.e.a;
                float f2 = jgsVar.e.b;
                float f3 = jgsVar.e.f;
                float f4 = jgsVar.e.e;
                if (!jgsVar.j.h) {
                    f += r6.a;
                    f2 += r6.d;
                    f3 -= r6.b;
                    f4 -= r6.c;
                }
                Rect rect = new Rect((thg.d(jhgVarBj.a - f, (float) jgsVar.f.left, 1.0E-4f) ? jgsVar.f : jgsVar.g).left, (thg.d(f3 - jhgVarBj.d, (float) jgsVar.f.top, 1.0E-4f) ? jgsVar.f : jgsVar.g).top, (thg.d(f4 - jhgVarBj.c, (float) jgsVar.f.right, 1.0E-4f) ? jgsVar.f : jgsVar.g).right, (thg.d(jhgVarBj.b - f2, (float) jgsVar.f.bottom, 1.0E-4f) ? jgsVar.f : jgsVar.g).bottom);
                if (jgsVar.g.equals(rect)) {
                    ((ype) jgs.a.l().ai(2016)).M("Render bounds don't fully cover insets, not sending non-drawable insets %s. Render bounds: %s", jgsVar.f, jgsVar.o);
                    return;
                }
                ((ype) jgs.a.l().ai(2017)).y("Render bounds fully cover insets, sending non-drawable insets %s", jgsVar.f);
                jgsVar.g = rect;
                jgr jgrVar = jgsVar.q;
                jgrVar.e(jgsVar.p());
                jgsVar.i = false;
                jgrVar.removeCallbacks(jgsVar.A);
                return;
            case 2:
                Object obj = this.a;
                jhb jhbVar = (jhb) obj;
                jhbVar.J = true;
                ((jgs) obj).c.T();
                jhbVar.E = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
                jhbVar.E.setDuration(800L);
                jhbVar.E.addUpdateListener(new nt(obj, 3, null));
                jhbVar.E.addListener(new jha(jhbVar));
                jhbVar.E.start();
                return;
            case 3:
                ((ype) jjz.a.f()).u("Loading timed out");
                ((jjz) this.a).i();
                return;
            case 4:
                ((ype) jjz.a.f()).u("Minimum time reached");
                ((jjz) this.a).i();
                return;
            case 5:
                ((ype) jjz.a.f()).u("Loading timed out waiting for screen to get filled");
                ((jjz) this.a).i();
                return;
            case 6:
                jkb jkbVar = (jkb) this.a;
                jhf jhfVar3 = jkbVar.f;
                if (jhfVar3 == null) {
                    affa.d("projectionWindow");
                } else {
                    jhfVar = jhfVar3;
                }
                Surface surfaceAJ = jhfVar.aJ();
                if (surfaceAJ != null) {
                    jkbVar.a(surfaceAJ);
                    return;
                }
                return;
            case 7:
                jot jotVar = (jot) this.a;
                long j = jotVar.a;
                jou jouVar = jotVar.c;
                if (jouVar.k(j)) {
                    int i3 = jotVar.b;
                    jouVar.f();
                    jni jniVar = jouVar.f;
                    if (i3 == 1) {
                        jqa jqaVar = (jqa) jniVar;
                        woy.ad(jqaVar.j.add(Long.valueOf(j)), "Car connection with sessionId %s already started", String.valueOf(j));
                        jqaVar.g.c(rrc.h(yxy.CAR_SERVICE, yzz.CAR_SERVICE, yzy.ud).l());
                    } else {
                        i2 = i3;
                    }
                    ygr ygrVar = jqa.b;
                    Integer numValueOf = Integer.valueOf(i2);
                    if (!ygrVar.contains(numValueOf)) {
                        throw new IllegalArgumentException();
                    }
                    ((jqa) jniVar).i.set(numValueOf, false);
                    return;
                }
                return;
            case 8:
                jot jotVar2 = (jot) this.a;
                long j2 = jotVar2.a;
                jou jouVar2 = jotVar2.c;
                if (jouVar2.k(j2)) {
                    int i4 = jotVar2.b;
                    jouVar2.f();
                    woy.aa(((Integer) ((jqa) jouVar2.f).i.getReference()).intValue() == i4, "onCarConnectionReady connection type doesn't match connection type we were connecting with!");
                    return;
                }
                return;
            case 9:
                yph yphVar = jqj.a;
                ((Handler) this.a).post(new ily(i));
                return;
            case 10:
                yph yphVar2 = jqj.a;
                ((ype) yphVar2.l().ai((char) 2608)).u("Building ICar delegate chain.");
                ArrayList arrayList = new ArrayList(3);
                jqj jqjVar = (jqj) this.a;
                jqa jqaVar2 = jqjVar.j;
                arrayList.add(jqaVar2);
                ima imaVar = jqjVar.f;
                arrayList.add(imaVar);
                yop yopVarF = jqa.a.f();
                zjc zjcVar = zjc.a;
                ((ype) ((ype) yopVarF).ai((char) 2589)).y("Setting delegate: %s", new zjd(zjcVar, imaVar));
                woy.aa(a.p(jqaVar2.c, imaVar), "Tried to set Delegate Car Service more than once.");
                jqaVar2.f.post(new jpx(jqaVar2, imaVar, false ? 1 : 0));
                jox joxVar = jqjVar.i;
                arrayList.add(joxVar);
                ype ypeVar = (ype) ((ype) ima.b.f()).ai(383);
                AtomicReference atomicReference = imaVar.i;
                ypeVar.M("Setting CSB delegate, previous value %s updated to %s", atomicReference, joxVar);
                atomicReference.set(joxVar);
                ((ype) ((ype) yphVar2.f()).ai((char) 2609)).y("ICar delegate chain:\n\t%s", new zjd(zjcVar, new xxd("\n\t-> ").b(arrayList)));
                return;
            case 11:
                ((CountDownLatch) this.a).countDown();
                return;
            case 12:
                jou jouVar3 = (jou) ((jqj) this.a).e;
                jouVar3.f();
                jouVar3.h();
                if (jouVar3.j()) {
                    jouVar3.i();
                    return;
                }
                return;
            case 13:
                wer.c();
                kiv kivVar = (kiv) this.a;
                if (!kivVar.o) {
                    ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LIFETIME, yzy.pe).l());
                }
                kivVar.o = false;
                return;
            case 14:
                wer.b();
                kpn kpnVar = (kpn) this.a;
                woy.O(kpnVar.i != 0, "heartbeat expiration timestamp is not initialized");
                long jP = kpn.p();
                if (jP - kpnVar.i >= acot.g()) {
                    if (!kpnVar.n && jP - kpnVar.k >= acot.h()) {
                        ((ype) ((ype) kpn.a.f()).ai(3348)).y("Session %s obsolete", ((knb) kpnVar.e.get()).a);
                        kpnVar.s();
                        return;
                    }
                    ((ype) ((ype) kpn.a.f()).ai(3347)).y("Session %s unfrozen", ((knb) kpnVar.e.get()).a);
                }
                kpnVar.i = kpn.p();
                int i5 = kpnVar.p;
                if (i5 == 2) {
                    long j3 = kpnVar.g;
                    UUID uuidR = kpn.r((knb) kpnVar.e.get());
                    long jP2 = kpn.p();
                    zgp zgpVarY = (kpnVar.o || kpnVar.y()) ? wub.Y(true) : kpnVar.q();
                    wub.ah(zgpVarY, new kpm(kpnVar, uuidR, jP2, j3), kpnVar.c);
                    return;
                }
                if (i5 == 3) {
                    ((ype) ((ype) kpn.a.f()).ai(3346)).y("Session %s expired", ((knb) kpnVar.e.get()).a);
                    kpnVar.v(yxi.SESSION_EXPIRED, OptionalInt.empty(), kpn.p());
                    kpnVar.s();
                    return;
                }
                return;
            case 15:
                wer.b();
                Object obj2 = this.a;
                kpn kpnVar2 = (kpn) obj2;
                kpnVar2.l.cancel(false);
                zgp zgpVarY2 = (kpnVar2.o || kpnVar2.y()) ? wub.Y(true) : (!lgv.c().g() || BluetoothAdapter.getDefaultAdapter() == null) ? wub.Y(false) : zfb.f(kpn.B(), new ikj(i), kpnVar2.c);
                kpnVar2.l = zgpVarY2;
                kpnVar2.j = kpn.p();
                wub.ah(kpnVar2.l, new ikn(obj2, 3), kpnVar2.c);
                return;
            case 16:
                kpn kpnVar3 = (kpn) this.a;
                zgp zgpVar = kpnVar3.h;
                if (zgpVar == null || zgpVar.isCancelled()) {
                    return;
                }
                kpnVar3.w();
                return;
            case 17:
                ((mmc) this.a).i();
                return;
            case 18:
                KeyguardManager keyguardManager = (KeyguardManager) mki.a.c.getSystemService("keyguard");
                keyguardManager.getClass();
                if (!keyguardManager.isKeyguardLocked()) {
                    ((mfp) luk.b().a()).b.a(mgl.h);
                    return;
                }
                mft mftVar = (mft) this.a;
                Handler handler = mftVar.a;
                handler.getClass();
                handler.postDelayed(mftVar.b, 250L);
                return;
            case 19:
                if (((mfp) ((mfm) mki.a.i(mfm.class)).a()).c == null) {
                    ((ype) ((ype) PreflightPhoneWelcomeActivity.n.h()).ai((char) 4913)).u("Preflight session has ended, skipping invalidate runnable");
                    return;
                }
                if (mdh.g()) {
                    ((ype) ((ype) PreflightPhoneWelcomeActivity.n.h()).ai((char) 4912)).u("Auth is completed, not showing authorization dialog");
                    return;
                }
                Object obj3 = this.a;
                PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity = (PreflightPhoneWelcomeActivity) obj3;
                if (!preflightPhoneWelcomeActivity.B()) {
                    ((ype) ((ype) PreflightPhoneWelcomeActivity.n.f()).ai((char) 4910)).u("Authorization dialog already shown, not showing on resume");
                    return;
                } else {
                    ((ype) ((ype) PreflightPhoneWelcomeActivity.n.f()).ai((char) 4911)).u("Showing authorization dialog to user on activity resume");
                    preflightPhoneWelcomeActivity.q.f(((bc) obj3).a(), "authorization_dialog");
                    return;
                }
            default:
                ((mhp) this.a).a();
                return;
        }
    }

    public jgw(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
