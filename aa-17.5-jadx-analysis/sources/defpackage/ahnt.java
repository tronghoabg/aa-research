package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public abstract class ahnt implements ahpg {
    protected int memoizedHashCode = 0;

    public ahpy newUninitializedMessageException() {
        return new ahpy(this);
    }

    @Override // defpackage.ahpg
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            ahoe ahoeVarNewInstance = ahoe.newInstance(bArr);
            writeTo(ahoeVarNewInstance);
            ahoeVarNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        ahoe ahoeVarNewInstance = ahoe.newInstance(outputStream, ahoe.computePreferredBufferSize(ahoe.computeRawVarint32Size(serializedSize) + serializedSize));
        ahoeVarNewInstance.writeRawVarint32(serializedSize);
        writeTo(ahoeVarNewInstance);
        ahoeVarNewInstance.flush();
    }
}
