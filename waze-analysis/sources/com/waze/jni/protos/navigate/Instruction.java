package com.waze.jni.protos.navigate;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Instruction extends du<Instruction, Builder> implements InstructionOrBuilder {
    private static final Instruction DEFAULT_INSTANCE;
    private static volatile fo<Instruction> PARSER;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.Instruction$1, reason: invalid class name */
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
    public final class Builder extends dm<Instruction, Builder> implements InstructionOrBuilder {
        private Builder() {
            super(Instruction.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WazeSource */
    public enum Type implements eg {
        NAV_INSTR_NONE(0),
        TURN_LEFT(1),
        TURN_RIGHT(2),
        KEEP_LEFT(3),
        KEEP_RIGHT(4),
        CONTINUE_STRAIGHT(5),
        ROUNDABOUT_ENTER(6),
        ROUNDABOUT_EXIT(7),
        ROUNDABOUT_LEFT(8),
        ROUNDABOUT_EXIT_LEFT(9),
        ROUNDABOUT_STRAIGHT(10),
        ROUNDABOUT_EXIT_STRAIGHT(11),
        ROUNDABOUT_RIGHT(12),
        ROUNDABOUT_EXIT_RIGHT(13),
        ROUNDABOUT_U(14),
        ROUNDABOUT_EXIT_U(15),
        APPROACHING_DESTINATION(16),
        EXIT_LEFT(17),
        EXIT_RIGHT(18),
        WAYPOINT_DELAY(19),
        U_TURN(20),
        LAST_DIRECTION(21),
        SLIGHT_LEFT(22),
        SHARP_LEFT(23),
        SLIGHT_RIGHT(24),
        SHARP_RIGHT(25),
        ENTER_HOV_LANE(26),
        PREPARE_TURN_LEFT(27),
        PREPARE_TURN_RIGHT(28),
        PREPARE_EXIT_LEFT(29),
        PREPARE_EXIT_RIGHT(30),
        APPROACHING_STOP_POINT(31),
        UNRECOGNIZED(-1);

        public static final int APPROACHING_DESTINATION_VALUE = 16;
        public static final int APPROACHING_STOP_POINT_VALUE = 31;
        public static final int CONTINUE_STRAIGHT_VALUE = 5;
        public static final int ENTER_HOV_LANE_VALUE = 26;
        public static final int EXIT_LEFT_VALUE = 17;
        public static final int EXIT_RIGHT_VALUE = 18;
        public static final int KEEP_LEFT_VALUE = 3;
        public static final int KEEP_RIGHT_VALUE = 4;
        public static final int LAST_DIRECTION_VALUE = 21;
        public static final int NAV_INSTR_NONE_VALUE = 0;
        public static final int PREPARE_EXIT_LEFT_VALUE = 29;
        public static final int PREPARE_EXIT_RIGHT_VALUE = 30;
        public static final int PREPARE_TURN_LEFT_VALUE = 27;
        public static final int PREPARE_TURN_RIGHT_VALUE = 28;
        public static final int ROUNDABOUT_ENTER_VALUE = 6;
        public static final int ROUNDABOUT_EXIT_LEFT_VALUE = 9;
        public static final int ROUNDABOUT_EXIT_RIGHT_VALUE = 13;
        public static final int ROUNDABOUT_EXIT_STRAIGHT_VALUE = 11;
        public static final int ROUNDABOUT_EXIT_U_VALUE = 15;
        public static final int ROUNDABOUT_EXIT_VALUE = 7;
        public static final int ROUNDABOUT_LEFT_VALUE = 8;
        public static final int ROUNDABOUT_RIGHT_VALUE = 12;
        public static final int ROUNDABOUT_STRAIGHT_VALUE = 10;
        public static final int ROUNDABOUT_U_VALUE = 14;
        public static final int SHARP_LEFT_VALUE = 23;
        public static final int SHARP_RIGHT_VALUE = 25;
        public static final int SLIGHT_LEFT_VALUE = 22;
        public static final int SLIGHT_RIGHT_VALUE = 24;
        public static final int TURN_LEFT_VALUE = 1;
        public static final int TURN_RIGHT_VALUE = 2;
        public static final int U_TURN_VALUE = 20;
        public static final int WAYPOINT_DELAY_VALUE = 19;
        private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.navigate.Instruction.Type.1
            @Override // com.google.v.eh
            public Type findValueByNumber(int i2) {
                return Type.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class TypeVerifier implements ei {
            static final ei INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Type.forNumber(i2) != null;
            }
        }

        Type(int i2) {
            this.value = i2;
        }

        public static Type forNumber(int i2) {
            switch (i2) {
                case 0:
                    return NAV_INSTR_NONE;
                case 1:
                    return TURN_LEFT;
                case 2:
                    return TURN_RIGHT;
                case 3:
                    return KEEP_LEFT;
                case 4:
                    return KEEP_RIGHT;
                case 5:
                    return CONTINUE_STRAIGHT;
                case 6:
                    return ROUNDABOUT_ENTER;
                case 7:
                    return ROUNDABOUT_EXIT;
                case 8:
                    return ROUNDABOUT_LEFT;
                case 9:
                    return ROUNDABOUT_EXIT_LEFT;
                case 10:
                    return ROUNDABOUT_STRAIGHT;
                case 11:
                    return ROUNDABOUT_EXIT_STRAIGHT;
                case 12:
                    return ROUNDABOUT_RIGHT;
                case 13:
                    return ROUNDABOUT_EXIT_RIGHT;
                case 14:
                    return ROUNDABOUT_U;
                case 15:
                    return ROUNDABOUT_EXIT_U;
                case 16:
                    return APPROACHING_DESTINATION;
                case 17:
                    return EXIT_LEFT;
                case 18:
                    return EXIT_RIGHT;
                case 19:
                    return WAYPOINT_DELAY;
                case 20:
                    return U_TURN;
                case 21:
                    return LAST_DIRECTION;
                case 22:
                    return SLIGHT_LEFT;
                case 23:
                    return SHARP_LEFT;
                case 24:
                    return SLIGHT_RIGHT;
                case 25:
                    return SHARP_RIGHT;
                case 26:
                    return ENTER_HOV_LANE;
                case 27:
                    return PREPARE_TURN_LEFT;
                case 28:
                    return PREPARE_TURN_RIGHT;
                case 29:
                    return PREPARE_EXIT_LEFT;
                case 30:
                    return PREPARE_EXIT_RIGHT;
                case 31:
                    return APPROACHING_STOP_POINT;
                default:
                    return null;
            }
        }

        public static eh<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return TypeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    static {
        Instruction instruction = new Instruction();
        DEFAULT_INSTANCE = instruction;
        du.registerDefaultInstance(Instruction.class, instruction);
    }

    private Instruction() {
    }

    public static Instruction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Instruction parseDelimitedFrom(InputStream inputStream) {
        return (Instruction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Instruction parseFrom(v vVar) {
        return (Instruction) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Instruction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new Instruction();
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
        fo<Instruction> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Instruction.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static Builder newBuilder(Instruction instruction) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(instruction);
    }

    public static Instruction parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Instruction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Instruction parseFrom(v vVar, de deVar) {
        return (Instruction) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Instruction parseFrom(z zVar) {
        return (Instruction) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Instruction parseFrom(z zVar, de deVar) {
        return (Instruction) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Instruction parseFrom(InputStream inputStream) {
        return (Instruction) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Instruction parseFrom(InputStream inputStream, de deVar) {
        return (Instruction) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Instruction parseFrom(ByteBuffer byteBuffer) {
        return (Instruction) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Instruction parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Instruction) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Instruction parseFrom(byte[] bArr) {
        return (Instruction) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Instruction parseFrom(byte[] bArr, de deVar) {
        return (Instruction) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
