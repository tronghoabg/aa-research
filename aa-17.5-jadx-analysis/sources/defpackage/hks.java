package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hks {
    public static final hks a;
    public static final hks b;
    private static final /* synthetic */ hks[] e;
    public final boolean c;
    public final boolean d;

    static {
        hks hksVar = new hks("FULL_SCREEN", 0, false, true);
        a = hksVar;
        hks hksVar2 = new hks("CARD", 1, true, false);
        b = hksVar2;
        hks[] hksVarArr = {hksVar, hksVar2};
        e = hksVarArr;
        affa.p(hksVarArr);
    }

    private hks(String str, int i, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
    }

    public static hks valueOf(String str) {
        return (hks) Enum.valueOf(hks.class, str);
    }

    public static hks[] values() {
        return (hks[]) e.clone();
    }
}
