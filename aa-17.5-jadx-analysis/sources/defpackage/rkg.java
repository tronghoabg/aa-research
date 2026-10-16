package defpackage;

import android.graphics.Rect;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public interface rkg extends IInterface {
    void e(CarDisplayId carDisplayId, Rect rect) throws RemoteException;
}
