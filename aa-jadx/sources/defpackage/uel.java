package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uel {
    public final defpackage.ueu a;
    public final defpackage.uei b;
    public final defpackage.xyn c;
    public final int d;

    public uel(defpackage.ueu ueuVar, defpackage.uei ueiVar, int i, defpackage.xyn xynVar) {
        this.a = ueuVar;
        this.b = ueiVar;
        this.d = i;
        this.c = xynVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uel) {
            defpackage.uel uelVar = (defpackage.uel) obj;
            if (this.a.equals(uelVar.a) && this.b.equals(uelVar.b)) {
                int i = this.d;
                int i2 = uelVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c.equals(uelVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.d;
        defpackage.a.aI(i);
        return this.c.hashCode() ^ (((iHashCode * 1000003) ^ i) * 1000003);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.d;
        defpackage.uei ueiVar = this.b;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        java.lang.String strValueOf2 = java.lang.String.valueOf(ueiVar);
        switch (i) {
            case 1:
                str = "PLACEMENT_FULLY_DETERMINED";
                break;
            case 2:
                str = "FAILED_BUCKET_RESTRICTIONS_CHECK";
                break;
            case 3:
                str = "UNSUPPORTED_LABEL_TYPE";
                break;
            case 4:
                str = "NOTHING_TO_RENDER";
                break;
            case 5:
                str = "FAILED_TILT_RENDER_THRESHOLD_CHECK";
                break;
            case 6:
                str = "RENDER_ID_COLLISION";
                break;
            case 7:
                str = "DISALLOWED_DUPLICATE_LABEL";
                break;
            case 8:
                str = "GL_LABEL_INIT_FAILURE";
                break;
            case 9:
                str = "LABEL_GEOMETRY_UPDATE_FAILED";
                break;
            case 10:
                str = "OUTSIDE_IMPRESSED_AREA";
                break;
            case 11:
                str = "FAILED_ZOOM_CHECK";
                break;
            case 12:
                str = "RENDERING_NOT_STARTED";
                break;
            case 13:
                str = "ANCHOR_POINT_OBSCURED";
                break;
            default:
                str = "null";
                break;
        }
        return "{" + strValueOf + ", " + strValueOf2 + ", " + str + ", " + java.lang.String.valueOf(this.c) + "}";
    }

    public uel() {
        throw null;
    }
}
