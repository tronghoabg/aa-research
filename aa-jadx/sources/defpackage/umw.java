package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class umw extends defpackage.uuf {
    private final int a;
    public final defpackage.uub d;

    public umw(defpackage.uub uubVar, defpackage.uua uuaVar, int i) {
        super(uubVar.c(), uuaVar);
        this.a = i;
        this.d = uubVar;
    }

    @Override // defpackage.uuf, defpackage.uud
    public final int i() {
        return this.a;
    }

    @Override // defpackage.uuf, defpackage.uud
    public final defpackage.uub j() {
        return this.d;
    }
}
