package com.google.android.libraries.geo.mapcore.renderer;

import defpackage.kex;
import defpackage.qsb;
import defpackage.uud;
import defpackage.uvw;

/* loaded from: classes3.dex */
public class TextureShaderState$TextureShaderProgram extends uvw {
    public int a;
    public int b;
    public int c;
    private final String[] d;
    private final qsb e;

    public TextureShaderState$TextureShaderProgram() {
        qsb qsbVar = new qsb((boolean[]) null);
        this.e = qsbVar;
        kex kexVar = (kex) qsbVar.b;
        this.d = new String[]{(String) kexVar.c, "unused", (String) kexVar.b, (String) kexVar.a};
    }

    @Override // defpackage.uvw
    public final String a() {
        return (String) this.e.a;
    }

    @Override // defpackage.uvw
    public final String b() {
        return (String) this.e.d;
    }

    @Override // defpackage.uvw
    public final String[] c() {
        return this.d;
    }

    @Override // defpackage.uvw
    protected final void d(int i) {
        qsb qsbVar = (qsb) this.e.c;
        this.x = uud.L(i, (String) qsbVar.c);
        this.a = uud.L(i, (String) qsbVar.d);
        this.b = uud.L(i, (String) qsbVar.b);
        this.c = uud.L(i, (String) qsbVar.a);
    }
}
