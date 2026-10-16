package defpackage;

/* loaded from: classes3.dex */
final class aggq implements afdr {
    final /* synthetic */ aggr this$1;

    public aggq(aggr aggrVar) {
        this.this$1 = aggrVar;
    }

    @Override // defpackage.afdr
    public ahxe invoke() {
        String strValueOf = String.valueOf(this.this$1.val$name.asString());
        return ahxt.create("Scope for type parameter ".concat(strValueOf), this.this$1.this$0.getUpperBounds());
    }
}
