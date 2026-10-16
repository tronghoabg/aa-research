package com.waze.car_lib.o;

import android.view.View;
import com.waze.car_lib.p.dc;
import com.waze.car_lib.screens.cp;
import com.waze.settings.bk;
import com.waze.settings.de;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x extends com.waze.settings.tree.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f20495a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20496b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20497c;

    /* renamed from: d, reason: collision with root package name */
    private final dc f20498d;

    /* renamed from: e, reason: collision with root package name */
    private final dc f20499e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f20500f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.a f20501g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20502h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x(String str, com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, String str2, String str3, String str4, boolean z, dc dcVar, dc dcVar2, h.g.a.a aVar, h.g.a.a aVar2, String str5, int i2) {
        h.g.a.a cpVar = (i2 & 512) != 0 ? new cp(11) : aVar;
        h.g.a.a cpVar2 = (i2 & 1024) != 0 ? new cp(12) : aVar2;
        int i3 = i2 & 128;
        int i4 = i2 & 4;
        dc dcVar3 = (i2 & 256) != 0 ? null : dcVar2;
        dc dcVar4 = i3 != 0 ? null : dcVar;
        com.waze.ui.ac.n nVar3 = i4 != 0 ? null : nVar2;
        String str6 = (i2 & 2048) != 0 ? null : str5;
        h.g.b.x.f(str3, "messageTitle");
        h.g.b.x.f(str4, "message");
        h.g.b.x.f(cpVar, "firstActionClicked");
        h.g.b.x.f(cpVar2, "secondActionClicked");
        super(str, bk.f36871a, str2, nVar, nVar3, null, null, 480);
        this.f20495a = str3;
        this.f20496b = str4;
        this.f20497c = z;
        this.f20498d = dcVar4;
        this.f20499e = dcVar3;
        this.f20500f = cpVar;
        this.f20501g = cpVar2;
        this.f20502h = str6;
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public final dc c() {
        return this.f20498d;
    }

    public final dc d() {
        return this.f20499e;
    }

    public final String e() {
        return this.f20502h;
    }

    public final String f() {
        return this.f20496b;
    }

    public final String g() {
        return this.f20495a;
    }

    public final h.g.a.a h() {
        return this.f20500f;
    }

    public final h.g.a.a i() {
        return this.f20501g;
    }

    public final boolean j() {
        return this.f20497c;
    }
}
