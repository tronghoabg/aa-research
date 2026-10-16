package com.google.h.b.a;

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
public final class f extends du<f, e> implements fj {
    private static final f DEFAULT_INSTANCE;
    public static final int DISPLAYED_NAME_FIELD_NUMBER = 1;
    public static final int INITIALLY_EXPANDED_FIELD_NUMBER = 2;
    private static volatile fo<f> PARSER = null;
    public static final int SHORT_DESCRIPTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private String displayedName_ = "";
    private boolean initiallyExpanded_ = true;
    private String shortDescription_ = "";

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayedName() {
        this.bitField0_ &= -2;
        this.displayedName_ = getDefaultInstance().getDisplayedName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitiallyExpanded() {
        this.bitField0_ &= -3;
        this.initiallyExpanded_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortDescription() {
        this.bitField0_ &= -5;
        this.shortDescription_ = getDefaultInstance().getShortDescription();
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.displayedName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedNameBytes(v vVar) {
        this.displayedName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitiallyExpanded(boolean z) {
        this.bitField0_ |= 2;
        this.initiallyExpanded_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.shortDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortDescriptionBytes(v vVar) {
        this.shortDescription_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "displayedName_", "initiallyExpanded_", "shortDescription_"});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDisplayedName() {
        return this.displayedName_;
    }

    public v getDisplayedNameBytes() {
        return v.s(this.displayedName_);
    }

    public boolean getInitiallyExpanded() {
        return this.initiallyExpanded_;
    }

    public String getShortDescription() {
        return this.shortDescription_;
    }

    public v getShortDescriptionBytes() {
        return v.s(this.shortDescription_);
    }

    public boolean hasDisplayedName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInitiallyExpanded() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasShortDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public static e newBuilder(f fVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
