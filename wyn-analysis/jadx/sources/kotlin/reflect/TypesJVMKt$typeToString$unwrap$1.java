package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;
import tf.l;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends C3338i implements l {
    public static final TypesJVMKt$typeToString$unwrap$1 INSTANCE = new TypesJVMKt$typeToString$unwrap$1();

    public TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // tf.l
    public final Class<?> invoke(Class<?> p02) {
        AbstractC3340k.e(p02, "p0");
        return p02.getComponentType();
    }
}
