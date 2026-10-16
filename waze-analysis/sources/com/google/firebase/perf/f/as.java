package com.google.firebase.perf.f;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class as extends du<as, aq> implements fj {
    private static final as DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile fo<as> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static {
        as asVar = new as();
        DEFAULT_INSTANCE = asVar;
        du.registerDefaultInstance(as.class, asVar);
    }

    private as() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchDestination() {
        this.bitField0_ &= -2;
        this.dispatchDestination_ = 0;
    }

    public static as getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aq newBuilder() {
        return (aq) DEFAULT_INSTANCE.createBuilder();
    }

    public static as parseDelimitedFrom(InputStream inputStream) {
        return (as) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static as parseFrom(com.google.v.v vVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<as> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchDestination(ar arVar) {
        this.dispatchDestination_ = arVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", m.f10460g});
        }
        if (iOrdinal == 3) {
            return new as();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<as> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (as.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ar getDispatchDestination() {
        ar arVarA = ar.a(this.dispatchDestination_);
        return arVarA == null ? ar.SOURCE_UNKNOWN : arVarA;
    }

    public boolean hasDispatchDestination() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aq newBuilder(as asVar) {
        return (aq) DEFAULT_INSTANCE.createBuilder(asVar);
    }

    public static as parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (as) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static as parseFrom(com.google.v.v vVar, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static as parseFrom(com.google.v.z zVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static as parseFrom(com.google.v.z zVar, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static as parseFrom(InputStream inputStream) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static as parseFrom(InputStream inputStream, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static as parseFrom(ByteBuffer byteBuffer) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static as parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static as parseFrom(byte[] bArr) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static as parseFrom(byte[] bArr, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
