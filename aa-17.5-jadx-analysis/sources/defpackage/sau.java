package defpackage;

import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class sau implements Closeable {
    private final Closeable a;
    private final int b;
    private final AtomicBoolean c;

    public sau(Closeable closeable, AtomicBoolean atomicBoolean, int i) {
        this.a = closeable;
        this.b = i;
        this.c = atomicBoolean;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        yop yopVarAi = CarSetupServiceImpl.a.l().ai(8621);
        Closeable closeable = this.a;
        yopVarAi.y("Closing fd: %s", closeable);
        closeable.close();
        if (this.b == 1) {
            this.c.set(false);
        }
    }
}
