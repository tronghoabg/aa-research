package com.google.e.a.h;

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
/* loaded from: classes4.dex */
public final class az extends du<az, ay> implements fj {
    private static final az DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile fo<az> PARSER;
    private int bitField0_;
    private com.google.v.v encryptedKeyset_ = com.google.v.v.f13054a;
    private bz keysetInfo_;

    static {
        az azVar = new az();
        DEFAULT_INSTANCE = azVar;
        du.registerDefaultInstance(az.class, azVar);
    }

    private az() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptedKeyset() {
        this.encryptedKeyset_ = getDefaultInstance().getEncryptedKeyset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeysetInfo() {
        this.keysetInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static az getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeysetInfo(bz bzVar) {
        Objects.requireNonNull(bzVar);
        bz bzVar2 = this.keysetInfo_;
        if (bzVar2 != null && bzVar2 != bz.getDefaultInstance()) {
            bv bvVarNewBuilder = bz.newBuilder(bzVar2);
            bvVarNewBuilder.mergeFrom((bv) bzVar);
            bzVar = bvVarNewBuilder.buildPartial();
        }
        this.keysetInfo_ = bzVar;
        this.bitField0_ |= 1;
    }

    public static ay newBuilder() {
        return (ay) DEFAULT_INSTANCE.createBuilder();
    }

    public static az parseDelimitedFrom(InputStream inputStream) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(com.google.v.v vVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<az> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptedKeyset(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.encryptedKeyset_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeysetInfo(bz bzVar) {
        Objects.requireNonNull(bzVar);
        this.keysetInfo_ = bzVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "encryptedKeyset_", "keysetInfo_"});
        }
        if (iOrdinal == 3) {
            return new az();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ay(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<az> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (az.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.v.v getEncryptedKeyset() {
        return this.encryptedKeyset_;
    }

    public bz getKeysetInfo() {
        bz bzVar = this.keysetInfo_;
        return bzVar == null ? bz.getDefaultInstance() : bzVar;
    }

    public boolean hasKeysetInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ay newBuilder(az azVar) {
        return (ay) DEFAULT_INSTANCE.createBuilder(azVar);
    }

    public static az parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(com.google.v.v vVar, de deVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static az parseFrom(com.google.v.z zVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static az parseFrom(com.google.v.z zVar, de deVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static az parseFrom(InputStream inputStream) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(InputStream inputStream, de deVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(ByteBuffer byteBuffer) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static az parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static az parseFrom(byte[] bArr) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static az parseFrom(byte[] bArr, de deVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
