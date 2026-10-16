package androidx.work;

import android.content.Context;
import com.google.d.m.a.bm;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface ProgressUpdater {
    bm<Void> updateProgress(Context context, UUID uuid, Data data);
}
