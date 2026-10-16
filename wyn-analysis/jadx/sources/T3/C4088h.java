package t3;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.recyclerview.widget.C1476n;
import java.util.HashMap;

/* renamed from: t3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4088h extends AbstractC4096p {

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f45680y = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: x, reason: collision with root package name */
    public final int f45681x;

    public C4088h(int i5) {
        this();
        this.f45681x = i5;
    }

    public static void J(C4103w c4103w) {
        int visibility = c4103w.f45733b.getVisibility();
        HashMap map = c4103w.f45732a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c4103w.f45733b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static t3.C4079C L(t3.C4103w r8, t3.C4103w r9) {
        /*
            t3.C r0 = new t3.C
            r0.<init>()
            r1 = 0
            r0.f45655a = r1
            r0.f45656b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f45732a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f45657c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f45659e = r6
            goto L33
        L2f:
            r0.f45657c = r3
            r0.f45659e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f45732a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f45658d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f45660f = r2
            goto L56
        L52:
            r0.f45658d = r3
            r0.f45660f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f45657c
            int r9 = r0.f45658d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f45659e
            android.view.ViewGroup r4 = r0.f45660f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f45656b = r1
            r0.f45655a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f45656b = r2
            r0.f45655a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f45660f
            if (r8 != 0) goto L81
            r0.f45656b = r1
            r0.f45655a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f45659e
            if (r8 != 0) goto L9f
            r0.f45656b = r2
            r0.f45655a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f45658d
            if (r8 != 0) goto L95
            r0.f45656b = r2
            r0.f45655a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f45657c
            if (r8 != 0) goto L9f
            r0.f45656b = r1
            r0.f45655a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.C4088h.L(t3.w, t3.w):t3.C");
    }

    public final ObjectAnimator K(View view, float f10, float f11) {
        int i5 = 0;
        if (f10 == f11) {
            return null;
        }
        AbstractC4104x.f45735a.J(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC4104x.f45736b, f11);
        objectAnimatorOfFloat.addListener(new C1476n(view));
        a(new C4087g(view, i5));
        return objectAnimatorOfFloat;
    }

    @Override // t3.AbstractC4096p
    public final void d(C4103w c4103w) {
        J(c4103w);
    }

    @Override // t3.AbstractC4096p
    public final void g(C4103w c4103w) {
        J(c4103w);
        c4103w.f45732a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC4104x.f45735a.v(c4103w.f45733b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (L(o(r3, false), r(r3, false)).f45655a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023f  */
    @Override // t3.AbstractC4096p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator l(android.view.ViewGroup r25, t3.C4103w r26, t3.C4103w r27) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.C4088h.l(android.view.ViewGroup, t3.w, t3.w):android.animation.Animator");
    }

    @Override // t3.AbstractC4096p
    public final String[] q() {
        return f45680y;
    }

    @Override // t3.AbstractC4096p
    public final boolean s(C4103w c4103w, C4103w c4103w2) {
        if (c4103w == null && c4103w2 == null) {
            return false;
        }
        if (c4103w != null && c4103w2 != null && c4103w2.f45732a.containsKey("android:visibility:visibility") != c4103w.f45732a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C4079C c4079cL = L(c4103w, c4103w2);
        if (c4079cL.f45655a) {
            return c4079cL.f45657c == 0 || c4079cL.f45658d == 0;
        }
        return false;
    }

    public C4088h() {
        this.f45681x = 3;
    }
}
