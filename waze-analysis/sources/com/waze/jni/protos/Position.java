package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
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
/* loaded from: classes6.dex */
public final class Position {

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.Position$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public interface IntAreaOrBuilder extends fj {
        int getEast();

        int getNorth();

        int getSouth();

        int getWest();
    }

    /* compiled from: WazeSource */
    public interface IntPositionOrBuilder extends fj {
        int getAltitude();

        int getLatitude();

        int getLongitude();

        boolean hasAltitude();
    }

    private Position() {
    }

    public static void registerAllExtensions(de deVar) {
    }

    /* compiled from: WazeSource */
    public final class IntArea extends du<IntArea, Builder> implements IntAreaOrBuilder {
        private static final IntArea DEFAULT_INSTANCE;
        public static final int EAST_FIELD_NUMBER = 3;
        public static final int NORTH_FIELD_NUMBER = 1;
        private static volatile fo<IntArea> PARSER = null;
        public static final int SOUTH_FIELD_NUMBER = 2;
        public static final int WEST_FIELD_NUMBER = 4;
        private int east_;
        private int north_;
        private int south_;
        private int west_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<IntArea, Builder> implements IntAreaOrBuilder {
            private Builder() {
                super(IntArea.DEFAULT_INSTANCE);
            }

            public Builder clearEast() {
                copyOnWrite();
                ((IntArea) this.instance).clearEast();
                return this;
            }

            public Builder clearNorth() {
                copyOnWrite();
                ((IntArea) this.instance).clearNorth();
                return this;
            }

            public Builder clearSouth() {
                copyOnWrite();
                ((IntArea) this.instance).clearSouth();
                return this;
            }

            public Builder clearWest() {
                copyOnWrite();
                ((IntArea) this.instance).clearWest();
                return this;
            }

            @Override // com.waze.jni.protos.Position.IntAreaOrBuilder
            public int getEast() {
                return ((IntArea) this.instance).getEast();
            }

            @Override // com.waze.jni.protos.Position.IntAreaOrBuilder
            public int getNorth() {
                return ((IntArea) this.instance).getNorth();
            }

            @Override // com.waze.jni.protos.Position.IntAreaOrBuilder
            public int getSouth() {
                return ((IntArea) this.instance).getSouth();
            }

            @Override // com.waze.jni.protos.Position.IntAreaOrBuilder
            public int getWest() {
                return ((IntArea) this.instance).getWest();
            }

            public Builder setEast(int i2) {
                copyOnWrite();
                ((IntArea) this.instance).setEast(i2);
                return this;
            }

            public Builder setNorth(int i2) {
                copyOnWrite();
                ((IntArea) this.instance).setNorth(i2);
                return this;
            }

            public Builder setSouth(int i2) {
                copyOnWrite();
                ((IntArea) this.instance).setSouth(i2);
                return this;
            }

            public Builder setWest(int i2) {
                copyOnWrite();
                ((IntArea) this.instance).setWest(i2);
                return this;
            }
        }

        static {
            IntArea intArea = new IntArea();
            DEFAULT_INSTANCE = intArea;
            du.registerDefaultInstance(IntArea.class, intArea);
        }

        private IntArea() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEast() {
            this.east_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNorth() {
            this.north_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSouth() {
            this.south_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWest() {
            this.west_ = 0;
        }

        public static IntArea getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IntArea parseDelimitedFrom(InputStream inputStream) {
            return (IntArea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntArea parseFrom(v vVar) {
            return (IntArea) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<IntArea> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEast(int i2) {
            this.east_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNorth(int i2) {
            this.north_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSouth(int i2) {
            this.south_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWest(int i2) {
            this.west_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"north_", "south_", "east_", "west_"});
            }
            if (iOrdinal == 3) {
                return new IntArea();
            }
            if (iOrdinal == 4) {
                return new Builder();
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            fo<IntArea> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (IntArea.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.Position.IntAreaOrBuilder
        public int getEast() {
            return this.east_;
        }

        @Override // com.waze.jni.protos.Position.IntAreaOrBuilder
        public int getNorth() {
            return this.north_;
        }

        @Override // com.waze.jni.protos.Position.IntAreaOrBuilder
        public int getSouth() {
            return this.south_;
        }

        @Override // com.waze.jni.protos.Position.IntAreaOrBuilder
        public int getWest() {
            return this.west_;
        }

        public static Builder newBuilder(IntArea intArea) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(intArea);
        }

        public static IntArea parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (IntArea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static IntArea parseFrom(v vVar, de deVar) {
            return (IntArea) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static IntArea parseFrom(z zVar) {
            return (IntArea) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static IntArea parseFrom(z zVar, de deVar) {
            return (IntArea) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static IntArea parseFrom(InputStream inputStream) {
            return (IntArea) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntArea parseFrom(InputStream inputStream, de deVar) {
            return (IntArea) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static IntArea parseFrom(ByteBuffer byteBuffer) {
            return (IntArea) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static IntArea parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (IntArea) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static IntArea parseFrom(byte[] bArr) {
            return (IntArea) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IntArea parseFrom(byte[] bArr, de deVar) {
            return (IntArea) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class IntPosition extends du<IntPosition, Builder> implements IntPositionOrBuilder {
        public static final int ALTITUDE_FIELD_NUMBER = 3;
        private static final IntPosition DEFAULT_INSTANCE;
        public static final int LATITUDE_FIELD_NUMBER = 1;
        public static final int LONGITUDE_FIELD_NUMBER = 2;
        private static volatile fo<IntPosition> PARSER;
        private int altitude_;
        private int bitField0_;
        private int latitude_;
        private int longitude_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<IntPosition, Builder> implements IntPositionOrBuilder {
            private Builder() {
                super(IntPosition.DEFAULT_INSTANCE);
            }

            public Builder clearAltitude() {
                copyOnWrite();
                ((IntPosition) this.instance).clearAltitude();
                return this;
            }

            public Builder clearLatitude() {
                copyOnWrite();
                ((IntPosition) this.instance).clearLatitude();
                return this;
            }

            public Builder clearLongitude() {
                copyOnWrite();
                ((IntPosition) this.instance).clearLongitude();
                return this;
            }

            @Override // com.waze.jni.protos.Position.IntPositionOrBuilder
            public int getAltitude() {
                return ((IntPosition) this.instance).getAltitude();
            }

            @Override // com.waze.jni.protos.Position.IntPositionOrBuilder
            public int getLatitude() {
                return ((IntPosition) this.instance).getLatitude();
            }

            @Override // com.waze.jni.protos.Position.IntPositionOrBuilder
            public int getLongitude() {
                return ((IntPosition) this.instance).getLongitude();
            }

            @Override // com.waze.jni.protos.Position.IntPositionOrBuilder
            public boolean hasAltitude() {
                return ((IntPosition) this.instance).hasAltitude();
            }

            public Builder setAltitude(int i2) {
                copyOnWrite();
                ((IntPosition) this.instance).setAltitude(i2);
                return this;
            }

            public Builder setLatitude(int i2) {
                copyOnWrite();
                ((IntPosition) this.instance).setLatitude(i2);
                return this;
            }

            public Builder setLongitude(int i2) {
                copyOnWrite();
                ((IntPosition) this.instance).setLongitude(i2);
                return this;
            }
        }

        static {
            IntPosition intPosition = new IntPosition();
            DEFAULT_INSTANCE = intPosition;
            du.registerDefaultInstance(IntPosition.class, intPosition);
        }

        private IntPosition() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAltitude() {
            this.bitField0_ &= -2;
            this.altitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLatitude() {
            this.latitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongitude() {
            this.longitude_ = 0;
        }

        public static IntPosition getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IntPosition parseDelimitedFrom(InputStream inputStream) {
            return (IntPosition) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntPosition parseFrom(v vVar) {
            return (IntPosition) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<IntPosition> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAltitude(int i2) {
            this.bitField0_ |= 1;
            this.altitude_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLatitude(int i2) {
            this.latitude_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongitude(int i2) {
            this.longitude_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003င\u0000", new Object[]{"bitField0_", "latitude_", "longitude_", "altitude_"});
            }
            if (iOrdinal == 3) {
                return new IntPosition();
            }
            if (iOrdinal == 4) {
                return new Builder();
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            fo<IntPosition> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (IntPosition.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.Position.IntPositionOrBuilder
        public int getAltitude() {
            return this.altitude_;
        }

        @Override // com.waze.jni.protos.Position.IntPositionOrBuilder
        public int getLatitude() {
            return this.latitude_;
        }

        @Override // com.waze.jni.protos.Position.IntPositionOrBuilder
        public int getLongitude() {
            return this.longitude_;
        }

        @Override // com.waze.jni.protos.Position.IntPositionOrBuilder
        public boolean hasAltitude() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IntPosition intPosition) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(intPosition);
        }

        public static IntPosition parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (IntPosition) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static IntPosition parseFrom(v vVar, de deVar) {
            return (IntPosition) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static IntPosition parseFrom(z zVar) {
            return (IntPosition) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static IntPosition parseFrom(z zVar, de deVar) {
            return (IntPosition) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static IntPosition parseFrom(InputStream inputStream) {
            return (IntPosition) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntPosition parseFrom(InputStream inputStream, de deVar) {
            return (IntPosition) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static IntPosition parseFrom(ByteBuffer byteBuffer) {
            return (IntPosition) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static IntPosition parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (IntPosition) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static IntPosition parseFrom(byte[] bArr) {
            return (IntPosition) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IntPosition parseFrom(byte[] bArr, de deVar) {
            return (IntPosition) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }
}
