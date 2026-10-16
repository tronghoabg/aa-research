package com.waze.jni.protos.location;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.location.MatchedPositionProto;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MatchedPositionProtoKt {
    public static final MatchedPositionProtoKt INSTANCE = new MatchedPositionProtoKt();

    private MatchedPositionProtoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MatchedPositionProto.Builder _builder;

        private Dsl(MatchedPositionProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MatchedPositionProto _build() {
            MatchedPositionProto matchedPositionProtoBuild = this._builder.build();
            x.e(matchedPositionProtoBuild, "build(...)");
            return matchedPositionProtoBuild;
        }

        public final void clearAccuracyMeters() {
            this._builder.clearAccuracyMeters();
        }

        public final void clearFromNodeDbId() {
            this._builder.clearFromNodeDbId();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final void clearStreetName() {
            this._builder.clearStreetName();
        }

        public final void clearToNodeDbId() {
            this._builder.clearToNodeDbId();
        }

        public final double getAccuracyMeters() {
            return this._builder.getAccuracyMeters();
        }

        public final long getFromNodeDbId() {
            return this._builder.getFromNodeDbId();
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MatchedPositionProtoKtKt.getPositionOrNull(dsl._builder);
        }

        public final String getStreetName() {
            String streetName = this._builder.getStreetName();
            x.e(streetName, "getStreetName(...)");
            return streetName;
        }

        public final long getToNodeDbId() {
            return this._builder.getToNodeDbId();
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final boolean hasStreetName() {
            return this._builder.hasStreetName();
        }

        public final void setAccuracyMeters(double d2) {
            this._builder.setAccuracyMeters(d2);
        }

        public final void setFromNodeDbId(long j2) {
            this._builder.setFromNodeDbId(j2);
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        public final void setStreetName(String str) {
            x.f(str, "value");
            this._builder.setStreetName(str);
        }

        public final void setToNodeDbId(long j2) {
            this._builder.setToNodeDbId(j2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MatchedPositionProto.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MatchedPositionProto.Builder builder, o oVar) {
            this(builder);
        }
    }
}
