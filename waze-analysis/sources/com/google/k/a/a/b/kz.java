package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kz extends com.google.v.du<kz, ky> implements com.google.v.fj {
    private static final kz DEFAULT_INSTANCE;
    public static final int ENCRYPTED_GAIA_ID_FIELD_NUMBER = 1;
    public static final int ENCRYPTION_KEY_NAME_FIELD_FIELD_NUMBER = 209473639;
    public static final int ENCRYPTION_KEY_NAME_FIELD_NUMBER = 2;
    public static final int KEYSTORE_CONFIG_ID_FIELD_FIELD_NUMBER = 313857734;
    public static final int KEYSTORE_CONFIG_ID_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<kz> PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 3;
    public static final com.google.v.ds<com.google.v.ca, Integer> encryptionKeyNameField;
    public static final com.google.v.ds<com.google.v.ca, Integer> keystoreConfigIdField;
    private int bitField0_;
    private com.google.v.v encryptedGaiaId_ = com.google.v.v.f13054a;
    private String encryptionKeyName_ = "";
    private int keystoreConfigId_ = 71644;
    private String username_ = "";

    static {
        kz kzVar = new kz();
        DEFAULT_INSTANCE = kzVar;
        com.google.v.du.registerDefaultInstance(kz.class, kzVar);
        encryptionKeyNameField = com.google.v.du.newSingularGeneratedExtension(com.google.v.ca.getDefaultInstance(), 0, null, null, ENCRYPTION_KEY_NAME_FIELD_FIELD_NUMBER, com.google.v.gm.INT32, Integer.class);
        keystoreConfigIdField = com.google.v.du.newSingularGeneratedExtension(com.google.v.ca.getDefaultInstance(), 0, null, null, KEYSTORE_CONFIG_ID_FIELD_FIELD_NUMBER, com.google.v.gm.INT32, Integer.class);
    }

    private kz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptedGaiaId() {
        this.bitField0_ &= -2;
        this.encryptedGaiaId_ = getDefaultInstance().getEncryptedGaiaId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptionKeyName() {
        this.bitField0_ &= -3;
        this.encryptionKeyName_ = getDefaultInstance().getEncryptionKeyName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeystoreConfigId() {
        this.bitField0_ &= -5;
        this.keystoreConfigId_ = 71644;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.bitField0_ &= -9;
        this.username_ = getDefaultInstance().getUsername();
    }

    public static kz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ky newBuilder() {
        return (ky) DEFAULT_INSTANCE.createBuilder();
    }

    public static kz parseDelimitedFrom(InputStream inputStream) {
        return (kz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kz parseFrom(com.google.v.v vVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptedGaiaId(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 1;
        this.encryptedGaiaId_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptionKeyName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.encryptionKeyName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptionKeyNameBytes(com.google.v.v vVar) {
        this.encryptionKeyName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeystoreConfigId(int i2) {
        this.bitField0_ |= 4;
        this.keystoreConfigId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(com.google.v.v vVar) {
        this.username_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0006င\u0002", new Object[]{"bitField0_", "encryptedGaiaId_", "encryptionKeyName_", "username_", "keystoreConfigId_"});
        }
        if (iOrdinal == 3) {
            return new kz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ky(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.v.v getEncryptedGaiaId() {
        return this.encryptedGaiaId_;
    }

    public String getEncryptionKeyName() {
        return this.encryptionKeyName_;
    }

    public com.google.v.v getEncryptionKeyNameBytes() {
        return com.google.v.v.s(this.encryptionKeyName_);
    }

    public int getKeystoreConfigId() {
        return this.keystoreConfigId_;
    }

    public String getUsername() {
        return this.username_;
    }

    public com.google.v.v getUsernameBytes() {
        return com.google.v.v.s(this.username_);
    }

    public boolean hasEncryptedGaiaId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasEncryptionKeyName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasKeystoreConfigId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUsername() {
        return (this.bitField0_ & 8) != 0;
    }

    public static ky newBuilder(kz kzVar) {
        return (ky) DEFAULT_INSTANCE.createBuilder(kzVar);
    }

    public static kz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kz parseFrom(com.google.v.z zVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kz parseFrom(InputStream inputStream) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kz parseFrom(ByteBuffer byteBuffer) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kz parseFrom(byte[] bArr) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
