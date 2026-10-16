package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qlz {
    public static java.lang.String a(java.lang.Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof java.lang.String) {
            return !android.text.TextUtils.isEmpty((java.lang.String) obj) ? obj.toString() : "";
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue() != 0 ? obj.toString() : "";
        }
        if (obj instanceof java.lang.Long) {
            return ((java.lang.Long) obj).longValue() != 0 ? obj.toString() : "";
        }
        if (obj instanceof java.lang.Double) {
            return ((java.lang.Double) obj).doubleValue() != 0.0d ? obj.toString() : "";
        }
        if (obj instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) obj).booleanValue() ? obj.toString() : "";
        }
        if (obj instanceof java.util.List) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (i > 0) {
                sb.append("[");
            }
            int length = sb.length();
            for (java.lang.Object obj2 : (java.util.List) obj) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(a(obj2, i + 1));
            }
            if (i > 0) {
                sb.append("]");
            }
            return sb.toString();
        }
        if (!(obj instanceof java.util.Map)) {
            return obj.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        boolean z = false;
        int length2 = 0;
        for (java.util.Map.Entry entry : new java.util.TreeMap((java.util.Map) obj).entrySet()) {
            java.lang.String strA = a(entry.getValue(), i + 1);
            if (!android.text.TextUtils.isEmpty(strA)) {
                if (i > 0 && !z) {
                    sb2.append("{");
                    length2 = sb2.length();
                    z = true;
                }
                if (sb2.length() > length2) {
                    sb2.append(", ");
                }
                sb2.append((java.lang.String) entry.getKey());
                sb2.append('=');
                sb2.append(strA);
            }
        }
        if (z) {
            sb2.append("}");
        }
        return sb2.toString();
    }

    public abstract void b(defpackage.qlz qlzVar);
}
