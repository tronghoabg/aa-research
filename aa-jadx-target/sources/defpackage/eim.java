package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class eim<MessageType extends defpackage.eim<MessageType, BuilderType>, BuilderType extends defpackage.eil<MessageType, BuilderType>> implements defpackage.ekm {
    protected int memoizedHashCode = 0;

    public int c(ekx ekxVar) {
        throw null;
    }

    @Override // defpackage.ekm
    public final eix d() {
        try {
            int iH = h();
            eix eixVar = eix.b;
            byte[] bArr = new byte[iH];
            boolean z = eje.e;
            ejc ejcVar = new ejc(bArr, iH);
            r(ejcVar);
            return dto.c(ejcVar, bArr);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
