package androidx.credentials.exceptions.domerrors;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class DomError {
    private final String type;

    public DomError(String str) {
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
