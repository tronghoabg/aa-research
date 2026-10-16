package com.google.android.gms.carsetup.fsm.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class FsmController {
    public static final defpackage.yqk a = defpackage.omv.n("FsmController");
    public static final java.lang.String b = "FsmController";
    private static final java.lang.Class m = defpackage.sff.class;
    public final android.content.Context c;
    final java.util.List d;
    public final java.lang.Class e;
    public final java.util.ArrayList f;
    public defpackage.sff g;
    boolean i;
    public defpackage.sfd j;
    public final defpackage.sfc l;
    int h = 1;
    final java.util.ArrayList k = new java.util.ArrayList();

    public FsmController(android.content.Context context, java.lang.Class cls, java.util.List list, defpackage.sfc sfcVar, android.os.Bundle bundle) {
        this.c = context.getApplicationContext();
        this.e = cls;
        this.d = list;
        this.l = sfcVar;
        if (bundle != null) {
            java.lang.String str = b;
            if (bundle.getParcelableArrayList(str) != null) {
                this.f = bundle.getParcelableArrayList(str);
                return;
            }
        }
        this.f = new java.util.ArrayList();
    }

    public final android.support.v4.app.Fragment a() {
        defpackage.sfd sfdVar = this.j;
        if (sfdVar != null) {
            return sfdVar.A();
        }
        return null;
    }

    public final void b(defpackage.sfd sfdVar) {
        this.j = sfdVar;
        while (true) {
            java.util.ArrayList arrayList = this.k;
            if (arrayList.isEmpty()) {
                return;
            } else {
                ((defpackage.sfb) arrayList.remove(0)).a(sfdVar);
            }
        }
    }

    public final void c(java.lang.Class cls, java.lang.String str, android.os.Parcelable parcelable) {
        defpackage.sff sffVar = this.g;
        defpackage.sff sffVarL = l(cls);
        this.g = sffVarL;
        h(sffVar, sffVarL, str);
        int i = this.h;
        this.h = i + 1;
        this.f.add(new com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry(cls, parcelable, i));
        m(str);
    }

    public final void d() {
        a.l().ai(8849).y("mCurrentStateClass=%s", this.g);
        e();
    }

    public final void e() {
        java.util.ArrayList arrayList = this.f;
        int size = arrayList.size();
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8850).w("State stack (size=%d)", size);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            yqkVar.l().ai(8851).D("    %d: %s", size, ((com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry) arrayList.get(size)).a.getName());
        }
    }

    public final void f(java.lang.String str, android.os.Parcelable parcelable) {
        defpackage.sfh sfhVar;
        defpackage.yqk yqkVar = a;
        yqkVar.f().ai(8852).y("fireEvent(%s)", str);
        if (this.i) {
            yqkVar.h().ai(8853).y("State machine already stopped.  Event will be dropped: %s", str);
            return;
        }
        defpackage.sff sffVar = this.g;
        if (sffVar == null) {
            throw new java.lang.IllegalArgumentException("Start state has not been initialized");
        }
        if (sffVar.b(str, parcelable)) {
            return;
        }
        defpackage.sfh[] sfhVarArrA = ((defpackage.sfi) this.g.getClass().getAnnotation(defpackage.sfi.class)).a();
        int length = sfhVarArrA.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                sfhVar = null;
                break;
            } else {
                if (str.equals(sfhVarArrA[i2].d())) {
                    sfhVar = sfhVarArrA[i2];
                    break;
                }
                i2++;
            }
        }
        if (sfhVar == null) {
            d();
            throw new java.lang.RuntimeException("Transition for event '" + str + "' not found on " + java.lang.String.valueOf(this.g.getClass()));
        }
        if (sfhVar.e()) {
            return;
        }
        this.g.d();
        this.k.clear();
        java.lang.Class clsC = sfhVar.c();
        java.lang.Class clsA = sfhVar.a();
        java.lang.Class clsB = sfhVar.b();
        java.lang.Class cls = m;
        boolean z = (clsA == cls && clsB == cls) ? false : true;
        if (clsC == cls && clsA == cls && clsB == cls) {
            d();
            java.util.ArrayList arrayList = this.f;
            throw new java.lang.RuntimeException("Transition for " + str + " on " + ((com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry) arrayList.get(arrayList.size() - 1)).a.getName() + " must have at least a push or pop");
        }
        if (clsB != cls) {
            java.util.ArrayList arrayList2 = this.f;
            if (((com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry) arrayList2.get(arrayList2.size() - 1)).a.equals(clsB)) {
                d();
                throw new java.lang.RuntimeException("Transition for " + str + " on " + ((com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry) arrayList2.get(arrayList2.size() - 1)).a.getName() + " can't popTo itself.");
            }
        }
        if (z) {
            java.util.ArrayList arrayList3 = this.f;
            int size = arrayList3.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry stackEntry = (com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry) arrayList3.get(size);
                java.lang.String name = clsA.getName();
                java.lang.Class cls2 = stackEntry.a;
                if (name.equals(cls2.getName())) {
                    break;
                } else if (clsB.getName().equals(cls2.getName())) {
                    size++;
                    break;
                }
            }
            if (size < 0) {
                d();
                if (clsA == cls) {
                    clsA = clsB;
                }
                throw new java.lang.RuntimeException("State " + java.lang.String.valueOf(clsA) + " not found in stack");
            }
            arrayList3.subList(size, arrayList3.size()).clear();
        }
        java.util.ArrayList arrayList4 = this.f;
        if (clsC != cls) {
            int size2 = arrayList4.size();
            while (i < size2) {
                java.lang.Class cls3 = ((com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry) arrayList4.get(i)).a;
                i++;
                if (cls3 == clsC) {
                    d();
                    throw new java.lang.RuntimeException(defpackage.a.bK(arrayList4, clsC, "State already appears in the stack: ", " "));
                }
            }
            c(clsC, str, parcelable);
            return;
        }
        int size3 = arrayList4.size();
        if (size3 <= 0) {
            this.i = true;
            i(new defpackage.sey(0));
            return;
        }
        com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry stackEntry2 = (com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry) arrayList4.get(size3 - 1);
        defpackage.sff sffVar2 = this.g;
        java.lang.Class cls4 = stackEntry2.a;
        android.os.Parcelable parcelable2 = stackEntry2.b;
        defpackage.sff sffVarL = l(cls4);
        this.g = sffVarL;
        h(sffVar2, sffVarL, str);
        m(str);
    }

    public final void g(defpackage.zbg zbgVar) {
        this.l.ga(zbgVar);
    }

    public final void h(defpackage.sff sffVar, defpackage.sff sffVar2, java.lang.String str) {
        int iA = sffVar == null ? -1 : sffVar.a();
        int iA2 = sffVar2 != null ? sffVar2.a() : -1;
        defpackage.sfc sfcVar = this.l;
        sfcVar.k(iA, iA2, sfcVar.b(str));
    }

    public final void i(defpackage.sfb sfbVar) {
        defpackage.sfd sfdVar = this.j;
        if (sfdVar != null) {
            sfbVar.a(sfdVar);
        } else {
            this.k.add(sfbVar);
        }
    }

    public final void j(android.content.Intent intent) {
        i(new defpackage.sfa(intent));
    }

    public final void k(java.lang.Class cls, android.os.Bundle bundle, boolean z) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        java.util.ArrayList arrayList = this.f;
        bundle.putInt("com.google.android.fsm.FsmController.ARG_STATE_ID", ((com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry) arrayList.get(arrayList.size() - 1)).d);
        i(new defpackage.sez(cls, bundle, z));
    }

    public final defpackage.sff l(java.lang.Class cls) {
        try {
            defpackage.sff sffVar = (defpackage.sff) cls.getDeclaredConstructor(null).newInstance(null);
            if (!cls.isAnnotationPresent(defpackage.sfi.class)) {
                d();
                throw new java.lang.RuntimeException("No @Transitions annotation on ".concat(java.lang.String.valueOf(java.lang.String.valueOf(sffVar.getClass()))));
            }
            sffVar.a = this.c;
            sffVar.b = this;
            return sffVar;
        } catch (java.lang.ReflectiveOperationException e) {
            d();
            throw new java.lang.RuntimeException("Unable to instantiate state class: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(cls))), e);
        }
    }

    public final void m(java.lang.String str) {
        e();
        java.util.List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.sfg) list.get(i)).a(str);
        }
        this.g.c(str);
    }

    public static final class StackEntry<DataT extends android.os.Parcelable> implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.carsetup.fsm.impl.FsmController.StackEntry> CREATOR = new defpackage.sjy(1);
        public final java.lang.Class a;
        public final android.os.Parcelable b;
        public final boolean c;
        public final int d;

        public StackEntry(android.os.Parcel parcel) {
            try {
                this.a = java.lang.Class.forName(parcel.readString());
                this.b = parcel.readParcelable(getClass().getClassLoader());
                this.c = parcel.readInt() != 0;
                this.d = parcel.readInt();
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String toString() {
            return "StackEntry{clazz=" + java.lang.String.valueOf(this.a) + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.a.getName());
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d);
        }

        public StackEntry(java.lang.Class cls, android.os.Parcelable parcelable, int i) {
            this.a = cls;
            this.b = parcelable;
            this.c = true;
            this.d = i;
        }
    }
}
