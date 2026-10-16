package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.h1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3240h1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3240h1 DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile Parser<C3240h1> PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private D endAt_;
    private Int32Value limit_;
    private int offset_;
    private C3228d1 select_;
    private D startAt_;
    private Z0 where_;
    private Internal.ProtobufList<N0> from_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<C3222b1> orderBy_ = GeneratedMessageLite.emptyProtobufList();

    static {
        C3240h1 c3240h1 = new C3240h1();
        DEFAULT_INSTANCE = c3240h1;
        GeneratedMessageLite.registerDefaultInstance(C3240h1.class, c3240h1);
    }

    public static void b(C3240h1 c3240h1, N0 n02) {
        c3240h1.getClass();
        n02.getClass();
        Internal.ProtobufList<N0> protobufList = c3240h1.from_;
        if (!protobufList.isModifiable()) {
            c3240h1.from_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        c3240h1.from_.add(n02);
    }

    public static void c(C3240h1 c3240h1, Z0 z02) {
        c3240h1.getClass();
        z02.getClass();
        c3240h1.where_ = z02;
        c3240h1.bitField0_ |= 2;
    }

    public static void d(C3240h1 c3240h1, C3222b1 c3222b1) {
        c3240h1.getClass();
        c3222b1.getClass();
        Internal.ProtobufList<C3222b1> protobufList = c3240h1.orderBy_;
        if (!protobufList.isModifiable()) {
            c3240h1.orderBy_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        c3240h1.orderBy_.add(c3222b1);
    }

    public static void e(C3240h1 c3240h1, D d3) {
        c3240h1.getClass();
        d3.getClass();
        c3240h1.startAt_ = d3;
        c3240h1.bitField0_ |= 4;
    }

    public static void f(C3240h1 c3240h1, D d3) {
        c3240h1.getClass();
        d3.getClass();
        c3240h1.endAt_ = d3;
        c3240h1.bitField0_ |= 8;
    }

    public static void g(C3240h1 c3240h1, Int32Value int32Value) {
        c3240h1.getClass();
        int32Value.getClass();
        c3240h1.limit_ = int32Value;
        c3240h1.bitField0_ |= 16;
    }

    public static C3240h1 h() {
        return DEFAULT_INSTANCE;
    }

    public static L0 u() {
        return (L0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (K0.f39355a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3240h1();
            case 2:
                return new L0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", N0.class, "where_", "orderBy_", C3222b1.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3240h1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3240h1.class) {
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

    public final D i() {
        D d3 = this.endAt_;
        return d3 == null ? D.e() : d3;
    }

    public final N0 j() {
        return this.from_.get(0);
    }

    public final int k() {
        return this.from_.size();
    }

    public final Int32Value l() {
        Int32Value int32Value = this.limit_;
        return int32Value == null ? Int32Value.getDefaultInstance() : int32Value;
    }

    public final C3222b1 m(int i5) {
        return this.orderBy_.get(i5);
    }

    public final int n() {
        return this.orderBy_.size();
    }

    public final D o() {
        D d3 = this.startAt_;
        return d3 == null ? D.e() : d3;
    }

    public final Z0 p() {
        Z0 z02 = this.where_;
        return z02 == null ? Z0.f() : z02;
    }

    public final boolean q() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }
}
