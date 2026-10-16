package com.google.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ad implements ab {

    /* renamed from: a, reason: collision with root package name */
    public static final ad f7196a;

    /* renamed from: b, reason: collision with root package name */
    public static final ad f7197b;

    /* renamed from: c, reason: collision with root package name */
    public static final ad f7198c;

    /* renamed from: d, reason: collision with root package name */
    public static final ad f7199d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ad[] f7200e;

    static {
        ad adVar = new ad("ALWAYS_TRUE", 0);
        f7196a = adVar;
        ad adVar2 = new ad("ALWAYS_FALSE", 1);
        f7197b = adVar2;
        ad adVar3 = new ad("IS_NULL", 2);
        f7198c = adVar3;
        ad adVar4 = new ad("NOT_NULL", 3);
        f7199d = adVar4;
        f7200e = new ad[]{adVar, adVar2, adVar3, adVar4};
    }

    public static ad[] values() {
        return (ad[]) f7200e.clone();
    }

    @Override // com.google.d.b.ab
    public final /* synthetic */ boolean apply(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? super.toString() : "Predicates.notNull()" : "Predicates.isNull()" : "Predicates.alwaysFalse()" : "Predicates.alwaysTrue()";
    }
}
