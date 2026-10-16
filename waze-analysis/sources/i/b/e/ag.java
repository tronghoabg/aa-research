package i.b.e;

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
public final class ag extends du<ag, af> implements fj {
    private static final ag DEFAULT_INSTANCE;
    private static volatile fo<ag> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int UPDATE_VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private String requestId_ = "";
    private int updateVersion_;

    static {
        ag agVar = new ag();
        DEFAULT_INSTANCE = agVar;
        du.registerDefaultInstance(ag.class, agVar);
    }

    private ag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.bitField0_ &= -3;
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateVersion() {
        this.bitField0_ &= -2;
        this.updateVersion_ = 0;
    }

    public static ag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static af newBuilder() {
        return (af) DEFAULT_INSTANCE.createBuilder();
    }

    public static ag parseDelimitedFrom(InputStream inputStream) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(com.google.v.v vVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(com.google.v.v vVar) {
        this.requestId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateVersion(int i2) {
        this.bitField0_ |= 1;
        this.updateVersion_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "updateVersion_", "requestId_"});
        }
        if (iOrdinal == 3) {
            return new ag();
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
        fo<ag> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ag.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public com.google.v.v getRequestIdBytes() {
        return com.google.v.v.s(this.requestId_);
    }

    public int getUpdateVersion() {
        return this.updateVersion_;
    }

    public boolean hasRequestId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUpdateVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public static af newBuilder(ag agVar) {
        return (af) DEFAULT_INSTANCE.createBuilder(agVar);
    }

    public static ag parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(com.google.v.v vVar, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ag parseFrom(com.google.v.z zVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ag parseFrom(com.google.v.z zVar, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ag parseFrom(InputStream inputStream) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(InputStream inputStream, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(ByteBuffer byteBuffer) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ag parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ag parseFrom(byte[] bArr) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ag parseFrom(byte[] bArr, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
