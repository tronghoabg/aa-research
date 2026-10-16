package com.unity3d.ads.core.data.repository;

import A7.V;
import Ef.A;
import Ef.E;
import Ef.H;
import Fe.e;
import Hf.InterfaceC0592c0;
import Hf.k0;
import Hf.x0;
import Ma.b;
import Ma.d;
import Ma.f;
import Ma.i;
import Ma.j;
import Oa.c;
import Oa.g;
import Oa.h;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import ff.AbstractC2645F;
import ff.w;
import ff.x;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010 \u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020$2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u001c\u0010.\u001a\n -*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\n01008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020205008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020$008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u0014\u00109\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0016R$\u0010;\u001a\u00020$2\u0006\u0010:\u001a\u00020$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidOpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "LEf/A;", "mainDispatcher", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "omidManager", "<init>", "(LEf/A;Lcom/unity3d/ads/core/data/manager/OmidManager;)V", "Lcom/google/protobuf/ByteString;", "opportunityId", "LMa/b;", "adSession", "Lef/C;", "addSession", "(Lcom/google/protobuf/ByteString;LMa/b;)V", "sessionFinished", "(Lcom/google/protobuf/ByteString;)V", "removeSession", "getSession", "(Lcom/google/protobuf/ByteString;)LMa/b;", "Lcom/unity3d/ads/core/data/model/OMData;", "buildOmData", "()Lcom/unity3d/ads/core/data/model/OMData;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/model/OMResult;", "activateOM", "(Landroid/content/Context;Ljf/c;)Ljava/lang/Object;", "Landroid/webkit/WebView;", "webView", "Lcom/unity3d/ads/core/data/model/OmidOptions;", "options", "startSession", "(Lcom/google/protobuf/ByteString;Landroid/webkit/WebView;Lcom/unity3d/ads/core/data/model/OmidOptions;Ljf/c;)Ljava/lang/Object;", "finishSession", "(Lcom/google/protobuf/ByteString;Ljf/c;)Ljava/lang/Object;", "", "signalLoaded", "impressionOccurred", "(Lcom/google/protobuf/ByteString;ZLjf/c;)Ljava/lang/Object;", "hasSessionFinished", "(Lcom/google/protobuf/ByteString;)Z", "LEf/A;", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "LMa/i;", "kotlin.jvm.PlatformType", "partner", "LMa/i;", "LHf/c0;", "", "", "activeSessions", "LHf/c0;", "", "finishedSessions", "_isOMActive", "getOmData", "omData", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "isOMActive", "()Z", "setOMActive", "(Z)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {

    @NotNull
    private final InterfaceC0592c0 _isOMActive;

    @NotNull
    private final InterfaceC0592c0 activeSessions;

    @NotNull
    private final InterfaceC0592c0 finishedSessions;

    @NotNull
    private final A mainDispatcher;

    @NotNull
    private final OmidManager omidManager;
    private final i partner;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lcom/unity3d/ads/core/data/model/OMResult;", "<anonymous>", "(LEf/E;)Lcom/unity3d/ads/core/data/model/OMResult;"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$context = context;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidOpenMeasurementRepository.this.new AnonymousClass2(this.$context, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super OMResult> interfaceC3103c) {
            return ((AnonymousClass2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            if (AndroidOpenMeasurementRepository.this.isOMActive()) {
                return new OMResult.Failure("om_already_active", null, 2, null);
            }
            try {
                AndroidOpenMeasurementRepository.this.omidManager.activate(this.$context);
                AndroidOpenMeasurementRepository androidOpenMeasurementRepository = AndroidOpenMeasurementRepository.this;
                androidOpenMeasurementRepository.setOMActive(androidOpenMeasurementRepository.omidManager.isActive());
                return AndroidOpenMeasurementRepository.this.isOMActive() ? OMResult.Success.INSTANCE : new OMResult.Failure("om_activate_failure_time", null, 2, null);
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lcom/unity3d/ads/core/data/model/OMResult;", "<anonymous>", "(LEf/E;)Lcom/unity3d/ads/core/data/model/OMResult;"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22942 extends AbstractC3471j implements p {
        final /* synthetic */ ByteString $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22942(ByteString byteString, InterfaceC3103c<? super C22942> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$opportunityId = byteString;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidOpenMeasurementRepository.this.new C22942(this.$opportunityId, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super OMResult> interfaceC3103c) {
            return ((C22942) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            if (!AndroidOpenMeasurementRepository.this.isOMActive()) {
                return new OMResult.Failure("om_not_active", null, 2, null);
            }
            b session = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
            if (session == null) {
                return new OMResult.Failure("om_session_not_found", null, 2, null);
            }
            j jVar = (j) session;
            if (!jVar.f7612g) {
                jVar.f7609d.clear();
                if (!jVar.f7612g) {
                    jVar.f7608c.clear();
                }
                jVar.f7612g = true;
                Qa.a aVar2 = jVar.f7610e;
                g.f8938a.a(aVar2.e(), "finishSession", aVar2.f9929a);
                c cVar = c.f8930c;
                boolean z2 = cVar.f8932b.size() > 0;
                cVar.f8931a.remove(jVar);
                ArrayList arrayList = cVar.f8932b;
                arrayList.remove(jVar);
                if (z2 && arrayList.size() <= 0) {
                    h hVarB = h.b();
                    hVarB.getClass();
                    Sa.a aVar3 = Sa.a.f11037g;
                    aVar3.getClass();
                    Handler handler = Sa.a.f11039i;
                    if (handler != null) {
                        handler.removeCallbacks(Sa.a.k);
                        Sa.a.f11039i = null;
                    }
                    aVar3.f11041a.clear();
                    Sa.a.f11038h.post(new V(aVar3, 18));
                    Oa.b bVar = Oa.b.f8929d;
                    bVar.f8933a = false;
                    bVar.f8935c = null;
                    Na.a aVar4 = hVarB.f8942c;
                    aVar4.f8634a.getContentResolver().unregisterContentObserver(aVar4);
                }
                jVar.f7610e.d();
                jVar.f7610e = null;
            }
            AndroidOpenMeasurementRepository.this.sessionFinished(this.$opportunityId);
            return OMResult.Success.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lcom/unity3d/ads/core/data/model/OMResult;", "<anonymous>", "(LEf/E;)Lcom/unity3d/ads/core/data/model/OMResult;"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22952 extends AbstractC3471j implements p {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ boolean $signalLoaded;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22952(ByteString byteString, boolean z2, InterfaceC3103c<? super C22952> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$opportunityId = byteString;
            this.$signalLoaded = z2;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidOpenMeasurementRepository.this.new C22952(this.$opportunityId, this.$signalLoaded, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super OMResult> interfaceC3103c) {
            return ((C22952) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            b session = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
            if (session == null) {
                return new OMResult.Failure("om_session_not_found", null, 2, null);
            }
            Ma.a aVarCreateAdEvents = AndroidOpenMeasurementRepository.this.omidManager.createAdEvents(session);
            boolean z2 = this.$signalLoaded;
            g gVar = g.f8938a;
            Ma.h hVar = Ma.h.NATIVE;
            if (z2) {
                j jVar = aVarCreateAdEvents.f7567a;
                if (!jVar.f7611f) {
                    throw new IllegalStateException("AdSession is not started");
                }
                if (jVar.f7612g) {
                    throw new IllegalStateException("AdSession is finished");
                }
                if (hVar != jVar.f7607b.f7568a) {
                    throw new IllegalStateException("Impression event is not expected from the Native AdSession");
                }
                if (jVar.f7615j) {
                    throw new IllegalStateException("Loaded event can only be sent once");
                }
                Qa.a aVar2 = jVar.f7610e;
                gVar.a(aVar2.e(), "publishLoadedEvent", null, aVar2.f9929a);
                jVar.f7615j = true;
            }
            j jVar2 = aVarCreateAdEvents.f7567a;
            boolean z10 = jVar2.f7612g;
            if (z10) {
                throw new IllegalStateException("AdSession is finished");
            }
            if (hVar != jVar2.f7607b.f7568a) {
                throw new IllegalStateException("Impression event is not expected from the Native AdSession");
            }
            if (!jVar2.f7611f || z10) {
                try {
                    jVar2.b();
                } catch (Exception unused) {
                }
            }
            if (jVar2.f7611f && !jVar2.f7612g) {
                if (jVar2.f7614i) {
                    throw new IllegalStateException("Impression event can only be sent once");
                }
                Qa.a aVar3 = jVar2.f7610e;
                gVar.a(aVar3.e(), "publishImpressionEvent", aVar3.f9929a);
                jVar2.f7614i = true;
            }
            return OMResult.Success.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lcom/unity3d/ads/core/data/model/OMResult;", "<anonymous>", "(LEf/E;)Lcom/unity3d/ads/core/data/model/OMResult;"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22962 extends AbstractC3471j implements p {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ OmidOptions $options;
        final /* synthetic */ WebView $webView;
        int label;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[f.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[3] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22962(ByteString byteString, OmidOptions omidOptions, WebView webView, InterfaceC3103c<? super C22962> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$opportunityId = byteString;
            this.$options = omidOptions;
            this.$webView = webView;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidOpenMeasurementRepository.this.new C22962(this.$opportunityId, this.$options, this.$webView, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super OMResult> interfaceC3103c) {
            return ((C22962) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            d dVarCreateHtmlAdSessionContext;
            a aVar = a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            try {
                if (!AndroidOpenMeasurementRepository.this.isOMActive()) {
                    return new OMResult.Failure("om_not_active", null, 2, null);
                }
                if (((Map) ((x0) AndroidOpenMeasurementRepository.this.activeSessions).getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                    return new OMResult.Failure("om_session_already_exists", null, 2, null);
                }
                f creativeType = this.$options.getCreativeType();
                if (creativeType == null) {
                    return new OMResult.Failure("om_creative_type_null", null, 2, null);
                }
                OmidManager omidManager = AndroidOpenMeasurementRepository.this.omidManager;
                Ma.g impressionType = this.$options.getImpressionType();
                if (impressionType == null) {
                    impressionType = Ma.g.DEFINED_BY_JAVASCRIPT;
                }
                Ma.g gVar = impressionType;
                Ma.h impressionOwner = this.$options.getImpressionOwner();
                Ma.h hVar = Ma.h.JAVASCRIPT;
                if (impressionOwner == null) {
                    impressionOwner = hVar;
                }
                Ma.h videoEventsOwner = this.$options.getVideoEventsOwner();
                if (videoEventsOwner == null) {
                    videoEventsOwner = hVar;
                }
                Ma.c cVarCreateAdSessionConfiguration = omidManager.createAdSessionConfiguration(creativeType, gVar, impressionOwner, videoEventsOwner, this.$options.getIsolateVerificationScripts());
                int iOrdinal = creativeType.ordinal();
                if (iOrdinal == 1) {
                    dVarCreateHtmlAdSessionContext = AndroidOpenMeasurementRepository.this.omidManager.createHtmlAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                } else {
                    if (iOrdinal != 3) {
                        return new OMResult.Failure("om_creative_type_invalid", null, 2, null);
                    }
                    dVarCreateHtmlAdSessionContext = AndroidOpenMeasurementRepository.this.omidManager.createJavaScriptAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                }
                b bVarCreateAdSession = AndroidOpenMeasurementRepository.this.omidManager.createAdSession(cVarCreateAdSessionConfiguration, dVarCreateHtmlAdSessionContext);
                bVarCreateAdSession.a(this.$webView);
                bVarCreateAdSession.b();
                AndroidOpenMeasurementRepository.this.addSession(this.$opportunityId, bVarCreateAdSession);
                return OMResult.Success.INSTANCE;
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }
    }

    public AndroidOpenMeasurementRepository(@NotNull A mainDispatcher, @NotNull OmidManager omidManager) {
        AbstractC3340k.e(mainDispatcher, "mainDispatcher");
        AbstractC3340k.e(omidManager, "omidManager");
        this.mainDispatcher = mainDispatcher;
        this.omidManager = omidManager;
        if (TextUtils.isEmpty(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty("4.18.0")) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        this.partner = new i();
        this.activeSessions = k0.c(w.f35433a);
        this.finishedSessions = k0.c(x.f35434a);
        this._isOMActive = k0.c(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(ByteString opportunityId, b adSession) {
        x0 x0Var;
        Object value;
        InterfaceC0592c0 interfaceC0592c0 = this.activeSessions;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
        } while (!x0Var.i(value, AbstractC2640A.U((Map) value, new C2527k(opportunityId.toStringUtf8(), adSession))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b getSession(ByteString opportunityId) {
        return (b) ((Map) ((x0) this.activeSessions).getValue()).get(opportunityId.toStringUtf8());
    }

    private final void removeSession(ByteString opportunityId) {
        x0 x0Var;
        Object value;
        Map mapA0;
        InterfaceC0592c0 interfaceC0592c0 = this.activeSessions;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            Map map = (Map) value;
            Object stringUtf8 = opportunityId.toStringUtf8();
            AbstractC3340k.d(stringUtf8, "opportunityId.toStringUtf8()");
            AbstractC3340k.e(map, "<this>");
            mapA0 = AbstractC2640A.a0(map);
            mapA0.remove(stringUtf8);
            int size = mapA0.size();
            if (size == 0) {
                mapA0 = w.f35433a;
            } else if (size == 1) {
                mapA0 = AbstractC2641B.N(mapA0);
            }
        } while (!x0Var.i(value, mapA0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(ByteString opportunityId) {
        x0 x0Var;
        Object value;
        String stringUtf8;
        InterfaceC0592c0 interfaceC0592c0 = this.finishedSessions;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            stringUtf8 = opportunityId.toStringUtf8();
            AbstractC3340k.d(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!x0Var.i(value, AbstractC2645F.a0((Set) value, stringUtf8)));
        removeSession(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @Nullable
    public Object activateOM(@NotNull Context context, @NotNull InterfaceC3103c<? super OMResult> interfaceC3103c) {
        return H.P(this.mainDispatcher, new AnonymousClass2(context, null), interfaceC3103c);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @Nullable
    public Object finishSession(@NotNull ByteString byteString, @NotNull InterfaceC3103c<? super OMResult> interfaceC3103c) {
        return H.P(this.mainDispatcher, new C22942(byteString, null), interfaceC3103c);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @NotNull
    public OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(@NotNull ByteString opportunityId) {
        AbstractC3340k.e(opportunityId, "opportunityId");
        return ((Set) ((x0) this.finishedSessions).getValue()).contains(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @Nullable
    public Object impressionOccurred(@NotNull ByteString byteString, boolean z2, @NotNull InterfaceC3103c<? super OMResult> interfaceC3103c) {
        return H.P(this.mainDispatcher, new C22952(byteString, z2, null), interfaceC3103c);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return ((Boolean) ((x0) this._isOMActive).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z2) {
        x0 x0Var;
        Object value;
        InterfaceC0592c0 interfaceC0592c0 = this._isOMActive;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            ((Boolean) value).getClass();
        } while (!x0Var.i(value, Boolean.valueOf(z2)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @Nullable
    public Object startSession(@NotNull ByteString byteString, @Nullable WebView webView, @NotNull OmidOptions omidOptions, @NotNull InterfaceC3103c<? super OMResult> interfaceC3103c) {
        return H.P(this.mainDispatcher, new C22962(byteString, omidOptions, webView, null), interfaceC3103c);
    }
}
