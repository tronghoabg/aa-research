package D9;

import android.os.CountDownTimer;

/* loaded from: classes4.dex */
public final class l extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f2590a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j8, m mVar) {
        super(j8, 1000L);
        this.f2590a = mVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f2590a.e();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j8) {
    }
}
