package sa;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j$.util.DesugarCollections;
import java.util.Map;
import z9.C4643k;
import z9.C4648p;
import z9.Q;

/* loaded from: classes4.dex */
public final class f extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    private static final f DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile Parser<f> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private int bitField0_;
    private Q content_;
    private boolean isTestCampaign_;
    private Object payload_;
    private C4643k priority_;
    private int payloadCase_ = 0;
    private MapFieldLite<String, String> dataBundle_ = MapFieldLite.emptyMapField();
    private Internal.ProtobufList<C4648p> triggeringConditions_ = GeneratedMessageLite.emptyProtobufList();

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
    }

    public final Q b() {
        Q q4 = this.content_;
        return q4 == null ? Q.d() : q4;
    }

    public final Map c() {
        return DesugarCollections.unmodifiableMap(this.dataBundle_);
    }

    public final c d() {
        return this.payloadCase_ == 2 ? (c) this.payload_ : c.f();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4031a.f45406a[methodToInvoke.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", "bitField0_", h.class, c.class, "content_", "priority_", "triggeringConditions_", C4648p.class, "isTestCampaign_", "dataBundle_", e.f45407a});
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

    public final boolean e() {
        return this.isTestCampaign_;
    }

    public final int f() {
        int i5 = this.payloadCase_;
        if (i5 == 0) {
            return 3;
        }
        int i10 = 1;
        if (i5 != 1) {
            i10 = 2;
            if (i5 != 2) {
                return 0;
            }
        }
        return i10;
    }

    public final C4643k g() {
        C4643k c4643k = this.priority_;
        return c4643k == null ? C4643k.b() : c4643k;
    }

    public final Internal.ProtobufList h() {
        return this.triggeringConditions_;
    }

    public final h i() {
        return this.payloadCase_ == 1 ? (h) this.payload_ : h.f();
    }
}
