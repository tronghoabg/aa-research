package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((LocationManagerCompat.GpsStatusTransport) this.b).lambda$onGpsStatusChanged$0((Executor) this.c);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.b).lambda$onGpsStatusChanged$1((Executor) this.c);
                break;
            default:
                ((Consumer) this.b).accept((Location) this.c);
                break;
        }
    }
}
