package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.PlacementKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/PlacementKt$Dsl;", "Lef/C;", "block", "Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;", "-initializeplacement", "(Ltf/l;)Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;", "placement", "copy", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;Ltf/l;)Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlacementKtKt {
    @NotNull
    /* renamed from: -initializeplacement, reason: not valid java name */
    public static final InitializationResponseOuterClass.Placement m377initializeplacement(@NotNull tf.l block) {
        AbstractC3340k.e(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.INSTANCE;
        InitializationResponseOuterClass.Placement.Builder builderNewBuilder = InitializationResponseOuterClass.Placement.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final InitializationResponseOuterClass.Placement copy(@NotNull InitializationResponseOuterClass.Placement placement, @NotNull tf.l block) {
        AbstractC3340k.e(placement, "<this>");
        AbstractC3340k.e(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.INSTANCE;
        InitializationResponseOuterClass.Placement.Builder builder = placement.toBuilder();
        AbstractC3340k.d(builder, "this.toBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
