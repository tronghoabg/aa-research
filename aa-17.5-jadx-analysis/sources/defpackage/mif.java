package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class mif implements SensorEventListener {
    final /* synthetic */ mig a;
    private final float b;

    public mif(mig migVar, float f) {
        this.a = migVar;
        this.b = f;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        float f = sensorEvent.values[0];
        if (f >= BitmapDescriptorFactory.HUE_RED && f < this.b) {
            z = true;
        }
        mig migVar = this.a;
        int i = true != z ? 3 : 2;
        if (i == migVar.f) {
            return;
        }
        migVar.f = i;
        Iterator it = migVar.e.iterator();
        while (it.hasNext()) {
            mig.d((ykd) it.next(), migVar.f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
