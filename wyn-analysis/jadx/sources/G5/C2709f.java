package g5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* renamed from: g5.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2709f {

    /* renamed from: a, reason: collision with root package name */
    public final String f35756a;

    /* renamed from: b, reason: collision with root package name */
    public final List f35757b;

    public C2709f(String str, List list) {
        this.f35756a = str;
        this.f35757b = list == null ? new ArrayList() : list;
    }

    public static HashMap a(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            map2.put(d(entry.getKey()), value instanceof Map ? a((Map) value) : d(value));
        }
        return map2;
    }

    public static String d(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? a((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte b5 : (byte[]) obj) {
            arrayList.add(Integer.valueOf(b5));
        }
        return arrayList.toString();
    }

    public final Object[] b() {
        ArrayList arrayList = new ArrayList();
        List list = this.f35757b;
        if (list != null) {
            for (Object obj : list) {
                if (obj == null) {
                    obj = null;
                } else if (obj instanceof List) {
                    List list2 = (List) obj;
                    byte[] bArr = new byte[list2.size()];
                    for (int i5 = 0; i5 < list2.size(); i5++) {
                        bArr[i5] = (byte) ((Integer) list2.get(i5)).intValue();
                    }
                    obj = bArr;
                }
                arrayList.add(obj);
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    public final C2709f c() {
        List list = this.f35757b;
        if (list.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            String str = this.f35756a;
            int length = str.length();
            int i5 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i5 < length) {
                    char cCharAt = str.charAt(i5);
                    if (cCharAt == '?') {
                        int i12 = i5 + 1;
                        if (i12 < length && Character.isDigit(str.charAt(i12))) {
                            break;
                        }
                        i10++;
                        if (i11 >= list.size()) {
                            break;
                        }
                        int i13 = i11 + 1;
                        Object obj = list.get(i11);
                        if ((obj instanceof Integer) || (obj instanceof Long)) {
                            sb2.append(obj.toString());
                            i11 = i13;
                        } else {
                            arrayList.add(obj);
                            i11 = i13;
                            sb2.append(cCharAt);
                        }
                    } else {
                        sb2.append(cCharAt);
                    }
                    i5++;
                } else if (i10 == list.size()) {
                    return new C2709f(sb2.toString(), arrayList);
                }
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2709f)) {
            return false;
        }
        C2709f c2709f = (C2709f) obj;
        String str = this.f35756a;
        if (str != null) {
            if (!str.equals(c2709f.f35756a)) {
                return false;
            }
        } else if (c2709f.f35756a != null) {
            return false;
        }
        List list = this.f35757b;
        if (list.size() != c2709f.f35757b.size()) {
            return false;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            boolean z2 = list.get(i5) instanceof byte[];
            List list2 = c2709f.f35757b;
            if (z2 && (list2.get(i5) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i5), (byte[]) list2.get(i5))) {
                    return false;
                }
            } else if (!list.get(i5).equals(list2.get(i5))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f35756a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35756a);
        List list = this.f35757b;
        if (list == null || list.isEmpty()) {
            string = "";
        } else {
            StringBuilder sb3 = new StringBuilder(StringUtils.SPACE);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d(it.next()));
            }
            sb3.append(arrayList);
            string = sb3.toString();
        }
        sb2.append(string);
        return sb2.toString();
    }
}
