package com.google.android.libraries.phenotype.client.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends du<e, b> implements fj {
    private static final e DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile fo<e> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int error_;
    private int source_;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.bitField0_ &= -3;
        this.error_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.bitField0_ &= -2;
        this.source_ = 0;
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(c cVar) {
        this.error_ = cVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorValue(int i2) {
        this.bitField0_ |= 2;
        this.error_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(d dVar) {
        this.source_ = dVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.bitField0_ |= 1;
        this.source_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "source_", "error_"});
        }
        if (iOrdinal == 3) {
            return new e();
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
        fo<e> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (e.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getError() {
        c cVar;
        switch (this.error_) {
            case 0:
                cVar = c.ERROR_UNSPECIFIED;
                break;
            case 1:
                cVar = c.SHARED_STORAGE_DISABLED;
                break;
            case 2:
                cVar = c.SHARED_STORAGE_EMPTY_SECRET;
                break;
            case 3:
                cVar = c.SHARED_STORAGE_PACKAGE_NOT_INCLUDED;
                break;
            case 4:
                cVar = c.SHARED_STORAGE_PACKAGE_EXCLUDED;
                break;
            case 5:
                cVar = c.SHARED_STORAGE_GMS_CORE_DATA_PATH_NOT_FOUND;
                break;
            case 6:
                cVar = c.SHARED_STORAGE_FILE_NOT_FOUND;
                break;
            case 7:
                cVar = c.SHARED_STORAGE_INVALID_PROTO;
                break;
            case 8:
                cVar = c.SHARED_STORAGE_UNKNOWN_EXCEPTION;
                break;
            case 9:
                cVar = c.LOCAL_STORAGE_UNKNOWN_EXCEPTION;
                break;
            case 10:
                cVar = c.SHARED_STORAGE_NO_ACCOUNT_NAME;
                break;
            case 11:
                cVar = c.LOCAL_STORAGE_INVALID_PROTO;
                break;
            case 12:
                cVar = c.SHARED_STORAGE_INFO_NOT_FOUND;
                break;
            case 13:
                cVar = c.SHARED_STORAGE_HARD_DISABLED_FOR_TIKTOK;
                break;
            case 14:
                cVar = c.SHARED_STORAGE_LOCAL_STORAGE_UNKNOWN_EXCEPTION;
                break;
            case 15:
                cVar = c.DIRECT_BOOT_BUT_PACKAGE_NOT_DIRECT_BOOT_AWARE;
                break;
            case 16:
                cVar = c.ISOLATED_PROCESS;
                break;
            default:
                cVar = null;
                break;
        }
        return cVar == null ? c.UNRECOGNIZED : cVar;
    }

    public int getErrorValue() {
        return this.error_;
    }

    public d getSource() {
        int i2 = this.source_;
        d dVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : d.GET_CONFIGURATION_SNAPSHOT_CALL : d.SHARED_STORAGE : d.LOCAL_STORAGE : d.DEFAULT_VALUES : d.SOURCE_UNSPECIFIED;
        return dVar == null ? d.UNRECOGNIZED : dVar;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public boolean hasError() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(e eVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
