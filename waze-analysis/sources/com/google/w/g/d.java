package com.google.w.g;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends du<d, b> implements e {
    private static final d DEFAULT_INSTANCE;
    public static final int MAX_CURRENT_AMPS_FIELD_NUMBER = 4;
    public static final int MAX_POWER_KW_FIELD_NUMBER = 3;
    public static final int MAX_VOLTAGE_VOLTS_FIELD_NUMBER = 5;
    private static volatile fo<d> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private double maxCurrentAmps_;
    private double maxPowerKw_;
    private double maxVoltageVolts_;
    private int type_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxCurrentAmps() {
        this.bitField0_ &= -5;
        this.maxCurrentAmps_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxPowerKw() {
        this.bitField0_ &= -3;
        this.maxPowerKw_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxVoltageVolts() {
        this.bitField0_ &= -9;
        this.maxVoltageVolts_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxCurrentAmps(double d2) {
        this.bitField0_ |= 4;
        this.maxCurrentAmps_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxPowerKw(double d2) {
        this.bitField0_ |= 2;
        this.maxPowerKw_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxVoltageVolts(double d2) {
        this.bitField0_ |= 8;
        this.maxVoltageVolts_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(c cVar) {
        this.type_ = cVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.bitField0_ |= 1;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဌ\u0000\u0003က\u0001\u0004က\u0002\u0005က\u0003", new Object[]{"bitField0_", "type_", "maxPowerKw_", "maxCurrentAmps_", "maxVoltageVolts_"});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new b(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getMaxCurrentAmps() {
        return this.maxCurrentAmps_;
    }

    public double getMaxPowerKw() {
        return this.maxPowerKw_;
    }

    public double getMaxVoltageVolts() {
        return this.maxVoltageVolts_;
    }

    public c getType() {
        c cVar;
        int i2 = this.type_;
        if (i2 == 0) {
            cVar = c.CONNECTOR_TYPE_UNSPECIFIED;
        } else if (i2 == 2) {
            cVar = c.J_1772;
        } else if (i2 == 3) {
            cVar = c.MENNEKES;
        } else if (i2 == 4) {
            cVar = c.CHADEMO;
        } else if (i2 == 5) {
            cVar = c.CCS_COMBO_1;
        } else if (i2 != 6) {
            switch (i2) {
                case 10:
                    cVar = c.GB_T;
                    break;
                case 11:
                    cVar = c.WALL_OUTLET;
                    break;
                case 12:
                    cVar = c.LECCS;
                    break;
                case 13:
                    cVar = c.TYPE_6;
                    break;
                case 14:
                    cVar = c.NACS;
                    break;
                case 15:
                    cVar = c.TYPE_3C;
                    break;
                case 16:
                    cVar = c.TYPE_3A;
                    break;
                case 17:
                    cVar = c.IEC_60309_1_PHASE;
                    break;
                case 18:
                    cVar = c.IEC_60309_3_PHASE;
                    break;
                default:
                    cVar = null;
                    break;
            }
        } else {
            cVar = c.CCS_COMBO_2;
        }
        return cVar == null ? c.UNRECOGNIZED : cVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasMaxCurrentAmps() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMaxPowerKw() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMaxVoltageVolts() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(d dVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
