package com.waze.n;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends du<m, l> implements fj {
    private static final m DEFAULT_INSTANCE;
    public static final int IN_CAR_DISPLAY_MODE_FIELD_NUMBER = 2;
    public static final int MOBILE_DISPLAY_MODE_FIELD_NUMBER = 1;
    private static volatile fo<m> PARSER;
    private int bitField0_;
    private int inCarDisplayMode_;
    private int mobileDisplayMode_;

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarDisplayMode() {
        this.bitField0_ &= -3;
        this.inCarDisplayMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileDisplayMode() {
        this.bitField0_ &= -2;
        this.mobileDisplayMode_ = 0;
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(com.google.v.v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarDisplayMode(n nVar) {
        this.inCarDisplayMode_ = nVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarDisplayModeValue(int i2) {
        this.bitField0_ |= 2;
        this.inCarDisplayMode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileDisplayMode(n nVar) {
        this.mobileDisplayMode_ = nVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileDisplayModeValue(int i2) {
        this.bitField0_ |= 1;
        this.mobileDisplayMode_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "mobileDisplayMode_", "inCarDisplayMode_"});
        }
        if (iOrdinal == 3) {
            return new m();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<m> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (m.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public n getInCarDisplayMode() {
        n nVarA = n.a(this.inCarDisplayMode_);
        return nVarA == null ? n.UNRECOGNIZED : nVarA;
    }

    public int getInCarDisplayModeValue() {
        return this.inCarDisplayMode_;
    }

    public n getMobileDisplayMode() {
        n nVarA = n.a(this.mobileDisplayMode_);
        return nVarA == null ? n.UNRECOGNIZED : nVarA;
    }

    public int getMobileDisplayModeValue() {
        return this.mobileDisplayMode_;
    }

    public boolean hasInCarDisplayMode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMobileDisplayMode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static l newBuilder(m mVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(com.google.v.v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(com.google.v.z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(com.google.v.z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
