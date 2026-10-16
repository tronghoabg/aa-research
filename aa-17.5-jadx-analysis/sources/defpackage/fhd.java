package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* loaded from: classes2.dex */
public class fhd extends fgc {
    private static final String[] z = {"android:visibility:visibility", "android:visibility:parent"};
    public int a;

    public fhd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ffs.d);
        int iM = dlz.m(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iM != 0) {
            U(iM);
        }
    }

    public static void V(fgo fgoVar) {
        Integer numValueOf = Integer.valueOf(fgoVar.b.getVisibility());
        Map map = fgoVar.a;
        map.put("android:visibility:visibility", numValueOf);
        map.put("android:visibility:parent", fgoVar.b.getParent());
        int[] iArr = new int[2];
        fgoVar.b.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r9 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r0.e == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (r0.c == 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.fhc W(defpackage.fgo r8, defpackage.fgo r9) {
        /*
            fhc r0 = new fhc
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.Map r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r4
            r0.e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.Map r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r4
            r0.f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L80
            if (r9 == 0) goto L80
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            goto L8e
        L68:
            if (r8 == r9) goto L76
            if (r8 != 0) goto L71
        L6c:
            r0.b = r1
        L6e:
            r0.a = r2
            return r0
        L71:
            if (r9 != 0) goto L8e
        L73:
            r0.b = r2
            goto L6e
        L76:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L7b
            goto L6c
        L7b:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L8e
            goto L73
        L80:
            if (r8 != 0) goto L87
            int r8 = r0.d
            if (r8 != 0) goto L87
            goto L73
        L87:
            if (r9 != 0) goto L8e
            int r8 = r0.c
            if (r8 != 0) goto L8e
            goto L6c
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhd.W(fgo, fgo):fhc");
    }

    @Override // defpackage.fgc
    public final boolean F(fgo fgoVar, fgo fgoVar2) {
        if (fgoVar == null && fgoVar2 == null) {
            return false;
        }
        if (fgoVar != null && fgoVar2 != null) {
            if (fgoVar2.a.containsKey("android:visibility:visibility") != fgoVar.a.containsKey("android:visibility:visibility")) {
                return false;
            }
        }
        fhc fhcVarW = W(fgoVar, fgoVar2);
        if (fhcVarW.a) {
            return fhcVarW.c == 0 || fhcVarW.d == 0;
        }
        return false;
    }

    public final void U(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e9  */
    @Override // defpackage.fgc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.view.ViewGroup r25, defpackage.fgo r26, defpackage.fgo r27) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhd.a(android.view.ViewGroup, fgo, fgo):android.animation.Animator");
    }

    @Override // defpackage.fgc
    public void b(fgo fgoVar) {
        V(fgoVar);
    }

    @Override // defpackage.fgc
    public void c(fgo fgoVar) {
        throw null;
    }

    @Override // defpackage.fgc
    public final String[] e() {
        return z;
    }

    public Animator f(ViewGroup viewGroup, View view, fgo fgoVar, fgo fgoVar2) {
        throw null;
    }

    public Animator g(ViewGroup viewGroup, View view, fgo fgoVar, fgo fgoVar2) {
        throw null;
    }

    public fhd() {
        this.a = 3;
    }
}
