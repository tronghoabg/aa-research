package com.waze.resume_drive;

import com.waze.av.a.o;
import com.waze.av.b.n;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.places.GenericPlace;
import com.waze.jni.protos.resume_drive.GenericPlaceOrVenueData;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ResumeDriveNativeManager extends m {
    private static ResumeDriveNativeManager sInstance;
    private final ch<h> locationStateFlow;
    private final bn<h> mutableResumeDriveFlow;
    public static final a Companion = new a();
    public static final int $stable = 8;

    private ResumeDriveNativeManager() {
        bn<h> bnVarB = ck.b(g.f35105a);
        this.mutableResumeDriveFlow = bnVarB;
        this.locationStateFlow = ai.U(bnVarB);
    }

    public static final synchronized ResumeDriveNativeManager getInstance() {
        return Companion.a();
    }

    public final native void cancelResumedDriveNTV(int i2);

    public final ch<h> getLocationStateFlow() {
        return this.locationStateFlow;
    }

    @Override // com.waze.resume_drive.m
    public void handleNoResumeDriveResult() {
        this.mutableResumeDriveFlow.e(b.f35102a);
    }

    @Override // com.waze.resume_drive.m
    public void handleResumeDriveCallbackResult(GenericPlaceOrVenueData genericPlaceOrVenueData) {
        x.f(genericPlaceOrVenueData, "placeOrVenue");
        if (!genericPlaceOrVenueData.hasPlace()) {
            if (!genericPlaceOrVenueData.hasVenue()) {
                this.mutableResumeDriveFlow.e(b.f35102a);
                return;
            }
            VenueData venue = genericPlaceOrVenueData.getVenue();
            x.e(venue, "getVenue(...)");
            this.mutableResumeDriveFlow.e(new d(new o(venue.getId(), venue.getName(), venue.getVenueContext(), venue.getRoutingContext(), null, Boolean.valueOf(venue.getIsResidence()))));
            return;
        }
        GenericPlace place = genericPlaceOrVenueData.getPlace();
        x.e(place, "getPlace(...)");
        n nVarM = com.waze.ac.e.m(place);
        bn<h> bnVar = this.mutableResumeDriveFlow;
        if (nVarM != null) {
            bnVar.e(new c(nVarM));
        } else {
            bnVar.e(b.f35102a);
        }
    }

    public final native void initNativeLayerNTV();

    public /* synthetic */ ResumeDriveNativeManager(h.g.b.o oVar) {
        this();
    }
}
