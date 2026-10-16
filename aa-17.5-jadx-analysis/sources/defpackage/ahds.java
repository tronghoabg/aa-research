package defpackage;

/* loaded from: classes3.dex */
public final class ahds {
    private ahds() {
    }

    public static final ajif a(ajif ajifVar) {
        ajie ajieVar = new ajie(ajifVar);
        ajih ajihVar = ajifVar.g;
        ajieVar.e = new ajio(ajihVar.b(), ajihVar.a());
        return ajieVar.a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final ajij b(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return ajij.c;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return ajij.b;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return ajij.a;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return ajij.d;
            }
        } else if (str.equals("SSLv3")) {
            return ajij.e;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ahfj getSpecialCaseContainerClass(defpackage.aiad r3, boolean r4, boolean r5, java.lang.Boolean r6, boolean r7, defpackage.ahfc r8, defpackage.ahlc r9) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahds.getSpecialCaseContainerClass(aiad, boolean, boolean, java.lang.Boolean, boolean, ahfc, ahlc):ahfj");
    }

    public /* synthetic */ ahds(afeu afeuVar) {
        this();
    }
}
