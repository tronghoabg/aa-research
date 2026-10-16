package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import java.util.Map;

/* loaded from: classes.dex */
public final class ndm implements nui {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ndm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    private static final String d(nuh nuhVar) {
        ComponentName componentName;
        nur nurVar = nuhVar.c;
        String str = nurVar.f;
        return (!str.equals("com.google.android.projection.gearhead") || (componentName = nurVar.B) == null) ? str : componentName.toString();
    }

    @Override // defpackage.nui
    public final void a(nuh nuhVar) throws PendingIntent.CanceledException {
        if (this.b == 0) {
            if (nuhVar.c.x == nuo.h) {
                Object obj = this.a;
                szp.j(((ndn) obj).d, nuhVar.d);
                return;
            }
            return;
        }
        mcb mcbVar = (mcb) this.a;
        Map map = mcbVar.a;
        String strD = d(nuhVar);
        if (map.containsKey(strD)) {
            mcbVar.a(strD).a(nuhVar.a);
        }
    }

    @Override // defpackage.nui
    public final void b(nuh nuhVar) {
        if (this.b != 0) {
            mca mcaVarA = ((mcb) this.a).a(d(nuhVar));
            String str = nuhVar.b;
            long j = nuhVar.a;
            mcaVarA.a.put(Long.valueOf(j), new mbz(str, j, nuhVar.c));
            return;
        }
        if (nuhVar.e && !nuhVar.c.k) {
            Object obj = this.a;
            szp.j(((ndn) obj).e, nuhVar.d);
        }
        if (nuhVar.c.x == nuo.h) {
            Object obj2 = this.a;
            szp.k(((ndn) obj2).d, nuhVar.d);
        }
    }

    @Override // defpackage.nui
    public final void c(yfq yfqVar) {
        if (this.b != 0) {
            return;
        }
        yfqVar.getClass();
    }
}
