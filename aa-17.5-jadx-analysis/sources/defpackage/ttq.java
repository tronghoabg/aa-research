package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ttq implements tnt {
    private static final long b;
    public final qau a;
    private final tmb c;
    private final pif d;
    private final aezk e;
    private final Executor f;
    private final ttr g;
    private final plq h;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        b = 3600L;
    }

    public ttq(tmb tmbVar, plq plqVar, pif pifVar, aezk aezkVar, pyh pyhVar, qau qauVar, Executor executor) {
        this.h = plqVar;
        this.d = pifVar;
        this.c = tmbVar;
        this.e = aezkVar;
        this.a = qauVar;
        this.f = executor;
        this.g = new ttr(pyhVar);
    }

    @Override // defpackage.tnt
    public final void a() {
        ttr ttrVar = this.g;
        if (ttrVar.a()) {
            ttrVar.b.a().edit().remove(ttr.c.toString()).remove(ttr.d.toString()).remove(ttr.e.toString()).remove(ttr.f.toString()).remove(ttr.g.toString()).remove(ttr.h.toString()).remove(ttr.i.toString()).apply();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    @Override // defpackage.tnt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.ttl r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttq.b(ttl):int");
    }
}
