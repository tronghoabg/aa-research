package com.waze.beacons;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f16279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16280b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f16281c;

    public /* synthetic */ q(u uVar, String str, int i2) {
        this.f16281c = i2;
        this.f16279a = uVar;
        this.f16280b = str;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16281c != 0) {
            BeaconsNativeManager.dumpEntries$lambda$0(this.f16280b, (BeaconsNativeManager) this.f16279a);
        } else {
            u.api_beginJNI$lambda$0(this.f16279a, (String) this.f16280b);
        }
    }

    public /* synthetic */ q(List list, BeaconsNativeManager beaconsNativeManager, int i2) {
        this.f16281c = i2;
        this.f16280b = list;
        this.f16279a = beaconsNativeManager;
    }
}
