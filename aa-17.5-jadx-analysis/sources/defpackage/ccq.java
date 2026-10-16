package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class ccq {
    public Object a;
    public final Object b;
    public Object c;
    private final Object d;
    private Object e;

    public ccq() {
        this.d = new Object();
        this.b = new cco();
        this.e = new aag(16);
        this.c = new aag(16);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dzg, java.lang.Object] */
    private final void f(Typeface typeface) {
        this.e = typeface;
        this.d.a(typeface);
    }

    public final buo a(ccp ccpVar, afdr afdrVar) {
        int i;
        int i2;
        int i3;
        afft afftVar = new afft();
        afftVar.a = -1;
        synchronized (this.d) {
            Object obj = this.a;
            if (obj != null) {
                ccpVar.b((Throwable) obj);
                return bun.a;
            }
            Object obj2 = this.b;
            do {
                i = ((cco) obj2).get();
                i2 = i + 1;
            } while (!((cco) obj2).compareAndSet(i, i2));
            int i4 = 134217727 & i2;
            afftVar.a = (i2 >>> 27) & 15;
            ((aag) this.e).p(ccpVar);
            if (i4 == 1 && afdrVar != null) {
                try {
                    afdrVar.invoke();
                } catch (Throwable th) {
                    synchronized (this.d) {
                        if (this.a == null) {
                            this.a = th;
                            Object obj3 = this.e;
                            Object[] objArr = ((aag) obj3).a;
                            int i5 = ((aag) obj3).b;
                            for (int i6 = 0; i6 < i5; i6++) {
                                ((ccp) objArr[i6]).b(th);
                            }
                            ((aag) this.e).k();
                            Object obj4 = this.b;
                            do {
                                i3 = ((cco) obj4).get();
                            } while (!((cco) obj4).compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                        }
                    }
                }
            }
            return new bwv(new axf(ccpVar, this, afftVar, 4));
        }
    }

    public final void b(afec afecVar) {
        int i;
        synchronized (this.d) {
            Object obj = this.e;
            this.e = this.c;
            this.c = obj;
            Object obj2 = this.b;
            do {
                i = ((cco) obj2).get();
            } while (!((cco) obj2).compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
            int i2 = ((aag) obj).b;
            for (int i3 = 0; i3 < i2; i3++) {
                afecVar.invoke(((aag) obj).c(i3));
            }
            ((aag) obj).k();
        }
    }

    public final boolean c() {
        return (((cco) this.b).get() & 134217727) > 0;
    }

    public final void d(Typeface typeface) {
        this.c = typeface;
        f(typeface);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            java.lang.Object r1 = r13.c
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.text.TextPaint r2 = r0.getPaint()
            java.lang.Object r3 = r13.e
            android.graphics.Typeface r4 = r2.getTypeface()
            if (r3 == r4) goto L1d
            java.lang.String r1 = "FontVarSettings"
            java.lang.String r3 = "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint()."
            android.util.Log.w(r1, r3)
            android.graphics.Typeface r1 = r2.getTypeface()
        L1d:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            r4 = 0
            if (r2 < r3) goto L39
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = defpackage.a$$ExternalSyntheticApiModelOutline2.m(r0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r2) goto L3a
        L39:
            r0 = r4
        L3a:
            zu r2 = defpackage.jv.a
            ju r2 = new ju
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r2.<init>(r1, r14, r0)
            zu r3 = defpackage.jv.a
            java.lang.Object r5 = r3.b(r2)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            r6 = 1
            if (r5 == 0) goto L50
            goto Ld3
        L50:
            android.graphics.Paint r5 = defpackage.jv.b
            if (r5 != 0) goto L5b
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            defpackage.jv.b = r5
        L5b:
            if (r0 != 0) goto L5e
            goto L6d
        L5e:
            boolean r7 = android.text.TextUtils.isEmpty(r14)
            if (r7 == 0) goto L67
            android.graphics.fonts.FontVariationAxis[] r7 = new android.graphics.fonts.FontVariationAxis[r4]
            goto L6f
        L67:
            android.graphics.fonts.FontVariationAxis[] r7 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r14)
            if (r7 != 0) goto L6f
        L6d:
            r0 = r14
            goto Lb3
        L6f:
            r8 = r4
            r9 = r8
        L71:
            int r10 = r7.length
            java.lang.String r11 = "wght"
            if (r8 >= r10) goto L97
            r10 = r7[r8]
            java.lang.String r12 = defpackage.a$$ExternalSyntheticApiModelOutline0.m15m(r10)
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L94
            android.graphics.fonts.FontVariationAxis r9 = new android.graphics.fonts.FontVariationAxis
            float r10 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r10)
            float r12 = (float) r0
            float r10 = r10 + r12
            float r10 = defpackage.jv.a(r10)
            r9.<init>(r11, r10)
            r7[r8] = r9
            r9 = r6
        L94:
            int r8 = r8 + 1
            goto L71
        L97:
            if (r9 != 0) goto Laf
            int r8 = r10 + 1
            android.graphics.fonts.FontVariationAxis[] r8 = new android.graphics.fonts.FontVariationAxis[r8]
            java.lang.System.arraycopy(r7, r4, r8, r4, r10)
            int r0 = r0 + 400
            android.graphics.fonts.FontVariationAxis r7 = new android.graphics.fonts.FontVariationAxis
            float r0 = (float) r0
            float r0 = defpackage.jv.a(r0)
            r7.<init>(r11, r0)
            r8[r10] = r7
            r7 = r8
        Laf:
            java.lang.String r0 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r7)
        Lb3:
            java.lang.String r7 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r5)
            boolean r7 = j$.util.Objects.equals(r7, r0)
            r8 = 0
            if (r7 == 0) goto Lc1
            defpackage.a$$ExternalSyntheticApiModelOutline0.m(r5, r8)
        Lc1:
            r5.setTypeface(r1)
            boolean r0 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r5, r0)
            if (r0 == 0) goto Ld2
            android.graphics.Typeface r5 = r5.getTypeface()
            r3.c(r2, r5)
            goto Ld3
        Ld2:
            r5 = r8
        Ld3:
            if (r5 == 0) goto Ldb
            r13.f(r5)
            r13.a = r14
            return r6
        Ldb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccq.e(java.lang.String):boolean");
    }

    public ccq(TextView textView, dzg dzgVar) {
        this.b = textView;
        this.d = dzgVar;
    }
}
