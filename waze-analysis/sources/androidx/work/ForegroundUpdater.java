package androidx.work;

import android.content.Context;
import com.google.d.m.a.bm;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface ForegroundUpdater {
    bm<Void> setForegroundAsync(Context context, UUID uuid, ForegroundInfo foregroundInfo);
}
