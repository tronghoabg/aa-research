package defpackage;

import android.content.ComponentName;
import androidx.car.app.navigation.model.Maneuver;

/* loaded from: classes2.dex */
public final class gnr {
    public final xxh a;
    public final xxh b;
    public final xxh c;
    public final xxh d;
    public final xxh e;
    public final xxh f;
    public final xxh g;
    public final int h;
    private final xxh i;
    private final xxh j;

    public gnr(int i, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, xxh xxhVar4, xxh xxhVar5, xxh xxhVar6, xxh xxhVar7, xxh xxhVar8, xxh xxhVar9) {
        this.h = i;
        this.a = xxhVar;
        this.b = xxhVar2;
        this.c = xxhVar3;
        this.d = xxhVar4;
        this.e = xxhVar5;
        this.i = xxhVar6;
        this.j = xxhVar7;
        this.f = xxhVar8;
        this.g = xxhVar9;
    }

    public static gnq a(int i) {
        gnq gnqVar = new gnq();
        gnqVar.j = i;
        return gnqVar;
    }

    public static gnq b(int i, ComponentName componentName) {
        gnq gnqVarA = a(i);
        gnqVarA.a(componentName);
        return gnqVarA;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gnr)) {
            return false;
        }
        gnr gnrVar = (gnr) obj;
        int i = this.h;
        int i2 = gnrVar.h;
        if (i != 0) {
            return i == i2 && this.a.equals(gnrVar.a) && this.b.equals(gnrVar.b) && this.c.equals(gnrVar.c) && this.d.equals(gnrVar.d) && this.e.equals(gnrVar.e) && this.i.equals(gnrVar.i) && this.j.equals(gnrVar.j) && this.f.equals(gnrVar.f) && this.g.equals(gnrVar.g);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.h;
        a.aJ(i);
        int iHashCode = ((((((((((((((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode();
        return this.g.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String str;
        switch (this.h) {
            case 1:
                str = "APP_START";
                break;
            case 2:
                str = "APP_RUNTIME";
                break;
            case 3:
                str = "CAR_APP_API_FAILURE";
                break;
            case 4:
                str = "CAR_APPS_AVAILABLE";
                break;
            case 5:
                str = "CLIENT_SDK_VERSION";
                break;
            case 6:
                str = "HOST_SDK_VERSION";
                break;
            case 7:
                str = "HOST_UNAVAILABLE_ERROR";
                break;
            case 8:
                str = "TEMPLATE_FLOW_LIMIT_EXCEEDED";
                break;
            case 9:
                str = "TEMPLATE_FLOW_INVALID_BACK";
                break;
            case 10:
                str = "TEMPLATE_FLOW_REFRESH_THROTTLED";
                break;
            case 11:
                str = "TEMPLATE_FLOW_NEW_TEMPLATE_PUSH_THROTTLED";
                break;
            case 12:
                str = "TEMPLATE_FLOW_INVALID_TEMPLATE_FOR_SESSION";
                break;
            case 13:
                str = "NAVIGATION_STARTED";
                break;
            case 14:
                str = "NAVIGATION_ENDED";
                break;
            case 15:
                str = "PAN";
                break;
            case 16:
                str = "ROTARY_PAN";
                break;
            case 17:
                str = "FLING";
                break;
            case 18:
                str = "ZOOM";
                break;
            case 19:
                str = "CONTENT_LIMIT_QUERY";
                break;
            case 20:
                str = "HOST_FAILURE_CLUSTER_ICON";
                break;
            case 21:
                str = "MINIMIZED_STATE";
                break;
            case 22:
                str = "SPEEDBUMPED";
                break;
            case 23:
                str = "COLOR_CONTRAST_CHECK_FAILED";
                break;
            case 24:
                str = "TEMPLATE_CHANGED";
                break;
            case 25:
                str = "TEMPLATE_FLOW_CONTENT_UPDATE_THROTTLED_PUSH";
                break;
            case 26:
                str = "TEMPLATE_FLOW_OVERFLOW_TRIGGERED";
                break;
            case 27:
                str = "MESSAGING_APP_ENTER";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                str = "MESSAGING_APP_INITIAL_CONVERSATION_LIST_LOADED";
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                str = "TEMPLATE_HOST_BINDING_TO_SECONDARY_DISPLAY";
                break;
            case 30:
                str = "SECONDARY_DISPLAY_START_SHOWING_TURN_CARD";
                break;
            case 31:
                str = "TEMPLATE_HOST_BINDING_TO_APP_FAILURE";
                break;
            case 32:
                str = "TEMPLATE_HOST_SERVICE_CONNECTED";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                str = "TEMPLATE_HOST_SERVICE_DISCONNECTED";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                str = "TEMPLATE_HOST_BINDING_TO_APP";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                str = "TEMPLATE_HOST_UNBINDING_TO_APP";
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                str = "APP_DISPATCH_CALL_IN_UNBOUND_STATE";
                break;
            case 37:
                str = "APP_STEP_COUNT_CHANGED_FROM_HEADER_CHANGE_IN_MAP_TEMPLATE";
                break;
            default:
                str = "null";
                break;
        }
        xxh xxhVar = this.a;
        xxh xxhVar2 = this.b;
        xxh xxhVar3 = this.c;
        xxh xxhVar4 = this.d;
        xxh xxhVar5 = this.e;
        xxh xxhVar6 = this.i;
        xxh xxhVar7 = this.j;
        xxh xxhVar8 = this.f;
        xxh xxhVar9 = this.g;
        return "TelemetryEvent{action=" + str + ", carAppSdkVersion=" + String.valueOf(xxhVar) + ", durationMs=" + String.valueOf(xxhVar2) + ", carAppApi=" + String.valueOf(xxhVar3) + ", componentName=" + String.valueOf(xxhVar4) + ", errorType=" + String.valueOf(xxhVar5) + ", position=" + String.valueOf(xxhVar6) + ", itemsLoadedCount=" + String.valueOf(xxhVar7) + ", carAppContentLimitQuery=" + String.valueOf(xxhVar8) + ", templateClassName=" + String.valueOf(xxhVar9) + "}";
    }

    public gnr() {
        throw null;
    }
}
