package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dg extends kotlinx.coroutines.e.ah implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f51839b;

    public dg(long j2, h.c.e eVar) {
        super(eVar.getContext(), eVar);
        this.f51839b = j2;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.cf
    public final String bP() {
        return super.bP() + "(timeMillis=" + this.f51839b + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r7 = this;
            h.c.j r0 = r7.getContext()
            kotlinx.coroutines.ao r0 = kotlinx.coroutines.aj.s(r0)
            h.c.j r1 = r7.getContext()
            h.c.f r2 = kotlinx.coroutines.ae.f51340a
            h.c.i r2 = (h.c.i) r2
            h.c.h r1 = r1.get(r2)
            kotlinx.coroutines.ae r1 = (kotlinx.coroutines.ae) r1
            r2 = 0
            if (r1 == 0) goto L1e
            java.lang.String r1 = r1.a()
            goto L1f
        L1e:
            r1 = r2
        L1f:
            long r3 = r7.f51839b
            r5 = r7
            kotlinx.coroutines.br r5 = (kotlinx.coroutines.br) r5
            boolean r6 = r0 instanceof kotlinx.coroutines.aq
            if (r6 == 0) goto L2b
            r2 = r0
            kotlinx.coroutines.aq r2 = (kotlinx.coroutines.aq) r2
        L2b:
            if (r2 == 0) goto L3a
            h.o.c r0 = h.o.a.f48264a
            h.o.d r0 = h.o.d.f48272c
            h.o.c.j(r3, r0)
            java.lang.String r0 = r2.a()
            if (r0 != 0) goto L4d
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Timed out waiting for "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r2 = " ms"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L4d:
            if (r1 == 0) goto L90
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L7a
            r2 = 0
            char r2 = r0.charAt(r2)
            char r2 = java.lang.Character.toLowerCase(r2)
            r3 = 1
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r3 = "substring(...)"
            h.g.b.x.e(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L7a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Coroutine \""
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "\" "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L90:
            kotlinx.coroutines.df r1 = new kotlinx.coroutines.df
            r1.<init>(r0, r5)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r7.M(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.dg.run():void");
    }
}
