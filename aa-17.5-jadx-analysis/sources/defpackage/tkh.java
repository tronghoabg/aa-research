package defpackage;

import com.google.android.libraries.auto.template.icons.proxy.ProxyContentProvider;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class tkh extends afcg implements CoroutineExceptionHandler {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkh(bwi bwiVar, int i, byte[] bArr) {
        super(bwiVar);
        this.a = i;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(afco afcoVar, Throwable th) {
        if (this.a != 0) {
            return;
        }
        ((ynz) ((ynz) ProxyContentProvider.a.h()).p(th).ai(9079)).u("Problem creating icon bitmap");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkh(bwi bwiVar, int i) {
        super(bwiVar);
        this.a = i;
    }
}
