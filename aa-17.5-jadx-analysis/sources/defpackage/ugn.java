package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class ugn {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection] */
    public ugn(Context context, fss fssVar, aezr aezrVar, aezr aezrVar2, aezr aezrVar3, ajdr ajdrVar, fvl fvlVar) {
        fssVar.getClass();
        this.h = context;
        this.b = fssVar;
        this.i = aezrVar;
        this.k = aezrVar2;
        this.f = aezrVar3;
        this.j = ajdrVar;
        this.c = fvlVar;
        aiwh aiwhVar = new aiwh(null);
        aitu aituVar = aium.a;
        ahni.b(affa.v(aiwhVar, ajct.a.i()).plus(new fps(CoroutineExceptionHandler.c)));
        ftz ftzVar = new ftz(this, context);
        this.d = ftzVar;
        gjv gjvVar = new gjv(ftzVar);
        this.g = gjvVar;
        List listCh = woy.ch(ajdrVar.d);
        List listCh2 = woy.ch(ajdrVar.c);
        List listCh3 = woy.ch(ajdrVar.b);
        List listCh4 = woy.ch(ajdrVar.a);
        List listCh5 = woy.ch(ajdrVar.e);
        dtd.k(new fsd(2), ajhx.class, listCh2);
        dtd.k(new fsd(5), String.class, listCh2);
        dtd.k(new fsd(0), Uri.class, listCh2);
        dtd.k(new fsd(4), Uri.class, listCh2);
        dtd.k(new fsd(3), Integer.class, listCh2);
        dtd.k(new fsd(1), byte[].class, listCh2);
        dtd.m(new fsc(0), Uri.class, listCh3);
        dtd.m(new fsc(1), File.class, listCh3);
        dtd.l(new fro(aezrVar3, aezrVar2), Uri.class, listCh4);
        dtd.l(new fri(5), File.class, listCh4);
        dtd.l(new fri(1), Uri.class, listCh4);
        dtd.l(new fri(3), Uri.class, listCh4);
        dtd.l(new fri(6), Uri.class, listCh4);
        dtd.l(new fri(4), Drawable.class, listCh4);
        dtd.l(new fri(0), Bitmap.class, listCh4);
        dtd.l(new fri(2), ByteBuffer.class, listCh4);
        listCh5.add(new fqk(null));
        ajdr ajdrVarQ = dtd.q(listCh, listCh2, listCh3, listCh4, listCh5);
        this.a = ajdrVarQ;
        this.e = woy.bZ(ajdrVarQ.d, new ncp(this, gjvVar));
        new AtomicBoolean(false);
    }

    private static final void h(fsu fsuVar, ftp ftpVar) {
        if (ftpVar != null) {
            Drawable drawable = fsuVar.a;
        }
        fsy fsyVar = fsuVar.b;
        fsuVar.getClass();
    }

    public final Float a(Float f) {
        Float fValueOf;
        if (f != null) {
            npc.c.l().y("Using last known temperature value: %s", f);
            return f;
        }
        Object obj = this.k;
        if (obj != null) {
            List list = ((npw) obj).a;
            fValueOf = Float.valueOf(((Number) list.get(((afbt) list).b / 2)).floatValue());
        } else {
            fValueOf = null;
        }
        npc.c.l().y("Using fallback temperature value: %s", fValueOf);
        return fValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.npq
            if (r0 == 0) goto L13
            r0 = r5
            npq r0 = (defpackage.npq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            npq r0 = new npq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.woy.dF(r5)
            aezw r5 = (defpackage.aezw) r5
            java.lang.Object r4 = r5.a
            goto L6b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.woy.dF(r5)
            java.lang.Object r5 = r4.c
            eqj r5 = (defpackage.eqj) r5
            boolean r2 = r5.n()
            if (r2 == 0) goto L76
            boolean r2 = r5.o()
            if (r2 == 0) goto L6e
            java.lang.Object r5 = r5.e()
            java.lang.Float r5 = (java.lang.Float) r5
            if (r5 != 0) goto L5e
            yph r4 = defpackage.npc.c
            yop r4 = r4.h()
            ype r4 = (defpackage.ype) r4
            java.lang.String r5 = "decrement() called but can't decrement"
            r4.u(r5)
            afak r4 = defpackage.afak.a
            return r4
        L5e:
            float r5 = r5.floatValue()
            r0.b = r3
            java.lang.Object r4 = r4.d(r5, r0)
            if (r4 != r1) goto L6b
            return r1
        L6b:
            afak r4 = defpackage.afak.a
            return r4
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "`canDecrement` must be initialized to call decrement()"
            r4.<init>(r5)
            throw r4
        L76:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Must observe `canDecrement` to call decrement()"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugn.b(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.npr
            if (r0 == 0) goto L13
            r0 = r5
            npr r0 = (defpackage.npr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            npr r0 = new npr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.woy.dF(r5)
            aezw r5 = (defpackage.aezw) r5
            java.lang.Object r4 = r5.a
            goto L6b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.woy.dF(r5)
            java.lang.Object r5 = r4.d
            eqj r5 = (defpackage.eqj) r5
            boolean r2 = r5.n()
            if (r2 == 0) goto L76
            boolean r2 = r5.o()
            if (r2 == 0) goto L6e
            java.lang.Object r5 = r5.e()
            java.lang.Float r5 = (java.lang.Float) r5
            if (r5 != 0) goto L5e
            yph r4 = defpackage.npc.c
            yop r4 = r4.h()
            ype r4 = (defpackage.ype) r4
            java.lang.String r5 = "increment() called but can't increment"
            r4.u(r5)
            afak r4 = defpackage.afak.a
            return r4
        L5e:
            float r5 = r5.floatValue()
            r0.b = r3
            java.lang.Object r4 = r4.d(r5, r0)
            if (r4 != r1) goto L6b
            return r1
        L6b:
            afak r4 = defpackage.afak.a
            return r4
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "`canIncrement` must be initialized to call increment()"
            r4.<init>(r5)
            throw r4
        L76:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Must observe `canIncrement` to call increment()"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugn.c(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(float r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.nps
            if (r0 == 0) goto L13
            r0 = r6
            nps r0 = (defpackage.nps) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            nps r0 = new nps
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.woy.dF(r6)
            aezw r6 = (defpackage.aezw) r6
            java.lang.Object r5 = r6.a
            goto L47
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.woy.dF(r6)
            java.lang.Object r6 = r4.f
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.b = r3
            kjz r6 = (defpackage.kjz) r6
            java.lang.Object r5 = defpackage.jul.g(r6, r2, r0)
            if (r5 == r1) goto L61
        L47:
            java.lang.Throwable r6 = defpackage.aezw.a(r5)
            if (r6 == 0) goto L60
            yph r0 = defpackage.npc.c
            yop r0 = r0.h()
            ype r0 = (defpackage.ype) r0
            java.lang.Object r4 = r4.f
            java.lang.String r6 = r6.getMessage()
            java.lang.String r1 = "Unable to change temperature of %s: %s"
            r0.M(r1, r4, r6)
        L60:
            return r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugn.d(float, afck):java.lang.Object");
    }

    public final Object e(fsy fsyVar, afck afckVar) {
        return ahni.a(new dxb(fsyVar, this, (afck) null, 2), afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (defpackage.a.aZ(r13, r0) != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4 A[Catch: all -> 0x0136, TryCatch #3 {all -> 0x0136, blocks: (B:38:0x00ab, B:40:0x00b4, B:41:0x00c1), top: B:83:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109 A[Catch: all -> 0x0032, TryCatch #2 {all -> 0x0032, blocks: (B:14:0x002d, B:47:0x0103, B:49:0x0109, B:51:0x0114, B:52:0x0116, B:53:0x011a, B:55:0x011e, B:58:0x012a, B:59:0x012f), top: B:82:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a A[Catch: all -> 0x0032, TryCatch #2 {all -> 0x0032, blocks: (B:14:0x002d, B:47:0x0103, B:49:0x0109, B:51:0x0114, B:52:0x0116, B:53:0x011a, B:55:0x011e, B:58:0x012a, B:59:0x012f), top: B:82:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149 A[Catch: all -> 0x015a, TRY_LEAVE, TryCatch #5 {all -> 0x015a, blocks: (B:69:0x0145, B:71:0x0149, B:74:0x0156, B:75:0x0159), top: B:86:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156 A[Catch: all -> 0x015a, TRY_ENTER, TryCatch #5 {all -> 0x015a, blocks: (B:69:0x0145, B:71:0x0149, B:74:0x0156, B:75:0x0159), top: B:86:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fsy r12, int r13, defpackage.afck r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugn.f(fsy, int, afck):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aezr, java.lang.Object] */
    public final ieb g() {
        return (ieb) this.i.a();
    }

    public ugn() {
        this.a = "h";
        this.b = "i";
        this.c = "j";
        this.d = "k";
        this.e = "l";
        this.f = "m";
        this.g = "n";
        this.h = "o";
        this.i = "q";
        this.j = "w";
        this.k = "x";
    }

    public ugn(kjz kjzVar, npw npwVar, eqj eqjVar) {
        this.f = kjzVar;
        this.k = npwVar;
        this.g = eqjVar;
        eqj eqjVarF = jul.f(kjzVar);
        this.a = eqjVarF;
        this.b = jun.e(jun.d(eqjVarF, new noo(this, 8)));
        this.i = ahni.b(affa.v(new aiwh(null), mkm.a.e()));
        mmt mmtVar = new mmt(this, 17);
        this.e = mmtVar;
        eqjVarF.i(mmtVar);
        afco afcoVar = tby.a;
        eqj eqjVarG = tby.G(eqjVarF, eqjVar, new njg(this, 11));
        this.d = eqjVarG;
        eqj eqjVarG2 = tby.G(eqjVarF, eqjVar, new njg(this, 12));
        this.c = eqjVarG2;
        this.j = tby.o(eqjVarG);
        this.h = tby.o(eqjVarG2);
    }
}
