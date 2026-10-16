package defpackage;

import android.content.ComponentName;
import android.graphics.Rect;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class jkc {
    public jid a;
    public jid b;
    public Consumer c;
    public int d;
    public Rect e;
    public int f;
    private ComponentName g;
    private CarRegionId h;
    private int i;
    private int j;
    private Rect k;
    private Rect l;
    private jhe m;
    private List n;
    private int o;
    private int p;
    private ProjectionWindowDecorationParams q;
    private int r;
    private UUID s;

    public final jki a() {
        jid jidVar;
        ComponentName componentName;
        Rect rect;
        Consumer consumer;
        int i;
        List list;
        int i2;
        int i3;
        int i4 = ~this.f;
        if ((65662 & i4) != 0) {
            StringBuilder sb = new StringBuilder();
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
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        ComponentName componentName2 = this.g;
        CarRegionId carRegionId = this.h;
        int i5 = this.i;
        int i6 = this.j;
        Rect rect2 = this.k;
        Rect rect3 = this.l;
        jhe jheVar = this.m;
        jid jidVar2 = this.a;
        jid jidVar3 = this.b;
        List list2 = this.n;
        int i7 = this.o;
        int i8 = this.p;
        ProjectionWindowDecorationParams projectionWindowDecorationParamsA = this.q;
        Consumer consumer2 = this.c;
        int i9 = this.r;
        int i10 = this.d;
        UUID uuid = this.s;
        Rect rect4 = this.e;
        if (1 != (i4 & 1)) {
            jidVar = jidVar3;
            componentName = componentName2;
        } else {
            jidVar = jidVar3;
            componentName = null;
        }
        if ((i4 & 128) != 0) {
            jidVar2 = null;
        }
        if ((i4 & 256) != 0) {
            jidVar = null;
        }
        List list3 = list2;
        jid jidVar4 = jidVar2;
        if ((i4 & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            list3 = afbe.a;
        }
        if ((i4 & 1024) != 0) {
            i7 = 1;
        }
        if ((i4 & 2048) != 0) {
            i8 = 0;
        }
        if ((i4 & 4096) != 0) {
            projectionWindowDecorationParamsA = ProjectionWindowDecorationParams.a();
        }
        if ((i4 & 8192) != 0) {
            consumer2 = null;
        }
        int i11 = (i4 & 16384) != 0 ? 0 : i9;
        if ((i4 & 32768) != 0) {
            i10 = 0;
        }
        if ((i4 & 131072) != 0) {
            rect = new Rect();
            consumer = consumer2;
            i2 = i10;
            i3 = i11;
            i = i8;
            list = list3;
        } else {
            rect = rect4;
            consumer = consumer2;
            i = i8;
            list = list3;
            i2 = i10;
            i3 = i11;
        }
        return new jki(componentName, carRegionId, i5, i6, rect2, rect3, jheVar, jidVar4, jidVar, list, i7, i, projectionWindowDecorationParamsA, consumer, i3, i2, uuid, rect);
    }

    public final void b(UUID uuid) {
        if (uuid == null) {
            throw new NullPointerException("Null carDisplayConfigurationId");
        }
        this.s = uuid;
        this.f |= 65536;
    }

    public final void c(ComponentName componentName) {
        this.g = componentName;
        this.f |= 1;
    }

    public final void d(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null contentWindowBounds");
        }
        this.k = rect;
        this.f |= 16;
    }

    public final void e(jhe jheVar) {
        if (jheVar == null) {
            throw new NullPointerException("Null eventListener");
        }
        this.m = jheVar;
        this.f |= 64;
    }

    public final void f(int i) {
        this.r = i;
        this.f |= 16384;
    }

    public final void g(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null initialContentWindowInsets");
        }
        this.l = rect;
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

    public final void j(List list) {
        if (list == null) {
            throw new NullPointerException("Null regionsCastingInsets");
        }
        this.n = list;
        this.f |= sk.AUDIO_CONTENT_BUFFER_SIZE;
    }

    public final void k(ProjectionWindowDecorationParams projectionWindowDecorationParams) {
        if (projectionWindowDecorationParams == null) {
            throw new NullPointerException("Null windowDecorationParams");
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

    public final void n(CarRegionId carRegionId) {
        if (carRegionId == null) {
            throw new NullPointerException("Null carRegionId");
        }
        this.h = carRegionId;
        this.f |= 2;
    }
}
