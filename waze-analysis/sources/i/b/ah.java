package i.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah extends du<ah, af> implements fj {
    public static final int ADDITIONAL_INFO_FIELD_NUMBER = 2;
    public static final int CODE_FIELD_NUMBER = 1;
    private static final ah DEFAULT_INSTANCE;
    public static final int ERROR_CODE_NUMBER_FIELD_NUMBER = 3;
    private static volatile fo<ah> PARSER;
    private String additionalInfo_ = "";
    private int bitField0_;
    private int code_;
    private int errorCodeNumber_;

    static {
        ah ahVar = new ah();
        DEFAULT_INSTANCE = ahVar;
        du.registerDefaultInstance(ah.class, ahVar);
    }

    private ah() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalInfo() {
        this.bitField0_ &= -3;
        this.additionalInfo_ = getDefaultInstance().getAdditionalInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.bitField0_ &= -2;
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCodeNumber() {
        this.bitField0_ &= -5;
        this.errorCodeNumber_ = 0;
    }

    public static ah getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static af newBuilder() {
        return (af) DEFAULT_INSTANCE.createBuilder();
    }

    public static ah parseDelimitedFrom(InputStream inputStream) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(com.google.v.v vVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ah> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalInfo(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.additionalInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalInfoBytes(com.google.v.v vVar) {
        this.additionalInfo_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(ag agVar) {
        this.code_ = agVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCodeNumber(int i2) {
        this.bitField0_ |= 4;
        this.errorCodeNumber_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"bitField0_", "code_", k.f48526h, "additionalInfo_", "errorCodeNumber_"});
        }
        if (iOrdinal == 3) {
            return new ah();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new af(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ah> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ah.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAdditionalInfo() {
        return this.additionalInfo_;
    }

    public com.google.v.v getAdditionalInfoBytes() {
        return com.google.v.v.s(this.additionalInfo_);
    }

    public ag getCode() {
        ag agVarA = ag.a(this.code_);
        return agVarA == null ? ag.OK : agVarA;
    }

    public int getErrorCodeNumber() {
        return this.errorCodeNumber_;
    }

    public boolean hasAdditionalInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasErrorCodeNumber() {
        return (this.bitField0_ & 4) != 0;
    }

    public static af newBuilder(ah ahVar) {
        return (af) DEFAULT_INSTANCE.createBuilder(ahVar);
    }

    public static ah parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(com.google.v.v vVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ah parseFrom(com.google.v.z zVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ah parseFrom(com.google.v.z zVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ah parseFrom(InputStream inputStream) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(InputStream inputStream, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(ByteBuffer byteBuffer) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ah parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ah parseFrom(byte[] bArr) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ah parseFrom(byte[] bArr, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
