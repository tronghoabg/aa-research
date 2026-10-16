package com.waze.o;

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
public final class br extends du<br, bq> implements fj {
    private static final br DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 1;
    private static volatile fo<br> PARSER;
    private int bitField0_;
    private String description_ = "";

    static {
        br brVar = new br();
        DEFAULT_INSTANCE = brVar;
        du.registerDefaultInstance(br.class, brVar);
    }

    private br() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -2;
        this.description_ = getDefaultInstance().getDescription();
    }

    public static br getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bq newBuilder() {
        return (bq) DEFAULT_INSTANCE.createBuilder();
    }

    public static br parseDelimitedFrom(InputStream inputStream) {
        return (br) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static br parseFrom(com.google.v.v vVar) {
        return (br) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<br> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "description_"});
        }
        if (iOrdinal == 3) {
            return new br();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<br> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (br.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bq newBuilder(br brVar) {
        return (bq) DEFAULT_INSTANCE.createBuilder(brVar);
    }

    public static br parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (br) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static br parseFrom(com.google.v.v vVar, de deVar) {
        return (br) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static br parseFrom(com.google.v.z zVar) {
        return (br) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static br parseFrom(com.google.v.z zVar, de deVar) {
        return (br) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static br parseFrom(InputStream inputStream) {
        return (br) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static br parseFrom(InputStream inputStream, de deVar) {
        return (br) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static br parseFrom(ByteBuffer byteBuffer) {
        return (br) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static br parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (br) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static br parseFrom(byte[] bArr) {
        return (br) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static br parseFrom(byte[] bArr, de deVar) {
        return (br) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
