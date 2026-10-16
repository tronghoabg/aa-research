package defpackage;

import j$.time.Duration;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class pty implements zge {
    final /* synthetic */ vky a;
    final /* synthetic */ pwh b;
    final /* synthetic */ abow c;
    final /* synthetic */ yux d;
    final /* synthetic */ pwq e;
    final /* synthetic */ ptz f;
    final /* synthetic */ qaz g;

    public pty(ptz ptzVar, vky vkyVar, qaz qazVar, pwh pwhVar, abow abowVar, yux yuxVar, pwq pwqVar) {
        this.a = vkyVar;
        this.g = qazVar;
        this.b = pwhVar;
        this.c = abowVar;
        this.d = yuxVar;
        this.e = pwqVar;
        this.f = ptzVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        String[] strArr = vaq.a;
        xuv xuvVarC = xuw.c("GmmNetworkImpl.onFailure ", this.a);
        try {
            this.f.g(th, this.c, this.b, this.d.h, this.e, this.g);
            xuvVarC.close();
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.zge
    public final /* synthetic */ void b(Object obj) {
        zgp zgpVarW;
        abow abowVar = (abow) obj;
        String[] strArr = vaq.a;
        xuv xuvVarC = xuw.c("GmmNetworkImpl.onSuccess ", this.a);
        try {
            qaz qazVar = this.g;
            ptz ptzVar = this.f;
            qazVar.a(ptzVar.c);
            this.b.c();
            abow abowVar2 = this.c;
            ((Duration) qazVar.b).toMillis();
            ((Duration) qazVar.a).toMillis();
            pvq pvqVar = pvq.SUCCESS;
            yux yuxVar = this.d;
            int i = yuxVar.h;
            ptzVar.e(abowVar2, pvqVar);
            pwq pwqVar = this.e;
            trd trdVar = new trd(null);
            trdVar.a = abowVar2;
            int i2 = yuxVar.h;
            woy.Q(i2 >= 0, "negative numTries: %s", i2);
            trdVar.b = qazVar;
            pwqVar.b(new rjg(trdVar), abowVar);
            pub pubVar = ptzVar.i;
            yfy yfyVar = pub.a;
            if (yfyVar.containsKey(abowVar2.getClass())) {
                adpb adpbVar = (adpb) yfyVar.get(abowVar2.getClass());
                synchronized (qazVar) {
                    ArrayList arrayList = new ArrayList();
                    for (pwz pwzVar : qazVar.c) {
                        Duration duration = pwz.a;
                        arrayList.add(pwzVar.A);
                    }
                    zgpVarW = wub.W(arrayList);
                }
                wub.ah(zgpVarW, new oyj(pubVar, adpbVar, 4, null), pubVar.c);
            }
            xuvVarC.close();
        } catch (Throwable th) {
            try {
                xuvVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
