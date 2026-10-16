package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class adrs implements adyi {
    public static final Logger a = Logger.getLogger(adrs.class.getName());
    public final ScheduledExecutorService b;
    public final adnw c;
    public adtp d;
    public aebg e;

    public adrs(ScheduledExecutorService scheduledExecutorService, adnw adnwVar) {
        this.b = scheduledExecutorService;
        this.c = adnwVar;
    }

    @Override // defpackage.adyi
    public final void a() {
        adnw adnwVar = this.c;
        adnwVar.c();
        adnwVar.execute(new adpo(this, 3));
    }
}
