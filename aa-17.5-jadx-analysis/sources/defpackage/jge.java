package defpackage;

import j$.time.Duration;

/* loaded from: classes.dex */
final class jge {
    final /* synthetic */ jgi a;
    private final String b;
    private final jgf c;
    private final xya d;

    public jge(jgi jgiVar, xyi xyiVar, String str, jgf jgfVar) {
        this.a = jgiVar;
        this.b = str;
        this.c = jgfVar;
        this.d = new xya(xyiVar);
    }

    final void a() {
        if (this.a.n()) {
            xya xyaVar = this.d;
            if (xyaVar.a) {
                return;
            }
            xyaVar.e();
        }
    }

    final void b() {
        xya xyaVar = this.d;
        if (xyaVar.a && this.a.o()) {
            Duration durationC = xyaVar.c();
            long seconds = durationC.toSeconds();
            if (seconds >= 1) {
                ((ype) ((ype) jgi.a.h()).ai(2010)).L("blocking event, %s seconds = %d", this.b, seconds);
                this.c.a(durationC);
            }
        }
        xyaVar.d();
    }
}
