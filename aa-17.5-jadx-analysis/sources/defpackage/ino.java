package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.CarFacet;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.KeyEventCompleteData;
import com.google.android.gms.car.TouchEventCompleteData;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class ino implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ino(ipa ipaVar, int i) {
        this.c = i;
        this.a = ipaVar;
        this.b = "Timeout connecting from CAMS";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [itf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v56, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        switch (this.c) {
            case 0:
                ing ingVar = (ing) this.a;
                if (ingVar.I()) {
                    ((ype) ((ype) iob.b.f()).ai((char) 629)).y("%s not in the right state to stop after pause, doing nothing", ingVar.g());
                    return;
                } else {
                    ingVar.y((ing) this.b);
                    return;
                }
            case 1:
                ((iob) this.a).K((CarRegionId) this.b);
                return;
            case 2:
                if (Build.VERSION.SDK_INT >= 36) {
                    jhf jhfVar = ((qxx) this.b).a.N;
                    if (jhfVar == null) {
                        ((ype) ((ype) ipb.E.h()).ai((char) 896)).u("setSurfacePackage: window is null, likely torn down");
                        return;
                    } else {
                        if (!(jhfVar instanceof jhk)) {
                            throw new IllegalStateException("Window is not a ViewProjectionWindow: ".concat(jhfVar.toString()));
                        }
                        ((jhk) jhfVar).ah((Bundle) this.a);
                        return;
                    }
                }
                return;
            case 3:
                ing ingVar2 = (ing) ((ipa) this.a).v();
                if (ingVar2 != null) {
                    ingVar2.K((String) this.b, null);
                    return;
                }
                return;
            case 4:
                ing ingVar3 = (ing) ((ipa) this.a).v();
                if (ingVar3 != null) {
                    ingVar3.m((RuntimeException) this.b);
                    return;
                }
                return;
            case 5:
                ((ipw) this.a).e(this.b);
                return;
            case 6:
                ((iuu) this.a).m.a((rzj) this.b);
                return;
            case 7:
                iuu iuuVar = (iuu) this.a;
                iuuVar.h.e(2);
                Object objGu = iuuVar.i.gu();
                if (objGu != null) {
                    iye iyeVar = (iye) this.b;
                    if (iyeVar.e == 0) {
                        jfg jfgVar = iuuVar.d;
                        iyd[] iydVarArr = iyeVar.h;
                        if (iydVarArr != null && iydVarArr.length != 0) {
                            jfh jfhVar = (jfh) jfgVar;
                            CarFacet carFacet = jfhVar.g;
                            int iAt = carFacet != null ? a.at(carFacet.a) : 1;
                            abnp abnpVarN = yzt.a.n();
                            int i = iyeVar.h[0].e;
                            abnpVarN.t();
                            yzt yztVar = (yzt) abnpVarN.b;
                            yztVar.b = 1 | yztVar.b;
                            yztVar.c = i;
                            int i2 = iyeVar.h[0].f;
                            abnpVarN.t();
                            yzt yztVar2 = (yzt) abnpVarN.b;
                            yztVar2.b = 2 | yztVar2.b;
                            yztVar2.d = i2;
                            if (iAt == 0) {
                                throw null;
                            }
                            abnpVarN.t();
                            yzt yztVar3 = (yzt) abnpVarN.b;
                            yztVar3.b |= 4;
                            yztVar3.e = iAt - 1;
                            yzt yztVar4 = (yzt) abnpVarN.q();
                            abnp abnpVarN2 = yxb.a.n();
                            abnpVarN2.t();
                            yxb yxbVar = (yxb) abnpVarN2.b;
                            yztVar4.getClass();
                            yxbVar.j = yztVar4;
                            yxbVar.b |= 64;
                            yxc yxcVar = yxc.TOUCH_EVENT;
                            int i3 = yfq.d;
                            jfhVar.m(abnpVarN2, yxcVar, yls.a);
                        }
                    }
                    ((iob) objGu).H(iuuVar.j, iyeVar);
                    return;
                }
                return;
            case 8:
                wer.c();
                iuu iuuVar2 = (iuu) this.b;
                iwb iwbVar = iuuVar2.m;
                int i4 = iwbVar.d;
                Locale locale = Locale.US;
                Integer numValueOf = Integer.valueOf(i4);
                MotionEvent motionEvent = (MotionEvent) this.a;
                if (motionEvent.getActionMasked() != 8) {
                    str = String.format(Locale.US, "UNRECOGNIZED(%d)", Integer.valueOf(motionEvent.getActionMasked()));
                } else {
                    eqy eqyVar = iwbVar.f;
                    str = motionEvent.getAxisValue(26) > BitmapDescriptorFactory.HUE_RED ? "FOCUS_FORWARD" : "FOCUS_BACKWARD";
                }
                String str2 = String.format(locale, "display=%d, action=%s", numValueOf, str);
                ((ype) iwb.a.l().ai((char) 1445)).y("onScrollEvent(%s)", new zjd(zjc.a, str2));
                iwbVar.b("ScrollEvent", str2);
                iuuVar2.h.e(1);
                Object objGu2 = iuuVar2.i.gu();
                if (objGu2 != null) {
                    ((iob) objGu2).G(iuuVar2.j, motionEvent);
                    return;
                }
                return;
            case 9:
                iuu iuuVar3 = (iuu) this.b;
                iuuVar3.h.e(2);
                Object objGu3 = iuuVar3.i.gu();
                if (objGu3 != null) {
                    ((iob) objGu3).I(iuuVar3.j, (MotionEvent) this.a);
                    return;
                }
                return;
            case 10:
                iuu iuuVar4 = ((ivo) this.a).b;
                CarDisplayId carDisplayId = iuuVar4.j;
                iva ivaVar = iuuVar4.o;
                ivaVar.getClass();
                ivaVar.o(this.b);
                return;
            case 11:
                xnz xnzVar = ((xoc) this.b).c;
                if (xnzVar == null) {
                    xnzVar = xnz.a;
                }
                ((jbp) ((izl) this.a).z.a).d(xnzVar, false);
                return;
            case 12:
                jgy jgyVar = (jgy) this.a;
                KeyEvent keyEvent = (KeyEvent) jgyVar.e.a();
                ilb.d();
                if (keyEvent != null) {
                    KeyEventCompleteData keyEventCompleteData = (KeyEventCompleteData) this.b;
                    if (keyEventCompleteData.a) {
                        jgyVar.d.aq(keyEvent);
                    } else {
                        Rect rectA = keyEventCompleteData.a();
                        jhf jhfVar2 = jgyVar.h;
                        if (jhfVar2 != null && rectA != null) {
                            jhfVar2.ai(rectA);
                        }
                        jgyVar.d.ai(jgyVar.h, keyEvent);
                    }
                }
                jgyVar.y();
                return;
            case 13:
                ((jgy) this.a).B((CarWindowLayoutParams) this.b);
                return;
            case 14:
                ((jgy) this.b).h.as((Rect) this.a);
                return;
            case 15:
                jgy jgyVar2 = (jgy) this.a;
                Context contextU = jgyVar2.u(jgyVar2.c);
                if (contextU == null) {
                    ((ype) ((ype) jgy.a.h()).ai((char) 2089)).u("Unable to create context to load animation, falling back to default");
                    jgyVar2.x(jgyVar2.v());
                    return;
                } else {
                    jgyVar2.x(((ina) jgyVar2.d).Y.b(contextU, (ProjectionWindowAnimationParams) this.b, jgyVar2.t(), jgyVar2.s()));
                    return;
                }
            case 16:
                jgy jgyVar3 = (jgy) this.a;
                MotionEvent motionEvent2 = (MotionEvent) jgyVar3.f.a();
                ilb.d();
                if (motionEvent2 != null) {
                    jhf jhfVar3 = jgyVar3.h;
                    if (jhfVar3 == null) {
                        throw new IllegalStateException("Motion event received prior to createWindow");
                    }
                    jgyVar3.d.G(jhfVar3, motionEvent2, (TouchEventCompleteData) this.b);
                }
                jgyVar3.y();
                return;
            case 17:
                ((jgy) this.a).z(true, (ProjectionWindowAnimationParams) this.b, -1);
                return;
            case 18:
                woy.aa(Build.VERSION.SDK_INT >= 36, "setSurfacePackage is only supported on Android API 36 and above.");
                jgy jgyVar4 = (jgy) this.b;
                jhf jhfVar4 = jgyVar4.h;
                if (jhfVar4 == null) {
                    ((ype) ((ype) jgy.a.h()).ai((char) 2046)).u("setSurfacePackage: window is null");
                    return;
                }
                Object obj = this.a;
                woy.ad(jhfVar4 instanceof jhk, "Window is not a ViewProjectionWindow: %s", jhfVar4);
                ((jhk) jgyVar4.h).ah((Bundle) obj);
                return;
            case 19:
                jkv jkvVar = ((jks) this.a).f;
                jkvVar.c.removeCallbacks(this.b);
                jkvVar.g();
                jkvVar.j.a(yze.PROTOCOL_IO_ERROR, yzf.WIFI_NETWORK_UNAVAILABLE, "Wifi network request failed - hard loss of network");
                ((ype) ((ype) jqj.a.f()).ai(2622)).T("Wifi socket connect event: status = %d, socket retry count = %s, network retry count = %s, error code = %d, connection time = %s ms", Integer.valueOf(2), null, Integer.valueOf(jkvVar.f), Integer.valueOf(303 == 0 ? 0 : 303 - 1), null);
                jkvVar.d(yxi.WIRELESS_WIFI_LEGACY_NETWORK_REQUEST_FAILED_NETWORK_UNAVAILABLE);
                return;
            default:
                Object obj2 = this.a;
                Object obj3 = this.b;
                if (obj2 instanceof jef) {
                    jkv jkvVar2 = ((jku) obj3).f;
                    jkvVar2.d(yxi.WIRELESS_WIFI_VPN_ACTIVE);
                    jkvVar2.j.a(yze.SOCKET_VPN_CONNECTION_ERROR, yzf.SOCKET_FAIL, "Couldn't connect to receiver socket while VPN active");
                    rxf.j(jkvVar2.b, jkvVar2.d, yxo.VPN_DETECTED);
                    return;
                }
                jku jkuVar = (jku) obj3;
                jkv jkvVar3 = jkuVar.f;
                jkvVar3.d(yxi.WIRELESS_WIFI_SOCKET_CONNECTION_FAILED_LAST_ATTEMPT);
                if (jkuVar.a()) {
                    return;
                }
                jkvVar3.j.a(yze.PROTOCOL_IO_ERROR, yzf.SOCKET_FAIL, "Couldn't connect to receiver socket");
                ((ype) ((ype) jqj.a.f()).ai(2622)).T("Wifi socket connect event: status = %d, socket retry count = %s, network retry count = %s, error code = %d, connection time = %s ms", Integer.valueOf(2), Integer.valueOf(jkuVar.e), Integer.valueOf(jkvVar3.f), Integer.valueOf(303 == 0 ? 0 : 302 - 1), null);
                return;
        }
    }

    public ino(iuu iuuVar, MotionEvent motionEvent, int i) {
        this.c = i;
        this.a = motionEvent;
        this.b = iuuVar;
    }

    public ino(iuu iuuVar, iye iyeVar, int i) {
        this.c = i;
        this.b = iyeVar;
        this.a = iuuVar;
    }

    public /* synthetic */ ino(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ ino(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
