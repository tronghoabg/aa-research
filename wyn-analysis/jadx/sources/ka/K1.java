package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class K1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final K1 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile Parser<K1> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
    private String database_ = "";
    private String streamId_ = "";
    private Internal.ProtobufList<G1> writes_ = GeneratedMessageLite.emptyProtobufList();
    private ByteString streamToken_ = ByteString.EMPTY;

    static {
        K1 k12 = new K1();
        DEFAULT_INSTANCE = k12;
        GeneratedMessageLite.registerDefaultInstance(K1.class, k12);
    }

    public static void b(K1 k12, String str) {
        k12.getClass();
        str.getClass();
        k12.database_ = str;
    }

    public static void c(K1 k12, ByteString byteString) {
        k12.getClass();
        byteString.getClass();
        k12.streamToken_ = byteString;
    }

    public static void d(K1 k12, G1 g12) {
        k12.getClass();
        g12.getClass();
        Internal.ProtobufList<G1> protobufList = k12.writes_;
        if (!protobufList.isModifiable()) {
            k12.writes_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        k12.writes_.add(g12);
    }

    public static K1 e() {
        return DEFAULT_INSTANCE;
    }

    public static I1 f() {
        return (I1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (H1.f39352a[methodToInvoke.ordinal()]) {
            case 1:
                return new K1();
            case 2:
                return new I1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", G1.class, "streamToken_", "labels_", J1.f39354a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<K1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (K1.class) {
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
