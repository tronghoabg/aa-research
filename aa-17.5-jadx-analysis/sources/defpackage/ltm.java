package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class ltm extends afde implements afeg {
    int a;
    final /* synthetic */ Uri b;
    final /* synthetic */ aitx c;
    final /* synthetic */ Object d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Bitmap f;
    final /* synthetic */ Duration g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltm(Uri uri, aitx aitxVar, Object obj, boolean z, Bitmap bitmap, Duration duration, afck afckVar) {
        super(2, afckVar);
        this.b = uri;
        this.c = aitxVar;
        this.d = obj;
        this.e = z;
        this.f = bitmap;
        this.g = duration;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        ltm ltmVar = new ltm(this.b, this.c, this.d, this.e, this.f, this.g, afckVar);
        ltmVar.h = obj;
        return ltmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r1.u(r8, r7) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r1.t(r8, r7) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r1.t(null, r7) != r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r7.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L11
            goto L1a
        L11:
            java.lang.Object r1 = r7.h
            sx r1 = (defpackage.sx) r1
            defpackage.woy.dF(r8)
            goto L85
        L1a:
            defpackage.woy.dF(r8)
            goto L91
        L1f:
            defpackage.woy.dF(r8)
            java.lang.Object r8 = r7.h
            r1 = r8
            sx r1 = (defpackage.sx) r1
            android.net.Uri r8 = r7.b
            if (r8 == 0) goto L59
            mki r2 = defpackage.mki.a
            android.content.Context r2 = r2.c
            r2.getClass()
            nef r3 = new nef
            j$.time.Duration r5 = defpackage.lto.c
            r6 = 20
            j$.time.Duration r6 = defpackage.wub.ak(r6)
            j$.time.Duration r5 = r5.plus(r6)
            r5.getClass()
            aitx r6 = r7.c
            r3.<init>(r5, r6)
            java.lang.Object r5 = r7.d
            boolean r6 = r7.e
            eqj r8 = defpackage.mlq.h(r2, r8, r3, r5, r6)
            r7.a = r4
            java.lang.Object r7 = r1.u(r8, r7)
            if (r7 != r0) goto L91
            goto L94
        L59:
            android.graphics.Bitmap r8 = r7.f
            if (r8 == 0) goto L6d
            j$.time.Duration r4 = defpackage.lto.a
            int r4 = r8.getHeight()
            if (r4 <= 0) goto L6d
            int r4 = r8.getWidth()
            if (r4 <= 0) goto L6d
            r4 = r8
            goto L6e
        L6d:
            r4 = r5
        L6e:
            if (r4 == 0) goto L79
            r7.a = r3
            java.lang.Object r7 = r1.t(r8, r7)
            if (r7 != r0) goto L91
            goto L94
        L79:
            j$.time.Duration r8 = r7.g
            r7.h = r1
            r7.a = r2
            java.lang.Object r8 = defpackage.wub.aq(r8, r7)
            if (r8 == r0) goto L94
        L85:
            r7.h = r5
            r8 = 4
            r7.a = r8
            java.lang.Object r7 = r1.t(r5, r7)
            if (r7 != r0) goto L91
            goto L94
        L91:
            afak r7 = defpackage.afak.a
            return r7
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ltm.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ltm) b((sx) obj, (afck) obj2)).hT(afak.a);
    }
}
