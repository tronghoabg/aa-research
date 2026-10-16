package com.waze.feedback;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final MutableLiveData f23869a = new MutableLiveData();

    /* renamed from: b, reason: collision with root package name */
    private final MutableLiveData f23870b = new MutableLiveData();

    /* renamed from: c, reason: collision with root package name */
    private boolean f23871c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23872d;

    static final void e(i iVar) {
        com.waze.shared_infra.i.h.i("FeedbackActivity", "logs submitted");
        iVar.f23872d = false;
        iVar.f();
    }

    private final void f() {
        this.f23870b.setValue(Boolean.valueOf(this.f23871c && this.f23872d));
        this.f23869a.setValue(Boolean.valueOf(this.f23871c && !this.f23872d));
    }

    public final MutableLiveData a() {
        return this.f23870b;
    }

    public final MutableLiveData b() {
        return this.f23869a;
    }

    public final void c() {
        this.f23871c = true;
        f();
    }

    public final void d(String str) {
        x.f(str, "logId");
        this.f23872d = true;
        f();
        com.waze.sharedui.h.k().i(new Runnable() { // from class: com.waze.feedback.h
            @Override // java.lang.Runnable
            public final void run() {
                i.e(this.f23868a);
            }
        });
    }
}
