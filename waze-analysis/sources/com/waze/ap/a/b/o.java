package com.waze.ap.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o extends du<o, m> implements fj {
    private static final o DEFAULT_INSTANCE;
    private static volatile fo<o> PARSER = null;
    public static final int PLAYER_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private i player_;
    private int type_;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayer() {
        this.player_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static o getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayer(i iVar) {
        Objects.requireNonNull(iVar);
        i iVar2 = this.player_;
        if (iVar2 != null && iVar2 != i.getDefaultInstance()) {
            h hVarNewBuilder = i.newBuilder(iVar2);
            hVarNewBuilder.mergeFrom((h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.player_ = iVar;
        this.bitField0_ |= 1;
    }

    public static m newBuilder() {
        return (m) DEFAULT_INSTANCE.createBuilder();
    }

    public static o parseDelimitedFrom(InputStream inputStream) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(com.google.v.v vVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<o> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayer(i iVar) {
        Objects.requireNonNull(iVar);
        this.player_ = iVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(n nVar) {
        this.type_ = nVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "player_", "type_"});
        }
        if (iOrdinal == 3) {
            return new o();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new m(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<o> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (o.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i getPlayer() {
        i iVar = this.player_;
        return iVar == null ? i.getDefaultInstance() : iVar;
    }

    public n getType() {
        int i2 = this.type_;
        n nVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : n.RED_CARD : n.YELLOW_CARD : n.UNKNOWN;
        return nVar == null ? n.UNRECOGNIZED : nVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasPlayer() {
        return (this.bitField0_ & 1) != 0;
    }

    public static m newBuilder(o oVar) {
        return (m) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(com.google.v.v vVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(z zVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(z zVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static o parseFrom(InputStream inputStream) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static o parseFrom(byte[] bArr) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
