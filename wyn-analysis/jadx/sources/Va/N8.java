package Va;

import java.math.BigDecimal;

/* loaded from: classes4.dex */
public abstract class N8 extends F8 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13552i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N8(AbstractC1215y8 abstractC1215y8, AbstractC1215y8 abstractC1215y82, int i5) {
        super(abstractC1215y8, abstractC1215y82);
        this.f13552i = i5;
    }

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        switch (this.f13552i) {
            case 0:
                Object objC = e().c(c1203x8, c1214y7).c();
                Object objC2 = f().c(c1203x8, c1214y7).c();
                try {
                    return new C1139s8(Boolean.valueOf(l(new BigDecimal(objC.toString()).compareTo(new BigDecimal(objC2.toString())))));
                } catch (Exception unused) {
                    return ((objC instanceof String) && (objC2 instanceof String)) ? new C1139s8(Boolean.valueOf(k((String) objC, (String) objC2))) : new C1139s8(Boolean.valueOf(j(objC, objC2)));
                }
            default:
                return new C1139s8(i(e().c(c1203x8, c1214y7).a(), f().c(c1203x8, c1214y7).a()));
        }
    }

    public abstract Number i(Number number, Number number2);

    public abstract boolean j(Object obj, Object obj2);

    public abstract boolean k(String str, String str2);

    public abstract boolean l(int i5);
}
