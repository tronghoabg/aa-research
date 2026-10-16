package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aisx implements defpackage.aisp, defpackage.aisi {
    public final defpackage.aisp a;

    public aisx(defpackage.aisp aispVar) {
        this.a = aispVar;
    }

    @Override // defpackage.aisp
    public final java.util.Iterator a() {
        return new defpackage.aish(this, 2);
    }

    @Override // defpackage.aisi
    public final defpackage.aisp b(int i) {
        return i >= 2 ? defpackage.aisj.a : new defpackage.aisw(this.a, 1, 0);
    }
}
