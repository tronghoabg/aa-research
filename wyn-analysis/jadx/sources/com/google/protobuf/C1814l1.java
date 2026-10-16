package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.l1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1814l1 implements D1 {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f27718a;

    /* renamed from: b, reason: collision with root package name */
    public final X1 f27719b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27720c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1807j0 f27721d;

    public C1814l1(X1 x12, AbstractC1807j0 abstractC1807j0, MessageLite messageLite) {
        this.f27719b = x12;
        ((C1813l0) abstractC1807j0).getClass();
        this.f27720c = messageLite instanceof GeneratedMessageLite.ExtendableMessage;
        this.f27721d = abstractC1807j0;
        this.f27718a = messageLite;
    }

    @Override // com.google.protobuf.D1
    public final void a(Object obj) {
        ((Y1) this.f27719b).getClass();
        ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
        ((C1813l0) this.f27721d).getClass();
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m();
    }

    @Override // com.google.protobuf.D1
    public final boolean b(Object obj) {
        ((C1813l0) this.f27721d).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions.j();
    }

    @Override // com.google.protobuf.D1
    public final void c(Object obj, Object obj2) {
        E1.l(this.f27719b, obj, obj2);
        if (this.f27720c) {
            ((C1813l0) this.f27721d).getClass();
            C1845w0 c1845w0 = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
            if (c1845w0.f27767a.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable().n(c1845w0);
        }
    }

    @Override // com.google.protobuf.D1
    public final void d(MessageLite messageLite, q2 q2Var) throws IOException {
        ((C1813l0) this.f27721d).getClass();
        Iterator itL = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.l();
        while (itL.hasNext()) {
            Map.Entry entry = (Map.Entry) itL.next();
            FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
            if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldSet$FieldDescriptorLite.isRepeated() || fieldSet$FieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof R0) {
                ((L) q2Var).h(fieldSet$FieldDescriptorLite.getNumber(), ((LazyField) ((R0) entry).f27620a.getValue()).toByteString());
            } else {
                ((L) q2Var).h(fieldSet$FieldDescriptorLite.getNumber(), entry.getValue());
            }
        }
        ((Y1) this.f27719b).getClass();
        ((GeneratedMessageLite) messageLite).unknownFields.writeAsMessageSetTo(q2Var);
    }

    @Override // com.google.protobuf.D1
    public final int e(AbstractMessageLite abstractMessageLite) {
        ((Y1) this.f27719b).getClass();
        int serializedSizeAsMessageSet = ((GeneratedMessageLite) abstractMessageLite).unknownFields.getSerializedSizeAsMessageSet();
        if (!this.f27720c) {
            return serializedSizeAsMessageSet;
        }
        ((C1813l0) this.f27721d).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) abstractMessageLite).extensions.g() + serializedSizeAsMessageSet;
    }

    @Override // com.google.protobuf.D1
    public final void f(Object obj, B b5, ExtensionRegistryLite extensionRegistryLite) {
        X1 x12 = this.f27719b;
        UnknownFieldSetLite unknownFieldSetLiteA = x12.a(obj);
        AbstractC1807j0 abstractC1807j0 = this.f27721d;
        ((C1813l0) abstractC1807j0).getClass();
        C1845w0 c1845w0EnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (b5.a() != Integer.MAX_VALUE) {
            try {
                B b10 = b5;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                if (!j(b10, extensionRegistryLite2, abstractC1807j0, c1845w0EnsureExtensionsAreMutable, x12, unknownFieldSetLiteA)) {
                    break;
                }
                b5 = b10;
                extensionRegistryLite = extensionRegistryLite2;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLiteA;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    @Override // com.google.protobuf.D1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.protobuf.C1797g r21) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1814l1.g(java.lang.Object, byte[], int, int, com.google.protobuf.g):void");
    }

    @Override // com.google.protobuf.D1
    public final int h(GeneratedMessageLite generatedMessageLite) {
        ((Y1) this.f27719b).getClass();
        int iHashCode = generatedMessageLite.unknownFields.hashCode();
        if (!this.f27720c) {
            return iHashCode;
        }
        ((C1813l0) this.f27721d).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.f27767a.hashCode() + (iHashCode * 53);
    }

    @Override // com.google.protobuf.D1
    public final boolean i(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        Y1 y12 = (Y1) this.f27719b;
        y12.getClass();
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        y12.getClass();
        if (!unknownFieldSetLite.equals(generatedMessageLite2.unknownFields)) {
            return false;
        }
        if (!this.f27720c) {
            return true;
        }
        C1813l0 c1813l0 = (C1813l0) this.f27721d;
        c1813l0.getClass();
        C1845w0 c1845w0 = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions;
        c1813l0.getClass();
        return c1845w0.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
    }

    public final boolean j(B b5, ExtensionRegistryLite extensionRegistryLite, AbstractC1807j0 abstractC1807j0, C1845w0 c1845w0, X1 x12, UnknownFieldSetLite unknownFieldSetLite) throws IOException {
        int i5 = b5.f27517b;
        int i10 = WireFormat.MESSAGE_SET_ITEM_TAG;
        MessageLite messageLite = this.f27718a;
        if (i5 != i10) {
            if (WireFormat.getTagWireType(i5) != 2) {
                return b5.y();
            }
            int tagFieldNumber = WireFormat.getTagFieldNumber(i5);
            C1813l0 c1813l0 = (C1813l0) abstractC1807j0;
            c1813l0.getClass();
            GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messageLite, tagFieldNumber);
            if (generatedExtensionFindLiteExtensionByNumber == null) {
                return x12.b(0, b5, unknownFieldSetLite);
            }
            c1813l0.getClass();
            c1845w0.p(generatedExtensionFindLiteExtensionByNumber.descriptor, b5.o(generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().getClass(), extensionRegistryLite));
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber2 = null;
        ByteString byteStringE = null;
        int uInt32 = 0;
        while (b5.a() != Integer.MAX_VALUE) {
            int i11 = b5.f27517b;
            if (i11 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                b5.x(0);
                uInt32 = b5.f27516a.readUInt32();
                ((C1813l0) abstractC1807j0).getClass();
                generatedExtensionFindLiteExtensionByNumber2 = extensionRegistryLite.findLiteExtensionByNumber(messageLite, uInt32);
            } else if (i11 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (generatedExtensionFindLiteExtensionByNumber2 != null) {
                    ((C1813l0) abstractC1807j0).getClass();
                    c1845w0.p(generatedExtensionFindLiteExtensionByNumber2.descriptor, b5.o(generatedExtensionFindLiteExtensionByNumber2.getMessageDefaultInstance().getClass(), extensionRegistryLite));
                } else {
                    byteStringE = b5.e();
                }
            } else if (!b5.y()) {
                break;
            }
        }
        if (b5.f27517b != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteStringE != null) {
            if (generatedExtensionFindLiteExtensionByNumber2 != null) {
                ((C1813l0) abstractC1807j0).getClass();
                MessageLite.Builder builderNewBuilderForType = generatedExtensionFindLiteExtensionByNumber2.getMessageDefaultInstance().newBuilderForType();
                CodedInputStream codedInputStreamNewCodedInput = byteStringE.newCodedInput();
                builderNewBuilderForType.mergeFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
                c1845w0.p(generatedExtensionFindLiteExtensionByNumber2.descriptor, builderNewBuilderForType.buildPartial());
                codedInputStreamNewCodedInput.checkLastTagWas(0);
                return true;
            }
            ((Y1) x12).getClass();
            unknownFieldSetLite.storeField(WireFormat.makeTag(uInt32, 2), byteStringE);
        }
        return true;
    }

    @Override // com.google.protobuf.D1
    public final Object newInstance() {
        MessageLite messageLite = this.f27718a;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).newMutableInstance() : messageLite.newBuilderForType().buildPartial();
    }
}
