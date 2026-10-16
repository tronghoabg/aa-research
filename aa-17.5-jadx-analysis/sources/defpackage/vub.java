package defpackage;

import java.lang.Thread;
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class vub extends vuf implements vsa {
    public final vry a;
    public final ackk b;
    public final AtomicReference c;
    private final vqk d;

    static {
        new LinkedHashSet();
    }

    public vub(wci wciVar, ackk ackkVar, xxh xxhVar, Executor executor, vqk vqkVar) {
        super(null, null);
        this.c = new AtomicReference(null);
        new ArrayDeque();
        this.a = wciVar.d(executor, ackkVar, null);
        this.b = ackkVar;
        this.d = vqkVar;
        xxhVar.e();
    }

    @Override // defpackage.vsa
    public final void k() {
        this.d.a(new vua(this));
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: vtz
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                vub vubVar = this.a;
                try {
                    try {
                        oct octVarB = xto.b(th);
                        if (octVarB != null) {
                            Object obj = octVarB.a;
                            vty vtyVarB = vty.b(((xun) obj).b);
                            if (vtyVarB != null && vtyVarB.a() != null && vtyVarB.a.get() == null) {
                                UUID uuid = ((xun) obj).c;
                                long mostSignificantBits = (uuid.getMostSignificantBits() ^ uuid.getLeastSignificantBits()) & Long.MAX_VALUE;
                                if (mostSignificantBits == 0) {
                                    mostSignificantBits = 1;
                                }
                                Long lValueOf = Long.valueOf(mostSignificantBits);
                                abnf abnfVarC = abqs.c(((xun) obj).d);
                                abnp abnpVarN = ajex.a.n();
                                abnpVarN.t();
                                ajex ajexVar = (ajex) abnpVarN.b;
                                ajexVar.b |= 1;
                                ajexVar.c = 0;
                                abnpVarN.t();
                                ajex ajexVar2 = (ajex) abnpVarN.b;
                                ajexVar2.f = 2;
                                ajexVar2.b |= 8;
                                lValueOf.getClass();
                                abnpVarN.t();
                                ajex ajexVar3 = (ajex) abnpVarN.b;
                                ajexVar3.b |= 4;
                                ajexVar3.e = mostSignificantBits;
                                if (abnfVarC != null) {
                                    abnpVarN.t();
                                    ajex ajexVar4 = (ajex) abnpVarN.b;
                                    ajexVar4.d = abnfVarC;
                                    ajexVar4.b |= 2;
                                }
                                ajex ajexVar5 = (ajex) abnpVarN.q();
                                vry vryVar = vubVar.a;
                                vrt vrtVarA = vru.a();
                                vrtVarA.e(true);
                                abnp abnpVarN2 = ajgu.a.n();
                                abnpVarN2.t();
                                ajgu ajguVar = (ajgu) abnpVarN2.b;
                                ajexVar5.getClass();
                                ajguVar.t = ajexVar5;
                                ajguVar.b |= 524288;
                                vrtVarA.g((ajgu) abnpVarN2.q());
                                vrtVarA.b = null;
                                vryVar.a(vrtVarA.a());
                            }
                        }
                    } catch (Exception e) {
                        ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e)).ai(9822)).u("Failed to end CUI.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                } catch (Throwable th2) {
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                    throw th2;
                }
            }
        });
    }
}
