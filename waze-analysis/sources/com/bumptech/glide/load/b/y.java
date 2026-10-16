package com.bumptech.glide.load.b;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class y implements u {

    /* renamed from: b, reason: collision with root package name */
    private final Map f3285b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Map f3286c;

    y(Map map) {
        this.f3285b = DesugarCollections.unmodifiableMap(map);
    }

    @Override // com.bumptech.glide.load.b.u
    public final Map a() {
        if (this.f3286c == null) {
            synchronized (this) {
                if (this.f3286c == null) {
                    HashMap map = new HashMap();
                    for (Map.Entry entry : this.f3285b.entrySet()) {
                        List list = (List) entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String strA = ((v) list.get(i2)).a();
                            if (!TextUtils.isEmpty(strA)) {
                                sb.append(strA);
                                if (i2 != list.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        String string = sb.toString();
                        if (!TextUtils.isEmpty(string)) {
                            map.put((String) entry.getKey(), string);
                        }
                    }
                    this.f3286c = DesugarCollections.unmodifiableMap(map);
                }
            }
        }
        return this.f3286c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f3285b.equals(((y) obj).f3285b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3285b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + String.valueOf(this.f3285b) + "}";
    }
}
