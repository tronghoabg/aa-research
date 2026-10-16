package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(defpackage.fic ficVar) {
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat();
        remoteActionCompat.a = (androidx.core.graphics.drawable.IconCompat) ficVar.t(remoteActionCompat.a);
        remoteActionCompat.b = ficVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = ficVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (android.app.PendingIntent) ficVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = ficVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = ficVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, defpackage.fic ficVar) {
        ficVar.u(remoteActionCompat.a);
        ficVar.g(remoteActionCompat.b, 2);
        ficVar.g(remoteActionCompat.c, 3);
        ficVar.i(remoteActionCompat.d, 4);
        ficVar.f(remoteActionCompat.e, 5);
        ficVar.f(remoteActionCompat.f, 6);
    }
}
