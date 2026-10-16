package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aixa implements defpackage.afeb {
    final /* synthetic */ int a;
    final /* synthetic */ java.util.List b;

    public aixa(int i, java.util.List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.afeb
    public final java.lang.StackTraceElement di() {
        return (java.lang.StackTraceElement) this.b.get(this.a);
    }

    @Override // defpackage.afeb
    public final defpackage.afeb dj() {
        return defpackage.aibt.a(this.b, this.a + 1);
    }
}
