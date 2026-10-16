package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class PrimitiveType$arrayTypeFqName$2 extends AbstractC3343n implements a {
    final /* synthetic */ PrimitiveType this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveType$arrayTypeFqName$2(PrimitiveType primitiveType) {
        super(0);
        this.this$0 = primitiveType;
    }

    @Override // tf.a
    @NotNull
    public final FqName invoke() {
        FqName fqNameChild = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(this.this$0.getArrayTypeName());
        AbstractC3340k.d(fqNameChild, "child(...)");
        return fqNameChild;
    }
}
