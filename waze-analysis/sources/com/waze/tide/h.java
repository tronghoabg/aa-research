package com.waze.tide;

import com.waze.config.ConfigValues;
import com.waze.n.ac;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40935a;

    private static final boolean i() {
        return ((int) ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_SESSION_COUNT_UNTIL_PERMISSION_REQUEST.b().longValue()) >= ((int) ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_MIN_SESSION_COUNT_BEFORE_PERMISSION_REQUIREMENT.b().longValue());
    }

    @Override // com.waze.tide.g
    public final long a() {
        Long lB = ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_REPORT_MIN_INTERVAL_MINUTES.b();
        h.g.b.x.e(lB, "getValue(...)");
        return h.o.c.j(lB.longValue(), h.o.d.f48274e);
    }

    @Override // com.waze.tide.g
    public final void b() {
        if (this.f40935a || i()) {
            return;
        }
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_SESSION_COUNT_UNTIL_PERMISSION_REQUEST;
        h.g.b.x.e(cVar, "CONFIG_VALUE_DRIVE_DETEC…_UNTIL_PERMISSION_REQUEST");
        ac.q(cVar);
        this.f40935a = true;
    }

    @Override // com.waze.tide.g
    public final void c() {
        ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_BLUETOOTH_PERMISSION_SHOWN.d(true);
        Instant instantNow = Instant.now();
        h.g.b.x.e(instantNow, "now(...)");
        h.g.b.x.f(instantNow, "value");
        ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_LAST_BLUETOOTH_PERMISSION_SHOWN_TIMESTAMP_SECONDES.d(Long.valueOf(instantNow.getEpochSecond()));
    }

    @Override // com.waze.tide.g
    public final void d(boolean z) {
        ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_USER_OPTOUT.d(Boolean.valueOf(z));
    }

    @Override // com.waze.tide.g
    public final boolean e() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_USER_OPTOUT.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.tide.g
    public final boolean f() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_COLLECT_PERMISSIONS_STATE.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.tide.g
    public final boolean g() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.tide.g
    public final boolean h() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_BLUETOOTH_PERMISSION_COLLECTION_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        if (!boolB.booleanValue() || e() || !i()) {
            return false;
        }
        Boolean boolB2 = ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_BLUETOOTH_PERMISSION_SHOWN.b();
        h.g.b.x.e(boolB2, "getValue(...)");
        if (boolB2.booleanValue()) {
            Long lB = ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_LAST_BLUETOOTH_PERMISSION_SHOWN_TIMESTAMP_SECONDES.b();
            h.g.b.x.e(lB, "getValue(...)");
            Instant instantOfEpochSecond = Instant.ofEpochSecond(lB.longValue());
            h.g.b.x.e(instantOfEpochSecond, "ofEpochSecond(...)");
            Duration durationBetween = Duration.between(instantOfEpochSecond, Instant.now());
            h.g.b.x.e(durationBetween, "between(...)");
            long jR = h.o.a.r(h.o.c.j(durationBetween.getSeconds(), h.o.d.f48273d), h.o.c.i(durationBetween.getNano(), h.o.d.f48270a));
            Long lB2 = ConfigValues.CONFIG_VALUE_DRIVE_DETECTION_TIDE_BLUETOOTH_PERMISSION_COLLECTION_COOLDOWN_PERIOD_DAYS.b();
            h.g.b.x.e(lB2, "getValue(...)");
            if (h.o.a.c(jR, h.o.c.j(lB2.longValue(), h.o.d.f48276g)) <= 0) {
                return false;
            }
        }
        return true;
    }
}
