package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jht implements defpackage.emq {
    public final /* synthetic */ defpackage.jhw a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ jht(defpackage.jhw jhwVar, int i, int i2) {
        this.c = i2;
        this.a = jhwVar;
        this.b = i;
    }

    @Override // defpackage.emq
    public final void a(defpackage.emt emtVar, boolean z, float f) {
        if (this.c != 0) {
            if (z) {
                return;
            }
            int i = this.b;
            defpackage.jhw jhwVar = this.a;
            jhwVar.m = false;
            jhwVar.r = i;
            jhwVar.g(jhwVar.c());
            return;
        }
        if (z) {
            return;
        }
        int i2 = this.b;
        defpackage.jhw jhwVar2 = this.a;
        jhwVar2.r = i2;
        jhwVar2.m = false;
        jhwVar2.g(jhwVar2.c());
    }
}
