package com.google.firebase.remoteconfig.internal;

import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements com.google.android.gms.o.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f10660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10661b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f10662c;

    public /* synthetic */ d(Object obj, Object obj2, int i2) {
        this.f10662c = i2;
        this.f10660a = obj;
        this.f10661b = obj2;
    }

    @Override // com.google.android.gms.o.s
    public final com.google.android.gms.o.t a(Object obj) {
        if (this.f10662c == 0) {
            return f.h((f) this.f10660a, (h) this.f10661b);
        }
        Object obj2 = this.f10661b;
        return FirebaseInstanceId.p((FirebaseInstanceId) this.f10660a, (String) obj2, (String) obj);
    }
}
