package com.google.e.a.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class ck extends du<ck, cj> implements fj {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final ck DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile fo<ck> PARSER;
    private String configName_ = "";
    private eo<bo> entry_ = emptyProtobufList();

    static {
        ck ckVar = new ck();
        DEFAULT_INSTANCE = ckVar;
        du.registerDefaultInstance(ck.class, ckVar);
    }

    private ck() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntry(Iterable<? extends bo> iterable) {
        ensureEntryIsMutable();
        com.google.v.c.addAll(iterable, this.entry_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(int i2, bo boVar) {
        Objects.requireNonNull(boVar);
        ensureEntryIsMutable();
        this.entry_.add(i2, boVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigName() {
        this.configName_ = getDefaultInstance().getConfigName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntry() {
        this.entry_ = emptyProtobufList();
    }

    private void ensureEntryIsMutable() {
        eo<bo> eoVar = this.entry_;
        if (eoVar.c()) {
            return;
        }
        this.entry_ = du.mutableCopy(eoVar);
    }

    public static ck getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cj newBuilder() {
        return (cj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ck parseDelimitedFrom(InputStream inputStream) {
        return (ck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ck parseFrom(com.google.v.v vVar) {
        return (ck) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ck> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntry(int i2) {
        ensureEntryIsMutable();
        this.entry_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigName(String str) {
        Objects.requireNonNull(str);
        this.configName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.configName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntry(int i2, bo boVar) {
        Objects.requireNonNull(boVar);
        ensureEntryIsMutable();
        this.entry_.set(i2, boVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", bo.class});
        }
        if (iOrdinal == 3) {
            return new ck();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ck> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ck.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getConfigName() {
        return this.configName_;
    }

    public com.google.v.v getConfigNameBytes() {
        return com.google.v.v.s(this.configName_);
    }

    public bo getEntry(int i2) {
        return this.entry_.get(i2);
    }

    public int getEntryCount() {
        return this.entry_.size();
    }

    public List<bo> getEntryList() {
        return this.entry_;
    }

    public bp getEntryOrBuilder(int i2) {
        return this.entry_.get(i2);
    }

    public List<? extends bp> getEntryOrBuilderList() {
        return this.entry_;
    }

    public static cj newBuilder(ck ckVar) {
        return (cj) DEFAULT_INSTANCE.createBuilder(ckVar);
    }

    public static ck parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ck parseFrom(com.google.v.v vVar, de deVar) {
        return (ck) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ck parseFrom(com.google.v.z zVar) {
        return (ck) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ck parseFrom(com.google.v.z zVar, de deVar) {
        return (ck) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(bo boVar) {
        Objects.requireNonNull(boVar);
        ensureEntryIsMutable();
        this.entry_.add(boVar);
    }

    public static ck parseFrom(InputStream inputStream) {
        return (ck) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ck parseFrom(InputStream inputStream, de deVar) {
        return (ck) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ck parseFrom(ByteBuffer byteBuffer) {
        return (ck) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ck parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ck) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ck parseFrom(byte[] bArr) {
        return (ck) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ck parseFrom(byte[] bArr, de deVar) {
        return (ck) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
