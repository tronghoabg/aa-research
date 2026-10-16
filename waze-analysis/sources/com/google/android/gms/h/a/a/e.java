package com.google.android.gms.h.a.a;

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
public final class e extends du<e, c> implements fj {
    private static final e DEFAULT_INSTANCE;
    public static final int INTENT_HASH_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile fo<e> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int intentHash_;
    private String name_ = "";
    private int type_;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntentHash() {
        this.bitField0_ &= -5;
        this.intentHash_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
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
    public void setIntentHash(int i2) {
        this.bitField0_ |= 4;
        this.intentHash_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(d dVar) {
        this.type_ = dVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"bitField0_", "type_", g.f5487b, "name_", "intentHash_"});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
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

    public int getIntentHash() {
        return this.intentHash_;
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public d getType() {
        d dVarA = d.a(this.type_);
        return dVarA == null ? d.UNKNOWN : dVarA;
    }

    public boolean hasIntentHash() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static c newBuilder(e eVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(eVar);
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
