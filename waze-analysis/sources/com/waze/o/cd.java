package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cd extends dm<ce, cd> implements fj {
    /* synthetic */ cd(byte[] bArr) {
        super(ce.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((ce) this.instance).setCity(str);
    }

    public final void b(i.b.s sVar) {
        copyOnWrite();
        ((ce) this.instance).setCoordinate(sVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ce) this.instance).setHouseNumber(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((ce) this.instance).setName(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((ce) this.instance).setStreet(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((ce) this.instance).setVenueId(str);
    }

    private cd() {
        throw null;
    }
}
