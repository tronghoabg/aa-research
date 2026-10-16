package com.waze.jni.protos.location;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.location.ProviderPosition;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ProviderPositionKt {
    public static final ProviderPositionKt INSTANCE = new ProviderPositionKt();

    private ProviderPositionKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ProviderPosition.Builder _builder;

        private Dsl(ProviderPosition.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ProviderPosition _build() {
            ProviderPosition providerPositionBuild = this._builder.build();
            x.e(providerPositionBuild, "build(...)");
            return providerPositionBuild;
        }

        public final void clearAccuracy() {
            this._builder.clearAccuracy();
        }

        public final void clearLastUpdateTimeEpochSeconds() {
            this._builder.clearLastUpdateTimeEpochSeconds();
        }

        public final void clearMatcherInfo() {
            this._builder.clearMatcherInfo();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final void clearProvider() {
            this._builder.clearProvider();
        }

        public final void clearSpeed() {
            this._builder.clearSpeed();
        }

        public final void clearSteering() {
            this._builder.clearSteering();
        }

        public final int getAccuracy() {
            return this._builder.getAccuracy();
        }

        public final long getLastUpdateTimeEpochSeconds() {
            return this._builder.getLastUpdateTimeEpochSeconds();
        }

        public final MatchedPositionProto getMatcherInfo() {
            MatchedPositionProto matcherInfo = this._builder.getMatcherInfo();
            x.e(matcherInfo, "getMatcherInfo(...)");
            return matcherInfo;
        }

        public final MatchedPositionProto getMatcherInfoOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ProviderPositionKtKt.getMatcherInfoOrNull(dsl._builder);
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ProviderPositionKtKt.getPositionOrNull(dsl._builder);
        }

        public final ProviderPosition.LocProvider getProvider() {
            ProviderPosition.LocProvider provider = this._builder.getProvider();
            x.e(provider, "getProvider(...)");
            return provider;
        }

        public final int getProviderValue() {
            return this._builder.getProviderValue();
        }

        public final int getSpeed() {
            return this._builder.getSpeed();
        }

        public final int getSteering() {
            return this._builder.getSteering();
        }

        public final boolean hasMatcherInfo() {
            return this._builder.hasMatcherInfo();
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final void setAccuracy(int i2) {
            this._builder.setAccuracy(i2);
        }

        public final void setLastUpdateTimeEpochSeconds(long j2) {
            this._builder.setLastUpdateTimeEpochSeconds(j2);
        }

        public final void setMatcherInfo(MatchedPositionProto matchedPositionProto) {
            x.f(matchedPositionProto, "value");
            this._builder.setMatcherInfo(matchedPositionProto);
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        public final void setProvider(ProviderPosition.LocProvider locProvider) {
            x.f(locProvider, "value");
            this._builder.setProvider(locProvider);
        }

        public final void setProviderValue(int i2) {
            this._builder.setProviderValue(i2);
        }

        public final void setSpeed(int i2) {
            this._builder.setSpeed(i2);
        }

        public final void setSteering(int i2) {
            this._builder.setSteering(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ProviderPosition.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ProviderPosition.Builder builder, o oVar) {
            this(builder);
        }
    }
}
