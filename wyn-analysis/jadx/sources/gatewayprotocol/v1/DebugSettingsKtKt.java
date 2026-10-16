package gatewayprotocol.v1;

import gatewayprotocol.v1.DebugSettingsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/DebugSettingsKt$Dsl;", "Lef/C;", "block", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "-initializedebugSettings", "(Ltf/l;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "debugSettings", "copy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;Ltf/l;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DebugSettingsKtKt {
    @NotNull
    /* renamed from: -initializedebugSettings, reason: not valid java name */
    public static final NativeConfigurationOuterClass.DebugSettings m345initializedebugSettings(@NotNull tf.l block) {
        AbstractC3340k.e(block, "block");
        DebugSettingsKt.Dsl.Companion companion = DebugSettingsKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.DebugSettings.Builder builderNewBuilder = NativeConfigurationOuterClass.DebugSettings.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        DebugSettingsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final NativeConfigurationOuterClass.DebugSettings copy(@NotNull NativeConfigurationOuterClass.DebugSettings debugSettings, @NotNull tf.l block) {
        AbstractC3340k.e(debugSettings, "<this>");
        AbstractC3340k.e(block, "block");
        DebugSettingsKt.Dsl.Companion companion = DebugSettingsKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.DebugSettings.Builder builder = debugSettings.toBuilder();
        AbstractC3340k.d(builder, "this.toBuilder()");
        DebugSettingsKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
