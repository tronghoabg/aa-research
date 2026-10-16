package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afec;
import defpackage.afet;
import defpackage.affa;
import defpackage.afgd;
import defpackage.bxc;
import defpackage.cbf;
import defpackage.cbl;
import defpackage.cbp;
import defpackage.cdv;
import defpackage.cec;
import defpackage.cek;
import defpackage.cen;
import defpackage.ceo;
import defpackage.cep;
import defpackage.cet;
import defpackage.ceu;
import defpackage.cev;
import defpackage.cex;
import defpackage.cez;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006¨\u0006I"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "persistentList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "()V", "value", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "prependStateRecord", "", "toList", "", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "get", "index", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "add", "(ILjava/lang/Object;)V", "addAll", "clear", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", "retainAllInRange", "start", "end", "retainAllInRange$runtime", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/List;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "describeContents", "Companion", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements Parcelable, List<T>, RandomAccess, cev, afgd {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new cen();
    public cex a;

    public SnapshotStateList(cbf cbfVar) {
        cec cecVarB = cek.b();
        ceu ceuVar = new ceu(cecVarB.v(), cbfVar);
        if (!(cecVarB instanceof cdv)) {
            ceuVar.h = new ceu(1L, cbfVar);
        }
        this.a = ceuVar;
    }

    public final int a() {
        cex cexVar = this.a;
        cexVar.getClass();
        return ((ceu) cek.h(cexVar, this)).a.size();
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        cbf cbfVar;
        cec cecVarB;
        boolean z;
        do {
            Object obj = ceo.a;
            synchronized (obj) {
                cex cexVar = this.a;
                cexVar.getClass();
                ceu ceuVar = (ceu) cek.e(cexVar, this);
                i2 = ceuVar.b;
                cbfVar = ceuVar.a;
            }
            cbfVar.getClass();
            cbf cbfVarC = cbfVar.c(i, t);
            if (affa.f(cbfVarC, cbfVar)) {
                return;
            }
            cex cexVar2 = this.a;
            cexVar2.getClass();
            synchronized (cek.b) {
                cecVarB = cek.b();
                ceu ceuVar2 = (ceu) cek.j(cexVar2, this, cecVarB);
                synchronized (obj) {
                    int i3 = ceuVar2.b;
                    if (i3 == i2) {
                        ceuVar2.a = cbfVarC;
                        z = true;
                        ceuVar2.c++;
                        ceuVar2.b = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            cek.q(cecVarB, this);
        } while (!z);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        cbf cbfVar;
        boolean z;
        cec cecVarB;
        do {
            Object obj = ceo.a;
            synchronized (obj) {
                cex cexVar = this.a;
                cexVar.getClass();
                ceu ceuVar = (ceu) cek.e(cexVar, this);
                i = ceuVar.b;
                cbfVar = ceuVar.a;
            }
            cbfVar.getClass();
            cbf cbfVarD = cbfVar.d(collection);
            z = false;
            if (affa.f(cbfVarD, cbfVar)) {
                return false;
            }
            cex cexVar2 = this.a;
            cexVar2.getClass();
            synchronized (cek.b) {
                cecVarB = cek.b();
                ceu ceuVar2 = (ceu) cek.j(cexVar2, this, cecVarB);
                synchronized (obj) {
                    int i2 = ceuVar2.b;
                    if (i2 == i) {
                        ceuVar2.a = cbfVarD;
                        ceuVar2.c++;
                        ceuVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            cek.q(cecVarB, this);
        } while (!z);
        return true;
    }

    public final Object b(int i) {
        int i2;
        cbf cbfVar;
        cec cecVarB;
        boolean z;
        T t = get(i);
        do {
            Object obj = ceo.a;
            synchronized (obj) {
                cex cexVar = this.a;
                cexVar.getClass();
                ceu ceuVar = (ceu) cek.e(cexVar, this);
                i2 = ceuVar.b;
                cbfVar = ceuVar.a;
            }
            cbfVar.getClass();
            cbf cbfVarH = cbfVar.h(i);
            if (affa.f(cbfVarH, cbfVar)) {
                break;
            }
            cex cexVar2 = this.a;
            cexVar2.getClass();
            synchronized (cek.b) {
                cecVarB = cek.b();
                ceu ceuVar2 = (ceu) cek.j(cexVar2, this, cecVarB);
                synchronized (obj) {
                    int i3 = ceuVar2.b;
                    if (i3 == i2) {
                        ceuVar2.a = cbfVarH;
                        z = true;
                        ceuVar2.c++;
                        ceuVar2.b = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            cek.q(cecVarB, this);
        } while (!z);
        return t;
    }

    @Override // defpackage.cev
    /* renamed from: c, reason: from getter */
    public final cex getA() {
        return this.a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        cec cecVarB;
        cex cexVar = this.a;
        cexVar.getClass();
        synchronized (cek.b) {
            cecVarB = cek.b();
            ceu ceuVar = (ceu) cek.j(cexVar, this, cecVarB);
            synchronized (ceo.a) {
                ceuVar.a = cbp.a;
                ceuVar.b++;
                ceuVar.c++;
            }
        }
        cek.q(cecVarB, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        cex cexVar = this.a;
        cexVar.getClass();
        return ((ceu) cek.h(cexVar, this)).a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        cex cexVar = this.a;
        cexVar.getClass();
        return ((ceu) cek.h(cexVar, this)).a.containsAll(collection);
    }

    @Override // defpackage.cev
    public final void d(cex cexVar) {
        cexVar.h = this.a;
        cexVar.getClass();
        this.a = (ceu) cexVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List e() {
        cex cexVar = this.a;
        cexVar.getClass();
        return ((ceu) cek.h(cexVar, this)).a;
    }

    public final void f(int i, int i2) {
        int i3;
        cbf cbfVar;
        cec cecVarB;
        boolean z;
        do {
            Object obj = ceo.a;
            synchronized (obj) {
                cex cexVar = this.a;
                cexVar.getClass();
                ceu ceuVar = (ceu) cek.e(cexVar, this);
                i3 = ceuVar.b;
                cbfVar = ceuVar.a;
            }
            cbfVar.getClass();
            cbl cblVarJ = cbfVar.j();
            cblVarJ.subList(i, i2).clear();
            cbf cbfVarC = cblVarJ.c();
            if (affa.f(cbfVarC, cbfVar)) {
                return;
            }
            cex cexVar2 = this.a;
            cexVar2.getClass();
            synchronized (cek.b) {
                cecVarB = cek.b();
                ceu ceuVar2 = (ceu) cek.j(cexVar2, this, cecVarB);
                synchronized (obj) {
                    int i4 = ceuVar2.b;
                    if (i4 == i3) {
                        ceuVar2.a = cbfVarC;
                        z = true;
                        ceuVar2.c++;
                        ceuVar2.b = i4 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            cek.q(cecVarB, this);
        } while (!z);
    }

    @Override // defpackage.cev
    public final /* synthetic */ cex g(cex cexVar, cex cexVar2, cex cexVar3) {
        return null;
    }

    @Override // java.util.List
    public final T get(int i) {
        cex cexVar = this.a;
        cexVar.getClass();
        return (T) ((ceu) cek.h(cexVar, this)).a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        cex cexVar = this.a;
        cexVar.getClass();
        return ((ceu) cek.h(cexVar, this)).a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        cex cexVar = this.a;
        cexVar.getClass();
        return ((ceu) cek.h(cexVar, this)).a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new cet(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        cex cexVar = this.a;
        cexVar.getClass();
        return ((ceu) cek.h(cexVar, this)).a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new cet(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        cbf cbfVar;
        boolean z;
        cec cecVarB;
        do {
            Object obj2 = ceo.a;
            synchronized (obj2) {
                cex cexVar = this.a;
                cexVar.getClass();
                ceu ceuVar = (ceu) cek.e(cexVar, this);
                i = ceuVar.b;
                cbfVar = ceuVar.a;
            }
            cbfVar.getClass();
            cbf cbfVarE = cbfVar.e(obj);
            z = false;
            if (affa.f(cbfVarE, cbfVar)) {
                return false;
            }
            cex cexVar2 = this.a;
            cexVar2.getClass();
            synchronized (cek.b) {
                cecVarB = cek.b();
                ceu ceuVar2 = (ceu) cek.j(cexVar2, this, cecVarB);
                synchronized (obj2) {
                    int i2 = ceuVar2.b;
                    if (i2 == i) {
                        ceuVar2.a = cbfVarE;
                        ceuVar2.c++;
                        ceuVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            cek.q(cecVarB, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        cbf cbfVar;
        boolean z;
        cec cecVarB;
        do {
            Object obj = ceo.a;
            synchronized (obj) {
                cex cexVar = this.a;
                cexVar.getClass();
                ceu ceuVar = (ceu) cek.e(cexVar, this);
                i = ceuVar.b;
                cbfVar = ceuVar.a;
            }
            cbfVar.getClass();
            cbf cbfVarF = cbfVar.f(collection);
            z = false;
            if (affa.f(cbfVarF, cbfVar)) {
                return false;
            }
            cex cexVar2 = this.a;
            cexVar2.getClass();
            synchronized (cek.b) {
                cecVarB = cek.b();
                ceu ceuVar2 = (ceu) cek.j(cexVar2, this, cecVarB);
                synchronized (obj) {
                    int i2 = ceuVar2.b;
                    if (i2 == i) {
                        ceuVar2.a = cbfVarF;
                        ceuVar2.c++;
                        ceuVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            cek.q(cecVarB, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return ceo.c(this, new cep(collection, 1));
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        cbf cbfVar;
        cec cecVarB;
        boolean z;
        T t2 = get(i);
        do {
            Object obj = ceo.a;
            synchronized (obj) {
                cex cexVar = this.a;
                cexVar.getClass();
                ceu ceuVar = (ceu) cek.e(cexVar, this);
                i2 = ceuVar.b;
                cbfVar = ceuVar.a;
            }
            cbfVar.getClass();
            cbf cbfVarI = cbfVar.i(i, t);
            if (affa.f(cbfVarI, cbfVar)) {
                break;
            }
            cex cexVar2 = this.a;
            cexVar2.getClass();
            synchronized (cek.b) {
                cecVarB = cek.b();
                ceu ceuVar2 = (ceu) cek.j(cexVar2, this, cecVarB);
                synchronized (obj) {
                    int i3 = ceuVar2.b;
                    if (i3 == i2) {
                        ceuVar2.a = cbfVarI;
                        ceuVar2.b = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            cek.q(cecVarB, this);
        } while (!z);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > a()) {
            bxc.a("fromIndex or toIndex are out of bounds");
        }
        return new cez(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return afet.a(this);
    }

    public final String toString() {
        cex cexVar = this.a;
        cexVar.getClass();
        return "SnapshotStateList(value=" + ((ceu) cek.e(cexVar, this)).a + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List listE = e();
        int size = listE.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(listE.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) afet.b(this, tArr);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new cet(this, i);
    }

    public SnapshotStateList() {
        this(cbp.a);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        cbf cbfVar;
        boolean z;
        cec cecVarB;
        do {
            Object obj = ceo.a;
            synchronized (obj) {
                cex cexVar = this.a;
                cexVar.getClass();
                ceu ceuVar = (ceu) cek.e(cexVar, this);
                i = ceuVar.b;
                cbfVar = ceuVar.a;
            }
            cbfVar.getClass();
            cbf cbfVarB = cbfVar.b(t);
            z = false;
            if (affa.f(cbfVarB, cbfVar)) {
                return false;
            }
            cex cexVar2 = this.a;
            cexVar2.getClass();
            synchronized (cek.b) {
                cecVarB = cek.b();
                ceu ceuVar2 = (ceu) cek.j(cexVar2, this, cecVarB);
                synchronized (obj) {
                    int i2 = ceuVar2.b;
                    if (i2 == i) {
                        ceuVar2.a = cbfVarB;
                        ceuVar2.c++;
                        ceuVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            cek.q(cecVarB, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection<? extends T> collection) {
        return ceo.c(this, new afec() { // from class: cem
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) b(i);
    }
}
