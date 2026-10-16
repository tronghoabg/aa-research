package com.waze.q;

import com.waze.config.ConfigValues;
import com.waze.n.ac;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final ch f33452a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f33453b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33454c;

    public b() {
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_CONSENT_BUMP_REQUIRED_ID;
        x.e(dVar, "CONFIG_VALUE_CONSENT_BUMP_REQUIRED_ID");
        this.f33452a = ac.p(dVar);
        com.waze.config.d dVar2 = ConfigValues.CONFIG_VALUE_CONSENT_BUMP_ACCEPTED_ID;
        x.e(dVar2, "CONFIG_VALUE_CONSENT_BUMP_ACCEPTED_ID");
        this.f33453b = ac.p(dVar2);
        String strB = ConfigValues.CONFIG_VALUE_CONSENT_BUMP_IN_CAR_URL.b();
        x.e(strB, "getValue(...)");
        this.f33454c = strB;
    }

    @Override // com.waze.q.a
    public final String a() {
        return this.f33454c;
    }

    @Override // com.waze.q.a
    public final ch b() {
        return this.f33453b;
    }

    @Override // com.waze.q.a
    public final ch c() {
        return this.f33452a;
    }

    @Override // com.waze.q.a
    public final void d() {
        ConfigValues.CONFIG_VALUE_CONSENT_BUMP_ACCEPTED_ID.d(ConfigValues.CONFIG_VALUE_CONSENT_BUMP_REQUIRED_ID.b());
    }
}
