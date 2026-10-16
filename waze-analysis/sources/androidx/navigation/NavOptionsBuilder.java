package androidx.navigation;

import androidx.navigation.NavOptions;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;
import h.n.o;

/* compiled from: WazeSource */
@NavOptionsDsl
/* loaded from: classes3.dex */
public final class NavOptionsBuilder {
    private boolean inclusive;
    private boolean launchSingleTop;
    private String popUpToRoute;
    private c<?> popUpToRouteClass;
    private Object popUpToRouteObject;
    private boolean restoreState;
    private boolean saveState;
    private final NavOptions.Builder builder = new NavOptions.Builder();
    private int popUpToId = -1;

    public static /* synthetic */ void getPopUpTo$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l<PopUpToBuilder, ab>() { // from class: androidx.navigation.NavOptionsBuilder.popUpTo.3
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(PopUpToBuilder popUpToBuilder) {
                    invoke2(popUpToBuilder);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PopUpToBuilder popUpToBuilder) {
                    x.f(popUpToBuilder, "<this>");
                }
            };
        }
        x.f(lVar, "popUpToBuilder");
        x.i();
        int i3 = ar.f48106a;
        navOptionsBuilder.popUpTo((c) new m(Object.class), (l<? super PopUpToBuilder, ab>) lVar);
    }

    static final ab popUpTo$lambda$0(PopUpToBuilder popUpToBuilder) {
        x.f(popUpToBuilder, "<this>");
        return ab.f48028a;
    }

    static final ab popUpTo$lambda$1(PopUpToBuilder popUpToBuilder) {
        x.f(popUpToBuilder, "<this>");
        return ab.f48028a;
    }

    static final ab popUpTo$lambda$2(PopUpToBuilder popUpToBuilder) {
        x.f(popUpToBuilder, "<this>");
        return ab.f48028a;
    }

    private final void setPopUpToRoute(String str) {
        if (str != null) {
            if (o.G(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    private final void setPopUpToRouteClass(c<?> cVar) {
        if (cVar != null) {
            this.popUpToRouteClass = cVar;
            this.inclusive = false;
        }
    }

    private final void setPopUpToRouteObject(Object obj) {
        if (obj != null) {
            this.popUpToRouteObject = obj;
            this.inclusive = false;
        }
    }

    public final void anim(l<? super AnimBuilder, ab> lVar) {
        x.f(lVar, "animBuilder");
        AnimBuilder animBuilder = new AnimBuilder();
        lVar.invoke(animBuilder);
        int enter = animBuilder.getEnter();
        NavOptions.Builder builder = this.builder;
        builder.setEnterAnim(enter);
        builder.setExitAnim(animBuilder.getExit());
        builder.setPopEnterAnim(animBuilder.getPopEnter());
        builder.setPopExitAnim(animBuilder.getPopExit());
    }

    public final NavOptions build$navigation_common() {
        NavOptions.Builder builder = this.builder;
        builder.setLaunchSingleTop(this.launchSingleTop);
        builder.setRestoreState(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            builder.setPopUpTo(str, this.inclusive, this.saveState);
        } else {
            c<?> cVar = this.popUpToRouteClass;
            if (cVar != null) {
                builder.setPopUpTo((c) cVar, this.inclusive, this.saveState);
            } else {
                Object obj = this.popUpToRouteObject;
                if (obj != null) {
                    builder.setPopUpTo((NavOptions.Builder) obj, this.inclusive, this.saveState);
                } else {
                    builder.setPopUpTo(this.popUpToId, this.inclusive, this.saveState);
                }
            }
        }
        return builder.build();
    }

    public final boolean getLaunchSingleTop() {
        return this.launchSingleTop;
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

    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public final <T> void popUpTo(T t, l<? super PopUpToBuilder, ab> lVar) {
        x.f(t, "route");
        x.f(lVar, "popUpToBuilder");
        setPopUpToRouteObject(t);
        setPopUpToId$navigation_common(-1);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
        lVar.invoke(popUpToBuilder);
        this.inclusive = popUpToBuilder.getInclusive();
        this.saveState = popUpToBuilder.getSaveState();
    }

    public final void setLaunchSingleTop(boolean z) {
        this.launchSingleTop = z;
    }

    public final void setPopUpTo(int i2) {
        popUpTo$default(this, i2, (l) null, 2, (Object) null);
    }

    public final void setPopUpToId$navigation_common(int i2) {
        this.popUpToId = i2;
        this.inclusive = false;
    }

    public final void setRestoreState(boolean z) {
        this.restoreState = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, Object obj, l lVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            lVar = new l() { // from class: androidx.navigation.NavOptionsBuilder$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj3) {
                    return NavOptionsBuilder.popUpTo$lambda$2((PopUpToBuilder) obj3);
                }
            };
        }
        navOptionsBuilder.popUpTo((NavOptionsBuilder) obj, (l<? super PopUpToBuilder, ab>) lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, String str, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = new l() { // from class: androidx.navigation.NavOptionsBuilder$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return NavOptionsBuilder.popUpTo$lambda$1((PopUpToBuilder) obj2);
                }
            };
        }
        navOptionsBuilder.popUpTo(str, (l<? super PopUpToBuilder, ab>) lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, int i2, l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            lVar = new l() { // from class: androidx.navigation.NavOptionsBuilder$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return NavOptionsBuilder.popUpTo$lambda$0((PopUpToBuilder) obj2);
                }
            };
        }
        navOptionsBuilder.popUpTo(i2, (l<? super PopUpToBuilder, ab>) lVar);
    }

    public final void popUpTo(int i2, l<? super PopUpToBuilder, ab> lVar) {
        x.f(lVar, "popUpToBuilder");
        setPopUpToId$navigation_common(i2);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
        lVar.invoke(popUpToBuilder);
        this.inclusive = popUpToBuilder.getInclusive();
        this.saveState = popUpToBuilder.getSaveState();
    }

    public final void popUpTo(String str, l<? super PopUpToBuilder, ab> lVar) {
        x.f(str, "route");
        x.f(lVar, "popUpToBuilder");
        setPopUpToRoute(str);
        setPopUpToId$navigation_common(-1);
        PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
        lVar.invoke(popUpToBuilder);
        this.inclusive = popUpToBuilder.getInclusive();
        this.saveState = popUpToBuilder.getSaveState();
    }

    public final /* synthetic */ <T> void popUpTo(l<? super PopUpToBuilder, ab> lVar) {
        x.f(lVar, "popUpToBuilder");
        x.i();
        int i2 = ar.f48106a;
        popUpTo((c) new m(Object.class), lVar);
    }

    public final <T> void popUpTo(c<T> cVar, l<? super PopUpToBuilder, ab> lVar) {
        x.f(cVar, "route");
        x.f(lVar, "popUpToBuilder");
        setPopUpToRouteClass(cVar);
        setPopUpToId$navigation_common(-1);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
        lVar.invoke(popUpToBuilder);
        this.inclusive = popUpToBuilder.getInclusive();
        this.saveState = popUpToBuilder.getSaveState();
    }
}
