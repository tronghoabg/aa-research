package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fe extends com.google.v.du<fe, fc> implements com.google.v.fj {
    public static final int BORDER_LINE_FIELD_NUMBER = 4;
    public static final int BORDER_PATTERN_FIELD_NUMBER = 2;
    public static final int COLOR_FIELD_NUMBER = 3;
    private static final fe DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fe> PARSER = null;
    public static final int STRIPE_PATTERN_FIELD_NUMBER = 1;
    private int bitField0_;
    private fr borderLine_;
    private int stripePattern_ = 1;
    private int borderPattern_ = 1;
    private com.google.v.eo<fl> color_ = emptyProtobufList();

    static {
        fe feVar = new fe();
        DEFAULT_INSTANCE = feVar;
        com.google.v.du.registerDefaultInstance(fe.class, feVar);
    }

    private fe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllColor(Iterable<? extends fl> iterable) {
        ensureColorIsMutable();
        com.google.v.c.addAll(iterable, this.color_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addColor(int i2, fl flVar) {
        Objects.requireNonNull(flVar);
        ensureColorIsMutable();
        this.color_.add(i2, flVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderLine() {
        this.borderLine_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderPattern() {
        this.bitField0_ &= -3;
        this.borderPattern_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStripePattern() {
        this.bitField0_ &= -2;
        this.stripePattern_ = 1;
    }

    private void ensureColorIsMutable() {
        com.google.v.eo<fl> eoVar = this.color_;
        if (eoVar.c()) {
            return;
        }
        this.color_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static fe getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBorderLine(fr frVar) {
        Objects.requireNonNull(frVar);
        fr frVar2 = this.borderLine_;
        if (frVar2 != null && frVar2 != fr.getDefaultInstance()) {
            fo foVarNewBuilder = fr.newBuilder(frVar2);
            foVarNewBuilder.mergeFrom((fo) frVar);
            frVar = foVarNewBuilder.buildPartial();
        }
        this.borderLine_ = frVar;
        this.bitField0_ |= 4;
    }

    public static fc newBuilder() {
        return (fc) DEFAULT_INSTANCE.createBuilder();
    }

    public static fe parseDelimitedFrom(InputStream inputStream) {
        return (fe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fe parseFrom(com.google.v.v vVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fe> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeColor(int i2) {
        ensureColorIsMutable();
        this.color_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderLine(fr frVar) {
        Objects.requireNonNull(frVar);
        this.borderLine_ = frVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderPattern(fb fbVar) {
        this.borderPattern_ = fbVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(int i2, fl flVar) {
        Objects.requireNonNull(flVar);
        ensureColorIsMutable();
        this.color_.set(i2, flVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStripePattern(fd fdVar) {
        this.stripePattern_ = fdVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"bitField0_", "stripePattern_", h.m, "borderPattern_", h.f11883l, "color_", fl.class, "borderLine_"});
        }
        if (iOrdinal == 3) {
            return new fe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fe> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fe.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fr getBorderLine() {
        fr frVar = this.borderLine_;
        return frVar == null ? fr.getDefaultInstance() : frVar;
    }

    public fb getBorderPattern() {
        fb fbVarA = fb.a(this.borderPattern_);
        return fbVarA == null ? fb.UNKNOWN_BORDER_PATTERN : fbVarA;
    }

    public fl getColor(int i2) {
        return this.color_.get(i2);
    }

    public int getColorCount() {
        return this.color_.size();
    }

    public List<fl> getColorList() {
        return this.color_;
    }

    public fm getColorOrBuilder(int i2) {
        return this.color_.get(i2);
    }

    public List<? extends fm> getColorOrBuilderList() {
        return this.color_;
    }

    public fd getStripePattern() {
        fd fdVarA = fd.a(this.stripePattern_);
        return fdVarA == null ? fd.UNKNOWN_STRIPE_PATTERN : fdVarA;
    }

    public boolean hasBorderLine() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBorderPattern() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStripePattern() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fc newBuilder(fe feVar) {
        return (fc) DEFAULT_INSTANCE.createBuilder(feVar);
    }

    public static fe parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fe parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fe parseFrom(com.google.v.z zVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fe parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addColor(fl flVar) {
        Objects.requireNonNull(flVar);
        ensureColorIsMutable();
        this.color_.add(flVar);
    }

    public static fe parseFrom(InputStream inputStream) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fe parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fe parseFrom(ByteBuffer byteBuffer) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fe parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fe parseFrom(byte[] bArr) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fe parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
