package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.ParkedHere;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ParkedHereKt {
    public static final ParkedHereKt INSTANCE = new ParkedHereKt();

    private ParkedHereKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ParkedHere.Builder _builder;

        private Dsl(ParkedHere.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ParkedHere _build() {
            ParkedHere parkedHereBuild = this._builder.build();
            x.e(parkedHereBuild, "build(...)");
            return parkedHereBuild;
        }

        public final void clearLatitude() {
            this._builder.clearLatitude();
        }

        public final void clearLongitude() {
            this._builder.clearLongitude();
        }

        public final void clearReason() {
            this._builder.clearReason();
        }

        public final void clearShowPopup() {
            this._builder.clearShowPopup();
        }

        public final int getLatitude() {
            return this._builder.getLatitude();
        }

        public final int getLongitude() {
            return this._builder.getLongitude();
        }

        public final ParkedHereSetReason getReason() {
            ParkedHereSetReason reason = this._builder.getReason();
            x.e(reason, "getReason(...)");
            return reason;
        }

        public final int getReasonValue() {
            return this._builder.getReasonValue();
        }

        public final boolean getShowPopup() {
            return this._builder.getShowPopup();
        }

        public final void setLatitude(int i2) {
            this._builder.setLatitude(i2);
        }

        public final void setLongitude(int i2) {
            this._builder.setLongitude(i2);
        }

        public final void setReason(ParkedHereSetReason parkedHereSetReason) {
            x.f(parkedHereSetReason, "value");
            this._builder.setReason(parkedHereSetReason);
        }

        public final void setReasonValue(int i2) {
            this._builder.setReasonValue(i2);
        }

        public final void setShowPopup(boolean z) {
            this._builder.setShowPopup(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ParkedHere.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ParkedHere.Builder builder, o oVar) {
            this(builder);
        }
    }
}
