package defpackage;

import android.os.CountDownTimer;

/* loaded from: classes3.dex */
public final class whs extends CountDownTimer {
    final /* synthetic */ abxk a;
    final /* synthetic */ wht b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whs(wht whtVar, long j, abxk abxkVar) {
        super(j, 100L);
        this.a = abxkVar;
        this.b = whtVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        wht whtVar = this.b;
        whtVar.e.b(whtVar.a(this.a));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
