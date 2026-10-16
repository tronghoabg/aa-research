package com.google.c.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends du<c, b> implements d {
    private static final c DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile fo<c> PARSER = null;
    public static final int VERSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String description_ = "";
    private int versionId_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -3;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionId() {
        this.bitField0_ &= -2;
        this.versionId_ = 0;
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
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
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionId(int i2) {
        this.bitField0_ |= 1;
        this.versionId_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "versionId_", "description_"});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new b(bArr);
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

    public String getDescription() {
        return this.description_;
    }

    public v getDescriptionBytes() {
        return v.s(this.description_);
    }

    public int getVersionId() {
        return this.versionId_;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVersionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
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
