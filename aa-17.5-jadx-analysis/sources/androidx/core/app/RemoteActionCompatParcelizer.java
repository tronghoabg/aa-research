package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.fhw;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(fhw fhwVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) fhwVar.t(remoteActionCompat.a);
        remoteActionCompat.b = fhwVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = fhwVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) fhwVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = fhwVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = fhwVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, fhw fhwVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        fhwVar.u(remoteActionCompat.a);
        fhwVar.g(remoteActionCompat.b, 2);
        fhwVar.g(remoteActionCompat.c, 3);
        fhwVar.i(remoteActionCompat.d, 4);
        fhwVar.f(remoteActionCompat.e, 5);
        fhwVar.f(remoteActionCompat.f, 6);
    }
}
