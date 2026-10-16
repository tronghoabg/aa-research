package defpackage;

import android.os.CountDownTimer;
import com.google.android.projection.gearhead.rail.ui.SlidableLinearLayout;

/* loaded from: classes3.dex */
public final class xel extends CountDownTimer {
    final /* synthetic */ SlidableLinearLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xel(SlidableLinearLayout slidableLinearLayout, long j, long j2) {
        super(j, j2);
        this.a = slidableLinearLayout;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        SlidableLinearLayout slidableLinearLayout = this.a;
        slidableLinearLayout.b = true;
        slidableLinearLayout.a.performLongClick();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
