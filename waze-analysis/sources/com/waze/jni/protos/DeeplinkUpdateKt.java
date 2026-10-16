package com.waze.jni.protos;

import com.waze.jni.protos.DeeplinkUpdate;
import com.waze.jni.protos.Position;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DeeplinkUpdateKt {
    public static final DeeplinkUpdateKt INSTANCE = new DeeplinkUpdateKt();

    private DeeplinkUpdateKt() {
    }

    /* renamed from: -initializelocationSharing, reason: not valid java name */
    public final DeeplinkUpdate.LocationSharing m25044initializelocationSharing(l<? super LocationSharingKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        LocationSharingKt.Dsl.Companion companion = LocationSharingKt.Dsl.Companion;
        DeeplinkUpdate.LocationSharing.Builder builderNewBuilder = DeeplinkUpdate.LocationSharing.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        LocationSharingKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class LocationSharingKt {
        public static final LocationSharingKt INSTANCE = new LocationSharingKt();

        private LocationSharingKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final DeeplinkUpdate.LocationSharing.Builder _builder;

            private Dsl(DeeplinkUpdate.LocationSharing.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ DeeplinkUpdate.LocationSharing _build() {
                DeeplinkUpdate.LocationSharing locationSharingBuild = this._builder.build();
                x.e(locationSharingBuild, "build(...)");
                return locationSharingBuild;
            }

            public final void clearPosition() {
                this._builder.clearPosition();
            }

            public final Position.IntPosition getPosition() {
                Position.IntPosition position = this._builder.getPosition();
                x.e(position, "getPosition(...)");
                return position;
            }

            public final Position.IntPosition getPositionOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return DeeplinkUpdateKtKt.getPositionOrNull(dsl._builder);
            }

            public final boolean hasPosition() {
                return this._builder.hasPosition();
            }

            public final void setPosition(Position.IntPosition intPosition) {
                x.f(intPosition, "value");
                this._builder.setPosition(intPosition);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(DeeplinkUpdate.LocationSharing.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(DeeplinkUpdate.LocationSharing.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DeeplinkUpdate.Builder _builder;

        private Dsl(DeeplinkUpdate.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DeeplinkUpdate _build() {
            DeeplinkUpdate deeplinkUpdateBuild = this._builder.build();
            x.e(deeplinkUpdateBuild, "build(...)");
            return deeplinkUpdateBuild;
        }

        public final void clearAction() {
            this._builder.clearAction();
        }

        public final void clearLocationSharing() {
            this._builder.clearLocationSharing();
        }

        public final DeeplinkUpdate.ActionCase getActionCase() {
            DeeplinkUpdate.ActionCase actionCase = this._builder.getActionCase();
            x.e(actionCase, "getActionCase(...)");
            return actionCase;
        }

        public final DeeplinkUpdate.LocationSharing getLocationSharing() {
            DeeplinkUpdate.LocationSharing locationSharing = this._builder.getLocationSharing();
            x.e(locationSharing, "getLocationSharing(...)");
            return locationSharing;
        }

        public final boolean hasLocationSharing() {
            return this._builder.hasLocationSharing();
        }

        public final void setLocationSharing(DeeplinkUpdate.LocationSharing locationSharing) {
            x.f(locationSharing, "value");
            this._builder.setLocationSharing(locationSharing);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(DeeplinkUpdate.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(DeeplinkUpdate.Builder builder, o oVar) {
            this(builder);
        }
    }
}
