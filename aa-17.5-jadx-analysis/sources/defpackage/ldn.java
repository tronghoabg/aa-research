package defpackage;

import com.google.android.apps.auto.components.telemetry.TelemetryEvent;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class ldn implements ohv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ohv
    public final void a(TelemetryEvent telemetryEvent) {
        yyz yyzVar;
        if (this.b == 0) {
            yyz yyzVar2 = telemetryEvent.b.p;
            if (yyzVar2 == null) {
                yyzVar2 = yyz.a;
            }
            zab zabVar = telemetryEvent.b.o;
            if (zabVar == null) {
                zabVar = zab.a;
            }
            Object obj = this.a;
            int i = telemetryEvent.b.b;
            boolean z = (i & 8192) != 0;
            boolean z2 = (i & 4096) != 0;
            if ((z && yyzVar2.d == 251) || (z2 && zabVar.d == 300)) {
                ((ldo) obj).g();
                return;
            }
            if ((z && yyzVar2.d == 252) || (z2 && zabVar.d == 321)) {
                ((ype) ldo.a.l().ai((char) 3767)).u("Stopping FeedbackNotificationManager session.");
                ldo ldoVar = (ldo) obj;
                ldoVar.e = false;
                ldoVar.c.postDelayed(ldoVar.h, ldo.b);
                ldoVar.f = true;
                return;
            }
            return;
        }
        yxb yxbVar = telemetryEvent.b;
        yxbVar.getClass();
        byte[] bArr = null;
        if ((yxbVar.b & 8192) != 0) {
            yyzVar = yxbVar.p;
            if (yyzVar == null) {
                yyzVar = yyz.a;
            }
        } else {
            yyzVar = null;
        }
        if (yyzVar != null) {
            Object obj2 = this.a;
            int i2 = yyzVar.d;
            if (i2 == 251) {
                lcq.b.l().u("Starting lifetime");
                ((lcq) obj2).e.clear();
                return;
            }
            if (i2 != 252) {
                return;
            }
            lcq.b.l().u("Ending lifetime");
            lcq lcqVar = (lcq) obj2;
            lda ldaVar = lcqVar.d;
            ygr ygrVarV = wub.v(lcqVar.e);
            kmn kmnVar = new kmn(19);
            zfq zfqVar = zfq.a;
            Iterator<E> it = ygrVarV.iterator();
            while (it.hasNext()) {
                lnm.M((lbt) it.next(), yzy.FW);
            }
            if (acpl.f().length() > 0) {
                new kzu(ygrVarV, kmnVar, 3, bArr).run();
                return;
            }
            lda.b.l().u("Proof mode survey empty");
            lcy lcyVar = ldaVar.d;
            wub.ah(ygrVarV.isEmpty() ? wub.Y(afbg.a) : acpo.c() ? zfb.f(lcyVar.e.D(), new ikk(new kut(ygrVarV, 14), 10), zfqVar) : zfb.f(lcyVar.d.c(), new ikk(new kut(ygrVarV, 12), 11), zfqVar), new oyu((afec) kmnVar, ldaVar, (Set) ygrVarV, 1), zfqVar);
        }
    }
}
