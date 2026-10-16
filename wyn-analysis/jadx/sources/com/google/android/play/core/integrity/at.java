package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final i8.i f27172a;

    /* renamed from: b, reason: collision with root package name */
    private final i8.i f27173b;

    public at(i8.i iVar, i8.i iVar2) {
        this.f27172a = iVar;
        this.f27173b = iVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, i8.d dVar) {
        Object objA = this.f27172a.a();
        objA.getClass();
        k kVar = (k) this.f27173b.a();
        kVar.getClass();
        activity.getClass();
        dVar.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, dVar);
    }
}
