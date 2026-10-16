package com.waze.jni.protos;

import com.waze.jni.protos.Position;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class IntAreaKt {
    public static final IntAreaKt INSTANCE = new IntAreaKt();

    private IntAreaKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Position.IntArea.Builder _builder;

        private Dsl(Position.IntArea.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Position.IntArea _build() {
            Position.IntArea intAreaBuild = this._builder.build();
            x.e(intAreaBuild, "build(...)");
            return intAreaBuild;
        }

        public final void clearEast() {
            this._builder.clearEast();
        }

        public final void clearNorth() {
            this._builder.clearNorth();
        }

        public final void clearSouth() {
            this._builder.clearSouth();
        }

        public final void clearWest() {
            this._builder.clearWest();
        }

        public final int getEast() {
            return this._builder.getEast();
        }

        public final int getNorth() {
            return this._builder.getNorth();
        }

        public final int getSouth() {
            return this._builder.getSouth();
        }

        public final int getWest() {
            return this._builder.getWest();
        }

        public final void setEast(int i2) {
            this._builder.setEast(i2);
        }

        public final void setNorth(int i2) {
            this._builder.setNorth(i2);
        }

        public final void setSouth(int i2) {
            this._builder.setSouth(i2);
        }

        public final void setWest(int i2) {
            this._builder.setWest(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Position.IntArea.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Position.IntArea.Builder builder, o oVar) {
            this(builder);
        }
    }
}
