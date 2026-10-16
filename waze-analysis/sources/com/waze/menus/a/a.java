package com.waze.menus.a;

import com.waze.R;
import com.waze.design_components.b.d;
import com.waze.menus.a.a.g;
import com.waze.ui.ac.f;
import com.waze.ui.ac.j;
import com.waze.ui.ac.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29638a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f29639b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f29640c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f29641d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f29642e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f29643f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f29644g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f29645h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f29646i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f29647j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f29648k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f29649l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    private static final /* synthetic */ a[] w;
    private final n x;
    private final f y;

    static {
        a aVar = new a("EditHome", 0, new j(R.string.DESTINATION_MENU_EDIT_HOME), new f(d.t.b()));
        f29638a = aVar;
        a aVar2 = new a("EditWork", 1, new j(R.string.DESTINATION_MENU_EDIT_WORK), new f(d.t.b()));
        f29639b = aVar2;
        a aVar3 = new a("MarkSaved", 2, new j(R.string.DESTINATION_MENU_SAVE), new f(d.M.b()));
        f29640c = aVar3;
        a aVar4 = new a("EditArrivalTime", 3, new j(R.string.DESTINATION_MENU_PLANNED_EDIT_DRIVE), new f(d.P.b()));
        f29641d = aVar4;
        a aVar5 = new a("RenameSaved", 4, new j(R.string.DESTINATION_MENU_RENAME), new f(d.t.b()));
        f29642e = aVar5;
        a aVar6 = new a("Info", 5, new j(R.string.DESTINATION_MENU_INFO), new f(d.ag.b()));
        f29643f = aVar6;
        a aVar7 = new a("CalendarSettings", 6, new j(R.string.DESTINATION_MENU_CALENDAR_SETTINGS), new f(d.f23310k.b()));
        f29644g = aVar7;
        a aVar8 = new a("CalendarEventSetAddress", 7, new j(R.string.DESTINATION_MENU_CALENDAR_EVENT_SET_ADDRESS), new f(d.al.b()));
        f29645h = aVar8;
        a aVar9 = new a("CalendarEventChangeLocation", 8, new j(R.string.DESTINATION_MENU_CALENDAR_EVENT_CHANGE_LOCATION), new f(d.am.b()));
        f29646i = aVar9;
        a aVar10 = new a("PlannedDriveSettings", 9, new j(R.string.DESTINATION_MENU_PLANNED_DRIVE_SETTINGS), new f(d.f23310k.b()));
        f29647j = aVar10;
        a aVar11 = new a("SendLocation", 10, new j(R.string.DESTINATION_MENU_SEND_LOCATION), new f(d.I.b()));
        f29648k = aVar11;
        a aVar12 = new a("FindParking", 11, new j(R.string.DESTINATION_MENU_FIND_PARKING), new f(d.af.b()));
        f29649l = aVar12;
        a aVar13 = new a("RemoveDrive", 12, new j(R.string.DESTINATION_MENU_REMOVE_DRIVE), new f(d.Q.b()));
        m = aVar13;
        a aVar14 = new a("RemoveHome", 13, new j(R.string.DESTINATION_MENU_REMOVE_HOME), new f(d.Q.b()));
        n = aVar14;
        a aVar15 = new a("RemoveWork", 14, new j(R.string.DESTINATION_MENU_REMOVE_WORK), new f(d.Q.b()));
        o = aVar15;
        a aVar16 = new a("RemovePlannedDrive", 15, new j(R.string.DESTINATION_MENU_REMOVE_PLANNED), new f(d.Q.b()));
        p = aVar16;
        a aVar17 = new a("RemoveSavedPlace", 16, new j(R.string.DESTINATION_MENU_REMOVE_SAVED_PLACE), new f(d.an.b()));
        q = aVar17;
        a aVar18 = new a("RemoveSuggestion", 17, new j(R.string.DESTINATION_MENU_REMOVE_SUGGESTION), new f(d.Q.b()));
        r = aVar18;
        a aVar19 = new a("RemoveAd", 18, new j(R.string.DESTINATION_MENU_REMOVE_AD), new f(d.Q.b()));
        s = aVar19;
        a aVar20 = new a("RemoveSimilarSuggestions", 19, new j(R.string.DESTINATION_MENU_REMOVE_SIMILAR), new f(d.ao.b()));
        t = aVar20;
        a aVar21 = new a("RemoveUnverifiedCalendarEvent", 20, new j(R.string.DESTINATION_MENU_CALENDAR_EVENT_REMOVE_EVENT), new f(d.Q.b()));
        u = aVar21;
        a aVar22 = new a("RemoveThisCalendarEvent", 21, new j(R.string.DESTINATION_MENU_CALENDAR_EVENT_REMOVE_EVENT), new f(d.Q.b()));
        v = aVar22;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22};
        w = aVarArr;
        h.d.b.a(aVarArr);
    }

    /* synthetic */ a(String str, int i2, n nVar, f fVar) {
        this.x = nVar;
        this.y = fVar;
    }

    public static a[] values() {
        return (a[]) w.clone();
    }

    @Override // com.waze.menus.a.a.g
    public final f a() {
        return this.y;
    }

    @Override // com.waze.menus.a.a.g
    public final n b() {
        return this.x;
    }

    @Override // com.waze.menus.a.a.g
    public final void c() {
    }
}
