package x7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;

/* renamed from: x7.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4496h {
    Task getLastLocation();

    Task removeLocationUpdates(l lVar);

    Task requestLocationUpdates(LocationRequest locationRequest, l lVar, Looper looper);
}
