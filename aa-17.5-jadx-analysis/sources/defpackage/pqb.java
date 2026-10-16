package defpackage;

import j$.util.Map;
import java.util.Map;

/* loaded from: classes2.dex */
final class pqb implements pwq {
    final /* synthetic */ ppw a;
    final /* synthetic */ pqc b;

    public pqb(pqc pqcVar, ppw ppwVar) {
        this.a = ppwVar;
        this.b = pqcVar;
    }

    @Override // defpackage.pwq
    public final void a(rjg rjgVar, pwu pwuVar) {
        ((ynz) ((ynz) pqe.a.f()).ai((char) 6815)).u("Got failed parameters response!");
        Map map = this.b.i.o;
        synchronized (map) {
            Map.EL.putIfAbsent(map, pwuVar, 0);
            map.put(pwuVar, Integer.valueOf(((Integer) map.get(pwuVar)).intValue() + 1));
        }
        ((ynz) ((ynz) ((ynz) pqe.a.h()).p(pwuVar.s)).ai(6816)).y("Failed to get a successful parameters response, %s", pwuVar);
        pqc pqcVar = this.b;
        Object obj = rjgVar.b;
        ppw ppwVar = this.a;
        pqcVar.i.e(pqcVar, (acbt) obj, null, pwuVar, 0, ppwVar);
    }

    @Override // defpackage.pwq
    public final /* synthetic */ void b(rjg rjgVar, Object obj) {
        acbu acbuVar = (acbu) obj;
        ((ynz) ((ynz) pqe.a.f()).ai((char) 6817)).u("Got a successful parameters response!");
        pqc pqcVar = this.b;
        pqe pqeVar = pqcVar.i;
        pqeVar.e(pqcVar, (acbt) rjgVar.b, acbuVar, null, 0, this.a);
    }
}
