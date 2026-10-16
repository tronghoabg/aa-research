package defpackage;

import android.os.SystemClock;
import com.carstream.tech.phone.ActivateActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class i implements y5 {
    public final /* synthetic */ long a;
    public final /* synthetic */ ActivateActivity b;

    public i(ActivateActivity activateActivity, long j) {
        this.b = activateActivity;
        this.a = j;
    }

    @Override // defpackage.y5
    public final void c(z5 z5Var) {
        this.b.main.postDelayed(new h(0, this, z5Var), Math.max(0L, 650 - (SystemClock.uptimeMillis() - this.a)));
    }
}
