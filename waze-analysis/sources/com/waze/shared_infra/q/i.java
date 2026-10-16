package com.waze.shared_infra.q;

import h.g.b.x;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37938a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final SimpleDateFormat f37939b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f37940c;

    /* renamed from: d, reason: collision with root package name */
    private final long f37941d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f37942e = h.g.a(new h(this, 0));

    /* JADX WARN: Removed duplicated region for block: B:6:0x0067  */
    static {
        /*
            r0 = 3
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type java.text.SimpleDateFormat"
            h.g.b.x.d(r0, r1)
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = j$.util.DesugarTimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            java.lang.String r1 = r0.toPattern()
            java.lang.String r2 = "toPattern(...)"
            h.g.b.x.e(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            h.n.l r2 = new h.n.l
            java.lang.String r3 = "y+"
            r2.<init>(r3)
            java.lang.String r3 = "yyyy"
            java.lang.String r1 = r2.b(r1, r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            h.n.l r2 = new h.n.l
            java.lang.String r3 = "M+"
            r2.<init>(r3)
            java.lang.String r3 = "MM"
            java.lang.String r1 = r2.b(r1, r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            h.n.l r2 = new h.n.l
            java.lang.String r3 = "d+"
            r2.<init>(r3)
            java.lang.String r3 = "dd"
            java.lang.String r1 = r2.b(r1, r3)
            r0.applyLocalizedPattern(r1)
            com.waze.shared_infra.q.i.f37939b = r0
            java.lang.String r0 = r0.toLocalizedPattern()
            if (r0 == 0) goto L67
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "toUpperCase(...)"
            h.g.b.x.e(r0, r1)
            if (r0 != 0) goto L69
        L67:
            java.lang.String r0 = ""
        L69:
            com.waze.shared_infra.q.i.f37940c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.shared_infra.q.i.<clinit>():void");
    }

    public /* synthetic */ i(long j2) {
        this.f37941d = j2;
    }

    static final String d(i iVar) {
        return f37939b.format(Long.valueOf(iVar.f37941d));
    }

    public final long a() {
        return this.f37941d;
    }

    public final long b() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return this.f37941d / 1000;
    }

    public final String e() {
        Object value = this.f37942e.getValue();
        x.e(value, "getValue(...)");
        return (String) value;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i) && ((i) obj).f37941d == this.f37941d;
    }

    public final String toString() {
        return e();
    }
}
