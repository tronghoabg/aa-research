package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class abng<MessageType extends defpackage.abng<MessageType, BuilderType>, BuilderType extends defpackage.abnf<MessageType, BuilderType>> implements defpackage.abpy {
    protected transient int ak = 0;

    private final java.lang.String a(java.lang.String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int e(defpackage.abqn abqnVar) {
        throw null;
    }

    @Override // defpackage.abpy
    public final defpackage.abnv f() {
        try {
            int iM = m();
            defpackage.abnv abnvVar = defpackage.abnv.d;
            byte[] bArr = new byte[iM];
            defpackage.aboa aboaVar = new defpackage.aboa(bArr, 0, iM, null);
            R(aboaVar);
            aboaVar.I();
            return new defpackage.abnt(bArr);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(a("ByteString"), e);
        }
    }

    @Override // defpackage.abpy
    public final void g(java.io.OutputStream outputStream) throws java.io.IOException {
        int iM = m();
        if (iM > 4096) {
            iM = 4096;
        }
        defpackage.aboe aboeVar = new defpackage.aboe(outputStream, iM);
        R(aboeVar);
        aboeVar.c();
    }

    @Override // defpackage.abpy
    public final byte[] h() {
        try {
            int iM = m();
            byte[] bArr = new byte[iM];
            defpackage.aboa aboaVar = new defpackage.aboa(bArr, 0, iM, null);
            R(aboaVar);
            aboaVar.I();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(a("byte array"), e);
        }
    }
}
