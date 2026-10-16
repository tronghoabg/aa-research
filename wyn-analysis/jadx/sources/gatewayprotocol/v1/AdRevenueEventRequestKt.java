package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdRevenueEventRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdRevenueEventRequestKt {

    @NotNull
    public static final AdRevenueEventRequestKt INSTANCE = new AdRevenueEventRequestKt();

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010(\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010.\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00104\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010:\u001a\u0002052\u0006\u0010\u0017\u001a\u0002058G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010=\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00101\"\u0004\b<\u00103¨\u0006?"}, d2 = {"Lgatewayprotocol/v1/AdRevenueEventRequestKt$Dsl;", "", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest$Builder;)V", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "_build", "()Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "Lef/C;", "clearStaticDeviceInfo", "()V", "", "hasStaticDeviceInfo", "()Z", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "clearAdRevenueData", "hasAdRevenueData", "clearMediationProvider", "clearAdRevenueOrigin", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest$Builder;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "staticDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "dynamicDeviceInfo", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "getAdRevenueData", "()Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "setAdRevenueData", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;)V", "adRevenueData", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "getMediationProvider", "()Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "setMediationProvider", "(Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;)V", "mediationProvider", "", "getMediationProviderValue", "()I", "setMediationProviderValue", "(I)V", "mediationProviderValue", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueOrigin;", "getAdRevenueOrigin", "()Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueOrigin;", "setAdRevenueOrigin", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueOrigin;)V", "adRevenueOrigin", "getAdRevenueOriginValue", "setAdRevenueOriginValue", "adRevenueOriginValue", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AdRevenueEventRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AdRevenueEventRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builder) {
                AbstractC3340k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ AdRevenueEventRequestOuterClass.AdRevenueEventRequest _build() {
            AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequestBuild = this._builder.build();
            AbstractC3340k.d(adRevenueEventRequestBuild, "_builder.build()");
            return adRevenueEventRequestBuild;
        }

        public final void clearAdRevenueData() {
            this._builder.clearAdRevenueData();
        }

        public final void clearAdRevenueOrigin() {
            this._builder.clearAdRevenueOrigin();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        @NotNull
        public final AdRevenueEventRequestOuterClass.AdRevenueData getAdRevenueData() {
            AdRevenueEventRequestOuterClass.AdRevenueData adRevenueData = this._builder.getAdRevenueData();
            AbstractC3340k.d(adRevenueData, "_builder.getAdRevenueData()");
            return adRevenueData;
        }

        @NotNull
        public final AdRevenueEventRequestOuterClass.AdRevenueOrigin getAdRevenueOrigin() {
            AdRevenueEventRequestOuterClass.AdRevenueOrigin adRevenueOrigin = this._builder.getAdRevenueOrigin();
            AbstractC3340k.d(adRevenueOrigin, "_builder.getAdRevenueOrigin()");
            return adRevenueOrigin;
        }

        public final int getAdRevenueOriginValue() {
            return this._builder.getAdRevenueOriginValue();
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            AbstractC3340k.d(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        @NotNull
        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            AbstractC3340k.d(mediationProvider, "_builder.getMediationProvider()");
            return mediationProvider;
        }

        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            AbstractC3340k.d(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final boolean hasAdRevenueData() {
            return this._builder.hasAdRevenueData();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setAdRevenueData(@NotNull AdRevenueEventRequestOuterClass.AdRevenueData value) {
            AbstractC3340k.e(value, "value");
            this._builder.setAdRevenueData(value);
        }

        public final void setAdRevenueOrigin(@NotNull AdRevenueEventRequestOuterClass.AdRevenueOrigin value) {
            AbstractC3340k.e(value, "value");
            this._builder.setAdRevenueOrigin(value);
        }

        public final void setAdRevenueOriginValue(int i5) {
            this._builder.setAdRevenueOriginValue(i5);
        }

        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            AbstractC3340k.e(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void setMediationProvider(@NotNull ClientInfoOuterClass.MediationProvider value) {
            AbstractC3340k.e(value, "value");
            this._builder.setMediationProvider(value);
        }

        public final void setMediationProviderValue(int i5) {
            this._builder.setMediationProviderValue(i5);
        }

        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            AbstractC3340k.e(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        private Dsl(AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AdRevenueEventRequestKt() {
    }
}
