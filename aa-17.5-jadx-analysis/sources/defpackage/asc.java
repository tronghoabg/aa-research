package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class asc implements aiyl {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public asc(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v24, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v14, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.aiyl
    public final /* synthetic */ Object a(Object obj, afck afckVar) {
        int i = this.c;
        if (i == 0) {
            asd asdVar = (asd) obj;
            if (asdVar instanceof asa) {
                this.a.add(asdVar);
            } else if (asdVar instanceof asb) {
                this.a.remove(((asb) asdVar).a);
            }
            this.b.b(Boolean.valueOf(!this.a.isEmpty()));
            return afak.a;
        }
        if (i == 1) {
            asd asdVar2 = (asd) obj;
            if (asdVar2 instanceof ary) {
                this.a.add(asdVar2);
            } else if (asdVar2 instanceof arz) {
                this.a.remove(((arz) asdVar2).a);
            }
            this.b.b(Boolean.valueOf(!this.a.isEmpty()));
            return afak.a;
        }
        if (i == 2) {
            asd asdVar3 = (asd) obj;
            if (asdVar3 instanceof asi) {
                this.a.add(asdVar3);
            } else if (asdVar3 instanceof asj) {
                this.a.remove(((asj) asdVar3).a);
            } else if (asdVar3 instanceof ash) {
                this.a.remove(((ash) asdVar3).a);
            }
            this.b.b(Boolean.valueOf(!this.a.isEmpty()));
            return afak.a;
        }
        if (i != 3) {
            long j = ((cja) obj).a;
            adu aduVar = (adu) this.b;
            if ((((cja) aduVar.d()).a & 9223372034707292159L) != 9205357640488583168L && (j & 9223372034707292159L) != 9205357640488583168L) {
                if (Float.intBitsToFloat((int) (((cja) aduVar.d()).a & 4294967295L)) != Float.intBitsToFloat((int) (4294967295L & j))) {
                    ahnc.d(this.a, null, 0, new aqd(aduVar, j, (afck) null, 3), 3);
                    return afak.a;
                }
            }
            Object objE = aduVar.e(new cja(j), afckVar);
            return objE != afcr.a ? afak.a : objE;
        }
        asd asdVar4 = (asd) obj;
        if ((asdVar4 instanceof asa) || (asdVar4 instanceof ary) || (asdVar4 instanceof asi)) {
            ((aag) this.b).p(asdVar4);
        } else if (asdVar4 instanceof asb) {
            ((aag) this.b).o(((asb) asdVar4).a);
        } else if (asdVar4 instanceof arz) {
            ((aag) this.b).o(((arz) asdVar4).a);
        } else if (asdVar4 instanceof asj) {
            ((aag) this.b).o(((asj) asdVar4).a);
        } else if (asdVar4 instanceof ash) {
            ((aag) this.b).o(((ash) asdVar4).a);
        }
        aag aagVar = (aag) this.b;
        Object[] objArr = aagVar.a;
        int i2 = aagVar.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            asd asdVar5 = (asd) objArr[i4];
            if (asdVar5 instanceof asa) {
                i3 |= 2;
            } else if (asdVar5 instanceof ary) {
                i3 |= 1;
            } else if (asdVar5 instanceof asi) {
                i3 |= 4;
            }
        }
        ((byd) ((bii) this.a).a).h(i3);
        return afak.a;
    }

    public asc(List list, bwq bwqVar, int i) {
        this.c = i;
        this.a = list;
        this.b = bwqVar;
    }
}
