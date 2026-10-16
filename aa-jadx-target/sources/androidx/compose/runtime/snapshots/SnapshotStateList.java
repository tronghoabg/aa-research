package androidx.compose.runtime.snapshots;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006¨\u0006I"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "persistentList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "()V", "value", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "prependStateRecord", "", "toList", "", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "get", "index", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "add", "(ILjava/lang/Object;)V", "addAll", "clear", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", "retainAllInRange", "start", "end", "retainAllInRange$runtime", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/List;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "describeContents", "Companion", "runtime"}, k = 1, mv = {defpackage.eie.FLOAT_FIELD_NUMBER, 1, defpackage.abnt.b}, xi = 48)
public final class SnapshotStateList<T> implements android.os.Parcelable, java.util.List<T>, java.util.RandomAccess, defpackage.cfc, defpackage.afhd {
    public static final android.os.Parcelable.Creator<androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Object>> CREATOR = new defpackage.ceu();
    public defpackage.cfe a;

    public SnapshotStateList(defpackage.cbl cblVar) {
        defpackage.cej cejVarB = defpackage.cer.b();
        defpackage.cfb cfbVar = new defpackage.cfb(cejVarB.v(), cblVar);
        if (!(cejVarB instanceof defpackage.cec)) {
            cfbVar.h = new defpackage.cfb(1L, cblVar);
        }
        this.a = cfbVar;
    }

    public final int a() {
        defpackage.cfe cfeVar = this.a;
        cfeVar.getClass();
        return ((defpackage.cfb) defpackage.cer.h(cfeVar, this)).a.size();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0050 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(int r8, T r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = defpackage.cev.a
            monitor-enter(r0)
            cfe r1 = r7.a     // Catch: java.lang.Throwable -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L54
            cfe r1 = defpackage.cer.e(r1, r7)     // Catch: java.lang.Throwable -> L54
            cfb r1 = (defpackage.cfb) r1     // Catch: java.lang.Throwable -> L54
            int r2 = r1.b     // Catch: java.lang.Throwable -> L54
            cbl r1 = r1.a     // Catch: java.lang.Throwable -> L54
            monitor-exit(r0)
            r1.getClass()
            cbl r3 = r1.c(r8, r9)
            boolean r1 = defpackage.afga.f(r3, r1)
            if (r1 != 0) goto L53
            cfe r1 = r7.a
            r1.getClass()
            java.lang.Object r4 = defpackage.cer.b
            monitor-enter(r4)
            cej r5 = defpackage.cer.b()     // Catch: java.lang.Throwable -> L50
            cfe r1 = defpackage.cer.j(r1, r7, r5)     // Catch: java.lang.Throwable -> L50
            cfb r1 = (defpackage.cfb) r1     // Catch: java.lang.Throwable -> L50
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L50
            int r6 = r1.b     // Catch: java.lang.Throwable -> L4d
            if (r6 != r2) goto L44
            r1.a = r3     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.c     // Catch: java.lang.Throwable -> L4d
            r3 = 1
            int r2 = r2 + r3
            r1.c = r2     // Catch: java.lang.Throwable -> L4d
            int r6 = r6 + 1
            r1.b = r6     // Catch: java.lang.Throwable -> L4d
            goto L45
        L44:
            r3 = 0
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r4)
            defpackage.cer.q(r5, r7)
            if (r3 == 0) goto L0
            goto L53
        L4d:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r7     // Catch: java.lang.Throwable -> L50
        L50:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L53:
            return
        L54:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.add(int, java.lang.Object):void");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends T> collection) {
        int i;
        defpackage.cbl cblVar;
        boolean z;
        defpackage.cej cejVarB;
        do {
            java.lang.Object obj = defpackage.cev.a;
            synchronized (obj) {
                defpackage.cfe cfeVar = this.a;
                cfeVar.getClass();
                defpackage.cfb cfbVar = (defpackage.cfb) defpackage.cer.e(cfeVar, this);
                i = cfbVar.b;
                cblVar = cfbVar.a;
            }
            cblVar.getClass();
            defpackage.cbl cblVarD = cblVar.d(collection);
            z = false;
            if (defpackage.afga.f(cblVarD, cblVar)) {
                return false;
            }
            defpackage.cfe cfeVar2 = this.a;
            cfeVar2.getClass();
            synchronized (defpackage.cer.b) {
                cejVarB = defpackage.cer.b();
                defpackage.cfb cfbVar2 = (defpackage.cfb) defpackage.cer.j(cfeVar2, this, cejVarB);
                synchronized (obj) {
                    int i2 = cfbVar2.b;
                    if (i2 == i) {
                        cfbVar2.a = cblVarD;
                        cfbVar2.c++;
                        cfbVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            defpackage.cer.q(cejVarB, this);
        } while (!z);
        return true;
    }

    public final java.lang.Object b(int i) {
        int i2;
        defpackage.cbl cblVar;
        defpackage.cej cejVarB;
        boolean z;
        T t = get(i);
        do {
            java.lang.Object obj = defpackage.cev.a;
            synchronized (obj) {
                defpackage.cfe cfeVar = this.a;
                cfeVar.getClass();
                defpackage.cfb cfbVar = (defpackage.cfb) defpackage.cer.e(cfeVar, this);
                i2 = cfbVar.b;
                cblVar = cfbVar.a;
            }
            cblVar.getClass();
            defpackage.cbl cblVarH = cblVar.h(i);
            if (defpackage.afga.f(cblVarH, cblVar)) {
                break;
            }
            defpackage.cfe cfeVar2 = this.a;
            cfeVar2.getClass();
            synchronized (defpackage.cer.b) {
                cejVarB = defpackage.cer.b();
                defpackage.cfb cfbVar2 = (defpackage.cfb) defpackage.cer.j(cfeVar2, this, cejVarB);
                synchronized (obj) {
                    int i3 = cfbVar2.b;
                    if (i3 == i2) {
                        cfbVar2.a = cblVarH;
                        z = true;
                        cfbVar2.c++;
                        cfbVar2.b = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            defpackage.cer.q(cejVarB, this);
        } while (!z);
        return t;
    }

    @Override // defpackage.cfc
    /* JADX INFO: renamed from: c, reason: from getter */
    public final defpackage.cfe getA() {
        return this.a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        defpackage.cej cejVarB;
        defpackage.cfe cfeVar = this.a;
        cfeVar.getClass();
        synchronized (defpackage.cer.b) {
            cejVarB = defpackage.cer.b();
            defpackage.cfb cfbVar = (defpackage.cfb) defpackage.cer.j(cfeVar, this, cejVarB);
            synchronized (defpackage.cev.a) {
                cfbVar.a = defpackage.cbv.a;
                cfbVar.b++;
                cfbVar.c++;
            }
        }
        defpackage.cer.q(cejVarB, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        defpackage.cfe cfeVar = this.a;
        cfeVar.getClass();
        return ((defpackage.cfb) defpackage.cer.h(cfeVar, this)).a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        defpackage.cfe cfeVar = this.a;
        cfeVar.getClass();
        return ((defpackage.cfb) defpackage.cer.h(cfeVar, this)).a.containsAll(collection);
    }

    @Override // defpackage.cfc
    public final void d(defpackage.cfe cfeVar) {
        cfeVar.h = this.a;
        cfeVar.getClass();
        this.a = (defpackage.cfb) cfeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.util.List e() {
        defpackage.cfe cfeVar = this.a;
        cfeVar.getClass();
        return ((defpackage.cfb) defpackage.cer.h(cfeVar, this)).a;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r8, int r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = defpackage.cev.a
            monitor-enter(r0)
            cfe r1 = r7.a     // Catch: java.lang.Throwable -> L5f
            r1.getClass()     // Catch: java.lang.Throwable -> L5f
            cfe r1 = defpackage.cer.e(r1, r7)     // Catch: java.lang.Throwable -> L5f
            cfb r1 = (defpackage.cfb) r1     // Catch: java.lang.Throwable -> L5f
            int r2 = r1.b     // Catch: java.lang.Throwable -> L5f
            cbl r1 = r1.a     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)
            r1.getClass()
            cbr r3 = r1.j()
            java.util.List r4 = r3.subList(r8, r9)
            r4.clear()
            cbl r3 = r3.c()
            boolean r1 = defpackage.afga.f(r3, r1)
            if (r1 != 0) goto L5e
            cfe r1 = r7.a
            r1.getClass()
            java.lang.Object r4 = defpackage.cer.b
            monitor-enter(r4)
            cej r5 = defpackage.cer.b()     // Catch: java.lang.Throwable -> L5b
            cfe r1 = defpackage.cer.j(r1, r7, r5)     // Catch: java.lang.Throwable -> L5b
            cfb r1 = (defpackage.cfb) r1     // Catch: java.lang.Throwable -> L5b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L5b
            int r6 = r1.b     // Catch: java.lang.Throwable -> L58
            if (r6 != r2) goto L4f
            r1.a = r3     // Catch: java.lang.Throwable -> L58
            int r2 = r1.c     // Catch: java.lang.Throwable -> L58
            r3 = 1
            int r2 = r2 + r3
            r1.c = r2     // Catch: java.lang.Throwable -> L58
            int r6 = r6 + 1
            r1.b = r6     // Catch: java.lang.Throwable -> L58
            goto L50
        L4f:
            r3 = 0
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r4)
            defpackage.cer.q(r5, r7)
            if (r3 == 0) goto L0
            goto L5e
        L58:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r7     // Catch: java.lang.Throwable -> L5b
        L5b:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L5e:
            return
        L5f:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.f(int, int):void");
    }

    @Override // defpackage.cfc
    public final /* synthetic */ defpackage.cfe g(defpackage.cfe cfeVar, defpackage.cfe cfeVar2, defpackage.cfe cfeVar3) {
        return null;
    }

    @Override // java.util.List
    public final T get(int i) {
        defpackage.cfe cfeVar = this.a;
        cfeVar.getClass();
        return (T) ((defpackage.cfb) defpackage.cer.h(cfeVar, this)).a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        defpackage.cfe cfeVar = this.a;
        cfeVar.getClass();
        return ((defpackage.cfb) defpackage.cer.h(cfeVar, this)).a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        defpackage.cfe cfeVar = this.a;
        cfeVar.getClass();
        return ((defpackage.cfb) defpackage.cer.h(cfeVar, this)).a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return new defpackage.cfa(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        defpackage.cfe cfeVar = this.a;
        cfeVar.getClass();
        return ((defpackage.cfb) defpackage.cer.h(cfeVar, this)).a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new defpackage.cfa(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int i;
        defpackage.cbl cblVar;
        boolean z;
        defpackage.cej cejVarB;
        do {
            java.lang.Object obj2 = defpackage.cev.a;
            synchronized (obj2) {
                defpackage.cfe cfeVar = this.a;
                cfeVar.getClass();
                defpackage.cfb cfbVar = (defpackage.cfb) defpackage.cer.e(cfeVar, this);
                i = cfbVar.b;
                cblVar = cfbVar.a;
            }
            cblVar.getClass();
            defpackage.cbl cblVarE = cblVar.e(obj);
            z = false;
            if (defpackage.afga.f(cblVarE, cblVar)) {
                return false;
            }
            defpackage.cfe cfeVar2 = this.a;
            cfeVar2.getClass();
            synchronized (defpackage.cer.b) {
                cejVarB = defpackage.cer.b();
                defpackage.cfb cfbVar2 = (defpackage.cfb) defpackage.cer.j(cfeVar2, this, cejVarB);
                synchronized (obj2) {
                    int i2 = cfbVar2.b;
                    if (i2 == i) {
                        cfbVar2.a = cblVarE;
                        cfbVar2.c++;
                        cfbVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            defpackage.cer.q(cejVarB, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        int i;
        defpackage.cbl cblVar;
        boolean z;
        defpackage.cej cejVarB;
        do {
            java.lang.Object obj = defpackage.cev.a;
            synchronized (obj) {
                defpackage.cfe cfeVar = this.a;
                cfeVar.getClass();
                defpackage.cfb cfbVar = (defpackage.cfb) defpackage.cer.e(cfeVar, this);
                i = cfbVar.b;
                cblVar = cfbVar.a;
            }
            cblVar.getClass();
            defpackage.cbl cblVarF = cblVar.f(collection);
            z = false;
            if (defpackage.afga.f(cblVarF, cblVar)) {
                return false;
            }
            defpackage.cfe cfeVar2 = this.a;
            cfeVar2.getClass();
            synchronized (defpackage.cer.b) {
                cejVarB = defpackage.cer.b();
                defpackage.cfb cfbVar2 = (defpackage.cfb) defpackage.cer.j(cfeVar2, this, cejVarB);
                synchronized (obj) {
                    int i2 = cfbVar2.b;
                    if (i2 == i) {
                        cfbVar2.a = cblVarF;
                        cfbVar2.c++;
                        cfbVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            defpackage.cer.q(cejVarB, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return defpackage.cev.c(this, new defpackage.bjm(collection, 20));
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        defpackage.cbl cblVar;
        defpackage.cej cejVarB;
        boolean z;
        T t2 = get(i);
        do {
            java.lang.Object obj = defpackage.cev.a;
            synchronized (obj) {
                defpackage.cfe cfeVar = this.a;
                cfeVar.getClass();
                defpackage.cfb cfbVar = (defpackage.cfb) defpackage.cer.e(cfeVar, this);
                i2 = cfbVar.b;
                cblVar = cfbVar.a;
            }
            cblVar.getClass();
            defpackage.cbl cblVarI = cblVar.i(i, t);
            if (defpackage.afga.f(cblVarI, cblVar)) {
                break;
            }
            defpackage.cfe cfeVar2 = this.a;
            cfeVar2.getClass();
            synchronized (defpackage.cer.b) {
                cejVarB = defpackage.cer.b();
                defpackage.cfb cfbVar2 = (defpackage.cfb) defpackage.cer.j(cfeVar2, this, cejVarB);
                synchronized (obj) {
                    int i3 = cfbVar2.b;
                    if (i3 == i2) {
                        cfbVar2.a = cblVarI;
                        cfbVar2.b = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            defpackage.cer.q(cejVarB, this);
        } while (!z);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > a()) {
            defpackage.bxi.a("fromIndex or toIndex are out of bounds");
        }
        return new defpackage.cfg(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.afft.a(this);
    }

    public final java.lang.String toString() {
        defpackage.cfe cfeVar = this.a;
        cfeVar.getClass();
        return "SnapshotStateList(value=" + ((defpackage.cfb) defpackage.cer.e(cfeVar, this)).a + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List listE = e();
        int size = listE.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(listE.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) defpackage.afft.b(this, tArr);
    }

    @Override // java.util.List
    public final java.util.ListIterator<T> listIterator(int i) {
        return new defpackage.cfa(this, i);
    }

    public SnapshotStateList() {
        this(defpackage.cbv.a);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        defpackage.cbl cblVar;
        boolean z;
        defpackage.cej cejVarB;
        do {
            java.lang.Object obj = defpackage.cev.a;
            synchronized (obj) {
                defpackage.cfe cfeVar = this.a;
                cfeVar.getClass();
                defpackage.cfb cfbVar = (defpackage.cfb) defpackage.cer.e(cfeVar, this);
                i = cfbVar.b;
                cblVar = cfbVar.a;
            }
            cblVar.getClass();
            defpackage.cbl cblVarB = cblVar.b(t);
            z = false;
            if (defpackage.afga.f(cblVarB, cblVar)) {
                return false;
            }
            defpackage.cfe cfeVar2 = this.a;
            cfeVar2.getClass();
            synchronized (defpackage.cer.b) {
                cejVarB = defpackage.cer.b();
                defpackage.cfb cfbVar2 = (defpackage.cfb) defpackage.cer.j(cfeVar2, this, cejVarB);
                synchronized (obj) {
                    int i2 = cfbVar2.b;
                    if (i2 == i) {
                        cfbVar2.a = cblVarB;
                        cfbVar2.c++;
                        cfbVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            defpackage.cer.q(cejVarB, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final java.util.Collection<? extends T> collection) {
        return defpackage.cev.c(this, new defpackage.affc() { // from class: cet
            @Override // defpackage.affc
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(((java.util.List) obj).addAll(i, collection));
            }
        });
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) b(i);
    }
}
