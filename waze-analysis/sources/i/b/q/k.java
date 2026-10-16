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
public final class k extends du<k, j> implements fj {
    private static final k DEFAULT_INSTANCE;
    public static final int DEST_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 1;
    private static volatile fo<k> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 3;
    private int bitField0_;
    private aa dest_;
    private aa origin_;
    private p time_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDest() {
        this.dest_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigin() {
        this.origin_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = null;
        this.bitField0_ &= -5;
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDest(aa aaVar) {
        Objects.requireNonNull(aaVar);
        aa aaVar2 = this.dest_;
        if (aaVar2 != null && aaVar2 != aa.getDefaultInstance()) {
            z zVarNewBuilder = aa.newBuilder(aaVar2);
            zVarNewBuilder.mergeFrom((z) aaVar);
            aaVar = zVarNewBuilder.buildPartial();
        }
        this.dest_ = aaVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOrigin(aa aaVar) {
        Objects.requireNonNull(aaVar);
        aa aaVar2 = this.origin_;
        if (aaVar2 != null && aaVar2 != aa.getDefaultInstance()) {
            z zVarNewBuilder = aa.newBuilder(aaVar2);
            zVarNewBuilder.mergeFrom((z) aaVar);
            aaVar = zVarNewBuilder.buildPartial();
        }
        this.origin_ = aaVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTime(p pVar) {
        Objects.requireNonNull(pVar);
        p pVar2 = this.time_;
        if (pVar2 != null && pVar2 != p.getDefaultInstance()) {
            n nVarNewBuilder = p.newBuilder(pVar2);
            nVarNewBuilder.mergeFrom((n) pVar);
            pVar = nVarNewBuilder.buildPartial();
        }
        this.time_ = pVar;
        this.bitField0_ |= 4;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(com.google.v.v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDest(aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.dest_ = aaVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigin(aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.origin_ = aaVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(p pVar) {
        Objects.requireNonNull(pVar);
        this.time_ = pVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "origin_", "dest_", "time_"});
        }
        if (iOrdinal == 3) {
            return new k();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<k> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (k.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aa getDest() {
        aa aaVar = this.dest_;
        return aaVar == null ? aa.getDefaultInstance() : aaVar;
    }

    public aa getOrigin() {
        aa aaVar = this.origin_;
        return aaVar == null ? aa.getDefaultInstance() : aaVar;
    }

    public p getTime() {
        p pVar = this.time_;
        return pVar == null ? p.getDefaultInstance() : pVar;
    }

    public boolean hasDest() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOrigin() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTime() {
        return (this.bitField0_ & 4) != 0;
    }

    public static j newBuilder(k kVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(com.google.v.v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(com.google.v.z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(com.google.v.z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
