package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class aebd extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 100;
    }
}
