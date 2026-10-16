package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aaas extends defpackage.aaaf {
    protected float c;
    protected float d;

    public aaas(defpackage.aaag aaagVar) {
        super(aaagVar);
        this.c = 0.125f;
        this.d = 1.0f;
    }

    @Override // defpackage.aaaf
    public final boolean d() {
        return true;
    }

    @Override // defpackage.aaaf
    public final int h(long j, java.util.LinkedList linkedList, java.util.List list) {
        int i;
        int i2 = 2;
        if (linkedList.size() < 3) {
            return 2;
        }
        defpackage.sg sgVar = (defpackage.sg) linkedList.getLast();
        if (sgVar.k() != 2) {
            return 1;
        }
        java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
        defpackage.sg sgVar2 = null;
        defpackage.sg sgVar3 = sgVar;
        float fAbs = 0.0f;
        float fAbs2 = 0.0f;
        float fAbs3 = 0.0f;
        float fAbs4 = 0.0f;
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = i2;
                break;
            }
            defpackage.sg sgVar4 = (defpackage.sg) listIterator.previous();
            i = i2;
            if (sgVar4.k() != sgVar.k()) {
                break;
            }
            if (i(sgVar4.e()) >= 0.7853982f || sgVar4.f() / sgVar4.h() < 0.25f) {
                return 1;
            }
            if (sgVar2 != null) {
                fAbs += java.lang.Math.abs(j(sgVar4, 0) - j(sgVar2, 0));
                fAbs3 += java.lang.Math.abs(k(sgVar4, 0) - k(sgVar2, 0));
                fAbs2 += java.lang.Math.abs(j(sgVar4, sgVar4.k() - 1) - j(sgVar2, sgVar2.k() - 1));
                fAbs4 += java.lang.Math.abs(k(sgVar4, sgVar4.k() - 1) - k(sgVar2, sgVar2.k() - 1));
            }
            i2 = i;
            sgVar2 = sgVar4;
            sgVar3 = sgVar2;
        }
        if (fAbs + fAbs2 > (fAbs3 + fAbs4) * this.d) {
            return 1;
        }
        float fK = k(sgVar, 0) - k(sgVar3, 0);
        float fK2 = k(sgVar, sgVar.k() - 1) - k(sgVar3, sgVar3.k() - 1);
        if (fK * fK2 < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return 1;
        }
        if (java.lang.Math.min(java.lang.Math.abs(fK) / sgVar.j(), java.lang.Math.abs(fK2) / sgVar.j()) < this.c) {
            return i;
        }
        return 3;
    }

    protected abstract float i(float f);

    protected abstract float j(defpackage.sg sgVar, int i);

    protected abstract float k(defpackage.sg sgVar, int i);
}
