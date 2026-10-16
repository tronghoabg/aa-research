package com.google.w.k;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aa extends du<aa, w> implements ab {
    public static final int BOOL_VALUE_FIELD_NUMBER = 3;
    public static final int DATETIME_VALUE_FIELD_NUMBER = 7;
    private static final aa DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
    public static final int DURATION_VALUE_FIELD_NUMBER = 8;
    public static final int ID_VALUE_FIELD_NUMBER = 1;
    public static final int INT64_VALUE_FIELD_NUMBER = 4;
    public static final int LOCALE_FIELD_NUMBER = 11;
    public static final int NESTED_STRUCT_VALUE_FIELD_NUMBER = 12;
    private static volatile fo<aa> PARSER = null;
    public static final int PROTO_VALUE_FIELD_NUMBER = 10;
    public static final int S2CELL_ID_FIELD_NUMBER = 9;
    public static final int STRING_VALUE_FIELD_NUMBER = 2;
    public static final int UINT64_VALUE_FIELD_NUMBER = 5;
    public static final int URI_VALUE_FIELD_NUMBER = 13;
    private int bitField0_;
    private Object obj_;
    private int objCase_ = 0;
    private String locale_ = "";

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        du.registerDefaultInstance(aa.class, aaVar);
    }

    private aa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.objCase_ == 3) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatetimeValue() {
        if (this.objCase_ == 7) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        if (this.objCase_ == 6) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationValue() {
        if (this.objCase_ == 8) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdValue() {
        if (this.objCase_ == 1) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInt64Value() {
        if (this.objCase_ == 4) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.bitField0_ &= -2;
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNestedStructValue() {
        if (this.objCase_ == 12) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObj() {
        this.objCase_ = 0;
        this.obj_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtoValue() {
        if (this.objCase_ == 10) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearS2CellId() {
        if (this.objCase_ == 9) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.objCase_ == 2) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUint64Value() {
        if (this.objCase_ == 5) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUriValue() {
        if (this.objCase_ == 13) {
            this.objCase_ = 0;
            this.obj_ = null;
        }
    }

    public static aa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDatetimeValue(com.google.o.a.b.b bVar) {
        Objects.requireNonNull(bVar);
        if (this.objCase_ == 7 && this.obj_ != com.google.o.a.b.b.getDefaultInstance()) {
            com.google.o.a.b.a aVarNewBuilder = com.google.o.a.b.b.newBuilder((com.google.o.a.b.b) this.obj_);
            aVarNewBuilder.mergeFrom((com.google.o.a.b.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.obj_ = bVar;
        this.objCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNestedStructValue(e eVar) {
        Objects.requireNonNull(eVar);
        if (this.objCase_ == 12 && this.obj_ != e.getDefaultInstance()) {
            a aVarNewBuilder = e.newBuilder((e) this.obj_);
            aVarNewBuilder.mergeFrom((a) eVar);
            eVar = aVarNewBuilder.buildPartial();
        }
        this.obj_ = eVar;
        this.objCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProtoValue(z zVar) {
        Objects.requireNonNull(zVar);
        if (this.objCase_ == 10 && this.obj_ != z.getDefaultInstance()) {
            y yVarNewBuilder = z.newBuilder((z) this.obj_);
            yVarNewBuilder.mergeFrom((y) zVar);
            zVar = yVarNewBuilder.buildPartial();
        }
        this.obj_ = zVar;
        this.objCase_ = 10;
    }

    public static w newBuilder() {
        return (w) DEFAULT_INSTANCE.createBuilder();
    }

    public static aa parseDelimitedFrom(InputStream inputStream) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(com.google.v.v vVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.objCase_ = 3;
        this.obj_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatetimeValue(com.google.o.a.b.b bVar) {
        Objects.requireNonNull(bVar);
        this.obj_ = bVar;
        this.objCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d2) {
        this.objCase_ = 6;
        this.obj_ = Double.valueOf(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationValue(long j2) {
        this.objCase_ = 8;
        this.obj_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdValue(String str) {
        Objects.requireNonNull(str);
        this.objCase_ = 1;
        this.obj_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdValueBytes(com.google.v.v vVar) {
        this.obj_ = vVar.u();
        this.objCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInt64Value(long j2) {
        this.objCase_ = 4;
        this.obj_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(com.google.v.v vVar) {
        this.locale_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNestedStructValue(e eVar) {
        Objects.requireNonNull(eVar);
        this.obj_ = eVar;
        this.objCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtoValue(z zVar) {
        Objects.requireNonNull(zVar);
        this.obj_ = zVar;
        this.objCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setS2CellId(long j2) {
        this.objCase_ = 9;
        this.obj_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        Objects.requireNonNull(str);
        this.objCase_ = 2;
        this.obj_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(com.google.v.v vVar) {
        this.obj_ = vVar.u();
        this.objCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUint64Value(long j2) {
        this.objCase_ = 5;
        this.obj_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriValue(String str) {
        Objects.requireNonNull(str);
        this.objCase_ = 13;
        this.obj_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriValueBytes(com.google.v.v vVar) {
        this.obj_ = vVar.u();
        this.objCase_ = 13;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001;\u0000\u0002;\u0000\u0003:\u0000\u00045\u0000\u00056\u0000\u00063\u0000\u0007<\u0000\b5\u0000\t6\u0000\n<\u0000\u000bဈ\u0000\f<\u0000\r;\u0000", new Object[]{"obj_", "objCase_", "bitField0_", com.google.o.a.b.b.class, z.class, "locale_", e.class});
        }
        if (iOrdinal == 3) {
            return new aa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new w(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBoolValue() {
        if (this.objCase_ == 3) {
            return ((Boolean) this.obj_).booleanValue();
        }
        return false;
    }

    public com.google.o.a.b.b getDatetimeValue() {
        return this.objCase_ == 7 ? (com.google.o.a.b.b) this.obj_ : com.google.o.a.b.b.getDefaultInstance();
    }

    public double getDoubleValue() {
        return this.objCase_ == 6 ? ((Double) this.obj_).doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public long getDurationValue() {
        if (this.objCase_ == 8) {
            return ((Long) this.obj_).longValue();
        }
        return 0L;
    }

    public String getIdValue() {
        return this.objCase_ == 1 ? (String) this.obj_ : "";
    }

    public com.google.v.v getIdValueBytes() {
        return com.google.v.v.s(this.objCase_ == 1 ? (String) this.obj_ : "");
    }

    public long getInt64Value() {
        if (this.objCase_ == 4) {
            return ((Long) this.obj_).longValue();
        }
        return 0L;
    }

    public String getLocale() {
        return this.locale_;
    }

    public com.google.v.v getLocaleBytes() {
        return com.google.v.v.s(this.locale_);
    }

    public e getNestedStructValue() {
        return this.objCase_ == 12 ? (e) this.obj_ : e.getDefaultInstance();
    }

    public x getObjCase() {
        switch (this.objCase_) {
            case 0:
                return x.m;
            case 1:
                return x.f13272a;
            case 2:
                return x.f13273b;
            case 3:
                return x.f13275d;
            case 4:
                return x.f13276e;
            case 5:
                return x.f13277f;
            case 6:
                return x.f13278g;
            case 7:
                return x.f13279h;
            case 8:
                return x.f13280i;
            case 9:
                return x.f13281j;
            case 10:
                return x.f13282k;
            case 11:
            default:
                return null;
            case 12:
                return x.f13283l;
            case 13:
                return x.f13274c;
        }
    }

    public z getProtoValue() {
        return this.objCase_ == 10 ? (z) this.obj_ : z.getDefaultInstance();
    }

    public long getS2CellId() {
        if (this.objCase_ == 9) {
            return ((Long) this.obj_).longValue();
        }
        return 0L;
    }

    public String getStringValue() {
        return this.objCase_ == 2 ? (String) this.obj_ : "";
    }

    public com.google.v.v getStringValueBytes() {
        return com.google.v.v.s(this.objCase_ == 2 ? (String) this.obj_ : "");
    }

    public long getUint64Value() {
        if (this.objCase_ == 5) {
            return ((Long) this.obj_).longValue();
        }
        return 0L;
    }

    public String getUriValue() {
        return this.objCase_ == 13 ? (String) this.obj_ : "";
    }

    public com.google.v.v getUriValueBytes() {
        return com.google.v.v.s(this.objCase_ == 13 ? (String) this.obj_ : "");
    }

    public boolean hasBoolValue() {
        return this.objCase_ == 3;
    }

    public boolean hasDatetimeValue() {
        return this.objCase_ == 7;
    }

    public boolean hasDoubleValue() {
        return this.objCase_ == 6;
    }

    public boolean hasDurationValue() {
        return this.objCase_ == 8;
    }

    public boolean hasIdValue() {
        return this.objCase_ == 1;
    }

    public boolean hasInt64Value() {
        return this.objCase_ == 4;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNestedStructValue() {
        return this.objCase_ == 12;
    }

    public boolean hasProtoValue() {
        return this.objCase_ == 10;
    }

    public boolean hasS2CellId() {
        return this.objCase_ == 9;
    }

    public boolean hasStringValue() {
        return this.objCase_ == 2;
    }

    public boolean hasUint64Value() {
        return this.objCase_ == 5;
    }

    public boolean hasUriValue() {
        return this.objCase_ == 13;
    }

    public static w newBuilder(aa aaVar) {
        return (w) DEFAULT_INSTANCE.createBuilder(aaVar);
    }

    public static aa parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(com.google.v.v vVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aa parseFrom(com.google.v.z zVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aa parseFrom(com.google.v.z zVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aa parseFrom(InputStream inputStream) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(InputStream inputStream, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(ByteBuffer byteBuffer) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aa parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aa parseFrom(byte[] bArr) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aa parseFrom(byte[] bArr, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
