package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.AttributeSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class lah {
    public final Object a;
    public Object b;
    public final Object c;

    public lah() {
        this.a = new Object();
        this.b = new lai(-1, 1, 1, null, 0L);
        this.c = new ily(10);
    }

    public static lah B(Context context, AttributeSet attributeSet, int[] iArr) {
        return new lah(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static lah C(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new lah(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static lah a() {
        return (lah) mki.a.i(lah.class);
    }

    public static final void e(ywj ywjVar, Long l) {
        ebf.j().t(ywjVar, 1, 1, l, 1, null, null, ywk.UNKNOWN_CANCEL_TRIGGER);
    }

    public static final void f(int i) {
        ebf.j().t(ywj.VOICE_SESSION_START_REJECTED, g(i), 1, null, 1, null, null, ywk.UNKNOWN_CANCEL_TRIGGER);
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
        return ((TypedArray) this.a).getDimension(i, -1.0f);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ref] */
    public final synchronized void D() {
        Object obj = this.b;
        if (obj != null) {
            try {
                this.c.a(obj);
            } catch (RemoteException | IllegalStateException unused) {
            }
            this.b = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ree] */
    public final synchronized void E(ref refVar) throws RemoteException {
        Object objA = this.b;
        if (objA == null) {
            objA = this.a.a();
            this.b = objA;
        }
        refVar.a(objA);
    }

    public final synchronized void F(red redVar) {
        Object obj = this.b;
        if (obj != null) {
            redVar.a(obj);
        }
    }

    public final void b(long j) {
        synchronized (this.a) {
            List list = ((lai) this.b).b;
            abnp abnpVarN = ywh.a.n();
            abnpVarN.t();
            ywh ywhVar = (ywh) abnpVarN.b;
            ywhVar.b |= 2;
            ywhVar.d = 319;
            abnpVarN.t();
            ywh ywhVar2 = (ywh) abnpVarN.b;
            ywhVar2.b |= 16;
            ywhVar2.g = j;
            list.add((ywh) abnpVarN.q());
        }
    }

    public final void c(int i) {
        h(17, Integer.valueOf(i));
        if (i == 1) {
            e(ywj.VOICE_SESSION_PLATE_ERROR, null);
        }
    }

    public final void d(ywj ywjVar) {
        h(2, null);
        e(ywjVar, null);
    }

    public final void h(int i, Integer num) {
        synchronized (this.a) {
            ((lai) this.b).c(i, num);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void i(int i) {
        wer.f(this.c);
        synchronized (this.a) {
            ((lai) this.b).c(i, null);
            ((lai) this.b).b();
            this.b = new lai(-1, 1, 1, null, 0L);
        }
    }

    public final Object j() {
        long id = Thread.currentThread().getId();
        if (id == cdc.a) {
            return this.b;
        }
        smv smvVar = (smv) ((AtomicReference) this.a).get();
        int iA = smvVar.a(id);
        if (iA >= 0) {
            return ((Object[]) smvVar.b)[iA];
        }
        return null;
    }

    public final void k(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == cdc.a) {
            this.b = obj;
            return;
        }
        synchronized (this.c) {
            Object obj2 = this.a;
            smv smvVar = (smv) ((AtomicReference) obj2).get();
            int iA = smvVar.a(id);
            if (iA >= 0) {
                ((Object[]) smvVar.b)[iA] = obj;
                return;
            }
            int i = smvVar.a;
            Object obj3 = smvVar.b;
            int length = ((Object[]) obj3).length;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (((Object[]) obj3)[i4] != null) {
                    i3++;
                }
            }
            int i5 = i3 + 1;
            long[] jArr = new long[i5];
            Object[] objArr = new Object[i5];
            if (i5 > 1) {
                int i6 = 0;
                while (true) {
                    if (i2 >= i5 || i6 >= i) {
                        break;
                    }
                    long j = ((long[]) smvVar.c)[i6];
                    Object obj4 = ((Object[]) obj3)[i6];
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
                        long j2 = ((long[]) smvVar.c)[i6];
                        Object obj5 = ((Object[]) obj3)[i6];
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
            ((AtomicReference) obj2).set(new smv(i5, jArr, objArr));
        }
    }

    public final int l(int i, int i2) {
        return ((TypedArray) this.a).getDimensionPixelOffset(i, i2);
    }

    public final int m(int i, int i2) {
        return ((TypedArray) this.a).getDimensionPixelSize(i, i2);
    }

    public final int n(int i, int i2) {
        return ((TypedArray) this.a).getInt(i, i2);
    }

    public final int o(int i, int i2) {
        return ((TypedArray) this.a).getInteger(i, i2);
    }

    public final int p(int i, int i2) {
        return ((TypedArray) this.a).getLayoutDimension(i, i2);
    }

    public final int q(int i, int i2) {
        return ((TypedArray) this.a).getResourceId(i, i2);
    }

    public final ColorStateList r(int i) throws Resources.NotFoundException {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.a;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            Context context = (Context) this.c;
            ColorStateList colorStateListB = dvb.b(context.getResources(), resourceId, context.getTheme());
            if (colorStateListB != null) {
                return colorStateListB;
            }
        }
        return typedArray.getColorStateList(i);
    }

    public final Drawable s(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : mr.e().c((Context) this.c, resourceId);
    }

    public final Drawable t(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return jc.d().g((Context) this.c, resourceId);
    }

    public final CharSequence u(int i) {
        return ((TypedArray) this.a).getText(i);
    }

    public final String v(int i) {
        return ((TypedArray) this.a).getString(i);
    }

    public final void w() {
        ((TypedArray) this.a).recycle();
    }

    public final boolean x(int i, boolean z) {
        return ((TypedArray) this.a).getBoolean(i, z);
    }

    public final boolean y(int i) {
        return ((TypedArray) this.a).hasValue(i);
    }

    public final int z(int i) {
        return ((TypedArray) this.a).getColor(i, 0);
    }

    public lah(ree reeVar, ref refVar) {
        this.b = null;
        this.a = reeVar;
        this.c = refVar;
    }

    public lah(char[] cArr) {
        this.c = new imr();
        this.a = new imr();
        this.b = new n[32];
    }

    public lah(short[] sArr) {
        this.a = new sjg((byte[]) null);
        this.c = new sjg((byte[]) null);
        this.b = new dpb[32];
    }

    public lah(Context context, TypedArray typedArray) {
        this.c = context;
        this.a = typedArray;
    }

    public lah(byte[] bArr) {
        this.a = new AtomicReference(cdb.a);
        this.c = new Object();
    }
}
