package defpackage;

import java.security.PrivilegedAction;
import java.security.Security;

/* loaded from: classes.dex */
public final class v8 implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                return Security.getProperty("org.bouncycastle.dh.allow_unsafe_p_value");
            default:
                return System.getProperty("org.bouncycastle.dh.allow_unsafe_p_value");
        }
    }
}
