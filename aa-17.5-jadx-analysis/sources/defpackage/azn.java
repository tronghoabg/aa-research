package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class azn {
    public final zh a;
    public final long b;
    public final axe c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ cfm g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;
    final /* synthetic */ long j;
    final /* synthetic */ axr k;
    final /* synthetic */ azk l;
    final /* synthetic */ cfr m;
    private final azk n;

    public azn(long j, boolean z, axe axeVar, azk azkVar, int i, int i2, cfm cfmVar, cfr cfrVar, int i3, int i4, long j2, axr axrVar) {
        this.d = z;
        this.l = azkVar;
        this.e = i;
        this.f = i2;
        this.g = cfmVar;
        this.m = cfrVar;
        this.h = i3;
        this.i = i4;
        this.j = j2;
        this.k = axrVar;
        zh zhVar = zi.a;
        this.a = new zh(6);
        this.c = axeVar;
        this.n = azkVar;
        this.b = dlf.d(0, z ? dle.b(j) : Integer.MAX_VALUE, 0, z ? Alert.DURATION_SHOW_INDEFINITELY : dle.a(j));
    }

    public final axk a(int i, long j) {
        long j2;
        List list;
        axe axeVar = this.c;
        Object objD = axeVar.d(i);
        axeVar.c(i);
        zh zhVar = this.a;
        List list2 = (List) zhVar.a(i);
        if (list2 == null) {
            List listR = this.n.r(i);
            int size = listR.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((cto) listR.get(i2)).v(j));
            }
            j2 = j;
            zhVar.g(i, arrayList);
            list = arrayList;
        } else {
            j2 = j;
            list = list2;
        }
        return new axk(i, list, this.d, this.g, this.m, this.l.p(), this.h, this.i, i != this.e + (-1) ? this.f : 0, this.j, objD, this.k.k, j2);
    }

    public final smv b() {
        return this.c.c;
    }
}
