package com.google.android.gms.location.a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.api.internal.az;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends ad {

    /* renamed from: e, reason: collision with root package name */
    private final SimpleArrayMap f5673e;

    /* renamed from: f, reason: collision with root package name */
    private final SimpleArrayMap f5674f;

    /* renamed from: g, reason: collision with root package name */
    private final SimpleArrayMap f5675g;

    public f(Context context, Looper looper, p pVar, r rVar, az azVar) {
        super(context, looper, 23, pVar, rVar, azVar);
        this.f5673e = new SimpleArrayMap();
        this.f5674f = new SimpleArrayMap();
        this.f5675g = new SimpleArrayMap();
        new SimpleArrayMap();
    }

    @Override // com.google.android.gms.common.internal.ad, com.google.android.gms.common.internal.m, com.google.android.gms.common.api.h
    public final int a() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.m
    public final void ab() {
        System.currentTimeMillis();
        SimpleArrayMap simpleArrayMap = this.f5673e;
        synchronized (simpleArrayMap) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap simpleArrayMap2 = this.f5674f;
        synchronized (simpleArrayMap2) {
            simpleArrayMap2.clear();
        }
        SimpleArrayMap simpleArrayMap3 = this.f5675g;
        synchronized (simpleArrayMap3) {
            simpleArrayMap3.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.m
    protected final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String d() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.m
    protected final String e() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.m
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.m
    public final com.google.android.gms.common.f[] h() {
        return com.google.android.gms.location.a.q;
    }
}
