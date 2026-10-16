package com.waze.jni.protos.canvas;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.canvas.BoundsAndViewport;
import com.waze.jni.protos.map.RelativeViewPort;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class BoundsAndViewportKt {
    public static final BoundsAndViewportKt INSTANCE = new BoundsAndViewportKt();

    private BoundsAndViewportKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BoundsAndViewport.Builder _builder;

        /* compiled from: WazeSource */
        public final class ViewportCornersPolygonProxy extends c {
            private ViewportCornersPolygonProxy() {
            }
        }

        private Dsl(BoundsAndViewport.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ BoundsAndViewport _build() {
            BoundsAndViewport boundsAndViewportBuild = this._builder.build();
            x.e(boundsAndViewportBuild, "build(...)");
            return boundsAndViewportBuild;
        }

        public final /* synthetic */ void addAllViewportCornersPolygon(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllViewportCornersPolygon(iterable);
        }

        public final /* synthetic */ void addViewportCornersPolygon(a aVar, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            this._builder.addViewportCornersPolygon(intPosition);
        }

        public final void clearViewport() {
            this._builder.clearViewport();
        }

        public final /* synthetic */ void clearViewportCornersPolygon(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearViewportCornersPolygon();
        }

        public final RelativeViewPort getViewport() {
            RelativeViewPort viewport = this._builder.getViewport();
            x.e(viewport, "getViewport(...)");
            return viewport;
        }

        public final /* synthetic */ a getViewportCornersPolygon() {
            List<Position.IntPosition> viewportCornersPolygonList = this._builder.getViewportCornersPolygonList();
            x.e(viewportCornersPolygonList, "getViewportCornersPolygonList(...)");
            return new a(viewportCornersPolygonList);
        }

        public final RelativeViewPort getViewportOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return BoundsAndViewportKtKt.getViewportOrNull(dsl._builder);
        }

        public final boolean hasViewport() {
            return this._builder.hasViewport();
        }

        public final /* synthetic */ void plusAssignAllViewportCornersPolygon(a<Position.IntPosition, ViewportCornersPolygonProxy> aVar, Iterable<Position.IntPosition> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllViewportCornersPolygon(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignViewportCornersPolygon(a<Position.IntPosition, ViewportCornersPolygonProxy> aVar, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            addViewportCornersPolygon(aVar, intPosition);
        }

        public final void setViewport(RelativeViewPort relativeViewPort) {
            x.f(relativeViewPort, "value");
            this._builder.setViewport(relativeViewPort);
        }

        public final /* synthetic */ void setViewportCornersPolygon(a aVar, int i2, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            this._builder.setViewportCornersPolygon(i2, intPosition);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(BoundsAndViewport.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(BoundsAndViewport.Builder builder, o oVar) {
            this(builder);
        }
    }
}
