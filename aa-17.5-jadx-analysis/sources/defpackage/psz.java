package defpackage;

/* loaded from: classes2.dex */
public final class psz implements pwd {
    private final xxh c;
    final ykd b = new ykd(this, null);
    public final zhc a = new zhc();

    public psz(xxh xxhVar) {
        this.c = xxhVar;
    }

    @Override // defpackage.pwd
    public final pwe a() {
        return pwe.c;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, zsl] */
    @Override // defpackage.pwd
    public final pwn c() {
        sm smVar = (sm) ((xxm) this.c).a;
        String strH = smVar.H();
        if (strH == null) {
            smVar.a.b(new aaar(this.b, 0));
            strH = smVar.H();
        }
        if (strH == null) {
            return null;
        }
        return new pwn("apiToken", strH);
    }

    @Override // defpackage.pwd
    public final zgp d() {
        zgp zgpVarZ;
        pwn pwnVarC = c();
        if (pwnVarC != null) {
            return wub.Y(pwnVarC);
        }
        synchronized (this) {
            zgpVarZ = wub.Z(this.a);
        }
        return zgpVarZ;
    }

    @Override // defpackage.pwd
    public final /* synthetic */ void e() {
    }
}
