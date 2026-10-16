package s5;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s5.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3995A {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3995A f44958a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC3995A[] f44959b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3995A EF2;

    static {
        EnumC3995A enumC3995A = new EnumC3995A("NOT_SET", 0);
        EnumC3995A enumC3995A2 = new EnumC3995A("EVENT_OVERRIDE", 1);
        f44958a = enumC3995A2;
        f44959b = new EnumC3995A[]{enumC3995A, enumC3995A2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC3995A);
        sparseArray.put(5, enumC3995A2);
    }

    public static EnumC3995A valueOf(String str) {
        return (EnumC3995A) Enum.valueOf(EnumC3995A.class, str);
    }

    public static EnumC3995A[] values() {
        return (EnumC3995A[]) f44959b.clone();
    }
}
