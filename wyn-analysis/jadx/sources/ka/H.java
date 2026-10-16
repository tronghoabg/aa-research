package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import j$.util.DesugarCollections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class H extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final H DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<H> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp createTime_;
    private MapFieldLite<String, C1> fields_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private Timestamp updateTime_;

    static {
        H h10 = new H();
        DEFAULT_INSTANCE = h10;
        GeneratedMessageLite.registerDefaultInstance(H.class, h10);
    }

    public static void b(H h10, String str) {
        h10.getClass();
        str.getClass();
        h10.name_ = str;
    }

    public static MapFieldLite c(H h10) {
        if (!h10.fields_.isMutable()) {
            h10.fields_ = h10.fields_.mutableCopy();
        }
        return h10.fields_;
    }

    public static void d(H h10, Timestamp timestamp) {
        h10.getClass();
        timestamp.getClass();
        h10.updateTime_ = timestamp;
        h10.bitField0_ |= 2;
    }

    public static H e() {
        return DEFAULT_INSTANCE;
    }

    public static F g() {
        return (F) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (E.f39344a[methodToInvoke.ordinal()]) {
            case 1:
                return new H();
            case 2:
                return new F(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", G.f39351a, "createTime_", "updateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<H> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (H.class) {
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

    public final Timestamp f() {
        Timestamp timestamp = this.updateTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public final Map getFieldsMap() {
        return DesugarCollections.unmodifiableMap(this.fields_);
    }

    public final String getName() {
        return this.name_;
    }
}
