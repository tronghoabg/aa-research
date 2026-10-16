package e.a.b.a;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46305a = Logger.getLogger(ab.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private aa f46306b;

    public ab(aa aaVar) {
        this.f46306b = aaVar;
    }

    public final aa a() {
        return this.f46306b;
    }

    public final void b() {
        this.f46306b = null;
    }

    public final void c(aa aaVar) {
        this.f46306b = aaVar;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        aa aaVar = this.f46306b;
        if (aaVar != null) {
            try {
                if ((i3 & 1) != 0) {
                    return aaVar.a(i2, parcel);
                }
                f46305a.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", "ignoring non-oneway transaction. flags=" + i3);
                return false;
            } catch (RuntimeException e2) {
                f46305a.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", "failure sending transaction " + i2, (Throwable) e2);
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.f46306b != null;
    }
}
