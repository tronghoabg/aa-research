package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ko extends com.google.v.du<ko, kk> implements com.google.v.fj {
    private static final ko DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int P0_FIELD_NUMBER = 2;
    public static final int P1_FIELD_NUMBER = 3;
    public static final int P2_FIELD_NUMBER = 4;
    public static final int P3_FIELD_NUMBER = 5;
    public static final int P4_FIELD_NUMBER = 6;
    public static final int P5_FIELD_NUMBER = 7;
    public static final int P6_FIELD_NUMBER = 8;
    public static final int P7_FIELD_NUMBER = 9;
    public static final int P8_FIELD_NUMBER = 10;
    public static final int P9_FIELD_NUMBER = 11;
    private static volatile com.google.v.fo<ko> PARSER;
    private int bitField0_;
    private String event_ = "";
    private kn p0_;
    private kn p1_;
    private kn p2_;
    private kn p3_;
    private kn p4_;
    private kn p5_;
    private kn p6_;
    private kn p7_;
    private kn p8_;
    private kn p9_;

    static {
        ko koVar = new ko();
        DEFAULT_INSTANCE = koVar;
        com.google.v.du.registerDefaultInstance(ko.class, koVar);
    }

    private ko() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = getDefaultInstance().getEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP0() {
        this.p0_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP1() {
        this.p1_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP2() {
        this.p2_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP3() {
        this.p3_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP4() {
        this.p4_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP5() {
        this.p5_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP6() {
        this.p6_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP7() {
        this.p7_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP8() {
        this.p8_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP9() {
        this.p9_ = null;
        this.bitField0_ &= -513;
    }

    public static ko getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP0(kn knVar) {
        Objects.requireNonNull(knVar);
        kn knVar2 = this.p0_;
        if (knVar2 != null && knVar2 != kn.getDefaultInstance()) {
            kl klVarNewBuilder = kn.newBuilder(knVar2);
            klVarNewBuilder.mergeFrom((kl) knVar);
            knVar = klVarNewBuilder.buildPartial();
        }
        this.p0_ = knVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP1(kn knVar) {
        Objects.requireNonNull(knVar);
        kn knVar2 = this.p1_;
        if (knVar2 != null && knVar2 != kn.getDefaultInstance()) {
            kl klVarNewBuilder = kn.newBuilder(knVar2);
            klVarNewBuilder.mergeFrom((kl) knVar);
            knVar = klVarNewBuilder.buildPartial();
        }
        this.p1_ = knVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP2(kn knVar) {
        Objects.requireNonNull(knVar);
        kn knVar2 = this.p2_;
        if (knVar2 != null && knVar2 != kn.getDefaultInstance()) {
            kl klVarNewBuilder = kn.newBuilder(knVar2);
            klVarNewBuilder.mergeFrom((kl) knVar);
            knVar = klVarNewBuilder.buildPartial();
        }
        this.p2_ = knVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP3(kn knVar) {
        Objects.requireNonNull(knVar);
        kn knVar2 = this.p3_;
        if (knVar2 != null && knVar2 != kn.getDefaultInstance()) {
            kl klVarNewBuilder = kn.newBuilder(knVar2);
            klVarNewBuilder.mergeFrom((kl) knVar);
            knVar = klVarNewBuilder.buildPartial();
        }
        this.p3_ = knVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP4(kn knVar) {
        Objects.requireNonNull(knVar);
        kn knVar2 = this.p4_;
        if (knVar2 != null && knVar2 != kn.getDefaultInstance()) {
            kl klVarNewBuilder = kn.newBuilder(knVar2);
            klVarNewBuilder.mergeFrom((kl) knVar);
            knVar = klVarNewBuilder.buildPartial();
        }
        this.p4_ = knVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP5(kn knVar) {
        Objects.requireNonNull(knVar);
        kn knVar2 = this.p5_;
        if (knVar2 != null && knVar2 != kn.getDefaultInstance()) {
            kl klVarNewBuilder = kn.newBuilder(knVar2);
            klVarNewBuilder.mergeFrom((kl) knVar);
            knVar = klVarNewBuilder.buildPartial();
        }
        this.p5_ = knVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP6(kn knVar) {
        Objects.requireNonNull(knVar);
        kn knVar2 = this.p6_;
        if (knVar2 != null && knVar2 != kn.getDefaultInstance()) {
            kl klVarNewBuilder = kn.newBuilder(knVar2);
            klVarNewBuilder.mergeFrom((kl) knVar);
            knVar = klVarNewBuilder.buildPartial();
        }
        this.p6_ = knVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP7(kn knVar) {
        Objects.requireNonNull(knVar);
        kn knVar2 = this.p7_;
        if (knVar2 != null && knVar2 != kn.getDefaultInstance()) {
            kl klVarNewBuilder = kn.newBuilder(knVar2);
            klVarNewBuilder.mergeFrom((kl) knVar);
            knVar = klVarNewBuilder.buildPartial();
        }
        this.p7_ = knVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP8(kn knVar) {
        Objects.requireNonNull(knVar);
        kn knVar2 = this.p8_;
        if (knVar2 != null && knVar2 != kn.getDefaultInstance()) {
            kl klVarNewBuilder = kn.newBuilder(knVar2);
            klVarNewBuilder.mergeFrom((kl) knVar);
            knVar = klVarNewBuilder.buildPartial();
        }
        this.p8_ = knVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP9(kn knVar) {
        Objects.requireNonNull(knVar);
        kn knVar2 = this.p9_;
        if (knVar2 != null && knVar2 != kn.getDefaultInstance()) {
            kl klVarNewBuilder = kn.newBuilder(knVar2);
            klVarNewBuilder.mergeFrom((kl) knVar);
            knVar = klVarNewBuilder.buildPartial();
        }
        this.p9_ = knVar;
        this.bitField0_ |= 512;
    }

    public static kk newBuilder() {
        return (kk) DEFAULT_INSTANCE.createBuilder();
    }

    public static ko parseDelimitedFrom(InputStream inputStream) {
        return (ko) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ko parseFrom(com.google.v.v vVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ko> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(String str) {
        Objects.requireNonNull(str);
        this.event_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.event_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP0(kn knVar) {
        Objects.requireNonNull(knVar);
        this.p0_ = knVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP1(kn knVar) {
        Objects.requireNonNull(knVar);
        this.p1_ = knVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP2(kn knVar) {
        Objects.requireNonNull(knVar);
        this.p2_ = knVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP3(kn knVar) {
        Objects.requireNonNull(knVar);
        this.p3_ = knVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP4(kn knVar) {
        Objects.requireNonNull(knVar);
        this.p4_ = knVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP5(kn knVar) {
        Objects.requireNonNull(knVar);
        this.p5_ = knVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP6(kn knVar) {
        Objects.requireNonNull(knVar);
        this.p6_ = knVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP7(kn knVar) {
        Objects.requireNonNull(knVar);
        this.p7_ = knVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP8(kn knVar) {
        Objects.requireNonNull(knVar);
        this.p8_ = knVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP9(kn knVar) {
        Objects.requireNonNull(knVar);
        this.p9_ = knVar;
        this.bitField0_ |= 512;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t", new Object[]{"bitField0_", "event_", "p0_", "p1_", "p2_", "p3_", "p4_", "p5_", "p6_", "p7_", "p8_", "p9_"});
        }
        if (iOrdinal == 3) {
            return new ko();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ko> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ko.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getEvent() {
        return this.event_;
    }

    public com.google.v.v getEventBytes() {
        return com.google.v.v.s(this.event_);
    }

    public kn getP0() {
        kn knVar = this.p0_;
        return knVar == null ? kn.getDefaultInstance() : knVar;
    }

    public kn getP1() {
        kn knVar = this.p1_;
        return knVar == null ? kn.getDefaultInstance() : knVar;
    }

    public kn getP2() {
        kn knVar = this.p2_;
        return knVar == null ? kn.getDefaultInstance() : knVar;
    }

    public kn getP3() {
        kn knVar = this.p3_;
        return knVar == null ? kn.getDefaultInstance() : knVar;
    }

    public kn getP4() {
        kn knVar = this.p4_;
        return knVar == null ? kn.getDefaultInstance() : knVar;
    }

    public kn getP5() {
        kn knVar = this.p5_;
        return knVar == null ? kn.getDefaultInstance() : knVar;
    }

    public kn getP6() {
        kn knVar = this.p6_;
        return knVar == null ? kn.getDefaultInstance() : knVar;
    }

    public kn getP7() {
        kn knVar = this.p7_;
        return knVar == null ? kn.getDefaultInstance() : knVar;
    }

    public kn getP8() {
        kn knVar = this.p8_;
        return knVar == null ? kn.getDefaultInstance() : knVar;
    }

    public kn getP9() {
        kn knVar = this.p9_;
        return knVar == null ? kn.getDefaultInstance() : knVar;
    }

    public boolean hasP0() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasP1() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasP2() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasP3() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasP4() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasP5() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasP6() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasP7() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasP8() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasP9() {
        return (this.bitField0_ & 512) != 0;
    }

    public static kk newBuilder(ko koVar) {
        return (kk) DEFAULT_INSTANCE.createBuilder(koVar);
    }

    public static ko parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ko) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ko parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ko parseFrom(com.google.v.z zVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ko parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ko parseFrom(InputStream inputStream) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ko parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ko parseFrom(ByteBuffer byteBuffer) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ko parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ko parseFrom(byte[] bArr) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ko parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
