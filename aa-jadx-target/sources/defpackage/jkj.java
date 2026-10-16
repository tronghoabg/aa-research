package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jkj {
    public defpackage.jik a;
    public defpackage.jik b;
    public java.util.function.Consumer c;
    public int d;
    public android.graphics.Rect e;
    public int f;
    private android.content.ComponentName g;
    private com.google.android.gms.car.display.CarRegionId h;
    private int i;
    private int j;
    private android.graphics.Rect k;
    private jhq l;
    private defpackage.jhk m;
    private java.util.List n;
    private int o;
    private int p;
    private com.google.android.gms.car.ProjectionWindowDecorationParams q;
    private int r;
    private java.util.UUID s;

    public final defpackage.jkp a() {
        int i = ~this.f;
        if ((65662 & i) != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((this.f & 2) == 0) {
                sb.append(" carRegionId");
            }
            if ((this.f & 4) == 0) {
                sb.append(" windowLayer");
            }
            if ((this.f & 8) == 0) {
                sb.append(" z");
            }
            if ((this.f & 16) == 0) {
                sb.append(" contentWindowBounds");
            }
            if ((this.f & 32) == 0) {
                sb.append(" initialContentWindowInsets");
            }
            if ((this.f & 64) == 0) {
                sb.append(" eventListener");
            }
            if ((this.f & 65536) == 0) {
                sb.append(" carDisplayConfigurationId");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        android.content.ComponentName componentName = this.g;
        com.google.android.gms.car.display.CarRegionId carRegionId = this.h;
        int i2 = this.i;
        int i3 = this.j;
        android.graphics.Rect rect = this.k;
        jhq jhqVar = this.l;
        defpackage.jhk jhkVar = this.m;
        defpackage.jik jikVar = this.a;
        defpackage.jik jikVar2 = this.b;
        java.util.List list = this.n;
        int i4 = this.o;
        int i5 = this.p;
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParamsA = this.q;
        java.util.function.Consumer consumer = this.c;
        int i6 = this.r;
        int i7 = this.d;
        java.util.UUID uuid = this.s;
        android.graphics.Rect rect2 = this.e;
        android.content.ComponentName componentName2 = 1 != (i & 1) ? componentName : null;
        if ((i & 128) != 0) {
            jikVar = null;
        }
        if ((i & 256) != 0) {
            jikVar2 = null;
        }
        java.util.List list2 = list;
        defpackage.jik jikVar3 = jikVar;
        if ((i & 512) != 0) {
            list2 = defpackage.afce.a;
        }
        if ((i & 1024) != 0) {
            i4 = 1;
        }
        if ((i & 2048) != 0) {
            i5 = 0;
        }
        if ((i & 4096) != 0) {
            projectionWindowDecorationParamsA = com.google.android.gms.car.ProjectionWindowDecorationParams.a();
        }
        if ((i & 8192) != 0) {
            consumer = null;
        }
        int i8 = (i & 16384) != 0 ? 0 : i6;
        if ((i & 32768) != 0) {
            i7 = 0;
        }
        return new defpackage.jkp(componentName2, carRegionId, i2, i3, rect, jhqVar, jhkVar, jikVar3, jikVar2, list2, i4, i5, projectionWindowDecorationParamsA, consumer, i8, i7, uuid, (i & 131072) != 0 ? new android.graphics.Rect() : rect2);
    }

    public final void b(java.util.UUID uuid) {
        if (uuid == null) {
            throw new java.lang.NullPointerException("Null carDisplayConfigurationId");
        }
        this.s = uuid;
        this.f |= 65536;
    }

    public final void c(android.content.ComponentName componentName) {
        this.g = componentName;
        this.f |= 1;
    }

    public final void d(android.graphics.Rect rect) {
        if (rect == null) {
            throw new java.lang.NullPointerException("Null contentWindowBounds");
        }
        this.k = rect;
        this.f |= 16;
    }

    public final void e(defpackage.jhk jhkVar) {
        if (jhkVar == null) {
            throw new java.lang.NullPointerException("Null eventListener");
        }
        this.m = jhkVar;
        this.f |= 64;
    }

    public final void f(int i) {
        this.r = i;
        this.f |= 16384;
    }

    public final void g(jhq jhqVar) {
        this.l = jhqVar;
        this.f |= 32;
    }

    public final void h(int i) {
        this.p = i;
        this.f |= 2048;
    }

    public final void i(int i) {
        this.o = i;
        this.f |= 1024;
    }

    public final void j(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null regionsCastingInsets");
        }
        this.n = list;
        this.f |= 512;
    }

    public final void k(com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams) {
        if (projectionWindowDecorationParams == null) {
            throw new java.lang.NullPointerException("Null windowDecorationParams");
        }
        this.q = projectionWindowDecorationParams;
        this.f |= 4096;
    }

    public final void l(int i) {
        this.i = i;
        this.f |= 4;
    }

    public final void m(int i) {
        this.j = i;
        this.f |= 8;
    }

    public final void n(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (carRegionId == null) {
            throw new java.lang.NullPointerException("Null carRegionId");
        }
        this.h = carRegionId;
        this.f |= 2;
    }
}
