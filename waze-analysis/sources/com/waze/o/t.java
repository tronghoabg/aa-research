package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t extends dm<u, t> implements fj {
    /* synthetic */ t(byte[] bArr) {
        super(u.DEFAULT_INSTANCE);
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(((u) this.instance).getFavoriteList());
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((u) this.instance).addAllFavorite(iterable);
    }

    public final void c(String str) {
        copyOnWrite();
        ((u) this.instance).setAcceptedLanguage(str);
    }

    public final void d(com.waze.u.a.g gVar) {
        copyOnWrite();
        ((u) this.instance).setAudioConfiguration(gVar);
    }

    public final void e(String str) {
        copyOnWrite();
        ((u) this.instance).setCurrentStreetName(str);
    }

    public final void f() {
        copyOnWrite();
        ((u) this.instance).setIsLongTermMemoryEnabled(false);
    }

    public final void g(com.waze.ca.a aVar) {
        copyOnWrite();
        ((u) this.instance).setMeasurementSystem(aVar);
    }

    public final void h(al alVar) {
        copyOnWrite();
        ((u) this.instance).setNavigationInfo(alVar);
    }

    public final void i(i.b.s sVar) {
        copyOnWrite();
        ((u) this.instance).setUserPosition(sVar);
    }

    private t() {
        throw null;
    }
}
