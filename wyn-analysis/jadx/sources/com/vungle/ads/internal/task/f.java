package com.vungle.ads.internal.task;

import android.os.Bundle;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class f implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final String f33684a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33685b;

    /* renamed from: c, reason: collision with root package name */
    public long f33686c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f33687d;

    /* renamed from: e, reason: collision with root package name */
    public int f33688e;

    public f(String jobTag) {
        AbstractC3340k.e(jobTag, "jobTag");
        this.f33684a = jobTag;
        this.f33687d = new Bundle();
        this.f33688e = 2;
    }

    public final f a(Bundle extras) {
        AbstractC3340k.e(extras, "extras");
        this.f33687d = extras;
        return this;
    }

    public final long b() {
        return this.f33686c;
    }

    public final Bundle c() {
        return this.f33687d;
    }

    public final Object clone() {
        return super.clone();
    }

    public final String d() {
        return this.f33684a;
    }

    public final int e() {
        return this.f33688e;
    }

    public final boolean f() {
        return this.f33685b;
    }

    public final void g() {
        this.f33686c = 0L;
    }

    public final f a() throws CloneNotSupportedException {
        try {
            Object objClone = super.clone();
            AbstractC3340k.c(objClone, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (f) objClone;
        } catch (CloneNotSupportedException e7) {
            boolean z2 = u.f33874a;
            t.a("JobInfo", "Cannot copy JobInfo " + this, e7);
            return null;
        }
    }
}
