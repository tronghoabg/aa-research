package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ff.AbstractC2641B;
import ff.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2 extends AbstractC3343n implements a {
    final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.this$0 = noReorderImplementation;
    }

    @Override // tf.a
    @NotNull
    public final Map<Name, TypeAliasDescriptor> invoke() {
        List allTypeAliases = this.this$0.getAllTypeAliases();
        int iD = AbstractC2641B.D(p.a0(allTypeAliases, 10));
        if (iD < 16) {
            iD = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
        for (Object obj : allTypeAliases) {
            Name name = ((TypeAliasDescriptor) obj).getName();
            AbstractC3340k.d(name, "getName(...)");
            linkedHashMap.put(name, obj);
        }
        return linkedHashMap;
    }
}
