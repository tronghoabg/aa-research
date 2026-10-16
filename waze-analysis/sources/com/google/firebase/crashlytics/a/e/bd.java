package com.google.firebase.crashlytics.a.e;

import androidx.compose.foundation.style.StylePropertiesKt;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private int f9421a;

    /* renamed from: b, reason: collision with root package name */
    private String f9422b;

    /* renamed from: c, reason: collision with root package name */
    private int f9423c;

    /* renamed from: d, reason: collision with root package name */
    private int f9424d;

    /* renamed from: e, reason: collision with root package name */
    private long f9425e;

    /* renamed from: f, reason: collision with root package name */
    private long f9426f;

    /* renamed from: g, reason: collision with root package name */
    private long f9427g;

    /* renamed from: h, reason: collision with root package name */
    private String f9428h;

    /* renamed from: i, reason: collision with root package name */
    private List f9429i;

    /* renamed from: j, reason: collision with root package name */
    private byte f9430j;

    public final be a() {
        String str;
        if (this.f9430j == 63 && (str = this.f9422b) != null) {
            return new ac(this.f9421a, str, this.f9423c, this.f9424d, this.f9425e, this.f9426f, this.f9427g, this.f9428h, this.f9429i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f9430j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.f9422b == null) {
            sb.append(" processName");
        }
        if ((this.f9430j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.f9430j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.f9430j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.f9430j & StylePropertiesKt.BottomId) == 0) {
            sb.append(" rss");
        }
        if ((this.f9430j & StylePropertiesKt.ZIndexId) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        this.f9429i = list;
    }

    public final void c(int i2) {
        this.f9424d = i2;
        this.f9430j = (byte) (this.f9430j | 4);
    }

    public final void d(int i2) {
        this.f9421a = i2;
        this.f9430j = (byte) (this.f9430j | 1);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null processName");
        }
        this.f9422b = str;
    }

    public final void f(long j2) {
        this.f9425e = j2;
        this.f9430j = (byte) (this.f9430j | 8);
    }

    public final void g(int i2) {
        this.f9423c = i2;
        this.f9430j = (byte) (this.f9430j | 2);
    }

    public final void h(long j2) {
        this.f9426f = j2;
        this.f9430j = (byte) (this.f9430j | StylePropertiesKt.BottomId);
    }

    public final void i(long j2) {
        this.f9427g = j2;
        this.f9430j = (byte) (this.f9430j | StylePropertiesKt.ZIndexId);
    }

    public final void j(String str) {
        this.f9428h = str;
    }
}
