package z9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: z9.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4648p extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C4648p DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
    private static volatile Parser<C4648p> PARSER;
    private int conditionCase_ = 0;
    private Object condition_;

    static {
        C4648p c4648p = new C4648p();
        DEFAULT_INSTANCE = c4648p;
        GeneratedMessageLite.registerDefaultInstance(C4648p.class, c4648p);
    }

    public final C4641i b() {
        return this.conditionCase_ == 2 ? (C4641i) this.condition_ : C4641i.b();
    }

    public final EnumC4644l c() {
        int i5 = this.conditionCase_;
        EnumC4644l enumC4644l = EnumC4644l.UNKNOWN_TRIGGER;
        if (i5 == 1) {
            int iIntValue = ((Integer) this.condition_).intValue();
            if (iIntValue != 0) {
                enumC4644l = iIntValue != 1 ? iIntValue != 2 ? null : EnumC4644l.ON_FOREGROUND : EnumC4644l.APP_LAUNCH;
            }
            if (enumC4644l == null) {
                return EnumC4644l.UNRECOGNIZED;
            }
        }
        return enumC4644l;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4639g.f48448a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4648p();
            case 2:
                return new C4647o(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", C4641i.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C4648p> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C4648p.class) {
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
