package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class an extends dm<ao, an> implements fj {
    /* synthetic */ an(byte[] bArr) {
        super(ao.DEFAULT_INSTANCE);
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(((ao) this.instance).getEventsOnRouteList());
    }

    public final List b() {
        return ((ao) this.instance).getRouteAttributesList();
    }

    public final List c() {
        return ((ao) this.instance).getRouteTypesList();
    }

    public final List d() {
        return DesugarCollections.unmodifiableList(((ao) this.instance).getTrafficJamsList());
    }

    public final void e(Iterable iterable) {
        copyOnWrite();
        ((ao) this.instance).addAllEventsOnRoute(iterable);
    }

    public final void f(Iterable iterable) {
        copyOnWrite();
        ((ao) this.instance).addAllRouteAttributes(iterable);
    }

    public final void g(Iterable iterable) {
        copyOnWrite();
        ((ao) this.instance).addAllRouteTypes(iterable);
    }

    public final void h(Iterable iterable) {
        copyOnWrite();
        ((ao) this.instance).addAllTrafficJams(iterable);
    }

    public final void i(String str) {
        copyOnWrite();
        ((ao) this.instance).setAltDescription(str);
    }

    public final void j(bi biVar) {
        copyOnWrite();
        ((ao) this.instance).setTollPriceInfo(biVar);
    }

    public final void k(long j2) {
        copyOnWrite();
        ((ao) this.instance).setTotalLengthMeters(j2);
    }

    public final void l(long j2) {
        copyOnWrite();
        ((ao) this.instance).setTotalSeconds(j2);
    }

    private an() {
        throw null;
    }
}
