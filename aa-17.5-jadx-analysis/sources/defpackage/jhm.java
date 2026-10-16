package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class jhm implements emj {
    public final /* synthetic */ jhp a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ jhm(jhp jhpVar, int i, int i2) {
        this.c = i2;
        this.a = jhpVar;
        this.b = i;
    }

    @Override // defpackage.emj
    public final void a(emm emmVar, boolean z, float f) {
        if (this.c != 0) {
            if (z) {
                return;
            }
            int i = this.b;
            jhp jhpVar = this.a;
            jhpVar.m = false;
            jhpVar.r = i;
            jhpVar.g(jhpVar.c());
            return;
        }
        if (z) {
            return;
        }
        int i2 = this.b;
        jhp jhpVar2 = this.a;
        jhpVar2.r = i2;
        jhpVar2.m = false;
        jhpVar2.g(jhpVar2.c());
    }
}
