package com.applovin.impl;

import com.applovin.impl.C1669v0;
import com.applovin.impl.sdk.utils.StringUtils;

/* renamed from: com.applovin.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1665t0 {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f23277a = new StringBuilder();

    public void a(C1669v0 c1669v0, long j8) {
        if (c1669v0.d() == C1669v0.b.DECISION) {
            return;
        }
        a(a(c1669v0), j8);
    }

    public void b() {
        a("Invalid Activity");
    }

    public String toString() {
        return this.f23277a.toString();
    }

    public void b(String str) {
        a(R8.v.f("Invalid state: ", str));
    }

    public void a(C1669v0 c1669v0, boolean z2, long j8) {
        a(a(c1669v0) + ": " + z2, j8);
    }

    public void a() {
        this.f23277a.setLength(0);
    }

    private void a(String str, long j8) {
        a(str + " after " + j8 + "ms");
    }

    private void a(String str) {
        StringBuilder sb2 = this.f23277a;
        sb2.append(str);
        sb2.append("\n");
    }

    private String a(C1669v0 c1669v0) {
        C1669v0.b bVarD = c1669v0.d();
        if (bVarD == C1669v0.b.EVENT) {
            return ((C1675y0) c1669v0).g();
        }
        if (bVarD == C1669v0.b.DECISION) {
            return StringUtils.emptyIfNull(c1669v0.b());
        }
        return StringUtils.emptyIfNull(c1669v0.e());
    }
}
