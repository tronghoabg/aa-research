package com.waze.navigate;

import com.waze.jni.protos.navigate.Instruction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ea {
    public static final ea A;
    public static final ea B;
    public static final ea C;
    public static final ea D;
    public static final ea E;
    public static final ea F;
    private static final /* synthetic */ ea[] G;

    /* renamed from: a, reason: collision with root package name */
    public static final ea f31285a;

    /* renamed from: b, reason: collision with root package name */
    public static final ea f31286b;

    /* renamed from: c, reason: collision with root package name */
    public static final ea f31287c;

    /* renamed from: d, reason: collision with root package name */
    public static final ea f31288d;

    /* renamed from: e, reason: collision with root package name */
    public static final ea f31289e;

    /* renamed from: f, reason: collision with root package name */
    public static final ea f31290f;

    /* renamed from: g, reason: collision with root package name */
    public static final ea f31291g;

    /* renamed from: h, reason: collision with root package name */
    public static final ea f31292h;

    /* renamed from: i, reason: collision with root package name */
    public static final ea f31293i;

    /* renamed from: j, reason: collision with root package name */
    public static final ea f31294j;

    /* renamed from: k, reason: collision with root package name */
    public static final ea f31295k;

    /* renamed from: l, reason: collision with root package name */
    public static final ea f31296l;
    public static final ea m;
    public static final ea n;
    public static final ea o;
    public static final ea p;
    public static final ea q;
    public static final ea r;
    public static final ea s;
    public static final ea t;
    public static final ea u;
    public static final ea v;
    public static final ea w;
    public static final ea x;
    public static final ea y;
    public static final ea z;

    static {
        Instruction.Type type = Instruction.Type.NAV_INSTR_NONE;
        ea eaVar = new ea("NAV_INSTR_NONE", 0);
        f31285a = eaVar;
        ea eaVar2 = new ea("TURN_LEFT", 1);
        f31286b = eaVar2;
        ea eaVar3 = new ea("TURN_RIGHT", 2);
        f31287c = eaVar3;
        ea eaVar4 = new ea("KEEP_LEFT", 3);
        f31288d = eaVar4;
        ea eaVar5 = new ea("KEEP_RIGHT", 4);
        f31289e = eaVar5;
        ea eaVar6 = new ea("CONTINUE_STRAIGHT", 5);
        f31290f = eaVar6;
        ea eaVar7 = new ea("ROUNDABOUT_ENTER", 6);
        f31291g = eaVar7;
        ea eaVar8 = new ea("ROUNDABOUT_EXIT", 7);
        f31292h = eaVar8;
        ea eaVar9 = new ea("ROUNDABOUT_LEFT", 8);
        f31293i = eaVar9;
        ea eaVar10 = new ea("ROUNDABOUT_EXIT_LEFT", 9);
        f31294j = eaVar10;
        ea eaVar11 = new ea("ROUNDABOUT_STRAIGHT", 10);
        f31295k = eaVar11;
        ea eaVar12 = new ea("ROUNDABOUT_EXIT_STRAIGHT", 11);
        f31296l = eaVar12;
        ea eaVar13 = new ea("ROUNDABOUT_RIGHT", 12);
        m = eaVar13;
        ea eaVar14 = new ea("ROUNDABOUT_EXIT_RIGHT", 13);
        n = eaVar14;
        ea eaVar15 = new ea("ROUNDABOUT_U", 14);
        o = eaVar15;
        ea eaVar16 = new ea("ROUNDABOUT_EXIT_U", 15);
        p = eaVar16;
        ea eaVar17 = new ea("APPROACHING_DESTINATION", 16);
        q = eaVar17;
        ea eaVar18 = new ea("EXIT_LEFT", 17);
        r = eaVar18;
        ea eaVar19 = new ea("EXIT_RIGHT", 18);
        s = eaVar19;
        ea eaVar20 = new ea("WAYPOINT_DELAY", 19);
        t = eaVar20;
        ea eaVar21 = new ea("U_TURN", 20);
        u = eaVar21;
        ea eaVar22 = new ea("LAST_DIRECTION", 21);
        v = eaVar22;
        ea eaVar23 = new ea("SLIGHT_LEFT", 22);
        w = eaVar23;
        ea eaVar24 = new ea("SHARP_LEFT", 23);
        x = eaVar24;
        ea eaVar25 = new ea("SLIGHT_RIGHT", 24);
        y = eaVar25;
        ea eaVar26 = new ea("SHARP_RIGHT", 25);
        z = eaVar26;
        ea eaVar27 = new ea("ENTER_HOV_LANE", 26);
        A = eaVar27;
        ea eaVar28 = new ea("PREPARE_TURN_LEFT", 27);
        B = eaVar28;
        ea eaVar29 = new ea("PREPARE_TURN_RIGHT", 28);
        C = eaVar29;
        ea eaVar30 = new ea("PREPARE_EXIT_LEFT", 29);
        D = eaVar30;
        ea eaVar31 = new ea("PREPARE_EXIT_RIGHT", 30);
        E = eaVar31;
        ea eaVar32 = new ea("APPROACHING_STOP_POINT", 31);
        F = eaVar32;
        ea[] eaVarArr = {eaVar, eaVar2, eaVar3, eaVar4, eaVar5, eaVar6, eaVar7, eaVar8, eaVar9, eaVar10, eaVar11, eaVar12, eaVar13, eaVar14, eaVar15, eaVar16, eaVar17, eaVar18, eaVar19, eaVar20, eaVar21, eaVar22, eaVar23, eaVar24, eaVar25, eaVar26, eaVar27, eaVar28, eaVar29, eaVar30, eaVar31, eaVar32};
        G = eaVarArr;
        h.d.b.a(eaVarArr);
    }

    public static ea[] values() {
        return (ea[]) G.clone();
    }
}
