package com.google.android.libraries.phenotype.client.stable;

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
/* loaded from: classes4.dex */
public final class ab extends du<ab, aa> implements fj {
    public static final int ACCOUNT_SCOPED_FIELD_NUMBER = 7;
    public static final int AUTO_SUBPACKAGE_FIELD_NUMBER = 2;
    public static final int BACKING_FIELD_NUMBER = 4;
    private static final ab DEFAULT_INSTANCE;
    public static final int DIRECT_BOOT_AWARE_FIELD_NUMBER = 6;
    public static final int LOG_SOURCE_NAMES_FIELD_NUMBER = 3;
    private static volatile fo<ab> PARSER = null;
    public static final int STATIC_CONFIG_PACKAGE_FIELD_NUMBER = 1;
    public static final int STICKY_ACCOUNT_SUPPORT_FIELD_NUMBER = 5;
    private boolean accountScoped_;
    private boolean autoSubpackage_;
    private int backing_;
    private int bitField0_;
    private boolean directBootAware_;
    private boolean stickyAccountSupport_;
    private String staticConfigPackage_ = "";
    private eo<String> logSourceNames_ = emptyProtobufList();

    static {
        ab abVar = new ab();
        DEFAULT_INSTANCE = abVar;
        du.registerDefaultInstance(ab.class, abVar);
    }

    private ab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogSourceNames(Iterable<String> iterable) {
        ensureLogSourceNamesIsMutable();
        com.google.v.c.addAll(iterable, this.logSourceNames_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogSourceNames(String str) {
        Objects.requireNonNull(str);
        ensureLogSourceNamesIsMutable();
        this.logSourceNames_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogSourceNamesBytes(com.google.v.v vVar) {
        ensureLogSourceNamesIsMutable();
        this.logSourceNames_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountScoped() {
        this.bitField0_ &= -17;
        this.accountScoped_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoSubpackage() {
        this.bitField0_ &= -3;
        this.autoSubpackage_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBacking() {
        this.bitField0_ &= -5;
        this.backing_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirectBootAware() {
        this.bitField0_ &= -33;
        this.directBootAware_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogSourceNames() {
        this.logSourceNames_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStaticConfigPackage() {
        this.bitField0_ &= -2;
        this.staticConfigPackage_ = getDefaultInstance().getStaticConfigPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStickyAccountSupport() {
        this.bitField0_ &= -9;
        this.stickyAccountSupport_ = false;
    }

    private void ensureLogSourceNamesIsMutable() {
        eo<String> eoVar = this.logSourceNames_;
        if (eoVar.c()) {
            return;
        }
        this.logSourceNames_ = du.mutableCopy(eoVar);
    }

    public static ab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aa newBuilder() {
        return (aa) DEFAULT_INSTANCE.createBuilder();
    }

    public static ab parseDelimitedFrom(InputStream inputStream) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(com.google.v.v vVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountScoped(boolean z) {
        this.bitField0_ |= 16;
        this.accountScoped_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSubpackage(boolean z) {
        this.bitField0_ |= 2;
        this.autoSubpackage_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBacking(com.google.g.a.a.b bVar) {
        this.backing_ = bVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectBootAware(boolean z) {
        this.bitField0_ |= 32;
        this.directBootAware_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogSourceNames(int i2, String str) {
        Objects.requireNonNull(str);
        ensureLogSourceNamesIsMutable();
        this.logSourceNames_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaticConfigPackage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.staticConfigPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaticConfigPackageBytes(com.google.v.v vVar) {
        this.staticConfigPackage_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStickyAccountSupport(boolean z) {
        this.bitField0_ |= 8;
        this.stickyAccountSupport_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"bitField0_", "staticConfigPackage_", "autoSubpackage_", "logSourceNames_", "backing_", com.google.g.a.a.b.b(), "stickyAccountSupport_", "directBootAware_", "accountScoped_"});
        }
        if (iOrdinal == 3) {
            return new ab();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ab> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ab.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAccountScoped() {
        return this.accountScoped_;
    }

    public boolean getAutoSubpackage() {
        return this.autoSubpackage_;
    }

    public com.google.g.a.a.b getBacking() {
        com.google.g.a.a.b bVarA = com.google.g.a.a.b.a(this.backing_);
        return bVarA == null ? com.google.g.a.a.b.UNKNOWN : bVarA;
    }

    public boolean getDirectBootAware() {
        return this.directBootAware_;
    }

    public String getLogSourceNames(int i2) {
        return this.logSourceNames_.get(i2);
    }

    public com.google.v.v getLogSourceNamesBytes(int i2) {
        return com.google.v.v.s(this.logSourceNames_.get(i2));
    }

    public int getLogSourceNamesCount() {
        return this.logSourceNames_.size();
    }

    public List<String> getLogSourceNamesList() {
        return this.logSourceNames_;
    }

    public String getStaticConfigPackage() {
        return this.staticConfigPackage_;
    }

    public com.google.v.v getStaticConfigPackageBytes() {
        return com.google.v.v.s(this.staticConfigPackage_);
    }

    public boolean getStickyAccountSupport() {
        return this.stickyAccountSupport_;
    }

    public boolean hasAccountScoped() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasAutoSubpackage() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasBacking() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDirectBootAware() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasStaticConfigPackage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStickyAccountSupport() {
        return (this.bitField0_ & 8) != 0;
    }

    public static aa newBuilder(ab abVar) {
        return (aa) DEFAULT_INSTANCE.createBuilder(abVar);
    }

    public static ab parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(com.google.v.v vVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ab parseFrom(com.google.v.z zVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ab parseFrom(com.google.v.z zVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ab parseFrom(InputStream inputStream) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(InputStream inputStream, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(ByteBuffer byteBuffer) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ab parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ab parseFrom(byte[] bArr) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ab parseFrom(byte[] bArr, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
