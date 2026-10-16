package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3251l0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3251l0 DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile Parser<C3251l0> PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    static {
        C3251l0 c3251l0 = new C3251l0();
        DEFAULT_INSTANCE = c3251l0;
        GeneratedMessageLite.registerDefaultInstance(C3251l0.class, c3251l0);
    }

    public static C3251l0 b() {
        return DEFAULT_INSTANCE;
    }

    public final K c() {
        return this.responseTypeCase_ == 3 ? (K) this.responseType_ : K.b();
    }

    public final N d() {
        return this.responseTypeCase_ == 4 ? (N) this.responseType_ : N.b();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3245j0.f39421a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3251l0();
            case 2:
                return new C3248k0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", s1.class, K.class, N.class, C3227d0.class, U.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3251l0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3251l0.class) {
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

    public final U e() {
        return this.responseTypeCase_ == 6 ? (U) this.responseType_ : U.b();
    }

    public final C3227d0 f() {
        return this.responseTypeCase_ == 5 ? (C3227d0) this.responseType_ : C3227d0.c();
    }

    public final int g() {
        int i5 = this.responseTypeCase_;
        if (i5 == 0) {
            return 6;
        }
        if (i5 == 2) {
            return 1;
        }
        int i10 = 3;
        if (i5 == 3) {
            return 2;
        }
        if (i5 != 4) {
            i10 = 5;
            if (i5 != 5) {
                return i5 != 6 ? 0 : 4;
            }
        }
        return i10;
    }

    public final s1 h() {
        return this.responseTypeCase_ == 2 ? (s1) this.responseType_ : s1.c();
    }
}
