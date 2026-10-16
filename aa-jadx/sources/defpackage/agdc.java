package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class agdc {
    protected agdc() {
    }

    public final java.lang.Integer compareTo(defpackage.agdc agdcVar) {
        agdcVar.getClass();
        return getDelegate().compareTo(agdcVar.getDelegate());
    }

    public abstract defpackage.agfy getDelegate();

    public abstract java.lang.String getInternalDisplayName();

    public final boolean isPublicAPI() {
        return getDelegate().isPublicAPI();
    }

    public abstract boolean isVisible(defpackage.ahza ahzaVar, defpackage.agcm agcmVar, defpackage.agci agciVar, boolean z);

    public abstract defpackage.agdc normalize();

    public final java.lang.String toString() {
        return getDelegate().toString();
    }
}
