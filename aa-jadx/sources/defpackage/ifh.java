package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ifh implements defpackage.ifn {
    private final boolean a;
    private defpackage.ifi b;

    public ifh(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ifn
    public final defpackage.ifm a(int i) {
        if (i == 5) {
            return defpackage.ifk.a;
        }
        defpackage.ifi ifiVar = this.b;
        if (ifiVar != null) {
            return ifiVar;
        }
        defpackage.ifi ifiVar2 = new defpackage.ifi(this.a);
        this.b = ifiVar2;
        return ifiVar2;
    }
}
