package com.waze.jni.protos.map;

import com.waze.jni.protos.map.ExtendedPolygon;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ExtendedPolygonKt {
    public static final ExtendedPolygonKt INSTANCE = new ExtendedPolygonKt();

    private ExtendedPolygonKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ExtendedPolygon.Builder _builder;

        private Dsl(ExtendedPolygon.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ExtendedPolygon _build() {
            ExtendedPolygon extendedPolygonBuild = this._builder.build();
            x.e(extendedPolygonBuild, "build(...)");
            return extendedPolygonBuild;
        }

        public final void clearLabel() {
            this._builder.clearLabel();
        }

        public final void clearPolygon() {
            this._builder.clearPolygon();
        }

        public final void clearStyle() {
            this._builder.clearStyle();
        }

        public final String getLabel() {
            String label = this._builder.getLabel();
            x.e(label, "getLabel(...)");
            return label;
        }

        public final Polygon getPolygon() {
            Polygon polygon = this._builder.getPolygon();
            x.e(polygon, "getPolygon(...)");
            return polygon;
        }

        public final Polygon getPolygonOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ExtendedPolygonKtKt.getPolygonOrNull(dsl._builder);
        }

        public final ExtendedPolygon.Style getStyle() {
            ExtendedPolygon.Style style = this._builder.getStyle();
            x.e(style, "getStyle(...)");
            return style;
        }

        public final int getStyleValue() {
            return this._builder.getStyleValue();
        }

        public final boolean hasLabel() {
            return this._builder.hasLabel();
        }

        public final boolean hasPolygon() {
            return this._builder.hasPolygon();
        }

        public final void setLabel(String str) {
            x.f(str, "value");
            this._builder.setLabel(str);
        }

        public final void setPolygon(Polygon polygon) {
            x.f(polygon, "value");
            this._builder.setPolygon(polygon);
        }

        public final void setStyle(ExtendedPolygon.Style style) {
            x.f(style, "value");
            this._builder.setStyle(style);
        }

        public final void setStyleValue(int i2) {
            this._builder.setStyleValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ExtendedPolygon.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ExtendedPolygon.Builder builder, o oVar) {
            this(builder);
        }
    }
}
