package com.google.k.c.a.a;

import com.google.k.a.a.dz;
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
/* loaded from: classes5.dex */
public final class c extends du<c, a> implements fj {
    public static final int ATTACHMENT_TYPE_ID_FIELD_NUMBER = 3;
    public static final int ATTRIBUTE_ID_FIELD_NUMBER = 2;
    private static final c DEFAULT_INSTANCE;
    public static final int FIELD_TYPE_FIELD_NUMBER = 1;
    public static final int KG_PROPERTY_ID_FIELD_NUMBER = 4;
    public static final int NAME_LANGUAGE_FIELD_NUMBER = 5;
    private static volatile fo<c> PARSER;
    private int bitField0_;
    private int fieldType_;
    private int subFieldCase_ = 0;
    private Object subField_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttachmentTypeId() {
        if (this.subFieldCase_ == 3) {
            this.subFieldCase_ = 0;
            this.subField_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributeId() {
        if (this.subFieldCase_ == 2) {
            this.subFieldCase_ = 0;
            this.subField_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldType() {
        this.bitField0_ &= -2;
        this.fieldType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKgPropertyId() {
        if (this.subFieldCase_ == 4) {
            this.subFieldCase_ = 0;
            this.subField_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameLanguage() {
        if (this.subFieldCase_ == 5) {
            this.subFieldCase_ = 0;
            this.subField_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubField() {
        this.subFieldCase_ = 0;
        this.subField_ = null;
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
    public void setAttachmentTypeId(long j2) {
        this.subFieldCase_ = 3;
        this.subField_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributeId(String str) {
        Objects.requireNonNull(str);
        this.subFieldCase_ = 2;
        this.subField_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributeIdBytes(v vVar) {
        this.subField_ = vVar.u();
        this.subFieldCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldType(dz dzVar) {
        this.fieldType_ = dzVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKgPropertyId(String str) {
        Objects.requireNonNull(str);
        this.subFieldCase_ = 4;
        this.subField_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKgPropertyIdBytes(v vVar) {
        this.subField_ = vVar.u();
        this.subFieldCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameLanguage(String str) {
        Objects.requireNonNull(str);
        this.subFieldCase_ = 5;
        this.subField_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameLanguageBytes(v vVar) {
        this.subField_ = vVar.u();
        this.subFieldCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002;\u0000\u00036\u0000\u0004;\u0000\u0005;\u0000", new Object[]{"subField_", "subFieldCase_", "bitField0_", "fieldType_", dz.b()});
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

    public long getAttachmentTypeId() {
        if (this.subFieldCase_ == 3) {
            return ((Long) this.subField_).longValue();
        }
        return 0L;
    }

    public String getAttributeId() {
        return this.subFieldCase_ == 2 ? (String) this.subField_ : "";
    }

    public v getAttributeIdBytes() {
        return v.s(this.subFieldCase_ == 2 ? (String) this.subField_ : "");
    }

    public dz getFieldType() {
        dz dzVarA = dz.a(this.fieldType_);
        return dzVarA == null ? dz.NONE : dzVarA;
    }

    public String getKgPropertyId() {
        return this.subFieldCase_ == 4 ? (String) this.subField_ : "";
    }

    public v getKgPropertyIdBytes() {
        return v.s(this.subFieldCase_ == 4 ? (String) this.subField_ : "");
    }

    public String getNameLanguage() {
        return this.subFieldCase_ == 5 ? (String) this.subField_ : "";
    }

    public v getNameLanguageBytes() {
        return v.s(this.subFieldCase_ == 5 ? (String) this.subField_ : "");
    }

    public b getSubFieldCase() {
        int i2 = this.subFieldCase_;
        if (i2 == 0) {
            return b.f12210e;
        }
        if (i2 == 2) {
            return b.f12206a;
        }
        if (i2 == 3) {
            return b.f12207b;
        }
        if (i2 == 4) {
            return b.f12208c;
        }
        if (i2 != 5) {
            return null;
        }
        return b.f12209d;
    }

    public boolean hasAttachmentTypeId() {
        return this.subFieldCase_ == 3;
    }

    public boolean hasAttributeId() {
        return this.subFieldCase_ == 2;
    }

    public boolean hasFieldType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasKgPropertyId() {
        return this.subFieldCase_ == 4;
    }

    public boolean hasNameLanguage() {
        return this.subFieldCase_ == 5;
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
