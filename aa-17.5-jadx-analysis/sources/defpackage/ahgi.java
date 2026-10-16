package defpackage;

/* loaded from: classes3.dex */
final class ahgi extends ahgd {
    final /* synthetic */ ahgj this$1;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
    }

    public ahgi(ahgj ahgjVar) {
        this.this$1 = ahgjVar;
    }

    @Override // defpackage.ahgd
    protected void visitEnd(String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(0);
        }
        this.this$1.this$0.strings = strArr;
    }
}
