package com.waze.ui.m;

import androidx.autofill.HintConstants;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ds extends dt {

    /* renamed from: a, reason: collision with root package name */
    private final String f42999a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f43000b;

    /* renamed from: c, reason: collision with root package name */
    private final List f43001c;

    /* renamed from: d, reason: collision with root package name */
    private final List f43002d;

    /* renamed from: e, reason: collision with root package name */
    private final String f43003e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f43004f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(String str, Integer num, List list, List list2, String str2, boolean z) {
        super(null);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(list, "badges");
        h.g.b.x.f(list2, "parkingRates");
        this.f42999a = str;
        this.f43000b = num;
        this.f43001c = list;
        this.f43002d = list2;
        this.f43003e = str2;
        this.f43004f = z;
    }

    public final Integer a() {
        return this.f43000b;
    }

    public final String b() {
        return this.f42999a;
    }

    public final String c() {
        return this.f43003e;
    }

    public final List d() {
        return this.f43001c;
    }

    public final List e() {
        return this.f43002d;
    }

    public final boolean f() {
        return this.f43004f;
    }
}
