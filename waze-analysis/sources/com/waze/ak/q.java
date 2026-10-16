package com.waze.ak;

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
public final class q extends du<q, p> implements fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    private static final q DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 4;
    public static final int DISTANCE_UNIT_FIELD_NUMBER = 2;
    public static final int INSTRUCTION_MODE_FIELD_NUMBER = 3;
    private static volatile fo<q> PARSER = null;
    public static final int VOICE_CATEGORY_FIELD_NUMBER = 5;
    private int bitField0_;
    private j destination_;
    private int distanceUnit_;
    private int instructionMode_;
    private String alternativeRouteUuid_ = "";
    private int voiceCategory_ = 1;

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        du.registerDefaultInstance(q.class, qVar);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.bitField0_ &= -2;
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceUnit() {
        this.bitField0_ &= -3;
        this.distanceUnit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstructionMode() {
        this.bitField0_ &= -5;
        this.instructionMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceCategory() {
        this.bitField0_ &= -17;
        this.voiceCategory_ = 1;
    }

    public static q getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(j jVar) {
        Objects.requireNonNull(jVar);
        j jVar2 = this.destination_;
        if (jVar2 != null && jVar2 != j.getDefaultInstance()) {
            i iVarNewBuilder = j.newBuilder(jVar2);
            iVarNewBuilder.mergeFrom((i) jVar);
            jVar = iVarNewBuilder.buildPartial();
        }
        this.destination_ = jVar;
        this.bitField0_ |= 8;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static q parseDelimitedFrom(InputStream inputStream) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(com.google.v.v vVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<q> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        this.alternativeRouteUuid_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(j jVar) {
        Objects.requireNonNull(jVar);
        this.destination_ = jVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceUnit(l lVar) {
        this.distanceUnit_ = lVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstructionMode(y yVar) {
        this.instructionMode_ = yVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceCategory(af afVar) {
        this.voiceCategory_ = afVar.getNumber();
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "alternativeRouteUuid_", "distanceUnit_", k.f14103a, "instructionMode_", k.f14105c, "destination_", "voiceCategory_", k.f14106d});
        }
        if (iOrdinal == 3) {
            return new q();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new p(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<q> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (q.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public j getDestination() {
        j jVar = this.destination_;
        return jVar == null ? j.getDefaultInstance() : jVar;
    }

    public l getDistanceUnit() {
        l lVarA = l.a(this.distanceUnit_);
        return lVarA == null ? l.DISTANCE_UNIT_UNSPECIFIED : lVarA;
    }

    public y getInstructionMode() {
        y yVarA = y.a(this.instructionMode_);
        return yVarA == null ? y.INSTRUCTION_MODE_UNSPECIFIED : yVarA;
    }

    public af getVoiceCategory() {
        af afVarA = af.a(this.voiceCategory_);
        return afVarA == null ? af.TTS : afVarA;
    }

    public boolean hasAlternativeRouteUuid() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDestination() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDistanceUnit() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasInstructionMode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVoiceCategory() {
        return (this.bitField0_ & 16) != 0;
    }

    public static p newBuilder(q qVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(qVar);
    }

    public static q parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(com.google.v.v vVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static q parseFrom(com.google.v.z zVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static q parseFrom(com.google.v.z zVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static q parseFrom(InputStream inputStream) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(InputStream inputStream, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(ByteBuffer byteBuffer) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static q parseFrom(byte[] bArr) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static q parseFrom(byte[] bArr, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
