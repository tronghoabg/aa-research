package com.qonversion.android.sdk.internal;

import Af.f;
import Af.g;
import Af.h;
import Af.n;
import Af.u;
import Fe.c;
import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import com.android.billingclient.api.Purchase;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QUser;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.dto.eligibility.QEligibility;
import com.qonversion.android.sdk.dto.eligibility.QIntroEligibilityStatus;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementGrantType;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementSource;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementsCacheLifetime;
import com.qonversion.android.sdk.dto.offerings.QOffering;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductStoreDetails;
import com.qonversion.android.sdk.dto.products.QProductType;
import com.qonversion.android.sdk.internal.AdvertisingProvider;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.billing.BillingError;
import com.qonversion.android.sdk.internal.billing.BillingService;
import com.qonversion.android.sdk.internal.billing.QonversionBillingService;
import com.qonversion.android.sdk.internal.converter.GooglePurchaseConverter;
import com.qonversion.android.sdk.internal.converter.PurchaseConverter;
import com.qonversion.android.sdk.internal.dto.QLaunchResult;
import com.qonversion.android.sdk.internal.dto.QPermission;
import com.qonversion.android.sdk.internal.dto.QProductRenewState;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseModelInternal;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseModelInternalEnriched;
import com.qonversion.android.sdk.internal.dto.request.data.InitRequestData;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.provider.UserStateProvider;
import com.qonversion.android.sdk.internal.purchase.PurchaseHistory;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import com.qonversion.android.sdk.listeners.QEntitlementsUpdateListener;
import com.qonversion.android.sdk.listeners.QonversionEligibilityCallback;
import com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback;
import com.qonversion.android.sdk.listeners.QonversionLaunchCallback;
import com.qonversion.android.sdk.listeners.QonversionOfferingsCallback;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import com.qonversion.android.sdk.listeners.QonversionPurchaseCallback;
import com.qonversion.android.sdk.listeners.QonversionUserCallback;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import ef.C2515C;
import ef.InterfaceC2525i;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import ff.o;
import ff.p;
import ff.v;
import ff.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

@Metadata(d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Ba\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020'¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.J#\u00102\u001a\u00020\u001b2\f\u00100\u001a\b\u0012\u0004\u0012\u00020*0/2\u0006\u0010!\u001a\u000201¢\u0006\u0004\b2\u00103J%\u00108\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u0002042\u0006\u00106\u001a\u0002052\u0006\u0010!\u001a\u000207¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020:¢\u0006\u0004\b;\u0010<J!\u0010=\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010:¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u001b¢\u0006\u0004\b?\u0010\u001dJ\u001d\u0010B\u001a\u00020\u001b2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0/H\u0016¢\u0006\u0004\bB\u0010CJ%\u0010F\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020D2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0/H\u0016¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\u001b¢\u0006\u0004\bH\u0010\u001dJ\u0015\u0010I\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020,¢\u0006\u0004\bI\u0010JJ\u0015\u0010M\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020'H\u0002¢\u0006\u0004\bQ\u0010)J\u0011\u0010S\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0004\bS\u0010TJ'\u0010U\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u0002042\u0006\u00106\u001a\u0002052\u0006\u0010!\u001a\u000207H\u0002¢\u0006\u0004\bU\u00109J'\u0010W\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u0002042\u0006\u00106\u001a\u00020V2\u0006\u0010!\u001a\u000207H\u0002¢\u0006\u0004\bW\u0010XJ#\u0010\\\u001a\u00020\u001b2\b\u0010Z\u001a\u0004\u0018\u00010Y2\b\u0010[\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u00020\u001b2\b\u0010^\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b_\u0010PJ/\u0010c\u001a\u0004\u0018\u00010a2\b\u0010^\u001a\u0004\u0018\u00010*2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020a0`H\u0002¢\u0006\u0004\bc\u0010dJ%\u0010i\u001a\u00020\u001b2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020e0/2\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bi\u0010jJ)\u0010n\u001a\u00020\u001b2\u0006\u0010k\u001a\u00020@2\b\u0010l\u001a\u0004\u0018\u0001072\u0006\u0010m\u001a\u00020gH\u0002¢\u0006\u0004\bn\u0010oJ!\u0010p\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u0001072\u0006\u0010E\u001a\u00020gH\u0002¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020gH\u0002¢\u0006\u0004\br\u0010sJE\u0010w\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020v0`2\u0006\u0010k\u001a\u00020@2\u0006\u0010t\u001a\u00020a2\u0018\u0010u\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0/0`H\u0002¢\u0006\u0004\bw\u0010xJQ\u0010{\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020v0`2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020e0/2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0z2\u0018\u0010u\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0/0`H\u0002¢\u0006\u0004\b{\u0010|J,\u0010\u0080\u0001\u001a\u0004\u0018\u00010v2\u0006\u0010}\u001a\u00020*2\u0006\u0010\u007f\u001a\u00020~2\u0006\u0010t\u001a\u00020aH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J-\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020v0`2\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020v0/H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J&\u0010\u0087\u0001\u001a\u00020v2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010v2\u0007\u0010\u0086\u0001\u001a\u00020vH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u0089\u0001\u0010\u001dJ\u001c\u0010\u008c\u0001\u001a\u00020\u001b2\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\"\u0010\u008e\u0001\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J*\u0010\u0092\u0001\u001a\u00020 2\r\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020@0/2\u0007\u0010\u0091\u0001\u001a\u00020 H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001c\u0010\u0094\u0001\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u001dJ\u001c\u0010\u0099\u0001\u001a\u00020\u001b2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u009b\u0001\u0010\u001dJ\u001e\u0010\u009d\u0001\u001a\u00020\u001b2\u000b\b\u0002\u0010\u009c\u0001\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0005\b\u009d\u0001\u0010sJ\u0011\u0010\u009e\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u009e\u0001\u0010\u001dJ\u001e\u0010 \u0001\u001a\u00020\u001b2\u000b\b\u0002\u0010\u009f\u0001\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0005\b \u0001\u0010sJ\u001e\u0010¢\u0001\u001a\u00020\u001b2\u000b\b\u0002\u0010¡\u0001\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0005\b¢\u0001\u0010sJ(\u0010¥\u0001\u001a\u00020\u001b2\u0014\u0010¤\u0001\u001a\u000f\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030£\u00010`H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0019\u0010§\u0001\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020gH\u0002¢\u0006\u0005\b§\u0001\u0010sJG\u0010«\u0001\u001a\u00020\u001b2\u0015\u0010©\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0097\u0001\u0012\u0004\u0012\u00020\u001b0¨\u00012\u0014\u0010ª\u0001\u001a\u000f\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u001b0¨\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J(\u0010®\u0001\u001a\u00020\u001b2\r\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020$0/2\u0006\u0010E\u001a\u00020gH\u0002¢\u0006\u0005\b®\u0001\u0010jJT\u0010¯\u0001\u001a\u00020\u001b2 \u0010©\u0001\u001a\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020v0`\u0012\u0004\u0012\u00020\u001b0¨\u00012\u0014\u0010ª\u0001\u001a\u000f\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u001b0¨\u00012\b\u0010E\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0011\u0010±\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b±\u0001\u0010\u001dJ\u001f\u0010²\u0001\u001a\u00020\u001b2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0/H\u0002¢\u0006\u0005\b²\u0001\u0010CJ/\u0010¶\u0001\u001a\u00020\u001b2\u0006\u0010k\u001a\u00020@2\b\u0010´\u0001\u001a\u00030³\u00012\t\u0010µ\u0001\u001a\u0004\u0018\u00010aH\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001b\u0010¹\u0001\u001a\u00030¸\u00012\u0006\u0010E\u001a\u00020gH\u0002¢\u0006\u0006\b¹\u0001\u0010º\u0001J#\u0010»\u0001\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*2\b\u0010!\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0005\b»\u0001\u0010.J\u0019\u0010¼\u0001\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0005\b¼\u0001\u0010PJ\"\u0010½\u0001\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*2\u0006\u0010E\u001a\u00020gH\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010¿\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010À\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010Á\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010Â\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010Ã\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010Ä\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010Å\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010Æ\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010Ç\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010È\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010É\u0001R\u001a\u0010Ê\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u001b\u0010Ì\u0001\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R \u0010Ï\u0001\u001a\t\u0012\u0004\u0012\u00020$0Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R \u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020:0Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ð\u0001R&\u0010Ó\u0001\u001a\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u0002070Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R \u0010Õ\u0001\u001a\t\u0012\u0004\u0012\u00020:0Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ð\u0001R\u001b\u0010Ö\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001b\u0010Ø\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010×\u0001R-\u0010Ù\u0001\u001a\u0016\u0012\u0004\u0012\u00020*\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020,0Î\u00010Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ô\u0001R\u001a\u0010Ú\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Ë\u0001R\u0019\u0010Û\u0001\u001a\u00020~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u001b\u0010Ý\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010×\u0001R\u001c\u0010Þ\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001f\u0010à\u0001\u001a\b\u0012\u0004\u0012\u00020@0/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010Ð\u0001R\u001a\u0010â\u0001\u001a\u00030á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R-\u0010è\u0001\u001a\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020Y0Ò\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bä\u0001\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001R4\u0010ë\u0001\u001a\u00030é\u00012\b\u0010ê\u0001\u001a\u00030é\u00018F@FX\u0086.¢\u0006\u0018\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R\u0018\u0010ñ\u0001\u001a\u00030¸\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010ò\u0001R\u0018\u0010ó\u0001\u001a\u00030¸\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010ò\u0001¨\u0006ô\u0001"}, d2 = {"Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;", "Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;", "Landroid/app/Application;", "context", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "repository", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "logger", "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;", "purchasesCache", "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;", "handledPurchasesCache", "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;", "launchResultCache", "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "userInfoService", "Lcom/qonversion/android/sdk/internal/QIdentityManager;", "identityManager", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "internalConfig", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "appStateProvider", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;", "remoteConfigManager", "<init>", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)V", "Lef/C;", "onAppForeground", "()V", "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;", "requestTrigger", "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "callback", "launch", "(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V", "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;", "loadProducts", "(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V", "Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;", "offerings", "(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V", "", "identityId", "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;", "identify", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V", "", "productIds", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "checkTrialIntroEligibilityForProductIds", "(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V", "Landroid/app/Activity;", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;", "purchaseModel", "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;", "purchaseProduct", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V", "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;", "checkEntitlements", "(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "restore", "(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "syncPurchases", "Lcom/android/billingclient/api/Purchase;", "purchases", "onPurchasesCompleted", "(Ljava/util/List;)V", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "error", "onPurchasesFailed", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;Ljava/util/List;)V", "logout", "getUserInfo", "(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V", "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "entitlementsUpdateListener", "setEntitlementsUpdateListener", "(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V", "processIdentity", "(Ljava/lang/String;)V", "executeOfferingCallback", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "getOfferings", "()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "tryToPurchase", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;", "processPurchase", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "options", "storeProductId", "updatePurchaseOptions", "(Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Ljava/lang/String;)V", InAppPurchaseMetaData.KEY_PRODUCT_ID, "removePurchaseOptions", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "products", "getProductForPurchase", "(Ljava/lang/String;Ljava/util/Map;)Lcom/qonversion/android/sdk/dto/products/QProduct;", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "purchaseHistoryRecords", "Lcom/qonversion/android/sdk/dto/QonversionError;", "restoreError", "calculateRestorePermissionsLocally", "(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V", "purchase", "purchaseCallback", "purchaseError", "calculatePurchasePermissionsLocally", "(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V", "failLocallyGrantingPurchasePermissionsWithError", "(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V", "failLocallyGrantingRestorePermissionsWithError", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "purchasedProduct", "productPermissions", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "grantPermissionsAfterFailedPurchaseTracking", "(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/util/Map;)Ljava/util/Map;", "historyRecords", "", "grantPermissionsAfterFailedRestore", "(Ljava/util/List;Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Map;", "id", "", "purchaseTime", "createPermission", "(Ljava/lang/String;JLcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/QPermission;", "newPermissions", "mergeManuallyCreatedPermissions", "(Ljava/util/List;)Ljava/util/Map;", "existingPermission", "localCreatedPermission", "choosePermissionToSave", "(Lcom/qonversion/android/sdk/internal/dto/QPermission;Lcom/qonversion/android/sdk/internal/dto/QPermission;)Lcom/qonversion/android/sdk/internal/dto/QPermission;", "processPendingInitIfAvailable", "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;", "initRequestData", "processInit", "(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V", "continueLaunchWithPurchasesInfo", "(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V", "trackingPurchases", "outerCallback", "getWrappedPurchasesCallback", "(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "getLaunchCallback", "(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "handleLogout", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "launchResult", "updateLaunchResult", "(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V", "loadStoreProductsIfPossible", "lastError", "handlePendingRequests", "handleCachedPurchases", "loadStoreProductsError", "executeProductsBlocks", "actualError", "executeEntitlementsBlock", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;", "entitlements", "executeRestoreBlocksOnSuccess", "(Ljava/util/Map;)V", "executeRestoreBlocksOnError", "Lkotlin/Function1;", "onSuccess", "onError", "retryLaunch", "(Ltf/l;Ltf/l;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V", "callbacks", "fireProductsFailure", "preparePermissionsResult", "(Ltf/l;Ltf/l;Lcom/qonversion/android/sdk/dto/QonversionError;)V", "handlePendingPurchases", "handlePurchases", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "purchaseInfo", AppLovinEventTypes.USER_VIEWED_PRODUCT, "storeFailedPurchaseIfNecessary", "(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;)V", "", "shouldCalculatePermissionsLocally", "(Lcom/qonversion/android/sdk/dto/QonversionError;)Z", "addIdentityCallback", "fireIdentitySuccess", "fireIdentityError", "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V", "Landroid/app/Application;", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;", "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;", "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;", "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "Lcom/qonversion/android/sdk/internal/QIdentityManager;", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;", "isRestoreInProgress", "Z", "launchError", "Lcom/qonversion/android/sdk/dto/QonversionError;", "", "productsCallbacks", "Ljava/util/List;", "entitlementCallbacks", "", "purchasingCallbacks", "Ljava/util/Map;", "restoreCallbacks", "processingPartnersIdentityId", "Ljava/lang/String;", "pendingPartnersIdentityId", "pendingIdentityCallbacks", "unhandledLogoutAvailable", "installDate", "J", "advertisingID", "pendingInitRequestData", "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;", "processingPurchases", "Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;", "converter", "Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;", "processingPurchaseOptions$delegate", "Lef/i;", "getProcessingPurchaseOptions", "()Ljava/util/Map;", "processingPurchaseOptions", "Lcom/qonversion/android/sdk/internal/billing/BillingService;", "<set-?>", "billingService", "Lcom/qonversion/android/sdk/internal/billing/BillingService;", "getBillingService", "()Lcom/qonversion/android/sdk/internal/billing/BillingService;", "setBillingService", "(Lcom/qonversion/android/sdk/internal/billing/BillingService;)V", "isUserStable", "()Z", "isLaunchingFinished", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QProductCenterManager implements QonversionBillingService.PurchasesListener, UserStateProvider {

    @Nullable
    private String advertisingID;

    @NotNull
    private final AppStateProvider appStateProvider;
    public volatile BillingService billingService;

    @NotNull
    private final Application context;

    @NotNull
    private PurchaseConverter converter;

    @NotNull
    private List<QonversionEntitlementsCallback> entitlementCallbacks;

    @NotNull
    private final QHandledPurchasesCache handledPurchasesCache;

    @NotNull
    private final QIdentityManager identityManager;
    private long installDate;

    @NotNull
    private final InternalConfig internalConfig;
    private boolean isRestoreInProgress;

    @Nullable
    private QonversionError launchError;

    @NotNull
    private final LaunchResultCacheWrapper launchResultCache;

    @NotNull
    private final Logger logger;

    @NotNull
    private Map<String, List<QonversionUserCallback>> pendingIdentityCallbacks;

    @Nullable
    private InitRequestData pendingInitRequestData;

    @Nullable
    private String pendingPartnersIdentityId;

    @Nullable
    private String processingPartnersIdentityId;

    /* renamed from: processingPurchaseOptions$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC2525i processingPurchaseOptions;

    @NotNull
    private List<? extends Purchase> processingPurchases;

    @NotNull
    private List<QonversionProductsCallback> productsCallbacks;

    @NotNull
    private final PurchasesCache purchasesCache;

    @NotNull
    private Map<String, QonversionPurchaseCallback> purchasingCallbacks;

    @NotNull
    private final QRemoteConfigManager remoteConfigManager;

    @NotNull
    private final QRepository repository;

    @NotNull
    private List<QonversionEntitlementsCallback> restoreCallbacks;
    private boolean unhandledLogoutAvailable;

    @NotNull
    private final QUserInfoService userInfoService;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$continueLaunchWithPurchasesInfo$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21541 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionLaunchCallback $callback;
        final /* synthetic */ RequestTrigger $requestTrigger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21541(QonversionLaunchCallback qonversionLaunchCallback, RequestTrigger requestTrigger) {
            super(1);
            this.$callback = qonversionLaunchCallback;
            this.$requestTrigger = requestTrigger;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingError it) {
            AbstractC3340k.e(it, "it");
            QProductCenterManager.continueLaunchWithPurchasesInfo$processInitDefault(QProductCenterManager.this, this.$callback, this.$requestTrigger);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/Purchase;", "purchases", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$continueLaunchWithPurchasesInfo$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionLaunchCallback $callback;
        final /* synthetic */ RequestTrigger $requestTrigger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(QonversionLaunchCallback qonversionLaunchCallback, RequestTrigger requestTrigger) {
            super(1);
            this.$callback = qonversionLaunchCallback;
            this.$requestTrigger = requestTrigger;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends Purchase>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<? extends Purchase> purchases) {
            AbstractC3340k.e(purchases, "purchases");
            if (purchases.isEmpty()) {
                QProductCenterManager.continueLaunchWithPurchasesInfo$processInitDefault(QProductCenterManager.this, this.$callback, this.$requestTrigger);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : purchases) {
                if (((Purchase) obj).getPurchaseState() == 1) {
                    arrayList.add(obj);
                }
            }
            QProductCenterManager.this.processingPurchases = arrayList;
            QProductCenterManager.this.processInit(new InitRequestData(QProductCenterManager.this.installDate, QProductCenterManager.this.advertisingID, QProductCenterManager.this.converter.convertPurchases(arrayList, QProductCenterManager.this.getProcessingPurchaseOptions()), QProductCenterManager.this.getWrappedPurchasesCallback(arrayList, this.$callback), this.$requestTrigger));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "permissions", "Lef/C;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$executeEntitlementsBlock$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21551 extends AbstractC3343n implements l {
        final /* synthetic */ List<QonversionEntitlementsCallback> $callbacks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21551(List<? extends QonversionEntitlementsCallback> list) {
            super(1);
            this.$callbacks = list;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, QPermission>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull Map<String, QPermission> permissions) {
            AbstractC3340k.e(permissions, "permissions");
            for (QonversionEntitlementsCallback qonversionEntitlementsCallback : this.$callbacks) {
                if (qonversionEntitlementsCallback != null) {
                    qonversionEntitlementsCallback.onSuccess(ExtensionsKt.toEntitlementsMap(permissions));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$executeEntitlementsBlock$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21562 extends AbstractC3343n implements l {
        final /* synthetic */ List<QonversionEntitlementsCallback> $callbacks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21562(List<? extends QonversionEntitlementsCallback> list) {
            super(1);
            this.$callbacks = list;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QonversionError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QonversionError error) {
            AbstractC3340k.e(error, "error");
            for (QonversionEntitlementsCallback qonversionEntitlementsCallback : this.$callbacks) {
                if (qonversionEntitlementsCallback != null) {
                    qonversionEntitlementsCallback.onError(error);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$handlePendingPurchases$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21601 extends AbstractC3343n implements l {
        public static final C21601 INSTANCE = new C21601();

        public C21601() {
            super(1);
        }

        public final void invoke(@NotNull BillingError it) {
            AbstractC3340k.e(it, "it");
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/Purchase;", "purchases", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$handlePendingPurchases$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21612 extends AbstractC3343n implements l {
        public C21612() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends Purchase>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<? extends Purchase> purchases) {
            AbstractC3340k.e(purchases, "purchases");
            QProductCenterManager.this.handlePurchases(purchases);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$loadStoreProductsIfPossible$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21631 extends AbstractC3343n implements l {
        public C21631() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingError error) {
            AbstractC3340k.e(error, "error");
            QProductCenterManager.this.executeProductsBlocks(ErrorsKt.toQonversionError(error));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "it", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$loadStoreProductsIfPossible$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21642 extends AbstractC3343n implements l {
        public C21642() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<QProduct>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<QProduct> it) {
            AbstractC3340k.e(it, "it");
            QProductCenterManager.executeProductsBlocks$default(QProductCenterManager.this, null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$purchaseProduct$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21671 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionPurchaseCallback $callback;
        final /* synthetic */ Activity $context;
        final /* synthetic */ PurchaseModelInternal $purchaseModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21671(Activity activity, PurchaseModelInternal purchaseModelInternal, QonversionPurchaseCallback qonversionPurchaseCallback) {
            super(1);
            this.$context = activity;
            this.$purchaseModel = purchaseModelInternal;
            this.$callback = qonversionPurchaseCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QLaunchResult) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QLaunchResult it) {
            AbstractC3340k.e(it, "it");
            QProductCenterManager.purchaseProduct$tryToPurchase(QProductCenterManager.this, this.$context, this.$purchaseModel, this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$purchaseProduct$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21682 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionPurchaseCallback $callback;
        final /* synthetic */ Activity $context;
        final /* synthetic */ PurchaseModelInternal $purchaseModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21682(Activity activity, PurchaseModelInternal purchaseModelInternal, QonversionPurchaseCallback qonversionPurchaseCallback) {
            super(1);
            this.$context = activity;
            this.$purchaseModel = purchaseModelInternal;
            this.$callback = qonversionPurchaseCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QonversionError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QonversionError it) {
            AbstractC3340k.e(it, "it");
            QProductCenterManager.purchaseProduct$tryToPurchase(QProductCenterManager.this, this.$context, this.$purchaseModel, this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$restore$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21692 extends AbstractC3343n implements l {
        public C21692() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingError it) {
            AbstractC3340k.e(it, "it");
            QProductCenterManager.this.executeRestoreBlocksOnError(ErrorsKt.toQonversionError(it));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "historyRecords", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QProductCenterManager$restore$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3343n implements l {
        final /* synthetic */ RequestTrigger $requestTrigger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RequestTrigger requestTrigger) {
            super(1);
            this.$requestTrigger = requestTrigger;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<PurchaseHistory>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull final List<PurchaseHistory> historyRecords) {
            AbstractC3340k.e(historyRecords, "historyRecords");
            QProductCenterManager.this.getBillingService().consumeHistoryRecords(historyRecords);
            QRepository qRepository = QProductCenterManager.this.repository;
            long j8 = QProductCenterManager.this.installDate;
            final QProductCenterManager qProductCenterManager = QProductCenterManager.this;
            qRepository.restore(j8, historyRecords, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.restore.3.1
                @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                public void onError(@NotNull QonversionError error) {
                    AbstractC3340k.e(error, "error");
                    if (qProductCenterManager.shouldCalculatePermissionsLocally(error)) {
                        qProductCenterManager.calculateRestorePermissionsLocally(historyRecords, error);
                    } else {
                        qProductCenterManager.executeRestoreBlocksOnError(error);
                    }
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                public void onSuccess(@NotNull QLaunchResult launchResult) {
                    AbstractC3340k.e(launchResult, "launchResult");
                    qProductCenterManager.updateLaunchResult(launchResult);
                    qProductCenterManager.executeRestoreBlocksOnSuccess(ExtensionsKt.toEntitlementsMap(launchResult.getPermissions$sdk_release()));
                }
            }, this.$requestTrigger);
        }
    }

    public QProductCenterManager(@NotNull Application context, @NotNull QRepository repository, @NotNull Logger logger, @NotNull PurchasesCache purchasesCache, @NotNull QHandledPurchasesCache handledPurchasesCache, @NotNull LaunchResultCacheWrapper launchResultCache, @NotNull QUserInfoService userInfoService, @NotNull QIdentityManager identityManager, @NotNull InternalConfig internalConfig, @NotNull AppStateProvider appStateProvider, @NotNull QRemoteConfigManager remoteConfigManager) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(repository, "repository");
        AbstractC3340k.e(logger, "logger");
        AbstractC3340k.e(purchasesCache, "purchasesCache");
        AbstractC3340k.e(handledPurchasesCache, "handledPurchasesCache");
        AbstractC3340k.e(launchResultCache, "launchResultCache");
        AbstractC3340k.e(userInfoService, "userInfoService");
        AbstractC3340k.e(identityManager, "identityManager");
        AbstractC3340k.e(internalConfig, "internalConfig");
        AbstractC3340k.e(appStateProvider, "appStateProvider");
        AbstractC3340k.e(remoteConfigManager, "remoteConfigManager");
        this.context = context;
        this.repository = repository;
        this.logger = logger;
        this.purchasesCache = purchasesCache;
        this.handledPurchasesCache = handledPurchasesCache;
        this.launchResultCache = launchResultCache;
        this.userInfoService = userInfoService;
        this.identityManager = identityManager;
        this.internalConfig = internalConfig;
        this.appStateProvider = appStateProvider;
        this.remoteConfigManager = remoteConfigManager;
        this.productsCallbacks = new ArrayList();
        this.entitlementCallbacks = new ArrayList();
        this.purchasingCallbacks = new LinkedHashMap();
        this.restoreCallbacks = new ArrayList();
        this.pendingIdentityCallbacks = new LinkedHashMap();
        this.processingPurchases = v.f35432a;
        this.converter = new GooglePurchaseConverter();
        this.processingPurchaseOptions = c.z(new QProductCenterManager$processingPurchaseOptions$2(this));
        this.installDate = ExtensionsKt.milliSecondsToSeconds((Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(128L)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 128)).firstInstallTime);
    }

    private final void addIdentityCallback(String identityId, QonversionUserCallback callback) {
        if (callback == null) {
            return;
        }
        List<QonversionUserCallback> arrayList = this.pendingIdentityCallbacks.get(identityId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(callback);
        this.pendingIdentityCallbacks.put(identityId, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculatePurchasePermissionsLocally(Purchase purchase, QonversionPurchaseCallback purchaseCallback, QonversionError purchaseError) {
        Object next;
        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
        if (actualProducts == null) {
            QonversionError qonversionError = this.launchError;
            if (qonversionError == null) {
                qonversionError = new QonversionError(QonversionErrorCode.LaunchError, null, null, 6, null);
            }
            failLocallyGrantingPurchasePermissionsWithError(purchaseCallback, qonversionError);
            return;
        }
        Map<String, List<String>> productPermissions = this.launchResultCache.getProductPermissions();
        if (productPermissions == null) {
            failLocallyGrantingPurchasePermissionsWithError(purchaseCallback, purchaseError);
            return;
        }
        Iterator<T> it = actualProducts.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC3340k.a(((QProduct) next).getStoreID(), com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase))) {
                    break;
                }
            }
        }
        QProduct qProduct = (QProduct) next;
        if (qProduct == null) {
            failLocallyGrantingPurchasePermissionsWithError(purchaseCallback, purchaseError);
            return;
        }
        Map<String, QPermission> mapGrantPermissionsAfterFailedPurchaseTracking = grantPermissionsAfterFailedPurchaseTracking(purchase, qProduct, productPermissions);
        if (purchaseCallback != null) {
            purchaseCallback.onSuccess(ExtensionsKt.toEntitlementsMap(mapGrantPermissionsAfterFailedPurchaseTracking), purchase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateRestorePermissionsLocally(List<PurchaseHistory> purchaseHistoryRecords, QonversionError restoreError) {
        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
        if (actualProducts != null) {
            Map<String, List<String>> productPermissions = this.launchResultCache.getProductPermissions();
            if (productPermissions == null) {
                failLocallyGrantingRestorePermissionsWithError(restoreError);
                return;
            } else {
                executeRestoreBlocksOnSuccess(ExtensionsKt.toEntitlementsMap(grantPermissionsAfterFailedRestore(purchaseHistoryRecords, actualProducts.values(), productPermissions)));
                return;
            }
        }
        QonversionError qonversionError = this.launchError;
        if (qonversionError == null) {
            qonversionError = new QonversionError(QonversionErrorCode.LaunchError, null, null, 6, null);
        }
        failLocallyGrantingRestorePermissionsWithError(qonversionError);
    }

    private final QPermission choosePermissionToSave(QPermission existingPermission, QPermission localCreatedPermission) {
        if (existingPermission == null) {
            return localCreatedPermission;
        }
        Date expirationDate = localCreatedPermission.getExpirationDate();
        long time = expirationDate != null ? expirationDate.getTime() : Long.MAX_VALUE;
        Date expirationDate2 = existingPermission.getExpirationDate();
        return (!existingPermission.isActive() || ((time > (expirationDate2 != null ? expirationDate2.getTime() : Long.MAX_VALUE) ? 1 : (time == (expirationDate2 != null ? expirationDate2.getTime() : Long.MAX_VALUE) ? 0 : -1)) > 0)) ? localCreatedPermission : existingPermission;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueLaunchWithPurchasesInfo(QonversionLaunchCallback callback, RequestTrigger requestTrigger) {
        getBillingService().queryPurchases(new C21541(callback, requestTrigger), new AnonymousClass2(callback, requestTrigger));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void continueLaunchWithPurchasesInfo$processInitDefault(QProductCenterManager qProductCenterManager, QonversionLaunchCallback qonversionLaunchCallback, RequestTrigger requestTrigger) {
        qProductCenterManager.processInit(new InitRequestData(qProductCenterManager.installDate, qProductCenterManager.advertisingID, null, qonversionLaunchCallback, requestTrigger));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QPermission createPermission(String id2, long purchaseTime, QProduct purchasedProduct) {
        Integer numValueOf = purchasedProduct.getType() == QProductType.InApp ? null : Integer.valueOf(Math.min(this.internalConfig.getCacheConfig().getEntitlementsCacheLifetime().getDays(), QEntitlementsCacheLifetime.Year.getDays()));
        Date date = numValueOf != null ? new Date(UtilsKt.getDaysToMs(numValueOf.intValue()) + purchaseTime) : null;
        if (date == null || new Date().compareTo(date) < 0) {
            return new QPermission(id2, purchasedProduct.getQonversionID(), QProductRenewState.Unknown, new Date(purchaseTime), date, QEntitlementSource.PlayStore, 1, 0, null, null, null, null, QEntitlementGrantType.Purchase, null, null, Http2.INITIAL_MAX_FRAME_SIZE, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executeEntitlementsBlock(QonversionError actualError) {
        if (this.entitlementCallbacks.isEmpty()) {
            return;
        }
        List listS0 = o.S0(this.entitlementCallbacks);
        this.entitlementCallbacks.clear();
        preparePermissionsResult(new C21551(listS0), new C21562(listS0), actualError);
    }

    public static /* synthetic */ void executeEntitlementsBlock$default(QProductCenterManager qProductCenterManager, QonversionError qonversionError, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            qonversionError = null;
        }
        qProductCenterManager.executeEntitlementsBlock(qonversionError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeOfferingCallback(QonversionOfferingsCallback callback) {
        QOfferings offerings = getOfferings();
        if (offerings != null) {
            Iterator<T> it = offerings.getAvailableOfferings().iterator();
            while (it.hasNext()) {
                getBillingService().enrichStoreData(((QOffering) it.next()).getProducts());
            }
            callback.onSuccess(offerings);
            return;
        }
        QonversionError qonversionError = this.launchError;
        if (qonversionError == null) {
            qonversionError = new QonversionError(QonversionErrorCode.OfferingsNotFound, null, null, 6, null);
        }
        callback.onError(qonversionError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executeProductsBlocks(QonversionError loadStoreProductsError) {
        if (this.productsCallbacks.isEmpty()) {
            return;
        }
        List<? extends QonversionProductsCallback> listS0 = o.S0(this.productsCallbacks);
        this.productsCallbacks.clear();
        if (loadStoreProductsError != null) {
            fireProductsFailure(listS0, loadStoreProductsError);
            return;
        }
        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
        if (actualProducts == null) {
            QonversionError qonversionError = this.launchError;
            if (qonversionError == null) {
                qonversionError = new QonversionError(QonversionErrorCode.LaunchError, null, null, 6, null);
            }
            fireProductsFailure(listS0, qonversionError);
            return;
        }
        List<QProduct> listS02 = o.S0(actualProducts.values());
        getBillingService().enrichStoreData(listS02);
        for (QonversionProductsCallback qonversionProductsCallback : listS0) {
            if (qonversionProductsCallback != null) {
                List<QProduct> list = listS02;
                int iD = AbstractC2641B.D(p.a0(list, 10));
                if (iD < 16) {
                    iD = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
                for (Object obj : list) {
                    linkedHashMap.put(((QProduct) obj).getQonversionID(), obj);
                }
                qonversionProductsCallback.onSuccess(linkedHashMap);
            }
        }
    }

    public static /* synthetic */ void executeProductsBlocks$default(QProductCenterManager qProductCenterManager, QonversionError qonversionError, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            qonversionError = null;
        }
        qProductCenterManager.executeProductsBlocks(qonversionError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeRestoreBlocksOnError(QonversionError error) {
        List<QonversionEntitlementsCallback> listS0 = o.S0(this.restoreCallbacks);
        this.restoreCallbacks.clear();
        this.isRestoreInProgress = false;
        for (QonversionEntitlementsCallback qonversionEntitlementsCallback : listS0) {
            if (qonversionEntitlementsCallback != null) {
                qonversionEntitlementsCallback.onError(error);
            }
        }
        handlePendingRequests(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeRestoreBlocksOnSuccess(Map<String, QEntitlement> entitlements) {
        List<QonversionEntitlementsCallback> listS0 = o.S0(this.restoreCallbacks);
        this.restoreCallbacks.clear();
        this.isRestoreInProgress = false;
        for (QonversionEntitlementsCallback qonversionEntitlementsCallback : listS0) {
            if (qonversionEntitlementsCallback != null) {
                qonversionEntitlementsCallback.onSuccess(entitlements);
            }
        }
        handlePendingRequests$default(this, null, 1, null);
    }

    private final void failLocallyGrantingPurchasePermissionsWithError(QonversionPurchaseCallback callback, QonversionError error) {
        this.launchResultCache.clearPermissionsCache();
        if (callback != null) {
            callback.onError(error);
        }
    }

    private final void failLocallyGrantingRestorePermissionsWithError(QonversionError error) {
        this.launchResultCache.clearPermissionsCache();
        executeRestoreBlocksOnError(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireIdentityError(String identityId, QonversionError error) {
        List<QonversionUserCallback> list = this.pendingIdentityCallbacks.get(identityId);
        if (list == null) {
            return;
        }
        this.pendingIdentityCallbacks.put(identityId, new ArrayList());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((QonversionUserCallback) it.next()).onError(error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireIdentitySuccess(String identityId) {
        final List<QonversionUserCallback> list = this.pendingIdentityCallbacks.get(identityId);
        if (list == null) {
            return;
        }
        this.pendingIdentityCallbacks.put(identityId, new ArrayList());
        getUserInfo(new QonversionUserCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.fireIdentitySuccess.1
            @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((QonversionUserCallback) it.next()).onError(error);
                }
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
            public void onSuccess(@NotNull QUser user) {
                AbstractC3340k.e(user, "user");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((QonversionUserCallback) it.next()).onSuccess(user);
                }
            }
        });
    }

    private final void fireProductsFailure(List<? extends QonversionProductsCallback> callbacks, QonversionError error) {
        for (QonversionProductsCallback qonversionProductsCallback : callbacks) {
            if (qonversionProductsCallback != null) {
                qonversionProductsCallback.onError(error);
            }
        }
    }

    private final QonversionLaunchCallback getLaunchCallback(final QonversionLaunchCallback callback) {
        return new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.getLaunchCallback.1
            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                QProductCenterManager.this.launchError = error;
                QProductCenterManager.this.handlePendingRequests(error);
                QProductCenterManager.this.loadStoreProductsIfPossible();
                QonversionLaunchCallback qonversionLaunchCallback = callback;
                if (qonversionLaunchCallback != null) {
                    qonversionLaunchCallback.onError(error);
                }
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onSuccess(@NotNull QLaunchResult launchResult) {
                AbstractC3340k.e(launchResult, "launchResult");
                QProductCenterManager.this.updateLaunchResult(launchResult);
                QProductCenterManager.this.launchError = null;
                QProductCenterManager.handlePendingRequests$default(QProductCenterManager.this, null, 1, null);
                QProductCenterManager.this.loadStoreProductsIfPossible();
                if (!QProductCenterManager.this.processingPurchases.isEmpty()) {
                    QProductCenterManager.this.handledPurchasesCache.saveHandledPurchases(QProductCenterManager.this.processingPurchases);
                    QProductCenterManager.this.getBillingService().consumePurchases(o.S0(QProductCenterManager.this.processingPurchases));
                    QProductCenterManager.this.processingPurchases = v.f35432a;
                }
                QProductCenterManager.this.handleCachedPurchases();
                QonversionLaunchCallback qonversionLaunchCallback = callback;
                if (qonversionLaunchCallback != null) {
                    qonversionLaunchCallback.onSuccess(launchResult);
                }
            }
        };
    }

    private final QOfferings getOfferings() {
        return this.launchResultCache.getActualOfferings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, QPurchaseOptions> getProcessingPurchaseOptions() {
        return (Map) this.processingPurchaseOptions.getValue();
    }

    private final QProduct getProductForPurchase(String productId, Map<String, QProduct> products) {
        if (productId == null) {
            return null;
        }
        return products.get(productId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QonversionLaunchCallback getWrappedPurchasesCallback(final List<? extends Purchase> trackingPurchases, final QonversionLaunchCallback outerCallback) {
        return new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.getWrappedPurchasesCallback.1
            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                outerCallback.onError(error);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onSuccess(@NotNull QLaunchResult launchResult) {
                AbstractC3340k.e(launchResult, "launchResult");
                QProductCenterManager.this.handledPurchasesCache.saveHandledPurchases(trackingPurchases);
                List<Purchase> list = trackingPurchases;
                QProductCenterManager qProductCenterManager = QProductCenterManager.this;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    qProductCenterManager.removePurchaseOptions(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId((Purchase) it.next()));
                }
                outerCallback.onSuccess(launchResult);
            }
        };
    }

    private final Map<String, QPermission> grantPermissionsAfterFailedPurchaseTracking(Purchase purchase, QProduct purchasedProduct, Map<String, ? extends List<String>> productPermissions) {
        List<QPermission> arrayList;
        List<String> list = productPermissions.get(purchasedProduct.getQonversionID());
        if (list != null) {
            arrayList = new ArrayList<>();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                QPermission qPermissionCreatePermission = createPermission((String) it.next(), purchase.getPurchaseTime(), purchasedProduct);
                if (qPermissionCreatePermission != null) {
                    arrayList.add(qPermissionCreatePermission);
                }
            }
        } else {
            arrayList = v.f35432a;
        }
        return mergeManuallyCreatedPermissions(arrayList);
    }

    private final Map<String, QPermission> grantPermissionsAfterFailedRestore(List<PurchaseHistory> historyRecords, Collection<QProduct> products, Map<String, ? extends List<String>> productPermissions) {
        g gVarW = n.W(new h(o.j0(historyRecords), new QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1(products, productPermissions, this), u.f1326a), new Ad.g(4));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f fVar = new f(gVarW);
        while (fVar.hasNext()) {
            Object next = fVar.next();
            String permissionID = ((QPermission) next).getPermissionID();
            Object arrayList = linkedHashMap.get(permissionID);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(permissionID, arrayList);
            }
            ((List) arrayList).add(next);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((QPermission) o.q0((List) ((Map.Entry) it.next()).getValue()));
        }
        return mergeManuallyCreatedPermissions(o.S0(arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCachedPurchases() {
        for (final com.qonversion.android.sdk.internal.purchase.Purchase purchase : this.purchasesCache.loadPurchases()) {
            this.repository.purchase(this.installDate, purchase, null, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$handleCachedPurchases$1$1
                @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                public void onError(@NotNull QonversionError error) {
                    AbstractC3340k.e(error, "error");
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                public void onSuccess(@NotNull QLaunchResult launchResult) {
                    AbstractC3340k.e(launchResult, "launchResult");
                    this.this$0.updateLaunchResult(launchResult);
                    this.this$0.purchasesCache.clearPurchase(purchase);
                }
            });
        }
    }

    private final void handleLogout() {
        this.unhandledLogoutAvailable = false;
        launch$default(this, RequestTrigger.Logout, null, 2, null);
    }

    private final void handlePendingPurchases() {
        if (isLaunchingFinished()) {
            getBillingService().queryPurchases(C21601.INSTANCE, new C21612());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePendingRequests(QonversionError lastError) {
        if (isLaunchingFinished() && !this.isRestoreInProgress && this.processingPartnersIdentityId == null) {
            String str = this.pendingPartnersIdentityId;
            if (str != null && str.length() != 0) {
                identify$default(this, str, null, 2, null);
            } else if (this.unhandledLogoutAvailable) {
                handleLogout();
            } else {
                executeEntitlementsBlock(lastError);
                this.remoteConfigManager.handlePendingRequests();
            }
        }
    }

    public static /* synthetic */ void handlePendingRequests$default(QProductCenterManager qProductCenterManager, QonversionError qonversionError, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            qonversionError = null;
        }
        qProductCenterManager.handlePendingRequests(qonversionError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePurchases(List<? extends Purchase> purchases) {
        final QProduct qProduct;
        Collection<QProduct> collectionValues;
        Object next;
        getBillingService().consumePurchases(purchases);
        for (final Purchase purchase : purchases) {
            final QonversionPurchaseCallback qonversionPurchaseCallback = this.purchasingCallbacks.get(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase));
            K.c(this.purchasingCallbacks).remove(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase));
            int purchaseState = purchase.getPurchaseState();
            if (purchaseState != 0) {
                if (purchaseState != 2) {
                    if (this.handledPurchasesCache.shouldHandlePurchase(purchase)) {
                        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
                        if (actualProducts == null || (collectionValues = actualProducts.values()) == null) {
                            qProduct = null;
                        } else {
                            Iterator<T> it = collectionValues.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (AbstractC3340k.a(((QProduct) next).getStoreID(), com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase))) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            qProduct = (QProduct) next;
                        }
                        final com.qonversion.android.sdk.internal.purchase.Purchase purchaseConvertPurchase = this.converter.convertPurchase(purchase, getProcessingPurchaseOptions().get(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase)));
                        this.repository.purchase(this.installDate, purchaseConvertPurchase, qProduct != null ? qProduct.getQonversionID() : null, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$handlePurchases$1$1
                            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                            public void onError(@NotNull QonversionError error) {
                                AbstractC3340k.e(error, "error");
                                this.this$0.storeFailedPurchaseIfNecessary(purchase, purchaseConvertPurchase, qProduct);
                                QProductCenterManager qProductCenterManager = this.this$0;
                                QProduct qProduct2 = qProduct;
                                qProductCenterManager.removePurchaseOptions(qProduct2 != null ? qProduct2.getStoreID() : null);
                                if (this.this$0.shouldCalculatePermissionsLocally(error)) {
                                    this.this$0.calculatePurchasePermissionsLocally(purchase, qonversionPurchaseCallback, error);
                                    return;
                                }
                                QonversionPurchaseCallback qonversionPurchaseCallback2 = qonversionPurchaseCallback;
                                if (qonversionPurchaseCallback2 != null) {
                                    qonversionPurchaseCallback2.onError(error);
                                }
                            }

                            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                            public void onSuccess(@NotNull QLaunchResult launchResult) {
                                AbstractC3340k.e(launchResult, "launchResult");
                                this.this$0.updateLaunchResult(launchResult);
                                Map<String, QEntitlement> entitlementsMap = ExtensionsKt.toEntitlementsMap(launchResult.getPermissions$sdk_release());
                                QProductCenterManager qProductCenterManager = this.this$0;
                                QProduct qProduct2 = qProduct;
                                qProductCenterManager.removePurchaseOptions(qProduct2 != null ? qProduct2.getStoreID() : null);
                                QonversionPurchaseCallback qonversionPurchaseCallback2 = qonversionPurchaseCallback;
                                if (qonversionPurchaseCallback2 != null) {
                                    qonversionPurchaseCallback2.onSuccess(entitlementsMap, purchase);
                                } else {
                                    QEntitlementsUpdateListener entitlementsUpdateListener = this.this$0.internalConfig.getEntitlementsUpdateListener();
                                    if (entitlementsUpdateListener != null) {
                                        entitlementsUpdateListener.onEntitlementsUpdated(entitlementsMap);
                                    }
                                }
                                this.this$0.handledPurchasesCache.saveHandledPurchase(purchase);
                            }
                        });
                    }
                } else if (qonversionPurchaseCallback != null) {
                    qonversionPurchaseCallback.onError(new QonversionError(QonversionErrorCode.PurchasePending, null, null, 6, null));
                }
            } else if (qonversionPurchaseCallback != null) {
                qonversionPurchaseCallback.onError(new QonversionError(QonversionErrorCode.PurchaseUnspecified, null, null, 6, null));
            }
        }
    }

    public static /* synthetic */ void identify$default(QProductCenterManager qProductCenterManager, String str, QonversionUserCallback qonversionUserCallback, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            qonversionUserCallback = null;
        }
        qProductCenterManager.identify(str, qonversionUserCallback);
    }

    private final boolean isLaunchingFinished() {
        return (this.launchError == null && this.launchResultCache.getSessionLaunchResult() == null) ? false : true;
    }

    public static /* synthetic */ void launch$default(QProductCenterManager qProductCenterManager, RequestTrigger requestTrigger, QonversionLaunchCallback qonversionLaunchCallback, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            qonversionLaunchCallback = null;
        }
        qProductCenterManager.launch(requestTrigger, qonversionLaunchCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadStoreProductsIfPossible() {
        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
        if (actualProducts != null) {
            getBillingService().enrichStoreDataAsync(o.S0(actualProducts.values()), new C21631(), new C21642());
            return;
        }
        QonversionError qonversionError = this.launchError;
        if (qonversionError == null) {
            qonversionError = new QonversionError(QonversionErrorCode.LaunchError, null, null, 6, null);
        }
        executeProductsBlocks(qonversionError);
    }

    private final Map<String, QPermission> mergeManuallyCreatedPermissions(List<QPermission> newPermissions) {
        Map<String, QPermission> actualPermissions = this.launchResultCache.getActualPermissions();
        if (actualPermissions == null) {
            actualPermissions = w.f35433a;
        }
        LinkedHashMap linkedHashMapA0 = AbstractC2640A.a0(actualPermissions);
        for (QPermission qPermission : newPermissions) {
            String permissionID = qPermission.getPermissionID();
            linkedHashMapA0.put(permissionID, choosePermissionToSave((QPermission) linkedHashMapA0.get(permissionID), qPermission));
        }
        this.launchResultCache.updatePermissions(linkedHashMapA0);
        return linkedHashMapA0;
    }

    private final void preparePermissionsResult(l onSuccess, l onError, QonversionError error) {
        Map<String, QPermission> actualPermissions = this.launchResultCache.getActualPermissions();
        if (actualPermissions == null) {
            actualPermissions = w.f35433a;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = true;
        if (!actualPermissions.isEmpty()) {
            Iterator<Map.Entry<String, QPermission>> it = actualPermissions.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, QPermission> next = it.next();
                Date expirationDate = next.getValue().getExpirationDate();
                long time = expirationDate != null ? expirationDate.getTime() : Long.MAX_VALUE;
                if (next.getValue().isActive() && time < jCurrentTimeMillis) {
                    z2 = false;
                    break;
                }
            }
        }
        if ((error == null || UtilsKt.getShouldFireFallback(error)) && z2) {
            onSuccess.invoke(actualPermissions);
        } else if (error != null) {
            onError.invoke(error);
        } else {
            preparePermissionsResult$actualizePermissions(this, onSuccess, onError);
        }
    }

    private static final void preparePermissionsResult$actualizePermissions(QProductCenterManager qProductCenterManager, l lVar, l lVar2) {
        qProductCenterManager.retryLaunch(new QProductCenterManager$preparePermissionsResult$actualizePermissions$1(lVar, qProductCenterManager), new QProductCenterManager$preparePermissionsResult$actualizePermissions$2(qProductCenterManager, lVar2, lVar), RequestTrigger.ActualizePermissions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processIdentity(final String identityId) {
        final String strObtainUserID = this.userInfoService.obtainUserID();
        this.identityManager.identify(identityId, new IdentityManagerCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.processIdentity.1
            @Override // com.qonversion.android.sdk.internal.IdentityManagerCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                QProductCenterManager.this.processingPartnersIdentityId = null;
                QProductCenterManager.this.executeEntitlementsBlock(error);
                QProductCenterManager.this.remoteConfigManager.userChangingRequestFailedWithError(error);
                QProductCenterManager.this.fireIdentityError(identityId, error);
            }

            @Override // com.qonversion.android.sdk.internal.IdentityManagerCallback
            public void onSuccess(@NotNull String qonversionUid) {
                AbstractC3340k.e(qonversionUid, "qonversionUid");
                QProductCenterManager.this.pendingPartnersIdentityId = null;
                QProductCenterManager.this.processingPartnersIdentityId = null;
                if (AbstractC3340k.a(strObtainUserID, qonversionUid)) {
                    QProductCenterManager.handlePendingRequests$default(QProductCenterManager.this, null, 1, null);
                    QProductCenterManager.this.fireIdentitySuccess(identityId);
                    return;
                }
                QProductCenterManager.this.internalConfig.setUid(qonversionUid);
                QProductCenterManager.this.remoteConfigManager.onUserUpdate();
                QProductCenterManager.this.launchResultCache.clearPermissionsCache();
                final QProductCenterManager qProductCenterManager = QProductCenterManager.this;
                RequestTrigger requestTrigger = RequestTrigger.Identify;
                final String str = identityId;
                qProductCenterManager.launch(requestTrigger, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$processIdentity$1$onSuccess$1
                    @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                    public void onError(@NotNull QonversionError error) {
                        AbstractC3340k.e(error, "error");
                        qProductCenterManager.fireIdentityError(str, error);
                    }

                    @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                    public void onSuccess(@NotNull QLaunchResult launchResult) {
                        AbstractC3340k.e(launchResult, "launchResult");
                        qProductCenterManager.fireIdentitySuccess(str);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processInit(InitRequestData initRequestData) {
        if (this.appStateProvider.getAppState().isBackground()) {
            this.pendingInitRequestData = initRequestData;
        } else {
            this.repository.init(initRequestData);
        }
    }

    private final void processPendingInitIfAvailable() {
        InitRequestData initRequestData = this.pendingInitRequestData;
        if (initRequestData != null) {
            processInit(initRequestData);
            this.pendingInitRequestData = null;
        }
    }

    private final void processPurchase(Activity context, PurchaseModelInternalEnriched purchaseModel, QonversionPurchaseCallback callback) {
        if (purchaseModel.getProduct().getStoreID() == null) {
            callback.onError(new QonversionError(QonversionErrorCode.ProductNotFound, null, null, 6, null));
        } else if (this.purchasingCallbacks.get(purchaseModel.getProduct().getStoreID()) == null) {
            this.purchasingCallbacks.put(purchaseModel.getProduct().getStoreID(), callback);
            updatePurchaseOptions(purchaseModel.getOptions(), purchaseModel.getProduct().getStoreID());
            getBillingService().purchase(context, purchaseModel);
        } else {
            this.logger.release("purchaseProduct() -> Purchase of the product " + purchaseModel.getProduct().getQonversionID() + " is already in progress. This call will be ignored");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseProduct$tryToPurchase(QProductCenterManager qProductCenterManager, Activity activity, PurchaseModelInternal purchaseModelInternal, QonversionPurchaseCallback qonversionPurchaseCallback) {
        qProductCenterManager.tryToPurchase(activity, purchaseModelInternal, qonversionPurchaseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePurchaseOptions(String productId) {
        updatePurchaseOptions(null, productId);
    }

    public static /* synthetic */ void restore$default(QProductCenterManager qProductCenterManager, RequestTrigger requestTrigger, QonversionEntitlementsCallback qonversionEntitlementsCallback, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            qonversionEntitlementsCallback = null;
        }
        qProductCenterManager.restore(requestTrigger, qonversionEntitlementsCallback);
    }

    private final void retryLaunch(final l onSuccess, final l onError, RequestTrigger requestTrigger) {
        launch(requestTrigger, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.retryLaunch.1
            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                onError.invoke(error);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onSuccess(@NotNull QLaunchResult launchResult) {
                AbstractC3340k.e(launchResult, "launchResult");
                onSuccess.invoke(launchResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCalculatePermissionsLocally(QonversionError error) {
        Integer httpCode$sdk_release;
        if (this.internalConfig.isAnalyticsMode()) {
            return false;
        }
        return error.getCode() == QonversionErrorCode.NetworkConnectionFailed || ((httpCode$sdk_release = error.getHttpCode$sdk_release()) != null && ExtensionsKt.isInternalServerError(httpCode$sdk_release.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void storeFailedPurchaseIfNecessary(Purchase purchase, com.qonversion.android.sdk.internal.purchase.Purchase purchaseInfo, QProduct product) {
        C2515C c2515c;
        QProductStoreDetails storeDetails;
        if (product != null && (storeDetails = product.getStoreDetails()) != null && storeDetails.getIsInApp()) {
            storeFailedPurchaseIfNecessary$storePurchase(this, purchaseInfo);
            return;
        }
        String productId = com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase);
        if (productId != null) {
            getBillingService().getStoreProductType(productId, new QProductCenterManager$storeFailedPurchaseIfNecessary$1$1(this, purchaseInfo), new QProductCenterManager$storeFailedPurchaseIfNecessary$1$2(this, purchaseInfo));
            c2515c = C2515C.f34653a;
        } else {
            c2515c = null;
        }
        if (c2515c == null) {
            storeFailedPurchaseIfNecessary$storePurchase(this, purchaseInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void storeFailedPurchaseIfNecessary$storePurchase(QProductCenterManager qProductCenterManager, com.qonversion.android.sdk.internal.purchase.Purchase purchase) {
        qProductCenterManager.purchasesCache.savePurchase(purchase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryToPurchase(Activity context, PurchaseModelInternal purchaseModel, QonversionPurchaseCallback callback) {
        QProduct productForPurchase;
        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
        if (actualProducts == null) {
            QonversionError qonversionError = this.launchError;
            if (qonversionError == null) {
                qonversionError = new QonversionError(QonversionErrorCode.LaunchError, null, null, 6, null);
            }
            callback.onError(qonversionError);
            return;
        }
        QProduct productForPurchase2 = getProductForPurchase(purchaseModel.getProductId(), actualProducts);
        if (productForPurchase2 == null) {
            callback.onError(new QonversionError(QonversionErrorCode.ProductNotFound, null, null, 6, null));
            return;
        }
        QPurchaseOptions options = purchaseModel.getOptions();
        if (options == null || (productForPurchase = options.getOldProduct()) == null) {
            productForPurchase = getProductForPurchase(purchaseModel.getOldProductId(), actualProducts);
        }
        processPurchase(context, purchaseModel.enrich(productForPurchase2, productForPurchase), callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLaunchResult(QLaunchResult launchResult) {
        this.launchResultCache.save(launchResult);
    }

    private final void updatePurchaseOptions(QPurchaseOptions options, String storeProductId) {
        if (storeProductId != null) {
            if (options != null) {
                getProcessingPurchaseOptions().put(storeProductId, options);
            } else {
                getProcessingPurchaseOptions().remove(storeProductId);
            }
            this.purchasesCache.saveProcessingPurchasesOptions(getProcessingPurchaseOptions());
        }
    }

    public final void checkEntitlements(@NotNull QonversionEntitlementsCallback callback) {
        AbstractC3340k.e(callback, "callback");
        this.entitlementCallbacks.add(callback);
        handlePendingRequests$default(this, null, 1, null);
    }

    public final void checkTrialIntroEligibilityForProductIds(@NotNull final List<String> productIds, @NotNull final QonversionEligibilityCallback callback) {
        AbstractC3340k.e(productIds, "productIds");
        AbstractC3340k.e(callback, "callback");
        loadProducts(new QonversionProductsCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.checkTrialIntroEligibilityForProductIds.1
            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                callback.onError(error);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onSuccess(@NotNull Map<String, QProduct> products) {
                AbstractC3340k.e(products, "products");
                List<String> list = productIds;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, QProduct> entry : products.entrySet()) {
                    if (list.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2641B.D(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    QProduct qProduct = (QProduct) entry2.getValue();
                    QProductStoreDetails storeDetails = qProduct.getStoreDetails();
                    linkedHashMap2.put(key, (storeDetails == null || !storeDetails.getIsPrepaid()) ? new QEligibility(QIntroEligibilityStatus.INSTANCE.fromProductType(qProduct.getType())) : new QEligibility(QIntroEligibilityStatus.NonIntroOrTrialProduct));
                }
                callback.onSuccess(linkedHashMap2);
            }
        });
    }

    @NotNull
    public final synchronized BillingService getBillingService() {
        BillingService billingService;
        billingService = this.billingService;
        if (billingService == null) {
            AbstractC3340k.m("billingService");
            throw null;
        }
        return billingService;
    }

    public final void getUserInfo(@NotNull QonversionUserCallback callback) {
        AbstractC3340k.e(callback, "callback");
        callback.onSuccess(new QUser(this.internalConfig.getUid(), this.identityManager.getCurrentPartnersIdentityId()));
    }

    public final void identify(@NotNull final String identityId, @Nullable QonversionUserCallback callback) {
        AbstractC3340k.e(identityId, "identityId");
        if (AbstractC3340k.a(this.identityManager.getCurrentPartnersIdentityId(), identityId)) {
            if (callback != null) {
                getUserInfo(callback);
                return;
            }
            return;
        }
        addIdentityCallback(identityId, callback);
        if (AbstractC3340k.a(this.processingPartnersIdentityId, identityId)) {
            return;
        }
        this.unhandledLogoutAvailable = false;
        this.pendingPartnersIdentityId = identityId;
        if (!isLaunchingFinished() || this.isRestoreInProgress) {
            return;
        }
        this.processingPartnersIdentityId = identityId;
        if (this.launchError == null) {
            processIdentity(identityId);
            return;
        }
        this.repository.init(new InitRequestData(this.installDate, this.advertisingID, null, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$identify$launchCallback$1
            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                this.this$0.processingPartnersIdentityId = null;
                this.this$0.remoteConfigManager.userChangingRequestFailedWithError(error);
                this.this$0.executeEntitlementsBlock(error);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onSuccess(@NotNull QLaunchResult launchResult) {
                AbstractC3340k.e(launchResult, "launchResult");
                this.this$0.processIdentity(identityId);
            }
        }, RequestTrigger.Identify));
    }

    @Override // com.qonversion.android.sdk.internal.provider.UserStateProvider
    public boolean isUserStable() {
        if (!isLaunchingFinished() || this.processingPartnersIdentityId != null) {
            return false;
        }
        String str = this.pendingPartnersIdentityId;
        return (str == null || str.length() == 0) && !this.unhandledLogoutAvailable;
    }

    public final void launch(@NotNull final RequestTrigger requestTrigger, @Nullable QonversionLaunchCallback callback) {
        AbstractC3340k.e(requestTrigger, "requestTrigger");
        final QonversionLaunchCallback launchCallback = getLaunchCallback(callback);
        this.launchError = null;
        this.launchResultCache.resetSessionCache();
        if (this.internalConfig.getPrimaryConfig().isKidsMode()) {
            continueLaunchWithPurchasesInfo(launchCallback, requestTrigger);
        } else {
            new AdvertisingProvider().init(this.context, new AdvertisingProvider.Callback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.launch.1
                @Override // com.qonversion.android.sdk.internal.AdvertisingProvider.Callback
                public void onFailure(@NotNull Throwable t10) {
                    AbstractC3340k.e(t10, "t");
                    QProductCenterManager.this.continueLaunchWithPurchasesInfo(launchCallback, requestTrigger);
                }

                @Override // com.qonversion.android.sdk.internal.AdvertisingProvider.Callback
                public void onSuccess(@NotNull String advertisingId) {
                    AbstractC3340k.e(advertisingId, "advertisingId");
                    QProductCenterManager.this.advertisingID = advertisingId;
                    QProductCenterManager.this.continueLaunchWithPurchasesInfo(launchCallback, requestTrigger);
                }
            });
        }
    }

    public final void loadProducts(@NotNull QonversionProductsCallback callback) {
        C2515C c2515c;
        AbstractC3340k.e(callback, "callback");
        this.productsCallbacks.add(callback);
        if (isLaunchingFinished()) {
            if (this.launchResultCache.getSessionLaunchResult() != null) {
                loadStoreProductsIfPossible();
                c2515c = C2515C.f34653a;
            } else {
                c2515c = null;
            }
            if (c2515c == null) {
                launch$default(this, RequestTrigger.Products, null, 2, null);
            }
        }
    }

    public final void logout() {
        this.pendingPartnersIdentityId = null;
        if (this.identityManager.logoutIfNeeded()) {
            this.remoteConfigManager.onUserUpdate();
            this.launchResultCache.clearPermissionsCache();
            this.unhandledLogoutAvailable = true;
            this.internalConfig.setUid(this.userInfoService.obtainUserID());
        }
    }

    public final void offerings(@NotNull final QonversionOfferingsCallback callback) {
        AbstractC3340k.e(callback, "callback");
        loadProducts(new QonversionProductsCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.offerings.1
            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                callback.onError(error);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onSuccess(@NotNull Map<String, QProduct> products) {
                AbstractC3340k.e(products, "products");
                QProductCenterManager.this.executeOfferingCallback(callback);
            }
        });
    }

    public final void onAppForeground() {
        handlePendingPurchases();
        processPendingInitIfAvailable();
    }

    @Override // com.qonversion.android.sdk.internal.billing.QonversionBillingService.PurchasesListener
    public void onPurchasesCompleted(@NotNull List<? extends Purchase> purchases) {
        AbstractC3340k.e(purchases, "purchases");
        handlePurchases(purchases);
    }

    @Override // com.qonversion.android.sdk.internal.billing.QonversionBillingService.PurchasesListener
    public void onPurchasesFailed(@NotNull BillingError error, @NotNull List<? extends Purchase> purchases) {
        AbstractC3340k.e(error, "error");
        AbstractC3340k.e(purchases, "purchases");
        if (purchases.isEmpty()) {
            for (QonversionPurchaseCallback qonversionPurchaseCallback : this.purchasingCallbacks.values()) {
                if (qonversionPurchaseCallback != null) {
                    qonversionPurchaseCallback.onError(ErrorsKt.toQonversionError(error));
                }
            }
            this.purchasingCallbacks.clear();
            return;
        }
        for (Purchase purchase : purchases) {
            QonversionPurchaseCallback qonversionPurchaseCallback2 = this.purchasingCallbacks.get(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase));
            Map<String, QonversionPurchaseCallback> map = this.purchasingCallbacks;
            K.c(map).remove(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase));
            if (qonversionPurchaseCallback2 != null) {
                qonversionPurchaseCallback2.onError(ErrorsKt.toQonversionError(error));
            }
        }
    }

    public final void purchaseProduct(@NotNull Activity context, @NotNull PurchaseModelInternal purchaseModel, @NotNull QonversionPurchaseCallback callback) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(purchaseModel, "purchaseModel");
        AbstractC3340k.e(callback, "callback");
        if (this.internalConfig.isAnalyticsMode()) {
            this.logger.warn("Making purchases via Qonversion in the Analytics mode can lead to an inconsistent state in the store. Consider switching to the Subscription management mode.");
        }
        if (this.launchError != null) {
            retryLaunch(new C21671(context, purchaseModel, callback), new C21682(context, purchaseModel, callback), RequestTrigger.Purchase);
        } else {
            tryToPurchase(context, purchaseModel, callback);
        }
    }

    public final void restore(@NotNull RequestTrigger requestTrigger, @Nullable QonversionEntitlementsCallback callback) {
        AbstractC3340k.e(requestTrigger, "requestTrigger");
        if (callback != null) {
            this.restoreCallbacks.add(callback);
        }
        if (this.isRestoreInProgress) {
            return;
        }
        this.isRestoreInProgress = true;
        getBillingService().queryPurchasesHistory(new C21692(), new AnonymousClass3(requestTrigger));
    }

    public final synchronized void setBillingService(@NotNull BillingService billingService) {
        AbstractC3340k.e(billingService, "<set-?>");
        this.billingService = billingService;
    }

    public final void setEntitlementsUpdateListener(@NotNull QEntitlementsUpdateListener entitlementsUpdateListener) {
        AbstractC3340k.e(entitlementsUpdateListener, "entitlementsUpdateListener");
        this.internalConfig.setEntitlementsUpdateListener(entitlementsUpdateListener);
    }

    public final void syncPurchases() {
        restore$default(this, RequestTrigger.SyncPurchases, null, 2, null);
    }
}
