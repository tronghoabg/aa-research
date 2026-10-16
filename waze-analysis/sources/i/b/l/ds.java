package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ds extends com.google.v.du<ds, dr> implements com.google.v.fj {
    private static final ds DEFAULT_INSTANCE;
    public static final int HAS_VERIFIED_EMAIL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ds> PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 3;
    public static final int VALID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean hasVerifiedEmail_;
    private jc profile_;
    private boolean valid_;

    static {
        ds dsVar = new ds();
        DEFAULT_INSTANCE = dsVar;
        com.google.v.du.registerDefaultInstance(ds.class, dsVar);
    }

    private ds() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasVerifiedEmail() {
        this.bitField0_ &= -3;
        this.hasVerifiedEmail_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProfile() {
        this.profile_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValid() {
        this.bitField0_ &= -2;
        this.valid_ = false;
    }

    public static ds getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProfile(jc jcVar) {
        Objects.requireNonNull(jcVar);
        jc jcVar2 = this.profile_;
        if (jcVar2 != null && jcVar2 != jc.getDefaultInstance()) {
            jb jbVarNewBuilder = jc.newBuilder(jcVar2);
            jbVarNewBuilder.mergeFrom((jb) jcVar);
            jcVar = jbVarNewBuilder.buildPartial();
        }
        this.profile_ = jcVar;
        this.bitField0_ |= 4;
    }

    public static dr newBuilder() {
        return (dr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ds parseDelimitedFrom(InputStream inputStream) {
        return (ds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ds parseFrom(com.google.v.v vVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ds> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasVerifiedEmail(boolean z) {
        this.bitField0_ |= 2;
        this.hasVerifiedEmail_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfile(jc jcVar) {
        Objects.requireNonNull(jcVar);
        this.profile_ = jcVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValid(boolean z) {
        this.bitField0_ |= 1;
        this.valid_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "valid_", "hasVerifiedEmail_", "profile_"});
        }
        if (iOrdinal == 3) {
            return new ds();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ds> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ds.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getHasVerifiedEmail() {
        return this.hasVerifiedEmail_;
    }

    public jc getProfile() {
        jc jcVar = this.profile_;
        return jcVar == null ? jc.getDefaultInstance() : jcVar;
    }

    public boolean getValid() {
        return this.valid_;
    }

    public boolean hasHasVerifiedEmail() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProfile() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasValid() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dr newBuilder(ds dsVar) {
        return (dr) DEFAULT_INSTANCE.createBuilder(dsVar);
    }

    public static ds parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ds parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ds parseFrom(com.google.v.z zVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ds parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ds parseFrom(InputStream inputStream) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ds parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ds parseFrom(ByteBuffer byteBuffer) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ds parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ds parseFrom(byte[] bArr) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ds parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
