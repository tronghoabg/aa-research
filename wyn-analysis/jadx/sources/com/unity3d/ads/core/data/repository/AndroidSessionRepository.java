package com.unity3d.ads.core.data.repository;

import Ef.A;
import Ef.E;
import Ef.H;
import Fe.e;
import Hf.C0588a0;
import Hf.C0594d0;
import Hf.InterfaceC0590b0;
import Hf.InterfaceC0592c0;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import Hf.g0;
import Hf.j0;
import Hf.k0;
import Hf.x0;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.SessionIdReader;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import ef.C2527k;
import ff.AbstractC2641B;
import ff.v;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jf.C3109i;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0013J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0013J\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010\u0013J\u000f\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010\u0013J\u0013\u0010)\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010*J\u001b\u0010/\u001a\u00020\u00112\u0006\u0010+\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u0010-J\u0013\u00100\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b0\u0010*J\u001b\u00101\u001a\u00020\u00112\u0006\u0010+\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u0010-J\u0013\u00102\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\t058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR \u0010H\u001a\b\u0012\u0004\u0012\u00020D0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001e\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00107R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020(058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u00107R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u000208058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u00107R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u00107R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u00107R\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u00107R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020(058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00107R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020(058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u00107R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020L058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u00107R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u00107R \u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0[058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u00107R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u0019058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u00107R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u000208058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u00107R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u000208058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u00107R*\u0010b\u001a\u0004\u0018\u00010a8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bb\u0010c\u0012\u0004\bh\u0010\u0013\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR(\u0010m\u001a\u0004\u0018\u00010L2\b\u0010+\u001a\u0004\u0018\u00010L8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010q\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR$\u0010w\u001a\u00020P2\u0006\u0010+\u001a\u00020P8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010|\u001a\u00020R2\u0006\u0010+\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R*\u0010\u0081\u0001\u001a\u0004\u0018\u00010T2\b\u0010+\u001a\u0004\u0018\u00010T8V@VX\u0096\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R(\u0010\u0085\u0001\u001a\u00020(2\u0006\u0010+\u001a\u00020(8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0082\u0001\u0010o\"\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0088\u0001\u001a\u00020(2\u0006\u0010+\u001a\u00020(8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0086\u0001\u0010o\"\u0006\b\u0087\u0001\u0010\u0084\u0001R)\u0010\u008d\u0001\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R'\u0010\u0090\u0001\u001a\u00020L2\u0006\u0010+\u001a\u00020L8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010j\"\u0005\b\u008f\u0001\u0010lR)\u0010\u0095\u0001\u001a\u00020Y2\u0006\u0010+\u001a\u00020Y8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R4\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\\0[2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\\0[8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0096\u0001\u0010B\"\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001d\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020Y0:8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u009d\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010rR\u0016\u0010\u009e\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010rR\u0016\u0010\u009f\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010rR\u0018\u0010£\u0001\u001a\u00030 \u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010¦\u0001\u001a\u00020\u00198VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R(\u0010ª\u0001\u001a\u0002082\u0006\u0010+\u001a\u0002088V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b§\u0001\u0010r\"\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010«\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010rR\u0016\u0010¬\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010rR\u0018\u0010®\u0001\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010jR\u0018\u0010°\u0001\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010j\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006±\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidSessionRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "gatewayCacheDataSource", "privacyDataSource", "fsmDataSource", "nativeConfigDataSource", "Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "unityInfoDataSource", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "defaultNativeConfiguration", "LEf/A;", "dispatcher", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;LEf/A;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lef/C;", "incrementLoadRequestCount", "()V", "incrementLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementBannerLoadRequestAdmCount", "incrementBannerImpressionCount", "incrementGlobalAdsFocusChangeCount", "", "timeMs", "addTimeToGlobalAdsFocusTime", "(I)V", "incrementFocusChangeCount", "ms", "setInitializationLatency", "setLastLoadLatency", "incrementAllErrorsCount", "incrementCacheTimeoutErrorsCount", "incrementSuccessCount", "incrementTokenSequenceNumber", "incrementTokenWinsCount", "incrementTokenStartsCount", "resetTokenCounters", "Lcom/google/protobuf/ByteString;", "getGatewayCache", "(Ljf/c;)Ljava/lang/Object;", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "setGatewayCache", "(Lcom/google/protobuf/ByteString;Ljf/c;)Ljava/lang/Object;", "getPrivacy", "setPrivacy", "getPrivacyFsm", "setPrivacyFsm", "persistNativeConfiguration", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "LHf/c0;", "_sdkConfiguration", "LHf/c0;", "", "isInit", "LHf/l;", "persistedNativeConfiguration", "LHf/l;", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "scarEligibleFormats", "Ljava/util/List;", "getScarEligibleFormats", "()Ljava/util/List;", "LHf/b0;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "_onChange", "LHf/b0;", "LHf/g0;", "onChange", "LHf/g0;", "getOnChange", "()LHf/g0;", "", "_gameId", "_sessionId", "_isTestModeEnabled", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "_sessionCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "_tokenCounters", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "_initializationError", "_sessionToken", "_currentState", "_gatewayUrl", "Lcom/unity3d/ads/core/data/model/InitializationState;", "_initializationState", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "_requestUrlOverride", "_headerBiddingTokenCounter", "_shouldInitialize", "_isFirstInitAttempt", "Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "initializationConfiguration", "Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "getInitializationConfiguration", "()Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "setInitializationConfiguration", "(Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;)V", "getInitializationConfiguration$annotations", "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", AndroidGetAdPlayerContext.KEY_GAME_ID, "getSessionId", "()Lcom/google/protobuf/ByteString;", JsonStorageKeyNames.SESSION_ID_KEY, "isTestModeEnabled", "()Z", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "sessionCounters", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "tokenCounters", "getInitializationError", "()Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "setInitializationError", "(Lcom/unity3d/ads/core/data/model/exception/InitializationException;)V", "initializationError", "getSessionToken", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "sessionToken", "getGatewayState", "setGatewayState", "gatewayState", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "nativeConfiguration", "getGatewayUrl", "setGatewayUrl", "gatewayUrl", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "initializationState", "getRequestUrlOverrides", "setRequestUrlOverrides", "(Ljava/util/List;)V", "requestUrlOverrides", "getObserveInitializationState", "()LHf/l;", "observeInitializationState", "isSdkInitialized", "isNativeConfigReady", "isDiagnosticsEnabled", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "featureFlags", "getHeaderBiddingTokenCounter", "()I", "headerBiddingTokenCounter", "getShouldInitialize", "setShouldInitialize", "(Z)V", "shouldInitialize", "isOmEnabled", "isFirstInitAttempt", "getUnityInstallationId", "unityInstallationId", "getUnityMegaSessionId", "unityMegaSessionId", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidSessionRepository implements SessionRepository {

    @NotNull
    private final InterfaceC0592c0 _currentState;

    @NotNull
    private InterfaceC0592c0 _gameId;

    @NotNull
    private final InterfaceC0592c0 _gatewayUrl;

    @NotNull
    private final InterfaceC0592c0 _headerBiddingTokenCounter;

    @NotNull
    private final InterfaceC0592c0 _initializationError;

    @NotNull
    private final InterfaceC0592c0 _initializationState;

    @NotNull
    private final InterfaceC0592c0 _isFirstInitAttempt;

    @NotNull
    private final InterfaceC0592c0 _isTestModeEnabled;

    @NotNull
    private InterfaceC0590b0 _onChange;

    @NotNull
    private final InterfaceC0592c0 _requestUrlOverride;

    @NotNull
    private final InterfaceC0592c0 _sdkConfiguration;

    @NotNull
    private final InterfaceC0592c0 _sessionCounters;

    @NotNull
    private final InterfaceC0592c0 _sessionId;

    @NotNull
    private final InterfaceC0592c0 _sessionToken;

    @NotNull
    private final InterfaceC0592c0 _shouldInitialize;

    @NotNull
    private final InterfaceC0592c0 _tokenCounters;

    @NotNull
    private final ByteStringDataSource fsmDataSource;

    @NotNull
    private final ByteStringDataSource gatewayCacheDataSource;

    @Nullable
    private InitializationConfigurationInternal initializationConfiguration;

    @NotNull
    private final InterfaceC0592c0 isInit;

    @NotNull
    private final ByteStringDataSource nativeConfigDataSource;

    @NotNull
    private final g0 onChange;

    @NotNull
    private final InterfaceC0602l persistedNativeConfiguration;

    @NotNull
    private final ByteStringDataSource privacyDataSource;

    @NotNull
    private final List<AdFormatOuterClass.AdFormat> scarEligibleFormats;

    @NotNull
    private final AndroidUnityInfoDataSource unityInfoDataSource;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendDiagnosticEvent sendDiagnosticEvent, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidSessionRepository.this.new AnonymousClass1(this.$sendDiagnosticEvent, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f39711a;
            int i5 = this.label;
            try {
                if (i5 == 0) {
                    e.U(obj);
                    ByteStringDataSource byteStringDataSource = AndroidSessionRepository.this.nativeConfigDataSource;
                    this.label = 1;
                    obj = byteStringDataSource.get(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.U(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    InterfaceC0592c0 interfaceC0592c0 = AndroidSessionRepository.this._sdkConfiguration;
                    NativeConfigurationOuterClass.NativeConfiguration from = NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    AbstractC3340k.d(from, "parseFrom(data)");
                    x0 x0Var = (x0) interfaceC0592c0;
                    x0Var.getClass();
                    x0Var.k(null, from);
                }
            } catch (Exception e7) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e7.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", (Double) null, AbstractC2641B.E(new C2527k("debugReason", message)), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
            }
            InterfaceC0592c0 interfaceC0592c02 = AndroidSessionRepository.this.isInit;
            Boolean bool = Boolean.TRUE;
            x0 x0Var2 = (x0) interfaceC0592c02;
            x0Var2.getClass();
            x0Var2.k(null, bool);
            return C2515C.f34653a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {259}, m = "getGatewayCache")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22971 extends AbstractC3464c {
        int label;
        /* synthetic */ Object result;

        public C22971(InterfaceC3103c<? super C22971> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getGatewayCache(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {262}, m = "getPrivacy")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22981 extends AbstractC3464c {
        int label;
        /* synthetic */ Object result;

        public C22981(InterfaceC3103c<? super C22981> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacy(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {268}, m = "getPrivacyFsm")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22991 extends AbstractC3464c {
        int label;
        /* synthetic */ Object result;

        public C22991(InterfaceC3103c<? super C22991> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacyFsm(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {264, 265}, m = "setPrivacy")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23001 extends AbstractC3464c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C23001(InterfaceC3103c<? super C23001> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacy(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {270, 271}, m = "setPrivacyFsm")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23011 extends AbstractC3464c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C23011(InterfaceC3103c<? super C23011> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacyFsm(null, this);
        }
    }

    public AndroidSessionRepository(@NotNull ByteStringDataSource gatewayCacheDataSource, @NotNull ByteStringDataSource privacyDataSource, @NotNull ByteStringDataSource fsmDataSource, @NotNull ByteStringDataSource nativeConfigDataSource, @NotNull AndroidUnityInfoDataSource unityInfoDataSource, @NotNull NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration, @NotNull A dispatcher, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC3340k.e(gatewayCacheDataSource, "gatewayCacheDataSource");
        AbstractC3340k.e(privacyDataSource, "privacyDataSource");
        AbstractC3340k.e(fsmDataSource, "fsmDataSource");
        AbstractC3340k.e(nativeConfigDataSource, "nativeConfigDataSource");
        AbstractC3340k.e(unityInfoDataSource, "unityInfoDataSource");
        AbstractC3340k.e(defaultNativeConfiguration, "defaultNativeConfiguration");
        AbstractC3340k.e(dispatcher, "dispatcher");
        AbstractC3340k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.gatewayCacheDataSource = gatewayCacheDataSource;
        this.privacyDataSource = privacyDataSource;
        this.fsmDataSource = fsmDataSource;
        this.nativeConfigDataSource = nativeConfigDataSource;
        this.unityInfoDataSource = unityInfoDataSource;
        x0 x0VarC = k0.c(defaultNativeConfiguration);
        this._sdkConfiguration = x0VarC;
        x0 x0VarC2 = k0.c(Boolean.FALSE);
        this.isInit = x0VarC2;
        H.D(H.c(dispatcher), null, new AnonymousClass1(sendDiagnosticEvent, null), 3);
        final C0588a0 c0588a0 = new C0588a0(x0VarC, x0VarC2, new AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final InterfaceC0602l interfaceC0602l = new InterfaceC0602l() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r6)
                        goto L4a
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        Fe.e.U(r6)
                        Hf.m r6 = r4.$this_unsafeFlow
                        r2 = r5
                        ef.k r2 = (ef.C2527k) r2
                        java.lang.Object r2 = r2.f34672b
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L4a
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4a
                        return r1
                    L4a:
                        ef.C r5 = ef.C2515C.f34653a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = c0588a0.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == a.f39711a ? objCollect : C2515C.f34653a;
            }
        };
        this.persistedNativeConfiguration = new InterfaceC0602l() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r6)
                        goto L41
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        Fe.e.U(r6)
                        Hf.m r6 = r4.$this_unsafeFlow
                        ef.k r5 = (ef.C2527k) r5
                        java.lang.Object r5 = r5.f34671a
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        ef.C r5 = ef.C2515C.f34653a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = interfaceC0602l.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == a.f39711a ? objCollect : C2515C.f34653a;
            }
        };
        this.scarEligibleFormats = new ArrayList();
        j0 j0VarB = k0.b(0, 0, 7);
        this._onChange = j0VarB;
        this.onChange = new C0594d0(j0VarB);
        String gameId = ClientProperties.getGameId();
        this._gameId = k0.c(gameId == null ? null : gameId);
        UUID uuidFromString = UUID.fromString(SessionIdReader.INSTANCE.getSessionId());
        AbstractC3340k.d(uuidFromString, "fromString(SessionIdReader.sessionId)");
        this._sessionId = k0.c(ProtobufExtensionsKt.toByteString(uuidFromString));
        this._isTestModeEnabled = k0.c(Boolean.valueOf(SdkProperties.isTestMode()));
        SessionCountersOuterClass.SessionCounters sessionCountersBuild = SessionCountersOuterClass.SessionCounters.newBuilder().build();
        AbstractC3340k.d(sessionCountersBuild, "newBuilder().build()");
        this._sessionCounters = k0.c(sessionCountersBuild);
        this._tokenCounters = k0.c(new TokenCounters(0, 0, 0));
        this._initializationError = k0.c(null);
        ByteString EMPTY = ByteString.EMPTY;
        AbstractC3340k.d(EMPTY, "EMPTY");
        this._sessionToken = k0.c(EMPTY);
        this._currentState = k0.c(EMPTY);
        this._gatewayUrl = k0.c(UnityAdsConstants.DefaultUrls.GATEWAY_URL);
        this._initializationState = k0.c(InitializationState.NOT_INITIALIZED);
        this._requestUrlOverride = k0.c(v.f35432a);
        this._headerBiddingTokenCounter = k0.c(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = k0.c(bool);
        this._isFirstInitAttempt = k0.c(bool);
    }

    public static /* synthetic */ void getInitializationConfiguration$annotations() {
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int timeMs) {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusTime(dsl_create.getGlobalAdsFocusTime() + timeMs);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        AbstractC3340k.d(featureFlags, "nativeConfiguration.featureFlags");
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getGameId() {
        x0 x0Var;
        Object value;
        String gameId;
        InterfaceC0592c0 interfaceC0592c0 = this._gameId;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!x0Var.i(value, gameId));
        return gameId;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getGatewayCache(@org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super com.google.protobuf.ByteString> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C22971
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C22971) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            Fe.e.U(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.gatewayCacheDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "gatewayCacheDataSource.get().data"
            kotlin.jvm.internal.AbstractC3340k.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache(jf.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getGatewayState() {
        return (ByteString) ((x0) this._currentState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public String getGatewayUrl() {
        return (String) ((x0) this._gatewayUrl).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        x0 x0Var;
        Object value;
        Number number;
        InterfaceC0592c0 interfaceC0592c0 = this._headerBiddingTokenCounter;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            number = (Number) value;
        } while (!x0Var.i(value, Integer.valueOf(number.intValue() + 1)));
        return number.intValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public InitializationConfigurationInternal getInitializationConfiguration() {
        return this.initializationConfiguration;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public InitializationException getInitializationError() {
        return (InitializationException) ((x0) this._initializationError).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public InitializationState getInitializationState() {
        return (InitializationState) ((x0) this._initializationState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        if (((Boolean) ((x0) this.isInit).getValue()).booleanValue()) {
            return (NativeConfigurationOuterClass.NativeConfiguration) ((x0) this._sdkConfiguration).getValue();
        }
        return (NativeConfigurationOuterClass.NativeConfiguration) H.I(C3109i.f38759a, new AndroidSessionRepository$nativeConfiguration$1(this, null));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public InterfaceC0602l getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public g0 getOnChange() {
        return this.onChange;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getPrivacy(@org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super com.google.protobuf.ByteString> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C22981
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C22981) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            Fe.e.U(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.privacyDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "privacyDataSource.get().data"
            kotlin.jvm.internal.AbstractC3340k.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy(jf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getPrivacyFsm(@org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super com.google.protobuf.ByteString> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C22991
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C22991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            Fe.e.U(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.fsmDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "fsmDataSource.get().data"
            kotlin.jvm.internal.AbstractC3340k.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm(jf.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides() {
        return (List) ((x0) this._requestUrlOverride).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public List<AdFormatOuterClass.AdFormat> getScarEligibleFormats() {
        return this.scarEligibleFormats;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return (SessionCountersOuterClass.SessionCounters) ((x0) this._sessionCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getSessionId() {
        return (ByteString) ((x0) this._sessionId).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getSessionToken() {
        return (ByteString) ((x0) this._sessionToken).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return ((Boolean) ((x0) this._shouldInitialize).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public TokenCounters getTokenCounters() {
        return (TokenCounters) ((x0) this._tokenCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getUnityInstallationId() {
        return this.unityInfoDataSource.getUnityInstallationId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getUnityMegaSessionId() {
        return this.unityInfoDataSource.getUnityMegaSessionId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementAllErrorsCount() {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setAllErrorsCount(dsl_create.getAllErrorsCount() + 1);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerImpressions(dsl_create.getBannerImpressions() + 1);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerRequestsAdm(dsl_create.getBannerRequestsAdm() + 1);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerLoadRequests(dsl_create.getBannerLoadRequests() + 1);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementCacheTimeoutErrorsCount() {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setCacheTimeoutErrorsCount(dsl_create.getCacheTimeoutErrorsCount() + 1);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setFocusChangeCount(dsl_create.getFocusChangeCount() + 1);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusChangeCount(dsl_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequestsAdm(dsl_create.getLoadRequestsAdm() + 1);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequests(dsl_create.getLoadRequests() + 1);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementSuccessCount() {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setSuccessCount(dsl_create.getSuccessCount() + 1);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        x0 x0Var;
        Object value;
        TokenCounters tokenCounters;
        InterfaceC0592c0 interfaceC0592c0 = this._tokenCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!x0Var.i(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        x0 x0Var;
        Object value;
        TokenCounters tokenCounters;
        InterfaceC0592c0 interfaceC0592c0 = this._tokenCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!x0Var.i(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        x0 x0Var;
        Object value;
        TokenCounters tokenCounters;
        InterfaceC0592c0 interfaceC0592c0 = this._tokenCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!x0Var.i(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        x0 x0Var;
        Object value;
        Boolean bool;
        InterfaceC0592c0 interfaceC0592c0 = this._isFirstInitAttempt;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!x0Var.i(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isNativeConfigReady() {
        return ((Boolean) ((x0) this.isInit).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return getInitializationState() == InitializationState.INITIALIZED;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        x0 x0Var;
        Object value;
        boolean zIsTestMode;
        InterfaceC0592c0 interfaceC0592c0 = this._isTestModeEnabled;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            ((Boolean) value).getClass();
            zIsTestMode = SdkProperties.isTestMode();
        } while (!x0Var.i(value, Boolean.valueOf(zIsTestMode)));
        return zIsTestMode;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public Object persistNativeConfiguration(@NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        ByteString byteString = getNativeConfiguration().toByteString();
        AbstractC3340k.d(byteString, "nativeConfiguration.toByteString()");
        Object obj = byteStringDataSource.set(byteString, interfaceC3103c);
        return obj == a.f39711a ? obj : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        x0 x0Var;
        Object value;
        InterfaceC0592c0 interfaceC0592c0 = this._tokenCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
        } while (!x0Var.i(value, new TokenCounters(0, 0, 0)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(@Nullable String str) {
        x0 x0Var;
        Object value;
        InterfaceC0592c0 interfaceC0592c0 = this._gameId;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            ClientProperties.setGameId(str);
        } while (!x0Var.i(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public Object setGatewayCache(@NotNull ByteString byteString, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object obj = this.gatewayCacheDataSource.set(byteString, interfaceC3103c);
        return obj == a.f39711a ? obj : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(@NotNull ByteString value) {
        x0 x0Var;
        Object value2;
        AbstractC3340k.e(value, "value");
        InterfaceC0592c0 interfaceC0592c0 = this._currentState;
        do {
            x0Var = (x0) interfaceC0592c0;
            value2 = x0Var.getValue();
        } while (!x0Var.i(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(@NotNull String value) {
        x0 x0Var;
        Object value2;
        AbstractC3340k.e(value, "value");
        InterfaceC0592c0 interfaceC0592c0 = this._gatewayUrl;
        do {
            x0Var = (x0) interfaceC0592c0;
            value2 = x0Var.getValue();
        } while (!x0Var.i(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationConfiguration(@Nullable InitializationConfigurationInternal initializationConfigurationInternal) {
        this.initializationConfiguration = initializationConfigurationInternal;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationError(@Nullable InitializationException initializationException) {
        x0 x0Var;
        Object value;
        InterfaceC0592c0 interfaceC0592c0 = this._initializationError;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
        } while (!x0Var.i(value, initializationException));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationLatency(int ms) {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setInitializationLatency(ms);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(@NotNull InitializationState value) {
        x0 x0Var;
        Object value2;
        AbstractC3340k.e(value, "value");
        InterfaceC0592c0 interfaceC0592c0 = this._initializationState;
        do {
            x0Var = (x0) interfaceC0592c0;
            value2 = x0Var.getValue();
        } while (!x0Var.i(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setLastLoadLatency(int ms) {
        x0 x0Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC3340k.d(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLastLoadLatency(ms);
        } while (!x0Var.i(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(@NotNull NativeConfigurationOuterClass.NativeConfiguration value) {
        x0 x0Var;
        Object value2;
        AbstractC3340k.e(value, "value");
        InterfaceC0592c0 interfaceC0592c0 = this._sdkConfiguration;
        do {
            x0Var = (x0) interfaceC0592c0;
            value2 = x0Var.getValue();
        } while (!x0Var.i(value2, value));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r7.emit(r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setPrivacy(@org.jetbrains.annotations.NotNull com.google.protobuf.ByteString r6, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2515C> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C23001
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C23001) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            Fe.e.U(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            Fe.e.U(r7)
            goto L51
        L3e:
            Fe.e.U(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.privacyDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            Hf.b0 r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$UserConsentChange r2 = new com.unity3d.ads.core.data.model.SessionChange$UserConsentChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            ef.C r6 = ef.C2515C.f34653a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy(com.google.protobuf.ByteString, jf.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r7.emit(r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setPrivacyFsm(@org.jetbrains.annotations.NotNull com.google.protobuf.ByteString r6, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2515C> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C23011
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C23011) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            Fe.e.U(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            Fe.e.U(r7)
            goto L51
        L3e:
            Fe.e.U(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.fsmDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            Hf.b0 r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange r2 = new com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            ef.C r6 = ef.C2515C.f34653a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm(com.google.protobuf.ByteString, jf.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setRequestUrlOverrides(@NotNull List<InitializationResponseOuterClass.RequestUrlOverride> value) {
        x0 x0Var;
        Object value2;
        AbstractC3340k.e(value, "value");
        InterfaceC0592c0 interfaceC0592c0 = this._requestUrlOverride;
        do {
            x0Var = (x0) interfaceC0592c0;
            value2 = x0Var.getValue();
        } while (!x0Var.i(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters value) {
        x0 x0Var;
        Object value2;
        AbstractC3340k.e(value, "value");
        InterfaceC0592c0 interfaceC0592c0 = this._sessionCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value2 = x0Var.getValue();
        } while (!x0Var.i(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(@NotNull ByteString value) {
        x0 x0Var;
        Object value2;
        AbstractC3340k.e(value, "value");
        InterfaceC0592c0 interfaceC0592c0 = this._sessionToken;
        do {
            x0Var = (x0) interfaceC0592c0;
            value2 = x0Var.getValue();
        } while (!x0Var.i(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z2) {
        x0 x0Var;
        Object value;
        InterfaceC0592c0 interfaceC0592c0 = this._shouldInitialize;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            ((Boolean) value).getClass();
        } while (!x0Var.i(value, Boolean.valueOf(z2)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(@NotNull TokenCounters value) {
        x0 x0Var;
        Object value2;
        AbstractC3340k.e(value, "value");
        InterfaceC0592c0 interfaceC0592c0 = this._tokenCounters;
        do {
            x0Var = (x0) interfaceC0592c0;
            value2 = x0Var.getValue();
        } while (!x0Var.i(value2, value));
    }
}
