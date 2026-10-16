package com.google.firebase.crashlytics.a.e;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cx {

    /* renamed from: a, reason: collision with root package name */
    private final String f9561a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9562b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9563c;

    cx(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f9561a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f9562b = str2;
        this.f9563c = z;
    }

    public static cx a(String str, String str2, boolean z) {
        return new cx(str, str2, z);
    }

    public final String b() {
        return this.f9562b;
    }

    public final String c() {
        return this.f9561a;
    }

    public final boolean d() {
        return this.f9563c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cx) {
            cx cxVar = (cx) obj;
            if (this.f9561a.equals(cxVar.f9561a) && this.f9562b.equals(cxVar.f9562b) && this.f9563c == cxVar.f9563c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f9563c ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS) ^ ((((this.f9561a.hashCode() ^ 1000003) * 1000003) ^ this.f9562b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f9561a + ", osCodeName=" + this.f9562b + ", isRooted=" + this.f9563c + "}";
    }

    public cx() {
        throw null;
    }
}
