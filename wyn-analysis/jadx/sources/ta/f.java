package ta;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class f extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 1;
    private static final f DEFAULT_INSTANCE;
    private static volatile Parser<f> PARSER;
    private Internal.ProtobufList<C4154c> alreadySeenCampaigns_ = GeneratedMessageLite.emptyProtobufList();

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
    }

    public static void b(f fVar, C4154c c4154c) {
        fVar.getClass();
        c4154c.getClass();
        Internal.ProtobufList<C4154c> protobufList = fVar.alreadySeenCampaigns_;
        if (!protobufList.isModifiable()) {
            fVar.alreadySeenCampaigns_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        fVar.alreadySeenCampaigns_.add(c4154c);
    }

    public static f d() {
        return DEFAULT_INSTANCE;
    }

    public static e e() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static e f(f fVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Internal.ProtobufList c() {
        return this.alreadySeenCampaigns_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (d.f45969a[methodToInvoke.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new e(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alreadySeenCampaigns_", C4154c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<f> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (f.class) {
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
