package defpackage;

/* loaded from: classes3.dex */
public final class agjd extends agey {
    public static final agjd INSTANCE = new agjd();

    private agjd() {
        super("protected_static", true);
    }

    @Override // defpackage.agey
    public String getInternalDisplayName() {
        return "protected/*protected static*/";
    }

    @Override // defpackage.agey
    public agey normalize() {
        return ageu.INSTANCE;
    }
}
