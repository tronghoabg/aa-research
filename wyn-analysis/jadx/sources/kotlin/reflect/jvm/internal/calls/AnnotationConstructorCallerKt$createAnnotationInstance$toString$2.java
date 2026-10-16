package kotlin.reflect.jvm.internal.calls;

import ff.o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnnotationConstructorCallerKt$createAnnotationInstance$toString$2 extends AbstractC3343n implements a {
    final /* synthetic */ Class<T> $annotationClass;
    final /* synthetic */ Map<String, Object> $values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationConstructorCallerKt$createAnnotationInstance$toString$2(Class<T> cls, Map<String, ? extends Object> map) {
        super(0);
        this.$annotationClass = cls;
        this.$values = map;
    }

    @Override // tf.a
    @NotNull
    public final String invoke() {
        Class<T> cls = this.$annotationClass;
        Map<String, Object> map = this.$values;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(cls.getCanonicalName());
        o.v0(map.entrySet(), sb2, ", ", "(", ")", AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1.INSTANCE, 48);
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }
}
