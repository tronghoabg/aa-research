package defpackage;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class hum implements hui {
    public final yw b = new ifm();

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            yw ywVar = this.b;
            if (i >= ywVar.d) {
                return;
            }
            hul hulVar = (hul) ywVar.d(i);
            Object objG = ywVar.g(i);
            huk hukVar = hulVar.c;
            if (hulVar.e == null) {
                hulVar.e = hulVar.d.getBytes(hui.a);
            }
            hukVar.a(hulVar.e, objG, messageDigest);
            i++;
        }
    }

    public final Object b(hul hulVar) {
        yw ywVar = this.b;
        return ywVar.containsKey(hulVar) ? ywVar.get(hulVar) : hulVar.b;
    }

    public final void c(hum humVar) {
        this.b.i(humVar.b);
    }

    public final void d(hul hulVar, Object obj) {
        this.b.put(hulVar, obj);
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        if (obj instanceof hum) {
            return this.b.equals(((hum) obj).b);
        }
        return false;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b.toString() + "}";
    }
}
