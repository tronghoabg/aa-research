package N6;

import android.util.Pair;
import j$.util.Objects;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class A extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f8427a;

    public A(C c10) {
        Objects.requireNonNull(c10);
        this.f8427a = c10;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        C c10 = this.f8427a;
        synchronized (c10) {
            try {
                if (size() <= c10.f8431a) {
                    return false;
                }
                c10.f8436f.add(new Pair((String) entry.getKey(), ((B) entry.getValue()).f8429b));
                return size() > c10.f8431a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
