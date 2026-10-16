package defpackage;

import androidx.car.app.model.Action;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class fvl {
    public static final void a(fvm fvmVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1509609103);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.C(fvmVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarH = asl.H(cfyVar, gjk.d.k);
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarH);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVarC.v(-1285991387);
            boz.h(awd.i(cfy.e, 48.0f), 0L, BitmapDescriptorFactory.HUE_RED, 0L, 0, BitmapDescriptorFactory.HUE_RED, buxVarC, 6);
            bvvVar.Y(false);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(fvmVar, cfyVar, i, 5, null);
        }
    }

    public static final fvu b(fvu fvuVar, fvw fvwVar, boolean z) {
        fvuVar.getClass();
        if (z) {
            fwb fwbVar = fvuVar.b;
            return fwbVar instanceof fwa ? fvu.d(fvuVar, null, fwa.h((fwa) fwbVar, fvwVar, null, 2), null, 125) : fvuVar;
        }
        fvv fvvVar = fvuVar.a;
        return fvvVar != null ? fvu.d(fvuVar, fvv.d(fvvVar, 0, fvwVar, 255), null, null, 126) : fvuVar;
    }

    public static /* synthetic */ fvu c(Action action, geu geuVar, boolean z, afdr afdrVar, boolean z2, int i) {
        fvu fvuVar;
        if ((i & 8) != 0) {
            z2 = ((ggk) geuVar.F(ggk.class)).f();
        }
        if ((i & 4) != 0) {
            afdrVar = null;
        }
        action.getClass();
        if (z2 && action.getType() == 65538) {
            fvuVar = new fvu(null, fvr.e(action, geuVar, afdrVar), null);
        } else {
            fvuVar = (!z || !((i & 2) == 0) || action.getType() == 65538) ? new fvu(fvr.b(action, geuVar, afdrVar), null, null) : new fvu(null, fvr.e(action, geuVar, afdrVar), null);
        }
        gka.b(fvuVar, action);
        return fvuVar;
    }

    public static final fvb d(geu geuVar, Action action) {
        return new fvb(hlb.d(geuVar, action.getTitle()).toString(), action.isEnabled(), new bsh(action, geuVar, 19, null));
    }

    public static final fwm e(geu geuVar) {
        Action action = Action.BACK;
        action.getClass();
        return fvr.h(c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12), geuVar, fwx.d, false, fwh.a, null, null, false, 0, 244);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (defpackage.dtg.l(r0.getWidth(), r0.getHeight(), defpackage.a.bc(r7) ? r0.getWidth() : defpackage.ftw.g(r7.b, r8), defpackage.a.bc(r7) ? r0.getHeight() : defpackage.ftw.g(r7.c, r8), r8) != 1.0d) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap f(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, defpackage.ftn r7, int r8, boolean r9) {
        /*
            boolean r0 = r5 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L51
            r0 = r5
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            r0.getClass()
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            android.graphics.Bitmap$Config r2 = defpackage.a.bh(r6)
            if (r1 != r2) goto L51
            if (r9 == 0) goto L1b
            goto L50
        L1b:
            int r9 = r0.getWidth()
            int r1 = r0.getHeight()
            boolean r2 = defpackage.a.bc(r7)
            if (r2 == 0) goto L2e
            int r2 = r0.getWidth()
            goto L34
        L2e:
            a r2 = r7.b
            int r2 = defpackage.ftw.g(r2, r8)
        L34:
            boolean r3 = defpackage.a.bc(r7)
            if (r3 == 0) goto L3f
            int r3 = r0.getHeight()
            goto L45
        L3f:
            a r3 = r7.c
            int r3 = defpackage.ftw.g(r3, r8)
        L45:
            double r1 = defpackage.dtg.l(r9, r1, r2, r3, r8)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 == 0) goto L50
            goto L51
        L50:
            return r0
        L51:
            android.graphics.drawable.Drawable r5 = r5.mutate()
            r5.getClass()
            android.graphics.Bitmap$Config[] r9 = defpackage.ftw.a
            boolean r9 = r5 instanceof android.graphics.drawable.BitmapDrawable
            r0 = 0
            if (r9 == 0) goto L63
            r1 = r5
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            goto L64
        L63:
            r1 = r0
        L64:
            if (r1 == 0) goto L71
            android.graphics.Bitmap r1 = r1.getBitmap()
            if (r1 == 0) goto L71
            int r1 = r1.getWidth()
            goto L75
        L71:
            int r1 = r5.getIntrinsicWidth()
        L75:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > 0) goto L7a
            r1 = r2
        L7a:
            if (r9 == 0) goto L7f
            r0 = r5
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
        L7f:
            if (r0 == 0) goto L8c
            android.graphics.Bitmap r9 = r0.getBitmap()
            if (r9 == 0) goto L8c
            int r9 = r9.getHeight()
            goto L90
        L8c:
            int r9 = r5.getIntrinsicHeight()
        L90:
            if (r9 > 0) goto L93
            goto L94
        L93:
            r2 = r9
        L94:
            boolean r9 = defpackage.a.bc(r7)
            if (r9 == 0) goto L9c
            r9 = r1
            goto La2
        L9c:
            a r9 = r7.b
            int r9 = defpackage.ftw.g(r9, r8)
        La2:
            boolean r0 = defpackage.a.bc(r7)
            if (r0 == 0) goto Laa
            r7 = r2
            goto Lb0
        Laa:
            a r7 = r7.c
            int r7 = defpackage.ftw.g(r7, r8)
        Lb0:
            double r7 = defpackage.dtg.l(r1, r2, r9, r7, r8)
            double r0 = (double) r1
            double r0 = r0 * r7
            double r2 = (double) r2
            double r7 = r7 * r2
            int r9 = defpackage.afgi.j(r0)
            int r7 = defpackage.afgi.j(r7)
            android.graphics.Bitmap$Config r6 = defpackage.a.bh(r6)
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r9, r7, r6)
            r6.getClass()
            android.graphics.Rect r8 = r5.getBounds()
            r8.getClass()
            int r0 = r8.left
            int r1 = r8.top
            int r2 = r8.right
            int r8 = r8.bottom
            r3 = 0
            r5.setBounds(r3, r3, r9, r7)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r6)
            r5.draw(r7)
            r5.setBounds(r0, r1, r2, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvl.f(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, ftn, int, boolean):android.graphics.Bitmap");
    }

    public static final float g(a aVar, int i) {
        return aVar instanceof fti ? ((fti) aVar).a : i + (-1) != 0 ? Float.MAX_VALUE : Float.MIN_VALUE;
    }
}
