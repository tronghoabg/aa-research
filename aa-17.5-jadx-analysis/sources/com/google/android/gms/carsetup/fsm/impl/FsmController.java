package com.google.android.gms.carsetup.fsm.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import defpackage.a;
import defpackage.ols;
import defpackage.sec;
import defpackage.sed;
import defpackage.see;
import defpackage.sef;
import defpackage.seg;
import defpackage.seh;
import defpackage.sej;
import defpackage.sek;
import defpackage.sel;
import defpackage.sem;
import defpackage.sht;
import defpackage.ypf;
import defpackage.zab;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class FsmController {
    public static final ypf a = ols.R("FsmController");
    public static final String b = "FsmController";
    private static final Class m = sej.class;
    public final Context c;
    final List d;
    public final Class e;
    public final ArrayList f;
    public sej g;
    boolean i;
    public seh j;
    public final seg l;
    int h = 1;
    final ArrayList k = new ArrayList();

    public FsmController(Context context, Class cls, List list, seg segVar, Bundle bundle) {
        this.c = context.getApplicationContext();
        this.e = cls;
        this.d = list;
        this.l = segVar;
        if (bundle != null) {
            String str = b;
            if (bundle.getParcelableArrayList(str) != null) {
                this.f = bundle.getParcelableArrayList(str);
                return;
            }
        }
        this.f = new ArrayList();
    }

    public final Fragment a() {
        seh sehVar = this.j;
        if (sehVar != null) {
            return sehVar.A();
        }
        return null;
    }

    public final void b(seh sehVar) {
        this.j = sehVar;
        while (true) {
            ArrayList arrayList = this.k;
            if (arrayList.isEmpty()) {
                return;
            } else {
                ((sef) arrayList.remove(0)).a(sehVar);
            }
        }
    }

    public final void c(Class cls, String str, Parcelable parcelable) {
        sej sejVar = this.g;
        sej sejVarL = l(cls);
        this.g = sejVarL;
        h(sejVar, sejVarL, str);
        int i = this.h;
        this.h = i + 1;
        this.f.add(new StackEntry(cls, parcelable, i));
        m(str);
    }

    public final void d() {
        a.l().ai(8824).y("mCurrentStateClass=%s", this.g);
        e();
    }

    public final void e() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        ypf ypfVar = a;
        ypfVar.l().ai(8825).w("State stack (size=%d)", size);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ypfVar.l().ai(8826).D("    %d: %s", size, ((StackEntry) arrayList.get(size)).a.getName());
        }
    }

    public final void f(String str, Parcelable parcelable) {
        sel selVar;
        ypf ypfVar = a;
        ypfVar.f().ai(8827).y("fireEvent(%s)", str);
        if (this.i) {
            ypfVar.h().ai(8828).y("State machine already stopped.  Event will be dropped: %s", str);
            return;
        }
        sej sejVar = this.g;
        if (sejVar == null) {
            throw new IllegalArgumentException("Start state has not been initialized");
        }
        if (sejVar.b(str, parcelable)) {
            return;
        }
        sel[] selVarArrA = ((sem) this.g.getClass().getAnnotation(sem.class)).a();
        int length = selVarArrA.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                selVar = null;
                break;
            } else {
                if (str.equals(selVarArrA[i2].d())) {
                    selVar = selVarArrA[i2];
                    break;
                }
                i2++;
            }
        }
        if (selVar == null) {
            d();
            throw new RuntimeException("Transition for event '" + str + "' not found on " + String.valueOf(this.g.getClass()));
        }
        if (selVar.e()) {
            return;
        }
        this.g.d();
        this.k.clear();
        Class clsC = selVar.c();
        Class clsA = selVar.a();
        Class clsB = selVar.b();
        Class cls = m;
        boolean z = (clsA == cls && clsB == cls) ? false : true;
        if (clsC == cls && clsA == cls && clsB == cls) {
            d();
            throw new RuntimeException("Transition for " + str + " on " + ((StackEntry) this.f.get(r11.size() - 1)).a.getName() + " must have at least a push or pop");
        }
        if (clsB != cls) {
            ArrayList arrayList = this.f;
            if (((StackEntry) arrayList.get(arrayList.size() - 1)).a.equals(clsB)) {
                d();
                throw new RuntimeException("Transition for " + str + " on " + ((StackEntry) arrayList.get(arrayList.size() - 1)).a.getName() + " can't popTo itself.");
            }
        }
        if (z) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                StackEntry stackEntry = (StackEntry) arrayList2.get(size);
                String name = clsA.getName();
                Class cls2 = stackEntry.a;
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
                throw new RuntimeException("State " + String.valueOf(clsA) + " not found in stack");
            }
            arrayList2.subList(size, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f;
        if (clsC != cls) {
            int size2 = arrayList3.size();
            while (i < size2) {
                Class cls3 = ((StackEntry) arrayList3.get(i)).a;
                i++;
                if (cls3 == clsC) {
                    d();
                    throw new RuntimeException(a.bL(arrayList3, clsC, "State already appears in the stack: ", " "));
                }
            }
            c(clsC, str, parcelable);
            return;
        }
        int size3 = arrayList3.size();
        if (size3 <= 0) {
            this.i = true;
            i(new sec(0));
            return;
        }
        StackEntry stackEntry2 = (StackEntry) arrayList3.get(size3 - 1);
        sej sejVar2 = this.g;
        Class cls4 = stackEntry2.a;
        Parcelable parcelable2 = stackEntry2.b;
        sej sejVarL = l(cls4);
        this.g = sejVarL;
        h(sejVar2, sejVarL, str);
        m(str);
    }

    public final void g(zab zabVar) {
        this.l.gP(zabVar);
    }

    public final void h(sej sejVar, sej sejVar2, String str) {
        int iA = sejVar == null ? -1 : sejVar.a();
        int iA2 = sejVar2 != null ? sejVar2.a() : -1;
        seg segVar = this.l;
        segVar.k(iA, iA2, segVar.b(str));
    }

    public final void i(sef sefVar) {
        seh sehVar = this.j;
        if (sehVar != null) {
            sefVar.a(sehVar);
        } else {
            this.k.add(sefVar);
        }
    }

    public final void j(Intent intent) {
        i(new see(intent));
    }

    public final void k(Class cls, Bundle bundle, boolean z) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("com.google.android.fsm.FsmController.ARG_STATE_ID", ((StackEntry) this.f.get(r0.size() - 1)).d);
        i(new sed(cls, bundle, z));
    }

    public final sej l(Class cls) {
        try {
            sej sejVar = (sej) cls.getDeclaredConstructor(null).newInstance(null);
            if (!cls.isAnnotationPresent(sem.class)) {
                d();
                throw new RuntimeException("No @Transitions annotation on ".concat(String.valueOf(String.valueOf(sejVar.getClass()))));
            }
            sejVar.a = this.c;
            sejVar.b = this;
            return sejVar;
        } catch (ReflectiveOperationException e) {
            d();
            throw new RuntimeException("Unable to instantiate state class: ".concat(String.valueOf(String.valueOf(cls))), e);
        }
    }

    public final void m(String str) {
        e();
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((sek) list.get(i)).a(str);
        }
        this.g.c(str);
    }

    public static final class StackEntry<DataT extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<StackEntry> CREATOR = new sht(1);
        public final Class a;
        public final Parcelable b;
        public final boolean c;
        public final int d;

        public StackEntry(Parcel parcel) {
            try {
                this.a = Class.forName(parcel.readString());
                this.b = parcel.readParcelable(getClass().getClassLoader());
                this.c = parcel.readInt() != 0;
                this.d = parcel.readInt();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "StackEntry{clazz=" + String.valueOf(this.a) + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a.getName());
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d);
        }

        public StackEntry(Class cls, Parcelable parcelable, int i) {
            this.a = cls;
            this.b = parcelable;
            this.c = true;
            this.d = i;
        }
    }
}
