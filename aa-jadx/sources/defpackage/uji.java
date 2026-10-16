package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uji {
    public static final defpackage.uji[] a = new defpackage.uji[16];
    public static final defpackage.uji b;
    public final int c;

    static {
        for (int i = 0; i < 16; i++) {
            a[i] = new defpackage.uji(i);
        }
        b = a[5];
    }

    private uji(int i) {
        this.c = i;
    }

    public static defpackage.uji c(defpackage.abbi abbiVar) {
        char c;
        switch (abbiVar.ordinal()) {
            case 1:
                c = 6;
                break;
            case 2:
                c = 7;
                break;
            case 3:
                c = '\t';
                break;
            case 4:
                c = '\n';
                break;
            case 5:
                c = 11;
                break;
            case 6:
                c = '\r';
                break;
            case 7:
                c = 14;
                break;
            case 8:
                c = 15;
                break;
            default:
                c = 5;
                break;
        }
        return a[c];
    }

    private final int d() {
        return this.c & 3;
    }

    private final int e() {
        return (this.c >> 2) & 3;
    }

    public final float a() {
        int iD = d();
        if (iD == 2) {
            return -1.0f;
        }
        if (iD != 3) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        return 1.0f;
    }

    public final float b() {
        int iE = e();
        if (iE == 2) {
            return -1.0f;
        }
        if (iE != 3) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        return 1.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.c == ((defpackage.uji) obj).c;
    }

    public final int hashCode() {
        return this.c + 31;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        int iE = e();
        if (iE == 1) {
            sb.append("center");
        } else if (iE == 2) {
            sb.append("top");
        } else if (iE != 3) {
            sb.append("V-invalid=");
            sb.append(e());
        } else {
            sb.append("bottom");
        }
        int iD = d();
        if (iD != 1) {
            if (iD == 2) {
                sb.append(" left");
            } else if (iD != 3) {
                sb.append(" H-invalid=");
                sb.append(d());
            } else {
                sb.append(" right");
            }
        } else if (e() != 1) {
            sb.append(" center");
        }
        sb.append("}");
        return sb.toString();
    }
}
