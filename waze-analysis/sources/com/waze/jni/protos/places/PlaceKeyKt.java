package com.waze.jni.protos.places;

import com.waze.jni.protos.places.PlaceKey;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PlaceKeyKt {
    public static final PlaceKeyKt INSTANCE = new PlaceKeyKt();

    private PlaceKeyKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PlaceKey.Builder _builder;

        private Dsl(PlaceKey.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ PlaceKey _build() {
            PlaceKey placeKeyBuild = this._builder.build();
            x.e(placeKeyBuild, "build(...)");
            return placeKeyBuild;
        }

        public final void clearDbId() {
            this._builder.clearDbId();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final int getDbId() {
            return this._builder.getDbId();
        }

        public final PlaceKey.Type getType() {
            PlaceKey.Type type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setDbId(int i2) {
            this._builder.setDbId(i2);
        }

        public final void setType(PlaceKey.Type type) {
            x.f(type, "value");
            this._builder.setType(type);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(PlaceKey.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(PlaceKey.Builder builder, o oVar) {
            this(builder);
        }
    }
}
