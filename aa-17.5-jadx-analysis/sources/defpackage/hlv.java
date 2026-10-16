package defpackage;

import android.graphics.Rect;

@Deprecated
/* loaded from: classes2.dex */
public final class hlv {
    public static final hlv a;
    public final Rect b;
    public final int c;
    public final int d;
    public final ghv e;
    public final boolean f;
    public final int g;
    public final boolean h;

    static {
        hlv hlvVar = new hlv(ghv.c, false, null, 0, 0, 2, false);
        a = hlvVar;
        hlu hluVarA = a(hlvVar);
        hluVarA.d = 10;
        hluVarA.c = new Rect();
        hluVarA.a();
    }

    public hlv(ghv ghvVar, boolean z, Rect rect, int i, int i2, int i3, boolean z2) {
        this.e = ghvVar;
        this.f = z;
        this.b = rect;
        this.c = i;
        this.d = i2;
        this.g = i3;
        this.h = z2;
    }

    public static hlu a(hlv hlvVar) {
        hlu hluVar = new hlu();
        hluVar.a = hlvVar.e;
        hluVar.b = hlvVar.f;
        hluVar.c = hlvVar.b;
        hluVar.d = hlvVar.c;
        hluVar.e = hlvVar.d;
        hluVar.f = hlvVar.g;
        hluVar.g = hlvVar.h;
        return hluVar;
    }
}
