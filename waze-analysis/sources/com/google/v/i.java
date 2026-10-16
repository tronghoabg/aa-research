package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends du<i, h> implements j {
    private static final i DEFAULT_INSTANCE;
    private static volatile fo<i> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private v value_ = v.f13054a;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(v vVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        Objects.requireNonNull(str);
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.typeUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(v vVar) {
        Objects.requireNonNull(vVar);
        this.value_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
        }
        if (iOrdinal == 3) {
            return new i();
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
        fo<i> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (i.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public v getTypeUrlBytes() {
        return v.s(this.typeUrl_);
    }

    public v getValue() {
        return this.value_;
    }

    public static h newBuilder(i iVar) {
        return (h) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(v vVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static i parseFrom(z zVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static i parseFrom(z zVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static i parseFrom(InputStream inputStream) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static i parseFrom(byte[] bArr) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
