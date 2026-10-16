package e.a.b;

import android.content.ComponentName;
import android.content.Intent;
import android.os.UserHandle;
import com.google.d.b.an;
import j$.util.Objects;
import java.net.SocketAddress;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends SocketAddress {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Intent f46465a;

    /* renamed from: b, reason: collision with root package name */
    private final UserHandle f46466b;

    private b(Intent intent, UserHandle userHandle) {
        boolean z = true;
        if (intent.getComponent() == null && intent.getPackage() == null) {
            z = false;
        }
        an.m(z, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
        this.f46465a = intent;
        this.f46466b = userHandle;
    }

    public static b c(ComponentName componentName) {
        return new b(new Intent("grpc.io.action.BIND").setComponent(componentName), null);
    }

    public static b e(String str) {
        return c(new ComponentName("com.google.android.googlequicksearchbox", str));
    }

    public final Intent a() {
        return this.f46465a.cloneFilter();
    }

    public final UserHandle b() {
        return this.f46466b;
    }

    public final String d() {
        Intent intent = this.f46465a;
        return intent.getPackage() != null ? intent.getPackage() : intent.getComponent().getPackageName();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46465a.filterEquals(bVar.f46465a) && Objects.equals(this.f46466b, bVar.f46466b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.f46465a;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidComponentAddress[");
        UserHandle userHandle = this.f46466b;
        if (userHandle != null) {
            sb.append(userHandle);
            sb.append("@");
        }
        sb.append(this.f46465a);
        sb.append("]");
        return sb.toString();
    }

    /* synthetic */ b(Intent intent, UserHandle userHandle, byte[] bArr) {
        this(intent, userHandle);
    }
}
