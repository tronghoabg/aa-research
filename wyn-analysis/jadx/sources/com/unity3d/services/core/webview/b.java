package com.unity3d.services.core.webview;

import A.W;
import C8.c;
import C8.f;
import Ef.L;
import Fe.e;
import K8.InterfaceC0689a;
import N0.j;
import N0.k;
import N1.C0765n;
import Pc.C0799o;
import Va.M6;
import ac.C1346a;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.webkit.WebStorage;
import androidx.credentials.playservices.HiddenActivity;
import ba.C1521a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import d2.u;
import d2.v;
import dd.C2428g;
import dd.InterfaceC2422a;
import ea.C2482F;
import ea.C2483G;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import k1.C3117d;
import k1.InterfaceC3116c;
import k1.S;
import k1.r;
import k1.v0;
import kd.C3305a;
import kd.C3308d;
import kd.C3312h;
import kd.C3313i;
import kd.C3318n;
import kd.C3319o;
import kd.C3323t;
import kd.EnumC3301L;
import kotlin.jvm.internal.AbstractC3340k;
import ld.InterfaceC3461c;
import m1.g;
import m9.C3514m;
import m9.C3516o;
import m9.Y;
import m9.d0;
import n9.C3606a;
import n9.C3607b;
import n9.C3608c;
import n9.C3609d;
import na.m;
import o1.C3642d;
import p7.AbstractC3772b;
import p8.q;
import p9.C3779D;
import q5.InterfaceC3871f;
import r7.AbstractC3935e;
import uc.InterfaceC4265b;
import uc.InterfaceC4266c;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements r, u, k, InterfaceC2422a, InterfaceC3871f, jg.b, InterfaceC4266c, InterfaceC4265b, InterfaceC3461c, Continuation, O9.a, m, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32729b;

    public /* synthetic */ b(Object obj, int i5) {
        this.f32728a = i5;
        this.f32729b = obj;
    }

    private final void i(O9.b bVar) {
        C3607b c3607b = (C3607b) this.f32729b;
        synchronized (c3607b) {
            try {
                E8.a aVar = (E8.a) bVar.get();
                c3607b.f40945c = aVar;
                if (aVar != null) {
                    C3606a c3606a = c3607b.f40947e;
                    f fVar = (f) aVar;
                    ArrayList arrayList = fVar.f1920c;
                    arrayList.add(c3606a);
                    fVar.f1923f.a(fVar.f1921d.size() + arrayList.size());
                    if (fVar.b()) {
                        c3606a.a(c.a(fVar.f1929m));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d2.u
    public int a(Object obj) {
        d2.m mVar = (d2.m) obj;
        mVar.getClass();
        C0765n c0765n = (C0765n) this.f32729b;
        String str = c0765n.f8232n;
        String str2 = mVar.f33993b;
        return ((str2.equals(str) || str2.equals(v.b(c0765n))) && mVar.c(c0765n, false)) ? 1 : 0;
    }

    @Override // q5.InterfaceC3871f, k8.InterfaceC3199h
    public Object apply(Object obj) {
        C2482F c2482f = (C2482F) obj;
        ((a2.v) this.f32729b).getClass();
        String strJ = C2483G.f34461b.j(c2482f);
        AbstractC3340k.d(strJ, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        c2482f.getClass();
        Log.d("EventGDTLogger", "Session Event Type: SESSION_START");
        byte[] bytes = strJ.getBytes(Bf.a.f1670a);
        AbstractC3340k.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // N0.k
    public Object attachCompleter(j jVar) {
        L l10 = (L) this.f32729b;
        l10.invokeOnCompletion(new W(18, jVar, l10));
        return "Deferred.asListenableFuture";
    }

    @Override // ld.InterfaceC3461c
    public boolean b(View view) {
        int i5 = 0;
        while (true) {
            Class[] clsArr = (Class[]) this.f32729b;
            if (i5 >= clsArr.length) {
                return false;
            }
            if (clsArr[i5].isInstance(view)) {
                return true;
            }
            i5++;
        }
    }

    @Override // uc.InterfaceC4266c
    public void c(Object obj) {
        boolean z2 = obj instanceof List;
        long j8 = ((C3312h) this.f32729b).f39662a;
        if (!z2) {
            e.z(new C3305a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", ""));
            Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j8);
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            Object obj2 = list.get(0);
            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
            e.z(new C3305a((String) obj2, (String) obj3, (String) list.get(2)));
            Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j8);
        }
    }

    @Override // na.m
    public Object d() {
        Object obj = this.f32729b;
        switch (this.f32728a) {
            case 25:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(new Object[0]);
                } catch (IllegalAccessException e7) {
                    AbstractC3772b abstractC3772b = pa.c.f43447a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
                } catch (InstantiationException e10) {
                    throw new RuntimeException("Failed to invoke constructor '" + pa.c.b(constructor) + "' with no args", e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to invoke constructor '" + pa.c.b(constructor) + "' with no args", e11.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return na.r.f40999a.a(cls);
                } catch (Exception e12) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e12);
                }
        }
    }

    @Override // uc.InterfaceC4265b
    public void e(Object obj, C1521a c1521a) {
        List listD;
        List listD2;
        List listD3;
        int i5;
        List listD4;
        Object obj2 = this.f32729b;
        switch (this.f32728a) {
            case 14:
                C3319o c3319o = (C3319o) obj2;
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C3308d) c3319o.f39682a.f1941d).a(((Long) obj3).longValue(), new C3318n(c3319o));
                    listD = AbstractC3935e.C(null);
                } catch (Throwable th) {
                    if (th instanceof C3305a) {
                        C3305a c3305a = th;
                        listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                    } else {
                        listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                    }
                }
                c1521a.c(listD);
                return;
            case 15:
                C3313i c3313i = (C3313i) obj2;
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj4 = list.get(0);
                AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj4).longValue();
                Object obj5 = list.get(1);
                AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((C3308d) c3313i.f39663a.f1941d).a(jLongValue, new C3323t((String) obj5, c3313i));
                    listD2 = AbstractC3935e.C(null);
                } catch (Throwable th2) {
                    if (th2 instanceof C3305a) {
                        C3305a c3305a2 = th2;
                        listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                    } else {
                        listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                    }
                }
                c1521a.c(listD2);
                return;
            case 16:
                kd.r rVar = (kd.r) obj2;
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(0);
                AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.net.http.SslError");
                SslError sslError = (SslError) obj6;
                Object obj7 = list2.get(1);
                AbstractC3340k.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
                EnumC3301L enumC3301L = (EnumC3301L) obj7;
                try {
                    switch (enumC3301L.ordinal()) {
                        case 0:
                            i5 = 4;
                            break;
                        case 1:
                            i5 = 1;
                            break;
                        case 2:
                            i5 = 2;
                            break;
                        case 3:
                            i5 = 5;
                            break;
                        case 4:
                            i5 = 0;
                            break;
                        case 5:
                            i5 = 3;
                            break;
                        case 6:
                            rVar.f39692a.getClass();
                            throw new IllegalArgumentException(enumC3301L + " doesn't represent a native value.");
                        default:
                            i5 = -1;
                            break;
                    }
                    listD3 = AbstractC3935e.C(Boolean.valueOf(sslError.hasError(i5)));
                } catch (Throwable th3) {
                    if (th3 instanceof C3305a) {
                        C3305a c3305a3 = th3;
                        listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                    } else {
                        listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                    }
                }
                c1521a.c(listD3);
                return;
            default:
                C3319o c3319o2 = (C3319o) obj2;
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj8 = ((List) obj).get(0);
                AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C3308d) c3319o2.f39682a.f1941d).a(((Long) obj8).longValue(), WebStorage.getInstance());
                    listD4 = AbstractC3935e.C(null);
                } catch (Throwable th4) {
                    if (th4 instanceof C3305a) {
                        C3305a c3305a4 = th4;
                        listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                    } else {
                        listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                    }
                }
                c1521a.c(listD4);
                return;
        }
    }

    @Override // O9.a
    public void f(O9.b bVar) {
        switch (this.f32728a) {
            case 23:
                i(bVar);
                return;
            default:
                C3609d c3609d = (C3609d) this.f32729b;
                synchronized (c3609d) {
                    c3609d.f40950c = (InterfaceC0689a) bVar.get();
                    c3609d.Z();
                    InterfaceC0689a interfaceC0689a = c3609d.f40950c;
                    C3608c c3608c = c3609d.f40949b;
                    FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0689a;
                    firebaseAuth.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = firebaseAuth.f27285c;
                    copyOnWriteArrayList.add(c3608c);
                    firebaseAuth.s().a(copyOnWriteArrayList.size());
                }
                return;
        }
    }

    @Override // dd.InterfaceC2422a
    public void g(q qVar) {
        C0799o c0799o = (C0799o) this.f32729b;
        try {
            qVar.get();
            c0799o.success();
        } catch (InterruptedException e7) {
            c0799o.d(new C2428g("exception", e7.getMessage()));
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            c0799o.d(new C2428g("exception", cause == null ? null : cause.getMessage()));
        }
    }

    @Override // jg.b
    public Object h(lg.b bVar) {
        return (lg.c) this.f32729b;
    }

    public boolean j(ad.L l10, int i5, Bundle bundle) {
        InterfaceC3116c c1346a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i5 & 1) != 0) {
            try {
                ((g) l10.f17515b).g();
                Parcelable parcelable = (Parcelable) ((g) l10.f17515b).a();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        ClipDescription description = ((g) l10.f17515b).getDescription();
        g gVar = (g) l10.f17515b;
        ClipData clipData = new ClipData(description, new ClipData.Item(gVar.b()));
        if (i10 >= 31) {
            c1346a = new C1346a(clipData, 2);
        } else {
            C3117d c3117d = new C3117d();
            c3117d.f38807b = clipData;
            c3117d.f38808c = 2;
            c1346a = c3117d;
        }
        c1346a.b(gVar.j());
        c1346a.setExtras(bundle);
        return S.i((q.r) this.f32729b, c1346a.build()) == null;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Object obj2 = this.f32729b;
        switch (this.f32728a) {
            case 27:
                int i5 = HiddenActivity.f18108c;
                ((C3642d) obj2).invoke(obj);
                break;
            case 28:
                int i10 = HiddenActivity.f18108c;
                ((C3642d) obj2).invoke(obj);
                break;
            default:
                int i11 = HiddenActivity.f18108c;
                ((C3642d) obj2).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Exception {
        switch (this.f32728a) {
            case 20:
                C3514m c3514m = (C3514m) this.f32729b;
                c3514m.getClass();
                s9.k kVar = (s9.k) task.getResult();
                return new C3516o(c3514m.f40496b, c3514m.f40495a, kVar, true, kVar != null && kVar.c());
            case 21:
                m9.W w2 = (m9.W) this.f32729b;
                p9.u uVar = w2.f40456a;
                FirebaseFirestore firebaseFirestore = w2.f40457b;
                return new Y(new m9.W(uVar, firebaseFirestore), (C3779D) task.getResult(), firebaseFirestore);
            default:
                d0 d0Var = (d0) this.f32729b;
                d0Var.getClass();
                if (!task.isSuccessful()) {
                    throw task.getException();
                }
                List list = (List) task.getResult();
                if (list.size() != 1) {
                    A6.c.s("Mismatch in docs returned from document lookup.", new Object[0]);
                    throw null;
                }
                s9.k kVar2 = (s9.k) list.get(0);
                boolean zD = kVar2.d();
                FirebaseFirestore firebaseFirestore2 = d0Var.f40474b;
                if (zD) {
                    return new C3516o(firebaseFirestore2, kVar2.f45380a, kVar2, false, false);
                }
                if (kVar2.e()) {
                    return new C3516o(firebaseFirestore2, kVar2.f45380a, null, false, false);
                }
                A6.c.s("BatchGetDocumentsRequest returned unexpected document type: " + s9.k.class.getCanonicalName(), new Object[0]);
                throw null;
        }
    }

    @Override // k1.r
    public v0 v(View view, v0 v0Var) {
        return WebView.applySafeAreaInsets$lambda$3((WebView) this.f32729b, view, v0Var);
    }
}
