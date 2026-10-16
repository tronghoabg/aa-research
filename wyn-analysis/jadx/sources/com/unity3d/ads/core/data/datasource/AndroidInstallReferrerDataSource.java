package com.unity3d.ads.core.data.datasource;

import A6.h;
import Ef.C0502n;
import Ef.E;
import Ef.InterfaceC0498l;
import Fe.e;
import android.content.Context;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import ef.C2515C;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.InstallReferrerKt;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidInstallReferrerDataSource;", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "Landroid/content/Context;", "appContext", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "LEf/l;", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "continuation", "Lef/C;", "onError", "(LEf/l;)V", "invoke", "(Ljf/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidInstallReferrerDataSource implements InstallReferrerDataSource {
    private static final long TIME_OUT_MS = 500;

    @NotNull
    private final Context appContext;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource", f = "AndroidInstallReferrerDataSource.kt", l = {32}, m = "invoke")
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3464c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidInstallReferrerDataSource.this.invoke(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "<anonymous>", "(LEf/E;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2", f = "AndroidInstallReferrerDataSource.kt", l = {95}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        Object L$0;
        int label;

        public AnonymousClass2(InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidInstallReferrerDataSource.this.new AnonymousClass2(interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super InitializationRequestOuterClass.InstallReferrer> interfaceC3103c) {
            return ((AnonymousClass2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
                return obj;
            }
            e.U(obj);
            final AndroidInstallReferrerDataSource androidInstallReferrerDataSource = AndroidInstallReferrerDataSource.this;
            this.L$0 = androidInstallReferrerDataSource;
            this.label = 1;
            final C0502n c0502n = new C0502n(1, h.A(this));
            c0502n.t();
            try {
                final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(androidInstallReferrerDataSource.appContext).build();
                installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1
                    public void onInstallReferrerServiceDisconnected() {
                        androidInstallReferrerDataSource.onError(c0502n);
                    }

                    public void onInstallReferrerSetupFinished(int responseCode) {
                        try {
                            try {
                                if (responseCode == 0) {
                                    try {
                                        ReferrerDetails installReferrer = installReferrerClientBuild.getInstallReferrer();
                                        if (c0502n.isActive()) {
                                            InterfaceC0498l interfaceC0498l = c0502n;
                                            InstallReferrerKt.Dsl.Companion companion = InstallReferrerKt.Dsl.INSTANCE;
                                            InitializationRequestOuterClass.InstallReferrer.Builder builderNewBuilder = InitializationRequestOuterClass.InstallReferrer.newBuilder();
                                            AbstractC3340k.d(builderNewBuilder, "newBuilder()");
                                            InstallReferrerKt.Dsl dsl_create = companion._create(builderNewBuilder);
                                            String installReferrer2 = installReferrer.getInstallReferrer();
                                            if (installReferrer2 != null) {
                                                dsl_create.setUrl(installReferrer2);
                                            }
                                            dsl_create.setClickTime(installReferrer.getReferrerClickTimestampSeconds());
                                            dsl_create.setInstallTime(installReferrer.getInstallBeginTimestampServerSeconds());
                                            dsl_create.setInstantExperienceLunch(installReferrer.getGooglePlayInstantParam());
                                            interfaceC0498l.n(dsl_create._build(), AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$2.INSTANCE);
                                        }
                                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidInstallReferrerDataSource.sendDiagnosticEvent, "install_referral_fetch_completed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
                                    } catch (RemoteException unused) {
                                        androidInstallReferrerDataSource.onError(c0502n);
                                    }
                                } else {
                                    androidInstallReferrerDataSource.onError(c0502n);
                                }
                            } catch (Throwable unused2) {
                                androidInstallReferrerDataSource.onError(c0502n);
                            }
                            try {
                                installReferrerClientBuild.endConnection();
                            } catch (Throwable unused3) {
                            }
                        } finally {
                        }
                    }
                });
            } catch (Throwable unused) {
                androidInstallReferrerDataSource.onError(c0502n);
            }
            Object objS = c0502n.s();
            kf.a aVar2 = kf.a.f39711a;
            return objS == aVar ? aVar : objS;
        }
    }

    public AndroidInstallReferrerDataSource(@NotNull Context appContext, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC3340k.e(appContext, "appContext");
        AbstractC3340k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.appContext = appContext;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(InterfaceC0498l continuation) {
        if (continuation.isActive()) {
            continuation.resumeWith(null);
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "install_referral_fetch_failed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.datasource.InstallReferrerDataSource
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super gatewayprotocol.v1.InitializationRequestOuterClass.InstallReferrer> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource r0 = (com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource) r0
            Fe.e.U(r14)     // Catch: Ef.L0 -> L4e
            goto L4a
        L2c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L34:
            Fe.e.U(r14)
            com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2 r14 = new com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2     // Catch: Ef.L0 -> L4d
            r14.<init>(r3)     // Catch: Ef.L0 -> L4d
            r0.L$0 = r13     // Catch: Ef.L0 -> L4d
            r0.label = r4     // Catch: Ef.L0 -> L4d
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r14 = Ef.H.Q(r4, r14, r0)     // Catch: Ef.L0 -> L4d
            if (r14 != r1) goto L49
            return r1
        L49:
            r0 = r13
        L4a:
            gatewayprotocol.v1.InitializationRequestOuterClass$InstallReferrer r14 = (gatewayprotocol.v1.InitializationRequestOuterClass.InstallReferrer) r14     // Catch: Ef.L0 -> L4e
            return r14
        L4d:
            r0 = r13
        L4e:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = r0.sendDiagnosticEvent
            r9 = 0
            r10 = 0
            java.lang.String r5 = "install_referral_fetch_timed_out"
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 62
            r12 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource.invoke(jf.c):java.lang.Object");
    }
}
