package m9;

import A.AbstractC0213f;
import A7.C0295v;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.A1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p9.C3779D;
import p9.C3785f;
import p9.EnumC3784e;

/* loaded from: classes4.dex */
public final class Y implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final W f40458a;

    /* renamed from: b, reason: collision with root package name */
    public final C3779D f40459b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseFirestore f40460c;

    /* renamed from: d, reason: collision with root package name */
    public List f40461d;

    /* renamed from: e, reason: collision with root package name */
    public int f40462e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f40463f;

    public Y(W w2, C3779D c3779d, FirebaseFirestore firebaseFirestore) {
        w2.getClass();
        this.f40458a = w2;
        c3779d.getClass();
        this.f40459b = c3779d;
        firebaseFirestore.getClass();
        this.f40460c = firebaseFirestore;
        this.f40463f = new b0(!c3779d.f43334f.f19805a.isEmpty(), c3779d.f43333e);
    }

    public final List a() {
        int i5;
        int i10;
        int iF;
        int i11 = 2;
        boolean zB = AbstractC0213f.b(2, 1);
        C3779D c3779d = this.f40459b;
        if (zB && c3779d.f43336h) {
            throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
        }
        if (this.f40461d == null || this.f40462e != 1) {
            ArrayList arrayList = new ArrayList();
            boolean zIsEmpty = c3779d.f43331c.f45376a.isEmpty();
            ArrayList arrayList2 = c3779d.f43332d;
            int iF2 = -1;
            FirebaseFirestore firebaseFirestore = this.f40460c;
            c9.d dVar = c3779d.f43334f;
            boolean z2 = c3779d.f43333e;
            if (zIsEmpty) {
                Iterator it = arrayList2.iterator();
                s9.k kVar = null;
                int i12 = 0;
                while (it.hasNext()) {
                    C3785f c3785f = (C3785f) it.next();
                    s9.k kVar2 = c3785f.f43353b;
                    X x5 = new X(firebaseFirestore, kVar2.f45380a, kVar2, z2, dVar.f19805a.a(kVar2.f45380a));
                    A6.c.z(c3785f.f43352a == EnumC3784e.f43348b, "Invalid added event for first snapshot", new Object[0]);
                    A6.c.z(kVar == null || c3779d.f43329a.a().compare(kVar, kVar2) < 0, "Got added events in wrong order", new Object[0]);
                    arrayList.add(new C3510i(x5, 1, -1, i12));
                    i12++;
                    kVar = kVar2;
                }
            } else {
                Iterator it2 = arrayList2.iterator();
                s9.i iVarA = c3779d.f43331c;
                while (it2.hasNext()) {
                    C3785f c3785f2 = (C3785f) it2.next();
                    if (c3785f2.f43352a != EnumC3784e.f43350d) {
                        s9.k kVar3 = c3785f2.f43353b;
                        X x10 = new X(firebaseFirestore, kVar3.f45380a, kVar3, z2, dVar.f19805a.a(kVar3.f45380a));
                        EnumC3784e enumC3784e = c3785f2.f43352a;
                        int iOrdinal = enumC3784e.ordinal();
                        if (iOrdinal == 0) {
                            i5 = 3;
                        } else if (iOrdinal == 1) {
                            i5 = 1;
                        } else {
                            if (iOrdinal != i11 && iOrdinal != 3) {
                                throw new IllegalArgumentException("Unknown view change type: " + enumC3784e);
                            }
                            i5 = i11;
                        }
                        if (i5 != 1) {
                            c9.c cVar = iVarA.f45376a;
                            s9.h hVar = kVar3.f45380a;
                            s9.k kVar4 = (s9.k) cVar.b(hVar);
                            if (kVar4 != null) {
                                iF2 = iVarA.f45377b.f19805a.f(kVar4);
                            }
                            A6.c.z(iF2 >= 0, "Index for document not found", new Object[0]);
                            iVarA = iVarA.a(hVar);
                            i10 = 3;
                        } else {
                            i10 = 3;
                            iF2 = -1;
                        }
                        if (i5 != i10) {
                            iVarA.getClass();
                            s9.h hVar2 = kVar3.f45380a;
                            s9.i iVarA2 = iVarA.a(hVar2);
                            c9.c cVarG = iVarA2.f45376a.g(hVar2, kVar3);
                            c9.d dVarA = iVarA2.f45377b.a(kVar3);
                            s9.i iVar = new s9.i(cVarG, dVarA);
                            s9.k kVar5 = (s9.k) cVarG.b(hVar2);
                            iF = kVar5 == null ? -1 : dVarA.f19805a.f(kVar5);
                            A6.c.z(iF >= 0, "Index for document not found", new Object[0]);
                            iVarA = iVar;
                        } else {
                            iF = -1;
                        }
                        arrayList.add(new C3510i(x10, i5, iF2, iF));
                        i11 = 2;
                        iF2 = -1;
                    }
                }
            }
            this.f40461d = DesugarCollections.unmodifiableList(arrayList);
            this.f40462e = 1;
        }
        return this.f40461d;
    }

    public final ArrayList b() {
        C3779D c3779d = this.f40459b;
        ArrayList arrayList = new ArrayList(c3779d.f43330b.f45376a.size());
        Iterator it = c3779d.f43330b.f45377b.iterator();
        while (true) {
            C0295v c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                return arrayList;
            }
            s9.k kVar = (s9.k) c0295v.next();
            arrayList.add(new X(this.f40460c, kVar.f45380a, kVar, c3779d.f43333e, c3779d.f43334f.f19805a.a(kVar.f45380a)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        return this.f40460c.equals(y10.f40460c) && this.f40458a.equals(y10.f40458a) && this.f40459b.equals(y10.f40459b) && this.f40463f.equals(y10.f40463f);
    }

    public final int hashCode() {
        return this.f40463f.hashCode() + ((this.f40459b.hashCode() + ((this.f40458a.hashCode() + (this.f40460c.hashCode() * 31)) * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new A1(this, (C0295v) this.f40459b.f43330b.f45377b.iterator());
    }
}
