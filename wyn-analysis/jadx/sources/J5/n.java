package J5;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public long f5655a;

    public n(int i5) {
        switch (i5) {
            case 3:
                this.f5655a = Long.MIN_VALUE;
                break;
            default:
                this.f5655a = SystemClock.elapsedRealtime();
                break;
        }
    }

    public N1.r a() {
        return new N1.r(this);
    }

    public boolean b() {
        return SystemClock.elapsedRealtime() - this.f5655a > 3000;
    }
}
