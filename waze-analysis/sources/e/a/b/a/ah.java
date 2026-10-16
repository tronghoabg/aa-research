package e.a.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class ah {

    /* renamed from: a, reason: collision with root package name */
    protected final IBinder f46316a;

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f46315c = Logger.getLogger(ah.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final com.waze.uid.activities.a f46314b = new com.waze.uid.activities.a();

    protected ah(IBinder iBinder) {
        this.f46316a = iBinder;
    }

    public static ah b(IBinder iBinder, Executor executor) {
        return iBinder instanceof Binder ? new af(iBinder, executor) : new ag(iBinder);
    }

    public abstract void a(int i2, ak akVar);

    protected final boolean d(int i2, Parcel parcel) {
        try {
            return this.f46316a.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
