package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC1451o;

@Keep
/* loaded from: classes5.dex */
public class HiddenLifecycleReference {
    private final AbstractC1451o lifecycle;

    public HiddenLifecycleReference(AbstractC1451o abstractC1451o) {
        this.lifecycle = abstractC1451o;
    }

    public AbstractC1451o getLifecycle() {
        return this.lifecycle;
    }
}
