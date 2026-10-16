package r9;

import A7.C0295v;
import a2.C1323c;
import com.google.protobuf.ByteString;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import w9.AbstractC4397p;

/* renamed from: r9.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3961s implements v {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f44658a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public c9.d f44659b = new c9.d(Collections.EMPTY_LIST, C3946c.f44604c);

    /* renamed from: c, reason: collision with root package name */
    public int f44660c = 1;

    /* renamed from: d, reason: collision with root package name */
    public ByteString f44661d = v9.B.f47037u;

    /* renamed from: e, reason: collision with root package name */
    public final t f44662e;

    /* renamed from: f, reason: collision with root package name */
    public final C1323c f44663f;

    public C3961s(t tVar) {
        this.f44662e = tVar;
        this.f44663f = tVar.f44666g;
    }

    @Override // r9.v
    public final void a() {
        if (this.f44658a.isEmpty()) {
            A6.c.z(this.f44659b.f19805a.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // r9.v
    public final t9.i b(int i5) {
        int iL = l(i5 + 1);
        if (iL < 0) {
            iL = 0;
        }
        ArrayList arrayList = this.f44658a;
        if (arrayList.size() > iL) {
            return (t9.i) arrayList.get(iL);
        }
        return null;
    }

    @Override // r9.v
    public final t9.i c(int i5) {
        int iL = l(i5);
        if (iL < 0) {
            return null;
        }
        ArrayList arrayList = this.f44658a;
        if (iL >= arrayList.size()) {
            return null;
        }
        t9.i iVar = (t9.i) arrayList.get(iL);
        A6.c.z(iVar.f45954a == i5, "If found batch must match", new Object[0]);
        return iVar;
    }

    @Override // r9.v
    public final ByteString d() {
        return this.f44661d;
    }

    @Override // r9.v
    public final void e(t9.i iVar) {
        int iL = l(iVar.f45954a);
        ArrayList arrayList = this.f44658a;
        A6.c.z(iL >= 0 && iL < arrayList.size(), "Batches must exist to be %s", "removed");
        A6.c.z(iL == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        arrayList.remove(0);
        c9.d dVarC = this.f44659b;
        Iterator it = iVar.f45957d.iterator();
        while (it.hasNext()) {
            s9.h hVar = ((t9.h) it.next()).f45951a;
            this.f44662e.k.b(hVar);
            dVarC = dVarC.c(new C3946c(hVar, iVar.f45954a));
        }
        this.f44659b = dVarC;
    }

    @Override // r9.v
    public final void f(ByteString byteString) {
        byteString.getClass();
        this.f44661d = byteString;
    }

    @Override // r9.v
    public final ArrayList g(Set set) {
        List list = Collections.EMPTY_LIST;
        m9.B b5 = AbstractC4397p.f47455a;
        c9.d dVar = new c9.d(list, new q6.d(24));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            s9.h hVar = (s9.h) it.next();
            C0295v c0295vB = this.f44659b.b(new C3946c(hVar, 0));
            while (((Iterator) c0295vB.f1081b).hasNext()) {
                C3946c c3946c = (C3946c) c0295vB.next();
                if (!hVar.equals(c3946c.f44606a)) {
                    break;
                }
                dVar = dVar.a(Integer.valueOf(c3946c.f44607b));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = dVar.iterator();
        while (true) {
            C0295v c0295v = (C0295v) it2;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                return arrayList;
            }
            t9.i iVarC = c(((Integer) c0295v.next()).intValue());
            if (iVarC != null) {
                arrayList.add(iVarC);
            }
        }
    }

    @Override // r9.v
    public final t9.i h(s8.q qVar, ArrayList arrayList, List list) {
        A6.c.z(!list.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i5 = this.f44660c;
        this.f44660c = i5 + 1;
        ArrayList arrayList2 = this.f44658a;
        int size = arrayList2.size();
        if (size > 0) {
            A6.c.z(((t9.i) arrayList2.get(size - 1)).f45954a < i5, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        t9.i iVar = new t9.i(i5, qVar, arrayList, list);
        arrayList2.add(iVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t9.h hVar = (t9.h) it.next();
            this.f44659b = this.f44659b.a(new C3946c(hVar.f45951a, i5));
            ((ad.L) this.f44663f.f17156b).e(hVar.f45951a.d());
        }
        return iVar;
    }

    @Override // r9.v
    public final int i() {
        if (this.f44658a.isEmpty()) {
            return -1;
        }
        return this.f44660c - 1;
    }

    @Override // r9.v
    public final void j(t9.i iVar, ByteString byteString) {
        int i5 = iVar.f45954a;
        int iL = l(i5);
        ArrayList arrayList = this.f44658a;
        A6.c.z(iL >= 0 && iL < arrayList.size(), "Batches must exist to be %s", "acknowledged");
        A6.c.z(iL == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        t9.i iVar2 = (t9.i) arrayList.get(iL);
        A6.c.z(i5 == iVar2.f45954a, "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(i5), Integer.valueOf(iVar2.f45954a));
        byteString.getClass();
        this.f44661d = byteString;
    }

    @Override // r9.v
    public final List k() {
        return DesugarCollections.unmodifiableList(this.f44658a);
    }

    public final int l(int i5) {
        ArrayList arrayList = this.f44658a;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return i5 - ((t9.i) arrayList.get(0)).f45954a;
    }

    @Override // r9.v
    public final void start() {
        if (this.f44658a.isEmpty()) {
            this.f44660c = 1;
        }
    }
}
