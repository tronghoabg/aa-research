package J9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class S extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final S DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 1;
    private static volatile Parser<S> PARSER;
    private MapFieldLite<String, O> limits_ = MapFieldLite.emptyMapField();

    static {
        S s10 = new S();
        DEFAULT_INSTANCE = s10;
        GeneratedMessageLite.registerDefaultInstance(S.class, s10);
    }

    public static MapFieldLite b(S s10) {
        if (!s10.limits_.isMutable()) {
            s10.limits_ = s10.limits_.mutableCopy();
        }
        return s10.limits_;
    }

    public static S c() {
        return DEFAULT_INSTANCE;
    }

    public static P e(S s10) {
        return (P) DEFAULT_INSTANCE.createBuilder(s10);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final O d(O o7) {
        MapFieldLite<String, O> mapFieldLite = this.limits_;
        return mapFieldLite.containsKey("APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY") ? mapFieldLite.get("APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY") : o7;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (M.f5892a[methodToInvoke.ordinal()]) {
            case 1:
                return new S();
            case 2:
                return new P(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", Q.f5893a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<S> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (S.class) {
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
}
