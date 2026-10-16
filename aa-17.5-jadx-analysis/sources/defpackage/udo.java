package defpackage;

/* loaded from: classes3.dex */
public final class udo {
    public final udx a;
    public final udl b;
    public final xxh c;
    public final int d;

    public udo(udx udxVar, udl udlVar, int i, xxh xxhVar) {
        this.a = udxVar;
        this.b = udlVar;
        this.d = i;
        this.c = xxhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udo) {
            udo udoVar = (udo) obj;
            if (this.a.equals(udoVar.a) && this.b.equals(udoVar.b)) {
                int i = this.d;
                int i2 = udoVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c.equals(udoVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.d;
        a.aJ(i);
        return this.c.hashCode() ^ (((iHashCode * 1000003) ^ i) * 1000003);
    }

    public final String toString() {
        String str;
        int i = this.d;
        udl udlVar = this.b;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(udlVar);
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
        return "{" + strValueOf + ", " + strValueOf2 + ", " + str + ", " + String.valueOf(this.c) + "}";
    }

    public udo() {
        throw null;
    }
}
