package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import j$.util.Objects;
import java.net.SocketAddress;

/* loaded from: classes.dex */
public final class adod extends SocketAddress {
    private static final long serialVersionUID = 0;
    public final Intent a;
    public final UserHandle b;

    public adod(Intent intent, UserHandle userHandle) {
        boolean z = true;
        if (intent.getComponent() == null && intent.getPackage() == null) {
            z = false;
        }
        woy.O(z, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
        this.a = intent;
        this.b = userHandle;
    }

    public static adod a(ComponentName componentName) {
        return new adod(new Intent("grpc.io.action.BIND").setComponent(componentName), null);
    }

    public static adod b(Context context) {
        return a(new ComponentName(context, context.getClass()));
    }

    public final String c() {
        Intent intent = this.a;
        return intent.getPackage() != null ? intent.getPackage() : intent.getComponent().getPackageName();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adod) {
            adod adodVar = (adod) obj;
            if (this.a.filterEquals(adodVar.a) && Objects.equals(this.b, adodVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.a;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidComponentAddress[");
        UserHandle userHandle = this.b;
        if (userHandle != null) {
            sb.append(userHandle);
            sb.append("@");
        }
        sb.append(this.a);
        sb.append("]");
        return sb.toString();
    }
}
