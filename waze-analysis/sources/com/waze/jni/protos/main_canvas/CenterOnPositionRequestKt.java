package com.waze.jni.protos.main_canvas;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.main_canvas.CenterOnPositionRequest;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CenterOnPositionRequestKt {
    public static final CenterOnPositionRequestKt INSTANCE = new CenterOnPositionRequestKt();

    private CenterOnPositionRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CenterOnPositionRequest.Builder _builder;

        private Dsl(CenterOnPositionRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CenterOnPositionRequest _build() {
            CenterOnPositionRequest centerOnPositionRequestBuild = this._builder.build();
            x.e(centerOnPositionRequestBuild, "build(...)");
            return centerOnPositionRequestBuild;
        }

        public final void clearAnimated() {
            this._builder.clearAnimated();
        }

        public final void clearOrientationDegrees() {
            this._builder.clearOrientationDegrees();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final void clearZoom() {
            this._builder.clearZoom();
        }

        public final boolean getAnimated() {
            return this._builder.getAnimated();
        }

        public final float getOrientationDegrees() {
            return this._builder.getOrientationDegrees();
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return CenterOnPositionRequestKtKt.getPositionOrNull(dsl._builder);
        }

        public final float getZoom() {
            return this._builder.getZoom();
        }

        public final boolean hasOrientationDegrees() {
            return this._builder.hasOrientationDegrees();
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final void setAnimated(boolean z) {
            this._builder.setAnimated(z);
        }

        public final void setOrientationDegrees(float f2) {
            this._builder.setOrientationDegrees(f2);
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        public final void setZoom(float f2) {
            this._builder.setZoom(f2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CenterOnPositionRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CenterOnPositionRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
