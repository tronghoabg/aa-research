package com.waze.ifs.a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.material.textfield.ao;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes5.dex */
public abstract class a implements Runnable {
    public abstract void a();

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        b();
        new Handler(Looper.getMainLooper()).post(new ao(this, 4));
    }
}
