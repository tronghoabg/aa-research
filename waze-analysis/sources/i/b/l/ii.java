package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ii extends com.google.v.du<ii, ig> implements ij {
    private static final ii DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ii> PARSER = null;
    public static final int PERMISSIONS_FIELD_NUMBER = 2;
    public static final int URL_WITH_HOST_PATTERN_FIELD_NUMBER = 1;
    private static final com.google.v.el<ih> permissions_converter_ = new ff(10);
    private int bitField0_;
    private String urlWithHostPattern_ = "";
    private com.google.v.ek permissions_ = emptyIntList();
    private String description_ = "";

    static {
        ii iiVar = new ii();
        DEFAULT_INSTANCE = iiVar;
        com.google.v.du.registerDefaultInstance(ii.class, iiVar);
    }

    private ii() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPermissions(Iterable<? extends ih> iterable) {
        ensurePermissionsIsMutable();
        Iterator<? extends ih> it = iterable.iterator();
        while (it.hasNext()) {
            this.permissions_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermissions(ih ihVar) {
        Objects.requireNonNull(ihVar);
        ensurePermissionsIsMutable();
        this.permissions_.i(ihVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -3;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermissions() {
        this.permissions_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrlWithHostPattern() {
        this.bitField0_ &= -2;
        this.urlWithHostPattern_ = getDefaultInstance().getUrlWithHostPattern();
    }

    private void ensurePermissionsIsMutable() {
        com.google.v.ek ekVar = this.permissions_;
        if (ekVar.c()) {
            return;
        }
        this.permissions_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static ii getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ig newBuilder() {
        return (ig) DEFAULT_INSTANCE.createBuilder();
    }

    public static ii parseDelimitedFrom(InputStream inputStream) {
        return (ii) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ii parseFrom(com.google.v.v vVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ii> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermissions(int i2, ih ihVar) {
        Objects.requireNonNull(ihVar);
        ensurePermissionsIsMutable();
        this.permissions_.e(i2, ihVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlWithHostPattern(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.urlWithHostPattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlWithHostPatternBytes(com.google.v.v vVar) {
        this.urlWithHostPattern_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ\u0003ဈ\u0001", new Object[]{"bitField0_", "urlWithHostPattern_", "permissions_", hf.f48740d, "description_"});
        }
        if (iOrdinal == 3) {
            return new ii();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ig(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ii> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ii.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public ih getPermissions(int i2) {
        ih ihVarA = ih.a(this.permissions_.d(i2));
        return ihVarA == null ? ih.UNKNOWN : ihVarA;
    }

    public int getPermissionsCount() {
        return this.permissions_.size();
    }

    public List<ih> getPermissionsList() {
        return new com.google.v.em(this.permissions_, permissions_converter_);
    }

    public String getUrlWithHostPattern() {
        return this.urlWithHostPattern_;
    }

    public com.google.v.v getUrlWithHostPatternBytes() {
        return com.google.v.v.s(this.urlWithHostPattern_);
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUrlWithHostPattern() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ig newBuilder(ii iiVar) {
        return (ig) DEFAULT_INSTANCE.createBuilder(iiVar);
    }

    public static ii parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ii) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ii parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ii parseFrom(com.google.v.z zVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ii parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ii parseFrom(InputStream inputStream) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ii parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ii parseFrom(ByteBuffer byteBuffer) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ii parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ii parseFrom(byte[] bArr) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ii parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
