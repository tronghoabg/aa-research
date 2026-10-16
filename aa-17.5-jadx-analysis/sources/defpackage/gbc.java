package defpackage;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes2.dex */
final class gbc extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ gbg c;
    final /* synthetic */ zu d;
    final /* synthetic */ aitu e;
    final /* synthetic */ Context f;
    final /* synthetic */ bwq g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbc(gbg gbgVar, zu zuVar, aitu aituVar, Context context, bwq bwqVar, afck afckVar) {
        super(2, afckVar);
        this.c = gbgVar;
        this.d = zuVar;
        this.e = aituVar;
        this.f = context;
        this.g = bwqVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new gbc(this.c, this.d, this.e, this.f, this.g, afckVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        bwq bwqVar;
        bwq bwqVar2;
        boolean zBooleanValue;
        boolean zValueOf;
        afcr afcrVar = afcr.a;
        if (this.b == 0) {
            woy.dF(obj);
            bwqVar = this.g;
            gbg gbgVar = this.c;
            if ((gbgVar instanceof gau) || (gbgVar instanceof gav)) {
                zValueOf = false;
            } else if (gbgVar instanceof gbh) {
                zValueOf = true;
            } else {
                if (!(gbgVar instanceof gbi)) {
                    Objects.toString(gbgVar);
                    throw new IllegalStateException("Unsupported image model: ".concat(gbgVar.toString()));
                }
                zu zuVar = this.d;
                String string = ((gbi) gbgVar).a.toString();
                string.getClass();
                Boolean bool = (Boolean) zuVar.b(string);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                    zValueOf = Boolean.valueOf(zBooleanValue);
                } else {
                    aitu aituVar = this.e;
                    gbb gbbVar = new gbb(this.f, gbgVar, zuVar, null);
                    this.a = bwqVar;
                    this.b = 1;
                    Object objA = ahnc.a(aituVar, gbbVar, this);
                    if (objA == afcrVar) {
                        return afcrVar;
                    }
                    obj = objA;
                    bwqVar2 = bwqVar;
                }
            }
            bwqVar.b(zValueOf);
            return afak.a;
        }
        Object obj2 = this.a;
        woy.dF(obj);
        bwqVar2 = obj2;
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        bwqVar = bwqVar2;
        zBooleanValue = zBooleanValue2;
        zValueOf = Boolean.valueOf(zBooleanValue);
        bwqVar.b(zValueOf);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gbc) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
