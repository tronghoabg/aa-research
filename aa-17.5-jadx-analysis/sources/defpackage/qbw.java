package defpackage;

/* loaded from: classes2.dex */
public abstract class qbw {
    public final String a;
    public final qbt b;

    @Deprecated
    protected qbw(String str, qbt qbtVar) {
        this.a = str;
        this.b = qbtVar;
    }

    public abstract Object a();

    public final String toString() {
        return String.format("%s; FeatureType: %s, Name: %s", getClass().getSimpleName(), this.b, this.a);
    }
}
