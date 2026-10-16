package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class twa extends defpackage.tvo {
    protected final float e;
    protected float f;
    protected float g;
    private final int h;

    public twa(int i, defpackage.tvv tvvVar, float f, float f2) {
        super(tvvVar, f, f2);
        this.e = 0.7853982f;
        this.f = 0.125f;
        this.g = 1.0f;
        this.h = i;
    }

    @Override // defpackage.tvo
    public final int h(long j, java.util.Deque deque, java.util.List list) {
        int i;
        int i2;
        int i3 = 2;
        int i4 = 3;
        if (deque.size() < 3) {
            return 2;
        }
        defpackage.tvt tvtVar = (defpackage.tvt) deque.getLast();
        int i5 = tvtVar.d;
        int i6 = this.h;
        int i7 = 1;
        if (i5 != i6) {
            return 1;
        }
        java.util.Iterator itDescendingIterator = deque.descendingIterator();
        defpackage.tvt tvtVar2 = null;
        defpackage.tvt tvtVar3 = tvtVar;
        float fAbs = 0.0f;
        float fAbs2 = 0.0f;
        float fAbs3 = 0.0f;
        float fAbs4 = 0.0f;
        while (true) {
            i = i3;
            if (!itDescendingIterator.hasNext()) {
                i2 = i4;
                break;
            }
            defpackage.tvt tvtVar4 = (defpackage.tvt) itDescendingIterator.next();
            i2 = i4;
            int i8 = tvtVar4.d;
            if (i8 != i5) {
                break;
            }
            int i9 = i7;
            if (i(tvtVar4.a) >= this.e) {
                return i9;
            }
            if ((tvtVar4.b * (i6 - 1)) / this.c < 0.25f) {
                return i9;
            }
            if (tvtVar2 != null) {
                fAbs += java.lang.Math.abs(j(tvtVar4, 0) - j(tvtVar2, 0));
                fAbs3 += java.lang.Math.abs(k(tvtVar4, 0) - k(tvtVar2, 0));
                int i10 = i8 - 1;
                float fJ = j(tvtVar4, i10);
                int i11 = tvtVar2.d - 1;
                fAbs2 += java.lang.Math.abs(fJ - j(tvtVar2, i11));
                fAbs4 += java.lang.Math.abs(k(tvtVar4, i10) - k(tvtVar2, i11));
            }
            i3 = i;
            i4 = i2;
            i7 = i9;
            tvtVar2 = tvtVar4;
            tvtVar3 = tvtVar2;
        }
        int i12 = i7;
        if (fAbs + fAbs2 > (fAbs3 + fAbs4) * this.g) {
            return i12;
        }
        float fK = k(tvtVar, 0) - k(tvtVar3, 0);
        float fK2 = k(tvtVar, i5 - 1) - k(tvtVar3, tvtVar3.d - 1);
        if (fK * fK2 < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return i12;
        }
        float fAbs5 = java.lang.Math.abs(fK);
        float f = this.d;
        return java.lang.Math.min(fAbs5 / f, java.lang.Math.abs(fK2) / f) < this.f ? i : i2;
    }

    protected abstract float i(float f);

    protected abstract float j(defpackage.tvt tvtVar, int i);

    protected abstract float k(defpackage.tvt tvtVar, int i);
}
