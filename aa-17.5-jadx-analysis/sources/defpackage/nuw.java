package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nuw implements ngd {
    public static final nuw a;
    private static final /* synthetic */ nuw[] b;

    static {
        nuw nuwVar = new nuw();
        a = nuwVar;
        b = new nuw[]{nuwVar};
    }

    private nuw() {
    }

    public static nuw valueOf(String str) {
        return (nuw) Enum.valueOf(nuw.class, str);
    }

    public static nuw[] values() {
        return (nuw[]) b.clone();
    }

    @Override // defpackage.ngd
    public final String a() {
        return "notification";
    }

    @Override // defpackage.ngd
    public final String b() {
        return name();
    }
}
