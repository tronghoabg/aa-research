package com.google.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends du<j, h> implements fj {
    private static final j DEFAULT_INSTANCE;
    public static final int FAILURE_MODE_FIELD_NUMBER = 4;
    private static volatile fo<j> PARSER = null;
    public static final int RESTRICTION_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private int failureMode_;
    private String selector_ = "";
    private String restriction_ = "";

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureMode() {
        this.failureMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestriction() {
        this.restriction_ = getDefaultInstance().getRestriction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static j parseDelimitedFrom(InputStream inputStream) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(v vVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<j> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureMode(i iVar) {
        this.failureMode_ = iVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureModeValue(int i2) {
        this.failureMode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestriction(String str) {
        Objects.requireNonNull(str);
        this.restriction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.restriction_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        Objects.requireNonNull(str);
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.selector_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004\f", new Object[]{"selector_", "restriction_", "failureMode_"});
        }
        if (iOrdinal == 3) {
            return new j();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new h(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<j> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (j.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i getFailureMode() {
        int i2 = this.failureMode_;
        i iVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : i.FAIL_CLOSED : i.FALLBACK_PUBLIC : i.FAILURE_MODE_UNSPECIFIED;
        return iVar == null ? i.UNRECOGNIZED : iVar;
    }

    public int getFailureModeValue() {
        return this.failureMode_;
    }

    public String getRestriction() {
        return this.restriction_;
    }

    public v getRestrictionBytes() {
        return v.s(this.restriction_);
    }

    public String getSelector() {
        return this.selector_;
    }

    public v getSelectorBytes() {
        return v.s(this.selector_);
    }

    public static h newBuilder(j jVar) {
        return (h) DEFAULT_INSTANCE.createBuilder(jVar);
    }

    public static j parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(v vVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static j parseFrom(z zVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static j parseFrom(z zVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static j parseFrom(InputStream inputStream) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(InputStream inputStream, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(ByteBuffer byteBuffer) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static j parseFrom(byte[] bArr) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static j parseFrom(byte[] bArr, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
