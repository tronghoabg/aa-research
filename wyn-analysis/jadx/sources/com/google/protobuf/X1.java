package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class X1 {
    public abstract UnknownFieldSetLite a(Object obj);

    public final boolean b(int i5, B b5, Object obj) throws IOException {
        int i10 = b5.f27517b;
        int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            b5.x(0);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 0), Long.valueOf(b5.f27516a.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            b5.x(1);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 1), Long.valueOf(b5.f27516a.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 2), b5.e());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            b5.x(5);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 5), Integer.valueOf(b5.f27516a.readFixed32()));
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i11 = i5 + 1;
        if (i11 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        while (b5.a() != Integer.MAX_VALUE && b(i11, b5, unknownFieldSetLiteNewInstance)) {
        }
        if (iMakeTag != b5.f27517b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        unknownFieldSetLiteNewInstance.makeImmutable();
        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 3), unknownFieldSetLiteNewInstance);
        return true;
    }

    public abstract void c(Object obj, Object obj2);
}
