package com.unity3d.ads.adplayer;

import Ef.A;
import Ef.D;
import Ef.E;
import Ef.H;
import Fe.e;
import Hf.C0594d0;
import Hf.InterfaceC0590b0;
import Hf.InterfaceC0592c0;
import Hf.InterfaceC0603m;
import Hf.g0;
import Hf.j0;
import Hf.k0;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.w;
import ff.x;
import java.util.Collection;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;
import lf.AbstractC3464c;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import r7.AbstractC3935e;
import tf.a;
import tf.p;
import tf.q;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J=\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010 J'\u0010*\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0017\u00102\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R8\u0010:\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c090807068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR7\u0010G\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0D8\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lcom/unity3d/ads/adplayer/CommonWebViewBridge;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "LEf/A;", "dispatcher", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "LEf/E;", "adPlayerScope", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(LEf/A;Lcom/unity3d/ads/adplayer/WebViewContainer;LEf/E;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V", "Lcom/unity3d/ads/adplayer/HandlerType;", "handlerType", "Lorg/json/JSONArray;", "arguments", "Lef/C;", "execute", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/Invocation;", "invocation", "", "callbackId", "handleInvocationResult", "(Lcom/unity3d/ads/adplayer/Invocation;Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "status", "", "", "params", "respond", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "event", "sendEvent", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Ljf/c;)Ljava/lang/Object;", "className", "method", "request", "callbackStatus", "rawParameters", "handleCallback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PglCryptUtils.KEY_MESSAGE, "handleInvocation", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/log/Logger;", "scope", "LEf/E;", "getScope", "()LEf/E;", "LHf/c0;", "", "Lef/k;", "LEf/t;", "callbacks", "LHf/c0;", "LHf/b0;", "_onInvocation", "LHf/b0;", "LHf/g0;", "onInvocation", "LHf/g0;", "getOnInvocation", "()LHf/g0;", "", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "exposedFunctions", "Ljava/util/Map;", "getExposedFunctions", "()Ljava/util/Map;", "setExposedFunctions", "(Ljava/util/Map;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommonWebViewBridge implements WebViewBridge {

    @NotNull
    private final InterfaceC0590b0 _onInvocation;

    @NotNull
    private final InterfaceC0592c0 callbacks;

    @NotNull
    private Map<String, ? extends a> exposedFunctions;

    @NotNull
    private final Logger logger;

    @NotNull
    private final g0 onInvocation;

    @NotNull
    private final E scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final WebViewContainer webViewContainer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        int label;

        public AnonymousClass1(InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return CommonWebViewBridge.this.new AnonymousClass1(interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7, reason: invalid class name */
    public static final class AnonymousClass7 extends AbstractC3471j implements p {
        final /* synthetic */ String $callback;
        final /* synthetic */ String $location;
        final /* synthetic */ JSONArray $parameters;
        Object L$0;
        int label;
        final /* synthetic */ CommonWebViewBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, InterfaceC3103c<? super AnonymousClass7> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$location = str;
            this.$parameters = jSONArray;
            this.this$0 = commonWebViewBridge;
            this.$callback = str2;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return new AnonymousClass7(this.$location, this.$parameters, this.this$0, this.$callback, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass7) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r6.handleInvocationResult(r1, r3, r5) == r0) goto L15;
         */
        @Override // lf.AbstractC3462a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                kf.a r0 = kf.a.f39711a
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                Fe.e.U(r6)
                goto L51
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.L$0
                com.unity3d.ads.adplayer.Invocation r1 = (com.unity3d.ads.adplayer.Invocation) r1
                Fe.e.U(r6)
                goto L41
            L20:
                Fe.e.U(r6)
                com.unity3d.ads.adplayer.Invocation r1 = new com.unity3d.ads.adplayer.Invocation
                java.lang.String r6 = r5.$location
                org.json.JSONArray r4 = r5.$parameters
                java.lang.Object[] r4 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r4)
                r1.<init>(r6, r4)
                com.unity3d.ads.adplayer.CommonWebViewBridge r6 = r5.this$0
                Hf.b0 r6 = com.unity3d.ads.adplayer.CommonWebViewBridge.access$get_onInvocation$p(r6)
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L41
                goto L50
            L41:
                com.unity3d.ads.adplayer.CommonWebViewBridge r6 = r5.this$0
                java.lang.String r3 = r5.$callback
                r4 = 0
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = com.unity3d.ads.adplayer.CommonWebViewBridge.access$handleInvocationResult(r6, r1, r3, r5)
                if (r6 != r0) goto L51
            L50:
                return r0
            L51:
                ef.C r6 = ef.C2515C.f34653a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass7.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {150, 158, 160, 164, 166, 181, 186}, m = "handleInvocationResult")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22541 extends AbstractC3464c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C22541(InterfaceC3103c<? super C22541> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonWebViewBridge.this.handleInvocationResult(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends C3338i implements p {
        public AnonymousClass2(Object obj) {
            super(2, obj, CommonWebViewBridge.class, "sendEvent", "sendEvent(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull WebViewEvent webViewEvent, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((CommonWebViewBridge) this.receiver).sendEvent(webViewEvent, interfaceC3103c);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "", "e", "Lef/C;", "<anonymous>", "(LHf/m;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$3", f = "CommonWebViewBridge.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3471j implements q {
        final /* synthetic */ Invocation $invocation;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Invocation invocation, InterfaceC3103c<? super AnonymousClass3> interfaceC3103c) {
            super(3, interfaceC3103c);
            this.$invocation = invocation;
        }

        @Override // tf.q
        @Nullable
        public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @NotNull Throwable th, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            AnonymousClass3 anonymousClass3 = CommonWebViewBridge.this.new AnonymousClass3(this.$invocation, interfaceC3103c);
            anonymousClass3.L$0 = th;
            return anonymousClass3.invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            Throwable th = (Throwable) this.L$0;
            CommonWebViewBridge.this.logger.error("Error delivering flow event", th);
            SendDiagnosticEvent sendDiagnosticEvent = CommonWebViewBridge.this.sendDiagnosticEvent;
            String message = th.getMessage();
            if (message == null) {
                message = th.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, AbstractC2640A.R(new C2527k("reason_debug", message), new C2527k("webview_invocation", this.$invocation.getLocation())), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
            return C2515C.f34653a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {83, 85}, m = "request")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$request$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22551 extends AbstractC3464c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C22551(InterfaceC3103c<? super C22551> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonWebViewBridge.this.request(null, null, null, this);
        }
    }

    public CommonWebViewBridge(@NotNull A dispatcher, @NotNull WebViewContainer webViewContainer, @NotNull E adPlayerScope, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Logger logger) {
        AbstractC3340k.e(dispatcher, "dispatcher");
        AbstractC3340k.e(webViewContainer, "webViewContainer");
        AbstractC3340k.e(adPlayerScope, "adPlayerScope");
        AbstractC3340k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC3340k.e(logger, "logger");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        Kd.a aVarF = H.F(H.F(adPlayerScope, dispatcher), new D("CommonWebViewBridge"));
        this.scope = aVarF;
        this.callbacks = k0.c(x.f35434a);
        j0 j0VarB = k0.b(0, 64, 5);
        this._onInvocation = j0VarB;
        this.onInvocation = new C0594d0(j0VarB);
        this.exposedFunctions = w.f35433a;
        H.D(aVarF, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, JSONArray jSONArray, InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objEvaluateJavascript = this.webViewContainer.evaluateJavascript(handlerType, jSONArray, interfaceC3103c);
        return objEvaluateJavascript == kf.a.f39711a ? objEvaluateJavascript : C2515C.f34653a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142 A[Catch: all -> 0x0155, TryCatch #1 {all -> 0x0155, blocks: (B:70:0x0178, B:72:0x0180, B:58:0x013e, B:60:0x0142, B:65:0x0158, B:67:0x015c, B:74:0x01a1), top: B:98:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0158 A[Catch: all -> 0x0155, TryCatch #1 {all -> 0x0155, blocks: (B:70:0x0178, B:72:0x0180, B:58:0x013e, B:60:0x0142, B:65:0x0158, B:67:0x015c, B:74:0x01a1), top: B:98:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180 A[Catch: all -> 0x0155, TryCatch #1 {all -> 0x0155, blocks: (B:70:0x0178, B:72:0x0180, B:58:0x013e, B:60:0x0142, B:65:0x0158, B:67:0x015c, B:74:0x01a1), top: B:98:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleInvocationResult(com.unity3d.ads.adplayer.Invocation r23, java.lang.String r24, jf.InterfaceC3103c<? super ef.C2515C> r25) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleInvocationResult(com.unity3d.ads.adplayer.Invocation, java.lang.String, jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, InterfaceC3103c<? super C2515C> interfaceC3103c) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object objExecute = execute(HandlerType.CALLBACK, new JSONArray((Collection) AbstractC3935e.C(jSONArray)), interfaceC3103c);
        return objExecute == kf.a.f39711a ? objExecute : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @NotNull
    public Map<String, a> getExposedFunctions() {
        return this.exposedFunctions;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @NotNull
    public g0 getOnInvocation() {
        return this.onInvocation;
    }

    @NotNull
    public final E getScope() {
        return this.scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleCallback(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "callbackId"
            kotlin.jvm.internal.AbstractC3340k.e(r4, r0)
            java.lang.String r0 = "callbackStatus"
            kotlin.jvm.internal.AbstractC3340k.e(r5, r0)
            java.lang.String r0 = "rawParameters"
            kotlin.jvm.internal.AbstractC3340k.e(r6, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r6)
            java.lang.Object[] r6 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r0)
            Hf.c0 r0 = r3.callbacks
            Hf.x0 r0 = (Hf.x0) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            r2 = r1
            ef.k r2 = (ef.C2527k) r2
            java.lang.Object r2 = r2.f34671a
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = kotlin.jvm.internal.AbstractC3340k.a(r2, r4)
            if (r2 == 0) goto L26
            goto L3f
        L3e:
            r1 = 0
        L3f:
            ef.k r1 = (ef.C2527k) r1
            if (r1 != 0) goto L45
            goto Lb5
        L45:
            java.lang.Object r4 = r1.f34672b
            Ef.t r4 = (Ef.InterfaceC0513t) r4
            int r0 = r5.hashCode()
            r2 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r0 == r2) goto L91
            r2 = 2524(0x9dc, float:3.537E-42)
            if (r0 == r2) goto L88
            r2 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r0 == r2) goto L6a
            r2 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r0 == r2) goto L61
            goto L9f
        L61:
            java.lang.String r0 = "error"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L73
            goto L9f
        L6a:
            java.lang.String r0 = "ERROR"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L73
            goto L9f
        L73:
            java.lang.Exception r5 = new java.lang.Exception
            r0 = 0
            r6 = r6[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.AbstractC3340k.c(r6, r0)
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r6)
            Ef.u r4 = (Ef.C0514u) r4
            r4.Y(r5)
            goto L9f
        L88:
            java.lang.String r0 = "OK"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L9a
            goto L9f
        L91:
            java.lang.String r0 = "success"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L9a
            goto L9f
        L9a:
            Ef.u r4 = (Ef.C0514u) r4
            r4.K(r6)
        L9f:
            Hf.c0 r4 = r3.callbacks
        La1:
            r5 = r4
            Hf.x0 r5 = (Hf.x0) r5
            java.lang.Object r6 = r5.getValue()
            r0 = r6
            java.util.Set r0 = (java.util.Set) r0
            java.util.LinkedHashSet r0 = ff.AbstractC2645F.Y(r0, r1)
            boolean r5 = r5.i(r6, r0)
            if (r5 == 0) goto La1
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleCallback(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(@NotNull String message) {
        int i5 = 0;
        AbstractC3340k.e(message, "message");
        try {
            try {
                try {
                    JSONArray jSONArray = new JSONArray(message);
                    int length = jSONArray.length();
                    int i10 = 0;
                    while (i10 < length) {
                        Object obj = jSONArray.get(i10);
                        JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                        if (jSONArray2 == null) {
                            throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + message).toString());
                        }
                        if (jSONArray2.length() != 4) {
                            throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                        }
                        Object obj2 = jSONArray2.get(i5);
                        String str = obj2 instanceof String ? (String) obj2 : null;
                        if (str == null) {
                            throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + message).toString());
                        }
                        Object obj3 = jSONArray2.get(1);
                        String str2 = obj3 instanceof String ? (String) obj3 : null;
                        if (str2 == null) {
                            throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + message).toString());
                        }
                        Object obj4 = jSONArray2.get(2);
                        JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                        if (jSONArray3 == null) {
                            throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + message).toString());
                        }
                        Object obj5 = jSONArray2.get(3);
                        String str3 = obj5 instanceof String ? (String) obj5 : null;
                        if (str3 == null) {
                            throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + message).toString());
                        }
                        String str4 = str + '.' + str2;
                        Logger logger = this.logger;
                        StringBuilder sb2 = new StringBuilder();
                        int i11 = i5;
                        sb2.append("Unity Ads WebView calling for: ");
                        sb2.append(str4);
                        sb2.append('(');
                        sb2.append(jSONArray3);
                        sb2.append(')');
                        logger.debug(sb2.toString());
                        H.D(this.scope, null, new AnonymousClass7(str4, jSONArray3, this, str3, null), 3);
                        i10++;
                        i5 = i11;
                    }
                } catch (Throwable th) {
                    th = th;
                    int i12 = i5;
                    this.logger.error("Error handling invocation from webview (" + message + ')', th);
                    SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                    String message2 = th.getMessage();
                    if (message2 == null) {
                        message2 = th.getClass().getSimpleName();
                    }
                    C2527k c2527k = new C2527k("reason_debug", message2);
                    C2527k c2527k2 = new C2527k("webview_invocation", message);
                    C2527k[] c2527kArr = new C2527k[2];
                    c2527kArr[i12] = c2527k;
                    c2527kArr[1] = c2527k2;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, AbstractC2640A.R(c2527kArr), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
                    throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: ".concat(message), th);
                }
            } catch (JSONException e7) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: ".concat(message), e7);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object request(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.Object[] r13, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super java.lang.Object[]> r14) {
        /*
            r10 = this;
            r0 = 1
            boolean r1 = r14 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge.C22551
            if (r1 == 0) goto L14
            r1 = r14
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r1 = (com.unity3d.ads.adplayer.CommonWebViewBridge.C22551) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.label = r2
            goto L19
        L14:
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r1 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            r1.<init>(r14)
        L19:
            java.lang.Object r14 = r1.result
            kf.a r2 = kf.a.f39711a
            int r3 = r1.label
            r4 = 2
            if (r3 == 0) goto L3a
            if (r3 == r0) goto L32
            if (r3 != r4) goto L2a
            Fe.e.U(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            java.lang.Object r11 = r1.L$0
            Ef.t r11 = (Ef.InterfaceC0513t) r11
            Fe.e.U(r14)
            goto L8b
        L3a:
            Fe.e.U(r14)
            Ef.u r14 = Ef.H.b()
            int r3 = r14.hashCode()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            Hf.c0 r5 = r10.callbacks
        L4b:
            r6 = r5
            Hf.x0 r6 = (Hf.x0) r6
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            java.util.Set r8 = (java.util.Set) r8
            ef.k r9 = new ef.k
            r9.<init>(r3, r14)
            java.util.LinkedHashSet r8 = ff.AbstractC2645F.a0(r8, r9)
            boolean r6 = r6.i(r7, r8)
            if (r6 == 0) goto L4b
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            r5.put(r11)
            r5.put(r12)
            r5.put(r3)
            int r11 = r13.length
            r12 = 0
        L74:
            if (r12 >= r11) goto L7d
            r3 = r13[r12]
            r5.put(r3)
            int r12 = r12 + r0
            goto L74
        L7d:
            com.unity3d.ads.adplayer.HandlerType r11 = com.unity3d.ads.adplayer.HandlerType.INVOCATION
            r1.L$0 = r14
            r1.label = r0
            java.lang.Object r11 = r10.execute(r11, r5, r1)
            if (r11 != r2) goto L8a
            goto L9a
        L8a:
            r11 = r14
        L8b:
            r12 = 0
            r1.L$0 = r12
            r1.label = r4
            Ef.u r11 = (Ef.C0514u) r11
            java.lang.Object r11 = r11.p(r1)
            kf.a r12 = kf.a.f39711a
            if (r11 != r2) goto L9b
        L9a:
            return r2
        L9b:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.request(java.lang.String, java.lang.String, java.lang.Object[], jf.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @Nullable
    public Object sendEvent(@NotNull WebViewEvent webViewEvent, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        Object objExecute = execute(HandlerType.EVENT, jSONArray, interfaceC3103c);
        return objExecute == kf.a.f39711a ? objExecute : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void setExposedFunctions(@NotNull Map<String, ? extends a> map) {
        AbstractC3340k.e(map, "<set-?>");
        this.exposedFunctions = map;
    }
}
