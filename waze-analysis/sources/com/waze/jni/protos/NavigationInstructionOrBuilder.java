package com.waze.jni.protos;

import com.google.v.fj;
import com.waze.jni.protos.NavigationInstruction;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NavigationInstructionOrBuilder extends fj {
    NavigationInstruction.ApproachingDestination getApproachingDestination();

    NavigationInstruction.ContinueStraight getContinueStraight();

    NavigationInstruction.ExitLeft getExitLeft();

    NavigationInstruction.ExitRight getExitRight();

    NavigationInstruction.InstructionCase getInstructionCase();

    NavigationInstruction.KeepLeft getKeepLeft();

    NavigationInstruction.KeepRight getKeepRight();

    NavigationInstruction.RoundaboutEnter getRoundaboutEnter();

    NavigationInstruction.RoundaboutExit getRoundaboutExit();

    NavigationInstruction.RoundaboutExitLeft getRoundaboutExitLeft();

    NavigationInstruction.RoundaboutExitRight getRoundaboutExitRight();

    NavigationInstruction.RoundaboutExitStraight getRoundaboutExitStraight();

    NavigationInstruction.RoundaboutExitU getRoundaboutExitU();

    NavigationInstruction.RoundaboutLeft getRoundaboutLeft();

    NavigationInstruction.RoundaboutRight getRoundaboutRight();

    NavigationInstruction.RoundaboutStraight getRoundaboutStraight();

    NavigationInstruction.RoundaboutU getRoundaboutU();

    NavigationInstruction.TurnLeft getTurnLeft();

    NavigationInstruction.TurnRight getTurnRight();

    NavigationInstruction.UTurn getUTurn();

    NavigationInstruction.WaypointDelay getWaypointDelay();

    boolean hasApproachingDestination();

    boolean hasContinueStraight();

    boolean hasExitLeft();

    boolean hasExitRight();

    boolean hasKeepLeft();

    boolean hasKeepRight();

    boolean hasRoundaboutEnter();

    boolean hasRoundaboutExit();

    boolean hasRoundaboutExitLeft();

    boolean hasRoundaboutExitRight();

    boolean hasRoundaboutExitStraight();

    boolean hasRoundaboutExitU();

    boolean hasRoundaboutLeft();

    boolean hasRoundaboutRight();

    boolean hasRoundaboutStraight();

    boolean hasRoundaboutU();

    boolean hasTurnLeft();

    boolean hasTurnRight();

    boolean hasUTurn();

    boolean hasWaypointDelay();
}
