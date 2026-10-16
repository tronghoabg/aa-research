package com.waze.jni.protos;

import com.waze.jni.protos.NavigationInstruction;
import com.waze.jni.protos.NavigationInstructionKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationInstructionKtKt {
    /* renamed from: -initializenavigationInstruction, reason: not valid java name */
    public static final NavigationInstruction m25363initializenavigationInstruction(l<? super NavigationInstructionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationInstructionKt.Dsl.Companion companion = NavigationInstructionKt.Dsl.Companion;
        NavigationInstruction.Builder builderNewBuilder = NavigationInstruction.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationInstructionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.ApproachingDestination copy(NavigationInstruction.ApproachingDestination approachingDestination, l<? super NavigationInstructionKt.ApproachingDestinationKt.Dsl, ab> lVar) {
        x.f(approachingDestination, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.ApproachingDestinationKt.Dsl.Companion companion = NavigationInstructionKt.ApproachingDestinationKt.Dsl.Companion;
        NavigationInstruction.ApproachingDestination.Builder builder = approachingDestination.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.ApproachingDestinationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.ApproachingDestination getApproachingDestinationOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasApproachingDestination()) {
            return navigationInstructionOrBuilder.getApproachingDestination();
        }
        return null;
    }

    public static /* synthetic */ void getApproachingDestinationOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.ContinueStraight getContinueStraightOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasContinueStraight()) {
            return navigationInstructionOrBuilder.getContinueStraight();
        }
        return null;
    }

    public static /* synthetic */ void getContinueStraightOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.ExitLeft getExitLeftOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasExitLeft()) {
            return navigationInstructionOrBuilder.getExitLeft();
        }
        return null;
    }

    public static /* synthetic */ void getExitLeftOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.ExitRight getExitRightOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasExitRight()) {
            return navigationInstructionOrBuilder.getExitRight();
        }
        return null;
    }

    public static /* synthetic */ void getExitRightOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.KeepLeft getKeepLeftOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasKeepLeft()) {
            return navigationInstructionOrBuilder.getKeepLeft();
        }
        return null;
    }

    public static /* synthetic */ void getKeepLeftOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.KeepRight getKeepRightOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasKeepRight()) {
            return navigationInstructionOrBuilder.getKeepRight();
        }
        return null;
    }

    public static /* synthetic */ void getKeepRightOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.RoundaboutEnter getRoundaboutEnterOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasRoundaboutEnter()) {
            return navigationInstructionOrBuilder.getRoundaboutEnter();
        }
        return null;
    }

    public static /* synthetic */ void getRoundaboutEnterOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.RoundaboutExitLeft getRoundaboutExitLeftOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasRoundaboutExitLeft()) {
            return navigationInstructionOrBuilder.getRoundaboutExitLeft();
        }
        return null;
    }

    public static /* synthetic */ void getRoundaboutExitLeftOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.RoundaboutExit getRoundaboutExitOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasRoundaboutExit()) {
            return navigationInstructionOrBuilder.getRoundaboutExit();
        }
        return null;
    }

    public static /* synthetic */ void getRoundaboutExitOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.RoundaboutExitRight getRoundaboutExitRightOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasRoundaboutExitRight()) {
            return navigationInstructionOrBuilder.getRoundaboutExitRight();
        }
        return null;
    }

    public static /* synthetic */ void getRoundaboutExitRightOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.RoundaboutExitStraight getRoundaboutExitStraightOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasRoundaboutExitStraight()) {
            return navigationInstructionOrBuilder.getRoundaboutExitStraight();
        }
        return null;
    }

    public static /* synthetic */ void getRoundaboutExitStraightOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.RoundaboutExitU getRoundaboutExitUOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasRoundaboutExitU()) {
            return navigationInstructionOrBuilder.getRoundaboutExitU();
        }
        return null;
    }

    public static /* synthetic */ void getRoundaboutExitUOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.RoundaboutLeft getRoundaboutLeftOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasRoundaboutLeft()) {
            return navigationInstructionOrBuilder.getRoundaboutLeft();
        }
        return null;
    }

    public static /* synthetic */ void getRoundaboutLeftOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.RoundaboutRight getRoundaboutRightOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasRoundaboutRight()) {
            return navigationInstructionOrBuilder.getRoundaboutRight();
        }
        return null;
    }

    public static /* synthetic */ void getRoundaboutRightOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.RoundaboutStraight getRoundaboutStraightOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasRoundaboutStraight()) {
            return navigationInstructionOrBuilder.getRoundaboutStraight();
        }
        return null;
    }

    public static /* synthetic */ void getRoundaboutStraightOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.RoundaboutU getRoundaboutUOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasRoundaboutU()) {
            return navigationInstructionOrBuilder.getRoundaboutU();
        }
        return null;
    }

    public static /* synthetic */ void getRoundaboutUOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.TurnLeft getTurnLeftOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasTurnLeft()) {
            return navigationInstructionOrBuilder.getTurnLeft();
        }
        return null;
    }

    public static /* synthetic */ void getTurnLeftOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.TurnRight getTurnRightOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasTurnRight()) {
            return navigationInstructionOrBuilder.getTurnRight();
        }
        return null;
    }

    public static /* synthetic */ void getTurnRightOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.UTurn getUTurnOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasUTurn()) {
            return navigationInstructionOrBuilder.getUTurn();
        }
        return null;
    }

    public static /* synthetic */ void getUTurnOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.WaypointDelay getWaypointDelayOrNull(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
        x.f(navigationInstructionOrBuilder, "<this>");
        if (navigationInstructionOrBuilder.hasWaypointDelay()) {
            return navigationInstructionOrBuilder.getWaypointDelay();
        }
        return null;
    }

    public static /* synthetic */ void getWaypointDelayOrNull$annotations(NavigationInstructionOrBuilder navigationInstructionOrBuilder) {
    }

    public static final NavigationInstruction.ContinueStraight copy(NavigationInstruction.ContinueStraight continueStraight, l<? super NavigationInstructionKt.ContinueStraightKt.Dsl, ab> lVar) {
        x.f(continueStraight, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.ContinueStraightKt.Dsl.Companion companion = NavigationInstructionKt.ContinueStraightKt.Dsl.Companion;
        NavigationInstruction.ContinueStraight.Builder builder = continueStraight.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.ContinueStraightKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.ExitLeft copy(NavigationInstruction.ExitLeft exitLeft, l<? super NavigationInstructionKt.ExitLeftKt.Dsl, ab> lVar) {
        x.f(exitLeft, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.ExitLeftKt.Dsl.Companion companion = NavigationInstructionKt.ExitLeftKt.Dsl.Companion;
        NavigationInstruction.ExitLeft.Builder builder = exitLeft.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.ExitLeftKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.ExitRight copy(NavigationInstruction.ExitRight exitRight, l<? super NavigationInstructionKt.ExitRightKt.Dsl, ab> lVar) {
        x.f(exitRight, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.ExitRightKt.Dsl.Companion companion = NavigationInstructionKt.ExitRightKt.Dsl.Companion;
        NavigationInstruction.ExitRight.Builder builder = exitRight.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.ExitRightKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.KeepLeft copy(NavigationInstruction.KeepLeft keepLeft, l<? super NavigationInstructionKt.KeepLeftKt.Dsl, ab> lVar) {
        x.f(keepLeft, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.KeepLeftKt.Dsl.Companion companion = NavigationInstructionKt.KeepLeftKt.Dsl.Companion;
        NavigationInstruction.KeepLeft.Builder builder = keepLeft.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.KeepLeftKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.KeepRight copy(NavigationInstruction.KeepRight keepRight, l<? super NavigationInstructionKt.KeepRightKt.Dsl, ab> lVar) {
        x.f(keepRight, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.KeepRightKt.Dsl.Companion companion = NavigationInstructionKt.KeepRightKt.Dsl.Companion;
        NavigationInstruction.KeepRight.Builder builder = keepRight.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.KeepRightKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.RoundaboutEnter copy(NavigationInstruction.RoundaboutEnter roundaboutEnter, l<? super NavigationInstructionKt.RoundaboutEnterKt.Dsl, ab> lVar) {
        x.f(roundaboutEnter, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.RoundaboutEnterKt.Dsl.Companion companion = NavigationInstructionKt.RoundaboutEnterKt.Dsl.Companion;
        NavigationInstruction.RoundaboutEnter.Builder builder = roundaboutEnter.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.RoundaboutEnterKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.RoundaboutExit copy(NavigationInstruction.RoundaboutExit roundaboutExit, l<? super NavigationInstructionKt.RoundaboutExitKt.Dsl, ab> lVar) {
        x.f(roundaboutExit, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.RoundaboutExitKt.Dsl.Companion companion = NavigationInstructionKt.RoundaboutExitKt.Dsl.Companion;
        NavigationInstruction.RoundaboutExit.Builder builder = roundaboutExit.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.RoundaboutExitKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.RoundaboutExitLeft copy(NavigationInstruction.RoundaboutExitLeft roundaboutExitLeft, l<? super NavigationInstructionKt.RoundaboutExitLeftKt.Dsl, ab> lVar) {
        x.f(roundaboutExitLeft, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.RoundaboutExitLeftKt.Dsl.Companion companion = NavigationInstructionKt.RoundaboutExitLeftKt.Dsl.Companion;
        NavigationInstruction.RoundaboutExitLeft.Builder builder = roundaboutExitLeft.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.RoundaboutExitLeftKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.RoundaboutExitRight copy(NavigationInstruction.RoundaboutExitRight roundaboutExitRight, l<? super NavigationInstructionKt.RoundaboutExitRightKt.Dsl, ab> lVar) {
        x.f(roundaboutExitRight, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.RoundaboutExitRightKt.Dsl.Companion companion = NavigationInstructionKt.RoundaboutExitRightKt.Dsl.Companion;
        NavigationInstruction.RoundaboutExitRight.Builder builder = roundaboutExitRight.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.RoundaboutExitRightKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.RoundaboutExitStraight copy(NavigationInstruction.RoundaboutExitStraight roundaboutExitStraight, l<? super NavigationInstructionKt.RoundaboutExitStraightKt.Dsl, ab> lVar) {
        x.f(roundaboutExitStraight, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.RoundaboutExitStraightKt.Dsl.Companion companion = NavigationInstructionKt.RoundaboutExitStraightKt.Dsl.Companion;
        NavigationInstruction.RoundaboutExitStraight.Builder builder = roundaboutExitStraight.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.RoundaboutExitStraightKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.RoundaboutExitU copy(NavigationInstruction.RoundaboutExitU roundaboutExitU, l<? super NavigationInstructionKt.RoundaboutExitUKt.Dsl, ab> lVar) {
        x.f(roundaboutExitU, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.RoundaboutExitUKt.Dsl.Companion companion = NavigationInstructionKt.RoundaboutExitUKt.Dsl.Companion;
        NavigationInstruction.RoundaboutExitU.Builder builder = roundaboutExitU.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.RoundaboutExitUKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.RoundaboutLeft copy(NavigationInstruction.RoundaboutLeft roundaboutLeft, l<? super NavigationInstructionKt.RoundaboutLeftKt.Dsl, ab> lVar) {
        x.f(roundaboutLeft, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.RoundaboutLeftKt.Dsl.Companion companion = NavigationInstructionKt.RoundaboutLeftKt.Dsl.Companion;
        NavigationInstruction.RoundaboutLeft.Builder builder = roundaboutLeft.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.RoundaboutLeftKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.RoundaboutRight copy(NavigationInstruction.RoundaboutRight roundaboutRight, l<? super NavigationInstructionKt.RoundaboutRightKt.Dsl, ab> lVar) {
        x.f(roundaboutRight, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.RoundaboutRightKt.Dsl.Companion companion = NavigationInstructionKt.RoundaboutRightKt.Dsl.Companion;
        NavigationInstruction.RoundaboutRight.Builder builder = roundaboutRight.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.RoundaboutRightKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.RoundaboutStraight copy(NavigationInstruction.RoundaboutStraight roundaboutStraight, l<? super NavigationInstructionKt.RoundaboutStraightKt.Dsl, ab> lVar) {
        x.f(roundaboutStraight, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.RoundaboutStraightKt.Dsl.Companion companion = NavigationInstructionKt.RoundaboutStraightKt.Dsl.Companion;
        NavigationInstruction.RoundaboutStraight.Builder builder = roundaboutStraight.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.RoundaboutStraightKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.RoundaboutU copy(NavigationInstruction.RoundaboutU roundaboutU, l<? super NavigationInstructionKt.RoundaboutUKt.Dsl, ab> lVar) {
        x.f(roundaboutU, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.RoundaboutUKt.Dsl.Companion companion = NavigationInstructionKt.RoundaboutUKt.Dsl.Companion;
        NavigationInstruction.RoundaboutU.Builder builder = roundaboutU.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.RoundaboutUKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.TurnLeft copy(NavigationInstruction.TurnLeft turnLeft, l<? super NavigationInstructionKt.TurnLeftKt.Dsl, ab> lVar) {
        x.f(turnLeft, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.TurnLeftKt.Dsl.Companion companion = NavigationInstructionKt.TurnLeftKt.Dsl.Companion;
        NavigationInstruction.TurnLeft.Builder builder = turnLeft.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.TurnLeftKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.TurnRight copy(NavigationInstruction.TurnRight turnRight, l<? super NavigationInstructionKt.TurnRightKt.Dsl, ab> lVar) {
        x.f(turnRight, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.TurnRightKt.Dsl.Companion companion = NavigationInstructionKt.TurnRightKt.Dsl.Companion;
        NavigationInstruction.TurnRight.Builder builder = turnRight.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.TurnRightKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.UTurn copy(NavigationInstruction.UTurn uTurn, l<? super NavigationInstructionKt.UTurnKt.Dsl, ab> lVar) {
        x.f(uTurn, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.UTurnKt.Dsl.Companion companion = NavigationInstructionKt.UTurnKt.Dsl.Companion;
        NavigationInstruction.UTurn.Builder builder = uTurn.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.UTurnKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction.WaypointDelay copy(NavigationInstruction.WaypointDelay waypointDelay, l<? super NavigationInstructionKt.WaypointDelayKt.Dsl, ab> lVar) {
        x.f(waypointDelay, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.WaypointDelayKt.Dsl.Companion companion = NavigationInstructionKt.WaypointDelayKt.Dsl.Companion;
        NavigationInstruction.WaypointDelay.Builder builder = waypointDelay.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.WaypointDelayKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction copy(NavigationInstruction navigationInstruction, l<? super NavigationInstructionKt.Dsl, ab> lVar) {
        x.f(navigationInstruction, "<this>");
        x.f(lVar, "block");
        NavigationInstructionKt.Dsl.Companion companion = NavigationInstructionKt.Dsl.Companion;
        NavigationInstruction.Builder builder = navigationInstruction.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationInstructionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
