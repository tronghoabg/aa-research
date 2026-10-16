package defpackage;

/* loaded from: classes3.dex */
final class aiah implements afec {
    private final aian arg$0;

    public aiah(aian aianVar) {
        this.arg$0 = aianVar;
    }

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return this.arg$0.computeClassifierDescriptor(((Number) obj).intValue());
    }
}
