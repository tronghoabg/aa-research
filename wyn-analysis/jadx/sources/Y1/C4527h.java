package y1;

import Va.X7;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: y1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4527h extends tg.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tg.b f47931g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f47932h;

    public C4527h(tg.b bVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f47931g = bVar;
        this.f47932h = threadPoolExecutor;
    }

    @Override // tg.b
    public final void J(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f47932h;
        try {
            this.f47931g.J(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // tg.b
    public final void K(X7 x72) {
        ThreadPoolExecutor threadPoolExecutor = this.f47932h;
        try {
            this.f47931g.K(x72);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
