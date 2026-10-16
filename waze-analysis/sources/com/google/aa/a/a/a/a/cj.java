package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cj extends du<cj, ch> implements fj {
    private static final cj DEFAULT_INSTANCE;
    public static final int MACHINE_CLASS_FIELD_NUMBER = 1;
    private static volatile fo<cj> PARSER;
    private int bitField0_;
    private int machineClass_;

    static {
        cj cjVar = new cj();
        DEFAULT_INSTANCE = cjVar;
        du.registerDefaultInstance(cj.class, cjVar);
    }

    private cj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMachineClass() {
        this.bitField0_ &= -2;
        this.machineClass_ = 0;
    }

    public static cj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ch newBuilder() {
        return (ch) DEFAULT_INSTANCE.createBuilder();
    }

    public static cj parseDelimitedFrom(InputStream inputStream) {
        return (cj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cj parseFrom(com.google.v.v vVar) {
        return (cj) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMachineClass(ci ciVar) {
        this.machineClass_ = ciVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "machineClass_", i.u});
        }
        if (iOrdinal == 3) {
            return new cj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ch(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ci getMachineClass() {
        ci ciVarA = ci.a(this.machineClass_);
        return ciVarA == null ? ci.MACHINE_CLASS_UNKNOWN : ciVarA;
    }

    public boolean hasMachineClass() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ch newBuilder(cj cjVar) {
        return (ch) DEFAULT_INSTANCE.createBuilder(cjVar);
    }

    public static cj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cj) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cj parseFrom(com.google.v.z zVar) {
        return (cj) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cj) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cj parseFrom(InputStream inputStream) {
        return (cj) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cj) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cj parseFrom(ByteBuffer byteBuffer) {
        return (cj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cj parseFrom(byte[] bArr) {
        return (cj) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cj) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
