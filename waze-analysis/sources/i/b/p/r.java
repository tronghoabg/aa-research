package i.b.p;

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
public final class r extends du<r, q> implements fj {
    private static final r DEFAULT_INSTANCE;
    public static final int DRIVING_THERE_FIELD_NUMBER = 3;
    public static final int MEETING_FIELD_NUMBER = 1;
    public static final int OWNER_FIELD_NUMBER = 2;
    private static volatile fo<r> PARSER;
    private int bitField0_;
    private boolean drivingThere_;
    private x meeting_;
    private aa owner_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrivingThere() {
        this.bitField0_ &= -5;
        this.drivingThere_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeeting() {
        this.meeting_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwner() {
        this.owner_ = null;
        this.bitField0_ &= -3;
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMeeting(x xVar) {
        Objects.requireNonNull(xVar);
        x xVar2 = this.meeting_;
        if (xVar2 != null && xVar2 != x.getDefaultInstance()) {
            v vVarNewBuilder = x.newBuilder(xVar2);
            vVarNewBuilder.mergeFrom((v) xVar);
            xVar = vVarNewBuilder.buildPartial();
        }
        this.meeting_ = xVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOwner(aa aaVar) {
        Objects.requireNonNull(aaVar);
        aa aaVar2 = this.owner_;
        if (aaVar2 != null && aaVar2 != aa.getDefaultInstance()) {
            z zVarNewBuilder = aa.newBuilder(aaVar2);
            zVarNewBuilder.mergeFrom((z) aaVar);
            aaVar = zVarNewBuilder.buildPartial();
        }
        this.owner_ = aaVar;
        this.bitField0_ |= 2;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static r parseDelimitedFrom(InputStream inputStream) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(com.google.v.v vVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<r> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrivingThere(boolean z) {
        this.bitField0_ |= 4;
        this.drivingThere_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeeting(x xVar) {
        Objects.requireNonNull(xVar);
        this.meeting_ = xVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwner(aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.owner_ = aaVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "meeting_", "owner_", "drivingThere_"});
        }
        if (iOrdinal == 3) {
            return new r();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new q(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<r> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (r.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getDrivingThere() {
        return this.drivingThere_;
    }

    public x getMeeting() {
        x xVar = this.meeting_;
        return xVar == null ? x.getDefaultInstance() : xVar;
    }

    public aa getOwner() {
        aa aaVar = this.owner_;
        return aaVar == null ? aa.getDefaultInstance() : aaVar;
    }

    public boolean hasDrivingThere() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMeeting() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOwner() {
        return (this.bitField0_ & 2) != 0;
    }

    public static q newBuilder(r rVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(rVar);
    }

    public static r parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(com.google.v.v vVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static r parseFrom(com.google.v.z zVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static r parseFrom(com.google.v.z zVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static r parseFrom(InputStream inputStream) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(InputStream inputStream, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(ByteBuffer byteBuffer) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static r parseFrom(byte[] bArr) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r parseFrom(byte[] bArr, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
