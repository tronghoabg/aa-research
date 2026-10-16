package androidx.navigation;

import androidx.navigation.serialization.RouteSerializerKt;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NavOptions {
    private final int enterAnim;
    private final int exitAnim;
    private final int popEnterAnim;
    private final int popExitAnim;
    private final int popUpToId;
    private final boolean popUpToInclusive;
    private String popUpToRoute;
    private c<?> popUpToRouteClass;
    private Object popUpToRouteObject;
    private final boolean popUpToSaveState;
    private final boolean restoreState;
    private final boolean singleTop;

    /* JADX WARN: Illegal instructions before constructor call */
    public NavOptions(boolean z, boolean z2, Object obj, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        x.f(obj, "popUpToRouteObject");
        Class<?> cls = obj.getClass();
        int i6 = ar.f48106a;
        this(z, z2, RouteSerializerKt.generateHashCode(p.a(new m(cls))), z3, z4, i2, i3, i4, i5);
        this.popUpToRouteObject = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NavOptions)) {
            NavOptions navOptions = (NavOptions) obj;
            if (this.singleTop == navOptions.singleTop && this.restoreState == navOptions.restoreState && this.popUpToId == navOptions.popUpToId && x.n(this.popUpToRoute, navOptions.popUpToRoute) && x.n(this.popUpToRouteClass, navOptions.popUpToRouteClass) && x.n(this.popUpToRouteObject, navOptions.popUpToRouteObject) && this.popUpToInclusive == navOptions.popUpToInclusive && this.popUpToSaveState == navOptions.popUpToSaveState && this.enterAnim == navOptions.enterAnim && this.exitAnim == navOptions.exitAnim && this.popEnterAnim == navOptions.popEnterAnim && this.popExitAnim == navOptions.popExitAnim) {
                return true;
            }
        }
        return false;
    }

    public final int getEnterAnim() {
        return this.enterAnim;
    }

    public final int getExitAnim() {
        return this.exitAnim;
    }

    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    public final int getPopUpTo() {
        return this.popUpToId;
    }

    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public final c<?> getPopUpToRouteClass() {
        return this.popUpToRouteClass;
    }

    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    public int hashCode() {
        int i2 = ((shouldLaunchSingleTop() ? 1 : 0) * 31) + (shouldRestoreState() ? 1 : 0);
        String str = this.popUpToRoute;
        int iHashCode = ((((i2 * 31) + this.popUpToId) * 31) + (str != null ? str.hashCode() : 0)) * 31;
        c<?> cVar = this.popUpToRouteClass;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Object obj = this.popUpToRouteObject;
        return ((((((((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (isPopUpToInclusive() ? 1 : 0)) * 31) + (shouldPopUpToSaveState() ? 1 : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    public final boolean isPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    public final boolean shouldLaunchSingleTop() {
        return this.singleTop;
    }

    public final boolean shouldPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    public final boolean shouldRestoreState() {
        return this.restoreState;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (this.singleTop) {
            sb.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb.append("restoreState ");
        }
        String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb.append("popUpTo(");
            String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb.append(str2);
            } else {
                c<?> cVar = this.popUpToRouteClass;
                if (cVar != null) {
                    sb.append(cVar);
                } else {
                    Object obj = this.popUpToRouteObject;
                    if (obj != null) {
                        sb.append(obj);
                    } else {
                        sb.append("0x");
                        sb.append(Integer.toHexString(this.popUpToId));
                    }
                }
            }
            if (this.popUpToInclusive) {
                sb.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(this.enterAnim));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.exitAnim));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.popEnterAnim));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.popExitAnim));
            sb.append(")");
        }
        String string = sb.toString();
        x.e(string, "toString(...)");
        return string;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private boolean popUpToInclusive;
        private String popUpToRoute;
        private c<?> popUpToRouteClass;
        private Object popUpToRouteObject;
        private boolean popUpToSaveState;
        private boolean restoreState;
        private boolean singleTop;
        private int popUpToId = -1;
        private int enterAnim = -1;
        private int exitAnim = -1;
        private int popEnterAnim = -1;
        private int popExitAnim = -1;

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, boolean z, boolean z2, int i2, Object obj) {
            x.i();
            int i3 = ar.f48106a;
            builder.setPopUpTo((c) new m(Object.class), z, z2 & ((i2 & 2) == 0));
            return builder;
        }

        public final NavOptions build() {
            String str = this.popUpToRoute;
            if (str != null) {
                return new NavOptions(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            c<?> cVar = this.popUpToRouteClass;
            if (cVar != null) {
                return new NavOptions(this.singleTop, this.restoreState, cVar, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            Object obj = this.popUpToRouteObject;
            return obj != null ? new NavOptions(this.singleTop, this.restoreState, obj, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim) : new NavOptions(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        public final Builder setEnterAnim(int i2) {
            this.enterAnim = i2;
            return this;
        }

        public final Builder setExitAnim(int i2) {
            this.exitAnim = i2;
            return this;
        }

        public final Builder setLaunchSingleTop(boolean z) {
            this.singleTop = z;
            return this;
        }

        public final Builder setPopEnterAnim(int i2) {
            this.popEnterAnim = i2;
            return this;
        }

        public final Builder setPopExitAnim(int i2) {
            this.popExitAnim = i2;
            return this;
        }

        public final <T> Builder setPopUpTo(T t, boolean z, boolean z2) {
            x.f(t, "route");
            this.popUpToRouteObject = t;
            Class<?> cls = t.getClass();
            int i2 = ar.f48106a;
            setPopUpTo(RouteSerializerKt.generateHashCode(p.a(new m(cls))), z, z2);
            return this;
        }

        public final Builder setRestoreState(boolean z) {
            this.restoreState = z;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, Object obj, boolean z, boolean z2, int i2, Object obj2) {
            builder.setPopUpTo((Builder) obj, z, z2 & ((i2 & 4) == 0));
            return builder;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, String str, boolean z, boolean z2, int i2, Object obj) {
            builder.setPopUpTo(str, z, z2 & ((i2 & 4) == 0));
            return builder;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, c cVar, boolean z, boolean z2, int i2, Object obj) {
            builder.setPopUpTo(cVar, z, z2 & ((i2 & 4) == 0));
            return builder;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, int i2, boolean z, boolean z2, int i3, Object obj) {
            builder.setPopUpTo(i2, z, z2 & ((i3 & 4) == 0));
            return builder;
        }

        public final Builder setPopUpTo(int i2, boolean z, boolean z2) {
            this.popUpToId = i2;
            this.popUpToRoute = null;
            this.popUpToInclusive = z;
            this.popUpToSaveState = z2;
            return this;
        }

        public final <T> Builder setPopUpTo(c<T> cVar, boolean z) {
            x.f(cVar, "route");
            setPopUpTo$default(this, (c) cVar, z, false, 4, (Object) null);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> Builder setPopUpTo(c<T> cVar, boolean z, boolean z2) {
            x.f(cVar, "route");
            this.popUpToRouteClass = cVar;
            this.popUpToId = -1;
            this.popUpToInclusive = z;
            this.popUpToSaveState = z2;
            return this;
        }

        public final <T> Builder setPopUpTo(T t, boolean z) {
            x.f(t, "route");
            setPopUpTo$default(this, (Object) t, z, false, 4, (Object) null);
            return this;
        }

        public final Builder setPopUpTo(String str, boolean z) {
            setPopUpTo$default(this, str, z, false, 4, (Object) null);
            return this;
        }

        public final Builder setPopUpTo(String str, boolean z, boolean z2) {
            this.popUpToRoute = str;
            this.popUpToId = -1;
            this.popUpToInclusive = z;
            this.popUpToSaveState = z2;
            return this;
        }

        public final Builder setPopUpTo(int i2, boolean z) {
            setPopUpTo$default(this, i2, z, false, 4, (Object) null);
            return this;
        }

        public final /* synthetic */ <T> Builder setPopUpTo(boolean z) {
            x.i();
            int i2 = ar.f48106a;
            setPopUpTo((c) new m(Object.class), z, false);
            return this;
        }

        public final /* synthetic */ <T> Builder setPopUpTo(boolean z, boolean z2) {
            x.i();
            int i2 = ar.f48106a;
            setPopUpTo((c) new m(Object.class), z, z2);
            return this;
        }
    }

    public NavOptions(boolean z, boolean z2, int i2, boolean z3, boolean z4, int i3, int i4, int i5, int i6) {
        this.singleTop = z;
        this.restoreState = z2;
        this.popUpToId = i2;
        this.popUpToInclusive = z3;
        this.popUpToSaveState = z4;
        this.enterAnim = i3;
        this.exitAnim = i4;
        this.popEnterAnim = i5;
        this.popExitAnim = i6;
    }

    public NavOptions(boolean z, boolean z2, String str, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this(z, z2, NavDestination.Companion.createRoute(str).hashCode(), z3, z4, i2, i3, i4, i5);
        this.popUpToRoute = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z, boolean z2, c<?> cVar, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this(z, z2, RouteSerializerKt.generateHashCode(p.a(cVar)), z3, z4, i2, i3, i4, i5);
        x.c(cVar);
        this.popUpToRouteClass = cVar;
    }
}
