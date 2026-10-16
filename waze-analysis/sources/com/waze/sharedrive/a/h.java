package com.waze.sharedrive.a;

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
public final class h extends du<h, g> implements fj {
    private static final h DEFAULT_INSTANCE;
    public static final int JOIN_AS_FIELD_NUMBER = 3;
    private static volatile fo<h> PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.waze.sharedrive.f.a.i joinAs_;
    private com.waze.sharedrive.f.a.ag participant_;
    private String token_ = "";

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoinAs() {
        this.joinAs_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        this.participant_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.token_ = getDefaultInstance().getToken();
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJoinAs(com.waze.sharedrive.f.a.i iVar) {
        Objects.requireNonNull(iVar);
        com.waze.sharedrive.f.a.i iVar2 = this.joinAs_;
        if (iVar2 != null && iVar2 != com.waze.sharedrive.f.a.i.getDefaultInstance()) {
            com.waze.sharedrive.f.a.a aVarNewBuilder = com.waze.sharedrive.f.a.i.newBuilder(iVar2);
            aVarNewBuilder.mergeFrom((com.waze.sharedrive.f.a.a) iVar);
            iVar = aVarNewBuilder.buildPartial();
        }
        this.joinAs_ = iVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipant(com.waze.sharedrive.f.a.ag agVar) {
        Objects.requireNonNull(agVar);
        com.waze.sharedrive.f.a.ag agVar2 = this.participant_;
        if (agVar2 != null && agVar2 != com.waze.sharedrive.f.a.ag.getDefaultInstance()) {
            com.waze.sharedrive.f.a.o oVarNewBuilder = com.waze.sharedrive.f.a.ag.newBuilder(agVar2);
            oVarNewBuilder.mergeFrom((com.waze.sharedrive.f.a.o) agVar);
            agVar = oVarNewBuilder.buildPartial();
        }
        this.participant_ = agVar;
        this.bitField0_ |= 1;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(com.google.v.v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinAs(com.waze.sharedrive.f.a.i iVar) {
        Objects.requireNonNull(iVar);
        this.joinAs_ = iVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(com.waze.sharedrive.f.a.ag agVar) {
        Objects.requireNonNull(agVar);
        this.participant_ = agVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.token_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "token_", "participant_", "joinAs_"});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new g(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.sharedrive.f.a.i getJoinAs() {
        com.waze.sharedrive.f.a.i iVar = this.joinAs_;
        return iVar == null ? com.waze.sharedrive.f.a.i.getDefaultInstance() : iVar;
    }

    public com.waze.sharedrive.f.a.ag getParticipant() {
        com.waze.sharedrive.f.a.ag agVar = this.participant_;
        return agVar == null ? com.waze.sharedrive.f.a.ag.getDefaultInstance() : agVar;
    }

    public String getToken() {
        return this.token_;
    }

    public com.google.v.v getTokenBytes() {
        return com.google.v.v.s(this.token_);
    }

    public boolean hasJoinAs() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasParticipant() {
        return (this.bitField0_ & 1) != 0;
    }

    public static g newBuilder(h hVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(com.google.v.v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(com.google.v.z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(com.google.v.z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
