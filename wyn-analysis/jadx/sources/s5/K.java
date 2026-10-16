package s5;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final K f44964a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ K[] f44965b;

    static {
        K k = new K("DEFAULT", 0);
        f44964a = k;
        K k5 = new K("UNMETERED_ONLY", 1);
        K k10 = new K("UNMETERED_OR_DAILY", 2);
        K k11 = new K("FAST_IF_RADIO_AWAKE", 3);
        K k12 = new K("NEVER", 4);
        K k13 = new K("UNRECOGNIZED", 5);
        f44965b = new K[]{k, k5, k10, k11, k12, k13};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, k);
        sparseArray.put(1, k5);
        sparseArray.put(2, k10);
        sparseArray.put(3, k11);
        sparseArray.put(4, k12);
        sparseArray.put(-1, k13);
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f44965b.clone();
    }
}
