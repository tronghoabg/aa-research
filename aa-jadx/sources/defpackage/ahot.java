package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahot implements defpackage.ahqg {
    protected int memoizedHashCode = 0;

    public defpackage.ahqy newUninitializedMessageException() {
        return new defpackage.ahqy(this);
    }

    @Override // defpackage.ahqg
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            defpackage.ahpe ahpeVarNewInstance = defpackage.ahpe.newInstance(bArr);
            writeTo(ahpeVarNewInstance);
            ahpeVarNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public void writeDelimitedTo(java.io.OutputStream outputStream) throws java.io.IOException {
        int serializedSize = getSerializedSize();
        defpackage.ahpe ahpeVarNewInstance = defpackage.ahpe.newInstance(outputStream, defpackage.ahpe.computePreferredBufferSize(defpackage.ahpe.computeRawVarint32Size(serializedSize) + serializedSize));
        ahpeVarNewInstance.writeRawVarint32(serializedSize);
        writeTo(ahpeVarNewInstance);
        ahpeVarNewInstance.flush();
    }
}
