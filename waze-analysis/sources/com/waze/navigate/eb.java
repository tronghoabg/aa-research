package com.waze.navigate;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.jni.protos.navigate.Instruction;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class eb {

    /* renamed from: a, reason: collision with root package name */
    public static final List f31297a = h.a.i.i(ea.f31291g, ea.f31292h, ea.f31293i, ea.f31294j, ea.f31295k, ea.f31296l, ea.m, ea.n, ea.o, ea.p);

    /* renamed from: b, reason: collision with root package name */
    private static final Map f31298b = h.a.r.k(new h.k(Instruction.Type.NAV_INSTR_NONE, ea.f31285a), new h.k(Instruction.Type.TURN_LEFT, ea.f31286b), new h.k(Instruction.Type.TURN_RIGHT, ea.f31287c), new h.k(Instruction.Type.KEEP_LEFT, ea.f31288d), new h.k(Instruction.Type.KEEP_RIGHT, ea.f31289e), new h.k(Instruction.Type.CONTINUE_STRAIGHT, ea.f31290f), new h.k(Instruction.Type.ROUNDABOUT_ENTER, ea.f31291g), new h.k(Instruction.Type.ROUNDABOUT_EXIT, ea.f31292h), new h.k(Instruction.Type.ROUNDABOUT_LEFT, ea.f31293i), new h.k(Instruction.Type.ROUNDABOUT_EXIT_LEFT, ea.f31294j), new h.k(Instruction.Type.ROUNDABOUT_STRAIGHT, ea.f31295k), new h.k(Instruction.Type.ROUNDABOUT_EXIT_STRAIGHT, ea.f31296l), new h.k(Instruction.Type.ROUNDABOUT_RIGHT, ea.m), new h.k(Instruction.Type.ROUNDABOUT_EXIT_RIGHT, ea.n), new h.k(Instruction.Type.ROUNDABOUT_U, ea.o), new h.k(Instruction.Type.ROUNDABOUT_EXIT_U, ea.p), new h.k(Instruction.Type.APPROACHING_DESTINATION, ea.q), new h.k(Instruction.Type.EXIT_LEFT, ea.r), new h.k(Instruction.Type.EXIT_RIGHT, ea.s), new h.k(Instruction.Type.WAYPOINT_DELAY, ea.t), new h.k(Instruction.Type.U_TURN, ea.u), new h.k(Instruction.Type.LAST_DIRECTION, ea.v), new h.k(Instruction.Type.SLIGHT_LEFT, ea.w), new h.k(Instruction.Type.SHARP_LEFT, ea.x), new h.k(Instruction.Type.SLIGHT_RIGHT, ea.y), new h.k(Instruction.Type.SHARP_RIGHT, ea.z), new h.k(Instruction.Type.ENTER_HOV_LANE, ea.A), new h.k(Instruction.Type.PREPARE_TURN_LEFT, ea.B), new h.k(Instruction.Type.PREPARE_TURN_RIGHT, ea.C), new h.k(Instruction.Type.PREPARE_EXIT_LEFT, ea.D), new h.k(Instruction.Type.PREPARE_EXIT_RIGHT, ea.E), new h.k(Instruction.Type.APPROACHING_STOP_POINT, ea.F));

    /* renamed from: c, reason: collision with root package name */
    private static final Map f31299c = h.a.r.k(new h.k(ea.f31285a, Instruction.Type.NAV_INSTR_NONE), new h.k(ea.f31286b, Instruction.Type.TURN_LEFT), new h.k(ea.f31287c, Instruction.Type.TURN_RIGHT), new h.k(ea.f31288d, Instruction.Type.KEEP_LEFT), new h.k(ea.f31289e, Instruction.Type.KEEP_RIGHT), new h.k(ea.f31290f, Instruction.Type.CONTINUE_STRAIGHT), new h.k(ea.f31291g, Instruction.Type.ROUNDABOUT_ENTER), new h.k(ea.f31292h, Instruction.Type.ROUNDABOUT_EXIT), new h.k(ea.f31293i, Instruction.Type.ROUNDABOUT_LEFT), new h.k(ea.f31294j, Instruction.Type.ROUNDABOUT_EXIT_LEFT), new h.k(ea.f31295k, Instruction.Type.ROUNDABOUT_STRAIGHT), new h.k(ea.f31296l, Instruction.Type.ROUNDABOUT_EXIT_STRAIGHT), new h.k(ea.m, Instruction.Type.ROUNDABOUT_RIGHT), new h.k(ea.n, Instruction.Type.ROUNDABOUT_EXIT_RIGHT), new h.k(ea.o, Instruction.Type.ROUNDABOUT_U), new h.k(ea.p, Instruction.Type.ROUNDABOUT_EXIT_U), new h.k(ea.q, Instruction.Type.APPROACHING_DESTINATION), new h.k(ea.r, Instruction.Type.EXIT_LEFT), new h.k(ea.s, Instruction.Type.EXIT_RIGHT), new h.k(ea.t, Instruction.Type.WAYPOINT_DELAY), new h.k(ea.u, Instruction.Type.U_TURN), new h.k(ea.v, Instruction.Type.LAST_DIRECTION), new h.k(ea.w, Instruction.Type.SLIGHT_LEFT), new h.k(ea.x, Instruction.Type.SHARP_LEFT), new h.k(ea.y, Instruction.Type.SLIGHT_RIGHT), new h.k(ea.z, Instruction.Type.SHARP_RIGHT), new h.k(ea.A, Instruction.Type.ENTER_HOV_LANE), new h.k(ea.B, Instruction.Type.PREPARE_TURN_LEFT), new h.k(ea.C, Instruction.Type.PREPARE_TURN_RIGHT), new h.k(ea.D, Instruction.Type.PREPARE_EXIT_LEFT), new h.k(ea.E, Instruction.Type.PREPARE_EXIT_RIGHT), new h.k(ea.F, Instruction.Type.APPROACHING_STOP_POINT));

    public static final Instruction.Type a(ea eaVar) {
        h.g.b.x.f(eaVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        Instruction.Type type = Instruction.Type.NAV_INSTR_NONE;
        h.g.b.x.f(eaVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(type, "default");
        Instruction.Type type2 = (Instruction.Type) f31299c.get(eaVar);
        return type2 == null ? type : type2;
    }

    public static final ea b(Instruction.Type type) {
        ea eaVar = ea.f31285a;
        h.g.b.x.f(eaVar, "default");
        ea eaVar2 = (ea) f31298b.get(type);
        return eaVar2 == null ? eaVar : eaVar2;
    }
}
