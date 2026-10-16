package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((LocationManagerCompat.GpsStatusTransport) this.c).lambda$onGpsStatusChanged$2((Executor) this.d, this.b);
                break;
            case 1:
                ((LocationManagerCompat.LocationListenerTransport) this.c).lambda$onFlushComplete$4((LocationListenerCompat) this.d, this.b);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.c).lambda$onFirstFix$2((Executor) this.d, this.b);
                break;
        }
    }
}
