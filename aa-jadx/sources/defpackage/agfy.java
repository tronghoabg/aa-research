package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class agfy {
    private final boolean isPublicAPI;
    private final java.lang.String name;

    protected agfy(java.lang.String str, boolean z) {
        str.getClass();
        this.name = str;
        this.isPublicAPI = z;
    }

    public java.lang.Integer compareTo(defpackage.agfy agfyVar) {
        agfyVar.getClass();
        return defpackage.agfx.INSTANCE.compareLocal$org_jetbrains_kotlin_compiler_common(this, agfyVar);
    }

    public java.lang.String getInternalDisplayName() {
        return this.name;
    }

    public final boolean isPublicAPI() {
        return this.isPublicAPI;
    }

    public final java.lang.String toString() {
        return getInternalDisplayName();
    }

    public defpackage.agfy normalize() {
        return this;
    }
}
