package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class G1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final G1 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile Parser<G1> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private C3270s0 currentDocument_;
    private Object operation_;
    private Q updateMask_;
    private int operationCase_ = 0;
    private Internal.ProtobufList<Z> updateTransforms_ = GeneratedMessageLite.emptyProtobufList();

    static {
        G1 g12 = new G1();
        DEFAULT_INSTANCE = g12;
        GeneratedMessageLite.registerDefaultInstance(G1.class, g12);
    }

    public static void b(G1 g12, Q q4) {
        g12.getClass();
        q4.getClass();
        g12.updateMask_ = q4;
        g12.bitField0_ |= 1;
    }

    public static void c(G1 g12, Z z2) {
        g12.getClass();
        z2.getClass();
        Internal.ProtobufList<Z> protobufList = g12.updateTransforms_;
        if (!protobufList.isModifiable()) {
            g12.updateTransforms_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        g12.updateTransforms_.add(z2);
    }

    public static void d(G1 g12, H h10) {
        g12.getClass();
        h10.getClass();
        g12.operation_ = h10;
        g12.operationCase_ = 1;
    }

    public static void e(G1 g12, C3270s0 c3270s0) {
        g12.getClass();
        c3270s0.getClass();
        g12.currentDocument_ = c3270s0;
        g12.bitField0_ |= 2;
    }

    public static void f(G1 g12, String str) {
        g12.getClass();
        str.getClass();
        g12.operationCase_ = 2;
        g12.operation_ = str;
    }

    public static void g(G1 g12, String str) {
        g12.getClass();
        str.getClass();
        g12.operationCase_ = 5;
        g12.operation_ = str;
    }

    public static E1 t() {
        return (E1) DEFAULT_INSTANCE.createBuilder();
    }

    public static E1 u(G1 g12) {
        return (E1) DEFAULT_INSTANCE.createBuilder(g12);
    }

    public static G1 v(byte[] bArr) {
        return (G1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (D1.f39343a[methodToInvoke.ordinal()]) {
            case 1:
                return new G1();
            case 2:
                return new E1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", H.class, "updateMask_", "currentDocument_", C3218a0.class, "updateTransforms_", Z.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<G1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (G1.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final C3270s0 h() {
        C3270s0 c3270s0 = this.currentDocument_;
        return c3270s0 == null ? C3270s0.e() : c3270s0;
    }

    public final String i() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public final F1 j() {
        int i5 = this.operationCase_;
        if (i5 == 0) {
            return F1.f39349e;
        }
        if (i5 == 1) {
            return F1.f39345a;
        }
        if (i5 == 2) {
            return F1.f39346b;
        }
        if (i5 == 5) {
            return F1.f39347c;
        }
        if (i5 != 6) {
            return null;
        }
        return F1.f39348d;
    }

    public final C3218a0 k() {
        return this.operationCase_ == 6 ? (C3218a0) this.operation_ : C3218a0.b();
    }

    public final H l() {
        return this.operationCase_ == 1 ? (H) this.operation_ : H.e();
    }

    public final Q m() {
        Q q4 = this.updateMask_;
        return q4 == null ? Q.c() : q4;
    }

    public final Internal.ProtobufList n() {
        return this.updateTransforms_;
    }

    public final String o() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    public final boolean p() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean q() {
        return this.operationCase_ == 6;
    }

    public final boolean r() {
        return this.operationCase_ == 1;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }
}
