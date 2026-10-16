package i.b.n;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class t extends du<t, s> implements u {
    private static final t DEFAULT_INSTANCE;
    public static final int IS_BEST_FIELD_NUMBER = 4;
    public static final int IS_POPULAR_FIELD_NUMBER = 3;
    private static volatile fo<t> PARSER = null;
    public static final int SEARCH_RESULT_FIELD_NUMBER = 1;
    public static final int WALKING_DISTANCE_FIELD_NUMBER = 2;
    public static final int WALKING_MINUTES_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean isBest_;
    private boolean isPopular_;
    private byte memoizedIsInitialized = 2;
    private ab searchResult_;
    private int walkingDistance_;
    private int walkingMinutes_;

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        du.registerDefaultInstance(t.class, tVar);
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBest() {
        this.bitField0_ &= -9;
        this.isBest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPopular() {
        this.bitField0_ &= -5;
        this.isPopular_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchResult() {
        this.searchResult_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalkingDistance() {
        this.bitField0_ &= -3;
        this.walkingDistance_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalkingMinutes() {
        this.bitField0_ &= -17;
        this.walkingMinutes_ = 0;
    }

    public static t getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchResult(ab abVar) {
        Objects.requireNonNull(abVar);
        ab abVar2 = this.searchResult_;
        if (abVar2 != null && abVar2 != ab.getDefaultInstance()) {
            aa aaVarNewBuilder = ab.newBuilder(abVar2);
            aaVarNewBuilder.mergeFrom((aa) abVar);
            abVar = aaVarNewBuilder.buildPartial();
        }
        this.searchResult_ = abVar;
        this.bitField0_ |= 1;
    }

    public static s newBuilder() {
        return (s) DEFAULT_INSTANCE.createBuilder();
    }

    public static t parseDelimitedFrom(InputStream inputStream) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(com.google.v.v vVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<t> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBest(boolean z) {
        this.bitField0_ |= 8;
        this.isBest_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPopular(boolean z) {
        this.bitField0_ |= 4;
        this.isPopular_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchResult(ab abVar) {
        Objects.requireNonNull(abVar);
        this.searchResult_ = abVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalkingDistance(int i2) {
        this.bitField0_ |= 2;
        this.walkingDistance_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalkingMinutes(int i2) {
        this.bitField0_ |= 16;
        this.walkingMinutes_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"bitField0_", "searchResult_", "walkingDistance_", "isPopular_", "isBest_", "walkingMinutes_"});
            case 3:
                return new t();
            case 4:
                return new s(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<t> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (t.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public boolean getIsBest() {
        return this.isBest_;
    }

    public boolean getIsPopular() {
        return this.isPopular_;
    }

    public ab getSearchResult() {
        ab abVar = this.searchResult_;
        return abVar == null ? ab.getDefaultInstance() : abVar;
    }

    public int getWalkingDistance() {
        return this.walkingDistance_;
    }

    public int getWalkingMinutes() {
        return this.walkingMinutes_;
    }

    public boolean hasIsBest() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsPopular() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSearchResult() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWalkingDistance() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWalkingMinutes() {
        return (this.bitField0_ & 16) != 0;
    }

    public static s newBuilder(t tVar) {
        return (s) DEFAULT_INSTANCE.createBuilder(tVar);
    }

    public static t parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(com.google.v.v vVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static t parseFrom(com.google.v.z zVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static t parseFrom(com.google.v.z zVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static t parseFrom(InputStream inputStream) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(InputStream inputStream, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(ByteBuffer byteBuffer) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static t parseFrom(byte[] bArr) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static t parseFrom(byte[] bArr, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
