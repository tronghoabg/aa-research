package io.flutter.plugin.platform;

import android.content.Context;
import uc.C4286w;
import uc.InterfaceC4277n;

/* loaded from: classes5.dex */
public abstract class f {
    private final InterfaceC4277n createArgsCodec;

    public f(C4286w c4286w) {
        this.createArgsCodec = c4286w;
    }

    public abstract e create(Context context, int i5, Object obj);

    public final InterfaceC4277n getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
