package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class une implements unm {
    public final /* synthetic */ unp a;
    public final /* synthetic */ unq b;
    public final /* synthetic */ unx c;
    private final /* synthetic */ int d;

    public /* synthetic */ une(unp unpVar, unx unxVar, unq unqVar, int i) {
        this.d = i;
        this.a = unpVar;
        this.c = unxVar;
        this.b = unqVar;
    }

    @Override // defpackage.unm
    public final void a(String str) {
        int i = this.d;
        if (i == 0) {
            this.a.h((unw) this.c, this.b, null, str);
            return;
        }
        if (i == 1) {
            this.a.h((unw) this.c, this.b, null, str);
        } else {
            if (i == 2) {
                unq unqVar = this.b;
                this.a.w(this.c, unqVar, null, str);
                return;
            }
            unq unqVar2 = this.b;
            if (i != 3) {
                this.a.h((unw) this.c, unqVar2, null, str);
            } else {
                this.a.w(this.c, unqVar2, null, str);
            }
        }
    }
}
