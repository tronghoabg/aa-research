package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class we {
    final Set a;
    final Set b;
    final Set c;
    public int d;
    int e;
    public int f;
    boolean g;
    boolean h;
    public boolean i;
    boolean j;
    wi k;

    public we(wf wfVar) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        HashSet hashSet2 = new HashSet();
        this.b = hashSet2;
        HashSet hashSet3 = new HashSet();
        this.c = hashSet3;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = wi.b;
        wfVar.getClass();
        this.d = wfVar.h;
        this.e = wfVar.i;
        this.f = wfVar.j;
        this.k = wfVar.o;
        hashSet.addAll(wfVar.p);
        hashSet2.addAll(wfVar.q);
        hashSet3.addAll(wfVar.r);
        this.g = wfVar.k;
        this.h = wfVar.l;
        this.i = wfVar.m;
        this.j = wfVar.n;
    }

    public final void a(int i) {
        this.c.add(Integer.valueOf(i));
    }

    public final void b() {
        this.e = 1;
    }

    public final void c() {
        this.g = true;
    }

    public final void d() {
        this.j = true;
    }

    public we() {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new HashSet();
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = wi.b;
    }
}
