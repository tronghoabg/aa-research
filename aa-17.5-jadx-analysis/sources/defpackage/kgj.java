package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class kgj implements ngd {
    public static final kgj a;
    private static final /* synthetic */ kgj[] b;

    static {
        kgj kgjVar = new kgj();
        a = kgjVar;
        b = new kgj[]{kgjVar};
    }

    private kgj() {
    }

    public static kgj valueOf(String str) {
        return (kgj) Enum.valueOf(kgj.class, str);
    }

    public static kgj[] values() {
        return (kgj[]) b.clone();
    }

    @Override // defpackage.ngd
    public final String a() {
        return "longPressToRequestBugreport";
    }

    @Override // defpackage.ngd
    public final String b() {
        return name();
    }
}
