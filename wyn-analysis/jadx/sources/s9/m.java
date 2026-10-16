package s9;

import A7.AbstractC0279p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class m extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final m f45388b = new m(Collections.EMPTY_LIST);

    public static m l(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException(AbstractC0279p0.l("Invalid path (", str, "). Paths must not contain // in them."));
        }
        String[] strArrSplit = str.split("/");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new m(arrayList);
    }

    @Override // s9.e
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        int i5 = 0;
        while (true) {
            List list = this.f45369a;
            if (i5 >= list.size()) {
                return sb2.toString();
            }
            if (i5 > 0) {
                sb2.append("/");
            }
            sb2.append((String) list.get(i5));
            i5++;
        }
    }

    @Override // s9.e
    public final e e(List list) {
        return new m(list);
    }
}
