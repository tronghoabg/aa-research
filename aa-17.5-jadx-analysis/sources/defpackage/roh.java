package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.google.android.gms.car.CarSensorEvent;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
final class roh extends sss {
    final /* synthetic */ roj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roh(roj rojVar, Looper looper) {
        super(looper);
        this.a = rojVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 0) {
            SparseArray sparseArray = this.a.c;
            synchronized (sparseArray) {
                CarSensorEvent carSensorEvent = (CarSensorEvent) message.obj;
                int i = carSensorEvent.b;
                sjg sjgVar = (sjg) sparseArray.get(i);
                if (sjgVar != null) {
                    Iterator it = ((LinkedList) sjgVar.b).iterator();
                    while (it.hasNext()) {
                        ((qse) it.next()).d(i, carSensorEvent.c, carSensorEvent.d, carSensorEvent.e);
                    }
                }
            }
        }
    }
}
