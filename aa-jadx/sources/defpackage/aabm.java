package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aabm implements java.util.Comparator {
    private final /* synthetic */ int a;

    public aabm(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008a A[RETURN] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.a;
        if (i == 0) {
            return java.lang.Float.compare(((defpackage.aabv) obj).b(), ((defpackage.aabv) obj2).b());
        }
        if (i == 1) {
            defpackage.aabj aabjVar = (defpackage.aabj) obj;
            defpackage.aabj aabjVar2 = (defpackage.aabj) obj2;
            if (aabjVar == null && aabjVar2 == null) {
                return 0;
            }
            if (aabjVar == null) {
                return -1;
            }
            if (aabjVar2 == null) {
                return 1;
            }
            return java.lang.Float.compare(aabjVar.h(), aabjVar2.h());
        }
        if (i == 2) {
            return java.lang.Double.compare(((defpackage.acbg) obj2).a, ((defpackage.acbg) obj).a);
        }
        if (i == 3) {
            return ((defpackage.admr) obj).a() - ((defpackage.admr) obj2).a();
        }
        if (i != 4) {
            if (i != 5) {
                return -java.lang.Integer.compare(((defpackage.akcm) obj).b, ((defpackage.akcm) obj2).b);
            }
            defpackage.akcm akcmVar = (defpackage.akcm) obj;
            defpackage.akcm akcmVar2 = (defpackage.akcm) obj2;
            if (org.chromium.net.CronetProvider.PROVIDER_NAME_FALLBACK.equals(akcmVar.a.getName())) {
                return 1;
            }
            if (org.chromium.net.CronetProvider.PROVIDER_NAME_FALLBACK.equals(akcmVar2.a.getName())) {
                return -1;
            }
            return -org.chromium.net.CronetProvider.compareVersions(akcmVar.a.getVersion(), akcmVar2.a.getVersion());
        }
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        str.getClass();
        str2.getClass();
        int iMin = java.lang.Math.min(str.length(), str2.length());
        for (int i2 = 4; i2 < iMin; i2++) {
            char cCharAt = str.charAt(i2);
            char cCharAt2 = str2.charAt(i2);
            if (cCharAt != cCharAt2) {
                if (cCharAt >= cCharAt2) {
                    return 1;
                }
                return -1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length == length2) {
            return 0;
        }
        if (length >= length2) {
            return 1;
        }
        return -1;
    }
}
