package com.google.w.u.a.a.a.a.a;

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
public final class b extends du<b, a> implements fj {
    private static final b DEFAULT_INSTANCE;
    public static final int DISABLE_NIFFLER_FIELD_NUMBER = 2;
    public static final int OFF_HOURS_AUTORAMPING_FIELD_NUMBER = 3;
    private static volatile fo<b> PARSER = null;
    public static final int RAMPDOWN_SAFE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean disableNiffler_;
    private boolean offHoursAutoramping_;
    private boolean rampdownSafe_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableNiffler() {
        this.bitField0_ &= -3;
        this.disableNiffler_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffHoursAutoramping() {
        this.bitField0_ &= -5;
        this.offHoursAutoramping_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRampdownSafe() {
        this.bitField0_ &= -2;
        this.rampdownSafe_ = false;
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableNiffler(boolean z) {
        this.bitField0_ |= 2;
        this.disableNiffler_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffHoursAutoramping(boolean z) {
        this.bitField0_ |= 4;
        this.offHoursAutoramping_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRampdownSafe(boolean z) {
        this.bitField0_ |= 1;
        this.rampdownSafe_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "rampdownSafe_", "disableNiffler_", "offHoursAutoramping_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getDisableNiffler() {
        return this.disableNiffler_;
    }

    public boolean getOffHoursAutoramping() {
        return this.offHoursAutoramping_;
    }

    public boolean getRampdownSafe() {
        return this.rampdownSafe_;
    }

    public boolean hasDisableNiffler() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOffHoursAutoramping() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRampdownSafe() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
