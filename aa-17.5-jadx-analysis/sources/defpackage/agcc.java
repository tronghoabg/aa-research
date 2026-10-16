package defpackage;

/* loaded from: classes3.dex */
public abstract class agcc {
    protected agcc() {
    }

    public final Integer compareTo(agcc agccVar) {
        agccVar.getClass();
        return getDelegate().compareTo(agccVar.getDelegate());
    }

    public abstract agey getDelegate();

    public abstract String getInternalDisplayName();

    public final boolean isPublicAPI() {
        return getDelegate().isPublicAPI();
    }

    public abstract boolean isVisible(ahya ahyaVar, agbm agbmVar, agbi agbiVar, boolean z);

    public abstract agcc normalize();

    public final String toString() {
        return getDelegate().toString();
    }
}
