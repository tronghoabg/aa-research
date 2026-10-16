package okhttp3.internal.f;

import h.g.b.aq;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class n extends okhttp3.internal.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f56197a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.firebase.d.c.b f56198b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, com.google.firebase.d.c.b bVar) {
        super(str);
        this.f56197a = oVar;
        this.f56198b = bVar;
    }

    @Override // okhttp3.internal.b.a
    public final long b() {
        ad[] adVarArr;
        long jH;
        int i2;
        com.google.firebase.d.c.b bVar = this.f56198b;
        h.g.b.x.f(bVar, "settings");
        aq aqVar = new aq();
        w wVar = this.f56197a.f56199a;
        synchronized (wVar.q()) {
            synchronized (wVar) {
                com.google.firebase.d.c.b bVarT = wVar.T();
                adVarArr = null;
                com.google.firebase.d.c.b bVar2 = new com.google.firebase.d.c.b((byte[]) null);
                bVar2.n(bVarT);
                bVar2.n(bVar);
                aqVar.f48105a = bVar2;
                jH = ((com.google.firebase.d.c.b) aqVar.f48105a).h() - bVarT.h();
                if (jH != 0 && !wVar.h().isEmpty()) {
                    adVarArr = (ad[]) wVar.h().values().toArray(new ad[0]);
                }
                wVar.U((com.google.firebase.d.c.b) aqVar.f48105a);
                wVar.f56230j.l(new k(wVar.g() + " onSettings", wVar, aqVar));
            }
            try {
                wVar.q().k((com.google.firebase.d.c.b) aqVar.f48105a);
            } catch (IOException e2) {
                wVar.V(e2);
            }
        }
        if (adVarArr == null) {
            return -1L;
        }
        for (ad adVar : adVarArr) {
            synchronized (adVar) {
                adVar.q(jH);
            }
        }
        return -1L;
    }
}
