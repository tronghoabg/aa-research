package Va;

import android.view.View;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: Va.w1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1184w1 extends ThreadPoolExecutor implements H9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f14718c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14719d = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Ra f14720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1196x1 f14721b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1184w1(C1196x1 c1196x1, ThreadPoolExecutor threadPoolExecutor, Ra ra2) {
        this.f14721b = c1196x1;
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        super(corePoolSize, maximumPoolSize, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, threadPoolExecutor.getQueue());
        this.f14720a = ra2;
    }

    @Override // Va.H9
    public final Object d() {
        int i5 = f14719d;
        int i10 = i5 + 93;
        f14718c = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = i5 + 19;
            f14718c = i11 % 128;
            if (i11 % 2 == 0) {
                return this;
            }
            throw null;
        }
        int i12 = i5 + 19;
        f14718c = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        throw null;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        String str;
        f14718c = (f14719d + 97) % 128;
        C1196x1 c1196x1 = this.f14721b;
        Ra ra2 = this.f14720a;
        int iResolveSizeAndState = 1 - View.resolveSizeAndState(0, 0, 0);
        char[] charArray = "ꤨ࣡疩ꥼ騄ꉳ傢ᗾ\ue3d1헁ᨶꂖ㱿⽌콼\uef3b皎竬烢㗙茽뗘㩲䁮\udc41༱\uef86輆ᛥ".toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-4926456818211646809L, charArray, iResolveSizeAndState);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i5 = AbstractC1104pb.f14483C;
                    if (i5 >= cArrZ.length) {
                        break;
                    }
                    cArrZ[i5] = (char) ((cArrZ[i5] ^ cArrZ[i5 % 4]) ^ ((i5 - 4) * (-4926456818211646809L)));
                    AbstractC1104pb.f14483C = i5 + 1;
                }
                str = new String(cArrZ, 4, cArrZ.length - 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        c1196x1.B0(this, ra2, str.intern(), runnable);
        super.execute(runnable);
        int i10 = f14718c + 43;
        f14719d = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }
}
