package com.waze.reports;

import android.content.Context;
import android.content.Intent;
import com.waze.NativeManager;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends com.waze.ifs.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f33934a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f33935b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f33936c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f33937d;

    h(Context context, boolean z, CompletableDeferred completableDeferred) {
        this.f33934a = context;
        this.f33935b = z;
        this.f33936c = completableDeferred;
    }

    @Override // com.waze.ifs.a.a
    public final void a() {
        if (!this.f33937d) {
            this.f33936c.a(null);
            return;
        }
        Intent intent = new Intent(this.f33934a, (Class<?>) ClosureMap.class);
        intent.putExtra("reopened", this.f33935b);
        this.f33936c.a(intent);
    }

    @Override // com.waze.ifs.a.a
    public final void b() {
        this.f33937d = NativeManager.getInstance().HasClosureDataNTV();
    }
}
