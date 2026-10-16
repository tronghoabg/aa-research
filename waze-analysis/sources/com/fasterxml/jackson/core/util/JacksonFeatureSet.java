package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.JacksonFeature;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class JacksonFeatureSet<F extends JacksonFeature> implements Serializable {
    private static final long serialVersionUID = 1;
    protected int _enabled;

    protected JacksonFeatureSet(int i2) {
        this._enabled = i2;
    }

    public static <F extends JacksonFeature> JacksonFeatureSet<F> fromDefaults(F[] fArr) {
        int length = fArr.length;
        if (length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(length)));
        }
        int mask = 0;
        for (F f2 : fArr) {
            if (f2.enabledByDefault()) {
                mask |= f2.getMask();
            }
        }
        return new JacksonFeatureSet<>(mask);
    }

    public boolean isEnabled(F f2) {
        return (this._enabled & f2.getMask()) != 0;
    }

    public JacksonFeatureSet<F> with(F f2) {
        int mask = f2.getMask() | this._enabled;
        return mask == this._enabled ? this : new JacksonFeatureSet<>(mask);
    }
}
