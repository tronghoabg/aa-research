package R0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f10071a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10072b;

    public static long a(f fVar, long j8) {
        o oVar = fVar.f10061d;
        if (oVar instanceof j) {
            return j8;
        }
        ArrayList arrayList = fVar.k;
        int size = arrayList.size();
        long jMin = j8;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) arrayList.get(i5);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f10061d != oVar) {
                    jMin = Math.min(jMin, a(fVar2, fVar2.f10063f + j8));
                }
            }
        }
        if (fVar != oVar.f10088i) {
            return jMin;
        }
        long j10 = oVar.j();
        long j11 = j8 - j10;
        return Math.min(Math.min(jMin, a(oVar.f10087h, j11)), j11 - r9.f10063f);
    }

    public static long b(f fVar, long j8) {
        o oVar = fVar.f10061d;
        if (oVar instanceof j) {
            return j8;
        }
        ArrayList arrayList = fVar.k;
        int size = arrayList.size();
        long jMax = j8;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) arrayList.get(i5);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f10061d != oVar) {
                    jMax = Math.max(jMax, b(fVar2, fVar2.f10063f + j8));
                }
            }
        }
        if (fVar != oVar.f10087h) {
            return jMax;
        }
        long j10 = oVar.j();
        long j11 = j8 + j10;
        return Math.max(Math.max(jMax, b(oVar.f10088i, j11)), j11 - r9.f10063f);
    }
}
