package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class eim<MessageType extends defpackage.eim<MessageType, BuilderType>, BuilderType extends defpackage.eil<MessageType, BuilderType>> implements defpackage.ekm {
    protected int memoizedHashCode = 0;

    public int c(defpackage.ekx ekxVar) {
        throw null;
    }

    @Override // defpackage.ekm
    public final defpackage.eix d() {
        try {
            int iH = h();
            defpackage.eix eixVar = defpackage.eix.b;
            byte[] bArr = new byte[iH];
            boolean z = defpackage.eje.e;
            defpackage.ejc ejcVar = new defpackage.ejc(bArr, iH);
            r(ejcVar);
            return defpackage.dto.c(ejcVar, bArr);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
