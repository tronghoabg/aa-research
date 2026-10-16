package com.google.d.k;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f7939a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7940b;

    private a(String str, int i2) {
        this.f7939a = str;
        this.f7940b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.d.k.a a(java.lang.String r9) {
        /*
            java.lang.String r0 = "["
            boolean r0 = r9.startsWith(r0)
            r1 = -1
            r2 = 58
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L7e
            char r0 = r9.charAt(r4)
            r5 = 91
            if (r0 != r5) goto L17
            r0 = r3
            goto L18
        L17:
            r0 = r4
        L18:
            java.lang.String r5 = "Bracketed host-port string must start with a bracket: %s"
            com.google.d.b.an.q(r0, r5, r9)
            int r0 = r9.indexOf(r2)
            r5 = 93
            int r5 = r9.lastIndexOf(r5)
            if (r0 < 0) goto L2d
            if (r5 <= r0) goto L2d
            r0 = r3
            goto L2e
        L2d:
            r0 = r4
        L2e:
            java.lang.String r6 = "Invalid bracketed host/port: %s"
            com.google.d.b.an.q(r0, r6, r9)
            java.lang.String r0 = r9.substring(r3, r5)
            int r6 = r5 + 1
            int r7 = r9.length()
            r8 = 2
            if (r6 != r7) goto L49
            java.lang.String[] r2 = new java.lang.String[r8]
            r2[r4] = r0
            java.lang.String r0 = ""
            r2[r3] = r0
            goto L79
        L49:
            char r6 = r9.charAt(r6)
            if (r6 != r2) goto L51
            r2 = r3
            goto L52
        L51:
            r2 = r4
        L52:
            java.lang.String r6 = "Only a colon may follow a close bracket: %s"
            com.google.d.b.an.q(r2, r6, r9)
            int r5 = r5 + r8
            r2 = r5
        L59:
            int r6 = r9.length()
            if (r2 >= r6) goto L6f
            char r6 = r9.charAt(r2)
            boolean r6 = java.lang.Character.isDigit(r6)
            java.lang.String r7 = "Port must be numeric: %s"
            com.google.d.b.an.q(r6, r7, r9)
            int r2 = r2 + 1
            goto L59
        L6f:
            java.lang.String[] r2 = new java.lang.String[r8]
            r2[r4] = r0
            java.lang.String r0 = r9.substring(r5)
            r2[r3] = r0
        L79:
            r0 = r2[r4]
            r2 = r2[r3]
            goto L98
        L7e:
            int r0 = r9.indexOf(r2)
            r5 = 0
            if (r0 < 0) goto L96
            int r6 = r0 + 1
            int r2 = r9.indexOf(r2, r6)
            if (r2 != r1) goto L96
            java.lang.String r0 = r9.substring(r4, r0)
            java.lang.String r2 = r9.substring(r6)
            goto L98
        L96:
            r0 = r9
            r2 = r5
        L98:
            boolean r5 = com.google.d.b.an.f(r2)
            if (r5 == 0) goto La3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            goto Lc4
        La3:
            java.lang.Integer r1 = com.google.d.l.j.l(r2)
            if (r1 == 0) goto Lab
            r2 = r3
            goto Lac
        Lab:
            r2 = r4
        Lac:
            java.lang.String r5 = "Unparseable port number: %s"
            com.google.d.b.an.q(r2, r5, r9)
            int r2 = r1.intValue()
            if (r2 < 0) goto Lbd
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r2 > r5) goto Lbd
            goto Lbe
        Lbd:
            r3 = r4
        Lbe:
            java.lang.String r2 = "Port number out of range: %s"
            com.google.d.b.an.q(r3, r2, r9)
            r9 = r1
        Lc4:
            com.google.d.k.a r1 = new com.google.d.k.a
            int r9 = r9.intValue()
            r1.<init>(r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.k.a.a(java.lang.String):com.google.d.k.a");
    }

    public final String b() {
        return this.f7939a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Objects.equals(this.f7939a, aVar.f7939a) && this.f7940b == aVar.f7940b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7939a, Integer.valueOf(this.f7940b));
    }

    public final String toString() {
        String str = this.f7939a;
        StringBuilder sb = new StringBuilder(str.length() + 8);
        if (str.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(str);
            sb.append(']');
        } else {
            sb.append(str);
        }
        int i2 = this.f7940b;
        if (i2 >= 0) {
            sb.append(':');
            sb.append(i2);
        }
        return sb.toString();
    }
}
