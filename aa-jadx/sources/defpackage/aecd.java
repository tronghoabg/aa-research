package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aecd extends java.util.LinkedHashMap {
    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry entry) {
        return size() > 100;
    }
}
