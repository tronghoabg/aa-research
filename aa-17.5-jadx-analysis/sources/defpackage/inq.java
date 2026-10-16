package defpackage;

import com.google.android.gms.car.display.CarRegionId;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public final class inq implements Runnable {
    inz b;
    int c;
    public CarRegionId d;
    public final /* synthetic */ inr g;
    private final boolean h;
    final AtomicIntegerArray a = new AtomicIntegerArray(10);
    volatile int e = 0;
    volatile String f = "";

    public inq(inr inrVar, inz inzVar, int i, CarRegionId carRegionId, boolean z) {
        this.g = inrVar;
        this.b = inzVar;
        this.c = i;
        this.d = carRegionId;
        this.h = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.inq.run():void");
    }
}
