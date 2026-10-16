package com.google.android.datatransport.runtime;

import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private String f4201a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f4202b;

    /* renamed from: c, reason: collision with root package name */
    private l f4203c;

    /* renamed from: d, reason: collision with root package name */
    private long f4204d;

    /* renamed from: e, reason: collision with root package name */
    private long f4205e;

    /* renamed from: f, reason: collision with root package name */
    private Map f4206f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f4207g;

    /* renamed from: h, reason: collision with root package name */
    private String f4208h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f4209i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f4210j;

    /* renamed from: k, reason: collision with root package name */
    private List f4211k;

    /* renamed from: l, reason: collision with root package name */
    private String f4212l;
    private byte m;

    public final n a() {
        String str;
        l lVar;
        Map map;
        if (this.m == 3 && (str = this.f4201a) != null && (lVar = this.f4203c) != null && (map = this.f4206f) != null) {
            return new n(str, this.f4202b, lVar, this.f4204d, this.f4205e, map, this.f4207g, this.f4208h, this.f4209i, this.f4210j, this.f4211k, this.f4212l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4201a == null) {
            sb.append(" transportName");
        }
        if (this.f4203c == null) {
            sb.append(" encodedPayload");
        }
        if ((this.m & 1) == 0) {
            sb.append(" eventMillis");
        }
        if ((this.m & 2) == 0) {
            sb.append(" uptimeMillis");
        }
        if (this.f4206f == null) {
            sb.append(" autoMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    protected final Map b() {
        Map map = this.f4206f;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public final void c(String str, int i2) {
        b().put(str, String.valueOf(i2));
    }

    public final void d(long j2) {
        b().put("tz-offset", String.valueOf(j2));
    }

    public final void e(String str, String str2) {
        b().put(str, str2);
    }

    protected final void f(Map map) {
        this.f4206f = map;
    }

    public final void g(Integer num) {
        this.f4202b = num;
    }

    public final void h(l lVar) {
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        this.f4203c = lVar;
    }

    public final void i(long j2) {
        this.f4204d = j2;
        this.m = (byte) (this.m | 1);
    }

    public final void j(byte[] bArr) {
        this.f4209i = bArr;
    }

    public final void k(byte[] bArr) {
        this.f4210j = bArr;
    }

    public final void l(List list) {
        this.f4211k = list;
    }

    public final void m(Integer num) {
        this.f4207g = num;
    }

    public final void n(String str) {
        this.f4208h = str;
    }

    public final void o(String str) {
        this.f4212l = str;
    }

    public final void p(String str) {
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        this.f4201a = str;
    }

    public final void q(long j2) {
        this.f4205e = j2;
        this.m = (byte) (this.m | 2);
    }
}
