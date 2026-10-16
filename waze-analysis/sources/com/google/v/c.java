package com.google.v;

import com.google.v.b;
import com.google.v.c;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> implements fi {
    protected transient int memoizedHashCode = 0;

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        b.addAll((Iterable) iterable, (List) list);
    }

    protected static void checkByteStringIsUtf8(v vVar) {
        if (!vVar.l()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    int getSerializedSize(ft ftVar) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iA = ftVar.a(this);
        setMemoizedSerializedSize(iA);
        return iA;
    }

    public fn mutableCopy() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    gd newUninitializedMessageException() {
        return new gd();
    }

    void setMemoizedSerializedSize(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.v.fi
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            ae aeVarAb = ae.ab(bArr);
            writeTo(aeVarAb);
            aeVarAb.ad();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e2);
        }
    }

    @Override // com.google.v.fi
    public v toByteString() {
        try {
            int serializedSize = getSerializedSize();
            v vVar = v.f13054a;
            byte[] bArr = new byte[serializedSize];
            ae aeVarAb = ae.ab(bArr);
            writeTo(aeVarAb);
            return dc.a(aeVarAb, bArr);
        } catch (IOException e2) {
            throw new RuntimeException(this.getSerializingExceptionMessage("ByteString"), e2);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        ad adVar = new ad(outputStream, ae.N(ae.W(serializedSize) + serializedSize));
        adVar.v(serializedSize);
        writeTo(adVar);
        adVar.c();
    }

    @Override // com.google.v.fi
    public void writeTo(OutputStream outputStream) {
        ad adVar = new ad(outputStream, ae.N(getSerializedSize()));
        writeTo(adVar);
        adVar.c();
    }
}
