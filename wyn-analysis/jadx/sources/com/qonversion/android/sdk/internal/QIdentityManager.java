package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/qonversion/android/sdk/internal/QIdentityManager;", "", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "repository", "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "userInfoService", "<init>", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;)V", "", "userID", "Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;", "callback", "Lef/C;", "identify", "(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V", "", "logoutIfNeeded", "()Z", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "getCurrentPartnersIdentityId", "()Ljava/lang/String;", "currentPartnersIdentityId", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QIdentityManager {

    @NotNull
    private final QRepository repository;

    @NotNull
    private final QUserInfoService userInfoService;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "resultUserID", "Lef/C;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QIdentityManager$identify$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ IdentityManagerCallback $callback;
        final /* synthetic */ String $userID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, IdentityManagerCallback identityManagerCallback) {
            super(1);
            this.$userID = str;
            this.$callback = identityManagerCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull String resultUserID) {
            AbstractC3340k.e(resultUserID, "resultUserID");
            QIdentityManager.this.userInfoService.storePartnersIdentityId(this.$userID);
            if (resultUserID.length() > 0) {
                QIdentityManager.this.userInfoService.storeQonversionUserId(resultUserID);
            }
            this.$callback.onSuccess(resultUserID);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QIdentityManager$identify$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        final /* synthetic */ IdentityManagerCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IdentityManagerCallback identityManagerCallback) {
            super(1);
            this.$callback = identityManagerCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QonversionError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QonversionError it) {
            AbstractC3340k.e(it, "it");
            this.$callback.onError(it);
        }
    }

    public QIdentityManager(@NotNull QRepository repository, @NotNull QUserInfoService userInfoService) {
        AbstractC3340k.e(repository, "repository");
        AbstractC3340k.e(userInfoService, "userInfoService");
        this.repository = repository;
        this.userInfoService = userInfoService;
    }

    @Nullable
    public final String getCurrentPartnersIdentityId() {
        return this.userInfoService.getPartnersIdentityId();
    }

    public final void identify(@NotNull String userID, @NotNull IdentityManagerCallback callback) {
        AbstractC3340k.e(userID, "userID");
        AbstractC3340k.e(callback, "callback");
        this.repository.identify(userID, this.userInfoService.obtainUserID(), new AnonymousClass1(userID, callback), new AnonymousClass2(callback));
    }

    public final boolean logoutIfNeeded() {
        return this.userInfoService.logoutIfNeeded();
    }
}
