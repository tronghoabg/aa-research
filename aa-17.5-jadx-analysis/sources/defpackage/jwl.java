package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class jwl {
    public final ComponentName a;
    public boolean b;
    public final aiyk c;
    public final yph d;
    public final liq e;
    public final lio f;
    public final ajab g;
    public final gjv h;

    public jwl(final geu geuVar, ComponentName componentName, gjv gjvVar) {
        gjvVar.getClass();
        this.a = componentName;
        this.h = gjvVar;
        this.b = true;
        this.c = dtx.m(lix.b().b);
        this.g = ajac.a(Boolean.valueOf(lbh.c().q()));
        this.d = yph.c("CarApp.H.Constraints");
        liq liqVar = new liq() { // from class: jwj
            @Override // defpackage.liq
            public final void a(boolean z) {
                geu geuVar2 = geuVar;
                jwl jwlVar = this.a;
                jwlVar.d.l().P("Keyboard enablement changed to %s dispatched to app %s", z, ((gmh) ((jwq) geuVar2).c).a);
                jwlVar.g.d(Boolean.valueOf(z));
                jwlVar.h.a(6);
            }
        };
        this.e = liqVar;
        lio lioVar = new lio() { // from class: jwk
            @Override // defpackage.lio
            public final void a(boolean z) {
                geu geuVar2 = geuVar;
                jwl jwlVar = this.a;
                jwlVar.d.l().P("Config allowed changed to %s dispatched to app %s", z, ((gmh) ((jwq) geuVar2).c).a);
                jwlVar.h.a(6);
            }
        };
        this.f = lioVar;
        lbh.c().i(liqVar);
        lbh.c().g(lioVar);
        gjvVar.b(this, 10, new joo(this, 11, null));
        ahnc.d(dty.f(((jwq) geuVar).a.a()), null, 0, new ksw(this, geuVar, (afck) null, 1), 3);
    }

    public static final boolean b() {
        return !lbh.c().q();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.b
            abru r1 = defpackage.acob.m()
            aboh r1 = r1.b
            r1.getClass()
            if (r4 == 0) goto L68
            r2 = 1
            if (r4 == r2) goto L57
            r2 = 2
            if (r4 == r2) goto L68
            r2 = 3
            if (r4 == r2) goto L4d
            r2 = 4
            if (r4 == r2) goto L40
            r0 = 5
            if (r4 != r0) goto L34
            boolean r4 = defpackage.aczc.t()
            if (r4 == 0) goto L29
            abru r4 = defpackage.acob.n()
            aboh r4 = r4.b
            goto L2f
        L29:
            abru r4 = defpackage.aczc.j()
            aboh r4 = r4.b
        L2f:
            r1 = r4
            r1.getClass()
            goto L78
        L34:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown content type: "
            java.lang.String r4 = defpackage.a.bp(r4, r0)
            r3.<init>(r4)
            throw r3
        L40:
            if (r0 == 0) goto L43
            goto L78
        L43:
            abru r4 = defpackage.aczc.k()
            aboh r1 = r4.b
            r1.getClass()
            goto L78
        L4d:
            abru r4 = defpackage.aczc.l()
            aboh r1 = r4.b
            r1.getClass()
            goto L78
        L57:
            boolean r4 = defpackage.aczc.t()
            if (r4 == 0) goto L5e
            goto L78
        L5e:
            abru r4 = defpackage.aczc.i()
            aboh r1 = r4.b
            r1.getClass()
            goto L78
        L68:
            boolean r4 = defpackage.aczc.t()
            if (r4 == 0) goto L6f
            goto L78
        L6f:
            abru r4 = defpackage.aczc.j()
            aboh r1 = r4.b
            r1.getClass()
        L78:
            android.content.ComponentName r3 = r3.a
            r4 = 0
            int r3 = defpackage.ggp.a(r3, r1, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwl.a(int):int");
    }
}
