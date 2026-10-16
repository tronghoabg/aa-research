package com.waze.jni.protos.map;

import com.waze.jni.protos.map.RelativeViewPort;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RelativeViewPortKt {
    public static final RelativeViewPortKt INSTANCE = new RelativeViewPortKt();

    private RelativeViewPortKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RelativeViewPort.Builder _builder;

        private Dsl(RelativeViewPort.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RelativeViewPort _build() {
            RelativeViewPort relativeViewPortBuild = this._builder.build();
            x.e(relativeViewPortBuild, "build(...)");
            return relativeViewPortBuild;
        }

        public final void clearHeight() {
            this._builder.clearHeight();
        }

        public final void clearOffsetX() {
            this._builder.clearOffsetX();
        }

        public final void clearOffsetY() {
            this._builder.clearOffsetY();
        }

        public final void clearWidth() {
            this._builder.clearWidth();
        }

        public final float getHeight() {
            return this._builder.getHeight();
        }

        public final float getOffsetX() {
            return this._builder.getOffsetX();
        }

        public final float getOffsetY() {
            return this._builder.getOffsetY();
        }

        public final float getWidth() {
            return this._builder.getWidth();
        }

        public final void setHeight(float f2) {
            this._builder.setHeight(f2);
        }

        public final void setOffsetX(float f2) {
            this._builder.setOffsetX(f2);
        }

        public final void setOffsetY(float f2) {
            this._builder.setOffsetY(f2);
        }

        public final void setWidth(float f2) {
            this._builder.setWidth(f2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RelativeViewPort.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RelativeViewPort.Builder builder, o oVar) {
            this(builder);
        }
    }
}
