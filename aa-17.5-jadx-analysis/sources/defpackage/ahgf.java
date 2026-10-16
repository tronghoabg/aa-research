package defpackage;

/* loaded from: classes3.dex */
final class ahgf extends ahgd {
    final /* synthetic */ ahgg this$1;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
    }

    public ahgf(ahgg ahggVar) {
        this.this$1 = ahggVar;
    }

    @Override // defpackage.ahgd
    protected void visitEnd(String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(0);
        }
        this.this$1.this$0.strings = strArr;
    }
}
