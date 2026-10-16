package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agkb extends defpackage.agfy {
    public static final defpackage.agkb INSTANCE = new defpackage.agkb();

    private agkb() {
        super("package", false);
    }

    @Override // defpackage.agfy
    public java.lang.Integer compareTo(defpackage.agfy agfyVar) {
        agfyVar.getClass();
        if (this == agfyVar) {
            return 0;
        }
        return defpackage.agfx.INSTANCE.isPrivate(agfyVar) ? 1 : -1;
    }

    @Override // defpackage.agfy
    public java.lang.String getInternalDisplayName() {
        return "public/*package*/";
    }

    @Override // defpackage.agfy
    public defpackage.agfy normalize() {
        return defpackage.agfu.INSTANCE;
    }
}
