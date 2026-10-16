package androidx.core.content;

import android.content.res.Configuration;
import androidx.core.util.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface OnConfigurationChangedProvider {
    void addOnConfigurationChangedListener(Consumer<Configuration> consumer);

    void removeOnConfigurationChangedListener(Consumer<Configuration> consumer);
}
