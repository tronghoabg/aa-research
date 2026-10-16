package com.google.w.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends du<m, l> implements fj {
    public static final int COUNTRY_LEVEL_LOCATION_FIELD_NUMBER = 3;
    private static final m DEFAULT_INSTANCE;
    public static final int NON_USER_LOCATION_FIELD_NUMBER = 1;
    private static volatile fo<m> PARSER = null;
    public static final int PRECISE_LOCATION_FIELD_NUMBER = 2;
    public static final int USER_INDIRECT_LOCATION_FIELD_NUMBER = 4;
    public static final int USER_PLACE_OF_INTEREST_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean countryLevelLocation_;
    private boolean nonUserLocation_;
    private boolean preciseLocation_;
    private boolean userIndirectLocation_;
    private boolean userPlaceOfInterest_;

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryLevelLocation() {
        this.bitField0_ &= -17;
        this.countryLevelLocation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNonUserLocation() {
        this.bitField0_ &= -2;
        this.nonUserLocation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreciseLocation() {
        this.bitField0_ &= -9;
        this.preciseLocation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserIndirectLocation() {
        this.bitField0_ &= -3;
        this.userIndirectLocation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPlaceOfInterest() {
        this.bitField0_ &= -5;
        this.userPlaceOfInterest_ = false;
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryLevelLocation(boolean z) {
        this.bitField0_ |= 16;
        this.countryLevelLocation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonUserLocation(boolean z) {
        this.bitField0_ |= 1;
        this.nonUserLocation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreciseLocation(boolean z) {
        this.bitField0_ |= 8;
        this.preciseLocation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserIndirectLocation(boolean z) {
        this.bitField0_ |= 2;
        this.userIndirectLocation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPlaceOfInterest(boolean z) {
        this.bitField0_ |= 4;
        this.userPlaceOfInterest_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0003\u0003ဇ\u0004\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"bitField0_", "nonUserLocation_", "preciseLocation_", "countryLevelLocation_", "userIndirectLocation_", "userPlaceOfInterest_"});
        }
        if (iOrdinal == 3) {
            return new m();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<m> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (m.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getCountryLevelLocation() {
        return this.countryLevelLocation_;
    }

    public boolean getNonUserLocation() {
        return this.nonUserLocation_;
    }

    public boolean getPreciseLocation() {
        return this.preciseLocation_;
    }

    public boolean getUserIndirectLocation() {
        return this.userIndirectLocation_;
    }

    public boolean getUserPlaceOfInterest() {
        return this.userPlaceOfInterest_;
    }

    public boolean hasCountryLevelLocation() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasNonUserLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPreciseLocation() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUserIndirectLocation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserPlaceOfInterest() {
        return (this.bitField0_ & 4) != 0;
    }

    public static l newBuilder(m mVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
