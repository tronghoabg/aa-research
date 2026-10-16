package com.b.b.d;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.waze.AlerterController$Alerter$Type;
import com.waze.jni.protos.VenueCategoryGroup;
import com.waze.jni.protos.VenueCategoryGroups;
import com.waze.jni.protos.alerters.AlerterId;
import com.waze.jni.protos.alerters.AlerterTimerType;
import com.waze.jni.protos.alerters.AlerterType;
import com.waze.li;
import com.waze.n.ac;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {
    public static final AlerterController$Alerter$Type a(AlerterType alerterType) {
        h.g.b.x.f(alerterType, "<this>");
        AlerterType alerterType2 = AlerterType.CHITCHAT;
        AlerterTimerType alerterTimerType = AlerterTimerType.NONE;
        switch (alerterType.ordinal()) {
            case 0:
                return AlerterController$Alerter$Type.CHITCHAT;
            case 1:
                return AlerterController$Alerter$Type.POLICE;
            case 2:
                return AlerterController$Alerter$Type.ACCIDENT;
            case 3:
                return AlerterController$Alerter$Type.TRAFFIC_JAM;
            case 4:
                return AlerterController$Alerter$Type.TRAFFIC_INFO;
            case 5:
                return AlerterController$Alerter$Type.HAZARD;
            case 6:
                return AlerterController$Alerter$Type.OTHER;
            case 7:
                return AlerterController$Alerter$Type.CONSTRUCTION;
            case 8:
                return AlerterController$Alerter$Type.PARKING;
            case 9:
                return AlerterController$Alerter$Type.DYNAMIC;
            case 10:
                return AlerterController$Alerter$Type.CAMERA;
            case 11:
                return AlerterController$Alerter$Type.PARKED;
            case 12:
                return AlerterController$Alerter$Type.CLOSURE;
            case 13:
                return AlerterController$Alerter$Type.SOS;
            case 14:
                return AlerterController$Alerter$Type.REROUTE;
            case 15:
                return AlerterController$Alerter$Type.GUARDIAN;
            case 16:
                return AlerterController$Alerter$Type.ECO;
            case 17:
                return AlerterController$Alerter$Type.BLOCKED_LANE;
            case 18:
                return AlerterController$Alerter$Type.BAD_WEATHER;
            case 19:
                return AlerterController$Alerter$Type.PERMANENT_HAZARD;
            case 20:
                return AlerterController$Alerter$Type.SPEED_LIMIT_DECREASE;
            case 21:
                return AlerterController$Alerter$Type.PERSONAL_SAFETY;
            case 22:
                return AlerterController$Alerter$Type.DANGER_ZONE;
            case 23:
                return AlerterController$Alerter$Type.ANIMAL;
            case 24:
                return AlerterController$Alerter$Type.OTHER;
            default:
                throw new h.i();
        }
    }

    public static final AlerterId b(com.waze.k kVar) {
        h.g.b.x.f(kVar, "<this>");
        AlerterId.Builder builderNewBuilder = AlerterId.newBuilder();
        builderNewBuilder.setProviderId(kVar.a());
        builderNewBuilder.setUniqueId(kVar.b());
        AlerterId alerterIdBuild = builderNewBuilder.build();
        h.g.b.x.e(alerterIdBuild, "build(...)");
        return alerterIdBuild;
    }

    public static final LiveData c(com.waze.config.f fVar) {
        h.g.b.x.f(fVar, "<this>");
        return FlowLiveDataConversions.asLiveData$default(ac.o(fVar), (h.c.j) null, 0L, 3, (Object) null);
    }

    public static final List d(VenueCategoryGroups venueCategoryGroups) {
        h.g.b.x.f(venueCategoryGroups, "<this>");
        List<VenueCategoryGroup> groupsList = venueCategoryGroups.getGroupsList();
        h.g.b.x.e(groupsList, "getGroupsList(...)");
        List<VenueCategoryGroup> list = groupsList;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (VenueCategoryGroup venueCategoryGroup : list) {
            String id = venueCategoryGroup.getId();
            h.g.b.x.e(id, "getId(...)");
            String label = venueCategoryGroup.getLabel();
            h.g.b.x.e(label, "getLabel(...)");
            arrayList.add(new li(id, label));
        }
        return arrayList;
    }
}
