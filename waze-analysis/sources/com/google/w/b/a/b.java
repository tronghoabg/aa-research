package com.google.w.b.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends du<b, a> implements fj {
    private static final b DEFAULT_INSTANCE;
    public static final int DEFAULT_SEMANTIC_CONTEXT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int IMPLIES_FIELD_NUMBER = 1;
    private static volatile fo<b> PARSER;
    private int bitField0_;
    private eo<String> implies_ = emptyProtobufList();
    private String description_ = "";
    private String defaultSemanticContext_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImplies(Iterable<String> iterable) {
        ensureImpliesIsMutable();
        com.google.v.c.addAll(iterable, this.implies_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImplies(String str) {
        Objects.requireNonNull(str);
        ensureImpliesIsMutable();
        this.implies_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImpliesBytes(v vVar) {
        ensureImpliesIsMutable();
        this.implies_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultSemanticContext() {
        this.bitField0_ &= -3;
        this.defaultSemanticContext_ = getDefaultInstance().getDefaultSemanticContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -2;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImplies() {
        this.implies_ = emptyProtobufList();
    }

    private void ensureImpliesIsMutable() {
        eo<String> eoVar = this.implies_;
        if (eoVar.c()) {
            return;
        }
        this.implies_ = du.mutableCopy(eoVar);
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultSemanticContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.defaultSemanticContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultSemanticContextBytes(v vVar) {
        this.defaultSemanticContext_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImplies(int i2, String str) {
        Objects.requireNonNull(str);
        ensureImpliesIsMutable();
        this.implies_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"bitField0_", "implies_", "description_", "defaultSemanticContext_"});
        }
        if (iOrdinal == 3) {
            return new b();
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
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDefaultSemanticContext() {
        return this.defaultSemanticContext_;
    }

    public v getDefaultSemanticContextBytes() {
        return v.s(this.defaultSemanticContext_);
    }

    public String getDescription() {
        return this.description_;
    }

    public v getDescriptionBytes() {
        return v.s(this.description_);
    }

    public String getImplies(int i2) {
        return this.implies_.get(i2);
    }

    public v getImpliesBytes(int i2) {
        return v.s(this.implies_.get(i2));
    }

    public int getImpliesCount() {
        return this.implies_.size();
    }

    public List<String> getImpliesList() {
        return this.implies_;
    }

    public boolean hasDefaultSemanticContext() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
