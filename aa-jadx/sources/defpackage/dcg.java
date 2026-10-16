package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dcg implements defpackage.cyv {
    public final int a;
    public java.lang.Float b = null;
    public java.lang.Float c = null;
    public defpackage.ddx d = null;
    public defpackage.ddx e = null;
    private final java.util.List f;

    public dcg(int i, java.util.List list) {
        this.a = i;
        this.f = list;
    }

    @Override // defpackage.cyv
    public final boolean w() {
        return this.f.contains(this);
    }
}
