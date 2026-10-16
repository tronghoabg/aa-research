package com.google.f.a.a;

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
public final class e extends du<e, a> implements fj {
    private static final e DEFAULT_INSTANCE;
    public static final int ENCODING_FIELD_NUMBER = 4;
    public static final int MS_EXTENSION_FIELD_SELECTOR_FIELD_NUMBER = 3;
    private static volatile fo<e> PARSER = null;
    public static final int SERIALIZATION_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_SELECTOR_FIELD_NUMBER = 2;
    public static final int TYPE_NAME_FIELD_NUMBER = 1;
    public static final int VALUE_REGEX_FIELD_NUMBER = 6;
    private int bitField0_;
    private int encoding_;
    private h msExtensionFieldSelector_;
    private int serialization_;
    private h typeFieldSelector_;
    private String typeName_ = "";
    private String valueRegex_ = "";

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncoding() {
        this.bitField0_ &= -17;
        this.encoding_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsExtensionFieldSelector() {
        this.msExtensionFieldSelector_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSerialization() {
        this.bitField0_ &= -33;
        this.serialization_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeFieldSelector() {
        this.typeFieldSelector_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeName() {
        this.bitField0_ &= -2;
        this.typeName_ = getDefaultInstance().getTypeName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueRegex() {
        this.bitField0_ &= -9;
        this.valueRegex_ = getDefaultInstance().getValueRegex();
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMsExtensionFieldSelector(h hVar) {
        Objects.requireNonNull(hVar);
        h hVar2 = this.msExtensionFieldSelector_;
        if (hVar2 != null && hVar2 != h.getDefaultInstance()) {
            f fVarNewBuilder = h.newBuilder(hVar2);
            fVarNewBuilder.mergeFrom((f) hVar);
            hVar = fVarNewBuilder.buildPartial();
        }
        this.msExtensionFieldSelector_ = hVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTypeFieldSelector(h hVar) {
        Objects.requireNonNull(hVar);
        h hVar2 = this.typeFieldSelector_;
        if (hVar2 != null && hVar2 != h.getDefaultInstance()) {
            f fVarNewBuilder = h.newBuilder(hVar2);
            fVarNewBuilder.mergeFrom((f) hVar);
            hVar = fVarNewBuilder.buildPartial();
        }
        this.typeFieldSelector_ = hVar;
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
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
    public void setEncoding(b bVar) {
        this.encoding_ = bVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsExtensionFieldSelector(h hVar) {
        Objects.requireNonNull(hVar);
        this.msExtensionFieldSelector_ = hVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSerialization(d dVar) {
        this.serialization_ = dVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeFieldSelector(h hVar) {
        Objects.requireNonNull(hVar);
        this.typeFieldSelector_ = hVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.typeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeNameBytes(v vVar) {
        this.typeName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueRegex(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.valueRegex_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueRegexBytes(v vVar) {
        this.valueRegex_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0004\u0005᠌\u0005\u0006ဈ\u0003", new Object[]{"bitField0_", "typeName_", "typeFieldSelector_", "msExtensionFieldSelector_", "encoding_", c.f8801b, "serialization_", c.f8800a, "valueRegex_"});
        }
        if (iOrdinal == 3) {
            return new e();
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

    public b getEncoding() {
        b bVarA = b.a(this.encoding_);
        return bVarA == null ? b.UNKNOWN : bVarA;
    }

    public h getMsExtensionFieldSelector() {
        h hVar = this.msExtensionFieldSelector_;
        return hVar == null ? h.getDefaultInstance() : hVar;
    }

    public d getSerialization() {
        d dVarA = d.a(this.serialization_);
        return dVarA == null ? d.UNSPECIFIED : dVarA;
    }

    public h getTypeFieldSelector() {
        h hVar = this.typeFieldSelector_;
        return hVar == null ? h.getDefaultInstance() : hVar;
    }

    public String getTypeName() {
        return this.typeName_;
    }

    public v getTypeNameBytes() {
        return v.s(this.typeName_);
    }

    public String getValueRegex() {
        return this.valueRegex_;
    }

    public v getValueRegexBytes() {
        return v.s(this.valueRegex_);
    }

    public boolean hasEncoding() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMsExtensionFieldSelector() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSerialization() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTypeFieldSelector() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTypeName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValueRegex() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(e eVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(eVar);
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
