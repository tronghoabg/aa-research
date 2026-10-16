package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gny {
    public final defpackage.xyn a;
    public final defpackage.xyn b;
    public final defpackage.xyn c;
    public final defpackage.xyn d;
    public final defpackage.xyn e;
    public final defpackage.xyn f;
    public final defpackage.xyn g;
    public final int h;
    private final defpackage.xyn i;
    private final defpackage.xyn j;

    public gny(int i, defpackage.xyn xynVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3, defpackage.xyn xynVar4, defpackage.xyn xynVar5, defpackage.xyn xynVar6, defpackage.xyn xynVar7, defpackage.xyn xynVar8, defpackage.xyn xynVar9) {
        this.h = i;
        this.a = xynVar;
        this.b = xynVar2;
        this.c = xynVar3;
        this.d = xynVar4;
        this.e = xynVar5;
        this.i = xynVar6;
        this.j = xynVar7;
        this.f = xynVar8;
        this.g = xynVar9;
    }

    public static defpackage.gnx a(int i) {
        defpackage.gnx gnxVar = new defpackage.gnx();
        gnxVar.j = i;
        return gnxVar;
    }

    public static defpackage.gnx b(int i, android.content.ComponentName componentName) {
        defpackage.gnx gnxVarA = a(i);
        gnxVarA.a(componentName);
        return gnxVarA;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.gny)) {
            return false;
        }
        defpackage.gny gnyVar = (defpackage.gny) obj;
        int i = this.h;
        int i2 = gnyVar.h;
        if (i != 0) {
            return i == i2 && this.a.equals(gnyVar.a) && this.b.equals(gnyVar.b) && this.c.equals(gnyVar.c) && this.d.equals(gnyVar.d) && this.e.equals(gnyVar.e) && this.i.equals(gnyVar.i) && this.j.equals(gnyVar.j) && this.f.equals(gnyVar.f) && this.g.equals(gnyVar.g);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.h;
        defpackage.a.aI(i);
        int iHashCode = ((((((((((((((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode();
        return this.g.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        java.lang.String str;
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
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                str = "MESSAGING_APP_INITIAL_CONVERSATION_LIST_LOADED";
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
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
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                str = "TEMPLATE_HOST_SERVICE_DISCONNECTED";
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                str = "TEMPLATE_HOST_BINDING_TO_APP";
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                str = "TEMPLATE_HOST_UNBINDING_TO_APP";
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                str = "APP_DISPATCH_CALL_IN_UNBOUND_STATE";
                break;
            case 37:
                str = "APP_STEP_COUNT_CHANGED_FROM_HEADER_CHANGE_IN_MAP_TEMPLATE";
                break;
            default:
                str = "null";
                break;
        }
        defpackage.xyn xynVar = this.a;
        defpackage.xyn xynVar2 = this.b;
        defpackage.xyn xynVar3 = this.c;
        defpackage.xyn xynVar4 = this.d;
        defpackage.xyn xynVar5 = this.e;
        defpackage.xyn xynVar6 = this.i;
        defpackage.xyn xynVar7 = this.j;
        defpackage.xyn xynVar8 = this.f;
        defpackage.xyn xynVar9 = this.g;
        return "TelemetryEvent{action=" + str + ", carAppSdkVersion=" + java.lang.String.valueOf(xynVar) + ", durationMs=" + java.lang.String.valueOf(xynVar2) + ", carAppApi=" + java.lang.String.valueOf(xynVar3) + ", componentName=" + java.lang.String.valueOf(xynVar4) + ", errorType=" + java.lang.String.valueOf(xynVar5) + ", position=" + java.lang.String.valueOf(xynVar6) + ", itemsLoadedCount=" + java.lang.String.valueOf(xynVar7) + ", carAppContentLimitQuery=" + java.lang.String.valueOf(xynVar8) + ", templateClassName=" + java.lang.String.valueOf(xynVar9) + "}";
    }

    public gny() {
        throw null;
    }
}
