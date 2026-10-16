package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ard extends ape implements apt {
    public final aixl a;
    public aivh b;
    private final /* synthetic */ apt h;
    private final afec i;

    public ard(apt aptVar, aqk aqkVar, afeg afegVar, dlg dlgVar, afec afecVar) {
        super(aqkVar, afegVar, dlgVar);
        this.h = aptVar;
        this.i = afecVar;
        this.a = afpt.r(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
    }

    public static final ara e(aixl aixlVar) {
        ara araVarA = null;
        Iterator itA = new afbb(new apg(new alg(aixlVar, 12), null), 3).a();
        while (itA.hasNext()) {
            ara araVar = (ara) itA.next();
            araVarA = araVarA == null ? araVar : araVarA.a(araVar);
        }
        return araVarA;
    }

    private static final boolean h(long j) {
        return Float.intBitsToFloat((int) (j >> 32)) == BitmapDescriptorFactory.HUE_RED && Float.intBitsToFloat((int) (j & 4294967295L)) == BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.apt
    public final long a(long j) {
        throw null;
    }

    @Override // defpackage.apt
    public final long b(long j) {
        return this.h.b(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r7.invoke(r6, r0) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ara r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.arb
            if (r0 == 0) goto L13
            r0 = r8
            arb r0 = (defpackage.arb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            arb r0 = new arb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.woy.dF(r8)
            goto L7d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.woy.dF(r8)
            goto L68
        L36:
            defpackage.woy.dF(r8)
            affv r8 = new affv
            r8.<init>()
            r8.a = r7
            r6.d(r7)
            aixl r7 = r6.a
            ara r7 = e(r7)
            if (r7 == 0) goto L58
            r6.d(r7)
            java.lang.Object r2 = r8.a
            ara r2 = (defpackage.ara) r2
            ara r7 = r2.a(r7)
            r8.a = r7
        L58:
            arc r7 = new arc
            r2 = 0
            r5 = 0
            r7.<init>(r6, r8, r2, r5)
            r0.c = r4
            java.lang.Object r7 = r6.m(r7, r0)
            if (r7 != r1) goto L68
            goto L80
        L68:
            afeg r7 = r6.c
            bii r6 = r6.g
            long r4 = r6.o()
            dlv r6 = new dlv
            r6.<init>(r4)
            r0.c = r3
            java.lang.Object r6 = r7.invoke(r6, r0)
            if (r6 == r1) goto L80
        L7d:
            afak r6 = defpackage.afak.a
            return r6
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ard.c(ara, afck):java.lang.Object");
    }

    public final void d(ara araVar) {
        this.g.p(araVar.b, araVar.a);
    }

    @Override // defpackage.ape
    protected final boolean f(cql cqlVar) {
        int i = cqlVar.e;
        return i == 10 || i == 11 || i == 12;
    }

    public final void g(izj izjVar, long j) {
        b(izjVar.o(this.h.a(j), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    @Override // defpackage.ape
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean j(defpackage.cql r21) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ard.j(cql):boolean");
    }
}
