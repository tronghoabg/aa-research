package com.waze.jni.protos;

import com.waze.jni.protos.NavigationSegment;
import com.waze.jni.protos.Position;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationSegmentKt {
    public static final NavigationSegmentKt INSTANCE = new NavigationSegmentKt();

    private NavigationSegmentKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavigationSegment.Builder _builder;

        private Dsl(NavigationSegment.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavigationSegment _build() {
            NavigationSegment navigationSegmentBuild = this._builder.build();
            x.e(navigationSegmentBuild, "build(...)");
            return navigationSegmentBuild;
        }

        public final void clearFromCoordinate() {
            this._builder.clearFromCoordinate();
        }

        public final void clearFromNode() {
            this._builder.clearFromNode();
        }

        public final void clearIsReversed() {
            this._builder.clearIsReversed();
        }

        public final void clearLineId() {
            this._builder.clearLineId();
        }

        public final void clearTileId() {
            this._builder.clearTileId();
        }

        public final void clearToCoordinate() {
            this._builder.clearToCoordinate();
        }

        public final void clearToNode() {
            this._builder.clearToNode();
        }

        public final Position.IntPosition getFromCoordinate() {
            Position.IntPosition fromCoordinate = this._builder.getFromCoordinate();
            x.e(fromCoordinate, "getFromCoordinate(...)");
            return fromCoordinate;
        }

        public final Position.IntPosition getFromCoordinateOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NavigationSegmentKtKt.getFromCoordinateOrNull(dsl._builder);
        }

        public final int getFromNode() {
            return this._builder.getFromNode();
        }

        public final boolean getIsReversed() {
            return this._builder.getIsReversed();
        }

        public final int getLineId() {
            return this._builder.getLineId();
        }

        public final int getTileId() {
            return this._builder.getTileId();
        }

        public final Position.IntPosition getToCoordinate() {
            Position.IntPosition toCoordinate = this._builder.getToCoordinate();
            x.e(toCoordinate, "getToCoordinate(...)");
            return toCoordinate;
        }

        public final Position.IntPosition getToCoordinateOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NavigationSegmentKtKt.getToCoordinateOrNull(dsl._builder);
        }

        public final int getToNode() {
            return this._builder.getToNode();
        }

        public final boolean hasFromCoordinate() {
            return this._builder.hasFromCoordinate();
        }

        public final boolean hasFromNode() {
            return this._builder.hasFromNode();
        }

        public final boolean hasIsReversed() {
            return this._builder.hasIsReversed();
        }

        public final boolean hasLineId() {
            return this._builder.hasLineId();
        }

        public final boolean hasTileId() {
            return this._builder.hasTileId();
        }

        public final boolean hasToCoordinate() {
            return this._builder.hasToCoordinate();
        }

        public final boolean hasToNode() {
            return this._builder.hasToNode();
        }

        public final void setFromCoordinate(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setFromCoordinate(intPosition);
        }

        public final void setFromNode(int i2) {
            this._builder.setFromNode(i2);
        }

        public final void setIsReversed(boolean z) {
            this._builder.setIsReversed(z);
        }

        public final void setLineId(int i2) {
            this._builder.setLineId(i2);
        }

        public final void setTileId(int i2) {
            this._builder.setTileId(i2);
        }

        public final void setToCoordinate(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setToCoordinate(intPosition);
        }

        public final void setToNode(int i2) {
            this._builder.setToNode(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavigationSegment.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavigationSegment.Builder builder, o oVar) {
            this(builder);
        }
    }
}
