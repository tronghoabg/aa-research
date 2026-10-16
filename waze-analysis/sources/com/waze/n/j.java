package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends dm<k, j> implements fj {
    /* synthetic */ j(byte[] bArr) {
        super(k.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((k) this.instance).setDeviceManufacturer(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((k) this.instance).setDeviceModel(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((k) this.instance).setInstallationId(str);
    }

    public final void d(s sVar) {
        copyOnWrite();
        ((k) this.instance).setOs(sVar);
    }

    public final void e(String str) {
        copyOnWrite();
        ((k) this.instance).setOsVersion(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((k) this.instance).setSystemLanguage(str);
    }

    private j() {
        throw null;
    }
}
