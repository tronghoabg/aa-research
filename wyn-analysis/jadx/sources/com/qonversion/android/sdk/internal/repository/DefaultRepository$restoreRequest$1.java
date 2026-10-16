package com.qonversion.android.sdk.internal.repository;

import com.google.android.gms.internal.consent_sdk.a;
import com.qonversion.android.sdk.internal.CallBackKt;
import com.qonversion.android.sdk.internal.ErrorsKt;
import com.qonversion.android.sdk.internal.dto.BaseResponse;
import com.qonversion.android.sdk.internal.dto.QLaunchResult;
import com.qonversion.android.sdk.listeners.QonversionLaunchCallback;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;
import zg.Q;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DefaultRepository$restoreRequest$1 extends AbstractC3343n implements l {
    final /* synthetic */ QonversionLaunchCallback $callback;
    final /* synthetic */ DefaultRepository this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg/Q;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$restoreRequest$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionLaunchCallback $callback;
        final /* synthetic */ DefaultRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultRepository defaultRepository, QonversionLaunchCallback qonversionLaunchCallback) {
            super(1);
            this.this$0 = defaultRepository;
            this.$callback = qonversionLaunchCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Q<BaseResponse<QLaunchResult>>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull Q<BaseResponse<QLaunchResult>> it) {
            AbstractC3340k.e(it, "it");
            a.z("restoreRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
            this.this$0.handlePermissionsResponse(it, this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$restoreRequest$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionLaunchCallback $callback;
        final /* synthetic */ DefaultRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DefaultRepository defaultRepository, QonversionLaunchCallback qonversionLaunchCallback) {
            super(1);
            this.this$0 = defaultRepository;
            this.$callback = qonversionLaunchCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull Throwable it) {
            AbstractC3340k.e(it, "it");
            this.this$0.logger.error("restoreRequest - failure - " + ErrorsKt.toQonversionError(it));
            this.$callback.onError(ErrorsKt.toQonversionError(it));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultRepository$restoreRequest$1(DefaultRepository defaultRepository, QonversionLaunchCallback qonversionLaunchCallback) {
        super(1);
        this.this$0 = defaultRepository;
        this.$callback = qonversionLaunchCallback;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CallBackKt<BaseResponse<QLaunchResult>>) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@NotNull CallBackKt<BaseResponse<QLaunchResult>> enqueue) {
        AbstractC3340k.e(enqueue, "$this$enqueue");
        enqueue.setOnResponse(new AnonymousClass1(this.this$0, this.$callback));
        enqueue.setOnFailure(new AnonymousClass2(this.this$0, this.$callback));
    }
}
