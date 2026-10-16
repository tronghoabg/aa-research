package kf;

import Ef.C0507p0;
import io.ktor.utils.io.L;
import io.ktor.utils.io.N;
import kotlin.jvm.internal.K;
import lf.AbstractC3469h;

/* loaded from: classes5.dex */
public final class b extends AbstractC3469h {

    /* renamed from: a, reason: collision with root package name */
    public int f39715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0507p0 f39716b;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(C0507p0 c0507p0) {
        L l10 = N.f37363a;
        this.f39716b = c0507p0;
        super(l10);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f39715a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f39715a = 2;
            Fe.e.U(obj);
            return obj;
        }
        this.f39715a = 1;
        Fe.e.U(obj);
        C0507p0 c0507p0 = this.f39716b;
        K.e(1, c0507p0);
        return c0507p0.invoke(this);
    }
}
