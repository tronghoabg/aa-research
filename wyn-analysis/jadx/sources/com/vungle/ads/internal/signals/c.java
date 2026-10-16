package com.vungle.ads.internal.signals;

import Va.M6;
import Wf.AbstractC1240b0;
import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f33640a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33641b;

    /* renamed from: c, reason: collision with root package name */
    public long f33642c;

    /* renamed from: d, reason: collision with root package name */
    public List f33643d;

    /* renamed from: e, reason: collision with root package name */
    public long f33644e;

    /* renamed from: f, reason: collision with root package name */
    public int f33645f;

    /* renamed from: g, reason: collision with root package name */
    public List f33646g;

    /* renamed from: h, reason: collision with root package name */
    public int f33647h;

    /* renamed from: i, reason: collision with root package name */
    public int f33648i;

    /* renamed from: j, reason: collision with root package name */
    public int f33649j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f33650l;

    public c(int i5) {
        this.f33640a = i5;
        String string = UUID.randomUUID().toString();
        AbstractC3340k.d(string, "randomUUID().toString()");
        this.f33641b = string;
        this.f33642c = System.currentTimeMillis() / 1000;
        this.f33643d = new ArrayList();
        this.f33646g = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.vungle.ads.internal.signals.c r7, Vf.b r8, Wf.C1244d0 r9) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.signals.c.a(com.vungle.ads.internal.signals.c, Vf.b, Wf.d0):void");
    }

    public final List b() {
        return this.f33643d;
    }

    public final List c() {
        return this.f33646g;
    }

    public final void d(int i5) {
        this.k = i5;
    }

    public final void e(int i5) {
        this.f33648i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f33640a == ((c) obj).f33640a;
    }

    public final int hashCode() {
        return this.f33640a;
    }

    public final String toString() {
        return M6.r(com.iab.omid.library.vungle.internal.l.a("SessionData(sessionCount="), this.f33640a, ')');
    }

    public final void b(int i5) {
        this.f33650l = i5;
    }

    public final void c(int i5) {
        this.f33649j = i5;
    }

    public /* synthetic */ c(int i5, int i10, String str, long j8, List list, long j10, int i11, List list2, int i12, int i13, int i14, int i15, int i16) {
        if (1 != (i5 & 1)) {
            AbstractC1240b0.k(i5, 1, a.f33638a.getDescriptor());
            throw null;
        }
        this.f33640a = i10;
        if ((i5 & 2) == 0) {
            String string = UUID.randomUUID().toString();
            AbstractC3340k.d(string, "randomUUID().toString()");
            this.f33641b = string;
        } else {
            this.f33641b = str;
        }
        if ((i5 & 4) == 0) {
            this.f33642c = System.currentTimeMillis() / 1000;
        } else {
            this.f33642c = j8;
        }
        if ((i5 & 8) == 0) {
            this.f33643d = new ArrayList();
        } else {
            this.f33643d = list;
        }
        if ((i5 & 16) == 0) {
            this.f33644e = 0L;
        } else {
            this.f33644e = j10;
        }
        if ((i5 & 32) == 0) {
            this.f33645f = 0;
        } else {
            this.f33645f = i11;
        }
        if ((i5 & 64) == 0) {
            this.f33646g = new ArrayList();
        } else {
            this.f33646g = list2;
        }
        if ((i5 & 128) == 0) {
            this.f33647h = 0;
        } else {
            this.f33647h = i12;
        }
        if ((i5 & 256) == 0) {
            this.f33648i = 0;
        } else {
            this.f33648i = i13;
        }
        if ((i5 & 512) == 0) {
            this.f33649j = 0;
        } else {
            this.f33649j = i14;
        }
        if ((i5 & Segment.SHARE_MINIMUM) == 0) {
            this.k = 0;
        } else {
            this.k = i15;
        }
        if ((i5 & 2048) == 0) {
            this.f33650l = 0;
        } else {
            this.f33650l = i16;
        }
    }

    public final String a() {
        return this.f33641b;
    }

    public final void a(ArrayList arrayList) {
        AbstractC3340k.e(arrayList, "<set-?>");
        this.f33646g = arrayList;
    }

    public final void a(int i5) {
        this.f33647h = i5;
    }
}
