package defpackage;

import com.google.android.gms.car.CarNavigationStatusManager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class g2 implements CarNavigationStatusManager.CarNavigationStatusListener {
    public final /* synthetic */ j2 a;

    public g2(j2 j2Var) {
        this.a = j2Var;
    }

    @Override // com.google.android.gms.car.CarNavigationStatusManager.CarNavigationStatusListener
    public final void onStop() {
        this.a.b.post(new f(this, 11));
    }

    @Override // com.google.android.gms.car.CarNavigationStatusManager.CarNavigationStatusListener
    public final void onStart(int i, int i2, int i3, int i4, int i5) {
    }
}
