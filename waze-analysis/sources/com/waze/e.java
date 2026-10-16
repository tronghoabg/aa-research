package com.waze;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f23608a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f23609b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f23610c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f23611d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f23612e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f23613f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f23614g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f23615h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f23616i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f23617j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f23618k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ e[] f23619l;
    private static final /* synthetic */ h.d.a m;
    private final String n;

    static {
        e eVar = new e("ALERT_PROVIDER_ID_UNSPECIFIED", 0, "Unspecified");
        f23608a = eVar;
        e eVar2 = new e("ALERT_PROVIDER_ID_AVERAGE_SPEED_CAM", 1, "AverageSpeedCam");
        f23609b = eVar2;
        e eVar3 = new e("ALERT_PROVIDER_ID_DANGER_ZONE", 2, "DangerZone");
        f23610c = eVar3;
        e eVar4 = new e("ALERT_PROVIDER_ID_GUARDIAN", 3, "GuardianAlert");
        f23611d = eVar4;
        e eVar5 = new e("ALERT_PROVIDER_ID_LIGHTS", 4, "LightsAlert");
        f23612e = eVar5;
        e eVar6 = new e("ALERT_PROVIDER_ID_REALTIME", 5, "RealtimeAlert");
        f23613f = eVar6;
        e eVar7 = new e("ALERT_PROVIDER_ID_TILE", 6, "TileAlert");
        f23614g = eVar7;
        e eVar8 = new e("ALERT_PROVIDER_ID_ECO_REGULATION", 7, "EcoRegulation");
        f23615h = eVar8;
        e eVar9 = new e("ALERT_PROVIDER_ID_REROUTE_SUGGESTION", 8, "RerouteSuggestion");
        f23616i = eVar9;
        e eVar10 = new e("ALERT_PROVIDER_ID_CAMERAS", 9, "Cameras");
        f23617j = eVar10;
        e eVar11 = new e("ALERT_PROVIDER_ID_INSIGHTS_INFRA", 10, "InsightsInfra");
        f23618k = eVar11;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11};
        f23619l = eVarArr;
        h.d.a aVarA = h.d.b.a(eVarArr);
        m = aVarA;
        h.d.a aVar = aVarA;
        ArrayList arrayList = new ArrayList(h.a.i.q(aVar, 10));
        Iterator<E> it = aVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((e) it.next()).n);
        }
    }

    private e(String str, int i2, String str2) {
        this.n = str2;
    }

    public static e[] values() {
        return (e[]) f23619l.clone();
    }

    public final String a() {
        return this.n;
    }
}
