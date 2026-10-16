package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignMetadataKt;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/CampaignMetadataKt$Dsl;", "Lef/C;", "block", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "-initializecampaignMetadata", "(Ltf/l;)Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "campaignMetadata", "copy", "(Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;Ltf/l;)Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CampaignMetadataKtKt {
    @NotNull
    /* renamed from: -initializecampaignMetadata, reason: not valid java name */
    public static final CampaignMetadataOuterClass.CampaignMetadata m342initializecampaignMetadata(@NotNull tf.l block) {
        AbstractC3340k.e(block, "block");
        CampaignMetadataKt.Dsl.Companion companion = CampaignMetadataKt.Dsl.INSTANCE;
        CampaignMetadataOuterClass.CampaignMetadata.Builder builderNewBuilder = CampaignMetadataOuterClass.CampaignMetadata.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        CampaignMetadataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final CampaignMetadataOuterClass.CampaignMetadata copy(@NotNull CampaignMetadataOuterClass.CampaignMetadata campaignMetadata, @NotNull tf.l block) {
        AbstractC3340k.e(campaignMetadata, "<this>");
        AbstractC3340k.e(block, "block");
        CampaignMetadataKt.Dsl.Companion companion = CampaignMetadataKt.Dsl.INSTANCE;
        CampaignMetadataOuterClass.CampaignMetadata.Builder builder = campaignMetadata.toBuilder();
        AbstractC3340k.d(builder, "this.toBuilder()");
        CampaignMetadataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
