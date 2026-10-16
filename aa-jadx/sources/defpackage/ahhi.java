package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahhi extends defpackage.ahhd {
    final /* synthetic */ defpackage.ahhj this$1;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
    }

    public ahhi(defpackage.ahhj ahhjVar) {
        this.this$1 = ahhjVar;
    }

    @Override // defpackage.ahhd
    protected void visitEnd(java.lang.String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(0);
        }
        this.this$1.this$0.strings = strArr;
    }
}
