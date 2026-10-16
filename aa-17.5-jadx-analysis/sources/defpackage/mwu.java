package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class mwu {
    public static final yph a = yph.c("GH.SwDisTouchHandler");
    public final View b;
    public final boolean c = false;
    public aitx d;
    public final aizk e;
    public boolean f;
    private final afdr g;
    private final int h;
    private final int i;
    private final float j;
    private aivh k;
    private boolean l;

    public mwu(View view, boolean z, afdr afdrVar) {
        this.b = view;
        this.g = afdrVar;
        this.h = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.i = ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity();
        this.j = view.getContext().getResources().getDisplayMetrics().density * 500.0f;
        if (view.isAttachedToWindow()) {
            this.d = ahni.c();
        }
        view.addOnAttachStateChangeListener(new hy(this, 3));
        this.e = aizq.e(0, 1, 2, 1);
    }

    private final MotionEvent f(MotionEvent motionEvent) {
        View view = this.b;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(view.getTranslationX(), BitmapDescriptorFactory.HUE_RED);
        motionEventObtain.getClass();
        return motionEventObtain;
    }

    private final void g(float f) {
        Number numberValueOf;
        View view = this.b;
        float width = f / view.getWidth();
        if (Math.abs(width) > 1.0f) {
            numberValueOf = Float.valueOf(width > BitmapDescriptorFactory.HUE_RED ? 0.4f : -0.4f);
        } else {
            numberValueOf = Double.valueOf(Math.sin((width * 3.141592653589793d) / 2.0d) * 0.4000000059604645d);
        }
        view.setTranslationX(view.getWidth() * numberValueOf.floatValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (defpackage.thg.j(r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.mwo r9, defpackage.afck r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.mwp
            if (r0 == 0) goto L13
            r0 = r10
            mwp r0 = (defpackage.mwp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mwp r0 = new mwp
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            emp r9 = r0.d
            defpackage.woy.dF(r10)
            goto L96
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.woy.dF(r10)
            goto L6c
        L39:
            defpackage.woy.dF(r10)
            android.view.View r10 = r8.b
            emp r2 = new emp
            eml r6 = defpackage.emm.a
            r2.<init>(r10, r6)
            emq r6 = new emq
            r6.<init>()
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.c(r7)
            r2.s = r6
            r6 = 0
            aizk r6 = defpackage.aizq.e(r6, r5, r4, r5)
            mwn r7 = new mwn
            r7.<init>()
            r2.h(r7)
            if (r9 != 0) goto L72
            r2.k(r3)
            r0.c = r5
            java.lang.Object r9 = defpackage.thg.j(r2, r0)
            if (r9 != r1) goto L6c
            goto La1
        L6c:
            android.view.View r8 = r8.b
            r8.setTranslationX(r3)
            goto L9e
        L72:
            mwo r3 = defpackage.mwo.a
            if (r9 != r3) goto L7c
            int r9 = r10.getWidth()
            int r9 = -r9
            goto L80
        L7c:
            int r9 = r10.getWidth()
        L80:
            float r9 = (float) r9
            float r9 = r9 + r9
            r2.k(r9)
            mwq r9 = new mwq
            r10 = 0
            r9.<init>(r8, r10)
            r0.d = r2
            r0.c = r4
            java.lang.Object r9 = defpackage.afpt.q(r6, r9, r0)
            if (r9 == r1) goto La1
            r9 = r2
        L96:
            r9.l()
            afdr r8 = r8.g
            r8.invoke()
        L9e:
            afak r8 = defpackage.afak.a
            return r8
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwu.a(mwo, afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r2 != 3) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(float r6, android.view.VelocityTracker r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.mwr
            if (r0 == 0) goto L13
            r0 = r8
            mwr r0 = (defpackage.mwr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mwr r0 = new mwr
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r6 = r0.a
            android.view.VelocityTracker r7 = r0.e
            defpackage.woy.dF(r8)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.woy.dF(r8)
        L36:
            r0.e = r7
            r0.a = r6
            r0.d = r3
            aizk r8 = r5.e
            java.lang.Object r8 = defpackage.afpt.p(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            android.view.MotionEvent r8 = (android.view.MotionEvent) r8
            android.view.MotionEvent r2 = r5.f(r8)
            r7.addMovement(r2)
            int r2 = r8.getAction()
            if (r2 == r3) goto L7f
            r4 = 2
            if (r2 == r4) goto L5b
            r8 = 3
            if (r2 == r8) goto L7f
            goto L36
        L5b:
            float r8 = r8.getRawX()
            float r8 = r8 - r6
            int r2 = r5.h
            float r4 = java.lang.Math.abs(r8)
            float r2 = (float) r2
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L6c
            goto L36
        L6c:
            yph r6 = defpackage.mwu.a
            yop r6 = r6.l()
            java.lang.String r7 = "Exceeded slop"
            r6.u(r7)
            r5.g(r8)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L7f:
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwu.b(float, android.view.VelocityTracker, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:19:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(float r21, android.view.VelocityTracker r22, defpackage.afck r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwu.c(float, android.view.VelocityTracker, afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r2 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.view.MotionEvent r10, defpackage.afck r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwu.d(android.view.MotionEvent, afck):java.lang.Object");
    }

    public final boolean e(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            aivh aivhVar = this.k;
            if (aivhVar != null) {
                aivhVar.s(null);
            }
            aitx aitxVar = this.d;
            if (aitxVar == null) {
                affa.d("gestureCoroutineScope");
                aitxVar = null;
            }
            this.k = ahnc.d(aitxVar, null, 0, new ksw(this, motionEvent, (afck) null, 8), 3);
        } else if ((action == 1 || action == 2 || action == 3) && !this.e.c(motionEvent)) {
            ((ype) a.h()).u("unable to emit event");
        }
        return this.l && motionEvent.getActionIndex() == 0;
    }
}
