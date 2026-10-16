package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import ff.v;
import java.util.List;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.a;

/* loaded from: classes5.dex */
public final class StaticScopeForKotlinEnum$properties$2 extends AbstractC3343n implements a {
    final /* synthetic */ StaticScopeForKotlinEnum this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticScopeForKotlinEnum$properties$2(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        super(0);
        this.this$0 = staticScopeForKotlinEnum;
    }

    @Override // tf.a
    @NotNull
    public final List<PropertyDescriptor> invoke() {
        return this.this$0.enumEntriesCanBeUsed ? AbstractC3935e.E(DescriptorFactory.createEnumEntriesProperty(this.this$0.containingClass)) : v.f35432a;
    }
}
