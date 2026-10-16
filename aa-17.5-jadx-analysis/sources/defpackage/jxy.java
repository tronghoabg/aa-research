package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class jxy implements aiyl {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jxy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aiyl, java.lang.Object] */
    @Override // defpackage.aiyl
    public final Object a(Object obj, afck afckVar) {
        Object objA;
        Object objA2;
        int i = this.b;
        if (i == 0) {
            Object objA3 = this.a.a(woy.bH((List) obj), afckVar);
            return objA3 == afcr.a ? objA3 : afak.a;
        }
        if (i == 1) {
            Object objA4 = this.a.a(Boolean.valueOf(!((Boolean) obj).booleanValue()), afckVar);
            return objA4 == afcr.a ? objA4 : afak.a;
        }
        if (i == 2) {
            return (((Boolean) obj).booleanValue() || (objA = this.a.a(obj, afckVar)) != afcr.a) ? afak.a : objA;
        }
        if (i == 3) {
            affx.f(afckVar.hH());
            return this.a.a(obj, afckVar);
        }
        if (i == 4) {
            if (obj == null) {
                obj = ajbb.a;
            }
            return ((aixm) this.a).h(obj, afckVar);
        }
        if (i != 5) {
            return (obj == null || (objA2 = this.a.a(obj, afckVar)) != afcr.a) ? afak.a : objA2;
        }
        ((affv) this.a).a = obj;
        throw new ajag(this);
    }
}
