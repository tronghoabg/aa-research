package gatewayprotocol.v1;

import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/ErrorKt$Dsl;", "Lef/C;", "block", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "-initializeerror", "(Ltf/l;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "error", "copy", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;Ltf/l;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorKtKt {
    @NotNull
    /* renamed from: -initializeerror, reason: not valid java name */
    public static final ErrorOuterClass.Error m355initializeerror(@NotNull tf.l block) {
        AbstractC3340k.e(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.INSTANCE;
        ErrorOuterClass.Error.Builder builderNewBuilder = ErrorOuterClass.Error.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        ErrorKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final ErrorOuterClass.Error copy(@NotNull ErrorOuterClass.Error error, @NotNull tf.l block) {
        AbstractC3340k.e(error, "<this>");
        AbstractC3340k.e(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.INSTANCE;
        ErrorOuterClass.Error.Builder builder = error.toBuilder();
        AbstractC3340k.d(builder, "this.toBuilder()");
        ErrorKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
