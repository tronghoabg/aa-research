package A5;

import E5.T;
import J8.AbstractC0640o;
import J9.C0647f;
import J9.C0656o;
import J9.G;
import J9.S;
import J9.V;
import L8.t;
import N1.C0765n;
import Pc.C0800p;
import Va.M6;
import W9.AbstractServiceC1236g;
import a.AbstractC1304a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import f6.C2608u;
import f6.C2613z;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import k2.H;
import m9.B;
import uc.C4271h;
import vf.AbstractC4345a;
import x.C4412e;
import z9.EnumC4624C;
import z9.EnumC4625D;
import z9.InterfaceC4626E;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements k, FirebaseInAppMessagingDisplay, u6.h, u6.g, L8.e, Le.a, Le.c, OnSuccessListener, O9.a, OnCompleteListener, Q1.h, Q1.g, OnFailureListener, Continuation, SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f362c;

    public /* synthetic */ h(int i5, Object obj, Object obj2) {
        this.f360a = i5;
        this.f361b = obj;
        this.f362c = obj2;
    }

    private final Object c(Task task) {
        W9.i iVar = (W9.i) this.f361b;
        String str = (String) this.f362c;
        synchronized (iVar) {
            ((C4412e) iVar.f15344b).remove(str);
        }
        return task;
    }

    /* JADX WARN: Removed duplicated region for block: B:307:0x057e A[PHI: r8
  0x057e: PHI (r8v22 int) = (r8v19 int), (r8v21 int), (r8v20 int), (r8v20 int) binds: [B:306:0x057c, B:330:0x05b9, B:314:0x058b, B:315:0x058d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // u6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r24, u6.C4260e r25) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A5.h.a(java.lang.Object, u6.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0415 A[Catch: all -> 0x049c, TryCatch #11 {all -> 0x049c, blocks: (B:106:0x040f, B:108:0x0415, B:110:0x0425, B:111:0x0431), top: B:135:0x040f }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x044f  */
    @Override // A5.k, k8.InterfaceC3199h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A5.h.apply(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    @Override // Q1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.Object r25, N1.C0763l r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A5.h.b(java.lang.Object, N1.l):void");
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public void displayMessage(N9.h hVar, InterfaceC4626E interfaceC4626E) {
        B9.f fVar = (B9.f) this.f361b;
        if (fVar.f1636j != null || fVar.f1627a.f48418e) {
            D9.e.a("Active FIAM exists. Skipping trigger");
            return;
        }
        fVar.f1636j = hVar;
        fVar.k = interfaceC4626E;
        fVar.f((Activity) this.f362c);
    }

    @Override // O9.a
    public void f(O9.b bVar) {
        ((O9.a) this.f361b).f(bVar);
        ((O9.a) this.f362c).f(bVar);
    }

    @Override // u6.g
    public void invoke(Object obj) {
        switch (this.f360a) {
            case 3:
                F5.j jVar = (F5.j) obj;
                jVar.getClass();
                F5.a aVar = (F5.a) this.f361b;
                C2613z c2613z = aVar.f3876d;
                if (c2613z != null) {
                    C2608u c2608u = (C2608u) this.f362c;
                    T t10 = c2608u.f35109c;
                    t10.getClass();
                    c2613z.getClass();
                    boolean z2 = false;
                    S3.e eVar = new S3.e(t10, z2, jVar.f3917b.c(aVar.f3874b, c2613z), 5);
                    int i5 = c2608u.f35108b;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            jVar.f3930p = eVar;
                            break;
                        } else if (i5 != 2) {
                            if (i5 == 3) {
                                jVar.f3931q = eVar;
                                break;
                            }
                        }
                    }
                    jVar.f3929o = eVar;
                    break;
                }
                break;
            default:
                V1.i iVar = (V1.i) obj;
                iVar.getClass();
                V1.a aVar2 = (V1.a) this.f361b;
                H h10 = aVar2.f12890d;
                if (h10 != null) {
                    h2.g gVar = (h2.g) this.f362c;
                    C0765n c0765n = (C0765n) gVar.f36024f;
                    c0765n.getClass();
                    h10.getClass();
                    E4.n nVar = new E4.n(iVar.f12926b.d(aVar2.f12888b, h10), gVar.f36021c, 4, c0765n);
                    int i10 = gVar.f36020b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            iVar.f12939p = nVar;
                            break;
                        } else if (i10 != 2) {
                            if (i10 == 3) {
                                iVar.f12940q = nVar;
                                break;
                            }
                        }
                    }
                    iVar.f12938o = nVar;
                    break;
                }
                break;
        }
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        String strValueOf;
        switch (this.f360a) {
            case 4:
                return new G8.d((s8.g) lVar.a(s8.g.class), (Executor) lVar.b((t) this.f361b), (Executor) lVar.b((t) this.f362c));
            default:
                Context context = (Context) lVar.a(Context.class);
                switch (((B) this.f362c).f40407a) {
                    case 19:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = "";
                            break;
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                    case 20:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        } else {
                            strValueOf = "";
                            break;
                        }
                        break;
                    case 21:
                        int i5 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i5 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        strValueOf = "embedded";
                                        break;
                                    } else {
                                        strValueOf = "";
                                        break;
                                    }
                                } else {
                                    strValueOf = "auto";
                                    break;
                                }
                            } else {
                                strValueOf = "watch";
                                break;
                            }
                        } else {
                            strValueOf = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = "";
                            break;
                        } else {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                }
                return new Y9.a((String) this.f361b, strValueOf);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f360a) {
            case 17:
                ((Oc.b) this.f361b).getClass();
                boolean zIsSuccessful = task.isSuccessful();
                tc.g gVar = (tc.g) this.f362c;
                if (!zIsSuccessful) {
                    Exception exception = task.getException();
                    String message = exception != null ? exception.getMessage() : null;
                    HashMap mapL = AbstractC1593a.l("code", "unknown");
                    if (exception != null) {
                        mapL.put(PglCryptUtils.KEY_MESSAGE, exception.getMessage());
                    } else {
                        mapL.put(PglCryptUtils.KEY_MESSAGE, "An unknown error has occurred.");
                    }
                    gVar.b("firebase_app_check", message, mapL);
                    break;
                } else {
                    gVar.a(task.getResult());
                    break;
                }
            case 18:
                boolean zIsSuccessful2 = task.isSuccessful();
                C0800p c0800p = (C0800p) this.f361b;
                if (!zIsSuccessful2) {
                    c0800p.b(AbstractC1304a.G(task.getException()));
                    break;
                } else {
                    c0800p.a(com.moloco.sdk.internal.publisher.H.j0((AbstractC0640o) this.f362c));
                    break;
                }
            case 23:
                ((AbstractServiceC1236g) this.f361b).a((Intent) this.f362c);
                break;
            default:
                ((Yc.f) this.f361b).getClass();
                boolean zIsSuccessful3 = task.isSuccessful();
                tc.g gVar2 = (tc.g) this.f362c;
                if (!zIsSuccessful3) {
                    Exception exception2 = task.getException();
                    String message2 = exception2 != null ? exception2.getMessage() : null;
                    HashMap mapL2 = AbstractC1593a.l("code", "unknown");
                    if (exception2 != null) {
                        mapL2.put(PglCryptUtils.KEY_MESSAGE, exception2.getMessage());
                    } else {
                        mapL2.put(PglCryptUtils.KEY_MESSAGE, "An unknown error has occurred.");
                    }
                    gVar2.b("firebase_messaging", message2, mapL2);
                    break;
                } else {
                    gVar2.a(task.getResult());
                    break;
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Vc.d dVar = (Vc.d) this.f361b;
        dVar.getClass();
        HashMap mapN = AbstractC4345a.n(exc);
        ((C4271h) this.f362c).c("firebase_firestore", exc.getMessage(), mapN);
        dVar.onCancel(null);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        List<Ca.b> list;
        Ka.c cVar = (Ka.c) this.f361b;
        tc.g gVar = (tc.g) this.f362c;
        Ca.f fVar = (Ca.f) obj;
        cVar.getClass();
        HashMap map = new HashMap();
        map.put("text", fVar.f1976b);
        ArrayList arrayList = new ArrayList();
        Iterator it = DesugarCollections.unmodifiableList(fVar.f1975a).iterator();
        while (it.hasNext()) {
            Ca.e eVar = (Ca.e) it.next();
            HashMap map2 = new HashMap();
            Ka.c.a(map2, eVar.p(), (Rect) eVar.f1972c, (Point[]) eVar.f1973d, (String) eVar.f1971b, null, null);
            ArrayList arrayList2 = new ArrayList();
            synchronized (eVar) {
                list = eVar.f1974e;
            }
            for (Ca.b bVar : list) {
                HashMap map3 = new HashMap();
                Ka.c.a(map3, bVar.p(), (Rect) bVar.f1972c, (Point[]) bVar.f1973d, (String) bVar.f1971b, Float.valueOf(bVar.f1966f), Float.valueOf(bVar.f1967g));
                ArrayList arrayList3 = new ArrayList();
                for (Ca.a aVar : bVar.q()) {
                    HashMap map4 = new HashMap();
                    Ka.c.a(map4, aVar.p(), (Rect) aVar.f1972c, (Point[]) aVar.f1973d, (String) aVar.f1971b, Float.valueOf(aVar.f1963f), Float.valueOf(aVar.f1964g));
                    ArrayList arrayList4 = new ArrayList();
                    for (Ca.c cVar2 : aVar.q()) {
                        HashMap map5 = new HashMap();
                        Ka.c.a(map5, cVar2.p(), (Rect) cVar2.f1972c, (Point[]) cVar2.f1973d, (String) cVar2.f1971b, Float.valueOf(cVar2.f1968e), Float.valueOf(cVar2.f1969f));
                        arrayList4.add(map5);
                        it = it;
                    }
                    map4.put("symbols", arrayList4);
                    arrayList3.add(map4);
                    it = it;
                }
                map3.put("elements", arrayList3);
                arrayList2.add(map3);
            }
            map2.put("lines", arrayList2);
            arrayList.add(map2);
        }
        map.put("blocks", arrayList);
        gVar.a(map);
    }

    @Override // Le.a
    public void run() {
        switch (this.f360a) {
            case 5:
                ((C0647f) this.f361b).f5929d = (ta.o) this.f362c;
                return;
            case 6:
                C0656o c0656o = (C0656o) this.f361b;
                G g9 = (G) c0656o.f5967g;
                g9.getClass();
                N9.h hVar = (N9.h) c0656o.f5969i;
                if (!hVar.f8623b.f3290b) {
                    ((P9.c) g9.f5879c).d().addOnSuccessListener(g9.f5883g, new g(g9, hVar, (EnumC4625D) this.f362c, 3));
                }
                Iterator it = g9.f5882f.f5941d.values().iterator();
                if (it.hasNext()) {
                    throw M6.j(it);
                }
                return;
            case 7:
                C0656o c0656o2 = (C0656o) this.f361b;
                G g10 = (G) c0656o2.f5967g;
                g10.getClass();
                N9.h hVar2 = (N9.h) c0656o2.f5969i;
                if (!hVar2.f8623b.f3290b) {
                    ((P9.c) g10.f5879c).d().addOnSuccessListener(g10.f5883g, new g(g10, hVar2, (EnumC4624C) this.f362c, 4));
                    g10.c(hVar2, "fiam_dismiss", false);
                }
                Iterator it2 = g10.f5882f.f5940c.values().iterator();
                if (it2.hasNext()) {
                    throw M6.j(it2);
                }
                return;
            default:
                V v2 = (V) this.f361b;
                v2.getClass();
                v2.f5902c = He.g.a((S) this.f362c);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        aa.c cVar = (aa.c) this.f361b;
        aa.e eVar = (aa.e) this.f362c;
        synchronized (cVar) {
            cVar.f17414c = Tasks.forResult(eVar);
        }
        return Tasks.forResult(eVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f360a) {
            case 24:
                c(task);
                return task;
            default:
                aa.h hVar = (aa.h) this.f361b;
                Date date = (Date) this.f362c;
                hVar.getClass();
                if (task.isSuccessful()) {
                    aa.k kVar = hVar.f17443g;
                    synchronized (kVar.f17455b) {
                        kVar.f17454a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                    }
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        if (exception instanceof Z9.g) {
                            hVar.f17443g.g();
                        } else {
                            hVar.f17443g.f();
                        }
                    }
                }
                return task;
        }
    }
}
