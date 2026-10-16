package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j$.util.DesugarCollections;
import java.util.Map;

/* renamed from: ka.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3226d extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final C3226d DEFAULT_INSTANCE;
    private static volatile Parser<C3226d> PARSER;
    private MapFieldLite<String, C1> aggregateFields_ = MapFieldLite.emptyMapField();

    static {
        C3226d c3226d = new C3226d();
        DEFAULT_INSTANCE = c3226d;
        GeneratedMessageLite.registerDefaultInstance(C3226d.class, c3226d);
    }

    public static C3226d c() {
        return DEFAULT_INSTANCE;
    }

    public final Map b() {
        return DesugarCollections.unmodifiableMap(this.aggregateFields_);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3217a.f39397a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3226d();
            case 2:
                return new C3223c(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", AbstractC3220b.f39398a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3226d> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3226d.class) {
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
