package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class wnq {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public wnq(uev uevVar, uev uevVar2) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = new uex();
        this.d = uevVar;
        this.e = uevVar2;
        int iCeil = (int) Math.ceil(uevVar.b() / 350.0f);
        int iCeil2 = (int) Math.ceil(uevVar.a() / 250.0f);
        this.a = iCeil;
        for (int i = 0; i < iCeil * iCeil2; i++) {
            this.b.add(null);
            this.c.add(null);
        }
    }

    static wnq c(Context context, int i) throws Resources.NotFoundException {
        ebe.j(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, won.b);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListH = wub.h(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListH2 = wub.h(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListH3 = wub.h(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        wuk wukVar = new wuk(wuk.k(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)));
        typedArrayObtainStyledAttributes.recycle();
        return new wnq(colorStateListH, colorStateListH2, colorStateListH3, dimensionPixelSize, wukVar, rect);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    private final void h(uew uewVar) {
        float f = uewVar.c(0).b;
        float fMin = uewVar.c(0).c;
        float fMax = f;
        float fMax2 = fMin;
        float fMin2 = fMax;
        for (int i = 1; i < 4; i++) {
            tpf tpfVarC = uewVar.c(i);
            fMin2 = Math.min(tpfVarC.b, fMin2);
            fMin = Math.min(tpfVarC.c, fMin);
            fMax = Math.max(tpfVarC.b, fMax);
            fMax2 = Math.max(tpfVarC.c, fMax2);
        }
        uev uevVar = (uev) this.d;
        float f2 = uevVar.a;
        float f3 = uevVar.b;
        float f4 = fMin - f3;
        float f5 = fMax2 - f3;
        uex uexVar = (uex) this.f;
        uexVar.a = (int) Math.max(0.0d, Math.floor((fMin2 - f2) / 350.0f));
        double d = this.a;
        uexVar.c = (int) Math.min(d, Math.ceil((fMax - f2) / 350.0f));
        uexVar.b = (int) Math.max(0.0d, Math.floor(f4 / 250.0f));
        uexVar.d = (int) Math.min(this.b.size() / d, Math.ceil(f5 / 250.0f));
    }

    private final void i(fsy fsyVar, ncp ncpVar) {
        fsy fsyVar2 = (fsy) this.e;
        if (fsyVar.a != fsyVar2.a) {
            throw new IllegalStateException(a.bm(ncpVar, "Interceptor '", "' cannot modify the request's context."));
        }
        if (fsyVar.b == fta.a) {
            throw new IllegalStateException(a.bm(ncpVar, "Interceptor '", "' cannot set the request's data to null."));
        }
        if (fsyVar.c != fsyVar2.c) {
            throw new IllegalStateException(a.bm(ncpVar, "Interceptor '", "' cannot modify the request's target."));
        }
        if (fsyVar.u != fsyVar2.u) {
            throw new IllegalStateException(a.bm(ncpVar, "Interceptor '", "' cannot modify the request's lifecycle."));
        }
        if (fsyVar.v != fsyVar2.v) {
            throw new IllegalStateException(a.bm(ncpVar, "Interceptor '", "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead."));
        }
    }

    public final int a() {
        return ((Rect) this.b).bottom;
    }

    public final int b() {
        return ((Rect) this.b).top;
    }

    final void d(TextView textView) {
        wue wueVar = new wue();
        wue wueVar2 = new wue();
        wuk wukVar = (wuk) this.f;
        wueVar.d(wukVar);
        wueVar2.d(wukVar);
        wueVar.O((ColorStateList) this.d);
        wueVar.T(this.a, (ColorStateList) this.e);
        ColorStateList colorStateList = (ColorStateList) this.c;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), wueVar, wueVar2);
        Rect rect = (Rect) this.b;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [fpp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fsy r12, defpackage.afck r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.fsa
            if (r0 == 0) goto L13
            r0 = r13
            fsa r0 = (defpackage.fsa) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fsa r0 = new fsa
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ncp r12 = r0.d
            defpackage.woy.dF(r13)
            goto L6c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.woy.dF(r13)
            int r13 = r11.a
            if (r13 <= 0) goto L45
            java.lang.Object r2 = r11.c
            int r4 = r13 + (-1)
            java.lang.Object r2 = r2.get(r4)
            ncp r2 = (defpackage.ncp) r2
            r11.i(r12, r2)
        L45:
            java.lang.Object r6 = r11.c
            java.lang.Object r2 = r6.get(r13)
            ncp r2 = (defpackage.ncp) r2
            int r7 = r13 + 1
            java.lang.Object r13 = r11.b
            java.lang.Object r4 = r11.e
            java.lang.Object r10 = r11.d
            r5 = r4
            wnq r4 = new wnq
            fsy r5 = (defpackage.fsy) r5
            r9 = r13
            ftn r9 = (defpackage.ftn) r9
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.d = r2
            r0.b = r3
            java.lang.Object r13 = r2.z(r4, r0)
            if (r13 == r1) goto L76
            r12 = r2
        L6c:
            fsz r13 = (defpackage.fsz) r13
            fsy r0 = r13.b()
            r11.i(r0, r12)
            return r13
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnq.e(fsy, afck):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @ResultIgnorabilityUnspecified
    public final boolean f(rjs rjsVar, uez uezVar, int i) {
        uew uewVar = (uew) rjsVar.a;
        boolean z = false;
        if (!((uev) this.d).d(uewVar.a)) {
            return false;
        }
        h(uewVar);
        if (g(rjsVar, uezVar, i)) {
            uex uexVar = (uex) this.f;
            int i2 = uexVar.a;
            while (true) {
                z = true;
                if (i2 >= uexVar.c) {
                    break;
                }
                for (int i3 = uexVar.b; i3 < uexVar.d; i3++) {
                    if (i - 1 != 1) {
                        ?? r3 = this.b;
                        int i4 = (this.a * i3) + i2;
                        gms gmsVar = (gms) r3.get(i4);
                        if (gmsVar == null) {
                            gmsVar = new gms(null, null, null);
                            r3.set(i4, gmsVar);
                        }
                        gmsVar.v(rjsVar);
                    } else {
                        ?? r32 = this.c;
                        int i5 = (this.a * i3) + i2;
                        gms gmsVar2 = (gms) r32.get(i5);
                        if (gmsVar2 == null) {
                            gmsVar2 = new gms(null, null, null);
                            r32.set(i5, gmsVar2);
                        }
                        gmsVar2.v(rjsVar);
                    }
                }
                i2++;
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    public final boolean g(rjs rjsVar, uez uezVar, int i) {
        gms gmsVar;
        uew uewVar = (uew) rjsVar.a;
        if (!((uev) this.d).d(uewVar.a)) {
            return false;
        }
        h(uewVar);
        uex uexVar = (uex) this.f;
        for (int i2 = uexVar.a; i2 < uexVar.c; i2++) {
            for (int i3 = uexVar.b; i3 < uexVar.d; i3++) {
                ?? r4 = this.b;
                int i4 = (this.a * i3) + i2;
                gms gmsVar2 = (gms) r4.get(i4);
                if (gmsVar2 != null && gmsVar2.w(rjsVar, uezVar)) {
                    return false;
                }
                if (i == 2 && (gmsVar = (gms) this.c.get(i4)) != null && gmsVar.w(rjsVar, uezVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    public wnq(wnq wnqVar) {
        this.a = wnqVar.a;
        this.d = wnqVar.d;
        this.c = wnqVar.c;
        this.e = wnqVar.e;
        this.f = wnqVar.f;
        this.b = wnqVar.b;
    }

    private wnq(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, wuk wukVar, Rect rect) {
        ebe.l(rect.left);
        ebe.l(rect.top);
        ebe.l(rect.right);
        ebe.l(rect.bottom);
        this.b = rect;
        this.c = colorStateList2;
        this.d = colorStateList;
        this.e = colorStateList3;
        this.a = i;
        this.f = wukVar;
    }

    public wnq(fsy fsyVar, List list, int i, fsy fsyVar2, ftn ftnVar, fpp fppVar) {
        fsyVar.getClass();
        list.getClass();
        fsyVar2.getClass();
        ftnVar.getClass();
        fppVar.getClass();
        this.e = fsyVar;
        this.c = list;
        this.a = i;
        this.f = fsyVar2;
        this.b = ftnVar;
        this.d = fppVar;
    }

    public wnq(int i, ujk ujkVar, ukh ukhVar, rhj rhjVar, zdg zdgVar, yfy yfyVar) {
        this.a = i;
        this.d = ujkVar;
        this.c = ukhVar;
        this.e = rhjVar;
        this.f = zdgVar;
        this.b = yfyVar;
    }
}
