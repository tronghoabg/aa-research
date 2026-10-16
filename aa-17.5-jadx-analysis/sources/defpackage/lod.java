package defpackage;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.util.List;

/* loaded from: classes2.dex */
public final class lod implements lol {
    public static final yph a = yph.c("GH.MediaActiveContrConn");
    public final lok b;
    public final ljx c;
    public final lmb d;
    public final eqj e;
    public final eqj f;
    public final eqj g;
    public final eqj h;
    public final ogz i;
    public final gjv j = new gjv((xyi) oit.a().b);

    public lod(lok lokVar, ljx ljxVar, lmb lmbVar) {
        this.b = lokVar;
        this.c = ljxVar;
        this.d = lmbVar;
        this.e = new loa(lmbVar, ljxVar.a);
        this.f = new lny(lmbVar, ljxVar.a);
        this.g = new loc(lmbVar, ljxVar.a);
        this.h = eqy.a(new lnw(lmbVar, ljxVar.a));
        this.i = new ogz(lmbVar, ljxVar.a);
    }

    public static yfq c(List list) {
        Stream map = Collection.EL.stream(list).map(new lka(9));
        int i = yfq.d;
        return (yfq) map.collect(ycm.a);
    }

    public final Bundle a() {
        return this.d.n();
    }

    public final MediaSessionCompat.Token b() {
        return (MediaSessionCompat.Token) this.d.L().b;
    }

    @Override // defpackage.los
    public final ljx d() {
        return this.c;
    }

    @Override // defpackage.los
    public final lok e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lod)) {
            return false;
        }
        lod lodVar = (lod) obj;
        return Objects.equals(this.b, lodVar.b) && Objects.equals(this.c, lodVar.c) && Objects.equals(this.d, lodVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d);
    }

    public final String toString() {
        return String.format("%s{connectionStatus=%s, packageInfo=%s}", getClass().getSimpleName(), this.b, this.c);
    }
}
