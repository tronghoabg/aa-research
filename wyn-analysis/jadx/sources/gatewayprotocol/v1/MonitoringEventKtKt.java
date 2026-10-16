package gatewayprotocol.v1;

import gatewayprotocol.v1.MonitoringEventKt;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/MonitoringEventKt$Dsl;", "Lef/C;", "block", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent;", "-initializemonitoringEvent", "(Ltf/l;)Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent;", "monitoringEvent", "copy", "(Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent;Ltf/l;)Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MonitoringEventKtKt {
    @NotNull
    /* renamed from: -initializemonitoringEvent, reason: not valid java name */
    public static final MonitoringEventRequestOuterClass.MonitoringEvent m369initializemonitoringEvent(@NotNull tf.l block) {
        AbstractC3340k.e(block, "block");
        MonitoringEventKt.Dsl.Companion companion = MonitoringEventKt.Dsl.INSTANCE;
        MonitoringEventRequestOuterClass.MonitoringEvent.Builder builderNewBuilder = MonitoringEventRequestOuterClass.MonitoringEvent.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        MonitoringEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final MonitoringEventRequestOuterClass.MonitoringEvent copy(@NotNull MonitoringEventRequestOuterClass.MonitoringEvent monitoringEvent, @NotNull tf.l block) {
        AbstractC3340k.e(monitoringEvent, "<this>");
        AbstractC3340k.e(block, "block");
        MonitoringEventKt.Dsl.Companion companion = MonitoringEventKt.Dsl.INSTANCE;
        MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder = monitoringEvent.toBuilder();
        AbstractC3340k.d(builder, "this.toBuilder()");
        MonitoringEventKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
