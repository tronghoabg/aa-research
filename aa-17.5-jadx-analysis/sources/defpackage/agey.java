package defpackage;

/* loaded from: classes3.dex */
public class agey {
    private final boolean isPublicAPI;
    private final String name;

    protected agey(String str, boolean z) {
        str.getClass();
        this.name = str;
        this.isPublicAPI = z;
    }

    public Integer compareTo(agey ageyVar) {
        ageyVar.getClass();
        return agex.INSTANCE.compareLocal$org_jetbrains_kotlin_compiler_common(this, ageyVar);
    }

    public String getInternalDisplayName() {
        return this.name;
    }

    public final boolean isPublicAPI() {
        return this.isPublicAPI;
    }

    public final String toString() {
        return getInternalDisplayName();
    }

    public agey normalize() {
        return this;
    }
}
