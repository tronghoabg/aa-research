package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hmi {
    public static final hmi a;
    public static final hmi b;
    private static final /* synthetic */ hmi[] c;

    static {
        hmi hmiVar = new hmi("SCRIM_CLICKED", 0);
        a = hmiVar;
        hmi hmiVar2 = new hmi("EXIT_ACTION_CLICKED", 1);
        b = hmiVar2;
        hmi[] hmiVarArr = {hmiVar, hmiVar2};
        c = hmiVarArr;
        affa.p(hmiVarArr);
    }

    public static hmi valueOf(String str) {
        return (hmi) Enum.valueOf(hmi.class, str);
    }

    public static hmi[] values() {
        return (hmi[]) c.clone();
    }
}
