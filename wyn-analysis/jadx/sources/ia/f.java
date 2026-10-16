package ia;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class f extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
    private static final f DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int ORDER_FIELD_NUMBER = 2;
    private static volatile Parser<f> PARSER;
    private Object valueMode_;
    private int valueModeCase_ = 0;
    private String fieldPath_ = "";

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
    }

    public static void b(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.fieldPath_ = str;
    }

    public static void c(f fVar, e eVar) {
        fVar.getClass();
        fVar.valueMode_ = Integer.valueOf(eVar.getNumber());
        fVar.valueModeCase_ = 2;
    }

    public static void d(f fVar) {
        EnumC2863c enumC2863c = EnumC2863c.CONTAINS;
        fVar.getClass();
        fVar.valueMode_ = Integer.valueOf(enumC2863c.getNumber());
        fVar.valueModeCase_ = 3;
    }

    public static d h() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC2861a.f36916a[methodToInvoke.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
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

    public final String e() {
        return this.fieldPath_;
    }

    public final e f() {
        int i5 = this.valueModeCase_;
        e eVar = e.ORDER_UNSPECIFIED;
        if (i5 == 2) {
            int iIntValue = ((Integer) this.valueMode_).intValue();
            if (iIntValue != 0) {
                eVar = iIntValue != 1 ? iIntValue != 2 ? null : e.DESCENDING : e.ASCENDING;
            }
            if (eVar == null) {
                return e.UNRECOGNIZED;
            }
        }
        return eVar;
    }

    public final int g() {
        int i5 = this.valueModeCase_;
        if (i5 == 0) {
            return 3;
        }
        if (i5 != 2) {
            return i5 != 3 ? 0 : 2;
        }
        return 1;
    }
}
