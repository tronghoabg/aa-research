package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xfl extends android.os.CountDownTimer {
    final /* synthetic */ com.google.android.projection.gearhead.rail.ui.SlidableLinearLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfl(com.google.android.projection.gearhead.rail.ui.SlidableLinearLayout slidableLinearLayout, long j, long j2) {
        super(j, j2);
        this.a = slidableLinearLayout;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        com.google.android.projection.gearhead.rail.ui.SlidableLinearLayout slidableLinearLayout = this.a;
        slidableLinearLayout.b = true;
        slidableLinearLayout.a.performLongClick();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
