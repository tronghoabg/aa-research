package m9;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import cb.AbstractC1593a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import ka.B1;
import ka.C1;
import ka.C3232f;
import ka.C3235g;
import p9.C3781b;
import p9.C3782c;
import p9.C3783d;
import p9.C3786g;
import p9.C3789j;
import p9.EnumC3788i;
import w9.AbstractC4392k;
import w9.AbstractC4397p;

/* loaded from: classes4.dex */
public class W {

    /* renamed from: a, reason: collision with root package name */
    public final p9.u f40456a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f40457b;

    public W(p9.u uVar, FirebaseFirestore firebaseFirestore) {
        this.f40456a = uVar;
        firebaseFirestore.getClass();
        this.f40457b = firebaseFirestore;
    }

    public static void i(Object obj, EnumC3788i enumC3788i) {
        if (!(obj instanceof List) || ((List) obj).size() == 0) {
            throw new IllegalArgumentException(wg.b.c(new StringBuilder("Invalid Query. A non-empty array is required for '"), enumC3788i.f43370a, "' filters."));
        }
    }

    public final C3513l a(Executor executor, C3786g c3786g, InterfaceC3517p interfaceC3517p) {
        C3513l c3513l;
        p9.u uVar = this.f40456a;
        if (AbstractC0213f.b(uVar.f43418i, 2) && uVar.f43410a.isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
        C3781b c3781b = new C3781b(executor, new Vc.a(3, this, interfaceC3517p));
        Dd.c cVar = this.f40457b.k;
        synchronized (cVar) {
            cVar.C();
            p9.n nVar = (p9.n) cVar.f2643c;
            c3513l = new C3513l(c3781b, nVar, nVar.b(this.f40456a, c3786g, c3781b), 1);
        }
        return c3513l;
    }

    public final C3782c b(boolean z2, String str, Object[] objArr) {
        p9.u uVar = this.f40456a;
        int length = objArr.length;
        List list = uVar.f43410a;
        if (length > list.size()) {
            throw new IllegalArgumentException(AbstractC0279p0.l("Too many arguments provided to ", str, "(). The number of arguments must be less than or equal to the number of orderBy() clauses."));
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            boolean zEquals = ((p9.t) list.get(i5)).f43407b.equals(s9.j.f45378b);
            FirebaseFirestore firebaseFirestore = this.f40457b;
            if (!zEquals) {
                arrayList.add(firebaseFirestore.f27329h.f(obj, false));
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + obj + ".");
                }
                String str2 = (String) obj;
                if (uVar.f43416g == null && str2.contains("/")) {
                    throw new IllegalArgumentException(R8.v.g("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to ", str, "() must be a plain document ID, but '", str2, "' contains a slash."));
                }
                s9.m mVar = (s9.m) uVar.f43415f.b(s9.m.l(str2));
                if (!s9.h.e(mVar)) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + mVar + "' is not because it contains an odd number of segments.");
                }
                arrayList.add(s9.p.k(firebaseFirestore.f27324c, new s9.h(mVar)));
            }
        }
        return new C3782c(arrayList, z2);
    }

    public final Task c(int i5) {
        Task taskB;
        p9.u uVar = this.f40456a;
        if (AbstractC0213f.b(uVar.f43418i, 2) && uVar.f43410a.isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
        if (i5 != 3) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            C3786g c3786g = new C3786g();
            c3786g.f43354a = true;
            c3786g.f43355b = true;
            c3786g.f43356c = true;
            taskCompletionSource2.setResult(a(AbstractC4392k.f47445b, c3786g, new C3512k(taskCompletionSource, taskCompletionSource2, i5, 1)));
            return taskCompletionSource.getTask();
        }
        Dd.c cVar = this.f40457b.k;
        synchronized (cVar) {
            cVar.C();
            p9.n nVar = (p9.n) cVar.f2643c;
            nVar.e();
            taskB = nVar.f43382d.f47427a.b(new B8.c(12, nVar, this.f40456a));
        }
        return taskB.continueWith(AbstractC4392k.f47445b, new com.unity3d.services.core.webview.b(this, 21));
    }

    public final W d(long j8) {
        if (j8 > 0) {
            return new W(this.f40456a.f(j8), this.f40457b);
        }
        throw new IllegalArgumentException(AbstractC1593a.h(j8, "Invalid Query. Query limit (", ") is invalid. Limit must be positive."));
    }

    public final W e(long j8) {
        if (j8 <= 0) {
            throw new IllegalArgumentException(AbstractC1593a.h(j8, "Invalid Query. Query limitToLast (", ") is invalid. Limit must be positive."));
        }
        p9.u uVar = this.f40456a;
        return new W(new p9.u(uVar.f43415f, uVar.f43416g, uVar.f43414e, uVar.f43410a, j8, 2, uVar.f43419j, uVar.k), this.f40457b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w2 = (W) obj;
        return this.f40456a.equals(w2.f40456a) && this.f40457b.equals(w2.f40457b);
    }

    public final W f(r rVar, int i5) {
        Fe.c.l(rVar, "Provided field path must not be null.");
        pd.f.o(i5, "Provided direction must not be null.");
        p9.u uVar = this.f40456a;
        if (uVar.f43419j != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
        }
        if (uVar.k != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
        }
        p9.t tVar = new p9.t(i5 == 1 ? 1 : 2, rVar.f40508a);
        A6.c.z(!uVar.e(), "No ordering is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(uVar.f43410a);
        arrayList.add(tVar);
        return new W(new p9.u(uVar.f43415f, uVar.f43416g, uVar.f43414e, arrayList, uVar.f43417h, uVar.f43418i, uVar.f43419j, uVar.k), this.f40457b);
    }

    public final C1 g(Object obj) {
        boolean z2 = obj instanceof String;
        FirebaseFirestore firebaseFirestore = this.f40457b;
        if (!z2) {
            if (obj instanceof C3514m) {
                return s9.p.k(firebaseFirestore.f27324c, ((C3514m) obj).f40495a);
            }
            B b5 = AbstractC4397p.f47455a;
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: ".concat(obj == null ? "null" : obj.getClass().getName()));
        }
        String str = (String) obj;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
        }
        p9.u uVar = this.f40456a;
        if (uVar.f43416g == null && str.contains("/")) {
            throw new IllegalArgumentException(AbstractC0279p0.l("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '", str, "' contains a '/' character."));
        }
        s9.m mVar = (s9.m) uVar.f43415f.b(s9.m.l(str));
        if (s9.h.e(mVar)) {
            return s9.p.k(firebaseFirestore.f27324c, new s9.h(mVar));
        }
        throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + mVar + "' is not because it has an odd number of segments (" + mVar.f45369a.size() + ").");
    }

    public final p9.k h(AbstractC3501A abstractC3501A) {
        C1 c1F;
        boolean z2 = abstractC3501A instanceof C3526z;
        boolean z10 = true;
        A6.c.z(z2 || (abstractC3501A instanceof C3525y), "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", new Object[0]);
        if (!z2) {
            C3525y c3525y = (C3525y) abstractC3501A;
            ArrayList arrayList = new ArrayList();
            Iterator it = c3525y.f40514a.iterator();
            while (it.hasNext()) {
                p9.k kVarH = h((AbstractC3501A) it.next());
                if (!kVarH.b().isEmpty()) {
                    arrayList.add(kVarH);
                }
            }
            return arrayList.size() == 1 ? (p9.k) arrayList.get(0) : new C3783d(c3525y.f40515b, arrayList);
        }
        C3526z c3526z = (C3526z) abstractC3501A;
        r rVar = c3526z.f40516a;
        Fe.c.l(rVar, "Provided field path must not be null.");
        EnumC3788i enumC3788i = c3526z.f40517b;
        s9.j jVar = s9.j.f45378b;
        s9.j jVar2 = rVar.f40508a;
        boolean zEquals = jVar2.equals(jVar);
        EnumC3788i enumC3788i2 = EnumC3788i.IN;
        EnumC3788i enumC3788i3 = EnumC3788i.ARRAY_CONTAINS_ANY;
        EnumC3788i enumC3788i4 = EnumC3788i.NOT_IN;
        Object obj = c3526z.f40518c;
        if (!zEquals) {
            if (enumC3788i == enumC3788i2 || enumC3788i == enumC3788i4 || enumC3788i == enumC3788i3) {
                i(obj, enumC3788i);
            }
            f0 f0Var = this.f40457b.f27329h;
            if (enumC3788i != enumC3788i2 && enumC3788i != enumC3788i4) {
                z10 = false;
            }
            c1F = f0Var.f(obj, z10);
        } else {
            if (enumC3788i == EnumC3788i.ARRAY_CONTAINS || enumC3788i == enumC3788i3) {
                throw new IllegalArgumentException(wg.b.c(new StringBuilder("Invalid query. You can't perform '"), enumC3788i.f43370a, "' queries on FieldPath.documentId()."));
            }
            if (enumC3788i == enumC3788i2 || enumC3788i == enumC3788i4) {
                i(obj, enumC3788i);
                C3232f c3232fG = C3235g.g();
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    c3232fG.b(g(it2.next()));
                }
                B1 b1W = C1.w();
                b1W.b(c3232fG);
                c1F = (C1) b1W.build();
            } else {
                c1F = g(obj);
            }
        }
        return C3789j.e(jVar2, enumC3788i, c1F);
    }

    public final int hashCode() {
        return this.f40457b.hashCode() + (this.f40456a.hashCode() * 31);
    }

    public final W j(AbstractC3501A abstractC3501A) {
        EnumC3788i enumC3788i;
        p9.k kVarH = h(abstractC3501A);
        if (kVarH.b().isEmpty()) {
            return this;
        }
        p9.u uVar = this.f40456a;
        p9.u uVarB = uVar;
        for (C3789j c3789j : kVarH.c()) {
            EnumC3788i enumC3788i2 = c3789j.f43371a;
            int iOrdinal = enumC3788i2.ordinal();
            EnumC3788i enumC3788i3 = EnumC3788i.NOT_EQUAL;
            EnumC3788i enumC3788i4 = EnumC3788i.NOT_IN;
            List listAsList = iOrdinal != 3 ? (iOrdinal == 7 || iOrdinal == 8) ? Arrays.asList(enumC3788i4) : iOrdinal != 9 ? new ArrayList() : Arrays.asList(EnumC3788i.ARRAY_CONTAINS_ANY, EnumC3788i.IN, enumC3788i4, enumC3788i3) : Arrays.asList(enumC3788i3, enumC3788i4);
            Iterator it = uVarB.f43414e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    enumC3788i = null;
                    break;
                }
                for (C3789j c3789j2 : ((p9.k) it.next()).c()) {
                    if (listAsList.contains(c3789j2.f43371a)) {
                        enumC3788i = c3789j2.f43371a;
                        break;
                    }
                }
            }
            if (enumC3788i != null) {
                String str = enumC3788i2.f43370a;
                if (enumC3788i == enumC3788i2) {
                    throw new IllegalArgumentException(AbstractC0279p0.l("Invalid Query. You cannot use more than one '", str, "' filter."));
                }
                throw new IllegalArgumentException(wg.b.c(com.google.android.gms.internal.consent_sdk.a.w("Invalid Query. You cannot use '", str, "' filters with '"), enumC3788i.f43370a, "' filters."));
            }
            uVarB = uVarB.b(c3789j);
        }
        return new W(uVar.b(kVarH), this.f40457b);
    }
}
