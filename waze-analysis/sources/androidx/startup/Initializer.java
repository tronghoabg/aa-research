package androidx.startup;

import android.content.Context;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface Initializer<T> {
    T create(Context context);

    List<Class<? extends Initializer<?>>> dependencies();
}
