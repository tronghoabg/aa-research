package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dj implements e.a.bb {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f46806a;

    dj(int i2) {
        this.f46806a = i2;
    }

    @Override // e.a.cl
    public final /* synthetic */ Object a(byte[] bArr) {
        if (this.f46806a != 0) {
            return bArr;
        }
        if (bArr.length < 3) {
            throw new NumberFormatException("Malformed status code ".concat(new String(bArr, e.a.bc.f46477a)));
        }
        return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
    }

    @Override // e.a.cl
    public final /* synthetic */ byte[] b(Object obj) {
        if (this.f46806a != 0) {
            return (byte[]) obj;
        }
        throw new UnsupportedOperationException();
    }
}
