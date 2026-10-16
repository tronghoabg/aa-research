package com.waze;

import com.waze.user.FriendUserData;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class gr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FriendUserData f24262a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f24263b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f24264c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f24265d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ NativeManager f24266e;

    gr(NativeManager nativeManager, FriendUserData friendUserData, int i2, String str, String str2) {
        this.f24262a = friendUserData;
        this.f24263b = i2;
        this.f24264c = str;
        this.f24265d = str2;
        Objects.requireNonNull(nativeManager);
        this.f24266e = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24266e.getPopupsBridgeCompat().b(new com.waze.main_screen.ab.f(this.f24262a, this.f24263b, this.f24264c, this.f24265d));
    }
}
