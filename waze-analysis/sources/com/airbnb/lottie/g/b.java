package com.airbnb.lottie.g;

import android.util.Log;
import com.airbnb.lottie.v;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class b implements v {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f2395a = new HashSet();

    @Override // com.airbnb.lottie.v
    public final void a(String str, Throwable th) {
        Set set = f2395a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }
}
