package me;

import A.AbstractC0213f;
import A6.c;
import A7.C0295v;
import L4.g;
import N.J0;
import R1.i;
import V5.s;
import Y2.B;
import a2.v;
import ac.C1346a;
import android.database.Cursor;
import com.google.android.gms.common.api.f;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import javax.net.ssl.SSLSocket;
import ka.AbstractC3230e0;
import ka.F;
import ka.H;
import md.b0;
import md.c0;
import md.j0;
import md.k0;
import md.r;
import ne.C3618a;
import od.C3707n;
import od.C3710o;
import od.C3713p;
import od.C3716q;
import od.EnumC3721s;
import od.InterfaceC3724t;
import p9.u;
import q6.d;
import r9.C3946c;
import r9.C3961s;
import r9.InterfaceC3940A;
import r9.InterfaceC3949f;
import r9.K;
import r9.S;
import r9.t;
import r9.z;
import s8.q;
import s9.b;
import s9.h;
import s9.k;
import s9.o;
import u9.e;
import u9.l;
import u9.m;
import w9.AbstractC4392k;
import w9.AbstractC4397p;
import w9.C4386e;
import w9.ExecutorC4387f;

/* renamed from: me.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3558a implements InterfaceC3724t, z, InterfaceC3940A {

    /* renamed from: a, reason: collision with root package name */
    public Object f40736a;

    /* renamed from: b, reason: collision with root package name */
    public Object f40737b;

    /* renamed from: c, reason: collision with root package name */
    public Object f40738c;

    public /* synthetic */ C3558a(Object obj, Object obj2) {
        this.f40738c = obj;
        this.f40736a = obj2;
    }

    public static Method t(Class cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return t(cls.getSuperclass(), str, clsArr);
                }
                Method method = cls.getMethod(str, clsArr);
                try {
                    if ((method.getModifiers() & 1) != 0) {
                        return method;
                    }
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            } catch (NoSuchMethodException unused2) {
                return null;
            }
        }
        return null;
    }

    public boolean A(h hVar) {
        t tVar = (t) this.f40737b;
        if (tVar.f44667h.f44672b.l(hVar)) {
            return true;
        }
        for (C3961s c3961s : tVar.f44664e.values()) {
            c3961s.getClass();
            boolean zEquals = false;
            C0295v c0295vB = c3961s.f44659b.b(new C3946c(hVar, 0));
            if (((Iterator) c0295vB.f1081b).hasNext()) {
                zEquals = ((C3946c) c0295vB.next()).f44606a.equals(hVar);
            }
            if (zEquals) {
                return true;
            }
        }
        B b5 = (B) this.f40736a;
        return b5 != null && b5.l(hVar);
    }

    @Override // r9.InterfaceC3940A
    public k B(h hVar) {
        return (k) y(Collections.singletonList(hVar)).get(hVar);
    }

    @Override // r9.InterfaceC3940A
    public HashMap C(u uVar, b bVar, Set set, i iVar) {
        return r(Collections.singletonList(uVar.f43415f), bVar, f.API_PRIORITY_OTHER, new aa.f(24, uVar, set), iVar);
    }

    public C1346a D() {
        return new C1346a((C8.i) this.f40737b, 20);
    }

    public void E() {
        c.z(((ScheduledFuture) this.f40737b) != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
        this.f40737b = null;
        c.z(((C4386e) this.f40738c).f47428b.remove(this), "Delayed task not found.", new Object[0]);
    }

    @Override // r9.InterfaceC3940A
    public void F(k kVar, o oVar) {
        c.z(!oVar.equals(o.f45389b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        v vVar = (v) this.f40737b;
        u9.b bVarK = u9.c.k();
        boolean zE = kVar.e();
        v9.o oVar2 = (v9.o) vVar.f17322b;
        h hVar = kVar.f45380a;
        if (zE) {
            e eVarF = u9.f.f();
            eVarF.a(oVar2.h(hVar));
            eVarF.b(v9.o.l(kVar.f45382c.f45390a));
            bVarK.c((u9.f) eVarF.build());
        } else if (kVar.d()) {
            F fG = H.g();
            fG.b(oVar2.h(hVar));
            fG.a(kVar.f45384e.b().s().getFieldsMap());
            fG.c(v9.o.l(kVar.f45382c.f45390a));
            bVarK.a((H) fG.build());
        } else {
            if (!AbstractC0213f.b(kVar.f45381b, 4)) {
                c.s("Cannot encode invalid document %s", kVar);
                throw null;
            }
            l lVarF = m.f();
            lVarF.a(oVar2.h(hVar));
            lVarF.b(v9.o.l(kVar.f45382c.f45390a));
            bVarK.d((m) lVarF.build());
        }
        bVarK.b(AbstractC0213f.b(kVar.f45385f, 2));
        u9.c cVar = (u9.c) bVarK.build();
        String strN = AbstractC3230e0.n(hVar.f45375a);
        Integer numValueOf = Integer.valueOf(hVar.f45375a.f45369a.size());
        q qVar = oVar.f45390a;
        ((K) this.f40736a).f0("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", strN, numValueOf, Long.valueOf(qVar.f45352a), Integer.valueOf(qVar.f45353b), cVar.toByteArray());
        ((InterfaceC3949f) this.f40738c).u(hVar.d());
    }

    public void G(ExecutorC4387f executorC4387f, HashMap map, Cursor cursor, aa.f fVar) {
        byte[] blob = cursor.getBlob(0);
        int i5 = cursor.getInt(1);
        int i10 = cursor.getInt(2);
        Executor executor = executorC4387f;
        if (cursor.isLast()) {
            executor = AbstractC4392k.f47445b;
        }
        executor.execute(new Mb.a(this, blob, i5, i10, fVar, map));
    }

    @Override // r9.InterfaceC3940A
    public void K(InterfaceC3949f interfaceC3949f) {
        this.f40738c = interfaceC3949f;
    }

    @Override // r9.z
    public void a(h hVar) {
        ((HashSet) this.f40738c).remove(hVar);
    }

    @Override // r9.z
    public void b(h hVar) {
        ((HashSet) this.f40738c).add(hVar);
    }

    @Override // r9.z
    public void c(h hVar) {
        if (A(hVar)) {
            ((HashSet) this.f40738c).remove(hVar);
        } else {
            ((HashSet) this.f40738c).add(hVar);
        }
    }

    @Override // r9.z
    public long d() {
        return -1L;
    }

    @Override // od.InterfaceC3724t
    public void e(g gVar) {
        C3716q c3716q = (C3716q) this.f40738c;
        Xd.b.c();
        try {
            Xd.c cVar = c3716q.f42061b;
            Xd.b.a();
            Xd.b.b();
            c3716q.f42062c.execute(new C3707n(this, gVar));
            Xd.b.f16226a.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // od.InterfaceC3724t
    public void f(b0 b0Var) {
        C3716q c3716q = (C3716q) this.f40738c;
        Xd.b.c();
        try {
            Xd.c cVar = c3716q.f42061b;
            Xd.b.a();
            Xd.b.b();
            c3716q.f42062c.execute(new C3707n(this, b0Var));
            Xd.b.f16226a.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // r9.z
    public void g(h hVar) {
        ((HashSet) this.f40738c).add(hVar);
    }

    @Override // od.InterfaceC3724t
    public void h() {
        C3716q c3716q = (C3716q) this.f40738c;
        c0 c0Var = (c0) c3716q.f42060a.f4014e;
        c0Var.getClass();
        if (c0Var == c0.f40628a || c0Var == c0.f40629b) {
            return;
        }
        Xd.b.c();
        try {
            Xd.b.a();
            Xd.b.b();
            c3716q.f42062c.execute(new C3713p(this));
            Xd.b.f16226a.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // r9.z
    public void i() {
        t tVar = (t) this.f40737b;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashSet) this.f40738c).iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (!A(hVar)) {
                arrayList.add(hVar);
            }
        }
        tVar.f44669j.z(arrayList);
        this.f40738c = null;
    }

    @Override // r9.z
    public void j() {
        this.f40738c = new HashSet();
    }

    @Override // r9.z
    public void k(B b5) {
        this.f40736a = b5;
    }

    @Override // r9.z
    public void l(S s10) {
        t tVar = (t) this.f40737b;
        int i5 = s10.f44597b;
        r9.u uVar = tVar.f44667h;
        Iterator it = uVar.f44672b.z(i5).iterator();
        while (true) {
            C0295v c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                uVar.f44671a.remove(s10.f44596a);
                uVar.f44672b.C(s10.f44597b);
                return;
            } else {
                ((HashSet) this.f40738c).add((h) c0295v.next());
            }
        }
    }

    @Override // od.InterfaceC3724t
    public void m(k0 k0Var, EnumC3721s enumC3721s, b0 b0Var) {
        Xd.b.c();
        try {
            Xd.c cVar = ((C3716q) this.f40738c).f42061b;
            Xd.b.a();
            o(k0Var, b0Var);
            Xd.b.f16226a.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void n() {
        ((C4386e) this.f40738c).d();
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f40737b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            E();
        }
    }

    public void o(k0 k0Var, b0 b0Var) {
        C3716q c3716q = (C3716q) this.f40738c;
        r rVar = c3716q.f42068i.f40620a;
        c3716q.f42065f.getClass();
        if (rVar == null) {
            rVar = null;
        }
        if (k0Var.f40685a == j0.CANCELLED && rVar != null && rVar.a()) {
            J0 j02 = new J0((byte) 0, 2);
            c3716q.f42069j.i(j02);
            k0Var = k0.f40677h.b("ClientCall was cancelled at or after deadline. " + j02);
            b0Var = new b0();
        }
        Xd.b.b();
        c3716q.f42062c.execute(new C3710o(this, k0Var, b0Var));
    }

    public void p(int i5, io.flutter.view.e eVar) {
        ((FlutterJNI) this.f40737b).dispatchSemanticsAction(i5, eVar);
    }

    public void q(int i5, io.flutter.view.e eVar, Serializable serializable) {
        ((FlutterJNI) this.f40737b).dispatchSemanticsAction(i5, eVar, serializable);
    }

    public HashMap r(List list, b bVar, int i5, aa.f fVar, i iVar) {
        q qVar = bVar.f45362a.f45390a;
        StringBuilder sbH = AbstractC4397p.h(list.size(), "SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", " UNION ");
        sbH.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        boolean z2 = true;
        Object[] objArr = new Object[(list.size() * 9) + 1];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            s9.m mVar = (s9.m) it.next();
            String strN = AbstractC3230e0.n(mVar);
            int i11 = i10 + 1;
            objArr[i10] = strN;
            int i12 = i10 + 2;
            StringBuilder sb2 = new StringBuilder(strN);
            int length = sb2.length() - (z2 ? 1 : 0);
            char cCharAt = sb2.charAt(length);
            boolean z10 = z2 ? 1 : 0;
            if (cCharAt != z2) {
                z2 = false;
            }
            StringBuilder sb3 = sbH;
            Iterator it2 = it;
            c.z(z2, "successor may only operate on paths generated by encode", new Object[0]);
            sb2.setCharAt(length, (char) (cCharAt + 1));
            objArr[i11] = sb2.toString();
            objArr[i12] = Integer.valueOf(mVar.f45369a.size() + 1);
            long j8 = qVar.f45352a;
            objArr[i10 + 3] = Long.valueOf(j8);
            objArr[i10 + 4] = Long.valueOf(j8);
            int i13 = qVar.f45353b;
            objArr[i10 + 5] = Integer.valueOf(i13);
            objArr[i10 + 6] = Long.valueOf(j8);
            int i14 = i10 + 8;
            objArr[i10 + 7] = Integer.valueOf(i13);
            i10 += 9;
            objArr[i14] = AbstractC3230e0.n(bVar.f45363b.f45375a);
            it = it2;
            z2 = z10;
            sbH = sb3;
        }
        Object[] objArr2 = z2 ? 1 : 0;
        objArr[i10] = Integer.valueOf(i5);
        ExecutorC4387f executorC4387f = new ExecutorC4387f();
        HashMap map = new HashMap();
        C3618a c3618aG0 = ((K) this.f40736a).g0(sbH.toString());
        c3618aG0.b(objArr);
        Cursor cursorI = c3618aG0.i();
        while (cursorI.moveToNext()) {
            try {
                G(executorC4387f, map, cursorI, fVar);
                if (iVar != null) {
                    iVar.f10117b++;
                }
            } finally {
            }
        }
        cursorI.close();
        executorC4387f.b();
        return map;
    }

    public Method s(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2;
        Method methodT = t(cls, (String) this.f40737b, (Class[]) this.f40738c);
        if (methodT == null || (cls2 = (Class) this.f40736a) == null || cls2.isAssignableFrom(methodT.getReturnType())) {
            return methodT;
        }
        return null;
    }

    public Object u(SSLSocket sSLSocket, Object... objArr) throws NoSuchMethodException, SecurityException {
        Method methodS = s(sSLSocket.getClass());
        if (methodS == null) {
            throw new AssertionError("Method " + ((String) this.f40737b) + " not supported for object " + sSLSocket);
        }
        try {
            return methodS.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e7) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodS);
            assertionError.initCause(e7);
            throw assertionError;
        }
    }

    public void v(SSLSocket sSLSocket, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodS = s(sSLSocket.getClass());
            if (methodS == null) {
                return;
            }
            try {
                methodS.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e7) {
            Throwable targetException = e7.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object w(SSLSocket sSLSocket, Object... objArr) {
        try {
            return u(sSLSocket, objArr);
        } catch (InvocationTargetException e7) {
            Throwable targetException = e7.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // r9.InterfaceC3940A
    public Map x(String str, b bVar, int i5) {
        List listT = ((InterfaceC3949f) this.f40738c).t(str);
        ArrayList arrayList = new ArrayList(listT.size());
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add((s9.m) ((s9.m) it.next()).a(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        if (arrayList.size() * 9 < 900) {
            return r(arrayList, bVar, i5, null, null);
        }
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int i11 = i10 + 100;
            map.putAll(r(arrayList.subList(i10, Math.min(arrayList.size(), i11)), bVar, i5, null, null));
            i10 = i11;
        }
        d dVar = b.f45361e;
        m9.B b5 = AbstractC4397p.f47455a;
        if (map.size() <= i5) {
            return map;
        }
        ArrayList arrayList2 = new ArrayList(map.entrySet());
        Collections.sort(arrayList2, new s(dVar, 4));
        HashMap map2 = new HashMap();
        for (int i12 = 0; i12 < i5; i12++) {
            map2.put(((Map.Entry) arrayList2.get(i12)).getKey(), ((Map.Entry) arrayList2.get(i12)).getValue());
        }
        return map2;
    }

    @Override // r9.InterfaceC3940A
    public HashMap y(Iterable iterable) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            arrayList.add(AbstractC3230e0.n(hVar.f45375a));
            map.put(hVar, k.g(hVar));
        }
        K k = (K) this.f40736a;
        R1.q qVar = new R1.q();
        qVar.f10157a = 0;
        qVar.f10158b = k;
        qVar.f10159c = "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (";
        qVar.f10161e = Collections.EMPTY_LIST;
        qVar.f10160d = ") ORDER BY path";
        qVar.f10162f = arrayList.iterator();
        ExecutorC4387f executorC4387f = new ExecutorC4387f();
        while (((Iterator) qVar.f10162f).hasNext()) {
            Cursor cursorI = qVar.w().i();
            while (cursorI.moveToNext()) {
                try {
                    G(executorC4387f, map, cursorI, null);
                } catch (Throwable th) {
                    if (cursorI != null) {
                        try {
                            cursorI.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorI.close();
        }
        executorC4387f.b();
        return map;
    }

    @Override // r9.InterfaceC3940A
    public void z(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        c9.c cVarG = s9.g.f45372a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            arrayList2.add(AbstractC3230e0.n(hVar.f45375a));
            cVarG = cVarG.g(hVar, k.h(hVar, o.f45389b));
        }
        List list = Collections.EMPTY_LIST;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList3 = new ArrayList(list);
            for (int i5 = 0; it2.hasNext() && i5 < 900 - list.size(); i5++) {
                arrayList3.add(it2.next());
            }
            Object[] array = arrayList3.toArray();
            ((K) this.f40736a).f0("DELETE FROM remote_documents WHERE path IN (" + ((Object) AbstractC4397p.h(array.length, "?", ", ")) + ")", array);
        }
        ((InterfaceC3949f) this.f40738c).n(cVarG);
    }

    public C3558a(Class cls, String str, Class... clsArr) {
        this.f40736a = cls;
        this.f40737b = str;
        this.f40738c = clsArr;
    }
}
