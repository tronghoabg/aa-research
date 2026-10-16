package com.waze.sound.c;

import android.os.Build;
import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements c {
    @Override // com.waze.sound.c.c
    public final d a(File file) {
        x.f(file, "cacheDir");
        return Build.VERSION.SDK_INT >= 30 ? new b() : new a(file);
    }
}
