package com.waze.jni.protos.map;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.Polygon;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PolygonKt {
    public static final PolygonKt INSTANCE = new PolygonKt();

    private PolygonKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Polygon.Builder _builder;

        /* compiled from: WazeSource */
        public final class PositionProxy extends c {
            private PositionProxy() {
            }
        }

        private Dsl(Polygon.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Polygon _build() {
            Polygon polygonBuild = this._builder.build();
            x.e(polygonBuild, "build(...)");
            return polygonBuild;
        }

        public final /* synthetic */ void addAllPosition(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllPosition(iterable);
        }

        public final /* synthetic */ void addPosition(a aVar, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            this._builder.addPosition(intPosition);
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final /* synthetic */ void clearPosition(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearPosition();
        }

        public final int getId() {
            return this._builder.getId();
        }

        public final /* synthetic */ a getPosition() {
            List<Position.IntPosition> positionList = this._builder.getPositionList();
            x.e(positionList, "getPositionList(...)");
            return new a(positionList);
        }

        public final /* synthetic */ void plusAssignAllPosition(a<Position.IntPosition, PositionProxy> aVar, Iterable<Position.IntPosition> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllPosition(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignPosition(a<Position.IntPosition, PositionProxy> aVar, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            addPosition(aVar, intPosition);
        }

        public final void setId(int i2) {
            this._builder.setId(i2);
        }

        public final /* synthetic */ void setPosition(a aVar, int i2, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            this._builder.setPosition(i2, intPosition);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Polygon.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Polygon.Builder builder, o oVar) {
            this(builder);
        }
    }
}
