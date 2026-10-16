package com.google.android.libraries.phenotype.client.b;

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
public final class s extends du<s, r> implements fj {
    public static final int API_LEVEL_FIELD_NUMBER = 2;
    public static final int DATA_DIRECTORY_FIELD_NUMBER = 1;
    private static final s DEFAULT_INSTANCE;
    private static volatile fo<s> PARSER;
    private long apiLevel_;
    private int bitField0_;
    private String dataDirectory_ = "";

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApiLevel() {
        this.bitField0_ &= -3;
        this.apiLevel_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataDirectory() {
        this.bitField0_ &= -2;
        this.dataDirectory_ = getDefaultInstance().getDataDirectory();
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(v vVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiLevel(long j2) {
        this.bitField0_ |= 2;
        this.apiLevel_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataDirectory(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.dataDirectory_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataDirectoryBytes(v vVar) {
        this.dataDirectory_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "dataDirectory_", "apiLevel_"});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new r(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<s> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (s.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getApiLevel() {
        return this.apiLevel_;
    }

    public String getDataDirectory() {
        return this.dataDirectory_;
    }

    public v getDataDirectoryBytes() {
        return v.s(this.dataDirectory_);
    }

    public boolean hasApiLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDataDirectory() {
        return (this.bitField0_ & 1) != 0;
    }

    public static r newBuilder(s sVar) {
        return (r) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(v vVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
