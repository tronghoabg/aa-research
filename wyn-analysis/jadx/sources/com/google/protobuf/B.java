package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final CodedInputStream f27516a;

    /* renamed from: b, reason: collision with root package name */
    public int f27517b;

    /* renamed from: c, reason: collision with root package name */
    public int f27518c;

    /* renamed from: d, reason: collision with root package name */
    public int f27519d = 0;

    public B(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.f27516a = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static void A(int i5) throws InvalidProtocolBufferException {
        if ((i5 & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static void z(int i5) throws InvalidProtocolBufferException {
        if ((i5 & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final int a() {
        int i5 = this.f27519d;
        if (i5 != 0) {
            this.f27517b = i5;
            this.f27519d = 0;
        } else {
            this.f27517b = this.f27516a.readTag();
        }
        int i10 = this.f27517b;
        return (i10 == 0 || i10 == this.f27518c) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : WireFormat.getTagFieldNumber(i10);
    }

    public final void b(Object obj, D1 d12, ExtensionRegistryLite extensionRegistryLite) {
        int i5 = this.f27518c;
        this.f27518c = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.f27517b), 4);
        try {
            d12.f(obj, this, extensionRegistryLite);
            if (this.f27517b == this.f27518c) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.f27518c = i5;
        }
    }

    public final void c(Object obj, D1 d12, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        CodedInputStream codedInputStream = this.f27516a;
        int uInt32 = codedInputStream.readUInt32();
        if (codedInputStream.recursionDepth >= codedInputStream.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = codedInputStream.pushLimit(uInt32);
        codedInputStream.recursionDepth++;
        d12.f(obj, this, extensionRegistryLite);
        codedInputStream.checkLastTagWas(0);
        codedInputStream.recursionDepth--;
        codedInputStream.popLimit(iPushLimit);
    }

    public final void d(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof C1806j;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.readBool()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f27517b);
                this.f27519d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Boolean.valueOf(codedInputStream.readBool()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        C1806j c1806j = (C1806j) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 0) {
            do {
                c1806j.addBoolean(codedInputStream.readBool());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            c1806j.addBoolean(codedInputStream.readBool());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final ByteString e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        x(2);
        return this.f27516a.readBytes();
    }

    public final void f(List list) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.f27517b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(e());
            CodedInputStream codedInputStream = this.f27516a;
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == this.f27517b);
        this.f27519d = tag;
    }

    public final void g(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof C1780a0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.readDouble()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f27517b);
                this.f27519d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = codedInputStream.readUInt32();
            A(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Double.valueOf(codedInputStream.readDouble()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        C1780a0 c1780a0 = (C1780a0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 1) {
            do {
                c1780a0.addDouble(codedInputStream.readDouble());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt322 = codedInputStream.readUInt32();
        A(uInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
        do {
            c1780a0.addDouble(codedInputStream.readDouble());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void h(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof G0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readEnum()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f27517b);
                this.f27519d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readEnum()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        G0 g02 = (G0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 0) {
            do {
                g02.addInt(codedInputStream.readEnum());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            g02.addInt(codedInputStream.readEnum());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final Object i(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i5 = A.f27511a[fieldType.ordinal()];
        CodedInputStream codedInputStream = this.f27516a;
        switch (i5) {
            case 1:
                x(0);
                return Boolean.valueOf(codedInputStream.readBool());
            case 2:
                return e();
            case 3:
                x(1);
                return Double.valueOf(codedInputStream.readDouble());
            case 4:
                x(0);
                return Integer.valueOf(codedInputStream.readEnum());
            case 5:
                x(5);
                return Integer.valueOf(codedInputStream.readFixed32());
            case 6:
                x(1);
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                x(5);
                return Float.valueOf(codedInputStream.readFloat());
            case 8:
                x(0);
                return Integer.valueOf(codedInputStream.readInt32());
            case 9:
                x(0);
                return Long.valueOf(codedInputStream.readInt64());
            case 10:
                return o(cls, extensionRegistryLite);
            case 11:
                x(5);
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 12:
                x(1);
                return Long.valueOf(codedInputStream.readSFixed64());
            case 13:
                x(0);
                return Integer.valueOf(codedInputStream.readSInt32());
            case 14:
                x(0);
                return Long.valueOf(codedInputStream.readSInt64());
            case 15:
                x(2);
                return codedInputStream.readStringRequireUtf8();
            case 16:
                x(0);
                return Integer.valueOf(codedInputStream.readUInt32());
            case 17:
                x(0);
                return Long.valueOf(codedInputStream.readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void j(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof G0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                z(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(codedInputStream.readFixed32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readFixed32()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f27517b);
            this.f27519d = tag;
            return;
        }
        G0 g02 = (G0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 2) {
            int uInt322 = codedInputStream.readUInt32();
            z(uInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
            do {
                g02.addInt(codedInputStream.readFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            g02.addInt(codedInputStream.readFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f27517b);
        this.f27519d = tag2;
    }

    public final void k(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof Y0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f27517b);
                this.f27519d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = codedInputStream.readUInt32();
            A(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        Y0 y02 = (Y0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 1) {
            do {
                y02.addLong(codedInputStream.readFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt322 = codedInputStream.readUInt32();
        A(uInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
        do {
            y02.addLong(codedInputStream.readFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void l(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof C1854z0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                z(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Float.valueOf(codedInputStream.readFloat()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(codedInputStream.readFloat()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f27517b);
            this.f27519d = tag;
            return;
        }
        C1854z0 c1854z0 = (C1854z0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 2) {
            int uInt322 = codedInputStream.readUInt32();
            z(uInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
            do {
                c1854z0.addFloat(codedInputStream.readFloat());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c1854z0.addFloat(codedInputStream.readFloat());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f27517b);
        this.f27519d = tag2;
    }

    public final void m(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof G0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f27517b);
                this.f27519d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        G0 g02 = (G0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 0) {
            do {
                g02.addInt(codedInputStream.readInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            g02.addInt(codedInputStream.readInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void n(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof Y0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f27517b);
                this.f27519d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        Y0 y02 = (Y0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 0) {
            do {
                y02.addLong(codedInputStream.readInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            y02.addLong(codedInputStream.readInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final Object o(Class cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        x(2);
        D1 d1A = C1846w1.f27770c.a(cls);
        Object objNewInstance = d1A.newInstance();
        c(objNewInstance, d1A, extensionRegistryLite);
        d1A.a(objNewInstance);
        return objNewInstance;
    }

    public final void p(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof G0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                z(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(codedInputStream.readSFixed32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readSFixed32()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f27517b);
            this.f27519d = tag;
            return;
        }
        G0 g02 = (G0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 2) {
            int uInt322 = codedInputStream.readUInt32();
            z(uInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
            do {
                g02.addInt(codedInputStream.readSFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            g02.addInt(codedInputStream.readSFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f27517b);
        this.f27519d = tag2;
    }

    public final void q(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof Y0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f27517b);
                this.f27519d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = codedInputStream.readUInt32();
            A(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readSFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        Y0 y02 = (Y0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 1) {
            do {
                y02.addLong(codedInputStream.readSFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt322 = codedInputStream.readUInt32();
        A(uInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt322;
        do {
            y02.addLong(codedInputStream.readSFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void r(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof G0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readSInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f27517b);
                this.f27519d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readSInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        G0 g02 = (G0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 0) {
            do {
                g02.addInt(codedInputStream.readSInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            g02.addInt(codedInputStream.readSInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void s(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof Y0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f27517b);
                this.f27519d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readSInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        Y0 y02 = (Y0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 0) {
            do {
                y02.addLong(codedInputStream.readSInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            y02.addLong(codedInputStream.readSInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void t(List list, boolean z2) throws IOException {
        String string;
        int tag;
        int tag2;
        if (WireFormat.getTagWireType(this.f27517b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z10 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.f27516a;
        if (z10 && !z2) {
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.add(e());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        do {
            if (z2) {
                x(2);
                string = codedInputStream.readStringRequireUtf8();
            } else {
                x(2);
                string = codedInputStream.readString();
            }
            list.add(string);
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == this.f27517b);
        this.f27519d = tag;
    }

    public final void u(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof G0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readUInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f27517b);
                this.f27519d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readUInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        G0 g02 = (G0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 0) {
            do {
                g02.addInt(codedInputStream.readUInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            g02.addInt(codedInputStream.readUInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void v(List list) throws IOException {
        int tag;
        int tag2;
        boolean z2 = list instanceof Y0;
        CodedInputStream codedInputStream = this.f27516a;
        if (!z2) {
            int tagWireType = WireFormat.getTagWireType(this.f27517b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readUInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f27517b);
                this.f27519d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readUInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        Y0 y02 = (Y0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f27517b);
        if (tagWireType2 == 0) {
            do {
                y02.addLong(codedInputStream.readUInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f27517b);
            this.f27519d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            y02.addLong(codedInputStream.readUInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void w(int i5) throws InvalidProtocolBufferException {
        if (this.f27516a.getTotalBytesRead() != i5) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void x(int i5) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (WireFormat.getTagWireType(this.f27517b) != i5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final boolean y() {
        int i5;
        CodedInputStream codedInputStream = this.f27516a;
        if (codedInputStream.isAtEnd() || (i5 = this.f27517b) == this.f27518c) {
            return false;
        }
        return codedInputStream.skipField(i5);
    }
}
