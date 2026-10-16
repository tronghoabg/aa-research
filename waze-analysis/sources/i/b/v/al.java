package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class al implements com.google.v.el {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f49355a;

    al(int i2) {
        this.f49355a = i2;
    }

    @Override // com.google.v.el
    public final /* synthetic */ Object convert(int i2) {
        int i3 = this.f49355a;
        if (i3 == 0) {
            an anVarA = an.a(i2);
            return anVarA == null ? an.PAYMENT_METHOD_UNKNOWN : anVarA;
        }
        if (i3 == 1) {
            ar arVarA = ar.a(i2);
            return arVarA == null ? ar.PAYMENT_METHOD_UNKNOWN : arVarA;
        }
        if (i3 == 2) {
            an anVarA2 = an.a(i2);
            return anVarA2 == null ? an.PAYMENT_METHOD_UNKNOWN : anVarA2;
        }
        if (i3 != 3) {
            cs csVarA = cs.a(i2);
            return csVarA == null ? cs.CASH : csVarA;
        }
        co coVarA = co.a(i2);
        return coVarA == null ? co.STREET_LEVEL : coVarA;
    }
}
