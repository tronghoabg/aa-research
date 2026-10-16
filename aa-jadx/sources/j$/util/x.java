package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements java.util.Comparator, java.io.Serializable {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Comparable) ((java.util.Map.Entry) obj).getKey()).compareTo(((java.util.Map.Entry) obj2).getKey());
    }
}
