package defpackage;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class ifj implements hui {
    private final Object b;

    public ifj(Object obj) {
        a.al(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        if (obj instanceof ifj) {
            return this.b.equals(((ifj) obj).b);
        }
        return false;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b.toString() + "}";
    }
}
