package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class rjs {
    public final Object a;
    public final Object b;

    public rjs(short[] sArr) {
        this.b = new ArrayList(200);
        this.a = new ArrayList(4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ackk, java.lang.Object] */
    public final tuy a() {
        ?? r0 = this.a;
        if (r0 == 0) {
            return null;
        }
        return (tuy) r0.a();
    }

    public final Bitmap b(String str) {
        return (Bitmap) ((ConcurrentHashMap) this.b).get(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final String c(abgx abgxVar) {
        return (String) this.b.get(abgxVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean d() {
        return !this.a.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sxz e(List list) throws RemoteException {
        sxv sxvVar;
        sxw sxwVar;
        sxy sxyVar;
        sxz sxzVar = new sxz();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                sxvVar = (sxv) ((zgp) it.next()).get();
                Object obj = this.a;
                if (obj != null) {
                    try {
                        sxy sxyVar2 = sxvVar.c;
                        if (sxyVar2 == null || (sxwVar = sxvVar.b) == null) {
                            Log.e("AppDoctor", "Null CompletionResult from Fixer.");
                        } else {
                            qnl qnlVar = sxwVar.c;
                            int i = sxyVar2.a(qnlVar).b;
                            Object obj2 = ((whk) obj).b;
                            if (i == 5) {
                                String str = sxwVar.b;
                                Bundle bundleA = ((sxq) obj2).a();
                                bundleA.putString("com.google.android.gms.common.appdoctor.uuid", str);
                                ((sxq) obj2).b.call("mark_fix_completed", null, bundleA);
                            } else {
                                sxyVar2.a(qnlVar);
                                String str2 = sxwVar.b;
                                Bundle bundleA2 = ((sxq) obj2).a();
                                bundleA2.putString("com.google.android.gms.common.appdoctor.uuid", str2);
                                ((sxq) obj2).b.call("mark_fix_attempted", null, bundleA2);
                            }
                        }
                    } catch (RemoteException unused) {
                        Object obj3 = ((whk) obj).a;
                        Object obj4 = ((whk) obj).c;
                        abnp abnpVarN = qoa.a.n();
                        sxw sxwVar2 = sxvVar.b;
                        qnl qnlVar2 = sxwVar2.c;
                        abnpVarN.t();
                        ((qoa) abnpVarN.b).b = qnlVar2.a();
                        String str3 = sxwVar2.b;
                        abnpVarN.t();
                        qoa qoaVar = (qoa) abnpVarN.b;
                        str3.getClass();
                        qoaVar.d = str3;
                        ((rju) obj4).m(((sxy) obj3).b, (qoa) abnpVarN.q(), ((sxy) obj3).a);
                    }
                }
                sxzVar.a |= sxvVar.b();
                sxzVar.b |= sxvVar.a();
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                Log.e("AppDoctorFixerFramework", "applyFixes future failed", e);
                Thread.currentThread().interrupt();
            }
            if (sxvVar.a() && (sxyVar = sxvVar.c) != null) {
                Context context = sxyVar.b;
                synchronized (syc.class) {
                    Thread thread = syc.a;
                    if (thread != null) {
                        thread.interrupt();
                    }
                    if (syc.b != null) {
                        Log.d("AppDoctorRestartUtil", "A restart app timeout thread already started.");
                        syc.b.getClass();
                    } else {
                        Thread thread2 = new Thread(new shd(context.getApplicationContext(), 6));
                        thread2.start();
                        syc.a = thread2;
                        syc.b = thread2;
                    }
                }
            } else if (sxvVar.b()) {
                synchronized (syc.class) {
                    Thread thread3 = syc.a;
                    if (thread3 == null || !thread3.isAlive()) {
                        Thread thread4 = new Thread(new oyx(9));
                        thread4.start();
                        syc.a = thread4;
                    } else {
                        Log.d("AppDoctorRestartUtil", "A restart process timeout thread already started.");
                        syc.a.getClass();
                    }
                }
            } else {
                continue;
            }
        }
        return sxzVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void f(sxw sxwVar) {
        ?? r2 = this.b;
        woy.aa(!r2.contains(sxwVar), "The same fixer cannot be added twice");
        r2.add(sxwVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @ResultIgnorabilityUnspecified
    public final admq g(sxy sxyVar) throws Throwable {
        zgp zgpVarAW;
        sxz sxzVarE;
        zgp zgpVarAW2;
        boolean z;
        rjs rjsVar = this;
        sxz sxzVar = new sxz();
        try {
            yfq<sxw> yfqVarO = yfq.o(rjsVar.b);
            ArrayList arrayList = new ArrayList(yfqVarO.size());
            try {
                Iterator<E> it = yfqVarO.iterator();
                while (it.hasNext()) {
                    if (((sxw) it.next()).a(sxyVar)) {
                        Context context = sxyVar.b;
                        rjg rjgVar = new rjg(context);
                        boolean z2 = false;
                        boolean z3 = false;
                        for (sxw sxwVar : yfqVarO) {
                            sxx sxxVar = new sxx(sxyVar);
                            sxxVar.g = sxwVar;
                            sxy sxyVarA = sxxVar.a();
                            if (sxwVar.a(sxyVarA)) {
                                sxx sxxVar2 = new sxx(sxyVarA);
                                sxt sxtVar = sxwVar.e;
                                sxxVar2.b(new sxu(sxtVar.a, 3));
                                sxy sxyVarA2 = sxxVar2.a();
                                sxwVar.c(sxyVarA2, sxtVar, rjgVar);
                                zgpVarAW2 = sxwVar.f ? roc.aW(new sxp(sxwVar, sxyVarA2, rjgVar, 2)) : wub.Y(sxwVar.b(sxyVarA2, rjgVar, sxtVar));
                                z = true;
                            } else {
                                zgpVarAW2 = wub.Y(sxv.a);
                                z = false;
                            }
                            z3 |= z;
                            z2 |= !zgpVarAW2.isDone();
                            arrayList.add(zgpVarAW2);
                        }
                        if (z2) {
                            sxz sxzVar2 = new sxz();
                            try {
                                zgpVarAW = roc.aW(Executors.callable(new saq(rjsVar, sxzVar, (List) arrayList, sxyVar, 2)));
                                sxzVarE = sxzVar2;
                            } catch (Throwable th) {
                                th = th;
                                sxzVar = sxzVar2;
                                if (sxzVar.b()) {
                                    sxzVar.a(sxyVar.b);
                                }
                                throw th;
                            }
                        } else {
                            zgpVarAW = wub.Y(null);
                            sxzVarE = rjsVar.e(arrayList);
                        }
                        admq admqVar = new admq(z3, zgpVarAW);
                        if (sxzVarE.b()) {
                            sxzVarE.a(context);
                        }
                        return admqVar;
                    }
                    rjsVar = this;
                }
                admq admqVar2 = new admq(false, wub.Y(null));
                if (sxzVar.b()) {
                    sxzVar.a(sxyVar.b);
                }
                return admqVar2;
            } catch (RuntimeException e) {
                roc.aV(e, sxyVar, "AppDoctorFixerFramework");
                admq admqVar3 = new admq(false, (zgp) new zhc(e));
                if (sxzVar.b()) {
                    sxzVar.a(sxyVar.b);
                }
                return admqVar3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public rjs(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public rjs(uvg uvgVar, usy usyVar) {
        this.a = uvgVar;
        this.b = usyVar;
    }

    public rjs(byte[] bArr, byte[] bArr2) {
        this.a = "p";
        this.b = "q";
    }

    public rjs(char[] cArr) {
        this.a = "e";
        this.b = "f";
    }

    public rjs(char[] cArr, byte[] bArr) {
        this.a = "c";
        this.b = "d";
    }

    public rjs(rka rkaVar) {
        this.b = new rox(new rcn(8));
        this.a = rkaVar;
    }

    public rjs(ackk ackkVar, tmo tmoVar) {
        this.a = ackkVar;
        this.b = tmoVar;
    }

    public rjs(whk whkVar) {
        this.b = new ArrayList();
        this.a = whkVar;
    }

    public rjs(byte[] bArr) {
        this.b = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
    }

    public rjs() {
        this.a = new AtomicLong();
        this.b = new ConcurrentHashMap();
    }
}
