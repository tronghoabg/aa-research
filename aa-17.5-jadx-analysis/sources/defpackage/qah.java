package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class qah implements Serializable, pzx {
    public final qaa b;
    public Integer c;

    public qah(abwo abwoVar) {
        this.b = qaa.c(abwoVar);
    }

    @Override // defpackage.pzx
    public final abwo a() {
        return this.b.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qah)) {
            return false;
        }
        qah qahVar = (qah) obj;
        return Objects.equals(this.b, qahVar.b) && Objects.equals(this.c, qahVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c);
    }
}
