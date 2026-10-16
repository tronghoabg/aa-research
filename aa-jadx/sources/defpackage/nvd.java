package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nvd {
    public static final defpackage.nvd a;
    public static final defpackage.nvd b;
    public static final defpackage.nvd c;
    public static final defpackage.nvd d;
    private static final /* synthetic */ defpackage.nvd[] e;

    static {
        defpackage.nvd nvdVar = new defpackage.nvd("UNSET", 0);
        a = nvdVar;
        defpackage.nvd nvdVar2 = new defpackage.nvd("SET_TRUE", 1);
        b = nvdVar2;
        defpackage.nvd nvdVar3 = new defpackage.nvd("NOTIFICATION_CENTER_ONLY", 2);
        c = nvdVar3;
        defpackage.nvd nvdVar4 = new defpackage.nvd("SET_FALSE", 3);
        d = nvdVar4;
        e = new defpackage.nvd[]{nvdVar, nvdVar2, nvdVar3, nvdVar4};
    }

    public static defpackage.nvd valueOf(java.lang.String str) {
        return (defpackage.nvd) java.lang.Enum.valueOf(defpackage.nvd.class, str);
    }

    public static defpackage.nvd[] values() {
        return (defpackage.nvd[]) e.clone();
    }
}
