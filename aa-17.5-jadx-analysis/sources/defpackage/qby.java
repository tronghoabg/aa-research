package defpackage;

/* loaded from: classes2.dex */
public final class qby extends qbw {
    aaem c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qby(String str, qbt qbtVar) {
        this(str, qbtVar, null);
        sid sidVar = sio.a;
    }

    @Override // defpackage.qbw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized aaem a() {
        aaem aaemVar;
        aaemVar = this.c;
        if (aaemVar == null) {
            aaemVar = new aaem();
            this.c = aaemVar;
        }
        return aaemVar;
    }

    public qby(String str, qbt qbtVar, byte[] bArr) {
        super(str, qbtVar);
        this.c = null;
    }
}
