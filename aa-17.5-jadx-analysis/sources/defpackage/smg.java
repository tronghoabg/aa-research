package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* loaded from: classes.dex */
public final class smg implements snk {
    public final skv a;
    public final slr b;
    public final /* synthetic */ smi e;
    public soh f = null;
    public Set c = null;
    public boolean d = false;

    public smg(smi smiVar, skv skvVar, slr slrVar) {
        this.e = smiVar;
        this.a = skvVar;
        this.b = slrVar;
    }

    @Override // defpackage.snk
    public final void a(ConnectionResult connectionResult) {
        this.e.o.post(new jpx(this, connectionResult, 14));
    }

    public final void b(ConnectionResult connectionResult) {
        sme smeVar = (sme) this.e.k.get(this.b);
        if (smeVar != null) {
            smeVar.l(connectionResult);
        }
    }

    public final void c() {
        soh sohVar;
        if (!this.d || (sohVar = this.f) == null) {
            return;
        }
        this.a.s(sohVar, this.c);
    }
}
