package e.a.b.a;

import android.os.IBinder;
import android.os.Parcel;
import e.a.d.jj;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class af extends ah {

    /* renamed from: c, reason: collision with root package name */
    private final jj f46313c;

    af(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.f46313c = new jj(executor);
    }

    @Override // e.a.b.a.ah
    public final void a(final int i2, ak akVar) {
        final Parcel parcelA = akVar.a();
        this.f46313c.execute(new Runnable() { // from class: e.a.b.a.ae
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (this.f46310a.d(i2, parcelA)) {
                        return;
                    }
                    ah.f46315c.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
                } catch (Exception e2) {
                    ah.f46315c.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", (Throwable) e2);
                }
            }
        });
        akVar.b();
    }
}
