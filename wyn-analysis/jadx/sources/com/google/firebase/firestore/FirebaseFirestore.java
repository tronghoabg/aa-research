package com.google.firebase.firestore;

import A7.AbstractC0279p0;
import A7.X;
import Dd.c;
import L8.r;
import android.content.Context;
import androidx.annotation.Keep;
import com.applovin.impl.sdk.nativeAd.e;
import com.google.android.gms.ads.nativead.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import m9.B;
import m9.C;
import m9.C3509h;
import m9.C3514m;
import m9.F;
import m9.G;
import m9.H;
import m9.I;
import m9.P;
import m9.T;
import m9.W;
import m9.f0;
import n9.C3607b;
import n9.C3609d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p9.n;
import p9.u;
import s8.g;
import s9.a;
import s9.d;
import s9.f;
import s9.j;
import v9.h;
import v9.m;
import w9.C4386e;
import w9.ExecutorC4384c;

/* loaded from: classes4.dex */
public class FirebaseFirestore {

    /* renamed from: a, reason: collision with root package name */
    public final B f27322a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f27323b;

    /* renamed from: c, reason: collision with root package name */
    public final f f27324c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27325d;

    /* renamed from: e, reason: collision with root package name */
    public final C3609d f27326e;

    /* renamed from: f, reason: collision with root package name */
    public final C3607b f27327f;

    /* renamed from: g, reason: collision with root package name */
    public final g f27328g;

    /* renamed from: h, reason: collision with root package name */
    public final f0 f27329h;

    /* renamed from: i, reason: collision with root package name */
    public final I f27330i;

    /* renamed from: j, reason: collision with root package name */
    public H f27331j;
    public final c k;

    /* renamed from: l, reason: collision with root package name */
    public final h f27332l;

    /* renamed from: m, reason: collision with root package name */
    public l f27333m;

    public FirebaseFirestore(Context context, f fVar, String str, C3609d c3609d, C3607b c3607b, B b5, g gVar, I i5, h hVar) {
        context.getClass();
        this.f27323b = context;
        this.f27324c = fVar;
        this.f27329h = new f0(fVar);
        str.getClass();
        this.f27325d = str;
        this.f27326e = c3609d;
        this.f27327f = c3607b;
        this.f27322a = b5;
        this.k = new c(new C(this));
        this.f27328g = gVar;
        this.f27330i = i5;
        this.f27332l = hVar;
        this.f27331j = new X().a();
    }

    public static FirebaseFirestore e(g gVar, String str) {
        FirebaseFirestore firebaseFirestoreG;
        Fe.c.l(str, "Provided database name must not be null.");
        I i5 = (I) gVar.c(I.class);
        Fe.c.l(i5, "Firestore component is not present.");
        synchronized (i5) {
            firebaseFirestoreG = (FirebaseFirestore) i5.f40431a.get(str);
            if (firebaseFirestoreG == null) {
                firebaseFirestoreG = g(i5.f40433c, i5.f40432b, i5.f40434d, i5.f40435e, str, i5, i5.f40436f);
                i5.f40431a.put(str, firebaseFirestoreG);
            }
        }
        return firebaseFirestoreG;
    }

    public static FirebaseFirestore g(Context context, g gVar, r rVar, r rVar2, String str, I i5, h hVar) {
        gVar.a();
        String str2 = gVar.f45330c.f45349g;
        if (str2 == null) {
            throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
        }
        f fVar = new f(str2, str);
        C3609d c3609d = new C3609d(rVar);
        C3607b c3607b = new C3607b(rVar2);
        gVar.a();
        return new FirebaseFirestore(context, fVar, gVar.f45329b, c3609d, c3607b, new B(0), gVar, i5, hVar);
    }

    @Keep
    public static void setClientLanguage(String str) {
        m.f47091j = str;
    }

    public final Task a() {
        c cVar = this.k;
        synchronized (cVar) {
            n nVar = (n) cVar.f2643c;
            if (nVar != null && !nVar.f43382d.f47427a.c()) {
                return Tasks.forException(new G("Persistence cannot be cleared while the firestore instance is running.", F.FAILED_PRECONDITION));
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            e eVar = new e(28, this, taskCompletionSource);
            ExecutorC4384c executorC4384c = ((C4386e) cVar.f2644d).f47427a;
            executorC4384c.getClass();
            try {
                executorC4384c.f47413a.execute(eVar);
            } catch (RejectedExecutionException unused) {
                Ba.c.p(C4386e.class.getSimpleName(), "Refused to enqueue task after panic", 2, new Object[0]);
            }
            return taskCompletionSource.getTask();
        }
    }

    public final C3509h b(String str) {
        Fe.c.l(str, "Provided collection path must not be null.");
        this.k.C();
        s9.m mVarL = s9.m.l(str);
        C3509h c3509h = new C3509h(new u(mVarL, null), this);
        List list = mVarL.f45369a;
        if (list.size() % 2 == 1) {
            return c3509h;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + mVarL.c() + " has " + list.size());
    }

    public final W c(String str) {
        Fe.c.l(str, "Provided collection ID must not be null.");
        if (str.contains("/")) {
            throw new IllegalArgumentException(AbstractC0279p0.l("Invalid collectionId '", str, "'. Collection IDs must not contain '/'."));
        }
        this.k.C();
        return new W(new u(s9.m.f45388b, str), this);
    }

    public final C3514m d(String str) {
        Fe.c.l(str, "Provided document path must not be null.");
        this.k.C();
        s9.m mVarL = s9.m.l(str);
        List list = mVarL.f45369a;
        if (list.size() % 2 == 0) {
            return new C3514m(new s9.h(mVarL), this);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + mVarL.c() + " has " + list.size());
    }

    public final Task f(String str) {
        Task task;
        c cVar = this.k;
        synchronized (cVar) {
            cVar.C();
            n nVar = (n) cVar.f2643c;
            nVar.e();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            nVar.f43382d.a(new com.applovin.impl.mediation.ads.f(nVar, str, taskCompletionSource, 29));
            task = taskCompletionSource.getTask();
        }
        return task.continueWith(new C(this));
    }

    public final void h(H h10) {
        Fe.c.l(h10, "Provided settings must not be null.");
        synchronized (this.f27324c) {
            try {
                if ((((n) this.k.f2643c) != null) && !this.f27331j.equals(h10)) {
                    throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
                }
                this.f27331j = h10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task i(String str) throws JSONException {
        Task taskA;
        this.k.C();
        H h10 = this.f27331j;
        P p10 = h10.f40430e;
        if (!(p10 != null ? p10 instanceof T : h10.f40428c)) {
            throw new IllegalStateException("Cannot enable indexes when persistence is disabled");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("indexes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("indexes");
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                    String string = jSONObject2.getString("collectionGroup");
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("fields");
                    for (int i10 = 0; jSONArrayOptJSONArray != null && i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i10);
                        j jVarL = j.l(jSONObject3.getString("fieldPath"));
                        if ("CONTAINS".equals(jSONObject3.optString("arrayConfig"))) {
                            arrayList2.add(new d(3, jVarL));
                        } else if ("ASCENDING".equals(jSONObject3.optString("order"))) {
                            arrayList2.add(new d(1, jVarL));
                        } else {
                            arrayList2.add(new d(2, jVarL));
                        }
                    }
                    arrayList.add(new a(-1, string, arrayList2, a.f45354e));
                }
            }
            c cVar = this.k;
            synchronized (cVar) {
                cVar.C();
                n nVar = (n) cVar.f2643c;
                nVar.e();
                taskA = nVar.f43382d.a(new ng.a(4, nVar, arrayList));
            }
            return taskA;
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Failed to parse index configuration", e7);
        }
    }

    public final Task j() {
        I i5 = this.f27330i;
        String str = this.f27324c.f45371b;
        synchronized (i5) {
            i5.f40431a.remove(str);
        }
        return this.k.S();
    }

    public final void k(C3514m c3514m) {
        if (c3514m.f40496b != this) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
    }

    public final Task l() {
        Task task;
        c cVar = this.k;
        synchronized (cVar) {
            cVar.C();
            n nVar = (n) cVar.f2643c;
            nVar.e();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            nVar.f43382d.a(new ng.a(3, nVar, taskCompletionSource));
            task = taskCompletionSource.getTask();
        }
        return task;
    }
}
