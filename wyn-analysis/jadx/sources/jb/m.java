package jb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f38751a;

    /* renamed from: b, reason: collision with root package name */
    public final List f38752b;

    public m(String str, List list) {
        this.f38751a = str;
        this.f38752b = list == null ? new ArrayList() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            bArr[i5] = (byte) ((Integer) list.get(i5)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        String str = this.f38751a;
        if (str != null) {
            if (!str.equals(mVar.f38751a)) {
                return false;
            }
        } else if (mVar.f38751a != null) {
            return false;
        }
        List list = this.f38752b;
        if (list.size() != mVar.f38752b.size()) {
            return false;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            boolean z2 = list.get(i5) instanceof byte[];
            List list2 = mVar.f38752b;
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
        String str = this.f38751a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38751a);
        List list = this.f38752b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = StringUtils.SPACE + list;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
