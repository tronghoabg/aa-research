package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdRevenueDataKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdRevenueDataKt {

    @NotNull
    public static final AdRevenueDataKt INSTANCE = new AdRevenueDataKt();

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u000fJ\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u000fJ\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010,\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010/\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R$\u00102\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R$\u00105\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010)\"\u0004\b4\u0010+R$\u0010;\u001a\u0002062\u0006\u0010\u001b\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010A\u001a\u00020<2\u0006\u0010\u001b\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lgatewayprotocol/v1/AdRevenueDataKt$Dsl;", "", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData$Builder;)V", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "_build", "()Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "Lef/C;", "clearEventId", "()V", "clearRevenue", "", "hasRevenue", "()Z", "clearCountryCode", "hasCountryCode", "clearNetworkName", "hasNetworkName", "clearAdUnitId", "hasAdUnitId", "clearThirdPartyAdPlacementId", "hasThirdPartyAdPlacementId", "clearAdFormat", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData$Builder;", "Lcom/google/protobuf/ByteString;", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "getEventId", "()Lcom/google/protobuf/ByteString;", "setEventId", "(Lcom/google/protobuf/ByteString;)V", "eventId", "", "getRevenue", "()D", "setRevenue", "(D)V", "revenue", "", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "countryCode", "getNetworkName", "setNetworkName", "networkName", "getAdUnitId", "setAdUnitId", HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, "getThirdPartyAdPlacementId", "setThirdPartyAdPlacementId", "thirdPartyAdPlacementId", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormat", "", "getAdFormatValue", "()I", "setAdFormatValue", "(I)V", "adFormatValue", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdRevenueEventRequestOuterClass.AdRevenueData.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AdRevenueDataKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AdRevenueDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder) {
                AbstractC3340k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ AdRevenueEventRequestOuterClass.AdRevenueData _build() {
            AdRevenueEventRequestOuterClass.AdRevenueData adRevenueDataBuild = this._builder.build();
            AbstractC3340k.d(adRevenueDataBuild, "_builder.build()");
            return adRevenueDataBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdUnitId() {
            this._builder.clearAdUnitId();
        }

        public final void clearCountryCode() {
            this._builder.clearCountryCode();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearNetworkName() {
            this._builder.clearNetworkName();
        }

        public final void clearRevenue() {
            this._builder.clearRevenue();
        }

        public final void clearThirdPartyAdPlacementId() {
            this._builder.clearThirdPartyAdPlacementId();
        }

        @NotNull
        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            AbstractC3340k.d(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @NotNull
        public final String getAdUnitId() {
            String adUnitId = this._builder.getAdUnitId();
            AbstractC3340k.d(adUnitId, "_builder.getAdUnitId()");
            return adUnitId;
        }

        @NotNull
        public final String getCountryCode() {
            String countryCode = this._builder.getCountryCode();
            AbstractC3340k.d(countryCode, "_builder.getCountryCode()");
            return countryCode;
        }

        @NotNull
        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            AbstractC3340k.d(eventId, "_builder.getEventId()");
            return eventId;
        }

        @NotNull
        public final String getNetworkName() {
            String networkName = this._builder.getNetworkName();
            AbstractC3340k.d(networkName, "_builder.getNetworkName()");
            return networkName;
        }

        public final double getRevenue() {
            return this._builder.getRevenue();
        }

        @NotNull
        public final String getThirdPartyAdPlacementId() {
            String thirdPartyAdPlacementId = this._builder.getThirdPartyAdPlacementId();
            AbstractC3340k.d(thirdPartyAdPlacementId, "_builder.getThirdPartyAdPlacementId()");
            return thirdPartyAdPlacementId;
        }

        public final boolean hasAdUnitId() {
            return this._builder.hasAdUnitId();
        }

        public final boolean hasCountryCode() {
            return this._builder.hasCountryCode();
        }

        public final boolean hasNetworkName() {
            return this._builder.hasNetworkName();
        }

        public final boolean hasRevenue() {
            return this._builder.hasRevenue();
        }

        public final boolean hasThirdPartyAdPlacementId() {
            return this._builder.hasThirdPartyAdPlacementId();
        }

        public final void setAdFormat(@NotNull AdFormatOuterClass.AdFormat value) {
            AbstractC3340k.e(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void setAdFormatValue(int i5) {
            this._builder.setAdFormatValue(i5);
        }

        public final void setAdUnitId(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setAdUnitId(value);
        }

        public final void setCountryCode(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setCountryCode(value);
        }

        public final void setEventId(@NotNull ByteString value) {
            AbstractC3340k.e(value, "value");
            this._builder.setEventId(value);
        }

        public final void setNetworkName(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setNetworkName(value);
        }

        public final void setRevenue(double d3) {
            this._builder.setRevenue(d3);
        }

        public final void setThirdPartyAdPlacementId(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setThirdPartyAdPlacementId(value);
        }

        private Dsl(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder) {
            this._builder = builder;
        }
    }

    private AdRevenueDataKt() {
    }
}
