package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class adwd extends adtx {
    private final adwc e;
    private static final ReferenceQueue c = new ReferenceQueue();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    public static final Logger b = Logger.getLogger(adwd.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adwd(adlm adlmVar) {
        super(adlmVar);
        ReferenceQueue referenceQueue = c;
        ConcurrentMap concurrentMap = d;
        this.e = new adwc(this, adlmVar, referenceQueue, concurrentMap);
    }

    @Override // defpackage.adtx, defpackage.adlm
    public final void c() {
        int i = adwc.b;
        adwc adwcVar = this.e;
        if (!adwcVar.a.getAndSet(true)) {
            adwcVar.clear();
        }
        if (getClass() == null) {
            throw new AssertionError();
        }
        adlm adlmVar = this.a;
        advv advvVar = (advv) adlmVar;
        advvVar.F.a(1, "shutdown() called");
        if (advvVar.z.compareAndSet(false, true)) {
            adnw adnwVar = advvVar.m;
            adnwVar.execute(new aduy(adlmVar, 5));
            advs advsVar = advvVar.H;
            advsVar.c.m.execute(new aduy(advsVar, 8));
            adnwVar.execute(new aduy(adlmVar, 3));
        }
    }
}
