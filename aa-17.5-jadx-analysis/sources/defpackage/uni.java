package defpackage;

/* loaded from: classes3.dex */
final class uni implements upw {
    final /* synthetic */ String a;
    final /* synthetic */ unp b;

    public uni(unp unpVar, String str) {
        this.a = str;
        this.b = unpVar;
    }

    @Override // defpackage.upw
    public final synchronized void a(upy upyVar) {
        boolean zS;
        boolean zS2;
        boolean zS3;
        if (upyVar.l()) {
            unp unpVar = this.b;
            if (unpVar.k.get()) {
                yig yigVar = this.b.e;
                synchronized (yigVar) {
                    zS = yigVar.s(this.a);
                }
                if (zS) {
                }
            } else {
                yig yigVar2 = unpVar.e;
                synchronized (yigVar2) {
                    zS2 = yigVar2.s(this.a);
                }
                if (zS2) {
                }
                yig yigVar3 = this.b.f;
                synchronized (yigVar3) {
                    zS3 = yigVar3.s(this.a);
                }
                if (zS3) {
                }
            }
        }
    }
}
