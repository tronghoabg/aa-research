package i.b.n;

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
public final class c extends du<c, a> implements fj {
    private static final c DEFAULT_INSTANCE;
    private static volatile fo<c> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int RESPONSE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String query_ = "";
    private String response_ = "";
    private int type_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        this.bitField0_ &= -3;
        this.query_ = getDefaultInstance().getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.bitField0_ &= -5;
        this.response_ = getDefaultInstance().getResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(com.google.v.v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.query_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryBytes(com.google.v.v vVar) {
        this.query_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponse(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.response_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseBytes(com.google.v.v vVar) {
        this.response_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(b bVar) {
        this.type_ = bVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "type_", m.f49153b, "query_", "response_"});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getQuery() {
        return this.query_;
    }

    public com.google.v.v getQueryBytes() {
        return com.google.v.v.s(this.query_);
    }

    public String getResponse() {
        return this.response_;
    }

    public com.google.v.v getResponseBytes() {
        return com.google.v.v.s(this.response_);
    }

    public b getType() {
        b bVarA = b.a(this.type_);
        return bVarA == null ? b.UNKNOWN : bVarA;
    }

    public boolean hasQuery() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasResponse() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(c cVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(com.google.v.v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(com.google.v.z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(com.google.v.z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
