package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class iac implements huo {
    private final huo a;
    private final Resources b;

    public iac(Resources resources, huo huoVar) {
        a.al(resources, "Argument must not be null");
        this.b = resources;
        this.a = huoVar;
    }

    @Override // defpackage.huo
    public final hwx a(Object obj, int i, int i2, hum humVar) throws IOException {
        return ibn.f(this.b, this.a.a(obj, i, i2, humVar));
    }

    @Override // defpackage.huo
    public final boolean b(Object obj, hum humVar) throws IOException {
        return this.a.b(obj, humVar);
    }
}
