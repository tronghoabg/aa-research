package com.google.android.gms.auth.api.identity;

import com.google.android.gms.common.api.internal.av;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private String f4538a;

    /* renamed from: b, reason: collision with root package name */
    private String f4539b;

    /* renamed from: c, reason: collision with root package name */
    private String f4540c;

    /* renamed from: d, reason: collision with root package name */
    private List f4541d;

    /* renamed from: e, reason: collision with root package name */
    private String f4542e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4543f;

    /* renamed from: g, reason: collision with root package name */
    private int f4544g;

    public final s a() {
        return new s(this.f4538a, this.f4539b, this.f4540c, this.f4542e, this.f4543f, this.f4544g, this.f4541d);
    }

    public final void b(String str) {
        this.f4539b = str;
    }

    public final void c(List list) {
        this.f4541d = list;
    }

    public final void d(String str) {
        this.f4542e = str;
    }

    @Deprecated
    public final void e(boolean z) {
        this.f4543f = z;
    }

    public final void f(String str) {
        av.m(str);
        this.f4538a = str;
    }

    public final void g(String str) {
        this.f4540c = str;
    }

    public final void h(int i2) {
        this.f4544g = i2;
    }
}
