package kotlin.reflect.jvm.internal;

import ef.C2527k;
import ef.C2533q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import org.jetbrains.annotations.Nullable;
import tf.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lef/q;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "invoke", "()Lef/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class KPackageImpl$Data$metadata$2 extends AbstractC3343n implements a {
    final /* synthetic */ KPackageImpl.Data this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$metadata$2(KPackageImpl.Data data) {
        super(0);
        this.this$0 = data;
    }

    @Override // tf.a
    @Nullable
    public final C2533q invoke() {
        KotlinClassHeader classHeader;
        ReflectKotlinClass kotlinClass = this.this$0.getKotlinClass();
        if (kotlinClass != null && (classHeader = kotlinClass.getClassHeader()) != null) {
            String[] data = classHeader.getData();
            String[] strings = classHeader.getStrings();
            if (data != null && strings != null) {
                C2527k packageDataFrom = JvmProtoBufUtil.readPackageDataFrom(data, strings);
                return new C2533q((JvmNameResolver) packageDataFrom.f34671a, (ProtoBuf.Package) packageDataFrom.f34672b, classHeader.getMetadataVersion());
            }
        }
        return null;
    }
}
