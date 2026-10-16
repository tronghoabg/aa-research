package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hpu {
    public static final hpu a;
    public static final hpu b;
    public static final /* synthetic */ afdf c;
    private static final /* synthetic */ hpu[] d;

    static {
        hpu hpuVar = new hpu("SHOW_ANIMATION_V2", 0);
        a = hpuVar;
        hpu hpuVar2 = new hpu("SHOW_BRANDED_ICON", 1);
        b = hpuVar2;
        hpu[] hpuVarArr = {hpuVar, hpuVar2};
        d = hpuVarArr;
        c = affa.p(hpuVarArr);
    }

    public static hpu valueOf(String str) {
        return (hpu) Enum.valueOf(hpu.class, str);
    }

    public static hpu[] values() {
        return (hpu[]) d.clone();
    }
}
