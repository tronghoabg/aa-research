package defpackage;

import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class saz extends sch {
    private final Closeable a;

    public saz(Closeable closeable) {
        this.a = closeable;
    }

    @Override // defpackage.sci
    public final void a() throws IOException {
        try {
            this.a.close();
        } catch (IOException e) {
            CarSetupServiceImpl.a.h().p(e).ai(8624).u("Failed to close connection.");
        }
    }
}
