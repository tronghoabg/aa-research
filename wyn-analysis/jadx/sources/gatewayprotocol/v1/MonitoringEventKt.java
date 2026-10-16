package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/MonitoringEventKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MonitoringEventKt {

    @NotNull
    public static final MonitoringEventKt INSTANCE = new MonitoringEventKt();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010(\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010+\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018¨\u0006-"}, d2 = {"Lgatewayprotocol/v1/MonitoringEventKt$Dsl;", "", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent$Builder;)V", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent;", "_build", "()Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent;", "Lef/C;", "clearImpressionNumber", "()V", "clearEventType", "clearMonitoringId", "clearDurationMs", "", "hasDurationMs", "()Z", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent$Builder;", "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "getImpressionNumber", "()J", "setImpressionNumber", "(J)V", "impressionNumber", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventType;", "getEventType", "()Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventType;", "setEventType", "(Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventType;)V", "eventType", "", "getEventTypeValue", "()I", "setEventTypeValue", "(I)V", "eventTypeValue", "getMonitoringId", "setMonitoringId", "monitoringId", "getDurationMs", "setDurationMs", "durationMs", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final MonitoringEventRequestOuterClass.MonitoringEvent.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/MonitoringEventKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/MonitoringEventKt$Dsl;", "builder", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder) {
                AbstractC3340k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ MonitoringEventRequestOuterClass.MonitoringEvent _build() {
            MonitoringEventRequestOuterClass.MonitoringEvent monitoringEventBuild = this._builder.build();
            AbstractC3340k.d(monitoringEventBuild, "_builder.build()");
            return monitoringEventBuild;
        }

        public final void clearDurationMs() {
            this._builder.clearDurationMs();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearImpressionNumber() {
            this._builder.clearImpressionNumber();
        }

        public final void clearMonitoringId() {
            this._builder.clearMonitoringId();
        }

        public final long getDurationMs() {
            return this._builder.getDurationMs();
        }

        @NotNull
        public final MonitoringEventRequestOuterClass.MonitoringEventType getEventType() {
            MonitoringEventRequestOuterClass.MonitoringEventType eventType = this._builder.getEventType();
            AbstractC3340k.d(eventType, "_builder.getEventType()");
            return eventType;
        }

        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        public final long getImpressionNumber() {
            return this._builder.getImpressionNumber();
        }

        public final int getMonitoringId() {
            return this._builder.getMonitoringId();
        }

        public final boolean hasDurationMs() {
            return this._builder.hasDurationMs();
        }

        public final void setDurationMs(long j8) {
            this._builder.setDurationMs(j8);
        }

        public final void setEventType(@NotNull MonitoringEventRequestOuterClass.MonitoringEventType value) {
            AbstractC3340k.e(value, "value");
            this._builder.setEventType(value);
        }

        public final void setEventTypeValue(int i5) {
            this._builder.setEventTypeValue(i5);
        }

        public final void setImpressionNumber(long j8) {
            this._builder.setImpressionNumber(j8);
        }

        public final void setMonitoringId(int i5) {
            this._builder.setMonitoringId(i5);
        }

        private Dsl(MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder) {
            this._builder = builder;
        }
    }

    private MonitoringEventKt() {
    }
}
