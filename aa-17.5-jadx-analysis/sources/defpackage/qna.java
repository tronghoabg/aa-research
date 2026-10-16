package defpackage;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qna {
    public final Map a;
    public final List b;
    public final long c;
    public final long d;
    public final int e;
    public final boolean f;
    private final String g;

    public qna(qme qmeVar, Map map, long j, boolean z, long j2, int i, List list) {
        String str;
        String strB;
        String strB2;
        spu.aw(qmeVar);
        spu.aw(map);
        this.d = j;
        this.f = z;
        this.c = j2;
        this.e = i;
        this.b = list != null ? list : Collections.EMPTY_LIST;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Command command = (Command) it.next();
                if ("appendVersion".equals(command.a)) {
                    str = command.b;
                    break;
                }
            }
            str = null;
        } else {
            str = null;
        }
        this.g = true != TextUtils.isEmpty(str) ? str : null;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (d(entry.getKey()) && (strB2 = b(qmeVar, entry.getKey())) != null) {
                map2.put(strB2, c(qmeVar, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!d(entry2.getKey()) && (strB = b(qmeVar, entry2.getKey())) != null) {
                map2.put(strB, c(qmeVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.g)) {
            roc.bf(map2, "_v", this.g);
            if (this.g.equals("ma4.0.0") || this.g.equals("ma4.0.1")) {
                map2.remove("adid");
            }
        }
        this.a = DesugarCollections.unmodifiableMap(map2);
    }

    private static String b(qme qmeVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String string = obj.toString();
        if (string.startsWith("&")) {
            string = string.substring(1);
        }
        int length = string.length();
        if (length > 256) {
            String strSubstring = string.substring(0, 256);
            qmeVar.p(5, "Hit param name is too long and will be trimmed", Integer.valueOf(length), strSubstring, null);
            string = strSubstring;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    private static String c(qme qmeVar, Object obj) {
        String string = obj == null ? "" : obj.toString();
        int length = string.length();
        if (length <= 8192) {
            return string;
        }
        String strSubstring = string.substring(0, 8192);
        qmeVar.p(5, "Hit param value is too long and will be trimmed", Integer.valueOf(length), strSubstring, null);
        return strSubstring;
    }

    private static boolean d(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    public final String a(String str, String str2) {
        spu.at(str);
        spu.an(!str.startsWith("&"), "Short param name required");
        String str3 = (String) this.a.get(str);
        return str3 != null ? str3 : str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ht=");
        sb.append(this.d);
        long j = this.c;
        if (j != 0) {
            sb.append(", dbId=");
            sb.append(j);
        }
        int i = this.e;
        if (i != 0) {
            sb.append(", appUID=");
            sb.append(i);
        }
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append((String) map.get(str));
        }
        return sb.toString();
    }
}
