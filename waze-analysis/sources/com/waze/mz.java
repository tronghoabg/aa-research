package com.waze;

import com.waze.config.ConfigValues;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class mz implements com.waze.bn.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f30638a;

    mz(int i2) {
        this.f30638a = i2;
    }

    @Override // com.waze.bn.a
    public final long a() {
        if (this.f30638a != 0) {
            return ConfigValues.CONFIG_VALUE_ROAMING_SECONDS.b().longValue() * 1000;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Long lB = ConfigValues.CONFIG_VALUE_REWIRE_START_STATE_ROAMING_ABOVE_THERSHOLD_TIME_SECOND.b();
        h.g.b.x.e(lB, "getValue(...)");
        return timeUnit.toMillis(lB.longValue());
    }

    @Override // com.waze.bn.a
    public final long b() {
        if (this.f30638a != 0) {
            Long lB = ConfigValues.CONFIG_VALUE_ROAMING_SPEED_KM_H.b();
            h.g.b.x.e(lB, "getValue(...)");
            return lB.longValue();
        }
        Long lB2 = ConfigValues.CONFIG_VALUE_REWIRE_START_STATE_ROAMING_SPEED_THRSHOLD_KM_H.b();
        h.g.b.x.e(lB2, "getValue(...)");
        return lB2.longValue();
    }

    public mz(int i2, byte[] bArr) {
        this.f30638a = i2;
    }
}
