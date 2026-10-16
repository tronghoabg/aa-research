package com.waze.jni.protos;

import com.waze.jni.protos.Position;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class IntPositionKt {
    public static final IntPositionKt INSTANCE = new IntPositionKt();

    private IntPositionKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Position.IntPosition.Builder _builder;

        private Dsl(Position.IntPosition.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Position.IntPosition _build() {
            Position.IntPosition intPositionBuild = this._builder.build();
            x.e(intPositionBuild, "build(...)");
            return intPositionBuild;
        }

        public final void clearAltitude() {
            this._builder.clearAltitude();
        }

        public final void clearLatitude() {
            this._builder.clearLatitude();
        }

        public final void clearLongitude() {
            this._builder.clearLongitude();
        }

        public final int getAltitude() {
            return this._builder.getAltitude();
        }

        public final int getLatitude() {
            return this._builder.getLatitude();
        }

        public final int getLongitude() {
            return this._builder.getLongitude();
        }

        public final boolean hasAltitude() {
            return this._builder.hasAltitude();
        }

        public final void setAltitude(int i2) {
            this._builder.setAltitude(i2);
        }

        public final void setLatitude(int i2) {
            this._builder.setLatitude(i2);
        }

        public final void setLongitude(int i2) {
            this._builder.setLongitude(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Position.IntPosition.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Position.IntPosition.Builder builder, o oVar) {
            this(builder);
        }
    }
}
