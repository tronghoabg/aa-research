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
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationInstruction extends du<NavigationInstruction, Builder> implements NavigationInstructionOrBuilder {
    public static final int APPROACHING_DESTINATION_FIELD_NUMBER = 20;
    public static final int CONTINUE_STRAIGHT_FIELD_NUMBER = 5;
    private static final NavigationInstruction DEFAULT_INSTANCE;
    public static final int EXIT_LEFT_FIELD_NUMBER = 16;
    public static final int EXIT_RIGHT_FIELD_NUMBER = 17;
    public static final int KEEP_LEFT_FIELD_NUMBER = 3;
    public static final int KEEP_RIGHT_FIELD_NUMBER = 4;
    private static volatile fo<NavigationInstruction> PARSER = null;
    public static final int ROUNDABOUT_ENTER_FIELD_NUMBER = 6;
    public static final int ROUNDABOUT_EXIT_FIELD_NUMBER = 7;
    public static final int ROUNDABOUT_EXIT_LEFT_FIELD_NUMBER = 9;
    public static final int ROUNDABOUT_EXIT_RIGHT_FIELD_NUMBER = 13;
    public static final int ROUNDABOUT_EXIT_STRAIGHT_FIELD_NUMBER = 11;
    public static final int ROUNDABOUT_EXIT_U_FIELD_NUMBER = 15;
    public static final int ROUNDABOUT_LEFT_FIELD_NUMBER = 8;
    public static final int ROUNDABOUT_RIGHT_FIELD_NUMBER = 12;
    public static final int ROUNDABOUT_STRAIGHT_FIELD_NUMBER = 10;
    public static final int ROUNDABOUT_U_FIELD_NUMBER = 14;
    public static final int TURN_LEFT_FIELD_NUMBER = 1;
    public static final int TURN_RIGHT_FIELD_NUMBER = 2;
    public static final int U_TURN_FIELD_NUMBER = 18;
    public static final int WAYPOINT_DELAY_FIELD_NUMBER = 21;
    private int instructionCase_ = 0;
    private Object instruction_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.NavigationInstruction$1, reason: invalid class name */
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
    public interface ApproachingDestinationOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface ContinueStraightOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface ExitLeftOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface ExitRightOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public enum InstructionCase {
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
        EXIT_LEFT(16),
        EXIT_RIGHT(17),
        U_TURN(18),
        APPROACHING_DESTINATION(20),
        WAYPOINT_DELAY(21),
        INSTRUCTION_NOT_SET(0);

        private final int value;

        InstructionCase(int i2) {
            this.value = i2;
        }

        public static InstructionCase forNumber(int i2) {
            switch (i2) {
                case 0:
                    return INSTRUCTION_NOT_SET;
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
                    return EXIT_LEFT;
                case 17:
                    return EXIT_RIGHT;
                case 18:
                    return U_TURN;
                case 19:
                default:
                    return null;
                case 20:
                    return APPROACHING_DESTINATION;
                case 21:
                    return WAYPOINT_DELAY;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* compiled from: WazeSource */
    public interface KeepLeftOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface KeepRightOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface RoundaboutEnterOrBuilder extends fj {
        int getRoundaboutExitNumber();

        boolean hasRoundaboutExitNumber();
    }

    /* compiled from: WazeSource */
    public interface RoundaboutExitLeftOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface RoundaboutExitOrBuilder extends fj {
        int getRoundaboutExitNumber();

        boolean hasRoundaboutExitNumber();
    }

    /* compiled from: WazeSource */
    public interface RoundaboutExitRightOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface RoundaboutExitStraightOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface RoundaboutExitUOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface RoundaboutLeftOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface RoundaboutRightOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface RoundaboutStraightOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface RoundaboutUOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface TurnLeftOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface TurnRightOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface UTurnOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface WaypointDelayOrBuilder extends fj {
    }

    static {
        NavigationInstruction navigationInstruction = new NavigationInstruction();
        DEFAULT_INSTANCE = navigationInstruction;
        du.registerDefaultInstance(NavigationInstruction.class, navigationInstruction);
    }

    private NavigationInstruction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApproachingDestination() {
        if (this.instructionCase_ == 20) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContinueStraight() {
        if (this.instructionCase_ == 5) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitLeft() {
        if (this.instructionCase_ == 16) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitRight() {
        if (this.instructionCase_ == 17) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstruction() {
        this.instructionCase_ = 0;
        this.instruction_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeepLeft() {
        if (this.instructionCase_ == 3) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeepRight() {
        if (this.instructionCase_ == 4) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundaboutEnter() {
        if (this.instructionCase_ == 6) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundaboutExit() {
        if (this.instructionCase_ == 7) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundaboutExitLeft() {
        if (this.instructionCase_ == 9) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundaboutExitRight() {
        if (this.instructionCase_ == 13) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundaboutExitStraight() {
        if (this.instructionCase_ == 11) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundaboutExitU() {
        if (this.instructionCase_ == 15) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundaboutLeft() {
        if (this.instructionCase_ == 8) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundaboutRight() {
        if (this.instructionCase_ == 12) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundaboutStraight() {
        if (this.instructionCase_ == 10) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundaboutU() {
        if (this.instructionCase_ == 14) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTurnLeft() {
        if (this.instructionCase_ == 1) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTurnRight() {
        if (this.instructionCase_ == 2) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUTurn() {
        if (this.instructionCase_ == 18) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypointDelay() {
        if (this.instructionCase_ == 21) {
            this.instructionCase_ = 0;
            this.instruction_ = null;
        }
    }

    public static NavigationInstruction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApproachingDestination(ApproachingDestination approachingDestination) {
        Objects.requireNonNull(approachingDestination);
        if (this.instructionCase_ == 20 && this.instruction_ != ApproachingDestination.getDefaultInstance()) {
            ApproachingDestination.Builder builderNewBuilder = ApproachingDestination.newBuilder((ApproachingDestination) this.instruction_);
            builderNewBuilder.mergeFrom((ApproachingDestination.Builder) approachingDestination);
            approachingDestination = builderNewBuilder.buildPartial();
        }
        this.instruction_ = approachingDestination;
        this.instructionCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContinueStraight(ContinueStraight continueStraight) {
        Objects.requireNonNull(continueStraight);
        if (this.instructionCase_ == 5 && this.instruction_ != ContinueStraight.getDefaultInstance()) {
            ContinueStraight.Builder builderNewBuilder = ContinueStraight.newBuilder((ContinueStraight) this.instruction_);
            builderNewBuilder.mergeFrom((ContinueStraight.Builder) continueStraight);
            continueStraight = builderNewBuilder.buildPartial();
        }
        this.instruction_ = continueStraight;
        this.instructionCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExitLeft(ExitLeft exitLeft) {
        Objects.requireNonNull(exitLeft);
        if (this.instructionCase_ == 16 && this.instruction_ != ExitLeft.getDefaultInstance()) {
            ExitLeft.Builder builderNewBuilder = ExitLeft.newBuilder((ExitLeft) this.instruction_);
            builderNewBuilder.mergeFrom((ExitLeft.Builder) exitLeft);
            exitLeft = builderNewBuilder.buildPartial();
        }
        this.instruction_ = exitLeft;
        this.instructionCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExitRight(ExitRight exitRight) {
        Objects.requireNonNull(exitRight);
        if (this.instructionCase_ == 17 && this.instruction_ != ExitRight.getDefaultInstance()) {
            ExitRight.Builder builderNewBuilder = ExitRight.newBuilder((ExitRight) this.instruction_);
            builderNewBuilder.mergeFrom((ExitRight.Builder) exitRight);
            exitRight = builderNewBuilder.buildPartial();
        }
        this.instruction_ = exitRight;
        this.instructionCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeepLeft(KeepLeft keepLeft) {
        Objects.requireNonNull(keepLeft);
        if (this.instructionCase_ == 3 && this.instruction_ != KeepLeft.getDefaultInstance()) {
            KeepLeft.Builder builderNewBuilder = KeepLeft.newBuilder((KeepLeft) this.instruction_);
            builderNewBuilder.mergeFrom((KeepLeft.Builder) keepLeft);
            keepLeft = builderNewBuilder.buildPartial();
        }
        this.instruction_ = keepLeft;
        this.instructionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeepRight(KeepRight keepRight) {
        Objects.requireNonNull(keepRight);
        if (this.instructionCase_ == 4 && this.instruction_ != KeepRight.getDefaultInstance()) {
            KeepRight.Builder builderNewBuilder = KeepRight.newBuilder((KeepRight) this.instruction_);
            builderNewBuilder.mergeFrom((KeepRight.Builder) keepRight);
            keepRight = builderNewBuilder.buildPartial();
        }
        this.instruction_ = keepRight;
        this.instructionCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoundaboutEnter(RoundaboutEnter roundaboutEnter) {
        Objects.requireNonNull(roundaboutEnter);
        if (this.instructionCase_ == 6 && this.instruction_ != RoundaboutEnter.getDefaultInstance()) {
            RoundaboutEnter.Builder builderNewBuilder = RoundaboutEnter.newBuilder((RoundaboutEnter) this.instruction_);
            builderNewBuilder.mergeFrom((RoundaboutEnter.Builder) roundaboutEnter);
            roundaboutEnter = builderNewBuilder.buildPartial();
        }
        this.instruction_ = roundaboutEnter;
        this.instructionCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoundaboutExit(RoundaboutExit roundaboutExit) {
        Objects.requireNonNull(roundaboutExit);
        if (this.instructionCase_ == 7 && this.instruction_ != RoundaboutExit.getDefaultInstance()) {
            RoundaboutExit.Builder builderNewBuilder = RoundaboutExit.newBuilder((RoundaboutExit) this.instruction_);
            builderNewBuilder.mergeFrom((RoundaboutExit.Builder) roundaboutExit);
            roundaboutExit = builderNewBuilder.buildPartial();
        }
        this.instruction_ = roundaboutExit;
        this.instructionCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoundaboutExitLeft(RoundaboutExitLeft roundaboutExitLeft) {
        Objects.requireNonNull(roundaboutExitLeft);
        if (this.instructionCase_ == 9 && this.instruction_ != RoundaboutExitLeft.getDefaultInstance()) {
            RoundaboutExitLeft.Builder builderNewBuilder = RoundaboutExitLeft.newBuilder((RoundaboutExitLeft) this.instruction_);
            builderNewBuilder.mergeFrom((RoundaboutExitLeft.Builder) roundaboutExitLeft);
            roundaboutExitLeft = builderNewBuilder.buildPartial();
        }
        this.instruction_ = roundaboutExitLeft;
        this.instructionCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoundaboutExitRight(RoundaboutExitRight roundaboutExitRight) {
        Objects.requireNonNull(roundaboutExitRight);
        if (this.instructionCase_ == 13 && this.instruction_ != RoundaboutExitRight.getDefaultInstance()) {
            RoundaboutExitRight.Builder builderNewBuilder = RoundaboutExitRight.newBuilder((RoundaboutExitRight) this.instruction_);
            builderNewBuilder.mergeFrom((RoundaboutExitRight.Builder) roundaboutExitRight);
            roundaboutExitRight = builderNewBuilder.buildPartial();
        }
        this.instruction_ = roundaboutExitRight;
        this.instructionCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoundaboutExitStraight(RoundaboutExitStraight roundaboutExitStraight) {
        Objects.requireNonNull(roundaboutExitStraight);
        if (this.instructionCase_ == 11 && this.instruction_ != RoundaboutExitStraight.getDefaultInstance()) {
            RoundaboutExitStraight.Builder builderNewBuilder = RoundaboutExitStraight.newBuilder((RoundaboutExitStraight) this.instruction_);
            builderNewBuilder.mergeFrom((RoundaboutExitStraight.Builder) roundaboutExitStraight);
            roundaboutExitStraight = builderNewBuilder.buildPartial();
        }
        this.instruction_ = roundaboutExitStraight;
        this.instructionCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoundaboutExitU(RoundaboutExitU roundaboutExitU) {
        Objects.requireNonNull(roundaboutExitU);
        if (this.instructionCase_ == 15 && this.instruction_ != RoundaboutExitU.getDefaultInstance()) {
            RoundaboutExitU.Builder builderNewBuilder = RoundaboutExitU.newBuilder((RoundaboutExitU) this.instruction_);
            builderNewBuilder.mergeFrom((RoundaboutExitU.Builder) roundaboutExitU);
            roundaboutExitU = builderNewBuilder.buildPartial();
        }
        this.instruction_ = roundaboutExitU;
        this.instructionCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoundaboutLeft(RoundaboutLeft roundaboutLeft) {
        Objects.requireNonNull(roundaboutLeft);
        if (this.instructionCase_ == 8 && this.instruction_ != RoundaboutLeft.getDefaultInstance()) {
            RoundaboutLeft.Builder builderNewBuilder = RoundaboutLeft.newBuilder((RoundaboutLeft) this.instruction_);
            builderNewBuilder.mergeFrom((RoundaboutLeft.Builder) roundaboutLeft);
            roundaboutLeft = builderNewBuilder.buildPartial();
        }
        this.instruction_ = roundaboutLeft;
        this.instructionCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoundaboutRight(RoundaboutRight roundaboutRight) {
        Objects.requireNonNull(roundaboutRight);
        if (this.instructionCase_ == 12 && this.instruction_ != RoundaboutRight.getDefaultInstance()) {
            RoundaboutRight.Builder builderNewBuilder = RoundaboutRight.newBuilder((RoundaboutRight) this.instruction_);
            builderNewBuilder.mergeFrom((RoundaboutRight.Builder) roundaboutRight);
            roundaboutRight = builderNewBuilder.buildPartial();
        }
        this.instruction_ = roundaboutRight;
        this.instructionCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoundaboutStraight(RoundaboutStraight roundaboutStraight) {
        Objects.requireNonNull(roundaboutStraight);
        if (this.instructionCase_ == 10 && this.instruction_ != RoundaboutStraight.getDefaultInstance()) {
            RoundaboutStraight.Builder builderNewBuilder = RoundaboutStraight.newBuilder((RoundaboutStraight) this.instruction_);
            builderNewBuilder.mergeFrom((RoundaboutStraight.Builder) roundaboutStraight);
            roundaboutStraight = builderNewBuilder.buildPartial();
        }
        this.instruction_ = roundaboutStraight;
        this.instructionCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoundaboutU(RoundaboutU roundaboutU) {
        Objects.requireNonNull(roundaboutU);
        if (this.instructionCase_ == 14 && this.instruction_ != RoundaboutU.getDefaultInstance()) {
            RoundaboutU.Builder builderNewBuilder = RoundaboutU.newBuilder((RoundaboutU) this.instruction_);
            builderNewBuilder.mergeFrom((RoundaboutU.Builder) roundaboutU);
            roundaboutU = builderNewBuilder.buildPartial();
        }
        this.instruction_ = roundaboutU;
        this.instructionCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTurnLeft(TurnLeft turnLeft) {
        Objects.requireNonNull(turnLeft);
        if (this.instructionCase_ == 1 && this.instruction_ != TurnLeft.getDefaultInstance()) {
            TurnLeft.Builder builderNewBuilder = TurnLeft.newBuilder((TurnLeft) this.instruction_);
            builderNewBuilder.mergeFrom((TurnLeft.Builder) turnLeft);
            turnLeft = builderNewBuilder.buildPartial();
        }
        this.instruction_ = turnLeft;
        this.instructionCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTurnRight(TurnRight turnRight) {
        Objects.requireNonNull(turnRight);
        if (this.instructionCase_ == 2 && this.instruction_ != TurnRight.getDefaultInstance()) {
            TurnRight.Builder builderNewBuilder = TurnRight.newBuilder((TurnRight) this.instruction_);
            builderNewBuilder.mergeFrom((TurnRight.Builder) turnRight);
            turnRight = builderNewBuilder.buildPartial();
        }
        this.instruction_ = turnRight;
        this.instructionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUTurn(UTurn uTurn) {
        Objects.requireNonNull(uTurn);
        if (this.instructionCase_ == 18 && this.instruction_ != UTurn.getDefaultInstance()) {
            UTurn.Builder builderNewBuilder = UTurn.newBuilder((UTurn) this.instruction_);
            builderNewBuilder.mergeFrom((UTurn.Builder) uTurn);
            uTurn = builderNewBuilder.buildPartial();
        }
        this.instruction_ = uTurn;
        this.instructionCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWaypointDelay(WaypointDelay waypointDelay) {
        Objects.requireNonNull(waypointDelay);
        if (this.instructionCase_ == 21 && this.instruction_ != WaypointDelay.getDefaultInstance()) {
            WaypointDelay.Builder builderNewBuilder = WaypointDelay.newBuilder((WaypointDelay) this.instruction_);
            builderNewBuilder.mergeFrom((WaypointDelay.Builder) waypointDelay);
            waypointDelay = builderNewBuilder.buildPartial();
        }
        this.instruction_ = waypointDelay;
        this.instructionCase_ = 21;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationInstruction parseDelimitedFrom(InputStream inputStream) {
        return (NavigationInstruction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationInstruction parseFrom(v vVar) {
        return (NavigationInstruction) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationInstruction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApproachingDestination(ApproachingDestination approachingDestination) {
        Objects.requireNonNull(approachingDestination);
        this.instruction_ = approachingDestination;
        this.instructionCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinueStraight(ContinueStraight continueStraight) {
        Objects.requireNonNull(continueStraight);
        this.instruction_ = continueStraight;
        this.instructionCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitLeft(ExitLeft exitLeft) {
        Objects.requireNonNull(exitLeft);
        this.instruction_ = exitLeft;
        this.instructionCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitRight(ExitRight exitRight) {
        Objects.requireNonNull(exitRight);
        this.instruction_ = exitRight;
        this.instructionCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeepLeft(KeepLeft keepLeft) {
        Objects.requireNonNull(keepLeft);
        this.instruction_ = keepLeft;
        this.instructionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeepRight(KeepRight keepRight) {
        Objects.requireNonNull(keepRight);
        this.instruction_ = keepRight;
        this.instructionCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundaboutEnter(RoundaboutEnter roundaboutEnter) {
        Objects.requireNonNull(roundaboutEnter);
        this.instruction_ = roundaboutEnter;
        this.instructionCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundaboutExit(RoundaboutExit roundaboutExit) {
        Objects.requireNonNull(roundaboutExit);
        this.instruction_ = roundaboutExit;
        this.instructionCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundaboutExitLeft(RoundaboutExitLeft roundaboutExitLeft) {
        Objects.requireNonNull(roundaboutExitLeft);
        this.instruction_ = roundaboutExitLeft;
        this.instructionCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundaboutExitRight(RoundaboutExitRight roundaboutExitRight) {
        Objects.requireNonNull(roundaboutExitRight);
        this.instruction_ = roundaboutExitRight;
        this.instructionCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundaboutExitStraight(RoundaboutExitStraight roundaboutExitStraight) {
        Objects.requireNonNull(roundaboutExitStraight);
        this.instruction_ = roundaboutExitStraight;
        this.instructionCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundaboutExitU(RoundaboutExitU roundaboutExitU) {
        Objects.requireNonNull(roundaboutExitU);
        this.instruction_ = roundaboutExitU;
        this.instructionCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundaboutLeft(RoundaboutLeft roundaboutLeft) {
        Objects.requireNonNull(roundaboutLeft);
        this.instruction_ = roundaboutLeft;
        this.instructionCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundaboutRight(RoundaboutRight roundaboutRight) {
        Objects.requireNonNull(roundaboutRight);
        this.instruction_ = roundaboutRight;
        this.instructionCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundaboutStraight(RoundaboutStraight roundaboutStraight) {
        Objects.requireNonNull(roundaboutStraight);
        this.instruction_ = roundaboutStraight;
        this.instructionCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundaboutU(RoundaboutU roundaboutU) {
        Objects.requireNonNull(roundaboutU);
        this.instruction_ = roundaboutU;
        this.instructionCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnLeft(TurnLeft turnLeft) {
        Objects.requireNonNull(turnLeft);
        this.instruction_ = turnLeft;
        this.instructionCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnRight(TurnRight turnRight) {
        Objects.requireNonNull(turnRight);
        this.instruction_ = turnRight;
        this.instructionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUTurn(UTurn uTurn) {
        Objects.requireNonNull(uTurn);
        this.instruction_ = uTurn;
        this.instructionCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypointDelay(WaypointDelay waypointDelay) {
        Objects.requireNonNull(waypointDelay);
        this.instruction_ = waypointDelay;
        this.instructionCase_ = 21;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0000\u0001\u0015\u0014\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0014<\u0000\u0015<\u0000", new Object[]{"instruction_", "instructionCase_", TurnLeft.class, TurnRight.class, KeepLeft.class, KeepRight.class, ContinueStraight.class, RoundaboutEnter.class, RoundaboutExit.class, RoundaboutLeft.class, RoundaboutExitLeft.class, RoundaboutStraight.class, RoundaboutExitStraight.class, RoundaboutRight.class, RoundaboutExitRight.class, RoundaboutU.class, RoundaboutExitU.class, ExitLeft.class, ExitRight.class, UTurn.class, ApproachingDestination.class, WaypointDelay.class});
        }
        if (iOrdinal == 3) {
            return new NavigationInstruction();
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
        fo<NavigationInstruction> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationInstruction.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public ApproachingDestination getApproachingDestination() {
        return this.instructionCase_ == 20 ? (ApproachingDestination) this.instruction_ : ApproachingDestination.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public ContinueStraight getContinueStraight() {
        return this.instructionCase_ == 5 ? (ContinueStraight) this.instruction_ : ContinueStraight.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public ExitLeft getExitLeft() {
        return this.instructionCase_ == 16 ? (ExitLeft) this.instruction_ : ExitLeft.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public ExitRight getExitRight() {
        return this.instructionCase_ == 17 ? (ExitRight) this.instruction_ : ExitRight.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public InstructionCase getInstructionCase() {
        return InstructionCase.forNumber(this.instructionCase_);
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public KeepLeft getKeepLeft() {
        return this.instructionCase_ == 3 ? (KeepLeft) this.instruction_ : KeepLeft.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public KeepRight getKeepRight() {
        return this.instructionCase_ == 4 ? (KeepRight) this.instruction_ : KeepRight.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public RoundaboutEnter getRoundaboutEnter() {
        return this.instructionCase_ == 6 ? (RoundaboutEnter) this.instruction_ : RoundaboutEnter.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public RoundaboutExit getRoundaboutExit() {
        return this.instructionCase_ == 7 ? (RoundaboutExit) this.instruction_ : RoundaboutExit.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public RoundaboutExitLeft getRoundaboutExitLeft() {
        return this.instructionCase_ == 9 ? (RoundaboutExitLeft) this.instruction_ : RoundaboutExitLeft.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public RoundaboutExitRight getRoundaboutExitRight() {
        return this.instructionCase_ == 13 ? (RoundaboutExitRight) this.instruction_ : RoundaboutExitRight.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public RoundaboutExitStraight getRoundaboutExitStraight() {
        return this.instructionCase_ == 11 ? (RoundaboutExitStraight) this.instruction_ : RoundaboutExitStraight.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public RoundaboutExitU getRoundaboutExitU() {
        return this.instructionCase_ == 15 ? (RoundaboutExitU) this.instruction_ : RoundaboutExitU.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public RoundaboutLeft getRoundaboutLeft() {
        return this.instructionCase_ == 8 ? (RoundaboutLeft) this.instruction_ : RoundaboutLeft.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public RoundaboutRight getRoundaboutRight() {
        return this.instructionCase_ == 12 ? (RoundaboutRight) this.instruction_ : RoundaboutRight.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public RoundaboutStraight getRoundaboutStraight() {
        return this.instructionCase_ == 10 ? (RoundaboutStraight) this.instruction_ : RoundaboutStraight.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public RoundaboutU getRoundaboutU() {
        return this.instructionCase_ == 14 ? (RoundaboutU) this.instruction_ : RoundaboutU.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public TurnLeft getTurnLeft() {
        return this.instructionCase_ == 1 ? (TurnLeft) this.instruction_ : TurnLeft.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public TurnRight getTurnRight() {
        return this.instructionCase_ == 2 ? (TurnRight) this.instruction_ : TurnRight.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public UTurn getUTurn() {
        return this.instructionCase_ == 18 ? (UTurn) this.instruction_ : UTurn.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public WaypointDelay getWaypointDelay() {
        return this.instructionCase_ == 21 ? (WaypointDelay) this.instruction_ : WaypointDelay.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasApproachingDestination() {
        return this.instructionCase_ == 20;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasContinueStraight() {
        return this.instructionCase_ == 5;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasExitLeft() {
        return this.instructionCase_ == 16;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasExitRight() {
        return this.instructionCase_ == 17;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasKeepLeft() {
        return this.instructionCase_ == 3;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasKeepRight() {
        return this.instructionCase_ == 4;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasRoundaboutEnter() {
        return this.instructionCase_ == 6;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasRoundaboutExit() {
        return this.instructionCase_ == 7;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasRoundaboutExitLeft() {
        return this.instructionCase_ == 9;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasRoundaboutExitRight() {
        return this.instructionCase_ == 13;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasRoundaboutExitStraight() {
        return this.instructionCase_ == 11;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasRoundaboutExitU() {
        return this.instructionCase_ == 15;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasRoundaboutLeft() {
        return this.instructionCase_ == 8;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasRoundaboutRight() {
        return this.instructionCase_ == 12;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasRoundaboutStraight() {
        return this.instructionCase_ == 10;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasRoundaboutU() {
        return this.instructionCase_ == 14;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasTurnLeft() {
        return this.instructionCase_ == 1;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasTurnRight() {
        return this.instructionCase_ == 2;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasUTurn() {
        return this.instructionCase_ == 18;
    }

    @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
    public boolean hasWaypointDelay() {
        return this.instructionCase_ == 21;
    }

    /* compiled from: WazeSource */
    public final class ApproachingDestination extends du<ApproachingDestination, Builder> implements ApproachingDestinationOrBuilder {
        private static final ApproachingDestination DEFAULT_INSTANCE;
        private static volatile fo<ApproachingDestination> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<ApproachingDestination, Builder> implements ApproachingDestinationOrBuilder {
            private Builder() {
                super(ApproachingDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            ApproachingDestination approachingDestination = new ApproachingDestination();
            DEFAULT_INSTANCE = approachingDestination;
            du.registerDefaultInstance(ApproachingDestination.class, approachingDestination);
        }

        private ApproachingDestination() {
        }

        public static ApproachingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ApproachingDestination parseDelimitedFrom(InputStream inputStream) {
            return (ApproachingDestination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ApproachingDestination parseFrom(v vVar) {
            return (ApproachingDestination) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<ApproachingDestination> parser() {
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
                return new ApproachingDestination();
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
            fo<ApproachingDestination> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (ApproachingDestination.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(ApproachingDestination approachingDestination) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(approachingDestination);
        }

        public static ApproachingDestination parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (ApproachingDestination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ApproachingDestination parseFrom(v vVar, de deVar) {
            return (ApproachingDestination) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static ApproachingDestination parseFrom(z zVar) {
            return (ApproachingDestination) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static ApproachingDestination parseFrom(z zVar, de deVar) {
            return (ApproachingDestination) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static ApproachingDestination parseFrom(InputStream inputStream) {
            return (ApproachingDestination) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ApproachingDestination parseFrom(InputStream inputStream, de deVar) {
            return (ApproachingDestination) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ApproachingDestination parseFrom(ByteBuffer byteBuffer) {
            return (ApproachingDestination) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ApproachingDestination parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (ApproachingDestination) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static ApproachingDestination parseFrom(byte[] bArr) {
            return (ApproachingDestination) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ApproachingDestination parseFrom(byte[] bArr, de deVar) {
            return (ApproachingDestination) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class ContinueStraight extends du<ContinueStraight, Builder> implements ContinueStraightOrBuilder {
        private static final ContinueStraight DEFAULT_INSTANCE;
        private static volatile fo<ContinueStraight> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<ContinueStraight, Builder> implements ContinueStraightOrBuilder {
            private Builder() {
                super(ContinueStraight.DEFAULT_INSTANCE);
            }
        }

        static {
            ContinueStraight continueStraight = new ContinueStraight();
            DEFAULT_INSTANCE = continueStraight;
            du.registerDefaultInstance(ContinueStraight.class, continueStraight);
        }

        private ContinueStraight() {
        }

        public static ContinueStraight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ContinueStraight parseDelimitedFrom(InputStream inputStream) {
            return (ContinueStraight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContinueStraight parseFrom(v vVar) {
            return (ContinueStraight) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<ContinueStraight> parser() {
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
                return new ContinueStraight();
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
            fo<ContinueStraight> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (ContinueStraight.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(ContinueStraight continueStraight) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(continueStraight);
        }

        public static ContinueStraight parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (ContinueStraight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ContinueStraight parseFrom(v vVar, de deVar) {
            return (ContinueStraight) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static ContinueStraight parseFrom(z zVar) {
            return (ContinueStraight) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static ContinueStraight parseFrom(z zVar, de deVar) {
            return (ContinueStraight) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static ContinueStraight parseFrom(InputStream inputStream) {
            return (ContinueStraight) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContinueStraight parseFrom(InputStream inputStream, de deVar) {
            return (ContinueStraight) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ContinueStraight parseFrom(ByteBuffer byteBuffer) {
            return (ContinueStraight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ContinueStraight parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (ContinueStraight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static ContinueStraight parseFrom(byte[] bArr) {
            return (ContinueStraight) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContinueStraight parseFrom(byte[] bArr, de deVar) {
            return (ContinueStraight) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class ExitLeft extends du<ExitLeft, Builder> implements ExitLeftOrBuilder {
        private static final ExitLeft DEFAULT_INSTANCE;
        private static volatile fo<ExitLeft> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<ExitLeft, Builder> implements ExitLeftOrBuilder {
            private Builder() {
                super(ExitLeft.DEFAULT_INSTANCE);
            }
        }

        static {
            ExitLeft exitLeft = new ExitLeft();
            DEFAULT_INSTANCE = exitLeft;
            du.registerDefaultInstance(ExitLeft.class, exitLeft);
        }

        private ExitLeft() {
        }

        public static ExitLeft getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ExitLeft parseDelimitedFrom(InputStream inputStream) {
            return (ExitLeft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExitLeft parseFrom(v vVar) {
            return (ExitLeft) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<ExitLeft> parser() {
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
                return new ExitLeft();
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
            fo<ExitLeft> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (ExitLeft.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(ExitLeft exitLeft) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exitLeft);
        }

        public static ExitLeft parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (ExitLeft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ExitLeft parseFrom(v vVar, de deVar) {
            return (ExitLeft) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static ExitLeft parseFrom(z zVar) {
            return (ExitLeft) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static ExitLeft parseFrom(z zVar, de deVar) {
            return (ExitLeft) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static ExitLeft parseFrom(InputStream inputStream) {
            return (ExitLeft) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExitLeft parseFrom(InputStream inputStream, de deVar) {
            return (ExitLeft) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ExitLeft parseFrom(ByteBuffer byteBuffer) {
            return (ExitLeft) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExitLeft parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (ExitLeft) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static ExitLeft parseFrom(byte[] bArr) {
            return (ExitLeft) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExitLeft parseFrom(byte[] bArr, de deVar) {
            return (ExitLeft) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class ExitRight extends du<ExitRight, Builder> implements ExitRightOrBuilder {
        private static final ExitRight DEFAULT_INSTANCE;
        private static volatile fo<ExitRight> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<ExitRight, Builder> implements ExitRightOrBuilder {
            private Builder() {
                super(ExitRight.DEFAULT_INSTANCE);
            }
        }

        static {
            ExitRight exitRight = new ExitRight();
            DEFAULT_INSTANCE = exitRight;
            du.registerDefaultInstance(ExitRight.class, exitRight);
        }

        private ExitRight() {
        }

        public static ExitRight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ExitRight parseDelimitedFrom(InputStream inputStream) {
            return (ExitRight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExitRight parseFrom(v vVar) {
            return (ExitRight) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<ExitRight> parser() {
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
                return new ExitRight();
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
            fo<ExitRight> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (ExitRight.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(ExitRight exitRight) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exitRight);
        }

        public static ExitRight parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (ExitRight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ExitRight parseFrom(v vVar, de deVar) {
            return (ExitRight) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static ExitRight parseFrom(z zVar) {
            return (ExitRight) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static ExitRight parseFrom(z zVar, de deVar) {
            return (ExitRight) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static ExitRight parseFrom(InputStream inputStream) {
            return (ExitRight) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExitRight parseFrom(InputStream inputStream, de deVar) {
            return (ExitRight) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static ExitRight parseFrom(ByteBuffer byteBuffer) {
            return (ExitRight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExitRight parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (ExitRight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static ExitRight parseFrom(byte[] bArr) {
            return (ExitRight) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExitRight parseFrom(byte[] bArr, de deVar) {
            return (ExitRight) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class KeepLeft extends du<KeepLeft, Builder> implements KeepLeftOrBuilder {
        private static final KeepLeft DEFAULT_INSTANCE;
        private static volatile fo<KeepLeft> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<KeepLeft, Builder> implements KeepLeftOrBuilder {
            private Builder() {
                super(KeepLeft.DEFAULT_INSTANCE);
            }
        }

        static {
            KeepLeft keepLeft = new KeepLeft();
            DEFAULT_INSTANCE = keepLeft;
            du.registerDefaultInstance(KeepLeft.class, keepLeft);
        }

        private KeepLeft() {
        }

        public static KeepLeft getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static KeepLeft parseDelimitedFrom(InputStream inputStream) {
            return (KeepLeft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeepLeft parseFrom(v vVar) {
            return (KeepLeft) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<KeepLeft> parser() {
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
                return new KeepLeft();
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
            fo<KeepLeft> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (KeepLeft.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(KeepLeft keepLeft) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(keepLeft);
        }

        public static KeepLeft parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (KeepLeft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static KeepLeft parseFrom(v vVar, de deVar) {
            return (KeepLeft) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static KeepLeft parseFrom(z zVar) {
            return (KeepLeft) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static KeepLeft parseFrom(z zVar, de deVar) {
            return (KeepLeft) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static KeepLeft parseFrom(InputStream inputStream) {
            return (KeepLeft) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeepLeft parseFrom(InputStream inputStream, de deVar) {
            return (KeepLeft) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static KeepLeft parseFrom(ByteBuffer byteBuffer) {
            return (KeepLeft) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static KeepLeft parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (KeepLeft) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static KeepLeft parseFrom(byte[] bArr) {
            return (KeepLeft) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static KeepLeft parseFrom(byte[] bArr, de deVar) {
            return (KeepLeft) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class KeepRight extends du<KeepRight, Builder> implements KeepRightOrBuilder {
        private static final KeepRight DEFAULT_INSTANCE;
        private static volatile fo<KeepRight> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<KeepRight, Builder> implements KeepRightOrBuilder {
            private Builder() {
                super(KeepRight.DEFAULT_INSTANCE);
            }
        }

        static {
            KeepRight keepRight = new KeepRight();
            DEFAULT_INSTANCE = keepRight;
            du.registerDefaultInstance(KeepRight.class, keepRight);
        }

        private KeepRight() {
        }

        public static KeepRight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static KeepRight parseDelimitedFrom(InputStream inputStream) {
            return (KeepRight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeepRight parseFrom(v vVar) {
            return (KeepRight) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<KeepRight> parser() {
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
                return new KeepRight();
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
            fo<KeepRight> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (KeepRight.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(KeepRight keepRight) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(keepRight);
        }

        public static KeepRight parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (KeepRight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static KeepRight parseFrom(v vVar, de deVar) {
            return (KeepRight) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static KeepRight parseFrom(z zVar) {
            return (KeepRight) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static KeepRight parseFrom(z zVar, de deVar) {
            return (KeepRight) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static KeepRight parseFrom(InputStream inputStream) {
            return (KeepRight) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeepRight parseFrom(InputStream inputStream, de deVar) {
            return (KeepRight) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static KeepRight parseFrom(ByteBuffer byteBuffer) {
            return (KeepRight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static KeepRight parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (KeepRight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static KeepRight parseFrom(byte[] bArr) {
            return (KeepRight) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static KeepRight parseFrom(byte[] bArr, de deVar) {
            return (KeepRight) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutEnter extends du<RoundaboutEnter, Builder> implements RoundaboutEnterOrBuilder {
        private static final RoundaboutEnter DEFAULT_INSTANCE;
        private static volatile fo<RoundaboutEnter> PARSER = null;
        public static final int ROUNDABOUT_EXIT_NUMBER_FIELD_NUMBER = 1;
        private int bitField0_;
        private int roundaboutExitNumber_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RoundaboutEnter, Builder> implements RoundaboutEnterOrBuilder {
            private Builder() {
                super(RoundaboutEnter.DEFAULT_INSTANCE);
            }

            public Builder clearRoundaboutExitNumber() {
                copyOnWrite();
                ((RoundaboutEnter) this.instance).clearRoundaboutExitNumber();
                return this;
            }

            @Override // com.waze.jni.protos.NavigationInstruction.RoundaboutEnterOrBuilder
            public int getRoundaboutExitNumber() {
                return ((RoundaboutEnter) this.instance).getRoundaboutExitNumber();
            }

            @Override // com.waze.jni.protos.NavigationInstruction.RoundaboutEnterOrBuilder
            public boolean hasRoundaboutExitNumber() {
                return ((RoundaboutEnter) this.instance).hasRoundaboutExitNumber();
            }

            public Builder setRoundaboutExitNumber(int i2) {
                copyOnWrite();
                ((RoundaboutEnter) this.instance).setRoundaboutExitNumber(i2);
                return this;
            }
        }

        static {
            RoundaboutEnter roundaboutEnter = new RoundaboutEnter();
            DEFAULT_INSTANCE = roundaboutEnter;
            du.registerDefaultInstance(RoundaboutEnter.class, roundaboutEnter);
        }

        private RoundaboutEnter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoundaboutExitNumber() {
            this.bitField0_ &= -2;
            this.roundaboutExitNumber_ = 0;
        }

        public static RoundaboutEnter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoundaboutEnter parseDelimitedFrom(InputStream inputStream) {
            return (RoundaboutEnter) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutEnter parseFrom(v vVar) {
            return (RoundaboutEnter) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RoundaboutEnter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoundaboutExitNumber(int i2) {
            this.bitField0_ |= 1;
            this.roundaboutExitNumber_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "roundaboutExitNumber_"});
            }
            if (iOrdinal == 3) {
                return new RoundaboutEnter();
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
            fo<RoundaboutEnter> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RoundaboutEnter.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.NavigationInstruction.RoundaboutEnterOrBuilder
        public int getRoundaboutExitNumber() {
            return this.roundaboutExitNumber_;
        }

        @Override // com.waze.jni.protos.NavigationInstruction.RoundaboutEnterOrBuilder
        public boolean hasRoundaboutExitNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(RoundaboutEnter roundaboutEnter) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roundaboutEnter);
        }

        public static RoundaboutEnter parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RoundaboutEnter) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutEnter parseFrom(v vVar, de deVar) {
            return (RoundaboutEnter) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RoundaboutEnter parseFrom(z zVar) {
            return (RoundaboutEnter) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RoundaboutEnter parseFrom(z zVar, de deVar) {
            return (RoundaboutEnter) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RoundaboutEnter parseFrom(InputStream inputStream) {
            return (RoundaboutEnter) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutEnter parseFrom(InputStream inputStream, de deVar) {
            return (RoundaboutEnter) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutEnter parseFrom(ByteBuffer byteBuffer) {
            return (RoundaboutEnter) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RoundaboutEnter parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RoundaboutEnter) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RoundaboutEnter parseFrom(byte[] bArr) {
            return (RoundaboutEnter) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoundaboutEnter parseFrom(byte[] bArr, de deVar) {
            return (RoundaboutEnter) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutExit extends du<RoundaboutExit, Builder> implements RoundaboutExitOrBuilder {
        private static final RoundaboutExit DEFAULT_INSTANCE;
        private static volatile fo<RoundaboutExit> PARSER = null;
        public static final int ROUNDABOUT_EXIT_NUMBER_FIELD_NUMBER = 1;
        private int bitField0_;
        private int roundaboutExitNumber_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RoundaboutExit, Builder> implements RoundaboutExitOrBuilder {
            private Builder() {
                super(RoundaboutExit.DEFAULT_INSTANCE);
            }

            public Builder clearRoundaboutExitNumber() {
                copyOnWrite();
                ((RoundaboutExit) this.instance).clearRoundaboutExitNumber();
                return this;
            }

            @Override // com.waze.jni.protos.NavigationInstruction.RoundaboutExitOrBuilder
            public int getRoundaboutExitNumber() {
                return ((RoundaboutExit) this.instance).getRoundaboutExitNumber();
            }

            @Override // com.waze.jni.protos.NavigationInstruction.RoundaboutExitOrBuilder
            public boolean hasRoundaboutExitNumber() {
                return ((RoundaboutExit) this.instance).hasRoundaboutExitNumber();
            }

            public Builder setRoundaboutExitNumber(int i2) {
                copyOnWrite();
                ((RoundaboutExit) this.instance).setRoundaboutExitNumber(i2);
                return this;
            }
        }

        static {
            RoundaboutExit roundaboutExit = new RoundaboutExit();
            DEFAULT_INSTANCE = roundaboutExit;
            du.registerDefaultInstance(RoundaboutExit.class, roundaboutExit);
        }

        private RoundaboutExit() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoundaboutExitNumber() {
            this.bitField0_ &= -2;
            this.roundaboutExitNumber_ = 0;
        }

        public static RoundaboutExit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoundaboutExit parseDelimitedFrom(InputStream inputStream) {
            return (RoundaboutExit) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutExit parseFrom(v vVar) {
            return (RoundaboutExit) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RoundaboutExit> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoundaboutExitNumber(int i2) {
            this.bitField0_ |= 1;
            this.roundaboutExitNumber_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "roundaboutExitNumber_"});
            }
            if (iOrdinal == 3) {
                return new RoundaboutExit();
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
            fo<RoundaboutExit> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RoundaboutExit.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.NavigationInstruction.RoundaboutExitOrBuilder
        public int getRoundaboutExitNumber() {
            return this.roundaboutExitNumber_;
        }

        @Override // com.waze.jni.protos.NavigationInstruction.RoundaboutExitOrBuilder
        public boolean hasRoundaboutExitNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(RoundaboutExit roundaboutExit) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roundaboutExit);
        }

        public static RoundaboutExit parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RoundaboutExit) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutExit parseFrom(v vVar, de deVar) {
            return (RoundaboutExit) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RoundaboutExit parseFrom(z zVar) {
            return (RoundaboutExit) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RoundaboutExit parseFrom(z zVar, de deVar) {
            return (RoundaboutExit) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RoundaboutExit parseFrom(InputStream inputStream) {
            return (RoundaboutExit) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutExit parseFrom(InputStream inputStream, de deVar) {
            return (RoundaboutExit) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutExit parseFrom(ByteBuffer byteBuffer) {
            return (RoundaboutExit) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RoundaboutExit parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RoundaboutExit) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RoundaboutExit parseFrom(byte[] bArr) {
            return (RoundaboutExit) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoundaboutExit parseFrom(byte[] bArr, de deVar) {
            return (RoundaboutExit) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutExitLeft extends du<RoundaboutExitLeft, Builder> implements RoundaboutExitLeftOrBuilder {
        private static final RoundaboutExitLeft DEFAULT_INSTANCE;
        private static volatile fo<RoundaboutExitLeft> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RoundaboutExitLeft, Builder> implements RoundaboutExitLeftOrBuilder {
            private Builder() {
                super(RoundaboutExitLeft.DEFAULT_INSTANCE);
            }
        }

        static {
            RoundaboutExitLeft roundaboutExitLeft = new RoundaboutExitLeft();
            DEFAULT_INSTANCE = roundaboutExitLeft;
            du.registerDefaultInstance(RoundaboutExitLeft.class, roundaboutExitLeft);
        }

        private RoundaboutExitLeft() {
        }

        public static RoundaboutExitLeft getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoundaboutExitLeft parseDelimitedFrom(InputStream inputStream) {
            return (RoundaboutExitLeft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutExitLeft parseFrom(v vVar) {
            return (RoundaboutExitLeft) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RoundaboutExitLeft> parser() {
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
                return new RoundaboutExitLeft();
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
            fo<RoundaboutExitLeft> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RoundaboutExitLeft.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(RoundaboutExitLeft roundaboutExitLeft) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roundaboutExitLeft);
        }

        public static RoundaboutExitLeft parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RoundaboutExitLeft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutExitLeft parseFrom(v vVar, de deVar) {
            return (RoundaboutExitLeft) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RoundaboutExitLeft parseFrom(z zVar) {
            return (RoundaboutExitLeft) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RoundaboutExitLeft parseFrom(z zVar, de deVar) {
            return (RoundaboutExitLeft) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RoundaboutExitLeft parseFrom(InputStream inputStream) {
            return (RoundaboutExitLeft) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutExitLeft parseFrom(InputStream inputStream, de deVar) {
            return (RoundaboutExitLeft) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutExitLeft parseFrom(ByteBuffer byteBuffer) {
            return (RoundaboutExitLeft) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RoundaboutExitLeft parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RoundaboutExitLeft) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RoundaboutExitLeft parseFrom(byte[] bArr) {
            return (RoundaboutExitLeft) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoundaboutExitLeft parseFrom(byte[] bArr, de deVar) {
            return (RoundaboutExitLeft) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutExitRight extends du<RoundaboutExitRight, Builder> implements RoundaboutExitRightOrBuilder {
        private static final RoundaboutExitRight DEFAULT_INSTANCE;
        private static volatile fo<RoundaboutExitRight> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RoundaboutExitRight, Builder> implements RoundaboutExitRightOrBuilder {
            private Builder() {
                super(RoundaboutExitRight.DEFAULT_INSTANCE);
            }
        }

        static {
            RoundaboutExitRight roundaboutExitRight = new RoundaboutExitRight();
            DEFAULT_INSTANCE = roundaboutExitRight;
            du.registerDefaultInstance(RoundaboutExitRight.class, roundaboutExitRight);
        }

        private RoundaboutExitRight() {
        }

        public static RoundaboutExitRight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoundaboutExitRight parseDelimitedFrom(InputStream inputStream) {
            return (RoundaboutExitRight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutExitRight parseFrom(v vVar) {
            return (RoundaboutExitRight) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RoundaboutExitRight> parser() {
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
                return new RoundaboutExitRight();
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
            fo<RoundaboutExitRight> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RoundaboutExitRight.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(RoundaboutExitRight roundaboutExitRight) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roundaboutExitRight);
        }

        public static RoundaboutExitRight parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RoundaboutExitRight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutExitRight parseFrom(v vVar, de deVar) {
            return (RoundaboutExitRight) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RoundaboutExitRight parseFrom(z zVar) {
            return (RoundaboutExitRight) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RoundaboutExitRight parseFrom(z zVar, de deVar) {
            return (RoundaboutExitRight) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RoundaboutExitRight parseFrom(InputStream inputStream) {
            return (RoundaboutExitRight) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutExitRight parseFrom(InputStream inputStream, de deVar) {
            return (RoundaboutExitRight) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutExitRight parseFrom(ByteBuffer byteBuffer) {
            return (RoundaboutExitRight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RoundaboutExitRight parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RoundaboutExitRight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RoundaboutExitRight parseFrom(byte[] bArr) {
            return (RoundaboutExitRight) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoundaboutExitRight parseFrom(byte[] bArr, de deVar) {
            return (RoundaboutExitRight) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutExitStraight extends du<RoundaboutExitStraight, Builder> implements RoundaboutExitStraightOrBuilder {
        private static final RoundaboutExitStraight DEFAULT_INSTANCE;
        private static volatile fo<RoundaboutExitStraight> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RoundaboutExitStraight, Builder> implements RoundaboutExitStraightOrBuilder {
            private Builder() {
                super(RoundaboutExitStraight.DEFAULT_INSTANCE);
            }
        }

        static {
            RoundaboutExitStraight roundaboutExitStraight = new RoundaboutExitStraight();
            DEFAULT_INSTANCE = roundaboutExitStraight;
            du.registerDefaultInstance(RoundaboutExitStraight.class, roundaboutExitStraight);
        }

        private RoundaboutExitStraight() {
        }

        public static RoundaboutExitStraight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoundaboutExitStraight parseDelimitedFrom(InputStream inputStream) {
            return (RoundaboutExitStraight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutExitStraight parseFrom(v vVar) {
            return (RoundaboutExitStraight) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RoundaboutExitStraight> parser() {
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
                return new RoundaboutExitStraight();
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
            fo<RoundaboutExitStraight> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RoundaboutExitStraight.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(RoundaboutExitStraight roundaboutExitStraight) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roundaboutExitStraight);
        }

        public static RoundaboutExitStraight parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RoundaboutExitStraight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutExitStraight parseFrom(v vVar, de deVar) {
            return (RoundaboutExitStraight) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RoundaboutExitStraight parseFrom(z zVar) {
            return (RoundaboutExitStraight) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RoundaboutExitStraight parseFrom(z zVar, de deVar) {
            return (RoundaboutExitStraight) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RoundaboutExitStraight parseFrom(InputStream inputStream) {
            return (RoundaboutExitStraight) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutExitStraight parseFrom(InputStream inputStream, de deVar) {
            return (RoundaboutExitStraight) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutExitStraight parseFrom(ByteBuffer byteBuffer) {
            return (RoundaboutExitStraight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RoundaboutExitStraight parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RoundaboutExitStraight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RoundaboutExitStraight parseFrom(byte[] bArr) {
            return (RoundaboutExitStraight) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoundaboutExitStraight parseFrom(byte[] bArr, de deVar) {
            return (RoundaboutExitStraight) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutExitU extends du<RoundaboutExitU, Builder> implements RoundaboutExitUOrBuilder {
        private static final RoundaboutExitU DEFAULT_INSTANCE;
        private static volatile fo<RoundaboutExitU> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RoundaboutExitU, Builder> implements RoundaboutExitUOrBuilder {
            private Builder() {
                super(RoundaboutExitU.DEFAULT_INSTANCE);
            }
        }

        static {
            RoundaboutExitU roundaboutExitU = new RoundaboutExitU();
            DEFAULT_INSTANCE = roundaboutExitU;
            du.registerDefaultInstance(RoundaboutExitU.class, roundaboutExitU);
        }

        private RoundaboutExitU() {
        }

        public static RoundaboutExitU getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoundaboutExitU parseDelimitedFrom(InputStream inputStream) {
            return (RoundaboutExitU) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutExitU parseFrom(v vVar) {
            return (RoundaboutExitU) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RoundaboutExitU> parser() {
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
                return new RoundaboutExitU();
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
            fo<RoundaboutExitU> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RoundaboutExitU.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(RoundaboutExitU roundaboutExitU) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roundaboutExitU);
        }

        public static RoundaboutExitU parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RoundaboutExitU) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutExitU parseFrom(v vVar, de deVar) {
            return (RoundaboutExitU) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RoundaboutExitU parseFrom(z zVar) {
            return (RoundaboutExitU) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RoundaboutExitU parseFrom(z zVar, de deVar) {
            return (RoundaboutExitU) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RoundaboutExitU parseFrom(InputStream inputStream) {
            return (RoundaboutExitU) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutExitU parseFrom(InputStream inputStream, de deVar) {
            return (RoundaboutExitU) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutExitU parseFrom(ByteBuffer byteBuffer) {
            return (RoundaboutExitU) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RoundaboutExitU parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RoundaboutExitU) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RoundaboutExitU parseFrom(byte[] bArr) {
            return (RoundaboutExitU) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoundaboutExitU parseFrom(byte[] bArr, de deVar) {
            return (RoundaboutExitU) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutLeft extends du<RoundaboutLeft, Builder> implements RoundaboutLeftOrBuilder {
        private static final RoundaboutLeft DEFAULT_INSTANCE;
        private static volatile fo<RoundaboutLeft> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RoundaboutLeft, Builder> implements RoundaboutLeftOrBuilder {
            private Builder() {
                super(RoundaboutLeft.DEFAULT_INSTANCE);
            }
        }

        static {
            RoundaboutLeft roundaboutLeft = new RoundaboutLeft();
            DEFAULT_INSTANCE = roundaboutLeft;
            du.registerDefaultInstance(RoundaboutLeft.class, roundaboutLeft);
        }

        private RoundaboutLeft() {
        }

        public static RoundaboutLeft getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoundaboutLeft parseDelimitedFrom(InputStream inputStream) {
            return (RoundaboutLeft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutLeft parseFrom(v vVar) {
            return (RoundaboutLeft) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RoundaboutLeft> parser() {
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
                return new RoundaboutLeft();
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
            fo<RoundaboutLeft> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RoundaboutLeft.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(RoundaboutLeft roundaboutLeft) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roundaboutLeft);
        }

        public static RoundaboutLeft parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RoundaboutLeft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutLeft parseFrom(v vVar, de deVar) {
            return (RoundaboutLeft) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RoundaboutLeft parseFrom(z zVar) {
            return (RoundaboutLeft) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RoundaboutLeft parseFrom(z zVar, de deVar) {
            return (RoundaboutLeft) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RoundaboutLeft parseFrom(InputStream inputStream) {
            return (RoundaboutLeft) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutLeft parseFrom(InputStream inputStream, de deVar) {
            return (RoundaboutLeft) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutLeft parseFrom(ByteBuffer byteBuffer) {
            return (RoundaboutLeft) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RoundaboutLeft parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RoundaboutLeft) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RoundaboutLeft parseFrom(byte[] bArr) {
            return (RoundaboutLeft) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoundaboutLeft parseFrom(byte[] bArr, de deVar) {
            return (RoundaboutLeft) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutRight extends du<RoundaboutRight, Builder> implements RoundaboutRightOrBuilder {
        private static final RoundaboutRight DEFAULT_INSTANCE;
        private static volatile fo<RoundaboutRight> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RoundaboutRight, Builder> implements RoundaboutRightOrBuilder {
            private Builder() {
                super(RoundaboutRight.DEFAULT_INSTANCE);
            }
        }

        static {
            RoundaboutRight roundaboutRight = new RoundaboutRight();
            DEFAULT_INSTANCE = roundaboutRight;
            du.registerDefaultInstance(RoundaboutRight.class, roundaboutRight);
        }

        private RoundaboutRight() {
        }

        public static RoundaboutRight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoundaboutRight parseDelimitedFrom(InputStream inputStream) {
            return (RoundaboutRight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutRight parseFrom(v vVar) {
            return (RoundaboutRight) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RoundaboutRight> parser() {
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
                return new RoundaboutRight();
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
            fo<RoundaboutRight> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RoundaboutRight.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(RoundaboutRight roundaboutRight) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roundaboutRight);
        }

        public static RoundaboutRight parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RoundaboutRight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutRight parseFrom(v vVar, de deVar) {
            return (RoundaboutRight) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RoundaboutRight parseFrom(z zVar) {
            return (RoundaboutRight) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RoundaboutRight parseFrom(z zVar, de deVar) {
            return (RoundaboutRight) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RoundaboutRight parseFrom(InputStream inputStream) {
            return (RoundaboutRight) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutRight parseFrom(InputStream inputStream, de deVar) {
            return (RoundaboutRight) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutRight parseFrom(ByteBuffer byteBuffer) {
            return (RoundaboutRight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RoundaboutRight parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RoundaboutRight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RoundaboutRight parseFrom(byte[] bArr) {
            return (RoundaboutRight) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoundaboutRight parseFrom(byte[] bArr, de deVar) {
            return (RoundaboutRight) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutStraight extends du<RoundaboutStraight, Builder> implements RoundaboutStraightOrBuilder {
        private static final RoundaboutStraight DEFAULT_INSTANCE;
        private static volatile fo<RoundaboutStraight> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RoundaboutStraight, Builder> implements RoundaboutStraightOrBuilder {
            private Builder() {
                super(RoundaboutStraight.DEFAULT_INSTANCE);
            }
        }

        static {
            RoundaboutStraight roundaboutStraight = new RoundaboutStraight();
            DEFAULT_INSTANCE = roundaboutStraight;
            du.registerDefaultInstance(RoundaboutStraight.class, roundaboutStraight);
        }

        private RoundaboutStraight() {
        }

        public static RoundaboutStraight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoundaboutStraight parseDelimitedFrom(InputStream inputStream) {
            return (RoundaboutStraight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutStraight parseFrom(v vVar) {
            return (RoundaboutStraight) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RoundaboutStraight> parser() {
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
                return new RoundaboutStraight();
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
            fo<RoundaboutStraight> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RoundaboutStraight.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(RoundaboutStraight roundaboutStraight) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roundaboutStraight);
        }

        public static RoundaboutStraight parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RoundaboutStraight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutStraight parseFrom(v vVar, de deVar) {
            return (RoundaboutStraight) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RoundaboutStraight parseFrom(z zVar) {
            return (RoundaboutStraight) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RoundaboutStraight parseFrom(z zVar, de deVar) {
            return (RoundaboutStraight) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RoundaboutStraight parseFrom(InputStream inputStream) {
            return (RoundaboutStraight) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutStraight parseFrom(InputStream inputStream, de deVar) {
            return (RoundaboutStraight) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutStraight parseFrom(ByteBuffer byteBuffer) {
            return (RoundaboutStraight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RoundaboutStraight parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RoundaboutStraight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RoundaboutStraight parseFrom(byte[] bArr) {
            return (RoundaboutStraight) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoundaboutStraight parseFrom(byte[] bArr, de deVar) {
            return (RoundaboutStraight) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutU extends du<RoundaboutU, Builder> implements RoundaboutUOrBuilder {
        private static final RoundaboutU DEFAULT_INSTANCE;
        private static volatile fo<RoundaboutU> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<RoundaboutU, Builder> implements RoundaboutUOrBuilder {
            private Builder() {
                super(RoundaboutU.DEFAULT_INSTANCE);
            }
        }

        static {
            RoundaboutU roundaboutU = new RoundaboutU();
            DEFAULT_INSTANCE = roundaboutU;
            du.registerDefaultInstance(RoundaboutU.class, roundaboutU);
        }

        private RoundaboutU() {
        }

        public static RoundaboutU getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoundaboutU parseDelimitedFrom(InputStream inputStream) {
            return (RoundaboutU) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutU parseFrom(v vVar) {
            return (RoundaboutU) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<RoundaboutU> parser() {
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
                return new RoundaboutU();
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
            fo<RoundaboutU> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (RoundaboutU.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(RoundaboutU roundaboutU) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roundaboutU);
        }

        public static RoundaboutU parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (RoundaboutU) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutU parseFrom(v vVar, de deVar) {
            return (RoundaboutU) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static RoundaboutU parseFrom(z zVar) {
            return (RoundaboutU) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static RoundaboutU parseFrom(z zVar, de deVar) {
            return (RoundaboutU) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static RoundaboutU parseFrom(InputStream inputStream) {
            return (RoundaboutU) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoundaboutU parseFrom(InputStream inputStream, de deVar) {
            return (RoundaboutU) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static RoundaboutU parseFrom(ByteBuffer byteBuffer) {
            return (RoundaboutU) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RoundaboutU parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (RoundaboutU) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static RoundaboutU parseFrom(byte[] bArr) {
            return (RoundaboutU) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoundaboutU parseFrom(byte[] bArr, de deVar) {
            return (RoundaboutU) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class TurnLeft extends du<TurnLeft, Builder> implements TurnLeftOrBuilder {
        private static final TurnLeft DEFAULT_INSTANCE;
        private static volatile fo<TurnLeft> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<TurnLeft, Builder> implements TurnLeftOrBuilder {
            private Builder() {
                super(TurnLeft.DEFAULT_INSTANCE);
            }
        }

        static {
            TurnLeft turnLeft = new TurnLeft();
            DEFAULT_INSTANCE = turnLeft;
            du.registerDefaultInstance(TurnLeft.class, turnLeft);
        }

        private TurnLeft() {
        }

        public static TurnLeft getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TurnLeft parseDelimitedFrom(InputStream inputStream) {
            return (TurnLeft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurnLeft parseFrom(v vVar) {
            return (TurnLeft) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<TurnLeft> parser() {
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
                return new TurnLeft();
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
            fo<TurnLeft> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (TurnLeft.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(TurnLeft turnLeft) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(turnLeft);
        }

        public static TurnLeft parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (TurnLeft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static TurnLeft parseFrom(v vVar, de deVar) {
            return (TurnLeft) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static TurnLeft parseFrom(z zVar) {
            return (TurnLeft) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static TurnLeft parseFrom(z zVar, de deVar) {
            return (TurnLeft) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static TurnLeft parseFrom(InputStream inputStream) {
            return (TurnLeft) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurnLeft parseFrom(InputStream inputStream, de deVar) {
            return (TurnLeft) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static TurnLeft parseFrom(ByteBuffer byteBuffer) {
            return (TurnLeft) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TurnLeft parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (TurnLeft) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static TurnLeft parseFrom(byte[] bArr) {
            return (TurnLeft) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TurnLeft parseFrom(byte[] bArr, de deVar) {
            return (TurnLeft) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class TurnRight extends du<TurnRight, Builder> implements TurnRightOrBuilder {
        private static final TurnRight DEFAULT_INSTANCE;
        private static volatile fo<TurnRight> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<TurnRight, Builder> implements TurnRightOrBuilder {
            private Builder() {
                super(TurnRight.DEFAULT_INSTANCE);
            }
        }

        static {
            TurnRight turnRight = new TurnRight();
            DEFAULT_INSTANCE = turnRight;
            du.registerDefaultInstance(TurnRight.class, turnRight);
        }

        private TurnRight() {
        }

        public static TurnRight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TurnRight parseDelimitedFrom(InputStream inputStream) {
            return (TurnRight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurnRight parseFrom(v vVar) {
            return (TurnRight) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<TurnRight> parser() {
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
                return new TurnRight();
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
            fo<TurnRight> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (TurnRight.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(TurnRight turnRight) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(turnRight);
        }

        public static TurnRight parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (TurnRight) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static TurnRight parseFrom(v vVar, de deVar) {
            return (TurnRight) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static TurnRight parseFrom(z zVar) {
            return (TurnRight) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static TurnRight parseFrom(z zVar, de deVar) {
            return (TurnRight) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static TurnRight parseFrom(InputStream inputStream) {
            return (TurnRight) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TurnRight parseFrom(InputStream inputStream, de deVar) {
            return (TurnRight) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static TurnRight parseFrom(ByteBuffer byteBuffer) {
            return (TurnRight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TurnRight parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (TurnRight) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static TurnRight parseFrom(byte[] bArr) {
            return (TurnRight) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TurnRight parseFrom(byte[] bArr, de deVar) {
            return (TurnRight) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class UTurn extends du<UTurn, Builder> implements UTurnOrBuilder {
        private static final UTurn DEFAULT_INSTANCE;
        private static volatile fo<UTurn> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<UTurn, Builder> implements UTurnOrBuilder {
            private Builder() {
                super(UTurn.DEFAULT_INSTANCE);
            }
        }

        static {
            UTurn uTurn = new UTurn();
            DEFAULT_INSTANCE = uTurn;
            du.registerDefaultInstance(UTurn.class, uTurn);
        }

        private UTurn() {
        }

        public static UTurn getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UTurn parseDelimitedFrom(InputStream inputStream) {
            return (UTurn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UTurn parseFrom(v vVar) {
            return (UTurn) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<UTurn> parser() {
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
                return new UTurn();
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
            fo<UTurn> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (UTurn.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(UTurn uTurn) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(uTurn);
        }

        public static UTurn parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (UTurn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static UTurn parseFrom(v vVar, de deVar) {
            return (UTurn) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static UTurn parseFrom(z zVar) {
            return (UTurn) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static UTurn parseFrom(z zVar, de deVar) {
            return (UTurn) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static UTurn parseFrom(InputStream inputStream) {
            return (UTurn) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UTurn parseFrom(InputStream inputStream, de deVar) {
            return (UTurn) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static UTurn parseFrom(ByteBuffer byteBuffer) {
            return (UTurn) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static UTurn parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (UTurn) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static UTurn parseFrom(byte[] bArr) {
            return (UTurn) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UTurn parseFrom(byte[] bArr, de deVar) {
            return (UTurn) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class WaypointDelay extends du<WaypointDelay, Builder> implements WaypointDelayOrBuilder {
        private static final WaypointDelay DEFAULT_INSTANCE;
        private static volatile fo<WaypointDelay> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<WaypointDelay, Builder> implements WaypointDelayOrBuilder {
            private Builder() {
                super(WaypointDelay.DEFAULT_INSTANCE);
            }
        }

        static {
            WaypointDelay waypointDelay = new WaypointDelay();
            DEFAULT_INSTANCE = waypointDelay;
            du.registerDefaultInstance(WaypointDelay.class, waypointDelay);
        }

        private WaypointDelay() {
        }

        public static WaypointDelay getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static WaypointDelay parseDelimitedFrom(InputStream inputStream) {
            return (WaypointDelay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WaypointDelay parseFrom(v vVar) {
            return (WaypointDelay) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<WaypointDelay> parser() {
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
                return new WaypointDelay();
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
            fo<WaypointDelay> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (WaypointDelay.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(WaypointDelay waypointDelay) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(waypointDelay);
        }

        public static WaypointDelay parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (WaypointDelay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static WaypointDelay parseFrom(v vVar, de deVar) {
            return (WaypointDelay) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static WaypointDelay parseFrom(z zVar) {
            return (WaypointDelay) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static WaypointDelay parseFrom(z zVar, de deVar) {
            return (WaypointDelay) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static WaypointDelay parseFrom(InputStream inputStream) {
            return (WaypointDelay) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WaypointDelay parseFrom(InputStream inputStream, de deVar) {
            return (WaypointDelay) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static WaypointDelay parseFrom(ByteBuffer byteBuffer) {
            return (WaypointDelay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static WaypointDelay parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (WaypointDelay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static WaypointDelay parseFrom(byte[] bArr) {
            return (WaypointDelay) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WaypointDelay parseFrom(byte[] bArr, de deVar) {
            return (WaypointDelay) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(NavigationInstruction navigationInstruction) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationInstruction);
    }

    public static NavigationInstruction parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationInstruction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationInstruction parseFrom(v vVar, de deVar) {
        return (NavigationInstruction) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationInstruction parseFrom(z zVar) {
        return (NavigationInstruction) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationInstruction parseFrom(z zVar, de deVar) {
        return (NavigationInstruction) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NavigationInstruction parseFrom(InputStream inputStream) {
        return (NavigationInstruction) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationInstruction parseFrom(InputStream inputStream, de deVar) {
        return (NavigationInstruction) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationInstruction parseFrom(ByteBuffer byteBuffer) {
        return (NavigationInstruction) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationInstruction parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationInstruction) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NavigationInstruction, Builder> implements NavigationInstructionOrBuilder {
        private Builder() {
            super(NavigationInstruction.DEFAULT_INSTANCE);
        }

        public Builder clearApproachingDestination() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearApproachingDestination();
            return this;
        }

        public Builder clearContinueStraight() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearContinueStraight();
            return this;
        }

        public Builder clearExitLeft() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearExitLeft();
            return this;
        }

        public Builder clearExitRight() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearExitRight();
            return this;
        }

        public Builder clearInstruction() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearInstruction();
            return this;
        }

        public Builder clearKeepLeft() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearKeepLeft();
            return this;
        }

        public Builder clearKeepRight() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearKeepRight();
            return this;
        }

        public Builder clearRoundaboutEnter() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearRoundaboutEnter();
            return this;
        }

        public Builder clearRoundaboutExit() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearRoundaboutExit();
            return this;
        }

        public Builder clearRoundaboutExitLeft() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearRoundaboutExitLeft();
            return this;
        }

        public Builder clearRoundaboutExitRight() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearRoundaboutExitRight();
            return this;
        }

        public Builder clearRoundaboutExitStraight() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearRoundaboutExitStraight();
            return this;
        }

        public Builder clearRoundaboutExitU() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearRoundaboutExitU();
            return this;
        }

        public Builder clearRoundaboutLeft() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearRoundaboutLeft();
            return this;
        }

        public Builder clearRoundaboutRight() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearRoundaboutRight();
            return this;
        }

        public Builder clearRoundaboutStraight() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearRoundaboutStraight();
            return this;
        }

        public Builder clearRoundaboutU() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearRoundaboutU();
            return this;
        }

        public Builder clearTurnLeft() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearTurnLeft();
            return this;
        }

        public Builder clearTurnRight() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearTurnRight();
            return this;
        }

        public Builder clearUTurn() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearUTurn();
            return this;
        }

        public Builder clearWaypointDelay() {
            copyOnWrite();
            ((NavigationInstruction) this.instance).clearWaypointDelay();
            return this;
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public ApproachingDestination getApproachingDestination() {
            return ((NavigationInstruction) this.instance).getApproachingDestination();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public ContinueStraight getContinueStraight() {
            return ((NavigationInstruction) this.instance).getContinueStraight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public ExitLeft getExitLeft() {
            return ((NavigationInstruction) this.instance).getExitLeft();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public ExitRight getExitRight() {
            return ((NavigationInstruction) this.instance).getExitRight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public InstructionCase getInstructionCase() {
            return ((NavigationInstruction) this.instance).getInstructionCase();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public KeepLeft getKeepLeft() {
            return ((NavigationInstruction) this.instance).getKeepLeft();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public KeepRight getKeepRight() {
            return ((NavigationInstruction) this.instance).getKeepRight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public RoundaboutEnter getRoundaboutEnter() {
            return ((NavigationInstruction) this.instance).getRoundaboutEnter();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public RoundaboutExit getRoundaboutExit() {
            return ((NavigationInstruction) this.instance).getRoundaboutExit();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public RoundaboutExitLeft getRoundaboutExitLeft() {
            return ((NavigationInstruction) this.instance).getRoundaboutExitLeft();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public RoundaboutExitRight getRoundaboutExitRight() {
            return ((NavigationInstruction) this.instance).getRoundaboutExitRight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public RoundaboutExitStraight getRoundaboutExitStraight() {
            return ((NavigationInstruction) this.instance).getRoundaboutExitStraight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public RoundaboutExitU getRoundaboutExitU() {
            return ((NavigationInstruction) this.instance).getRoundaboutExitU();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public RoundaboutLeft getRoundaboutLeft() {
            return ((NavigationInstruction) this.instance).getRoundaboutLeft();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public RoundaboutRight getRoundaboutRight() {
            return ((NavigationInstruction) this.instance).getRoundaboutRight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public RoundaboutStraight getRoundaboutStraight() {
            return ((NavigationInstruction) this.instance).getRoundaboutStraight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public RoundaboutU getRoundaboutU() {
            return ((NavigationInstruction) this.instance).getRoundaboutU();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public TurnLeft getTurnLeft() {
            return ((NavigationInstruction) this.instance).getTurnLeft();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public TurnRight getTurnRight() {
            return ((NavigationInstruction) this.instance).getTurnRight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public UTurn getUTurn() {
            return ((NavigationInstruction) this.instance).getUTurn();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public WaypointDelay getWaypointDelay() {
            return ((NavigationInstruction) this.instance).getWaypointDelay();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasApproachingDestination() {
            return ((NavigationInstruction) this.instance).hasApproachingDestination();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasContinueStraight() {
            return ((NavigationInstruction) this.instance).hasContinueStraight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasExitLeft() {
            return ((NavigationInstruction) this.instance).hasExitLeft();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasExitRight() {
            return ((NavigationInstruction) this.instance).hasExitRight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasKeepLeft() {
            return ((NavigationInstruction) this.instance).hasKeepLeft();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasKeepRight() {
            return ((NavigationInstruction) this.instance).hasKeepRight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasRoundaboutEnter() {
            return ((NavigationInstruction) this.instance).hasRoundaboutEnter();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasRoundaboutExit() {
            return ((NavigationInstruction) this.instance).hasRoundaboutExit();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasRoundaboutExitLeft() {
            return ((NavigationInstruction) this.instance).hasRoundaboutExitLeft();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasRoundaboutExitRight() {
            return ((NavigationInstruction) this.instance).hasRoundaboutExitRight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasRoundaboutExitStraight() {
            return ((NavigationInstruction) this.instance).hasRoundaboutExitStraight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasRoundaboutExitU() {
            return ((NavigationInstruction) this.instance).hasRoundaboutExitU();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasRoundaboutLeft() {
            return ((NavigationInstruction) this.instance).hasRoundaboutLeft();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasRoundaboutRight() {
            return ((NavigationInstruction) this.instance).hasRoundaboutRight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasRoundaboutStraight() {
            return ((NavigationInstruction) this.instance).hasRoundaboutStraight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasRoundaboutU() {
            return ((NavigationInstruction) this.instance).hasRoundaboutU();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasTurnLeft() {
            return ((NavigationInstruction) this.instance).hasTurnLeft();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasTurnRight() {
            return ((NavigationInstruction) this.instance).hasTurnRight();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasUTurn() {
            return ((NavigationInstruction) this.instance).hasUTurn();
        }

        @Override // com.waze.jni.protos.NavigationInstructionOrBuilder
        public boolean hasWaypointDelay() {
            return ((NavigationInstruction) this.instance).hasWaypointDelay();
        }

        public Builder mergeApproachingDestination(ApproachingDestination approachingDestination) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeApproachingDestination(approachingDestination);
            return this;
        }

        public Builder mergeContinueStraight(ContinueStraight continueStraight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeContinueStraight(continueStraight);
            return this;
        }

        public Builder mergeExitLeft(ExitLeft exitLeft) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeExitLeft(exitLeft);
            return this;
        }

        public Builder mergeExitRight(ExitRight exitRight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeExitRight(exitRight);
            return this;
        }

        public Builder mergeKeepLeft(KeepLeft keepLeft) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeKeepLeft(keepLeft);
            return this;
        }

        public Builder mergeKeepRight(KeepRight keepRight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeKeepRight(keepRight);
            return this;
        }

        public Builder mergeRoundaboutEnter(RoundaboutEnter roundaboutEnter) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeRoundaboutEnter(roundaboutEnter);
            return this;
        }

        public Builder mergeRoundaboutExit(RoundaboutExit roundaboutExit) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeRoundaboutExit(roundaboutExit);
            return this;
        }

        public Builder mergeRoundaboutExitLeft(RoundaboutExitLeft roundaboutExitLeft) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeRoundaboutExitLeft(roundaboutExitLeft);
            return this;
        }

        public Builder mergeRoundaboutExitRight(RoundaboutExitRight roundaboutExitRight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeRoundaboutExitRight(roundaboutExitRight);
            return this;
        }

        public Builder mergeRoundaboutExitStraight(RoundaboutExitStraight roundaboutExitStraight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeRoundaboutExitStraight(roundaboutExitStraight);
            return this;
        }

        public Builder mergeRoundaboutExitU(RoundaboutExitU roundaboutExitU) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeRoundaboutExitU(roundaboutExitU);
            return this;
        }

        public Builder mergeRoundaboutLeft(RoundaboutLeft roundaboutLeft) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeRoundaboutLeft(roundaboutLeft);
            return this;
        }

        public Builder mergeRoundaboutRight(RoundaboutRight roundaboutRight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeRoundaboutRight(roundaboutRight);
            return this;
        }

        public Builder mergeRoundaboutStraight(RoundaboutStraight roundaboutStraight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeRoundaboutStraight(roundaboutStraight);
            return this;
        }

        public Builder mergeRoundaboutU(RoundaboutU roundaboutU) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeRoundaboutU(roundaboutU);
            return this;
        }

        public Builder mergeTurnLeft(TurnLeft turnLeft) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeTurnLeft(turnLeft);
            return this;
        }

        public Builder mergeTurnRight(TurnRight turnRight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeTurnRight(turnRight);
            return this;
        }

        public Builder mergeUTurn(UTurn uTurn) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeUTurn(uTurn);
            return this;
        }

        public Builder mergeWaypointDelay(WaypointDelay waypointDelay) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).mergeWaypointDelay(waypointDelay);
            return this;
        }

        public Builder setApproachingDestination(ApproachingDestination.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setApproachingDestination(builder.build());
            return this;
        }

        public Builder setContinueStraight(ContinueStraight.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setContinueStraight(builder.build());
            return this;
        }

        public Builder setExitLeft(ExitLeft.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setExitLeft(builder.build());
            return this;
        }

        public Builder setExitRight(ExitRight.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setExitRight(builder.build());
            return this;
        }

        public Builder setKeepLeft(KeepLeft.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setKeepLeft(builder.build());
            return this;
        }

        public Builder setKeepRight(KeepRight.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setKeepRight(builder.build());
            return this;
        }

        public Builder setRoundaboutEnter(RoundaboutEnter.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutEnter(builder.build());
            return this;
        }

        public Builder setRoundaboutExit(RoundaboutExit.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutExit(builder.build());
            return this;
        }

        public Builder setRoundaboutExitLeft(RoundaboutExitLeft.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutExitLeft(builder.build());
            return this;
        }

        public Builder setRoundaboutExitRight(RoundaboutExitRight.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutExitRight(builder.build());
            return this;
        }

        public Builder setRoundaboutExitStraight(RoundaboutExitStraight.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutExitStraight(builder.build());
            return this;
        }

        public Builder setRoundaboutExitU(RoundaboutExitU.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutExitU(builder.build());
            return this;
        }

        public Builder setRoundaboutLeft(RoundaboutLeft.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutLeft(builder.build());
            return this;
        }

        public Builder setRoundaboutRight(RoundaboutRight.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutRight(builder.build());
            return this;
        }

        public Builder setRoundaboutStraight(RoundaboutStraight.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutStraight(builder.build());
            return this;
        }

        public Builder setRoundaboutU(RoundaboutU.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutU(builder.build());
            return this;
        }

        public Builder setTurnLeft(TurnLeft.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setTurnLeft(builder.build());
            return this;
        }

        public Builder setTurnRight(TurnRight.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setTurnRight(builder.build());
            return this;
        }

        public Builder setUTurn(UTurn.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setUTurn(builder.build());
            return this;
        }

        public Builder setWaypointDelay(WaypointDelay.Builder builder) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setWaypointDelay(builder.build());
            return this;
        }

        public Builder setApproachingDestination(ApproachingDestination approachingDestination) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setApproachingDestination(approachingDestination);
            return this;
        }

        public Builder setContinueStraight(ContinueStraight continueStraight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setContinueStraight(continueStraight);
            return this;
        }

        public Builder setExitLeft(ExitLeft exitLeft) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setExitLeft(exitLeft);
            return this;
        }

        public Builder setExitRight(ExitRight exitRight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setExitRight(exitRight);
            return this;
        }

        public Builder setKeepLeft(KeepLeft keepLeft) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setKeepLeft(keepLeft);
            return this;
        }

        public Builder setKeepRight(KeepRight keepRight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setKeepRight(keepRight);
            return this;
        }

        public Builder setRoundaboutEnter(RoundaboutEnter roundaboutEnter) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutEnter(roundaboutEnter);
            return this;
        }

        public Builder setRoundaboutExit(RoundaboutExit roundaboutExit) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutExit(roundaboutExit);
            return this;
        }

        public Builder setRoundaboutExitLeft(RoundaboutExitLeft roundaboutExitLeft) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutExitLeft(roundaboutExitLeft);
            return this;
        }

        public Builder setRoundaboutExitRight(RoundaboutExitRight roundaboutExitRight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutExitRight(roundaboutExitRight);
            return this;
        }

        public Builder setRoundaboutExitStraight(RoundaboutExitStraight roundaboutExitStraight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutExitStraight(roundaboutExitStraight);
            return this;
        }

        public Builder setRoundaboutExitU(RoundaboutExitU roundaboutExitU) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutExitU(roundaboutExitU);
            return this;
        }

        public Builder setRoundaboutLeft(RoundaboutLeft roundaboutLeft) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutLeft(roundaboutLeft);
            return this;
        }

        public Builder setRoundaboutRight(RoundaboutRight roundaboutRight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutRight(roundaboutRight);
            return this;
        }

        public Builder setRoundaboutStraight(RoundaboutStraight roundaboutStraight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutStraight(roundaboutStraight);
            return this;
        }

        public Builder setRoundaboutU(RoundaboutU roundaboutU) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setRoundaboutU(roundaboutU);
            return this;
        }

        public Builder setTurnLeft(TurnLeft turnLeft) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setTurnLeft(turnLeft);
            return this;
        }

        public Builder setTurnRight(TurnRight turnRight) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setTurnRight(turnRight);
            return this;
        }

        public Builder setUTurn(UTurn uTurn) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setUTurn(uTurn);
            return this;
        }

        public Builder setWaypointDelay(WaypointDelay waypointDelay) {
            copyOnWrite();
            ((NavigationInstruction) this.instance).setWaypointDelay(waypointDelay);
            return this;
        }
    }

    public static NavigationInstruction parseFrom(byte[] bArr) {
        return (NavigationInstruction) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationInstruction parseFrom(byte[] bArr, de deVar) {
        return (NavigationInstruction) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
