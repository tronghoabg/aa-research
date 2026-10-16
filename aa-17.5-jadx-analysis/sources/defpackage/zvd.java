package defpackage;

import j$.time.Instant;

/* loaded from: classes3.dex */
final class zvd extends vgo {
    private final zxh a;
    private final zwr b;
    private final uxn c;
    private final zvf d;
    private final zwl e;
    private final uxl f;
    private final uxl g;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uxn] */
    public zvd(zxh zxhVar, uxl uxlVar, zwr zwrVar, aabc aabcVar, uxl uxlVar2, zvf zvfVar, zwl zwlVar) {
        this.a = zxhVar;
        this.f = uxlVar;
        this.b = zwrVar;
        this.g = uxlVar2;
        this.c = aabcVar.b;
        this.d = zvfVar;
        this.e = zwlVar;
    }

    @Override // defpackage.vgp
    public final void a() {
        try {
            zxh zxhVar = this.a;
            tng tngVar = (tng) zxhVar.c.gu();
            if (tngVar != null) {
                tmb tmbVar = zxhVar.f;
                long epochMilli = Instant.now().toEpochMilli();
                zxhVar.e.execute(new zxg(zxhVar, tngVar, epochMilli - zxhVar.g, epochMilli, 0));
            }
            zwr zwrVar = this.b;
            zwrVar.c = true;
            zwrVar.d();
            zwl zwlVar = this.e;
            if (zwlVar.T()) {
                uxl uxlVar = this.g;
                uxlVar.b.add(zwlVar.c());
                uxlVar.a(0);
                this.c.b(aahu.MAP_READY);
            } else {
                this.f.a(0);
                this.c.b(aahu.STYLED_MAP_READY);
            }
            zvf zvfVar = this.d;
            if (zvfVar != null) {
                zvfVar.e.a(zvfVar.d());
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }
}
