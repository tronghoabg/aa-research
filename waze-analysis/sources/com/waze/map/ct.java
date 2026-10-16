package com.waze.map;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes6.dex */
public final class ct {

    /* renamed from: a, reason: collision with root package name */
    private final String f28704a;

    private /* synthetic */ ct(String str) {
        this.f28704a = str;
    }

    public static final /* synthetic */ ct a(String str) {
        return new ct(str);
    }

    public static String b(String str) {
        return "MapObjectId(string=" + str + ")";
    }

    public static void d(String str) {
        h.g.b.x.f(str, TypedValues.Custom.S_STRING);
    }

    public final /* synthetic */ String c() {
        return this.f28704a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ct) && h.g.b.x.n(this.f28704a, ((ct) obj).f28704a);
    }

    public final int hashCode() {
        return this.f28704a.hashCode();
    }

    public final String toString() {
        return b(this.f28704a);
    }
}
