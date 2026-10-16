package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class nid extends afdd implements afeg {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nid(View view, afck afckVar, int i) {
        super(afckVar);
        this.d = i;
        this.b = view;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bwq, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.d != 0) {
            nid nidVar = new nid((View) this.b, afckVar, 1);
            nidVar.c = obj;
            return nidVar;
        }
        nid nidVar2 = new nid((bwq) this.b, afckVar, 0);
        nidVar2.c = obj;
        return nidVar2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Type inference failed for: r5v6, types: [bwq, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006f -> B:26:0x0072). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.d
            r1 = 1
            if (r0 == 0) goto L4f
            afcr r0 = defpackage.afcr.a
            int r2 = r4.a
            if (r2 == 0) goto L19
            if (r2 == r1) goto L11
            defpackage.woy.dF(r5)
            goto L4b
        L11:
            java.lang.Object r2 = r4.c
            airr r2 = (defpackage.airr) r2
            defpackage.woy.dF(r5)
            goto L2d
        L19:
            defpackage.woy.dF(r5)
            java.lang.Object r5 = r4.c
            r2 = r5
            airr r2 = (defpackage.airr) r2
            java.lang.Object r5 = r4.b
            r4.c = r2
            r4.a = r1
            java.lang.Object r5 = r2.a(r5, r4)
            if (r5 == r0) goto L4e
        L2d:
            java.lang.Object r5 = r4.b
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L4b
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            afbb r3 = new afbb
            r3.<init>(r5, r1)
            r5 = 0
            r4.c = r5
            r5 = 2
            r4.a = r5
            java.util.Iterator r5 = r3.a()
            java.lang.Object r4 = r2.b(r5, r4)
            if (r4 != r0) goto L4b
            goto L4e
        L4b:
            afak r4 = defpackage.afak.a
            return r4
        L4e:
            return r0
        L4f:
            afcr r0 = defpackage.afcr.a
            int r2 = r4.a
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r4.c
            crl r2 = (defpackage.crl) r2
            defpackage.woy.dF(r5)
            goto L72
        L5d:
            defpackage.woy.dF(r5)
            java.lang.Object r5 = r4.c
            crl r5 = (defpackage.crl) r5
            r2 = r5
        L65:
            cqm r5 = defpackage.cqm.b
            r4.c = r2
            r4.a = r1
            java.lang.Object r5 = r2.r(r5, r4)
            if (r5 != r0) goto L72
            return r0
        L72:
            yph r5 = defpackage.nih.a
            java.lang.Object r5 = r4.b
            boolean r5 = defpackage.roc.af(r5)
            if (r5 != 0) goto L65
            kxb r5 = defpackage.lau.c()
            ywk r3 = defpackage.ywk.UNKNOWN_CANCEL_TRIGGER
            r5.j(r3)
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nid.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((nid) b((airr) obj, (afck) obj2)).hT(afak.a);
        }
        return ((nid) b((crl) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nid(bwq bwqVar, afck afckVar, int i) {
        super(afckVar);
        this.d = i;
        this.b = bwqVar;
    }
}
