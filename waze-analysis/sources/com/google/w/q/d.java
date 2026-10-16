package com.google.w.q;

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
public final class d extends du<d, a> implements fj {
    private static final d DEFAULT_INSTANCE;
    public static final int IGNORE_FIELD_NUMBER = 5;
    public static final int IS_LEGACY_NAMESPACE_FIELD_NUMBER = 7;
    public static final int LEGACY_ABSOLUTE_INDEX_TYPE_FIELD_NUMBER = 4;
    public static final int LEGACY_ABSOLUTE_NAME_FIELD_NUMBER = 3;
    public static final int LEGACY_LOAD_AS_FLOAT_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<d> PARSER = null;
    public static final int RELATIVE_NAME_FIELD_NUMBER = 2;
    private int bitField0_;
    private Object featureRename_;
    private boolean ignore_;
    private Object indexTypeRename_;
    private boolean legacyLoadAsFloat_;
    private int featureRenameCase_ = 0;
    private int indexTypeRenameCase_ = 0;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureRename() {
        this.featureRenameCase_ = 0;
        this.featureRename_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgnore() {
        this.bitField0_ &= -2;
        this.ignore_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndexTypeRename() {
        this.indexTypeRenameCase_ = 0;
        this.indexTypeRename_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLegacyNamespace() {
        if (this.featureRenameCase_ == 7) {
            this.featureRenameCase_ = 0;
            this.featureRename_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyAbsoluteIndexType() {
        if (this.indexTypeRenameCase_ == 4) {
            this.indexTypeRenameCase_ = 0;
            this.indexTypeRename_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyAbsoluteName() {
        if (this.featureRenameCase_ == 3) {
            this.featureRenameCase_ = 0;
            this.featureRename_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyLoadAsFloat() {
        this.bitField0_ &= -3;
        this.legacyLoadAsFloat_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        if (this.featureRenameCase_ == 1) {
            this.featureRenameCase_ = 0;
            this.featureRename_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelativeName() {
        if (this.featureRenameCase_ == 2) {
            this.featureRenameCase_ = 0;
            this.featureRename_ = null;
        }
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnore(boolean z) {
        this.bitField0_ |= 1;
        this.ignore_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLegacyNamespace(boolean z) {
        this.featureRenameCase_ = 7;
        this.featureRename_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyAbsoluteIndexType(String str) {
        Objects.requireNonNull(str);
        this.indexTypeRenameCase_ = 4;
        this.indexTypeRename_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyAbsoluteIndexTypeBytes(v vVar) {
        this.indexTypeRename_ = vVar.u();
        this.indexTypeRenameCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyAbsoluteName(String str) {
        Objects.requireNonNull(str);
        this.featureRenameCase_ = 3;
        this.featureRename_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyAbsoluteNameBytes(v vVar) {
        this.featureRename_ = vVar.u();
        this.featureRenameCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyLoadAsFloat(boolean z) {
        this.bitField0_ |= 2;
        this.legacyLoadAsFloat_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.featureRenameCase_ = 1;
        this.featureRename_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        this.featureRename_ = vVar.u();
        this.featureRenameCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelativeName(String str) {
        Objects.requireNonNull(str);
        this.featureRenameCase_ = 2;
        this.featureRename_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelativeNameBytes(v vVar) {
        this.featureRename_ = vVar.u();
        this.featureRenameCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0002\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001;\u0000\u0002;\u0000\u0003;\u0000\u0004;\u0001\u0005ဇ\u0000\u0006ဇ\u0001\u0007:\u0000", new Object[]{"featureRename_", "featureRenameCase_", "indexTypeRename_", "indexTypeRenameCase_", "bitField0_", "ignore_", "legacyLoadAsFloat_"});
        }
        if (iOrdinal == 3) {
            return new d();
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
        fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public b getFeatureRenameCase() {
        int i2 = this.featureRenameCase_;
        if (i2 == 0) {
            return b.f13331e;
        }
        if (i2 == 1) {
            return b.f13327a;
        }
        if (i2 == 2) {
            return b.f13328b;
        }
        if (i2 == 3) {
            return b.f13329c;
        }
        if (i2 != 7) {
            return null;
        }
        return b.f13330d;
    }

    public boolean getIgnore() {
        return this.ignore_;
    }

    public c getIndexTypeRenameCase() {
        int i2 = this.indexTypeRenameCase_;
        if (i2 == 0) {
            return c.f13334b;
        }
        if (i2 != 4) {
            return null;
        }
        return c.f13333a;
    }

    public boolean getIsLegacyNamespace() {
        if (this.featureRenameCase_ == 7) {
            return ((Boolean) this.featureRename_).booleanValue();
        }
        return false;
    }

    public String getLegacyAbsoluteIndexType() {
        return this.indexTypeRenameCase_ == 4 ? (String) this.indexTypeRename_ : "";
    }

    public v getLegacyAbsoluteIndexTypeBytes() {
        return v.s(this.indexTypeRenameCase_ == 4 ? (String) this.indexTypeRename_ : "");
    }

    public String getLegacyAbsoluteName() {
        return this.featureRenameCase_ == 3 ? (String) this.featureRename_ : "";
    }

    public v getLegacyAbsoluteNameBytes() {
        return v.s(this.featureRenameCase_ == 3 ? (String) this.featureRename_ : "");
    }

    public boolean getLegacyLoadAsFloat() {
        return this.legacyLoadAsFloat_;
    }

    public String getName() {
        return this.featureRenameCase_ == 1 ? (String) this.featureRename_ : "";
    }

    public v getNameBytes() {
        return v.s(this.featureRenameCase_ == 1 ? (String) this.featureRename_ : "");
    }

    public String getRelativeName() {
        return this.featureRenameCase_ == 2 ? (String) this.featureRename_ : "";
    }

    public v getRelativeNameBytes() {
        return v.s(this.featureRenameCase_ == 2 ? (String) this.featureRename_ : "");
    }

    public boolean hasIgnore() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsLegacyNamespace() {
        return this.featureRenameCase_ == 7;
    }

    public boolean hasLegacyAbsoluteIndexType() {
        return this.indexTypeRenameCase_ == 4;
    }

    public boolean hasLegacyAbsoluteName() {
        return this.featureRenameCase_ == 3;
    }

    public boolean hasLegacyLoadAsFloat() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return this.featureRenameCase_ == 1;
    }

    public boolean hasRelativeName() {
        return this.featureRenameCase_ == 2;
    }

    public static a newBuilder(d dVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
