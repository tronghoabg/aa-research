package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class azk implements cts {
    private final cvd a;
    private final azh b;
    private final zh c;
    private final nfh d;

    /* JADX WARN: Type inference failed for: r1v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [azh, java.lang.Object] */
    public azk(nfh nfhVar, cvd cvdVar) {
        this.d = nfhVar;
        this.a = cvdVar;
        this.b = nfhVar.c.invoke();
        zh zhVar = zi.a;
        new zh(6);
        this.c = new zh(6);
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.dlg
    public final float eA(float f) {
        return this.a.eA(f);
    }

    @Override // defpackage.dlg
    public final int eE(long j) {
        return this.a.eE(j);
    }

    @Override // defpackage.dlg
    public final int eF(float f) {
        return this.a.eF(f);
    }

    @Override // defpackage.dlg
    public final long eG(long j) {
        return this.a.eG(j);
    }

    @Override // defpackage.dlg
    public final long eH(long j) {
        return this.a.eH(j);
    }

    @Override // defpackage.dlm
    public final long eI(float f) {
        return this.a.eI(f);
    }

    @Override // defpackage.dlg
    public final long eJ(float f) {
        return this.a.eJ(f);
    }

    @Override // defpackage.cts
    public final ctq eK(int i, int i2, Map map, afec afecVar) {
        return this.a.eK(i, i2, map, afecVar);
    }

    @Override // defpackage.cts
    public final ctq eL(int i, int i2, Map map, afec afecVar, afec afecVar2) {
        return this.a.eL(i, i2, map, afecVar, afecVar2);
    }

    @Override // defpackage.csq
    public final boolean eM() {
        return this.a.eM();
    }

    @Override // defpackage.dlm
    public final float ew(long j) {
        return this.a.ew(j);
    }

    @Override // defpackage.dlg
    public final float ex(float f) {
        return this.a.ex(f);
    }

    @Override // defpackage.dlg
    public final float ey(int i) {
        return this.a.ey(i);
    }

    @Override // defpackage.dlg
    public final float ez(long j) {
        return this.a.ez(j);
    }

    @Override // defpackage.csq
    public final dlr p() {
        return this.a.p();
    }

    public final List r(int i) {
        zh zhVar = this.c;
        List list = (List) zhVar.a(i);
        if (list != null) {
            return list;
        }
        azh azhVar = this.b;
        Object objD = azhVar.d(i);
        List listR = this.a.r(objD, this.d.z(i, objD, azhVar.c(i)));
        zhVar.g(i, listR);
        return listR;
    }
}
