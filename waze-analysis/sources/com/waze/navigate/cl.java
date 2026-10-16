package com.waze.navigate;

import com.waze.jni.protos.VenueData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface cl {
    void removeEvent(String str, boolean z);

    void removeEventByLocation(String str);

    void updateEventPlace(String str, long j2, long j3, String str2, h.g.a.l<? super h.ab, h.ab> lVar);

    void updateEventVenue(String str, VenueData venueData, h.g.a.l<? super h.ab, h.ab> lVar);
}
