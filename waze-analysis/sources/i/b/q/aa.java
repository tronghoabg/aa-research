package i.b.q;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aa extends du<aa, z> implements fj {
    public static final int BRAND_ICON_FIELD_NUMBER = 3;
    private static final aa DEFAULT_INSTANCE;
    public static final int FAVORITEINFO_FIELD_NUMBER = 2;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile fo<aa> PARSER;
    private int bitField0_;
    private String brandIcon_ = "";
    private u favoriteInfo_;
    private i.b.p.u location_;

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        du.registerDefaultInstance(aa.class, aaVar);
    }

    private aa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrandIcon() {
        this.bitField0_ &= -5;
        this.brandIcon_ = getDefaultInstance().getBrandIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavoriteInfo() {
        this.favoriteInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -2;
    }

    public static aa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFavoriteInfo(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.favoriteInfo_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.favoriteInfo_ = uVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(i.b.p.u uVar) {
        Objects.requireNonNull(uVar);
        i.b.p.u uVar2 = this.location_;
        if (uVar2 != null && uVar2 != i.b.p.u.getDefaultInstance()) {
            i.b.p.t tVarNewBuilder = i.b.p.u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((i.b.p.t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.location_ = uVar;
        this.bitField0_ |= 1;
    }

    public static z newBuilder() {
        return (z) DEFAULT_INSTANCE.createBuilder();
    }

    public static aa parseDelimitedFrom(InputStream inputStream) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(com.google.v.v vVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.brandIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandIconBytes(com.google.v.v vVar) {
        this.brandIcon_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoriteInfo(u uVar) {
        Objects.requireNonNull(uVar);
        this.favoriteInfo_ = uVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(i.b.p.u uVar) {
        Objects.requireNonNull(uVar);
        this.location_ = uVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "location_", "favoriteInfo_", "brandIcon_"});
        }
        if (iOrdinal == 3) {
            return new aa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new z(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBrandIcon() {
        return this.brandIcon_;
    }

    public com.google.v.v getBrandIconBytes() {
        return com.google.v.v.s(this.brandIcon_);
    }

    public u getFavoriteInfo() {
        u uVar = this.favoriteInfo_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public i.b.p.u getLocation() {
        i.b.p.u uVar = this.location_;
        return uVar == null ? i.b.p.u.getDefaultInstance() : uVar;
    }

    public boolean hasBrandIcon() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFavoriteInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static z newBuilder(aa aaVar) {
        return (z) DEFAULT_INSTANCE.createBuilder(aaVar);
    }

    public static aa parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(com.google.v.v vVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aa parseFrom(com.google.v.z zVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aa parseFrom(com.google.v.z zVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aa parseFrom(InputStream inputStream) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(InputStream inputStream, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(ByteBuffer byteBuffer) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aa parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aa parseFrom(byte[] bArr) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aa parseFrom(byte[] bArr, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
