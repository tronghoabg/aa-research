package W1;

import N1.C0754c;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import j$.util.Objects;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3406H;
import l8.e0;
import l8.j0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f14944c = new b(AbstractC3409K.n(a.f14940d));

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f14945d;

    /* renamed from: e, reason: collision with root package name */
    public static final j0 f14946e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f14947a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f14948b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC3437s.b(3, objArr);
        f14945d = AbstractC3409K.h(3, objArr);
        E4.n nVar = new E4.n(4, 18);
        nVar.v(5, 6);
        nVar.v(17, 6);
        nVar.v(7, 6);
        nVar.v(30, 10);
        nVar.v(18, 6);
        nVar.v(6, 8);
        nVar.v(8, 8);
        nVar.v(14, 8);
        f14946e = nVar.e();
    }

    public b(e0 e0Var) {
        for (int i5 = 0; i5 < e0Var.f40103d; i5++) {
            a aVar = (a) e0Var.get(i5);
            this.f14947a.put(aVar.f14941a, aVar);
        }
        int iMax = 0;
        for (int i10 = 0; i10 < this.f14947a.size(); i10++) {
            iMax = Math.max(iMax, ((a) this.f14947a.valueAt(i10)).f14942b);
        }
        this.f14948b = iMax;
    }

    public static e0 a(int i5, int[] iArr) {
        C3406H c3406hI = AbstractC3409K.i();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i10 : iArr) {
            c3406hI.a(new a(i10, i5));
        }
        return c3406hI.g();
    }

    public static b b(Context context, C0754c c0754c, Y9.c cVar) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0754c, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static W1.b c(android.content.Context r17, android.content.Intent r18, N1.C0754c r19, Y9.c r20) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.b.c(android.content.Context, android.content.Intent, N1.c, Y9.c):W1.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(N1.C0754c r17, N1.C0765n r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.b.d(N1.c, N1.n):android.util.Pair");
    }

    public final boolean e(int i5) {
        SparseArray sparseArray = this.f14947a;
        int i10 = Q1.x.f9724a;
        return sparseArray.indexOfKey(i5) >= 0;
    }

    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                SparseArray sparseArray = this.f14947a;
                SparseArray sparseArray2 = bVar.f14947a;
                int i5 = Q1.x.f9724a;
                if (sparseArray != null) {
                    if (sparseArray2 != null) {
                        if (Q1.x.f9724a >= 31) {
                            zContentEquals = sparseArray.contentEquals(sparseArray2);
                        } else {
                            int size = sparseArray.size();
                            if (size == sparseArray2.size()) {
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                                    }
                                }
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                    break;
                } else {
                    if (sparseArray2 != null) {
                        zContentEquals = false;
                        break;
                    }
                    zContentEquals = true;
                }
                if (!zContentEquals || this.f14948b != bVar.f14948b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.f14947a;
        if (Q1.x.f9724a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i5)) + ((sparseArray.keyAt(i5) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f14948b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f14948b + ", audioProfiles=" + this.f14947a + "]";
    }
}
