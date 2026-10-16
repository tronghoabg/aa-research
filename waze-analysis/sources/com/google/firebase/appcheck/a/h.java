package com.google.firebase.appcheck.a;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements com.google.firebase.g.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f8866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8867b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f8868c;

    public /* synthetic */ h(Context context, String str, int i2) {
        this.f8868c = i2;
        this.f8866a = context;
        this.f8867b = str;
    }

    @Override // com.google.firebase.g.c
    public final Object a() {
        if (this.f8868c != 0) {
            return com.google.firebase.e.o((com.google.firebase.e) this.f8867b, this.f8866a);
        }
        int i2 = i.f8869a;
        return this.f8866a.getSharedPreferences((String) this.f8867b, 0);
    }

    public /* synthetic */ h(com.google.firebase.e eVar, Context context, int i2) {
        this.f8868c = i2;
        this.f8867b = eVar;
        this.f8866a = context;
    }
}
