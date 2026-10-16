package com.waze.jni.protos.map;

import com.waze.jni.protos.map.PoiClicked;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PoiClickedKt {
    public static final PoiClickedKt INSTANCE = new PoiClickedKt();

    private PoiClickedKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PoiClicked.Builder _builder;

        private Dsl(PoiClicked.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ PoiClicked _build() {
            PoiClicked poiClickedBuild = this._builder.build();
            x.e(poiClickedBuild, "build(...)");
            return poiClickedBuild;
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final ClickedPoiType getType() {
            ClickedPoiType type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setType(ClickedPoiType clickedPoiType) {
            x.f(clickedPoiType, "value");
            this._builder.setType(clickedPoiType);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(PoiClicked.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(PoiClicked.Builder builder, o oVar) {
            this(builder);
        }
    }
}
