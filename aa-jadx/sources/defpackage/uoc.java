package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uoc implements defpackage.uol {
    public final /* synthetic */ defpackage.uon a;
    public final /* synthetic */ defpackage.uoo b;
    public final /* synthetic */ defpackage.uov c;
    private final /* synthetic */ int d;

    public /* synthetic */ uoc(defpackage.uon uonVar, defpackage.uov uovVar, defpackage.uoo uooVar, int i) {
        this.d = i;
        this.a = uonVar;
        this.c = uovVar;
        this.b = uooVar;
    }

    @Override // defpackage.uol
    public final void a(byte[] bArr) {
        int i = this.d;
        if (i == 0) {
            this.a.j((defpackage.uou) this.c, bArr, this.b);
            return;
        }
        if (i == 1) {
            this.a.j((defpackage.uou) this.c, bArr, this.b);
        } else {
            if (i == 2) {
                defpackage.uoo uooVar = this.b;
                this.a.q(this.c, bArr, uooVar);
                return;
            }
            defpackage.uoo uooVar2 = this.b;
            if (i != 3) {
                this.a.j((defpackage.uou) this.c, bArr, uooVar2);
            } else {
                this.a.q(this.c, bArr, uooVar2);
            }
        }
    }
}
