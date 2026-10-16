package I4;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Map f5343b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f5344c;

    public j(Map map) {
        this.f5343b = DesugarCollections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f5343b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                String str = ((i) list.get(i5)).f5342a;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    if (i5 != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final Map b() {
        if (this.f5344c == null) {
            synchronized (this) {
                try {
                    if (this.f5344c == null) {
                        this.f5344c = DesugarCollections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.f5344c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f5343b.equals(((j) obj).f5343b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5343b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f5343b + '}';
    }
}
