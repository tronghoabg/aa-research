package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class plc {
    public static final plc a;
    public static final plc b;
    public static final plc c;
    public static final plc d;
    private static final /* synthetic */ plc[] e;

    static {
        plc plcVar = new plc("ALL_LONG_LRU", 0);
        a = plcVar;
        plc plcVar2 = new plc("GL_LABEL", 1);
        b = plcVar2;
        plc plcVar3 = new plc("LABEL_PRIMARY_BOUNDARY", 2);
        c = plcVar3;
        plc plcVar4 = new plc("OTHER", 3);
        d = plcVar4;
        e = new plc[]{plcVar, plcVar2, plcVar3, plcVar4};
    }

    public static plc valueOf(String str) {
        return (plc) Enum.valueOf(plc.class, str);
    }

    public static plc[] values() {
        return (plc[]) e.clone();
    }
}
