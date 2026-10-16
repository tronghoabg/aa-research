package i.b.u;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import i.b.af;
import i.b.ah;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class q extends du<q, p> implements fj {
    private static final q DEFAULT_INSTANCE;
    public static final int FAILURE_TYPE_FIELD_NUMBER = 2;
    private static volatile fo<q> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int failureType_;
    private ah status_;

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        du.registerDefaultInstance(q.class, qVar);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureType() {
        this.bitField0_ &= -3;
        this.failureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    public static q getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ah ahVar2 = this.status_;
        if (ahVar2 != null && ahVar2 != ah.getDefaultInstance()) {
            af afVarNewBuilder = ah.newBuilder(ahVar2);
            afVarNewBuilder.mergeFrom((af) ahVar);
            ahVar = afVarNewBuilder.buildPartial();
        }
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static q parseDelimitedFrom(InputStream inputStream) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(com.google.v.v vVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<q> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureType(t tVar) {
        this.failureType_ = tVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "status_", "failureType_", h.f49312c});
        }
        if (iOrdinal == 3) {
            return new q();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new p(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<q> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (q.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public t getFailureType() {
        t tVarA = t.a(this.failureType_);
        return tVarA == null ? t.INVALID_USER_NAME : tVarA;
    }

    public ah getStatus() {
        ah ahVar = this.status_;
        return ahVar == null ? ah.getDefaultInstance() : ahVar;
    }

    public boolean hasFailureType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static p newBuilder(q qVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(qVar);
    }

    public static q parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(com.google.v.v vVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static q parseFrom(com.google.v.z zVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static q parseFrom(com.google.v.z zVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static q parseFrom(InputStream inputStream) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(InputStream inputStream, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(ByteBuffer byteBuffer) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static q parseFrom(byte[] bArr) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static q parseFrom(byte[] bArr, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
