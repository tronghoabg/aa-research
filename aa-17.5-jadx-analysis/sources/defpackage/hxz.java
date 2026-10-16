package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class hxz implements igb {
    private final /* synthetic */ int a;

    public hxz(int i) {
        this.a = i;
    }

    public static final hya b() {
        try {
            return new hya(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.igb
    public final /* synthetic */ Object a() {
        int i = this.a;
        return i != 0 ? i != 1 ? new ArrayList() : new hww() : b();
    }
}
