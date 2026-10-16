package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/SessionCountersKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SessionCountersKt {

    @NotNull
    public static final SessionCountersKt INSTANCE = new SessionCountersKt();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b,\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001DB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010%\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR$\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR$\u0010+\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR$\u0010.\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR$\u00101\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR$\u00104\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR$\u00107\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR$\u0010:\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001eR$\u0010=\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR$\u0010@\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010\u001eR$\u0010C\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001e¨\u0006E"}, d2 = {"Lgatewayprotocol/v1/SessionCountersKt$Dsl;", "", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;)V", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "_build", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "Lef/C;", "clearLoadRequests", "()V", "clearLoadRequestsAdm", "clearBannerLoadRequests", "clearBannerRequestsAdm", "clearBannerImpressions", "clearGlobalAdsFocusTime", "clearGlobalAdsFocusChangeCount", "clearFocusChangeCount", "clearInitializationLatency", "clearLastLoadLatency", "clearAllErrorsCount", "clearCacheTimeoutErrorsCount", "clearSuccessCount", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;", "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "getLoadRequests", "()I", "setLoadRequests", "(I)V", "loadRequests", "getLoadRequestsAdm", "setLoadRequestsAdm", "loadRequestsAdm", "getBannerLoadRequests", "setBannerLoadRequests", "bannerLoadRequests", "getBannerRequestsAdm", "setBannerRequestsAdm", "bannerRequestsAdm", "getBannerImpressions", "setBannerImpressions", "bannerImpressions", "getGlobalAdsFocusTime", "setGlobalAdsFocusTime", "globalAdsFocusTime", "getGlobalAdsFocusChangeCount", "setGlobalAdsFocusChangeCount", "globalAdsFocusChangeCount", "getFocusChangeCount", "setFocusChangeCount", "focusChangeCount", "getInitializationLatency", "setInitializationLatency", "initializationLatency", "getLastLoadLatency", "setLastLoadLatency", "lastLoadLatency", "getAllErrorsCount", "setAllErrorsCount", "allErrorsCount", "getCacheTimeoutErrorsCount", "setCacheTimeoutErrorsCount", "cacheTimeoutErrorsCount", "getSuccessCount", "setSuccessCount", "successCount", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final SessionCountersOuterClass.SessionCounters.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/SessionCountersKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/SessionCountersKt$Dsl;", "builder", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(SessionCountersOuterClass.SessionCounters.Builder builder) {
                AbstractC3340k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(SessionCountersOuterClass.SessionCounters.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ SessionCountersOuterClass.SessionCounters _build() {
            SessionCountersOuterClass.SessionCounters sessionCountersBuild = this._builder.build();
            AbstractC3340k.d(sessionCountersBuild, "_builder.build()");
            return sessionCountersBuild;
        }

        public final void clearAllErrorsCount() {
            this._builder.clearAllErrorsCount();
        }

        public final void clearBannerImpressions() {
            this._builder.clearBannerImpressions();
        }

        public final void clearBannerLoadRequests() {
            this._builder.clearBannerLoadRequests();
        }

        public final void clearBannerRequestsAdm() {
            this._builder.clearBannerRequestsAdm();
        }

        public final void clearCacheTimeoutErrorsCount() {
            this._builder.clearCacheTimeoutErrorsCount();
        }

        public final void clearFocusChangeCount() {
            this._builder.clearFocusChangeCount();
        }

        public final void clearGlobalAdsFocusChangeCount() {
            this._builder.clearGlobalAdsFocusChangeCount();
        }

        public final void clearGlobalAdsFocusTime() {
            this._builder.clearGlobalAdsFocusTime();
        }

        public final void clearInitializationLatency() {
            this._builder.clearInitializationLatency();
        }

        public final void clearLastLoadLatency() {
            this._builder.clearLastLoadLatency();
        }

        public final void clearLoadRequests() {
            this._builder.clearLoadRequests();
        }

        public final void clearLoadRequestsAdm() {
            this._builder.clearLoadRequestsAdm();
        }

        public final void clearSuccessCount() {
            this._builder.clearSuccessCount();
        }

        public final int getAllErrorsCount() {
            return this._builder.getAllErrorsCount();
        }

        public final int getBannerImpressions() {
            return this._builder.getBannerImpressions();
        }

        public final int getBannerLoadRequests() {
            return this._builder.getBannerLoadRequests();
        }

        public final int getBannerRequestsAdm() {
            return this._builder.getBannerRequestsAdm();
        }

        public final int getCacheTimeoutErrorsCount() {
            return this._builder.getCacheTimeoutErrorsCount();
        }

        public final int getFocusChangeCount() {
            return this._builder.getFocusChangeCount();
        }

        public final int getGlobalAdsFocusChangeCount() {
            return this._builder.getGlobalAdsFocusChangeCount();
        }

        public final int getGlobalAdsFocusTime() {
            return this._builder.getGlobalAdsFocusTime();
        }

        public final int getInitializationLatency() {
            return this._builder.getInitializationLatency();
        }

        public final int getLastLoadLatency() {
            return this._builder.getLastLoadLatency();
        }

        public final int getLoadRequests() {
            return this._builder.getLoadRequests();
        }

        public final int getLoadRequestsAdm() {
            return this._builder.getLoadRequestsAdm();
        }

        public final int getSuccessCount() {
            return this._builder.getSuccessCount();
        }

        public final void setAllErrorsCount(int i5) {
            this._builder.setAllErrorsCount(i5);
        }

        public final void setBannerImpressions(int i5) {
            this._builder.setBannerImpressions(i5);
        }

        public final void setBannerLoadRequests(int i5) {
            this._builder.setBannerLoadRequests(i5);
        }

        public final void setBannerRequestsAdm(int i5) {
            this._builder.setBannerRequestsAdm(i5);
        }

        public final void setCacheTimeoutErrorsCount(int i5) {
            this._builder.setCacheTimeoutErrorsCount(i5);
        }

        public final void setFocusChangeCount(int i5) {
            this._builder.setFocusChangeCount(i5);
        }

        public final void setGlobalAdsFocusChangeCount(int i5) {
            this._builder.setGlobalAdsFocusChangeCount(i5);
        }

        public final void setGlobalAdsFocusTime(int i5) {
            this._builder.setGlobalAdsFocusTime(i5);
        }

        public final void setInitializationLatency(int i5) {
            this._builder.setInitializationLatency(i5);
        }

        public final void setLastLoadLatency(int i5) {
            this._builder.setLastLoadLatency(i5);
        }

        public final void setLoadRequests(int i5) {
            this._builder.setLoadRequests(i5);
        }

        public final void setLoadRequestsAdm(int i5) {
            this._builder.setLoadRequestsAdm(i5);
        }

        public final void setSuccessCount(int i5) {
            this._builder.setSuccessCount(i5);
        }

        private Dsl(SessionCountersOuterClass.SessionCounters.Builder builder) {
            this._builder = builder;
        }
    }

    private SessionCountersKt() {
    }
}
