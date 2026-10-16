package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gearhead.sdk.assistant.SupportedVersionInfo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import j$.util.Objects;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class sbj implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ sbj(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, tqo] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.Object, rws] */
    /* JADX WARN: Type inference failed for: r10v40, types: [java.lang.Object, smq] */
    /* JADX WARN: Type inference failed for: r10v64, types: [java.lang.Object, syp] */
    /* JADX WARN: Type inference failed for: r10v75, types: [java.lang.Object, tqc] */
    /* JADX WARN: Type inference failed for: r10v78, types: [java.lang.Object, tqc] */
    /* JADX WARN: Type inference failed for: r10v79, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, svr, svu, svv] */
    @Override // java.lang.Runnable
    public final void run() {
        rwv rwvVar;
        rwp rwpVarC = null;
        switch (this.c) {
            case 0:
                sbm sbmVar = ((sbl) this.a).g;
                if (sbmVar.h) {
                    sbmVar.d.j((Socket) this.b);
                    return;
                }
                return;
            case 1:
                sbm sbmVar2 = ((sbi) this.a).f;
                sbmVar2.e.removeCallbacks(this.b);
                sbmVar2.d();
                sbmVar2.d.e(yze.PROTOCOL_IO_ERROR, yzf.WIFI_NETWORK_UNAVAILABLE, "Wifi network request failed - hard loss of network");
                sbmVar2.m.g(2, null, Integer.valueOf(sbmVar2.j), 303, null);
                return;
            case 2:
                sgs sgsVar = ((sgx) this.a).g;
                Object obj = this.b;
                if (sgsVar != null) {
                    try {
                        rwv rwvVar2 = sgsVar.f;
                        rwvVar2.getClass();
                        rwvVar2.i(sgsVar.b, ((xhv) obj).i);
                        return;
                    } catch (RemoteException e) {
                        sgx.a.f().p(e).ai(8929).y("Couldn't send bye-bye request to %s, but it could be fine.", sgsVar.c);
                        return;
                    }
                }
                return;
            case 3:
                Object obj2 = this.a;
                shi shiVar = (shi) obj2;
                shh shhVar = shiVar.i;
                Object obj3 = this.b;
                if (shhVar.a) {
                    rwv rwvVar3 = shhVar.f;
                    if (rwvVar3 != null) {
                        try {
                            rwvVar3.i(((shi) obj2).c, ((xhv) obj3).i);
                        } catch (RemoteException e2) {
                            shi.a.f().p(e2).ai(8963).y("Couldn't stop %s, but it could be fine.", shiVar.i.e);
                        }
                    }
                    shiVar.b.unbindService(shiVar.h);
                    shiVar.i.a = false;
                    return;
                }
                return;
            case 4:
                shi shiVar2 = (shi) this.b;
                shh shhVar2 = shiVar2.i;
                ?? r10 = this.a;
                if (shhVar2.a && (rwvVar = shhVar2.f) != 0) {
                    try {
                        ypf ypfVar = shi.a;
                        ypfVar.f().ai(8959).u("Fetching sensor service proxy from Gearhead.");
                        rwpVarC = rwvVar.c(r10);
                        ypfVar.f().ai(8960).y("Sensor service proxy: %s", rwpVarC);
                    } catch (RemoteException e3) {
                        shi.a.h().p(e3).ai(8961).u("Cannot startup sensor service proxy");
                    }
                }
                sat satVar = shiVar2.j;
                satVar.c.post(new rpo(satVar, rwpVarC, 20));
                return;
            case 5:
                shi shiVar3 = ((shc) this.b).a;
                shiVar3.e();
                Object obj4 = this.a;
                shh shhVar3 = shiVar3.i;
                if (Objects.equals(obj4, shhVar3.e)) {
                    shi.a.f().ai(8966).y("onStartupServiceDisconnected - Unable to check interest for %s", obj4);
                    shhVar3.e = null;
                    if (shhVar3.a) {
                        shiVar3.b.unbindService(shiVar3.h);
                        shhVar3.a = false;
                    }
                    shiVar3.j.c((ComponentName) obj4, false);
                    return;
                }
                return;
            case 6:
                ((sme) this.b).h((Bundle) this.a);
                return;
            case 7:
                smp smpVar = ((smr) this.b).a;
                ?? r102 = this.a;
                if (smpVar == null) {
                    r102.c();
                    return;
                }
                try {
                    r102.b(smpVar.a);
                    return;
                } catch (RuntimeException e4) {
                    r102.c();
                    throw e4;
                }
            case 8:
                SignInResponse signInResponse = (SignInResponse) this.b;
                ConnectionResult connectionResult = signInResponse.b;
                boolean zC = connectionResult.c();
                Object obj5 = this.a;
                if (zC) {
                    ResolveAccountResponse resolveAccountResponse = signInResponse.c;
                    spu.aw(resolveAccountResponse);
                    ConnectionResult connectionResult2 = resolveAccountResponse.c;
                    if (!connectionResult2.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(String.valueOf(connectionResult2))), new Exception());
                        smz smzVar = (smz) obj5;
                        smzVar.f.b(connectionResult2);
                        smzVar.e.y();
                        return;
                    }
                    smz smzVar2 = (smz) obj5;
                    smg smgVar = smzVar2.f;
                    soh sohVarA = resolveAccountResponse.a();
                    Set set = smzVar2.c;
                    if (sohVarA == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        smgVar.b(new ConnectionResult(1, 4, null, null, null));
                    } else {
                        smgVar.f = sohVarA;
                        smgVar.c = set;
                        smgVar.c();
                    }
                } else {
                    ((smz) obj5).f.b(connectionResult);
                }
                ((smz) obj5).e.y();
                return;
            case 9:
                ((Activity) ((rjg) this.b).a).startActivity((Intent) this.a);
                return;
            case 10:
                ((Activity) this.a).startActivityForResult((Intent) this.b, 123);
                return;
            case 11:
                Object obj6 = this.b;
                boolean z = ((swe) obj6).c;
                Object obj7 = this.a;
                if (z) {
                    ((svn) obj7).b.r();
                    return;
                }
                try {
                    ((svn) this.a).b.p(((svn) obj7).a.a((svz) obj6));
                    return;
                } catch (svx e5) {
                    boolean z2 = e5.getCause() instanceof Exception;
                    Object obj8 = this.a;
                    if (z2) {
                        ((svn) obj8).b.o((Exception) e5.getCause());
                        return;
                    } else {
                        ((svn) obj8).b.o(e5);
                        return;
                    }
                } catch (Exception e6) {
                    ((svn) this.a).b.o(e6);
                    return;
                }
            case 12:
                try {
                    svz svzVarA = ((svw) this.a).a.a(((svz) this.b).e());
                    ?? r103 = this.a;
                    Executor executor = swd.b;
                    svzVarA.l(executor, r103);
                    svzVarA.k(executor, r103);
                    svzVarA.h(executor, r103);
                    return;
                } catch (CancellationException unused) {
                    ((svw) this.a).b();
                    return;
                } catch (svx e7) {
                    boolean z3 = e7.getCause() instanceof Exception;
                    Object obj9 = this.a;
                    if (z3) {
                        ((svw) obj9).d((Exception) e7.getCause());
                        return;
                    } else {
                        ((svw) obj9).d(e7);
                        return;
                    }
                } catch (Exception e8) {
                    ((svw) this.a).d(e8);
                    return;
                }
            case 13:
                this.b.a((SupportedVersionInfo) this.a);
                return;
            case 14:
                ((tnq) this.a).j((String) this.b);
                return;
            case 15:
                ?? r0 = this.a;
                Object obj10 = this.b;
                synchronized (obj10) {
                    ((tvr) obj10).i = r0;
                    ((tvr) obj10).y();
                }
                ((tvl) obj10).n(new shd(obj10, 17));
                return;
            case 16:
                ((roa) this.a).g(this.b);
                return;
            case 17:
                this.b.c((too) this.a);
                return;
            case 18:
                ((tvl) this.b).o((tqd) this.a);
                return;
            case 19:
                this.b.d((too) this.a);
                return;
            default:
                txu txuVar = (txu) this.a;
                if (!txuVar.A()) {
                    txuVar.V.e();
                }
                this.b.run();
                return;
        }
    }

    public /* synthetic */ sbj(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public sbj(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public sbj(sme smeVar, Bundle bundle, int i) {
        this.c = i;
        this.a = bundle;
        this.b = smeVar;
    }
}
