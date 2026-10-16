package com.waze.jni.protos.navigate;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.navigate.NavigationLaneList;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationLaneListKt {
    public static final NavigationLaneListKt INSTANCE = new NavigationLaneListKt();

    private NavigationLaneListKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavigationLaneList.Builder _builder;

        /* compiled from: WazeSource */
        public final class NavigationLaneProxy extends c {
            private NavigationLaneProxy() {
            }
        }

        private Dsl(NavigationLaneList.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavigationLaneList _build() {
            NavigationLaneList navigationLaneListBuild = this._builder.build();
            x.e(navigationLaneListBuild, "build(...)");
            return navigationLaneListBuild;
        }

        public final /* synthetic */ void addAllNavigationLane(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllNavigationLane(iterable);
        }

        public final /* synthetic */ void addNavigationLane(a aVar, NavigationLane navigationLane) {
            x.f(aVar, "<this>");
            x.f(navigationLane, "value");
            this._builder.addNavigationLane(navigationLane);
        }

        public final /* synthetic */ void clearNavigationLane(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearNavigationLane();
        }

        public final /* synthetic */ a getNavigationLane() {
            List<NavigationLane> navigationLaneList = this._builder.getNavigationLaneList();
            x.e(navigationLaneList, "getNavigationLaneList(...)");
            return new a(navigationLaneList);
        }

        public final /* synthetic */ void plusAssignAllNavigationLane(a<NavigationLane, NavigationLaneProxy> aVar, Iterable<NavigationLane> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllNavigationLane(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignNavigationLane(a<NavigationLane, NavigationLaneProxy> aVar, NavigationLane navigationLane) {
            x.f(aVar, "<this>");
            x.f(navigationLane, "value");
            addNavigationLane(aVar, navigationLane);
        }

        public final /* synthetic */ void setNavigationLane(a aVar, int i2, NavigationLane navigationLane) {
            x.f(aVar, "<this>");
            x.f(navigationLane, "value");
            this._builder.setNavigationLane(i2, navigationLane);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavigationLaneList.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavigationLaneList.Builder builder, o oVar) {
            this(builder);
        }
    }
}
