package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class und implements unn {
    public final /* synthetic */ unp a;
    public final /* synthetic */ unq b;
    public final /* synthetic */ unx c;
    private final /* synthetic */ int d;

    public /* synthetic */ und(unp unpVar, unx unxVar, unq unqVar, int i) {
        this.d = i;
        this.a = unpVar;
        this.c = unxVar;
        this.b = unqVar;
    }

    @Override // defpackage.unn
    public final void a(byte[] bArr) {
        int i = this.d;
        if (i == 0) {
            this.a.j((unw) this.c, bArr, this.b);
            return;
        }
        if (i == 1) {
            this.a.j((unw) this.c, bArr, this.b);
        } else {
            if (i == 2) {
                unq unqVar = this.b;
                this.a.q(this.c, bArr, unqVar);
                return;
            }
            unq unqVar2 = this.b;
            if (i != 3) {
                this.a.j((unw) this.c, bArr, unqVar2);
            } else {
                this.a.q(this.c, bArr, unqVar2);
            }
        }
    }
}
