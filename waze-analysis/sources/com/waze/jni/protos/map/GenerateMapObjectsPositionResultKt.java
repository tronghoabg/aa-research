package com.waze.jni.protos.map;

import com.google.v.b.b;
import com.google.v.b.c;
import com.waze.jni.protos.map.GenerateMapObjectsPositionResult;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenerateMapObjectsPositionResultKt {
    public static final GenerateMapObjectsPositionResultKt INSTANCE = new GenerateMapObjectsPositionResultKt();

    private GenerateMapObjectsPositionResultKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GenerateMapObjectsPositionResult.Builder _builder;

        /* compiled from: WazeSource */
        public final class ResultProxy extends c {
            private ResultProxy() {
            }
        }

        private Dsl(GenerateMapObjectsPositionResult.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ GenerateMapObjectsPositionResult _build() {
            GenerateMapObjectsPositionResult generateMapObjectsPositionResultBuild = this._builder.build();
            x.e(generateMapObjectsPositionResultBuild, "build(...)");
            return generateMapObjectsPositionResultBuild;
        }

        public final /* synthetic */ void clearResult(b bVar) {
            x.f(bVar, "<this>");
            this._builder.clearResult();
        }

        public final /* synthetic */ b getResultMap() {
            Map<Long, RouteEtaLabelPositionAndAlignment> resultMap = this._builder.getResultMap();
            x.e(resultMap, "getResultMap(...)");
            return new b(resultMap);
        }

        public final /* synthetic */ void putAllResult(b bVar, Map map) {
            x.f(bVar, "<this>");
            x.f(map, "map");
            this._builder.putAllResult(map);
        }

        public final void putResult(b<Long, RouteEtaLabelPositionAndAlignment, ResultProxy> bVar, long j2, RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignment) {
            x.f(bVar, "<this>");
            x.f(routeEtaLabelPositionAndAlignment, "value");
            this._builder.putResult(j2, routeEtaLabelPositionAndAlignment);
        }

        public final /* synthetic */ void removeResult(b bVar, long j2) {
            x.f(bVar, "<this>");
            this._builder.removeResult(j2);
        }

        public final /* synthetic */ void setResult(b<Long, RouteEtaLabelPositionAndAlignment, ResultProxy> bVar, long j2, RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignment) {
            x.f(bVar, "<this>");
            x.f(routeEtaLabelPositionAndAlignment, "value");
            putResult(bVar, j2, routeEtaLabelPositionAndAlignment);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(GenerateMapObjectsPositionResult.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(GenerateMapObjectsPositionResult.Builder builder, o oVar) {
            this(builder);
        }
    }
}
