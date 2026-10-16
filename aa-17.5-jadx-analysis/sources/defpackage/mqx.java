package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class mqx implements ngd {
    public static final mqx a;
    private static final /* synthetic */ mqx[] b;

    static {
        mqx mqxVar = new mqx();
        a = mqxVar;
        b = new mqx[]{mqxVar};
    }

    private mqx() {
    }

    public static mqx valueOf(String str) {
        return (mqx) Enum.valueOf(mqx.class, str);
    }

    public static mqx[] values() {
        return (mqx[]) b.clone();
    }

    @Override // defpackage.ngd
    public final String a() {
        return "launcher";
    }

    @Override // defpackage.ngd
    public final String b() {
        return name();
    }
}
