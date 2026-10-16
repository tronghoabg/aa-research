package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ajds {
    public static ajds d;
    public final Object a;
    public final Object b;
    public final Object c;

    private ajds(Context context) {
        this.c = new zox();
        zov zovVar = new zov(context.getAssets());
        this.a = zovVar;
        this.b = new aacq(new oct((short[]) null), (zob) zovVar);
        new zre(zovVar, zpb.d());
        new zre(zovVar, zpb.c());
    }

    public static synchronized void a(Context context) {
        if (d != null) {
            throw new IllegalStateException("Context already configured");
        }
        d = new ajds(context);
    }

    public final void b(ziv zivVar) {
        ((yfl) this.a).i(zivVar);
    }

    public ajds(Object obj, afeh afehVar, afeh afehVar2) {
        this.a = obj;
        this.b = afehVar;
        this.c = afehVar2;
    }

    public ajds(String str) {
        int i = yfq.d;
        this.a = new yfl(4);
        this.c = new yfl(4);
        this.b = str;
    }

    public ajds(byte[] bArr, abfo abfoVar) {
        this.c = abfoVar;
        this.a = bArr;
        this.b = new String[abfoVar.b];
    }

    public ajds(gjt gjtVar, aabc aabcVar, zxh zxhVar) {
        this.a = gjtVar;
        this.c = aabcVar;
        this.b = zxhVar;
    }
}
