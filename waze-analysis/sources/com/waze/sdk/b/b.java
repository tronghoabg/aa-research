package com.waze.sdk.b;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements com.b.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35273a;

    b(m mVar, int i2, byte[] bArr) {
        this.f35273a = i2;
        Objects.requireNonNull(mVar);
    }

    @Override // com.b.b.a.a
    public final /* synthetic */ void a(Object obj) {
        int i2 = this.f35273a;
        if (i2 == 0) {
            m.aj("Skip previous successful");
            return;
        }
        if (i2 == 1) {
            m.aj("Skip next successful");
        } else if (i2 == 2) {
            m.aj("Pause successful");
        } else if (i2 != 3) {
            m.aj("playPlayList - Content item played!");
        } else {
            m.aj("Resume successful");
        }
    }

    b(m mVar, int i2) {
        this.f35273a = i2;
        Objects.requireNonNull(mVar);
    }

    b(m mVar, int i2, char[] cArr) {
        this.f35273a = i2;
        Objects.requireNonNull(mVar);
    }

    b(m mVar, int i2, short[] sArr) {
        this.f35273a = i2;
        Objects.requireNonNull(mVar);
    }

    b(m mVar, int i2, int[] iArr) {
        this.f35273a = i2;
        Objects.requireNonNull(mVar);
    }
}
