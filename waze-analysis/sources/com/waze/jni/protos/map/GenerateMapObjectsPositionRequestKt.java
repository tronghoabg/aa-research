package com.waze.jni.protos.map;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.GenerateMapObjectsPositionRequest;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenerateMapObjectsPositionRequestKt {
    public static final GenerateMapObjectsPositionRequestKt INSTANCE = new GenerateMapObjectsPositionRequestKt();

    private GenerateMapObjectsPositionRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GenerateMapObjectsPositionRequest.Builder _builder;

        /* compiled from: WazeSource */
        public final class CoordinatesToBeFarFromProxy extends c {
            private CoordinatesToBeFarFromProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class PolylinesProxy extends c {
            private PolylinesProxy() {
            }
        }

        private Dsl(GenerateMapObjectsPositionRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ GenerateMapObjectsPositionRequest _build() {
            GenerateMapObjectsPositionRequest generateMapObjectsPositionRequestBuild = this._builder.build();
            x.e(generateMapObjectsPositionRequestBuild, "build(...)");
            return generateMapObjectsPositionRequestBuild;
        }

        public final /* synthetic */ void addAllCoordinatesToBeFarFrom(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllCoordinatesToBeFarFrom(iterable);
        }

        public final /* synthetic */ void addAllPolylines(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllPolylines(iterable);
        }

        public final /* synthetic */ void addCoordinatesToBeFarFrom(a aVar, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            this._builder.addCoordinatesToBeFarFrom(intPosition);
        }

        public final /* synthetic */ void addPolylines(a aVar, Polyline polyline) {
            x.f(aVar, "<this>");
            x.f(polyline, "value");
            this._builder.addPolylines(polyline);
        }

        public final /* synthetic */ void clearCoordinatesToBeFarFrom(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearCoordinatesToBeFarFrom();
        }

        public final /* synthetic */ void clearPolylines(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearPolylines();
        }

        public final /* synthetic */ a getCoordinatesToBeFarFrom() {
            List<Position.IntPosition> coordinatesToBeFarFromList = this._builder.getCoordinatesToBeFarFromList();
            x.e(coordinatesToBeFarFromList, "getCoordinatesToBeFarFromList(...)");
            return new a(coordinatesToBeFarFromList);
        }

        public final /* synthetic */ a getPolylines() {
            List<Polyline> polylinesList = this._builder.getPolylinesList();
            x.e(polylinesList, "getPolylinesList(...)");
            return new a(polylinesList);
        }

        public final /* synthetic */ void plusAssignAllCoordinatesToBeFarFrom(a<Position.IntPosition, CoordinatesToBeFarFromProxy> aVar, Iterable<Position.IntPosition> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllCoordinatesToBeFarFrom(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllPolylines(a<Polyline, PolylinesProxy> aVar, Iterable<Polyline> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllPolylines(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignCoordinatesToBeFarFrom(a<Position.IntPosition, CoordinatesToBeFarFromProxy> aVar, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            addCoordinatesToBeFarFrom(aVar, intPosition);
        }

        public final /* synthetic */ void plusAssignPolylines(a<Polyline, PolylinesProxy> aVar, Polyline polyline) {
            x.f(aVar, "<this>");
            x.f(polyline, "value");
            addPolylines(aVar, polyline);
        }

        public final /* synthetic */ void setCoordinatesToBeFarFrom(a aVar, int i2, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            this._builder.setCoordinatesToBeFarFrom(i2, intPosition);
        }

        public final /* synthetic */ void setPolylines(a aVar, int i2, Polyline polyline) {
            x.f(aVar, "<this>");
            x.f(polyline, "value");
            this._builder.setPolylines(i2, polyline);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(GenerateMapObjectsPositionRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(GenerateMapObjectsPositionRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
