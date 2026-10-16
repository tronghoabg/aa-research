package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahgu extends ahoq implements ahph {
    public static ahpi<ahgu> PARSER = new ahgq();
    private static final ahgu defaultInstance;
    private ahgx annotation_;
    private int arrayDimensionCount_;
    private List<ahgu> arrayElement_;
    private int bitField0_;
    private int classId_;
    private double doubleValue_;
    private int enumValueId_;
    private int flags_;
    private float floatValue_;
    private long intValue_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int stringValue_;
    private ahgt type_;
    private final ahoa unknownFields;

    static {
        ahgu ahguVar = new ahgu(true);
        defaultInstance = ahguVar;
        ahguVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private ahgu(ahoc ahocVar, ahog ahogVar) throws ahou {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        ahnz ahnzVarNewOutput = ahoa.newOutput();
        ahoe ahoeVarNewInstance = ahoe.newInstance(ahnzVarNewOutput, 1);
        boolean z = false;
        char c = 0;
        while (true) {
            ?? unknownField = 256;
            try {
                if (z) {
                    if ((c & 256) == 256) {
                        this.arrayElement_ = DesugarCollections.unmodifiableList(this.arrayElement_);
                    }
                    try {
                        ahoeVarNewInstance.flush();
                    } catch (IOException unused) {
                    }
                    return;
                }
                try {
                    try {
                        int tag = ahocVar.readTag();
                        switch (tag) {
                            case 0:
                                z = true;
                            case 8:
                                int i = ahocVar.readEnum();
                                ahgt ahgtVarValueOf = ahgt.valueOf(i);
                                if (ahgtVarValueOf == null) {
                                    ahoeVarNewInstance.writeRawVarint32(tag);
                                    ahoeVarNewInstance.writeRawVarint32(i);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.type_ = ahgtVarValueOf;
                                }
                            case 16:
                                this.bitField0_ |= 2;
                                this.intValue_ = ahocVar.readSInt64();
                            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                this.bitField0_ |= 4;
                                this.floatValue_ = ahocVar.readFloat();
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                this.bitField0_ |= 8;
                                this.doubleValue_ = ahocVar.readDouble();
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                this.bitField0_ |= 16;
                                this.stringValue_ = ahocVar.readInt32();
                            case 48:
                                this.bitField0_ |= 32;
                                this.classId_ = ahocVar.readInt32();
                            case 56:
                                this.bitField0_ |= 64;
                                this.enumValueId_ = ahocVar.readInt32();
                            case 66:
                                ahgw builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                ahgx ahgxVar = (ahgx) ahocVar.readMessage(ahgx.PARSER, ahogVar);
                                this.annotation_ = ahgxVar;
                                if (builder != null) {
                                    builder.mergeFrom(ahgxVar);
                                    this.annotation_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 128;
                            case 74:
                                if ((c & 256) != 256) {
                                    this.arrayElement_ = new ArrayList();
                                    c = 256;
                                }
                                this.arrayElement_.add(ahocVar.readMessage(PARSER, ahogVar));
                            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                this.bitField0_ |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                                this.flags_ = ahocVar.readInt32();
                            case 88:
                                this.bitField0_ |= 256;
                                this.arrayDimensionCount_ = ahocVar.readInt32();
                            default:
                                unknownField = parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag);
                                if (unknownField == 0) {
                                    z = true;
                                }
                        }
                    } catch (Throwable th) {
                        if ((c & 256) == unknownField) {
                            this.arrayElement_ = DesugarCollections.unmodifiableList(this.arrayElement_);
                        }
                        try {
                            ahoeVarNewInstance.flush();
                        } catch (IOException unused2) {
                        }
                        throw th;
                    }
                } catch (ahou e) {
                    e.setUnfinishedMessage(this);
                    throw e;
                } catch (IOException e2) {
                    ahou ahouVar = new ahou(e2.getMessage());
                    ahouVar.setUnfinishedMessage(this);
                    throw ahouVar;
                }
            } finally {
                this.unknownFields = ahnzVarNewOutput.toByteString();
            }
        }
    }

    public static ahgu getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.type_ = ahgt.BYTE;
        this.intValue_ = 0L;
        this.floatValue_ = BitmapDescriptorFactory.HUE_RED;
        this.doubleValue_ = 0.0d;
        this.stringValue_ = 0;
        this.classId_ = 0;
        this.enumValueId_ = 0;
        this.annotation_ = ahgx.getDefaultInstance();
        this.arrayElement_ = Collections.EMPTY_LIST;
        this.arrayDimensionCount_ = 0;
        this.flags_ = 0;
    }

    public static ahgr newBuilder(ahgu ahguVar) {
        ahgr ahgrVarNewBuilder = newBuilder();
        ahgrVarNewBuilder.mergeFrom(ahguVar);
        return ahgrVarNewBuilder;
    }

    public ahgx getAnnotation() {
        return this.annotation_;
    }

    public int getArrayDimensionCount() {
        return this.arrayDimensionCount_;
    }

    public ahgu getArrayElement(int i) {
        return this.arrayElement_.get(i);
    }

    public int getArrayElementCount() {
        return this.arrayElement_.size();
    }

    public List<ahgu> getArrayElementList() {
        return this.arrayElement_;
    }

    public int getClassId() {
        return this.classId_;
    }

    public double getDoubleValue() {
        return this.doubleValue_;
    }

    public int getEnumValueId() {
        return this.enumValueId_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public float getFloatValue() {
        return this.floatValue_;
    }

    public long getIntValue() {
        return this.intValue_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahgu> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? ahoe.computeEnumSize(1, this.type_.getNumber()) : 0;
        int i2 = this.bitField0_;
        if ((i2 & 2) == 2) {
            iComputeEnumSize += ahoe.computeSInt64Size(2, this.intValue_);
        }
        if ((i2 & 4) == 4) {
            iComputeEnumSize += ahoe.computeFloatSize(3, this.floatValue_);
        }
        if ((i2 & 8) == 8) {
            iComputeEnumSize += ahoe.computeDoubleSize(4, this.doubleValue_);
        }
        if ((i2 & 16) == 16) {
            iComputeEnumSize += ahoe.computeInt32Size(5, this.stringValue_);
        }
        if ((i2 & 32) == 32) {
            iComputeEnumSize += ahoe.computeInt32Size(6, this.classId_);
        }
        if ((i2 & 64) == 64) {
            iComputeEnumSize += ahoe.computeInt32Size(7, this.enumValueId_);
        }
        if ((i2 & 128) == 128) {
            iComputeEnumSize += ahoe.computeMessageSize(8, this.annotation_);
        }
        for (int i3 = 0; i3 < this.arrayElement_.size(); i3++) {
            iComputeEnumSize += ahoe.computeMessageSize(9, this.arrayElement_.get(i3));
        }
        int i4 = this.bitField0_;
        if ((i4 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            iComputeEnumSize += ahoe.computeInt32Size(10, this.flags_);
        }
        if ((i4 & 256) == 256) {
            iComputeEnumSize += ahoe.computeInt32Size(11, this.arrayDimensionCount_);
        }
        int size = iComputeEnumSize + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getStringValue() {
        return this.stringValue_;
    }

    public ahgt getType() {
        return this.type_;
    }

    public boolean hasAnnotation() {
        return (this.bitField0_ & 128) == 128;
    }

    public boolean hasArrayDimensionCount() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasClassId() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasDoubleValue() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasEnumValueId() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512;
    }

    public boolean hasFloatValue() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasIntValue() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasStringValue() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) == 1;
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // defpackage.ahph
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        ?? r1 = 1;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (hasAnnotation() && !getAnnotation().isInitialized()) {
            r1 = 0;
            break;
        }
        for (int i = 0; i < getArrayElementCount(); i++) {
            if (!getArrayElement(i).isInitialized()) {
                r1 = 0;
                break;
            }
        }
        this.memoizedIsInitialized = r1;
        return r1;
    }

    @Override // defpackage.ahpg
    public ahgr newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahgr toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeEnum(1, this.type_.getNumber());
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeSInt64(2, this.intValue_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeFloat(3, this.floatValue_);
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeDouble(4, this.doubleValue_);
        }
        if ((this.bitField0_ & 16) == 16) {
            ahoeVar.writeInt32(5, this.stringValue_);
        }
        if ((this.bitField0_ & 32) == 32) {
            ahoeVar.writeInt32(6, this.classId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            ahoeVar.writeInt32(7, this.enumValueId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            ahoeVar.writeMessage(8, this.annotation_);
        }
        for (int i = 0; i < this.arrayElement_.size(); i++) {
            ahoeVar.writeMessage(9, this.arrayElement_.get(i));
        }
        if ((this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            ahoeVar.writeInt32(10, this.flags_);
        }
        if ((this.bitField0_ & 256) == 256) {
            ahoeVar.writeInt32(11, this.arrayDimensionCount_);
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahgu getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahgr newBuilder() {
        return ahgr.create();
    }

    public /* synthetic */ ahgu(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahgu(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    public /* synthetic */ ahgu(ahok ahokVar, ahgm ahgmVar) {
        this(ahokVar);
    }

    private ahgu(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
