package com.waze.reports;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f33678a;

    bb(int i2) {
        this.f33678a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i3 = this.f33678a;
        if (i3 == 0) {
            bc.f33679a = NativeManager.getInstance().venueProviderGetFieldPoints();
            return;
        }
        if (i3 == 1) {
            ar.c();
            return;
        }
        if (i3 != 2) {
            be.f33687a = NativeManager.getInstance().venueProviderGetFieldValidators();
            return;
        }
        bd.f33680a = NativeManager.getInstance().venueProviderGetServices();
        synchronized (bd.f33681b) {
            bd.f33681b.clear();
            for (int i4 = 0; i4 < bd.f33680a.count; i4++) {
                bd.f33681b.put(bd.f33680a.ids[i4], bd.f33680a.names[i4]);
            }
        }
        synchronized (bd.f33682c) {
            bd.f33682c.clear();
            for (i2 = 0; i2 < bd.f33680a.count; i2++) {
                bd.f33682c.put(bd.f33680a.ids[i2], bd.f33680a.icons[i2]);
            }
        }
    }

    public /* synthetic */ bb(int i2, byte[] bArr) {
        this.f33678a = i2;
    }
}
