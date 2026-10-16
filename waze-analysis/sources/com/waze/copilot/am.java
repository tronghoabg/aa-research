package com.waze.copilot;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am extends dm<an, am> implements ao {
    /* synthetic */ am(byte[] bArr) {
        super(an.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((an) this.instance).setDescription(str);
    }

    public final void b(b bVar) {
        copyOnWrite();
        ((an) this.instance).setDownloadable(bVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((an) this.instance).setId(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((an) this.instance).setLang(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((an) this.instance).setLocale(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((an) this.instance).setName(str);
    }

    public final void g(d dVar) {
        copyOnWrite();
        ((an) this.instance).setPreview(dVar);
    }

    public final void h(int i2) {
        copyOnWrite();
        ((an) this.instance).setVersion(i2);
    }

    public final void i(aq aqVar) {
        copyOnWrite();
        ((an) this.instance).setVoiceType(aqVar);
    }

    private am() {
        throw null;
    }
}
