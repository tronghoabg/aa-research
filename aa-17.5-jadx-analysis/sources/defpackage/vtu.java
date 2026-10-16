package defpackage;

/* loaded from: classes3.dex */
public final class vtu extends vmc {
    public vtu(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    @Override // defpackage.vmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.String e() {
        /*
            r1 = this;
            ajgu r1 = r1.a
            ajej r0 = r1.r
            if (r0 != 0) goto L8
            ajej r0 = defpackage.ajej.a
        L8:
            aboh r0 = r0.c
            int r0 = r0.size()
            if (r0 <= 0) goto L71
            ajej r1 = r1.r
            if (r1 != 0) goto L16
            ajej r1 = defpackage.ajej.a
        L16:
            aboh r1 = r1.c
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            ajei r1 = (defpackage.ajei) r1
            int r1 = r1.d
            int r1 = defpackage.afyh.S(r1)
            if (r1 != 0) goto L28
            goto L65
        L28:
            r0 = 100
            if (r1 == r0) goto L68
            switch(r1) {
                case 1: goto L65;
                case 2: goto L62;
                case 3: goto L5f;
                case 4: goto L5c;
                case 5: goto L59;
                case 6: goto L56;
                case 7: goto L53;
                case 8: goto L50;
                case 9: goto L4d;
                case 10: goto L4a;
                case 11: goto L47;
                case 12: goto L44;
                case 13: goto L41;
                case 14: goto L3e;
                case 15: goto L3b;
                case 16: goto L38;
                case 17: goto L35;
                case 18: goto L32;
                default: goto L2f;
            }
        L2f:
            java.lang.String r1 = "null"
            goto L6a
        L32:
            java.lang.String r1 = "MEMORY_LIMITER"
            goto L6a
        L35:
            java.lang.String r1 = "PACKAGE_UPDATED"
            goto L6a
        L38:
            java.lang.String r1 = "PACKAGE_STATE_CHANGE"
            goto L6a
        L3b:
            java.lang.String r1 = "UNKNOWN"
            goto L6a
        L3e:
            java.lang.String r1 = "OTHER"
            goto L6a
        L41:
            java.lang.String r1 = "DEPENDENCY_DIED"
            goto L6a
        L44:
            java.lang.String r1 = "USER_STOPPED"
            goto L6a
        L47:
            java.lang.String r1 = "USER_REQUESTED"
            goto L6a
        L4a:
            java.lang.String r1 = "EXCESSIVE_RESOURCE_USAGE"
            goto L6a
        L4d:
            java.lang.String r1 = "PERMISSION_CHANGE"
            goto L6a
        L50:
            java.lang.String r1 = "INITIALIZATION_FAILURE"
            goto L6a
        L53:
            java.lang.String r1 = "ANR"
            goto L6a
        L56:
            java.lang.String r1 = "CRASH_NATIVE"
            goto L6a
        L59:
            java.lang.String r1 = "CRASH"
            goto L6a
        L5c:
            java.lang.String r1 = "LOW_MEMORY"
            goto L6a
        L5f:
            java.lang.String r1 = "SIGNALED"
            goto L6a
        L62:
            java.lang.String r1 = "EXIT_SELF"
            goto L6a
        L65:
            java.lang.String r1 = "REASON_UNSET"
            goto L6a
        L68:
            java.lang.String r1 = "FREEZER"
        L6a:
            java.lang.String r0 = "AppExit: "
            java.lang.String r1 = r0.concat(r1)
            return r1
        L71:
            java.lang.String r1 = "AppExit"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtu.e():java.lang.String");
    }

    @Override // defpackage.vmc
    protected final String g() {
        return (String) xxh.g(c()).d("AppExit");
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 65536) != 0;
    }
}
