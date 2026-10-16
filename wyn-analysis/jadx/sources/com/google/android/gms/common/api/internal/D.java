package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class D implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26443a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26444b;

    public /* synthetic */ D(Object obj, Object obj2) {
        this.f26444b = obj;
        this.f26443a = obj2;
    }

    public void a(Status status, boolean z2) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f26443a)) {
            map = new HashMap((Map) this.f26443a);
        }
        synchronized (((Map) this.f26444b)) {
            map2 = new HashMap((Map) this.f26444b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.j(status));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((D) this.f26444b).f26444b).remove((TaskCompletionSource) this.f26443a);
    }

    public D() {
        this.f26443a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.f26444b = DesugarCollections.synchronizedMap(new WeakHashMap());
    }
}
