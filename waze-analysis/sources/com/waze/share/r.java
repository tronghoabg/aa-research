package com.waze.share;

import android.content.pm.ResolveInfo;
import com.waze.NativeManager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ResolveInfo f37726a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f37727b;

    r(s sVar, ResolveInfo resolveInfo) {
        this.f37726a = resolveInfo;
        Objects.requireNonNull(sVar);
        this.f37727b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeManager.getInstance().bumpRecentShareAppNTV(this.f37726a.loadLabel(this.f37727b.f37729b.f37733c.f37735b.f37741f).toString());
    }
}
