package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class zcu implements Serializable {
    private static final long serialVersionUID = 0;
    public final String a;
    public final boolean b;
    private final int c;

    private zcu(String str, int i, boolean z) {
        this.a = str;
        this.c = i;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9 A[EDGE_INSN: B:91:0x00b9->B:41:0x00b9 BREAK  A[LOOP:0: B:55:0x00e1->B:66:0x010c], EDGE_INSN: B:93:0x00b9->B:41:0x00b9 BREAK  A[LOOP:0: B:55:0x00e1->B:66:0x010c], EDGE_INSN: B:94:0x00b9->B:41:0x00b9 BREAK  A[LOOP:0: B:55:0x00e1->B:66:0x010c], EDGE_INSN: B:95:0x00b9->B:41:0x00b9 BREAK  A[LOOP:0: B:55:0x00e1->B:66:0x010c]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zcu a(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcu.a(java.lang.String):zcu");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zcu) {
            zcu zcuVar = (zcu) obj;
            if (Objects.equals(this.a, zcuVar.a) && this.c == zcuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 8);
        if (str.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(str);
            sb.append(']');
        } else {
            sb.append(str);
        }
        int i = this.c;
        if (i >= 0) {
            sb.append(':');
            sb.append(i);
        }
        return sb.toString();
    }
}
