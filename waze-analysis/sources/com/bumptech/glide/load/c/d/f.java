package com.bumptech.glide.load.c.d;

import android.util.Log;
import com.bumptech.glide.load.a.aw;
import com.bumptech.glide.load.s;
import com.bumptech.glide.load.v;
import java.io.File;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements v {
    @Override // com.bumptech.glide.load.b
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, s sVar) throws Throwable {
        try {
            com.bumptech.glide.g.c.d(((e) ((aw) obj).c()).c(), file);
            return true;
        } catch (IOException e2) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            return false;
        }
    }

    @Override // com.bumptech.glide.load.v
    public final int b() {
        return 1;
    }
}
