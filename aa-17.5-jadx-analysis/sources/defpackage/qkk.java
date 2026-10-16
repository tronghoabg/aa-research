package defpackage;

import android.os.Handler;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public abstract class qkk implements qkj {
    private final Handler a = new Handler();
    public moa g;
    public final Runnable h;

    public qkk(ykd ykdVar) {
        this.h = new qfa((Object) this, (Object) ykdVar, 16, (byte[]) null);
    }

    protected abstract nur a(moa moaVar);

    @Override // defpackage.qkj
    public void c() {
        this.g = null;
        this.a.removeCallbacks(this.h);
    }

    @Override // defpackage.qkj
    public final moa d() {
        return this.g;
    }

    @Override // defpackage.qkj
    @ResultIgnorabilityUnspecified
    public final nur e(moa moaVar) {
        this.g = moaVar;
        return a(moaVar);
    }

    protected final void f() {
        Handler handler = this.a;
        Runnable runnable = this.h;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }
}
