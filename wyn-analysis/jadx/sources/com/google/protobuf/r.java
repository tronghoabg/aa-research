package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class r extends ByteString {
    public abstract boolean a(r rVar, int i5, int i10);

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return 0;
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i5) {
        return byteAt(i5);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        return true;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return super.iterator2();
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToReverse(ByteOutput byteOutput) throws IOException {
        writeTo(byteOutput);
    }
}
