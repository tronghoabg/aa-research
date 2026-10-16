package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
public final class sly {
    final /* synthetic */ BasePendingResult a;

    public sly(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        ThreadLocal threadLocal = BasePendingResult.b;
        BasePendingResult.i(this.a.c);
        super.finalize();
    }
}
