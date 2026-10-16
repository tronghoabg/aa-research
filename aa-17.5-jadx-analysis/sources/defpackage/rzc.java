package defpackage;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rzc implements Comparator {
    public static final rzc a;
    private static final /* synthetic */ rzc[] b;

    static {
        rzc rzcVar = new rzc();
        a = rzcVar;
        b = new rzc[]{rzcVar};
    }

    private rzc() {
    }

    public static rzc valueOf(String str) {
        return (rzc) Enum.valueOf(rzc.class, str);
    }

    public static rzc[] values() {
        return (rzc[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long jLongValue = ((Long) obj).longValue();
        long j = jLongValue / 1000000;
        long jLongValue2 = ((Long) obj2).longValue();
        return Long.compare((j * 1000000) + (((jLongValue % 100000) / 10) * 10), ((jLongValue2 / 1000000) * 1000000) + (((jLongValue2 % 100000) / 10) * 10));
    }
}
