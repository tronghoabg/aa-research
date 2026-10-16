package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class qz extends com.google.v.du<qz, qy> implements ra {
    private static final qz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<qz> PARSER = null;
    public static final int STRING_ANSWER_FIELD_NUMBER = 1;
    private int answerCase_ = 0;
    private Object answer_;

    static {
        qz qzVar = new qz();
        DEFAULT_INSTANCE = qzVar;
        com.google.v.du.registerDefaultInstance(qz.class, qzVar);
    }

    private qz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswer() {
        this.answerCase_ = 0;
        this.answer_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringAnswer() {
        if (this.answerCase_ == 1) {
            this.answerCase_ = 0;
            this.answer_ = null;
        }
    }

    public static qz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static qy newBuilder() {
        return (qy) DEFAULT_INSTANCE.createBuilder();
    }

    public static qz parseDelimitedFrom(InputStream inputStream) {
        return (qz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qz parseFrom(com.google.v.v vVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringAnswer(rf rfVar) {
        this.answer_ = Integer.valueOf(rfVar.getNumber());
        this.answerCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringAnswerValue(int i2) {
        this.answerCase_ = 1;
        this.answer_ = Integer.valueOf(i2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001?\u0000", new Object[]{"answer_", "answerCase_"});
        }
        if (iOrdinal == 3) {
            return new qz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public qx getAnswerCase() {
        int i2 = this.answerCase_;
        if (i2 == 0) {
            return qx.f55325b;
        }
        if (i2 != 1) {
            return null;
        }
        return qx.f55324a;
    }

    public rf getStringAnswer() {
        if (this.answerCase_ != 1) {
            return rf.DESTINATION_REPORTING_STRING_ANSWER_UNSPECIFIED;
        }
        int iIntValue = ((Integer) this.answer_).intValue();
        rf rfVar = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? null : rf.DESTINATION_REPORTING_STRING_ANSWER_LIMITED : rf.DESTINATION_REPORTING_STRING_ANSWER_YES : rf.DESTINATION_REPORTING_STRING_ANSWER_NO : rf.DESTINATION_REPORTING_STRING_ANSWER_UNSPECIFIED;
        return rfVar == null ? rf.UNRECOGNIZED : rfVar;
    }

    public int getStringAnswerValue() {
        if (this.answerCase_ == 1) {
            return ((Integer) this.answer_).intValue();
        }
        return 0;
    }

    public boolean hasStringAnswer() {
        return this.answerCase_ == 1;
    }

    public static qy newBuilder(qz qzVar) {
        return (qy) DEFAULT_INSTANCE.createBuilder(qzVar);
    }

    public static qz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qz parseFrom(com.google.v.z zVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qz parseFrom(InputStream inputStream) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qz parseFrom(ByteBuffer byteBuffer) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qz parseFrom(byte[] bArr) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
