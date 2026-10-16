package defpackage;

/* loaded from: classes3.dex */
final class aiai implements afec {
    private final aian arg$0;

    public aiai(aian aianVar) {
        this.arg$0 = aianVar;
    }

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return this.arg$0.computeTypeAliasDescriptor(((Number) obj).intValue());
    }
}
