package ia;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* loaded from: classes4.dex */
public final class h extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final h DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<h> PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private Internal.ProtobufList<f> fields_ = GeneratedMessageLite.emptyProtobufList();

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        GeneratedMessageLite.registerDefaultInstance(h.class, hVar);
    }

    public static void b(h hVar) {
        g gVar = g.COLLECTION_GROUP;
        hVar.getClass();
        hVar.queryScope_ = gVar.getNumber();
    }

    public static void c(h hVar, f fVar) {
        hVar.getClass();
        fVar.getClass();
        Internal.ProtobufList<f> protobufList = hVar.fields_;
        if (!protobufList.isModifiable()) {
            hVar.fields_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        hVar.fields_.add(fVar);
    }

    public static C2862b d() {
        return (C2862b) DEFAULT_INSTANCE.createBuilder();
    }

    public static h e(byte[] bArr) {
        return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC2861a.f36916a[methodToInvoke.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new C2862b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", f.class, "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<h> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (h.class) {
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

    public final List getFieldsList() {
        return this.fields_;
    }
}
