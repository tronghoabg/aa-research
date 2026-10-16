package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import com.google.android.gms.car.display.CarRegionId;
import java.util.UUID;

/* loaded from: classes.dex */
public final class iny {
    public ComponentName a;
    public Intent b;
    public Bundle c;
    public ioc d;
    public CarRegionId e;
    public Rect f;
    private ComponentName g;
    private inf h;
    private int i;
    private int j;
    private Rect k;
    private int l;
    private int m;
    private UUID n;
    private int o;
    private byte p = 31;

    public iny(inz inzVar) {
        this.g = inzVar.a;
        this.a = inzVar.b;
        this.b = inzVar.c;
        this.c = inzVar.d;
        this.h = inzVar.e;
        this.d = inzVar.f;
        this.i = inzVar.g;
        this.j = inzVar.h;
        this.e = inzVar.i;
        this.f = inzVar.j;
        this.k = inzVar.k;
        this.l = inzVar.l;
        this.m = inzVar.m;
        this.n = inzVar.n;
        this.o = inzVar.o;
    }

    public final inz a() {
        ComponentName componentName;
        Intent intent;
        inf infVar;
        CarRegionId carRegionId;
        Rect rect;
        Rect rect2;
        UUID uuid;
        if (this.p == 31 && (componentName = this.g) != null && (intent = this.b) != null && (infVar = this.h) != null && (carRegionId = this.e) != null && (rect = this.f) != null && (rect2 = this.k) != null && (uuid = this.n) != null) {
            return new inz(componentName, this.a, intent, this.c, infVar, this.d, this.i, this.j, carRegionId, rect, rect2, this.l, this.m, uuid, this.o);
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" componentName");
        }
        if (this.b == null) {
            sb.append(" intent");
        }
        if (this.h == null) {
            sb.append(" factory");
        }
        if ((this.p & 1) == 0) {
            sb.append(" windowLayer");
        }
        if ((this.p & 2) == 0) {
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
        if ((this.p & 4) == 0) {
            sb.append(" insetSideHint");
        }
        if ((this.p & 8) == 0) {
            sb.append(" insetBehavior");
        }
        if (this.n == null) {
            sb.append(" carDisplayConfigurationId");
        }
        if ((this.p & 16) == 0) {
            sb.append(" bindPriorityFlags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.o = i;
        this.p = (byte) (this.p | 16);
    }

    public final void c(UUID uuid) {
        if (uuid == null) {
            throw new NullPointerException("Null carDisplayConfigurationId");
        }
        this.n = uuid;
    }

    public final void d(ComponentName componentName) {
        if (componentName == null) {
            throw new NullPointerException("Null componentName");
        }
        this.g = componentName;
    }

    public final void e(inf infVar) {
        if (infVar == null) {
            throw new NullPointerException("Null factory");
        }
        this.h = infVar;
    }

    public final void f(int i) {
        this.m = i;
        this.p = (byte) (this.p | 8);
    }

    public final void g(int i) {
        this.l = i;
        this.p = (byte) (this.p | 4);
    }

    public final void h(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null insets");
        }
        this.k = rect;
    }

    public final void i(int i) {
        this.i = i;
        this.p = (byte) (this.p | 1);
    }

    public final void j(int i) {
        this.j = i;
        this.p = (byte) (this.p | 2);
    }
}
