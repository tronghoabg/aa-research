package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ioe {
    public android.content.ComponentName a;
    public android.content.Intent b;
    public android.os.Bundle c;
    public defpackage.ioi d;
    public com.google.android.gms.car.display.CarRegionId e;
    public android.graphics.Rect f;
    private android.content.ComponentName g;
    private defpackage.inm h;
    private int i;
    private int j;
    private android.graphics.Rect k;
    private android.graphics.Rect l;
    private int m;
    private int n;
    private java.util.UUID o;
    private int p;
    private byte q = 31;

    public ioe(defpackage.iof iofVar) {
        this.g = iofVar.a;
        this.a = iofVar.b;
        this.b = iofVar.c;
        this.c = iofVar.d;
        this.h = iofVar.e;
        this.d = iofVar.f;
        this.i = iofVar.g;
        this.j = iofVar.h;
        this.e = iofVar.i;
        this.f = iofVar.j;
        this.k = iofVar.k;
        this.l = iofVar.l;
        this.m = iofVar.m;
        this.n = iofVar.n;
        this.o = iofVar.o;
        this.p = iofVar.p;
    }

    public final defpackage.iof a() {
        android.content.ComponentName componentName;
        android.content.Intent intent;
        defpackage.inm inmVar;
        com.google.android.gms.car.display.CarRegionId carRegionId;
        android.graphics.Rect rect;
        android.graphics.Rect rect2;
        android.graphics.Rect rect3;
        java.util.UUID uuid;
        if (this.q == 31 && (componentName = this.g) != null && (intent = this.b) != null && (inmVar = this.h) != null && (carRegionId = this.e) != null && (rect = this.f) != null && (rect2 = this.k) != null && (rect3 = this.l) != null && (uuid = this.o) != null) {
            return new defpackage.iof(componentName, this.a, intent, this.c, inmVar, this.d, this.i, this.j, carRegionId, rect, rect2, rect3, this.m, this.n, uuid, this.p);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.g == null) {
            sb.append(" componentName");
        }
        if (this.b == null) {
            sb.append(" intent");
        }
        if (this.h == null) {
            sb.append(" factory");
        }
        if ((this.q & 1) == 0) {
            sb.append(" windowLayer");
        }
        if ((this.q & 2) == 0) {
            sb.append(" z");
        }
        if (this.e == null) {
            sb.append(" carRegionId");
        }
        if (this.f == null) {
            sb.append(" bounds");
        }
        if (this.k == null) {
            sb.append(" insets");
        }
        if (this.l == null) {
            sb.append(" extraInsets");
        }
        if ((this.q & 4) == 0) {
            sb.append(" insetSideHint");
        }
        if ((this.q & 8) == 0) {
            sb.append(" insetBehavior");
        }
        if (this.o == null) {
            sb.append(" carDisplayConfigurationId");
        }
        if ((this.q & 16) == 0) {
            sb.append(" bindPriorityFlags");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.p = i;
        this.q = (byte) (this.q | 16);
    }

    public final void c(java.util.UUID uuid) {
        if (uuid == null) {
            throw new java.lang.NullPointerException("Null carDisplayConfigurationId");
        }
        this.o = uuid;
    }

    public final void d(android.content.ComponentName componentName) {
        if (componentName == null) {
            throw new java.lang.NullPointerException("Null componentName");
        }
        this.g = componentName;
    }

    public final void e(android.graphics.Rect rect) {
        if (rect == null) {
            throw new java.lang.NullPointerException("Null extraInsets");
        }
        this.l = rect;
    }

    public final void f(defpackage.inm inmVar) {
        if (inmVar == null) {
            throw new java.lang.NullPointerException("Null factory");
        }
        this.h = inmVar;
    }

    public final void g(int i) {
        this.n = i;
        this.q = (byte) (this.q | 8);
    }

    public final void h(int i) {
        this.m = i;
        this.q = (byte) (this.q | 4);
    }

    public final void i(android.graphics.Rect rect) {
        if (rect == null) {
            throw new java.lang.NullPointerException("Null insets");
        }
        this.k = rect;
    }

    public final void j(int i) {
        this.i = i;
        this.q = (byte) (this.q | 1);
    }

    public final void k(int i) {
        this.j = i;
        this.q = (byte) (this.q | 2);
    }
}
