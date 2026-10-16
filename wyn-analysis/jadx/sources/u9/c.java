package u9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import ka.H;

/* loaded from: classes4.dex */
public final class c extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final c DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<c> PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
    }

    public static void b(c cVar, boolean z2) {
        cVar.hasCommittedMutations_ = z2;
    }

    public static void c(c cVar, f fVar) {
        cVar.getClass();
        fVar.getClass();
        cVar.documentType_ = fVar;
        cVar.documentTypeCase_ = 1;
    }

    public static void d(c cVar, H h10) {
        cVar.getClass();
        h10.getClass();
        cVar.documentType_ = h10;
        cVar.documentTypeCase_ = 2;
    }

    public static void e(c cVar, m mVar) {
        cVar.getClass();
        mVar.getClass();
        cVar.documentType_ = mVar;
        cVar.documentTypeCase_ = 3;
    }

    public static b k() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static c l(byte[] bArr) {
        return (c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4263a.f46737a[methodToInvoke.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", f.class, H.class, m.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<c> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (c.class) {
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

    public final H f() {
        return this.documentTypeCase_ == 2 ? (H) this.documentType_ : H.e();
    }

    public final int g() {
        int i5 = this.documentTypeCase_;
        if (i5 == 0) {
            return 4;
        }
        int i10 = 1;
        if (i5 != 1) {
            i10 = 2;
            if (i5 != 2) {
                i10 = 3;
                if (i5 != 3) {
                    return 0;
                }
            }
        }
        return i10;
    }

    public final boolean h() {
        return this.hasCommittedMutations_;
    }

    public final f i() {
        return this.documentTypeCase_ == 1 ? (f) this.documentType_ : f.d();
    }

    public final m j() {
        return this.documentTypeCase_ == 3 ? (m) this.documentType_ : m.d();
    }
}
