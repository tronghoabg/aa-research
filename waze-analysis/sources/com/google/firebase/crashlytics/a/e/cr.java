package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cr {

    /* renamed from: a, reason: collision with root package name */
    private Object f9543a;

    public final cs a() {
        Object obj = this.f9543a;
        if (obj != null) {
            return new ba((String) obj);
        }
        throw new IllegalStateException("Missing required properties: identifier");
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        this.f9543a = str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final cn c() {
        ?? r1 = this.f9543a;
        if (r1 != 0) {
            return new ay(r1);
        }
        throw new IllegalStateException("Missing required properties: rolloutAssignments");
    }

    public final void d(List list) {
        if (list == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f9543a = list;
    }

    public final ci e() {
        Object obj = this.f9543a;
        if (obj != null) {
            return new av((String) obj);
        }
        throw new IllegalStateException("Missing required properties: content");
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null content");
        }
        this.f9543a = str;
    }
}
