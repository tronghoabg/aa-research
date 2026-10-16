package com.waze.sound;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    public static final bp f39554a;

    /* renamed from: b, reason: collision with root package name */
    public static final bp f39555b;

    /* renamed from: c, reason: collision with root package name */
    public static final bp f39556c;

    /* renamed from: d, reason: collision with root package name */
    public static final bp f39557d;

    /* renamed from: e, reason: collision with root package name */
    public static final bp f39558e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map f39559f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ bp[] f39560g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f39561h;

    /* renamed from: i, reason: collision with root package name */
    private final String f39562i;

    static {
        bp bpVar = new bp("ON", 0, "yes");
        f39554a = bpVar;
        bp bpVar2 = new bp("BRIEF", 1, "brief");
        f39555b = bpVar2;
        bp bpVar3 = new bp("SMART", 2, "smart");
        f39556c = bpVar3;
        bp bpVar4 = new bp("ALERTS", 3, "alerts");
        f39557d = bpVar4;
        bp bpVar5 = new bp("OFF", 4, "no");
        f39558e = bpVar5;
        bp[] bpVarArr = {bpVar, bpVar2, bpVar3, bpVar4, bpVar5};
        f39560g = bpVarArr;
        h.d.a aVarA = h.d.b.a(bpVarArr);
        f39561h = aVarA;
        h.d.a aVar = aVarA;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(aVar, 10)), 16));
        for (Object obj : aVar) {
            linkedHashMap.put(((bp) obj).f39562i, obj);
        }
        f39559f = linkedHashMap;
    }

    private bp(String str, int i2, String str2) {
        this.f39562i = str2;
    }

    public static bp[] values() {
        return (bp[]) f39560g.clone();
    }

    public final String a() {
        return this.f39562i;
    }
}
