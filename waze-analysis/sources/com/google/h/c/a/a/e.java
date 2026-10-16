package com.google.h.c.a.a;

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
public final class e extends du<e, d> implements fj {
    private static final e DEFAULT_INSTANCE;
    public static final int FIELD_OVERRIDE_OPTION_FIELD_NUMBER = 3;
    private static volatile fo<e> PARSER = null;
    public static final int SAVE_TO_METADATA_FIELD_NUMBER = 1;
    public static final int SAVE_TO_METADATA_REORDER_REPEATED_FIELD_NUMBER = 2;
    private int arrAnnotationOneofCase_ = 0;
    private Object arrAnnotationOneof_;
    private int bitField0_;
    private c fieldOverrideOption_;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArrAnnotationOneof() {
        this.arrAnnotationOneofCase_ = 0;
        this.arrAnnotationOneof_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldOverrideOption() {
        this.fieldOverrideOption_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSaveToMetadata() {
        if (this.arrAnnotationOneofCase_ == 1) {
            this.arrAnnotationOneofCase_ = 0;
            this.arrAnnotationOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSaveToMetadataReorderRepeated() {
        if (this.arrAnnotationOneofCase_ == 2) {
            this.arrAnnotationOneofCase_ = 0;
            this.arrAnnotationOneof_ = null;
        }
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFieldOverrideOption(c cVar) {
        Objects.requireNonNull(cVar);
        c cVar2 = this.fieldOverrideOption_;
        if (cVar2 != null && cVar2 != c.getDefaultInstance()) {
            b bVarNewBuilder = c.newBuilder(cVar2);
            bVarNewBuilder.mergeFrom((b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.fieldOverrideOption_ = cVar;
        this.bitField0_ |= 1;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
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
    public void setFieldOverrideOption(c cVar) {
        Objects.requireNonNull(cVar);
        this.fieldOverrideOption_ = cVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSaveToMetadata(boolean z) {
        this.arrAnnotationOneofCase_ = 1;
        this.arrAnnotationOneof_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSaveToMetadataReorderRepeated(boolean z) {
        this.arrAnnotationOneofCase_ = 2;
        this.arrAnnotationOneof_ = Boolean.valueOf(z);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001:\u0000\u0002:\u0000\u0003ဉ\u0000", new Object[]{"arrAnnotationOneof_", "arrAnnotationOneofCase_", "bitField0_", "fieldOverrideOption_"});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
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

    public a getArrAnnotationOneofCase() {
        int i2 = this.arrAnnotationOneofCase_;
        if (i2 == 0) {
            return a.f11031c;
        }
        if (i2 == 1) {
            return a.f11029a;
        }
        if (i2 != 2) {
            return null;
        }
        return a.f11030b;
    }

    public c getFieldOverrideOption() {
        c cVar = this.fieldOverrideOption_;
        return cVar == null ? c.getDefaultInstance() : cVar;
    }

    public boolean getSaveToMetadata() {
        if (this.arrAnnotationOneofCase_ == 1) {
            return ((Boolean) this.arrAnnotationOneof_).booleanValue();
        }
        return false;
    }

    public boolean getSaveToMetadataReorderRepeated() {
        if (this.arrAnnotationOneofCase_ == 2) {
            return ((Boolean) this.arrAnnotationOneof_).booleanValue();
        }
        return false;
    }

    public boolean hasFieldOverrideOption() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSaveToMetadata() {
        return this.arrAnnotationOneofCase_ == 1;
    }

    public boolean hasSaveToMetadataReorderRepeated() {
        return this.arrAnnotationOneofCase_ == 2;
    }

    public static d newBuilder(e eVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(eVar);
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
