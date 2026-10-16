package com.google.d.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ei;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends du<c, a> implements fj {
    public static final int BRAILLEBACK_ENABLED_FIELD_NUMBER = 2;
    private static final c DEFAULT_INSTANCE;
    public static final int HIGH_CONTRAST_TEXT_ENABLED_FIELD_NUMBER = 7;
    public static final int JUSTSPEAK_ENABLED_FIELD_NUMBER = 4;
    public static final int LARGE_TEXT_ENABLED_FIELD_NUMBER = 5;
    public static final int MAGNIFICATION_ENABLED_FIELD_NUMBER = 6;
    private static volatile fo<c> PARSER = null;
    public static final int SWITCHACCESS_ENABLED_FIELD_NUMBER = 3;
    public static final int TALKBACK_ENABLED_FIELD_NUMBER = 1;
    private int bitField0_;
    private int braillebackEnabled_;
    private int highContrastTextEnabled_;
    private int justspeakEnabled_;
    private int largeTextEnabled_;
    private int magnificationEnabled_;
    private int switchaccessEnabled_;
    private int talkbackEnabled_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBraillebackEnabled() {
        this.bitField0_ &= -3;
        this.braillebackEnabled_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighContrastTextEnabled() {
        this.bitField0_ &= -65;
        this.highContrastTextEnabled_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJustspeakEnabled() {
        this.bitField0_ &= -9;
        this.justspeakEnabled_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLargeTextEnabled() {
        this.bitField0_ &= -17;
        this.largeTextEnabled_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMagnificationEnabled() {
        this.bitField0_ &= -33;
        this.magnificationEnabled_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitchaccessEnabled() {
        this.bitField0_ &= -5;
        this.switchaccessEnabled_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTalkbackEnabled() {
        this.bitField0_ &= -2;
        this.talkbackEnabled_ = 0;
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

    public static c parseFrom(v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBraillebackEnabled(b bVar) {
        this.braillebackEnabled_ = bVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighContrastTextEnabled(b bVar) {
        this.highContrastTextEnabled_ = bVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJustspeakEnabled(b bVar) {
        this.justspeakEnabled_ = bVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLargeTextEnabled(b bVar) {
        this.largeTextEnabled_ = bVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMagnificationEnabled(b bVar) {
        this.magnificationEnabled_ = bVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchaccessEnabled(b bVar) {
        this.switchaccessEnabled_ = bVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTalkbackEnabled(b bVar) {
        this.talkbackEnabled_ = bVar.getNumber();
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
            ei eiVar = e.f7921b;
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006", new Object[]{"bitField0_", "talkbackEnabled_", eiVar, "braillebackEnabled_", eiVar, "switchaccessEnabled_", eiVar, "justspeakEnabled_", eiVar, "largeTextEnabled_", eiVar, "magnificationEnabled_", eiVar, "highContrastTextEnabled_", eiVar});
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

    public b getBraillebackEnabled() {
        b bVarA = b.a(this.braillebackEnabled_);
        return bVarA == null ? b.UNKNOWN : bVarA;
    }

    public b getHighContrastTextEnabled() {
        b bVarA = b.a(this.highContrastTextEnabled_);
        return bVarA == null ? b.UNKNOWN : bVarA;
    }

    public b getJustspeakEnabled() {
        b bVarA = b.a(this.justspeakEnabled_);
        return bVarA == null ? b.UNKNOWN : bVarA;
    }

    public b getLargeTextEnabled() {
        b bVarA = b.a(this.largeTextEnabled_);
        return bVarA == null ? b.UNKNOWN : bVarA;
    }

    public b getMagnificationEnabled() {
        b bVarA = b.a(this.magnificationEnabled_);
        return bVarA == null ? b.UNKNOWN : bVarA;
    }

    public b getSwitchaccessEnabled() {
        b bVarA = b.a(this.switchaccessEnabled_);
        return bVarA == null ? b.UNKNOWN : bVarA;
    }

    public b getTalkbackEnabled() {
        b bVarA = b.a(this.talkbackEnabled_);
        return bVarA == null ? b.UNKNOWN : bVarA;
    }

    public boolean hasBraillebackEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHighContrastTextEnabled() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasJustspeakEnabled() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLargeTextEnabled() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMagnificationEnabled() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSwitchaccessEnabled() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTalkbackEnabled() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(c cVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(z zVar, de deVar) {
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
