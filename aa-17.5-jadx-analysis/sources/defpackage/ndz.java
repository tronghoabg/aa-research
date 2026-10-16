package defpackage;

import j$.time.Duration;

/* loaded from: classes2.dex */
public final class ndz extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ boolean c;
    final /* synthetic */ Duration d;
    final /* synthetic */ nea e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndz(Object obj, boolean z, Duration duration, afck afckVar, nea neaVar) {
        super(2, afckVar);
        this.b = obj;
        this.c = z;
        this.d = duration;
        this.e = neaVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        ndz ndzVar = new ndz(this.b, this.c, this.d, afckVar, this.e);
        ndzVar.f = obj;
        return ndzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1 != 2) goto L16;
     */
    /* JADX WARN: Path cross not found for [B:16:0x004e, B:20:0x0062], limit reached: 28 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0060 -> B:20:0x0062). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r8.a
            java.lang.String r2 = ""
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L16
            java.lang.Object r4 = r8.f
            sx r4 = (defpackage.sx) r4
            defpackage.woy.dF(r9)
            if (r1 == r3) goto L62
            goto L4e
        L16:
            java.lang.Object r1 = r8.f
            sx r1 = (defpackage.sx) r1
            defpackage.woy.dF(r9)
            r4 = r1
            goto L4e
        L1f:
            defpackage.woy.dF(r9)
            java.lang.Object r9 = r8.f
            sx r9 = (defpackage.sx) r9
            java.lang.Object r1 = r8.b
            com.google.android.apps.auto.components.telecom.PhoneCall r1 = (com.google.android.apps.auto.components.telecom.PhoneCall) r1
            if (r1 != 0) goto L2e
            r1 = r2
            goto L43
        L2e:
            nea r5 = r8.e
            odo r6 = defpackage.odn.a()
            yph r7 = defpackage.nea.a
            java.lang.String r7 = r1.e
            int r1 = r1.a
            android.content.Context r5 = r5.c
            java.lang.String r1 = r6.w(r5, r1, r7)
            r1.getClass()
        L43:
            r8.f = r9
            r8.a = r4
            java.lang.Object r1 = r9.t(r1, r8)
            if (r1 == r0) goto L8e
            r4 = r9
        L4e:
            boolean r9 = r8.c
            if (r9 == 0) goto L8b
            j$.time.Duration r9 = r8.d
            long r5 = r9.toMillis()
            r8.f = r4
            r8.a = r3
            java.lang.Object r9 = defpackage.aiow.c(r5, r8)
            if (r9 == r0) goto L8e
        L62:
            java.lang.Object r9 = r8.b
            com.google.android.apps.auto.components.telecom.PhoneCall r9 = (com.google.android.apps.auto.components.telecom.PhoneCall) r9
            if (r9 != 0) goto L6a
            r9 = r2
            goto L7f
        L6a:
            nea r1 = r8.e
            odo r5 = defpackage.odn.a()
            yph r6 = defpackage.nea.a
            java.lang.String r6 = r9.e
            int r9 = r9.a
            android.content.Context r1 = r1.c
            java.lang.String r9 = r5.w(r1, r9, r6)
            r9.getClass()
        L7f:
            r8.f = r4
            r1 = 3
            r8.a = r1
            java.lang.Object r9 = r4.t(r9, r8)
            if (r9 != r0) goto L4e
            goto L8e
        L8b:
            afak r8 = defpackage.afak.a
            return r8
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndz.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ndz) b((sx) obj, (afck) obj2)).hT(afak.a);
    }
}
