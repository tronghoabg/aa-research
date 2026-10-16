package i.b.n.a;

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
/* loaded from: classes8.dex */
public final class as extends du<as, ar> implements fj {
    public static final int APPEND_CLIENT_DATA_FIELD_NUMBER = 2;
    private static final as DEFAULT_INSTANCE;
    public static final int INFO_URL_FIELD_NUMBER = 1;
    private static volatile fo<as> PARSER;
    private boolean appendClientData_;
    private int bitField0_;
    private String infoUrl_ = "";

    static {
        as asVar = new as();
        DEFAULT_INSTANCE = asVar;
        du.registerDefaultInstance(as.class, asVar);
    }

    private as() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppendClientData() {
        this.bitField0_ &= -3;
        this.appendClientData_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfoUrl() {
        this.bitField0_ &= -2;
        this.infoUrl_ = getDefaultInstance().getInfoUrl();
    }

    public static as getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ar newBuilder() {
        return (ar) DEFAULT_INSTANCE.createBuilder();
    }

    public static as parseDelimitedFrom(InputStream inputStream) {
        return (as) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static as parseFrom(com.google.v.v vVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<as> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppendClientData(boolean z) {
        this.bitField0_ |= 2;
        this.appendClientData_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfoUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.infoUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfoUrlBytes(com.google.v.v vVar) {
        this.infoUrl_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "infoUrl_", "appendClientData_"});
        }
        if (iOrdinal == 3) {
            return new as();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ar(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<as> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (as.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAppendClientData() {
        return this.appendClientData_;
    }

    public String getInfoUrl() {
        return this.infoUrl_;
    }

    public com.google.v.v getInfoUrlBytes() {
        return com.google.v.v.s(this.infoUrl_);
    }

    public boolean hasAppendClientData() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasInfoUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ar newBuilder(as asVar) {
        return (ar) DEFAULT_INSTANCE.createBuilder(asVar);
    }

    public static as parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (as) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static as parseFrom(com.google.v.v vVar, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static as parseFrom(com.google.v.z zVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static as parseFrom(com.google.v.z zVar, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static as parseFrom(InputStream inputStream) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static as parseFrom(InputStream inputStream, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static as parseFrom(ByteBuffer byteBuffer) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static as parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static as parseFrom(byte[] bArr) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static as parseFrom(byte[] bArr, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
