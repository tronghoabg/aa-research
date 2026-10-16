package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InstallReferrerKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InstallReferrerKt {

    @NotNull
    public static final InstallReferrerKt INSTANCE = new InstallReferrerKt();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010%\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lgatewayprotocol/v1/InstallReferrerKt$Dsl;", "", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer$Builder;)V", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "_build", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "Lef/C;", "clearUrl", "()V", "clearClickTime", "clearInstallTime", "clearInstantExperienceLunch", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer$Builder;", "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "url", "", "getClickTime", "()J", "setClickTime", "(J)V", "clickTime", "getInstallTime", "setInstallTime", "installTime", "", "getInstantExperienceLunch", "()Z", "setInstantExperienceLunch", "(Z)V", "instantExperienceLunch", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final InitializationRequestOuterClass.InstallReferrer.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/InstallReferrerKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/InstallReferrerKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InstallReferrer.Builder builder) {
                AbstractC3340k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InstallReferrer.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InstallReferrer _build() {
            InitializationRequestOuterClass.InstallReferrer installReferrerBuild = this._builder.build();
            AbstractC3340k.d(installReferrerBuild, "_builder.build()");
            return installReferrerBuild;
        }

        public final void clearClickTime() {
            this._builder.clearClickTime();
        }

        public final void clearInstallTime() {
            this._builder.clearInstallTime();
        }

        public final void clearInstantExperienceLunch() {
            this._builder.clearInstantExperienceLunch();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final long getClickTime() {
            return this._builder.getClickTime();
        }

        public final long getInstallTime() {
            return this._builder.getInstallTime();
        }

        public final boolean getInstantExperienceLunch() {
            return this._builder.getInstantExperienceLunch();
        }

        @NotNull
        public final String getUrl() {
            String url = this._builder.getUrl();
            AbstractC3340k.d(url, "_builder.getUrl()");
            return url;
        }

        public final void setClickTime(long j8) {
            this._builder.setClickTime(j8);
        }

        public final void setInstallTime(long j8) {
            this._builder.setInstallTime(j8);
        }

        public final void setInstantExperienceLunch(boolean z2) {
            this._builder.setInstantExperienceLunch(z2);
        }

        public final void setUrl(@NotNull String value) {
            AbstractC3340k.e(value, "value");
            this._builder.setUrl(value);
        }

        private Dsl(InitializationRequestOuterClass.InstallReferrer.Builder builder) {
            this._builder = builder;
        }
    }

    private InstallReferrerKt() {
    }
}
