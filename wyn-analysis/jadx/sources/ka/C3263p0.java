package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j$.util.DesugarCollections;
import java.util.Map;

/* renamed from: ka.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3263p0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3263p0 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<C3263p0> PARSER;
    private MapFieldLite<String, C1> fields_ = MapFieldLite.emptyMapField();

    static {
        C3263p0 c3263p0 = new C3263p0();
        DEFAULT_INSTANCE = c3263p0;
        GeneratedMessageLite.registerDefaultInstance(C3263p0.class, c3263p0);
    }

    public static MapFieldLite b(C3263p0 c3263p0) {
        if (!c3263p0.fields_.isMutable()) {
            c3263p0.fields_ = c3263p0.fields_.mutableCopy();
        }
        return c3263p0.fields_;
    }

    public static C3263p0 c() {
        return DEFAULT_INSTANCE;
    }

    public static C3257n0 f() {
        return (C3257n0) DEFAULT_INSTANCE.createBuilder();
    }

    public final C1 d(String str) {
        str.getClass();
        MapFieldLite<String, C1> mapFieldLite = this.fields_;
        if (mapFieldLite.containsKey(str)) {
            return mapFieldLite.get(str);
        }
        return null;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3254m0.f39423a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3263p0();
            case 2:
                return new C3257n0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", AbstractC3260o0.f39424a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3263p0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3263p0.class) {
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

    public final C1 e(String str) {
        str.getClass();
        MapFieldLite<String, C1> mapFieldLite = this.fields_;
        if (mapFieldLite.containsKey(str)) {
            return mapFieldLite.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final int getFieldsCount() {
        return this.fields_.size();
    }

    public final Map getFieldsMap() {
        return DesugarCollections.unmodifiableMap(this.fields_);
    }
}
