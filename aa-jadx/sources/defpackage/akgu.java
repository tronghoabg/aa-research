package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akgu {
    private final java.util.HashMap a = new java.util.HashMap(7);
    private final java.util.HashMap b = new java.util.HashMap(7);

    public final synchronized java.lang.String[] a(java.util.Locale locale, java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr;
        java.lang.String[] strArr = null;
        if (locale == null) {
            return null;
        }
        java.util.HashMap map = this.a;
        java.util.Map map2 = (java.util.Map) map.get(locale);
        if (map2 == null) {
            map2 = new java.util.HashMap(7);
            map.put(locale, map2);
        }
        java.util.Map map3 = (java.util.Map) map2.get(str);
        if (map3 == null) {
            map3 = new java.util.HashMap(7);
            map2.put(str, map3);
            java.lang.String[][] zoneStrings = defpackage.akdi.a(java.util.Locale.ENGLISH).getZoneStrings();
            int length = zoneStrings.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    objArr = null;
                    break;
                }
                objArr = zoneStrings[i];
                if (objArr != null && objArr.length >= 5 && str.equals(objArr[0])) {
                    break;
                }
                i++;
            }
            for (java.lang.String[] strArr2 : defpackage.akdi.a(locale).getZoneStrings()) {
                if (strArr2 != null && strArr2.length >= 5 && str.equals(strArr2[0])) {
                    strArr = strArr2;
                    break;
                }
            }
            if (objArr != null && strArr != null) {
                map3.put(objArr[2], new java.lang.String[]{strArr[2], strArr[1]});
                if (objArr[2].equals(objArr[4])) {
                    map3.put(java.lang.String.valueOf(objArr[4]).concat("-Summer"), new java.lang.String[]{strArr[4], strArr[3]});
                } else {
                    map3.put(objArr[4], new java.lang.String[]{strArr[4], strArr[3]});
                }
            }
        }
        return (java.lang.String[]) map3.get(str2);
    }

    public final synchronized java.lang.String[] b(java.util.Locale locale, java.lang.String str, boolean z) {
        java.lang.String[] strArr;
        java.lang.String[] strArr2 = null;
        if (locale == null) {
            return null;
        }
        if (str.startsWith("Etc/")) {
            str = str.substring(4);
        }
        java.util.HashMap map = this.b;
        java.util.Map map2 = (java.util.Map) map.get(locale);
        if (map2 == null) {
            map2 = new java.util.HashMap(7);
            map.put(locale, map2);
        }
        java.util.Map map3 = (java.util.Map) map2.get(str);
        if (map3 == null) {
            map3 = new java.util.HashMap(7);
            map2.put(str, map3);
            java.lang.String[][] zoneStrings = defpackage.akdi.a(java.util.Locale.ENGLISH).getZoneStrings();
            int length = zoneStrings.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    strArr = null;
                    break;
                }
                strArr = zoneStrings[i];
                if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                    break;
                }
                i++;
            }
            for (java.lang.String[] strArr3 : defpackage.akdi.a(locale).getZoneStrings()) {
                if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                    strArr2 = strArr3;
                    break;
                }
            }
            if (strArr != null && strArr2 != null) {
                map3.put(java.lang.Boolean.TRUE, new java.lang.String[]{strArr2[2], strArr2[1]});
                map3.put(java.lang.Boolean.FALSE, new java.lang.String[]{strArr2[4], strArr2[3]});
            }
        }
        return (java.lang.String[]) map3.get(java.lang.Boolean.valueOf(z));
    }
}
