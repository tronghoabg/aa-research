package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class jt extends com.google.v.du<jt, jq> implements ju {
    private static final jt DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<jt> PARSER = null;
    public static final int PHONE_FIELD_NUMBER = 3;
    public static final int SHARELOCATION_FIELD_NUMBER = 4;
    public static final int SUBTYPE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 6;
    private int bitField0_;
    private jw shareLocation_;
    private int subtype_;
    private int type_;
    private String phone_ = "";
    private String name_ = "";
    private String url_ = "";

    static {
        jt jtVar = new jt();
        DEFAULT_INSTANCE = jtVar;
        com.google.v.du.registerDefaultInstance(jt.class, jtVar);
    }

    private jt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -17;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhone() {
        this.bitField0_ &= -5;
        this.phone_ = getDefaultInstance().getPhone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareLocation() {
        this.shareLocation_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtype() {
        this.bitField0_ &= -3;
        this.subtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -33;
        this.url_ = getDefaultInstance().getUrl();
    }

    public static jt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareLocation(jw jwVar) {
        Objects.requireNonNull(jwVar);
        jw jwVar2 = this.shareLocation_;
        if (jwVar2 != null && jwVar2 != jw.getDefaultInstance()) {
            jv jvVarNewBuilder = jw.newBuilder(jwVar2);
            jvVarNewBuilder.mergeFrom((jv) jwVar);
            jwVar = jvVarNewBuilder.buildPartial();
        }
        this.shareLocation_ = jwVar;
        this.bitField0_ |= 8;
    }

    public static jq newBuilder() {
        return (jq) DEFAULT_INSTANCE.createBuilder();
    }

    public static jt parseDelimitedFrom(InputStream inputStream) {
        return (jt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jt parseFrom(com.google.v.v vVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhone(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.phone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneBytes(com.google.v.v vVar) {
        this.phone_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareLocation(jw jwVar) {
        Objects.requireNonNull(jwVar);
        this.shareLocation_ = jwVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtype(jr jrVar) {
        this.subtype_ = jrVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(js jsVar) {
        this.type_ = jsVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(com.google.v.v vVar) {
        this.url_ = vVar.u();
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "type_", hf.f48745i, "subtype_", hf.f48744h, "phone_", "shareLocation_", "name_", "url_"});
        }
        if (iOrdinal == 3) {
            return new jt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getPhone() {
        return this.phone_;
    }

    public com.google.v.v getPhoneBytes() {
        return com.google.v.v.s(this.phone_);
    }

    public jw getShareLocation() {
        jw jwVar = this.shareLocation_;
        return jwVar == null ? jw.getDefaultInstance() : jwVar;
    }

    public jr getSubtype() {
        jr jrVarA = jr.a(this.subtype_);
        return jrVarA == null ? jr.POLICE : jrVarA;
    }

    public js getType() {
        js jsVarA = js.a(this.type_);
        return jsVarA == null ? js.EMERGENCY : jsVarA;
    }

    public String getUrl() {
        return this.url_;
    }

    public com.google.v.v getUrlBytes() {
        return com.google.v.v.s(this.url_);
    }

    public boolean hasName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPhone() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasShareLocation() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSubtype() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUrl() {
        return (this.bitField0_ & 32) != 0;
    }

    public static jq newBuilder(jt jtVar) {
        return (jq) DEFAULT_INSTANCE.createBuilder(jtVar);
    }

    public static jt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jt parseFrom(com.google.v.z zVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jt parseFrom(InputStream inputStream) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jt parseFrom(ByteBuffer byteBuffer) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jt parseFrom(byte[] bArr) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
