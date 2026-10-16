package defpackage;

import android.os.Handler;
import com.google.android.gms.car.CarSensorEvent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class roi extends qyj {
    private final WeakReference a;

    public roi(roj rojVar) {
        this.a = new WeakReference(rojVar);
    }

    @Override // defpackage.qyk
    public final void b(CarSensorEvent carSensorEvent) {
        roj rojVar = (roj) this.a.get();
        if (rojVar != null) {
            Handler handler = rojVar.d;
            handler.sendMessage(handler.obtainMessage(0, carSensorEvent));
        }
    }
}
