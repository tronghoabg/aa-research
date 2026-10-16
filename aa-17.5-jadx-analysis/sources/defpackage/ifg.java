package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class ifg implements hui {
    private final int b;
    private final hui c;

    public ifg(int i, hui huiVar) {
        this.b = i;
        this.c = huiVar;
    }

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        if (obj instanceof ifg) {
            ifg ifgVar = (ifg) obj;
            if (this.b == ifgVar.b && this.c.equals(ifgVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        return ify.c(this.c, this.b);
    }
}
