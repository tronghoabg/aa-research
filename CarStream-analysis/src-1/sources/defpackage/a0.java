package defpackage;

import android.os.Build;
import io.github.muntashirakon.adb.AbsAdbConnectionManager;
import java.security.PrivateKey;
import java.security.cert.Certificate;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class a0 extends AbsAdbConnectionManager {
    public final z a;

    public a0(z zVar) {
        this.a = zVar;
        setApi(Build.VERSION.SDK_INT);
    }

    @Override // io.github.muntashirakon.adb.AbsAdbConnectionManager
    public final Certificate getCertificate() {
        return (Certificate) this.a.b;
    }

    @Override // io.github.muntashirakon.adb.AbsAdbConnectionManager
    public final String getDeviceName() {
        return "CarStream";
    }

    @Override // io.github.muntashirakon.adb.AbsAdbConnectionManager
    public final PrivateKey getPrivateKey() {
        return (PrivateKey) this.a.a;
    }
}
