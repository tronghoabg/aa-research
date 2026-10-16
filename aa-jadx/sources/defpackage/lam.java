package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lam {
    public final java.lang.Object a;
    public java.lang.Object b;
    public final java.lang.Object c;

    public lam() {
        this.a = new java.lang.Object();
        this.b = new defpackage.lan(-1, 1, 1, null, 0L);
        this.c = new defpackage.img(10);
    }

    public static defpackage.lam B(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr) {
        return new defpackage.lam(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static defpackage.lam C(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new defpackage.lam(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static defpackage.lam a() {
        return (defpackage.lam) defpackage.mkp.a.i(defpackage.lam.class);
    }

    public static final void e(defpackage.yxo yxoVar, java.lang.Long l) {
        defpackage.omf.u().t(yxoVar, 1, 1, l, 1, null, null, defpackage.yxp.UNKNOWN_CANCEL_TRIGGER);
    }

    public static final void f(int i) {
        defpackage.omf.u().t(defpackage.yxo.VOICE_SESSION_START_REJECTED, g(i), 1, null, 1, null, null, defpackage.yxp.UNKNOWN_CANCEL_TRIGGER);
    }

    public static int g(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 1;
        }
    }

    public final float A(int i) {
        return ((android.content.res.TypedArray) this.a).getDimension(i, -1.0f);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, rfa] */
    public final synchronized void D() {
        java.lang.Object obj = this.b;
        if (obj != null) {
            try {
                this.c.a(obj);
            } catch (android.os.RemoteException | java.lang.IllegalStateException unused) {
            }
            this.b = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rez] */
    public final synchronized void E(defpackage.rfa rfaVar) throws android.os.RemoteException {
        java.lang.Object objA = this.b;
        if (objA == null) {
            objA = this.a.a();
            this.b = objA;
        }
        rfaVar.a(objA);
    }

    public final synchronized void F(defpackage.rey reyVar) {
        java.lang.Object obj = this.b;
        if (obj != null) {
            reyVar.a(obj);
        }
    }

    public final void b(long j) {
        synchronized (this.a) {
            java.util.List list = ((defpackage.lan) this.b).b;
            defpackage.abor aborVarN = defpackage.yxm.a.n();
            aborVarN.t();
            defpackage.yxm yxmVar = (defpackage.yxm) aborVarN.b;
            yxmVar.b |= 2;
            yxmVar.d = 319;
            aborVarN.t();
            defpackage.yxm yxmVar2 = (defpackage.yxm) aborVarN.b;
            yxmVar2.b |= 16;
            yxmVar2.g = j;
            list.add((defpackage.yxm) aborVarN.q());
        }
    }

    public final void c(int i) {
        h(17, java.lang.Integer.valueOf(i));
        if (i == 1) {
            e(defpackage.yxo.VOICE_SESSION_PLATE_ERROR, null);
        }
    }

    public final void d(defpackage.yxo yxoVar) {
        h(2, null);
        e(yxoVar, null);
    }

    public final void h(int i, java.lang.Integer num) {
        synchronized (this.a) {
            ((defpackage.lan) this.b).c(i, num);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void i(int i) {
        defpackage.wfp.f(this.c);
        synchronized (this.a) {
            ((defpackage.lan) this.b).c(i, null);
            ((defpackage.lan) this.b).b();
            this.b = new defpackage.lan(-1, 1, 1, null, 0L);
        }
    }

    public final java.lang.Object j() {
        long id = java.lang.Thread.currentThread().getId();
        if (id == defpackage.cdi.a) {
            return this.b;
        }
        defpackage.sns snsVar = (defpackage.sns) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
        int iA = snsVar.a(id);
        if (iA >= 0) {
            return ((java.lang.Object[]) snsVar.b)[iA];
        }
        return null;
    }

    public final void k(java.lang.Object obj) {
        long id = java.lang.Thread.currentThread().getId();
        if (id == defpackage.cdi.a) {
            this.b = obj;
            return;
        }
        synchronized (this.c) {
            java.lang.Object obj2 = this.a;
            defpackage.sns snsVar = (defpackage.sns) ((java.util.concurrent.atomic.AtomicReference) obj2).get();
            int iA = snsVar.a(id);
            if (iA >= 0) {
                ((java.lang.Object[]) snsVar.b)[iA] = obj;
                return;
            }
            int i = snsVar.a;
            java.lang.Object obj3 = snsVar.b;
            int length = ((java.lang.Object[]) obj3).length;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (((java.lang.Object[]) obj3)[i4] != null) {
                    i3++;
                }
            }
            int i5 = i3 + 1;
            long[] jArr = new long[i5];
            java.lang.Object[] objArr = new java.lang.Object[i5];
            if (i5 > 1) {
                int i6 = 0;
                while (i2 < i5 && i6 < i) {
                    long j = ((long[]) snsVar.c)[i6];
                    java.lang.Object obj4 = ((java.lang.Object[]) obj3)[i6];
                    if (j > id) {
                        jArr[i2] = id;
                        objArr[i2] = obj;
                        i2++;
                        break;
                    } else {
                        if (obj4 != null) {
                            jArr[i2] = j;
                            objArr[i2] = obj4;
                            i2++;
                        }
                        i6++;
                    }
                }
                if (i6 == i) {
                    jArr[i3] = id;
                    objArr[i3] = obj;
                } else {
                    while (i2 < i5) {
                        long j2 = ((long[]) snsVar.c)[i6];
                        java.lang.Object obj5 = ((java.lang.Object[]) obj3)[i6];
                        if (obj5 != null) {
                            jArr[i2] = j2;
                            objArr[i2] = obj5;
                            i2++;
                        }
                        i6++;
                    }
                }
            } else {
                jArr[0] = id;
                objArr[0] = obj;
            }
            ((java.util.concurrent.atomic.AtomicReference) obj2).set(new defpackage.sns(i5, jArr, objArr));
        }
    }

    public final int l(int i, int i2) {
        return ((android.content.res.TypedArray) this.a).getDimensionPixelOffset(i, i2);
    }

    public final int m(int i, int i2) {
        return ((android.content.res.TypedArray) this.a).getDimensionPixelSize(i, i2);
    }

    public final int n(int i, int i2) {
        return ((android.content.res.TypedArray) this.a).getInt(i, i2);
    }

    public final int o(int i, int i2) {
        return ((android.content.res.TypedArray) this.a).getInteger(i, i2);
    }

    public final int p(int i, int i2) {
        return ((android.content.res.TypedArray) this.a).getLayoutDimension(i, i2);
    }

    public final int q(int i, int i2) {
        return ((android.content.res.TypedArray) this.a).getResourceId(i, i2);
    }

    public final android.content.res.ColorStateList r(int i) {
        int resourceId;
        android.content.res.ColorStateList colorStateListD;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListD = defpackage.duw.d((android.content.Context) this.c, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListD;
    }

    public final android.graphics.drawable.Drawable s(int i) {
        int resourceId;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : defpackage.mu.e().c((android.content.Context) this.c, resourceId);
    }

    public final android.graphics.drawable.Drawable t(int i) {
        int resourceId;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return defpackage.jd.d().g((android.content.Context) this.c, resourceId);
    }

    public final java.lang.CharSequence u(int i) {
        return ((android.content.res.TypedArray) this.a).getText(i);
    }

    public final java.lang.String v(int i) {
        return ((android.content.res.TypedArray) this.a).getString(i);
    }

    public final void w() {
        ((android.content.res.TypedArray) this.a).recycle();
    }

    public final boolean x(int i, boolean z) {
        return ((android.content.res.TypedArray) this.a).getBoolean(i, z);
    }

    public final boolean y(int i) {
        return ((android.content.res.TypedArray) this.a).hasValue(i);
    }

    public final int z(int i) {
        return ((android.content.res.TypedArray) this.a).getColor(i, 0);
    }

    public lam(defpackage.rez rezVar, defpackage.rfa rfaVar) {
        this.b = null;
        this.a = rezVar;
        this.c = rfaVar;
    }

    public lam(char[] cArr) {
        this.c = new defpackage.imz();
        this.a = new defpackage.imz();
        this.b = new defpackage.n[32];
    }

    public lam(short[] sArr) {
        this.a = new defpackage.skb((byte[]) null);
        this.c = new defpackage.skb((byte[]) null);
        this.b = new defpackage.dpj[32];
    }

    public lam(android.content.Context context, android.content.res.TypedArray typedArray) {
        this.c = context;
        this.a = typedArray;
    }

    public lam(byte[] bArr) {
        this.a = new java.util.concurrent.atomic.AtomicReference(defpackage.cdh.a);
        this.c = new java.lang.Object();
    }
}
