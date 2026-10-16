package ta;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;
import r8.C3939c;

/* loaded from: classes4.dex */
public final class l extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    private static final l DEFAULT_INSTANCE;
    private static volatile Parser<l> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private int bitField0_;
    private C3939c clientSignals_;
    private i requestingClientApp_;
    private String projectNumber_ = "";
    private Internal.ProtobufList<C4154c> alreadySeenCampaigns_ = GeneratedMessageLite.emptyProtobufList();

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        GeneratedMessageLite.registerDefaultInstance(l.class, lVar);
    }

    public static void b(l lVar, String str) {
        lVar.getClass();
        str.getClass();
        lVar.projectNumber_ = str;
    }

    public static void c(l lVar, Internal.ProtobufList protobufList) {
        Internal.ProtobufList<C4154c> protobufList2 = lVar.alreadySeenCampaigns_;
        if (!protobufList2.isModifiable()) {
            lVar.alreadySeenCampaigns_ = GeneratedMessageLite.mutableCopy(protobufList2);
        }
        AbstractMessageLite.addAll((Iterable) protobufList, (List) lVar.alreadySeenCampaigns_);
    }

    public static void d(l lVar, C3939c c3939c) {
        lVar.getClass();
        c3939c.getClass();
        lVar.clientSignals_ = c3939c;
        lVar.bitField0_ |= 2;
    }

    public static void e(l lVar, i iVar) {
        lVar.getClass();
        iVar.getClass();
        lVar.requestingClientApp_ = iVar;
        lVar.bitField0_ |= 1;
    }

    public static l f() {
        return DEFAULT_INSTANCE;
    }

    public static k g() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (j.f45971a[methodToInvoke.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new k(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", C4154c.class, "clientSignals_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<l> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (l.class) {
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
