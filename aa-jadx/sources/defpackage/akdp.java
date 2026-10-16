package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akdp extends java.lang.IllegalArgumentException {
    private static final long serialVersionUID = 6305711765985447737L;
    public java.lang.String a;

    public akdp(defpackage.akdh akdhVar, java.lang.String str) {
        java.lang.String str2 = akdhVar.y;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Value \"");
        stringBuffer.append(str);
        stringBuffer.append("\" for ");
        stringBuffer.append(str2);
        stringBuffer.append(" is not supported");
        super(stringBuffer.toString());
        this.a = super.getMessage();
    }

    private static java.lang.String a(java.lang.String str, java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Value ");
        sb.append(number);
        sb.append(" for ");
        sb.append(str);
        sb.append(' ');
        if (number2 == null) {
            if (number3 == null) {
                sb.append("is not supported");
            } else {
                sb.append("must not be larger than ");
                sb.append(number3);
            }
        } else if (number3 == null) {
            sb.append("must not be smaller than ");
            sb.append(number2);
        } else {
            sb.append("must be in the range [");
            sb.append(number2);
            sb.append(',');
            sb.append(number3);
            sb.append(']');
        }
        if (str2 != null) {
            sb.append(": ");
            sb.append(str2);
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.a;
    }

    public akdp(defpackage.akdh akdhVar, java.lang.Number number, java.lang.String str) {
        super(a(akdhVar.y, number, null, null, str));
        this.a = super.getMessage();
    }

    public akdp(defpackage.akdh akdhVar, java.lang.Number number, java.lang.Number number2, java.lang.Number number3) {
        super(a(akdhVar.y, number, number2, number3, null));
        this.a = super.getMessage();
    }
}
