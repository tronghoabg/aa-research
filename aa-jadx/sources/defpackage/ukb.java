package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ukb {
    public final int a;
    public final int b;

    public ukb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ukb) {
            defpackage.ukb ukbVar = (defpackage.ukb) obj;
            if (this.a == ukbVar.a && this.b == ukbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        defpackage.xym xymVar = new defpackage.xym("");
        switch (this.a) {
            case 1:
                str = "BOTTOM_RIGHT_TO_TOP_LEFT";
                break;
            case 2:
                str = "BOTTOM_RIGHT_TO_TOP_RIGHT";
                break;
            case 3:
                str = "BOTTOM_CENTER_TO_TOP_CENTER";
                break;
            case 4:
                str = "BOTTOM_LEFT_TO_TOP_LEFT";
                break;
            case 5:
                str = "BOTTOM_LEFT_TO_TOP_RIGHT";
                break;
            case 6:
                str = "TOP_RIGHT_TO_TOP_LEFT";
                break;
            case 7:
                str = "CENTER_RIGHT_TO_CENTER_LEFT";
                break;
            case 8:
                str = "BOTTOM_RIGHT_TO_BOTTOM_LEFT";
                break;
            case 9:
                str = "TOP_LEFT_TO_TOP_RIGHT";
                break;
            case 10:
                str = "CENTER_LEFT_TO_CENTER_RIGHT";
                break;
            case 11:
                str = "BOTTOM_LEFT_TO_BOTTOM_RIGHT";
                break;
            case 12:
                str = "TOP_RIGHT_TO_BOTTOM_LEFT";
                break;
            case 13:
                str = "TOP_RIGHT_TO_BOTTOM_RIGHT";
                break;
            case 14:
                str = "TOP_CENTER_TO_BOTTOM_CENTER";
                break;
            case 15:
                str = "TOP_LEFT_TO_BOTTOM_LEFT";
                break;
            default:
                str = "TOP_LEFT_TO_BOTTOM_RIGHT";
                break;
        }
        xymVar.b("tiePoint", str);
        int i = this.b;
        if (i != 1) {
            str2 = i != 2 ? "RIGHT_JUSTIFY" : "LEFT_JUSTIFY";
        } else {
            str2 = "CENTER_JUSTIFY";
        }
        xymVar.b("justification", str2);
        return xymVar.toString();
    }

    public ukb() {
        throw null;
    }
}
