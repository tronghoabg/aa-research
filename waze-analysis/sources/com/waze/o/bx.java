package com.waze.o;

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
/* loaded from: classes5.dex */
public final class bx extends du<bx, bj> implements fj {
    private static final bx DEFAULT_INSTANCE;
    public static final int NEW_USER_FIELD_NUMBER = 1;
    private static volatile fo<bx> PARSER = null;
    public static final int REROUTE_FIELD_NUMBER = 2;
    public static final int USER_INITIATED_FIELD_NUMBER = 3;
    private int triggerCase_ = 0;
    private Object trigger_;

    static {
        bx bxVar = new bx();
        DEFAULT_INSTANCE = bxVar;
        du.registerDefaultInstance(bx.class, bxVar);
    }

    private bx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewUser() {
        if (this.triggerCase_ == 1) {
            this.triggerCase_ = 0;
            this.trigger_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReroute() {
        if (this.triggerCase_ == 2) {
            this.triggerCase_ = 0;
            this.trigger_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrigger() {
        this.triggerCase_ = 0;
        this.trigger_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInitiated() {
        if (this.triggerCase_ == 3) {
            this.triggerCase_ = 0;
            this.trigger_ = null;
        }
    }

    public static bx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewUser(bl blVar) {
        Objects.requireNonNull(blVar);
        if (this.triggerCase_ == 1 && this.trigger_ != bl.getDefaultInstance()) {
            bk bkVarNewBuilder = bl.newBuilder((bl) this.trigger_);
            bkVarNewBuilder.mergeFrom((bk) blVar);
            blVar = bkVarNewBuilder.buildPartial();
        }
        this.trigger_ = blVar;
        this.triggerCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReroute(bt btVar) {
        Objects.requireNonNull(btVar);
        if (this.triggerCase_ == 2 && this.trigger_ != bt.getDefaultInstance()) {
            bm bmVarNewBuilder = bt.newBuilder((bt) this.trigger_);
            bmVarNewBuilder.mergeFrom((bm) btVar);
            btVar = bmVarNewBuilder.buildPartial();
        }
        this.trigger_ = btVar;
        this.triggerCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInitiated(bw bwVar) {
        Objects.requireNonNull(bwVar);
        if (this.triggerCase_ == 3 && this.trigger_ != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder((bw) this.trigger_);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.trigger_ = bwVar;
        this.triggerCase_ = 3;
    }

    public static bj newBuilder() {
        return (bj) DEFAULT_INSTANCE.createBuilder();
    }

    public static bx parseDelimitedFrom(InputStream inputStream) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(com.google.v.v vVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewUser(bl blVar) {
        Objects.requireNonNull(blVar);
        this.trigger_ = blVar;
        this.triggerCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReroute(bt btVar) {
        Objects.requireNonNull(btVar);
        this.trigger_ = btVar;
        this.triggerCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInitiated(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.trigger_ = bwVar;
        this.triggerCase_ = 3;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"trigger_", "triggerCase_", bl.class, bt.class, bw.class});
        }
        if (iOrdinal == 3) {
            return new bx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bl getNewUser() {
        return this.triggerCase_ == 1 ? (bl) this.trigger_ : bl.getDefaultInstance();
    }

    public bt getReroute() {
        return this.triggerCase_ == 2 ? (bt) this.trigger_ : bt.getDefaultInstance();
    }

    public bu getTriggerCase() {
        int i2 = this.triggerCase_;
        if (i2 == 0) {
            return bu.f32781d;
        }
        if (i2 == 1) {
            return bu.f32778a;
        }
        if (i2 == 2) {
            return bu.f32779b;
        }
        if (i2 != 3) {
            return null;
        }
        return bu.f32780c;
    }

    public bw getUserInitiated() {
        return this.triggerCase_ == 3 ? (bw) this.trigger_ : bw.getDefaultInstance();
    }

    public boolean hasNewUser() {
        return this.triggerCase_ == 1;
    }

    public boolean hasReroute() {
        return this.triggerCase_ == 2;
    }

    public boolean hasUserInitiated() {
        return this.triggerCase_ == 3;
    }

    public static bj newBuilder(bx bxVar) {
        return (bj) DEFAULT_INSTANCE.createBuilder(bxVar);
    }

    public static bx parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(com.google.v.v vVar, de deVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bx parseFrom(com.google.v.z zVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bx parseFrom(com.google.v.z zVar, de deVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bx parseFrom(InputStream inputStream) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(InputStream inputStream, de deVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(ByteBuffer byteBuffer) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bx parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bx parseFrom(byte[] bArr) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bx parseFrom(byte[] bArr, de deVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
