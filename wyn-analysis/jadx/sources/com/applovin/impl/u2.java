package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class u2 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f23322a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23323b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23324c;

    /* renamed from: d, reason: collision with root package name */
    private final e3 f23325d;

    public u2(String str, String str2, boolean z2, e3 e3Var) {
        this.f23322a = str;
        this.f23323b = str2;
        this.f23324c = z2;
        this.f23325d = e3Var;
    }

    public String a() {
        return this.f23323b;
    }

    public List b() {
        List listL = this.f23325d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f23322a) : listL;
    }

    public String c() {
        return this.f23322a;
    }

    public e3 d() {
        return this.f23325d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u2 u2Var = (u2) obj;
            String str = this.f23322a;
            if (str == null ? u2Var.f23322a != null : !str.equals(u2Var.f23322a)) {
                return false;
            }
            String str2 = this.f23323b;
            if (str2 == null ? u2Var.f23323b != null : !str2.equals(u2Var.f23323b)) {
                return false;
            }
            if (this.f23324c == u2Var.f23324c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f23322a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23323b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f23324c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(u2 u2Var) {
        return this.f23323b.compareToIgnoreCase(u2Var.f23323b);
    }
}
