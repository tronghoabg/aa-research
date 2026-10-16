package defpackage;

/* loaded from: classes3.dex */
public final class aiwk extends aivk {
    public aiuo c;
    public final aisv a = new aisv(0, aisy.a);
    private final Thread f = Thread.currentThread();

    public static final void e(int i) {
        throw new IllegalStateException(a.bp(i, "Illegal state "));
    }

    @Override // defpackage.aivk
    public final void b(Throwable th) {
        aisv aisvVar;
        int i;
        do {
            aisvVar = this.a;
            i = aisvVar.b;
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                e(i);
                throw new aezp();
            }
        } while (!aisvVar.b(i, 2));
        this.f.interrupt();
        aisvVar.b = 3;
    }

    @Override // defpackage.aivk
    public final boolean c() {
        return true;
    }

    public final void d() {
        while (true) {
            aisv aisvVar = this.a;
            int i = aisvVar.b;
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        e(i);
                        throw new aezp();
                    }
                }
            } else if (aisvVar.b(i, 1)) {
                aiuo aiuoVar = this.c;
                if (aiuoVar != null) {
                    aiuoVar.hy();
                    return;
                }
                return;
            }
        }
    }
}
