package com.google.android.libraries.geo.mapcore.renderer;

import defpackage.qsb;
import defpackage.rfe;
import defpackage.rjg;
import defpackage.uud;
import defpackage.uvw;

/* loaded from: classes3.dex */
final class FrameTimeOverlay$FrameTimeOverlayShaderProgram extends uvw {
    private final String[] a;
    private final qsb b;

    FrameTimeOverlay$FrameTimeOverlayShaderProgram() {
        qsb qsbVar = new qsb((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
        this.b = qsbVar;
        rjg rjgVar = (rjg) qsbVar.b;
        this.a = new String[]{(String) rjgVar.b, (String) rjgVar.a};
    }

    @Override // defpackage.uvw
    public final String a() {
        return (String) this.b.a;
    }

    @Override // defpackage.uvw
    public final String b() {
        return (String) this.b.d;
    }

    @Override // defpackage.uvw
    public final String[] c() {
        return this.a;
    }

    @Override // defpackage.uvw
    protected final void d(int i) {
        rfe rfeVar = (rfe) this.b.c;
        uud.L(i, (String) rfeVar.g);
        uud.L(i, (String) rfeVar.a);
        uud.L(i, (String) rfeVar.e);
        uud.L(i, (String) rfeVar.c);
        uud.L(i, (String) rfeVar.d);
        uud.L(i, (String) rfeVar.b);
        uud.L(i, (String) rfeVar.f);
    }
}
