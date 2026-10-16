package com.waze.jni.protos.navigate;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.navigate.NavigationLane;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationLaneKt {
    public static final NavigationLaneKt INSTANCE = new NavigationLaneKt();

    private NavigationLaneKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavigationLane.Builder _builder;

        /* compiled from: WazeSource */
        public final class AngleProxy extends c {
            private AngleProxy() {
            }
        }

        private Dsl(NavigationLane.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavigationLane _build() {
            NavigationLane navigationLaneBuild = this._builder.build();
            x.e(navigationLaneBuild, "build(...)");
            return navigationLaneBuild;
        }

        public final /* synthetic */ void addAllAngle(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllAngle(iterable);
        }

        public final /* synthetic */ void addAngle(a aVar, NavigationLaneAngle navigationLaneAngle) {
            x.f(aVar, "<this>");
            x.f(navigationLaneAngle, "value");
            this._builder.addAngle(navigationLaneAngle);
        }

        public final /* synthetic */ void clearAngle(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearAngle();
        }

        public final void clearIndex() {
            this._builder.clearIndex();
        }

        public final /* synthetic */ a getAngle() {
            List<NavigationLaneAngle> angleList = this._builder.getAngleList();
            x.e(angleList, "getAngleList(...)");
            return new a(angleList);
        }

        public final int getIndex() {
            return this._builder.getIndex();
        }

        public final /* synthetic */ void plusAssignAllAngle(a<NavigationLaneAngle, AngleProxy> aVar, Iterable<NavigationLaneAngle> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllAngle(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAngle(a<NavigationLaneAngle, AngleProxy> aVar, NavigationLaneAngle navigationLaneAngle) {
            x.f(aVar, "<this>");
            x.f(navigationLaneAngle, "value");
            addAngle(aVar, navigationLaneAngle);
        }

        public final /* synthetic */ void setAngle(a aVar, int i2, NavigationLaneAngle navigationLaneAngle) {
            x.f(aVar, "<this>");
            x.f(navigationLaneAngle, "value");
            this._builder.setAngle(i2, navigationLaneAngle);
        }

        public final void setIndex(int i2) {
            this._builder.setIndex(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavigationLane.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavigationLane.Builder builder, o oVar) {
            this(builder);
        }
    }
}
