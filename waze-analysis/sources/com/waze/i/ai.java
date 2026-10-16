package com.waze.i;

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
/* loaded from: classes5.dex */
public final class ai extends du<ai, af> implements fj {
    private static final ai DEFAULT_INSTANCE;
    private static volatile fo<ai> PARSER = null;
    public static final int REVOKE_FOR_DEVICE_FIELD_NUMBER = 2;
    public static final int USER_CREDENTIALS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int revokeForDevice_;
    private an userCredentials_;

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevokeForDevice() {
        this.bitField0_ &= -3;
        this.revokeForDevice_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserCredentials() {
        this.userCredentials_ = null;
        this.bitField0_ &= -2;
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserCredentials(an anVar) {
        Objects.requireNonNull(anVar);
        an anVar2 = this.userCredentials_;
        if (anVar2 != null && anVar2 != an.getDefaultInstance()) {
            al alVarNewBuilder = an.newBuilder(anVar2);
            alVarNewBuilder.mergeFrom((al) anVar);
            anVar = alVarNewBuilder.buildPartial();
        }
        this.userCredentials_ = anVar;
        this.bitField0_ |= 1;
    }

    public static af newBuilder() {
        return (af) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevokeForDevice(ah ahVar) {
        this.revokeForDevice_ = ahVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCredentials(an anVar) {
        Objects.requireNonNull(anVar);
        this.userCredentials_ = anVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "userCredentials_", "revokeForDevice_", ag.f24414a});
        }
        if (iOrdinal == 3) {
            return new ai();
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
        fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ah getRevokeForDevice() {
        ah ahVarA = ah.a(this.revokeForDevice_);
        return ahVarA == null ? ah.TYPE_UNSPECIFIED : ahVarA;
    }

    public an getUserCredentials() {
        an anVar = this.userCredentials_;
        return anVar == null ? an.getDefaultInstance() : anVar;
    }

    public boolean hasRevokeForDevice() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserCredentials() {
        return (this.bitField0_ & 1) != 0;
    }

    public static af newBuilder(ai aiVar) {
        return (af) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
