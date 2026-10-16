package Ge;

import com.qonversion.android.sdk.dto.QUser;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.listeners.QonversionUserCallback;
import ef.C2527k;
import ff.AbstractC2640A;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class o implements QonversionUserCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f4760a;

    public o(u uVar) {
        this.f4760a = uVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
    public final void onError(QonversionError error) {
        AbstractC3340k.e(error, "error");
        this.f4760a.onError(c.l(error));
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
    public final void onSuccess(QUser user) {
        AbstractC3340k.e(user, "user");
        this.f4760a.onSuccess(AbstractC2640A.R(new C2527k("qonversionId", user.getQonversionId()), new C2527k("identityId", user.getIdentityId())));
    }
}
