package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agkd extends defpackage.agfy {
    public static final defpackage.agkd INSTANCE = new defpackage.agkd();

    private agkd() {
        super("protected_static", true);
    }

    @Override // defpackage.agfy
    public java.lang.String getInternalDisplayName() {
        return "protected/*protected static*/";
    }

    @Override // defpackage.agfy
    public defpackage.agfy normalize() {
        return defpackage.agfu.INSTANCE;
    }
}
