package defpackage;

import android.content.Context;
import java.util.IdentityHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class adoh extends adjy {
    public final adwb a;
    public final ados b;
    private boolean c;

    public adoh(adod adodVar, Context context, adqq adqqVar) {
        ados adosVar = new ados();
        adosVar.a = context;
        adosVar.h = adqqVar;
        this.b = adosVar;
        this.a = new adwb(adodVar, adodVar.c(), adosVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        woy.aa(!this.c, "Idle timeouts are not supported when strict lifecycle management is enabled");
        super.c(60L, timeUnit);
    }

    @Override // defpackage.adjx, defpackage.adlo
    public final adlm a() {
        adwb adwbVar = this.a;
        adwt adwtVar = adwbVar.g;
        adwtVar.getClass();
        ados adosVar = this.b;
        adosVar.b = adwtVar;
        adml admlVar = adoe.a;
        Context context = adosVar.a;
        if (adwbVar.l == null) {
            adwbVar.l = new IdentityHashMap();
        }
        IdentityHashMap identityHashMap = adwbVar.l;
        context.getClass();
        identityHashMap.put(admlVar, context);
        return super.a();
    }

    @Override // defpackage.adjy, defpackage.adjx
    public final adlo b() {
        return this.a;
    }

    public final void d() {
        this.c = true;
        super.c(1000L, TimeUnit.DAYS);
    }
}
