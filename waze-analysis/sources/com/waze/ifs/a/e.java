package com.waze.ifs.a;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends d {

    /* renamed from: a, reason: collision with root package name */
    WeakReference f24460a;

    @Override // com.waze.ifs.a.d
    final Handler a() {
        WeakReference weakReference = this.f24460a;
        if (weakReference == null) {
            return null;
        }
        return (Handler) weakReference.get();
    }

    @Override // com.waze.ifs.a.d
    final void b(Handler handler) {
        this.f24460a = new WeakReference(handler);
    }
}
