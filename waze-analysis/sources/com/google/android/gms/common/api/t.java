package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f4893a = Collections.newSetFromMap(new WeakHashMap());

    public static Set b() {
        Set set = f4893a;
        synchronized (set) {
        }
        return set;
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public void d(com.google.android.gms.common.api.internal.l lVar) {
        throw null;
    }
}
