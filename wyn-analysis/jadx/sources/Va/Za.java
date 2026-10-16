package Va;

import K8.C0690b;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import f6.C2603p;
import f6.C2608u;
import f6.C2613z;
import f6.InterfaceC2574D;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kb.InterfaceC3287c;
import r9.InterfaceC3940A;
import r9.InterfaceC3945b;
import r9.InterfaceC3949f;

/* loaded from: classes4.dex */
public final class Za implements InterfaceC2574D, I5.g, Continuation, T6.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n, InterfaceC3287c {

    /* renamed from: e, reason: collision with root package name */
    public static Za f13914e;

    /* renamed from: a, reason: collision with root package name */
    public Object f13915a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13916b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13917c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13918d;

    public /* synthetic */ Za(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f13915a = obj;
        this.f13916b = obj2;
        this.f13917c = obj3;
        this.f13918d = obj4;
    }

    public static void l(Za za2, View view) {
        synchronized (za2) {
            Iterator it = ((ArrayList) za2.f13917c).iterator();
            while (it.hasNext()) {
                ((InterfaceC0987gb) it.next()).c(view);
            }
        }
    }

    public static synchronized Za n() {
        try {
            if (f13914e == null) {
                Za za2 = new Za();
                za2.f13915a = new ArrayList();
                za2.f13917c = new ArrayList();
                za2.f13916b = new ArrayList();
                Ya ya2 = new Ya();
                ya2.f13882a = za2;
                za2.f13918d = ya2;
                f13914e = za2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13914e;
    }

    @Override // f6.InterfaceC2574D
    public void A(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u) {
        if (i(i5, c2613z)) {
            ((I5.f) this.f13916b).c(c2603p, c2608u);
        }
    }

    @Override // f6.InterfaceC2574D
    public void C(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u) {
        if (i(i5, c2613z)) {
            ((I5.f) this.f13916b).d(c2603p, c2608u);
        }
    }

    @Override // f6.InterfaceC2574D
    public void D(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u) {
        if (i(i5, c2613z)) {
            ((I5.f) this.f13916b).f(c2603p, c2608u);
        }
    }

    @Override // f6.InterfaceC2574D
    public void H(int i5, C2613z c2613z, C2608u c2608u) {
        if (i(i5, c2613z)) {
            ((I5.f) this.f13916b).b(c2608u);
        }
    }

    @Override // kb.InterfaceC3287c
    public void a(HashMap map, String str) {
        this.f13916b = "sqlite_error";
        this.f13917c = str;
        this.f13918d = map;
    }

    @Override // kb.InterfaceC3287c
    public void b(Serializable serializable) {
        this.f13915a = serializable;
    }

    @Override // T6.h
    public Object c(IBinder iBinder) throws RemoteException, IOException {
        Bundle bundleZze = zze.zzb(iBinder).zze((Account) this.f13915a, (String) this.f13916b, (Bundle) this.f13917c);
        if (bundleZze != null) {
            return T6.d.a((Context) this.f13918d, bundleZze);
        }
        throw new IOException("Service call returned null");
    }

    public HashMap d(Map map, Map map2, Set set) {
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (s9.k kVar : map.values()) {
            t9.d dVar = (t9.d) map2.get(kVar.f45380a);
            s9.h hVar = kVar.f45380a;
            if (set.contains(hVar) && (dVar == null || (dVar.f45946b instanceof t9.l))) {
                map3.put(hVar, kVar);
            } else if (dVar != null) {
                t9.h hVar2 = dVar.f45946b;
                map4.put(hVar, hVar2.d());
                hVar2.a(kVar, hVar2.d(), new s8.q(new Date()));
            } else {
                map4.put(hVar, t9.f.f45947b);
            }
        }
        map4.putAll(k(map3));
        HashMap map5 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            s9.h hVar3 = (s9.h) entry.getKey();
            s9.k kVar2 = (s9.k) entry.getValue();
            t9.f fVar = (t9.f) map4.get(entry.getKey());
            r9.x xVar = new r9.x();
            xVar.f44677a = kVar2;
            xVar.f44678b = fVar;
            map5.put(hVar3, xVar);
        }
        return map5;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public void destroy() {
        Integer num = (Integer) this.f13915a;
        if (num != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Z.f30049a.remove(Integer.valueOf(num.intValue()));
        }
        kotlin.jvm.internal.G g9 = (kotlin.jvm.internal.G) this.f13916b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w wVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w) g9.f39740a;
        if (wVar != null) {
            wVar.destroy();
        }
        g9.f39740a = null;
        kotlin.jvm.internal.G g10 = (kotlin.jvm.internal.G) this.f13917c;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 t0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0) g10.f39740a;
        if (t0Var != null) {
            t0Var.destroy();
        }
        g10.f39740a = null;
        kotlin.jvm.internal.G g11 = (kotlin.jvm.internal.G) this.f13918d;
        Ef.E e7 = (Ef.E) g11.f39740a;
        if (e7 != null) {
            Ef.H.j(e7, null);
        }
        g11.f39740a = null;
    }

    public c9.c e(Iterable iterable) {
        return h(((InterfaceC3940A) this.f13915a).y(iterable), new HashSet());
    }

    public c9.c f(p9.u uVar, s9.b bVar, R1.i iVar) {
        HashMap mapH = ((InterfaceC3945b) this.f13917c).h(uVar.f43415f, bVar.f45364c);
        HashMap mapC = ((InterfaceC3940A) this.f13915a).C(uVar, bVar, mapH.keySet(), iVar);
        for (Map.Entry entry : mapH.entrySet()) {
            if (!mapC.containsKey(entry.getKey())) {
                mapC.put((s9.h) entry.getKey(), s9.k.g((s9.h) entry.getKey()));
            }
        }
        c9.c cVarG = s9.g.f45372a;
        for (Map.Entry entry2 : mapC.entrySet()) {
            t9.d dVar = (t9.d) mapH.get(entry2.getKey());
            if (dVar != null) {
                dVar.f45946b.a((s9.k) entry2.getValue(), t9.f.f45947b, new s8.q(new Date()));
            }
            if (uVar.g((s9.k) entry2.getValue())) {
                cVarG = cVarG.g((s9.h) entry2.getKey(), (s9.k) entry2.getValue());
            }
        }
        return cVarG;
    }

    public c9.c g(p9.u uVar, s9.b bVar, R1.i iVar) {
        boolean zE = uVar.e();
        s9.m mVar = uVar.f43415f;
        if (zE) {
            c9.b bVar2 = s9.g.f45372a;
            s9.h hVar = new s9.h(mVar);
            t9.d dVarE = ((InterfaceC3945b) this.f13917c).e(hVar);
            s9.k kVarB = (dVarE == null || (dVarE.f45946b instanceof t9.l)) ? ((InterfaceC3940A) this.f13915a).B(hVar) : s9.k.g(hVar);
            if (dVarE != null) {
                dVarE.f45946b.a(kVarB, t9.f.f45947b, new s8.q(new Date()));
            }
            return kVarB.d() ? bVar2.g(kVarB.f45380a, kVarB) : bVar2;
        }
        String str = uVar.f43416g;
        if (str == null) {
            return f(uVar, bVar, iVar);
        }
        A6.c.z(mVar.h(), "Currently we only support collection group queries at the root.", new Object[0]);
        c9.c cVarG = s9.g.f45372a;
        Iterator it = ((InterfaceC3949f) this.f13918d).t(str).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : f(new p9.u((s9.m) ((s9.m) it.next()).a(str), null, uVar.f43414e, uVar.f43410a, uVar.f43417h, uVar.f43418i, uVar.f43419j, uVar.k), bVar, iVar)) {
                cVarG = cVarG.g((s9.h) entry.getKey(), (s9.k) entry.getValue());
            }
        }
        return cVarG;
    }

    public c9.c h(Map map, HashSet hashSet) {
        HashMap map2 = new HashMap();
        j(map2, map.keySet());
        c9.c cVarG = s9.g.f45372a;
        for (Map.Entry entry : d(map, map2, hashSet).entrySet()) {
            cVarG = cVarG.g((s9.h) entry.getKey(), ((r9.x) entry.getValue()).f44677a);
        }
        return cVarG;
    }

    public boolean i(int i5, C2613z c2613z) {
        E5.m0 m0Var = (E5.m0) this.f13915a;
        C2613z c2613zB = null;
        if (c2613z != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= m0Var.f3465c.size()) {
                    break;
                }
                if (((C2613z) m0Var.f3465c.get(i10)).f35115d == c2613z.f35115d) {
                    c2613zB = c2613z.b(Pair.create(m0Var.f3464b, c2613z.f35112a));
                    break;
                }
                i10++;
            }
            if (c2613zB == null) {
                return false;
            }
        }
        int i11 = i5 + m0Var.f3466d;
        I5.f fVar = (I5.f) this.f13916b;
        int i12 = fVar.f5392a;
        E5.n0 n0Var = (E5.n0) this.f13918d;
        if (i12 != i11 || !u6.v.a(fVar.f5393b, c2613zB)) {
            this.f13916b = new I5.f(((I5.f) n0Var.f3480j).f5394c, i11, c2613zB);
        }
        I5.f fVar2 = (I5.f) this.f13917c;
        if (fVar2.f5392a == i11 && u6.v.a(fVar2.f5393b, c2613zB)) {
            return true;
        }
        this.f13917c = new I5.f(((I5.f) n0Var.k).f5394c, i11, c2613zB);
        return true;
    }

    public void j(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            s9.h hVar = (s9.h) it.next();
            if (!map.containsKey(hVar)) {
                treeSet.add(hVar);
            }
        }
        map.putAll(((InterfaceC3945b) this.f13917c).d(treeSet));
    }

    public HashMap k(Map map) {
        ArrayList arrayListG = ((r9.v) this.f13916b).g(map.keySet());
        HashMap map2 = new HashMap();
        TreeMap treeMap = new TreeMap();
        Iterator it = arrayListG.iterator();
        while (it.hasNext()) {
            t9.i iVar = (t9.i) it.next();
            Iterator it2 = iVar.b().iterator();
            while (it2.hasNext()) {
                s9.h hVar = (s9.h) it2.next();
                s9.k kVar = (s9.k) map.get(hVar);
                if (kVar != null) {
                    map2.put(hVar, iVar.a(kVar, map2.containsKey(hVar) ? (t9.f) map2.get(hVar) : t9.f.f45947b));
                    int i5 = iVar.f45954a;
                    if (!treeMap.containsKey(Integer.valueOf(i5))) {
                        treeMap.put(Integer.valueOf(i5), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(i5))).add(hVar);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap map3 = new HashMap();
            for (s9.h hVar2 : (Set) entry.getValue()) {
                if (!hashSet.contains(hVar2)) {
                    t9.h hVarC = t9.h.c((s9.k) map.get(hVar2), (t9.f) map2.get(hVar2));
                    if (hVarC != null) {
                        map3.put(hVar2, hVarC);
                    }
                    hashSet.add(hVar2);
                }
            }
            ((InterfaceC3945b) this.f13917c).g(((Integer) entry.getKey()).intValue(), map3);
        }
        return map2;
    }

    public void m(InterfaceC0987gb interfaceC0987gb) {
        synchronized (this) {
            try {
                ((ArrayList) this.f13917c).remove(interfaceC0987gb);
                if (((ArrayList) this.f13917c).size() == 0) {
                    Cb.j(new Ta(Xa.g(), (Ya) this.f13918d, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f6.InterfaceC2574D
    public void o(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u, IOException iOException, boolean z2) {
        if (i(i5, c2613z)) {
            ((I5.f) this.f13916b).e(c2603p, c2608u, iOException, z2);
        }
    }

    public void p(InterfaceC0987gb interfaceC0987gb) {
        synchronized (this) {
            ((ArrayList) this.f13917c).add(interfaceC0987gb);
        }
        Cb.j(new Ta(Xa.g(), (Ya) this.f13918d, 0));
        C1206y c1206y = new C1206y(20);
        c1206y.f14799e = this;
        c1206y.f14798d = interfaceC0987gb;
        Cb.g(c1206y);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f13915a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f13916b;
        String str = (String) this.f13917c;
        C0690b c0690b = (C0690b) this.f13918d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        AbstractC1732v.i(exception);
        if (!zzadg.zzd(exception)) {
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exception.getMessage());
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        if (firebaseAuth.n() == null) {
            C6.l lVar = new C6.l(firebaseAuth.f27283a, firebaseAuth);
            synchronized (firebaseAuth) {
                firebaseAuth.f27293l = lVar;
            }
        }
        C6.l lVarN = firebaseAuth.n();
        return lVarN.H(str, Boolean.FALSE, recaptchaAction).continueWithTask(c0690b).continueWithTask(new W9.u(str, lVarN, recaptchaAction, c0690b));
    }
}
