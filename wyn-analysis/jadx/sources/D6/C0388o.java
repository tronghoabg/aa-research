package D6;

import A.AbstractC0213f;
import A7.C0237b0;
import A7.RunnableC0299w0;
import Pc.C0786b;
import R8.C0805a;
import U8.C0859b0;
import U8.C0865e0;
import U8.C0867f0;
import U8.C0871h0;
import U8.C0873i0;
import Va.X7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbzf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.DesugarCollections;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.json.JSONException;
import org.json.JSONObject;
import q5.C3868c;
import r5.C3924a;
import t5.C4123r;
import uc.C4278o;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import w4.C4360b;
import y4.C4562a;

/* renamed from: D6.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0388o implements InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2462a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2463b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2464c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2465d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2466e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2467f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2468g;

    public C0388o(u1 u1Var, f1 f1Var, f1 f1Var2, zzboe zzboeVar, zzbzf zzbzfVar, f1 f1Var3) {
        this.f2462a = u1Var;
        this.f2463b = f1Var;
        this.f2464c = f1Var2;
        this.f2465d = zzboeVar;
        this.f2466e = zzbzfVar;
        this.f2468g = f1Var3;
    }

    public static U8.Q a(U8.Q q4, T8.e eVar, X8.c cVar) {
        U8.P pA = q4.a();
        String strB = ((T8.c) eVar.f11792b).b();
        if (strB != null) {
            pA.f12457e = new C0865e0(strB);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List listE = e(((T8.d) ((AtomicMarkableReference) ((C0237b0) cVar.f16187d).f813c).getReference()).a());
        List listE2 = e(((T8.d) ((AtomicMarkableReference) ((C0237b0) cVar.f16188e).f813c).getReference()).a());
        if (!listE.isEmpty() || !listE2.isEmpty()) {
            U8.S s10 = q4.f12463c;
            pA.f12455c = new U8.S(s10.f12467a, listE, listE2, s10.f12470d, s10.f12471e, s10.f12472f, s10.f12473g);
        }
        return pA.a();
    }

    public static U8.L0 b(U8.Q q4, X8.c cVar) {
        List listB = ((I9.a) cVar.f16189f).b();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < listB.size(); i5++) {
            T8.m mVar = (T8.m) listB.get(i5);
            mVar.getClass();
            C0867f0 c0867f0 = new C0867f0();
            T8.b bVar = (T8.b) mVar;
            String str = bVar.f11785e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.f11782b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            c0867f0.f12563a = new C0871h0(str2, str);
            String str3 = bVar.f11783c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            c0867f0.f12564b = str3;
            String str4 = bVar.f11784d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            c0867f0.f12565c = str4;
            c0867f0.f12566d = bVar.f11786f;
            c0867f0.f12567e = (byte) (c0867f0.f12567e | 1);
            arrayList.add(c0867f0.a());
        }
        if (arrayList.isEmpty()) {
            return q4;
        }
        U8.P pA = q4.a();
        pA.f12458f = new C0873i0(arrayList);
        return pA.a();
    }

    public static C0388o d(Context context, R8.z zVar, X8.c cVar, C0805a c0805a, T8.e eVar, X8.c cVar2, Y2.B b5, K3.r rVar, S3.s sVar, R8.j jVar, S8.f fVar) {
        R8.t tVar = new R8.t(context, zVar, c0805a, b5, rVar);
        X8.a aVar = new X8.a(cVar, rVar, jVar);
        V8.a aVar2 = Y8.a.f16713b;
        C4123r.b(context);
        return new C0388o(tVar, aVar, new Y8.a(new Y8.c(C4123r.a().c(new C3924a(Y8.a.f16714c, Y8.a.f16715d)).a("FIREBASE_CRASHLYTICS_REPORT", new C3868c("json"), Y8.a.f16716e), rVar.c(), sVar)), eVar, cVar2, zVar, fVar);
    }

    public static List e(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new U8.G(str, str2));
        }
        Collections.sort(arrayList, new A0.f(5));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static void k(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(HandleInvocationsFromAdViewer.KEY_ACTION, "no_ads_fallback");
        bundle.putString("flow", str);
        C0392q c0392q = C0392q.f2477g;
        H6.f fVar = c0392q.f2478a;
        String str2 = c0392q.f2481d.f4927a;
        fVar.getClass();
        H6.f.a(context, str2, bundle, new S3.e(fVar, false, context, 6));
    }

    public void c(int i5, long j8) {
        if (i5 == 0) {
            i(new Z9.h("Unable to fetch the latest version of the template."));
            return;
        }
        ((ScheduledExecutorService) this.f2467f).schedule(new aa.b(this, i5, j8), ((Random) this.f2468g).nextInt(4), TimeUnit.SECONDS);
    }

    public void f(InputStream inputStream) throws JSONException, IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strF = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strF = N0.a.f(strF, line);
            if (line.contains("}")) {
                int iIndexOf = strF.indexOf(123);
                int iLastIndexOf = strF.lastIndexOf(125);
                strF = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strF.substring(iIndexOf, iLastIndexOf + 1);
                if (!strF.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strF);
                    } catch (JSONException e7) {
                        i(new Z9.e("Unable to parse config update message.", e7.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e7);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ((aa.m) this.f2466e).b(new Z9.h("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = ((LinkedHashSet) this.f2462a).isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j8 = ((aa.h) this.f2464c).f17443g.f17454a.getLong("last_template_version", 0L);
                        long j10 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j10 > j8) {
                            c(3, j10);
                        }
                    }
                    strF = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public void g() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f2463b;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            f(inputStream);
            inputStream.close();
        } catch (IOException e7) {
            Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e7);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public void h(long j8, Thread thread, Throwable th, String str, String str2, boolean z2) {
        Y2.B b5;
        byte b10;
        Y2.B b11;
        boolean zEquals = str2.equals("crash");
        R8.t tVar = (R8.t) this.f2462a;
        Context context = tVar.f10527a;
        int i5 = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        X7 x72 = null;
        while (true) {
            boolean zIsEmpty = stack.isEmpty();
            b5 = tVar.f10530d;
            if (zIsEmpty) {
                break;
            }
            Throwable th2 = (Throwable) stack.pop();
            x72 = new X7(th2.getLocalizedMessage(), b5.f(th2.getStackTrace()), x72, th2.getClass().getName());
        }
        U8.P p10 = new U8.P();
        p10.f12454b = str2;
        p10.f12453a = j8;
        p10.f12459g = (byte) (p10.f12459g | 1);
        U8.E0 e0E = O8.c.f8922b.e(context);
        int i10 = ((C0859b0) e0E).f12526c;
        Boolean boolValueOf = i10 > 0 ? Boolean.valueOf(i10 != 100) : null;
        ArrayList arrayListD = O8.c.d(context);
        byte b12 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) x72.f13843c;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b13 = (byte) 1;
        List listD = R8.t.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        Boolean bool = boolValueOf;
        if (b13 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b13 == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
        }
        arrayList.add(new U8.X(4, listD, name));
        if (z2) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (key.equals(thread)) {
                    b10 = b13;
                    b11 = b5;
                } else {
                    StackTraceElement[] stackTraceElementArrF = b5.f(entry.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    b11 = b5;
                    List listD2 = R8.t.d(stackTraceElementArrF, 0);
                    if (listD2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b13 != 1) {
                        byte b14 = b13;
                        StringBuilder sb3 = new StringBuilder();
                        if (b14 == 0) {
                            sb3.append(" importance");
                        }
                        throw new IllegalStateException(N0.a.i("Missing required properties:", sb3));
                    }
                    b10 = b13;
                    arrayList.add(new U8.X(0, listD2, name2));
                }
                b13 = b10;
                b5 = b11;
            }
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        U8.V vC = R8.t.c(x72, 0);
        U8.W wE = R8.t.e();
        List listA = tVar.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        U8.T t10 = new U8.T(listUnmodifiableList, vC, null, wE, listA);
        if (b12 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b12 == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(N0.a.i("Missing required properties:", sb4));
        }
        p10.f12455c = new U8.S(t10, null, null, bool, e0E, arrayListD, i5);
        p10.f12456d = tVar.b(i5);
        U8.Q qA = p10.a();
        T8.e eVar = (T8.e) this.f2465d;
        X8.c cVar = (X8.c) this.f2466e;
        U8.L0 l0B = b(a(qA, eVar, cVar), cVar);
        if (z2) {
            ((X8.a) this.f2463b).d(l0B, str, zEquals);
        } else {
            ((S8.f) this.f2468g).f11035b.b(new Db.b(this, l0B, str, zEquals, 1));
        }
    }

    public synchronized void i(Z9.f fVar) {
        Iterator it = ((LinkedHashSet) this.f2462a).iterator();
        while (it.hasNext()) {
            ((Z9.b) it.next()).b(fVar);
        }
    }

    public Task j(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        ArrayList arrayListB = ((X8.a) this.f2463b).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                V8.a aVar = X8.a.f16176g;
                String strE = X8.a.e(file);
                aVar.getClass();
                arrayList.add(new R8.b(V8.a.i(strE), file.getName(), file));
            } catch (IOException e7) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e7);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            R8.b bVar = (R8.b) it2.next();
            if (str == null || str.equals(bVar.f10445b)) {
                Y8.a aVar2 = (Y8.a) this.f2464c;
                U8.C c10 = bVar.f10444a;
                boolean z2 = true;
                if (c10.f12370f == null || c10.f12371g == null) {
                    R8.y yVarB = ((R8.z) this.f2467f).b(true);
                    U8.B bA = bVar.f10444a.a();
                    bA.f12358e = yVarB.f10541a;
                    U8.B bA2 = bA.a().a();
                    bA2.f12359f = yVarB.f10542b;
                    bVar = new R8.b(bA2.a(), bVar.f10445b, bVar.f10446c);
                }
                boolean z10 = str != null;
                Y8.c cVar = aVar2.f16717a;
                synchronized (cVar.f16727f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.f16730i.f11009b).getAndIncrement();
                            if (cVar.f16727f.size() >= cVar.f16726e) {
                                z2 = false;
                            }
                            if (z2) {
                                O8.c cVar2 = O8.c.f8921a;
                                cVar2.c("Enqueueing report: " + bVar.f10445b);
                                cVar2.c("Queue size: " + cVar.f16727f.size());
                                cVar.f16728g.execute(new RunnableC0299w0(cVar, bVar, taskCompletionSource, 19));
                                cVar2.c("Closing task for report: " + bVar.f10445b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str2 = "Dropping report due to queue being full: " + bVar.f10445b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str2, null);
                                }
                                ((AtomicInteger) cVar.f16730i.f11010c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new C0786b(this, 27)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        int i5;
        int i10;
        HashMap map;
        int i11;
        x4.c cVar;
        C4562a c4562a;
        Object obj;
        boolean z2;
        boolean z10;
        i5 = 7;
        i10 = 6;
        String str = c4278o.f46759a;
        str.getClass();
        map = (HashMap) this.f2465d;
        i11 = 2;
        cVar = (x4.c) this.f2463b;
        c4562a = (C4562a) this.f2462a;
        obj = c4278o.f46760b;
        switch (str) {
            case "getCurrentPosition":
                try {
                    Context context = (Context) this.f2466e;
                    c4562a.getClass();
                    int iA = C4562a.a(context);
                    if (!(iA == 3 || iA == 4)) {
                        ((tc.g) interfaceC4280q).b(pd.f.h(5), pd.f.g(5), null);
                        return;
                    }
                    Map map2 = (Map) obj;
                    boolean zBooleanValue = map2.get("forceLocationManager") != null ? ((Boolean) map2.get("forceLocationManager")).booleanValue() : false;
                    x4.h hVarA = x4.h.a(map2);
                    String str2 = (String) map2.get("requestId");
                    boolean[] zArr = {false};
                    Context context2 = (Context) this.f2466e;
                    cVar.getClass();
                    x4.e eVarA = x4.c.a(context2, zBooleanValue, hVarA);
                    map.put(str2, eVarA);
                    Activity activity = (Activity) this.f2467f;
                    tc.g gVar = (tc.g) interfaceC4280q;
                    v4.c cVar2 = new v4.c(this, zArr, eVarA, str2, gVar);
                    v4.c cVar3 = new v4.c(this, zArr, eVarA, str2, gVar);
                    cVar.f47691a.add(eVarA);
                    eVarA.a(activity, cVar2, cVar3);
                    return;
                } catch (C4360b unused) {
                    ((tc.g) interfaceC4280q).b(pd.f.h(4), pd.f.g(4), null);
                    return;
                }
            case "getLastKnownPosition":
                try {
                    Context context3 = (Context) this.f2466e;
                    c4562a.getClass();
                    int iA2 = C4562a.a(context3);
                    if (!(iA2 == 3 || iA2 == 4)) {
                        ((tc.g) interfaceC4280q).b(pd.f.h(5), pd.f.g(5), null);
                        return;
                    }
                    Boolean bool = (Boolean) c4278o.a("forceLocationManager");
                    Context context4 = (Context) this.f2466e;
                    boolean z11 = bool != null && bool.booleanValue();
                    tc.g gVar2 = (tc.g) interfaceC4280q;
                    Ka.b bVar = new Ka.b(gVar2, 8);
                    Ka.b bVar2 = new Ka.b(gVar2, 9);
                    cVar.getClass();
                    x4.c.a(context4, z11, null).b(bVar, bVar2);
                    return;
                } catch (C4360b unused2) {
                    ((tc.g) interfaceC4280q).b(pd.f.h(4), pd.f.g(4), null);
                    return;
                }
            case "openLocationSettings":
                Context context5 = (Context) this.f2466e;
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.addFlags(268435456);
                    intent.addFlags(1073741824);
                    intent.addFlags(8388608);
                    context5.startActivity(intent);
                    z2 = true;
                } catch (Exception unused3) {
                    z2 = false;
                }
                ((tc.g) interfaceC4280q).a(Boolean.valueOf(z2));
                return;
            case "openAppSettings":
                Context context6 = (Context) this.f2466e;
                try {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.setData(Uri.parse("package:" + context6.getPackageName()));
                    intent2.addFlags(268435456);
                    intent2.addFlags(1073741824);
                    intent2.addFlags(8388608);
                    context6.startActivity(intent2);
                    z10 = true;
                } catch (Exception unused4) {
                    z10 = false;
                }
                ((tc.g) interfaceC4280q).a(Boolean.valueOf(z10));
                return;
            case "isLocationServiceEnabled":
                Context context7 = (Context) this.f2466e;
                com.google.android.gms.ads.nativead.l lVar = new com.google.android.gms.ads.nativead.l(26, false);
                lVar.f26356b = (tc.g) interfaceC4280q;
                if (context7 == null) {
                    cVar.getClass();
                    ((tc.g) lVar.f26356b).b(pd.f.h(3), pd.f.g(3), null);
                }
                cVar.getClass();
                x4.c.a(context7, false, null).c(lVar);
                return;
            case "checkPermission":
                try {
                    Context context8 = (Context) this.f2466e;
                    c4562a.getClass();
                    int iF = AbstractC0213f.f(C4562a.a(context8));
                    if (iF == 0) {
                        i11 = 0;
                    } else if (iF == 1) {
                        i11 = 1;
                    } else if (iF != 2) {
                        if (iF != 3) {
                            throw new IndexOutOfBoundsException();
                        }
                        i11 = 3;
                    }
                    ((tc.g) interfaceC4280q).a(Integer.valueOf(i11));
                    return;
                } catch (C4360b unused5) {
                    ((tc.g) interfaceC4280q).b(pd.f.h(4), pd.f.g(4), null);
                    return;
                }
            case "requestPermission":
                try {
                    c4562a.c((Activity) this.f2467f, new Ka.b((tc.g) interfaceC4280q, i10), new Ka.b((tc.g) interfaceC4280q, i5));
                    return;
                } catch (C4360b unused6) {
                    ((tc.g) interfaceC4280q).b(pd.f.h(4), pd.f.g(4), null);
                    return;
                }
            case "getLocationAccuracy":
                Context context9 = (Context) this.f2466e;
                ((x4.d) this.f2464c).getClass();
                if (Y0.e.checkSelfPermission(context9, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    if (Y0.e.checkSelfPermission(context9, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        i11 = 1;
                    } else {
                        ((tc.g) interfaceC4280q).b(pd.f.h(5), pd.f.g(5), null);
                        i11 = 0;
                    }
                }
                if (i11 != 0) {
                    ((tc.g) interfaceC4280q).a(Integer.valueOf(AbstractC0213f.f(i11)));
                    return;
                }
                return;
            case "cancelGetCurrentPosition":
                String str3 = (String) ((Map) obj).get("requestId");
                x4.e eVar = (x4.e) map.get(str3);
                if (eVar != null) {
                    eVar.e();
                }
                map.remove(str3);
                ((tc.g) interfaceC4280q).a(null);
                return;
            default:
                ((tc.g) interfaceC4280q).c();
                return;
        }
    }

    public C0388o(C4562a c4562a, x4.c cVar, x4.d dVar) {
        this.f2462a = c4562a;
        this.f2463b = cVar;
        this.f2464c = dVar;
        this.f2465d = new HashMap();
    }

    public C0388o(HttpURLConnection httpURLConnection, aa.h hVar, aa.c cVar, LinkedHashSet linkedHashSet, aa.m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f2463b = httpURLConnection;
        this.f2464c = hVar;
        this.f2465d = cVar;
        this.f2462a = linkedHashSet;
        this.f2466e = mVar;
        this.f2467f = scheduledExecutorService;
        this.f2468g = new Random();
    }

    public C0388o(R8.t tVar, X8.a aVar, Y8.a aVar2, T8.e eVar, X8.c cVar, R8.z zVar, S8.f fVar) {
        this.f2462a = tVar;
        this.f2463b = aVar;
        this.f2464c = aVar2;
        this.f2465d = eVar;
        this.f2466e = cVar;
        this.f2467f = zVar;
        this.f2468g = fVar;
    }

    public C0388o(H4.c cVar, H4.c cVar2, H4.c cVar3, H4.c cVar4, E4.o oVar, E4.o oVar2) {
        this.f2468g = Z4.d.a(150, new S3.l(this));
        this.f2462a = cVar;
        this.f2463b = cVar2;
        this.f2464c = cVar3;
        this.f2465d = cVar4;
        this.f2466e = oVar;
        this.f2467f = oVar2;
    }
}
