package com.unity3d.ads.core.data.datasource;

import Bf.k;
import Ef.E;
import Ef.H;
import Fe.e;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.data.model.AdRevenueOrigin;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.log.Logger;
import ef.C2515C;
import ff.o;
import gatewayprotocol.v1.ClientInfoOuterClass;
import java.util.Set;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;
import tf.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001e¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;", "", "Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "handleAdRevenueEvent", "LEf/E;", "scope", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;LEf/E;Lcom/unity3d/ads/core/log/Logger;)V", "Landroid/os/Bundle;", "bundle", "Lcom/unity3d/ads/core/data/model/AdRevenueData;", "parseRevenueBundle", "(Landroid/os/Bundle;)Lcom/unity3d/ads/core/data/model/AdRevenueData;", "", "bundleToTraceString", "(Landroid/os/Bundle;)Ljava/lang/String;", "validateString", "(Ljava/lang/String;)Ljava/lang/String;", "formatStr", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "parseMaxAdFormatString", "(Ljava/lang/String;)Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "messageData", "Lef/C;", "onMessageReceived", "(Landroid/os/Bundle;)V", "Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "LEf/E;", "Lcom/unity3d/ads/core/log/Logger;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MaxAdRevenueListener {

    @NotNull
    private static final String KEY_AD_FORMAT = "ad_format";

    @NotNull
    private static final String KEY_COUNTRY_CODE = "country_code";

    @NotNull
    private static final String KEY_MAX_AD_UNIT_ID = "max_ad_unit_id";

    @NotNull
    private static final String KEY_NETWORK_NAME = "network_name";

    @NotNull
    private static final String KEY_REVENUE = "revenue";

    @NotNull
    private static final String KEY_THIRD_PARTY_AD_PLACEMENT_ID = "third_party_ad_placement_id";
    private static final int MAX_STRING_LENGTH = 500;

    @NotNull
    private final HandleAdRevenueEvent handleAdRevenueEvent;

    @NotNull
    private final Logger logger;

    @NotNull
    private final E scope;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$bundleToTraceString$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ Bundle $bundle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Bundle bundle) {
            super(1);
            this.$bundle = bundle;
        }

        @Override // tf.l
        @NotNull
        public final CharSequence invoke(String str) {
            String string;
            StringBuilder sb2;
            try {
                Object obj = this.$bundle.get(str);
                if (obj == null) {
                    string = "null";
                } else if (obj instanceof String) {
                    if (((String) obj).length() <= 500) {
                        sb2 = new StringBuilder("\"");
                        sb2.append(obj);
                        sb2.append('\"');
                    } else {
                        sb2 = new StringBuilder("\"");
                        sb2.append(k.T0(500, (String) obj));
                        sb2.append("...\"");
                    }
                    string = sb2.toString();
                } else {
                    string = obj.toString();
                }
                return str + '=' + string;
            } catch (Throwable unused) {
                return N0.a.f(str, "=<error>");
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$onMessageReceived$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22801 extends AbstractC3343n implements tf.a {
        final /* synthetic */ Bundle $messageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22801(Bundle bundle) {
            super(0);
            this.$messageData = bundle;
        }

        @Override // tf.a
        @NotNull
        public final String invoke() {
            return "Ad revenue subscribed event (raw): " + MaxAdRevenueListener.this.bundleToTraceString(this.$messageData);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$onMessageReceived$2", f = "MaxAdRevenueListener.kt", l = {45}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$onMessageReceived$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        final /* synthetic */ Bundle $messageData;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Bundle bundle, InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$messageData = bundle;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return MaxAdRevenueListener.this.new AnonymousClass2(this.$messageData, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AdRevenueData adRevenueData;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            try {
            } catch (Exception e7) {
                MaxAdRevenueListener.this.logger.trace("Failed to process ad revenue event", e7);
            }
            if (i5 == 0) {
                e.U(obj);
                AdRevenueData revenueBundle = MaxAdRevenueListener.this.parseRevenueBundle(this.$messageData);
                if (revenueBundle == null) {
                    Logger.DefaultImpls.trace$default(MaxAdRevenueListener.this.logger, "Failed to parse revenue event", null, 2, null);
                    return C2515C.f34653a;
                }
                HandleAdRevenueEvent handleAdRevenueEvent = MaxAdRevenueListener.this.handleAdRevenueEvent;
                ClientInfoOuterClass.MediationProvider mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
                AdRevenueOrigin adRevenueOrigin = AdRevenueOrigin.AUTOMATIC_COLLECTION;
                this.L$0 = revenueBundle;
                this.label = 1;
                if (handleAdRevenueEvent.invoke(revenueBundle, mediationProvider, adRevenueOrigin, this) == aVar) {
                    return aVar;
                }
                adRevenueData = revenueBundle;
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                adRevenueData = (AdRevenueData) this.L$0;
                e.U(obj);
            }
            Logger.DefaultImpls.trace$default(MaxAdRevenueListener.this.logger, "Ad revenue event sent: revenue=" + adRevenueData.getRevenue() + ", network=" + adRevenueData.getNetworkName(), null, 2, null);
            return C2515C.f34653a;
        }
    }

    public MaxAdRevenueListener(@NotNull HandleAdRevenueEvent handleAdRevenueEvent, @NotNull E scope, @NotNull Logger logger) {
        AbstractC3340k.e(handleAdRevenueEvent, "handleAdRevenueEvent");
        AbstractC3340k.e(scope, "scope");
        AbstractC3340k.e(logger, "logger");
        this.handleAdRevenueEvent = handleAdRevenueEvent;
        this.scope = scope;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String bundleToTraceString(Bundle bundle) {
        try {
            if (bundle.isEmpty()) {
                return JsonUtils.EMPTY_JSON;
            }
            Set<String> setKeySet = bundle.keySet();
            AbstractC3340k.d(setKeySet, "bundle.keySet()");
            return o.w0(setKeySet, null, "{", "}", new AnonymousClass1(bundle), 25);
        } catch (Throwable unused) {
            return "<error serializing bundle>";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r0.equals("REWARDED_INTERSTITIAL") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r0.equals("REWARDED_INTER") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r0.equals("REWARDED") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.REWARDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r0.equals("INTER") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if (r0.equals("INTERSTITIAL") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.INTERSTITIAL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.unity3d.ads.core.data.model.AdRevenueAdFormat parseMaxAdFormatString(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L7a
            boolean r0 = Bf.k.y0(r3)
            if (r0 == 0) goto La
            goto L7a
        La:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r3.toUpperCase(r0)
            java.lang.String r1 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.AbstractC3340k.d(r0, r1)
            int r1 = r0.hashCode()
            switch(r1) {
                case -1999289321: goto L68;
                case -1372958932: goto L5c;
                case 2374915: goto L50;
                case 69823676: goto L47;
                case 543046670: goto L3b;
                case 1654540619: goto L32;
                case 1854800829: goto L29;
                case 1951953708: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L70
        L1d:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            goto L70
        L26:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r3 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.BANNER
            return r3
        L29:
            java.lang.String r1 = "REWARDED_INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            goto L70
        L32:
            java.lang.String r1 = "REWARDED_INTER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            goto L70
        L3b:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            goto L70
        L44:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r3 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.REWARDED
            return r3
        L47:
            java.lang.String r1 = "INTER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L65
            goto L70
        L50:
            java.lang.String r1 = "MREC"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L70
        L59:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r3 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.MREC
            return r3
        L5c:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L65
            goto L70
        L65:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r3 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.INTERSTITIAL
            return r3
        L68:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L77
        L70:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat$Companion r0 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.INSTANCE
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r3 = r0.fromString(r3)
            return r3
        L77:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r3 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.NATIVE
            return r3
        L7a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener.parseMaxAdFormatString(java.lang.String):com.unity3d.ads.core.data.model.AdRevenueAdFormat");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:17:0x004a, B:19:0x0052, B:21:0x0059, B:23:0x0061, B:25:0x0068, B:27:0x0070, B:29:0x0077, B:31:0x007f, B:33:0x0086, B:9:0x001c, B:11:0x0026, B:13:0x002c, B:15:0x0032, B:16:0x0038), top: B:37:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:17:0x004a, B:19:0x0052, B:21:0x0059, B:23:0x0061, B:25:0x0068, B:27:0x0070, B:29:0x0077, B:31:0x007f, B:33:0x0086, B:9:0x001c, B:11:0x0026, B:13:0x002c, B:15:0x0032, B:16:0x0038), top: B:37:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:17:0x004a, B:19:0x0052, B:21:0x0059, B:23:0x0061, B:25:0x0068, B:27:0x0070, B:29:0x0077, B:31:0x007f, B:33:0x0086, B:9:0x001c, B:11:0x0026, B:13:0x002c, B:15:0x0032, B:16:0x0038), top: B:37:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:17:0x004a, B:19:0x0052, B:21:0x0059, B:23:0x0061, B:25:0x0068, B:27:0x0070, B:29:0x0077, B:31:0x007f, B:33:0x0086, B:9:0x001c, B:11:0x0026, B:13:0x002c, B:15:0x0032, B:16:0x0038), top: B:37:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.unity3d.ads.core.data.model.AdRevenueData parseRevenueBundle(android.os.Bundle r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "revenue"
            java.lang.String r3 = "Invalid or missing revenue in revenue event: "
            r4 = 0
            boolean r5 = r0.containsKey(r2)     // Catch: java.lang.Exception -> L19
            r6 = 2
            if (r5 != 0) goto L1c
            com.unity3d.ads.core.log.Logger r2 = r1.logger     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "Missing revenue key in revenue event"
            com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(r2, r3, r4, r6, r4)     // Catch: java.lang.Exception -> L19
        L17:
            r9 = r4
            goto L4a
        L19:
            r0 = move-exception
            goto L9a
        L1c:
            double r7 = r0.getDouble(r2)     // Catch: java.lang.Exception -> L19
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 < 0) goto L38
            boolean r2 = java.lang.Double.isInfinite(r7)     // Catch: java.lang.Exception -> L19
            if (r2 != 0) goto L38
            boolean r2 = java.lang.Double.isNaN(r7)     // Catch: java.lang.Exception -> L19
            if (r2 != 0) goto L38
            java.lang.Double r2 = java.lang.Double.valueOf(r7)     // Catch: java.lang.Exception -> L19
            r9 = r2
            goto L4a
        L38:
            com.unity3d.ads.core.log.Logger r2 = r1.logger     // Catch: java.lang.Exception -> L19
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L19
            r5.<init>(r3)     // Catch: java.lang.Exception -> L19
            r5.append(r7)     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> L19
            com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(r2, r3, r4, r6, r4)     // Catch: java.lang.Exception -> L19
            goto L17
        L4a:
            java.lang.String r2 = "country_code"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L58
            java.lang.String r2 = r1.validateString(r2)     // Catch: java.lang.Exception -> L19
            r10 = r2
            goto L59
        L58:
            r10 = r4
        L59:
            java.lang.String r2 = "network_name"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L67
            java.lang.String r2 = r1.validateString(r2)     // Catch: java.lang.Exception -> L19
            r11 = r2
            goto L68
        L67:
            r11 = r4
        L68:
            java.lang.String r2 = "max_ad_unit_id"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L76
            java.lang.String r2 = r1.validateString(r2)     // Catch: java.lang.Exception -> L19
            r12 = r2
            goto L77
        L76:
            r12 = r4
        L77:
            java.lang.String r2 = "third_party_ad_placement_id"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L85
            java.lang.String r2 = r1.validateString(r2)     // Catch: java.lang.Exception -> L19
            r13 = r2
            goto L86
        L85:
            r13 = r4
        L86:
            java.lang.String r2 = "ad_format"
            java.lang.String r0 = r0.getString(r2)     // Catch: java.lang.Exception -> L19
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r14 = r1.parseMaxAdFormatString(r0)     // Catch: java.lang.Exception -> L19
            com.unity3d.ads.core.data.model.AdRevenueData r7 = new com.unity3d.ads.core.data.model.AdRevenueData     // Catch: java.lang.Exception -> L19
            r15 = 1
            r16 = 0
            r8 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L19
            return r7
        L9a:
            com.unity3d.ads.core.log.Logger r2 = r1.logger
            java.lang.String r3 = "Failed to parse revenue Bundle"
            r2.trace(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener.parseRevenueBundle(android.os.Bundle):com.unity3d.ads.core.data.model.AdRevenueData");
    }

    private final String validateString(String str) {
        if (k.y0(str) || str.length() > 500) {
            return null;
        }
        return str;
    }

    public final void onMessageReceived(@NotNull Bundle messageData) {
        AbstractC3340k.e(messageData, "messageData");
        this.logger.trace(new C22801(messageData));
        H.D(this.scope, null, new AnonymousClass2(messageData, null), 3);
    }
}
