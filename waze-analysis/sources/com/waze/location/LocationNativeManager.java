package com.waze.location;

import com.waze.gw.Gateway;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.location.MatchedPositionProto;
import com.waze.jni.protos.location.ProviderPosition;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LocationNativeManager extends ae {
    public static final int $stable;
    public static final LocationNativeManager INSTANCE = new LocationNativeManager();
    private static com.waze.sharedui.e.c latestSavedLocation;
    private static final ch<com.waze.sharedui.e.c> locationStateFlow;
    private static final kotlinx.coroutines.b.bn<com.waze.sharedui.e.c> mutableLocation;

    static {
        kotlinx.coroutines.b.bn<com.waze.sharedui.e.c> bnVarB = ck.b(null);
        mutableLocation = bnVarB;
        locationStateFlow = kotlinx.coroutines.b.ai.U(bnVarB);
        $stable = 8;
    }

    private LocationNativeManager() {
    }

    private final native void initNativeLayerNTV();

    private final void initializeSavedLocation() {
        getSavedLocation(new aa(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final h.ab initializeSavedLocation$lambda$0(byte[] bArr) {
        com.waze.sharedui.e.c wazeLocation;
        LocationNativeManager locationNativeManager = INSTANCE;
        if (bArr != null) {
            try {
                ProviderPosition providerPositionBuild = ((ProviderPosition.Builder) ProviderPosition.newBuilder().mergeFrom(bArr)).build();
                h.g.b.x.e(providerPositionBuild, "build(...)");
                wazeLocation = locationNativeManager.toWazeLocation(providerPositionBuild);
            } catch (Throwable th) {
                e.b.c.a(th);
            }
        } else {
            wazeLocation = null;
        }
        latestSavedLocation = wazeLocation;
        return h.ab.f48028a;
    }

    private final com.waze.shared_infra.h.c toCoordinate(Position.IntPosition intPosition) {
        return new com.waze.shared_infra.h.c(intPosition.getLatitude(), intPosition.getLongitude());
    }

    private final com.waze.sharedui.e.a toMatchedPosition(MatchedPositionProto matchedPositionProto) {
        com.waze.sharedui.e.b bVar = (((matchedPositionProto.getFromNodeDbId() > (-1L) ? 1 : (matchedPositionProto.getFromNodeDbId() == (-1L) ? 0 : -1)) == 0 || (matchedPositionProto.getToNodeDbId() > (-1L) ? 1 : (matchedPositionProto.getToNodeDbId() == (-1L) ? 0 : -1)) == 0) ? null : matchedPositionProto) != null ? new com.waze.sharedui.e.b(matchedPositionProto.getFromNodeDbId(), matchedPositionProto.getToNodeDbId()) : null;
        Position.IntPosition position = matchedPositionProto.getPosition();
        h.g.b.x.e(position, "getPosition(...)");
        com.waze.shared_infra.h.c coordinate = toCoordinate(position);
        int accuracyMeters = (int) matchedPositionProto.getAccuracyMeters();
        if (true != matchedPositionProto.hasStreetName()) {
            matchedPositionProto = null;
        }
        return new com.waze.sharedui.e.a(coordinate, accuracyMeters, bVar, matchedPositionProto != null ? matchedPositionProto.getStreetName() : null);
    }

    private final com.waze.sharedui.e.d toProvider(ProviderPosition.LocProvider locProvider) {
        ProviderPosition.LocProvider locProvider2 = ProviderPosition.LocProvider.UNKNOWN;
        switch (locProvider) {
            case UNKNOWN:
                return com.waze.sharedui.e.d.f38877a;
            case GPS:
                return com.waze.sharedui.e.d.f38878b;
            case ANY:
                return com.waze.sharedui.e.d.f38880d;
            case NETWORK:
                return com.waze.sharedui.e.d.f38881e;
            case CSV:
                return com.waze.sharedui.e.d.f38882f;
            case BEACON:
                return com.waze.sharedui.e.d.f38883g;
            case UNRECOGNIZED:
                return com.waze.sharedui.e.d.f38877a;
            default:
                throw new h.i();
        }
    }

    private final ab toWazeProviderLocation(ProviderPosition providerPosition) {
        MatchedPositionProto matcherInfo;
        Position.IntPosition position = providerPosition.getPosition();
        h.g.b.x.e(position, "getPosition(...)");
        com.waze.shared_infra.h.c coordinate = toCoordinate(position);
        int altitude = providerPosition.getPosition().getAltitude();
        int speed = providerPosition.getSpeed();
        int steering = providerPosition.getSteering();
        int accuracy = providerPosition.getAccuracy();
        ProviderPosition.LocProvider provider = providerPosition.getProvider();
        h.g.b.x.e(provider, "getProvider(...)");
        com.waze.sharedui.e.d provider2 = toProvider(provider);
        ProviderPosition providerPosition2 = true != providerPosition.hasMatcherInfo() ? null : providerPosition;
        com.waze.sharedui.e.a matchedPosition = (providerPosition2 == null || (matcherInfo = providerPosition2.getMatcherInfo()) == null) ? null : toMatchedPosition(matcherInfo);
        Long lValueOf = Long.valueOf(providerPosition.getLastUpdateTimeEpochSeconds());
        return new ab(coordinate, altitude, speed, steering, accuracy, provider2, matchedPosition, lValueOf.longValue() <= 0 ? null : lValueOf);
    }

    public final com.waze.sharedui.e.c getLatestSavedLocation() {
        return latestSavedLocation;
    }

    public final ch<com.waze.sharedui.e.c> getLocationStateFlow() {
        return locationStateFlow;
    }

    public final native byte[] getSavedLocationNTV();

    public final native boolean hasGPSReceptionNTV();

    public final void initialize() {
        initNativeLayerNTV();
        initializeSavedLocation();
    }

    @Override // com.waze.location.ae
    public void onPosition(ProviderPosition providerPosition) {
        try {
            Gateway.onMatchedPos(providerPosition);
        } catch (Throwable th) {
        }
        h.g.b.x.f(providerPosition, "providerPosition");
        kotlinx.coroutines.b.bn<com.waze.sharedui.e.c> bnVar = mutableLocation;
        com.waze.sharedui.e.c wazeLocation = toWazeLocation(toWazeProviderLocation(providerPosition));
        bnVar.e(wazeLocation);
        try {
            Gateway.onWazeLocationForAA(wazeLocation);
        } catch (Throwable th2) {
        }
    }

    public final com.waze.sharedui.e.c toWazeLocation(ab abVar) {
        h.g.b.x.f(abVar, "<this>");
        return new com.waze.sharedui.e.c(abVar.e(), abVar.b(), abVar.c() / 1000.0f, abVar.d(), abVar.a(), abVar.h(), abVar.f(), abVar.g());
    }

    public final com.waze.sharedui.e.c toWazeLocation(ProviderPosition providerPosition) {
        h.g.b.x.f(providerPosition, "<this>");
        return toWazeLocation(toWazeProviderLocation(providerPosition));
    }
}
