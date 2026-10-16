package com.waze.sdk.b;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements com.b.b.a.j {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35272a;

    a(m mVar, int i2, byte[] bArr) {
        this.f35272a = i2;
        Objects.requireNonNull(mVar);
    }

    @Override // com.b.b.a.j
    public final void a(Throwable th) {
        switch (this.f35272a) {
            case 0:
                m.ak("PlayPrevious ".concat(String.valueOf(th.getMessage())));
                break;
            case 1:
                m.ak("PlayNext ".concat(String.valueOf(th.getMessage())));
                break;
            case 2:
                m.ak("Pause ".concat(String.valueOf(th.getMessage())));
                break;
            case 3:
                m.ak("Play ".concat(String.valueOf(th.getMessage())));
                break;
            case 4:
                m.ak("Save ".concat(String.valueOf(th.getMessage())));
                break;
            case 5:
                m.ak("Unsave ".concat(String.valueOf(th.getMessage())));
                break;
            case 6:
                m.ak("fetchSugegstedContent ".concat(String.valueOf(th.getMessage())));
                break;
            case 7:
                m.ak("fetchSugegstedContent ".concat(String.valueOf(th.getMessage())));
                break;
            case 8:
                m.ak("playPlayList ".concat(String.valueOf(th.getMessage())));
                break;
            case 9:
                m.ak("subscribeToPlayerContext ".concat(String.valueOf(th.getMessage())));
                break;
            default:
                m.ak("Unsave ".concat(String.valueOf(th.getMessage())));
                break;
        }
    }

    a(m mVar, int i2) {
        this.f35272a = i2;
        Objects.requireNonNull(mVar);
    }

    a(m mVar, int i2, char[] cArr) {
        this.f35272a = i2;
        Objects.requireNonNull(mVar);
    }

    a(m mVar, int i2, short[] sArr) {
        this.f35272a = i2;
        Objects.requireNonNull(mVar);
    }

    a(m mVar, int i2, int[] iArr) {
        this.f35272a = i2;
        Objects.requireNonNull(mVar);
    }

    a(m mVar, int i2, boolean[] zArr) {
        this.f35272a = i2;
        Objects.requireNonNull(mVar);
    }

    a(m mVar, int i2, float[] fArr) {
        this.f35272a = i2;
        Objects.requireNonNull(mVar);
    }

    a(f fVar, int i2) {
        this.f35272a = i2;
        Objects.requireNonNull(fVar);
    }

    a(m mVar, int i2, byte[][] bArr) {
        this.f35272a = i2;
        Objects.requireNonNull(mVar);
    }

    a(m mVar, int i2, char[][] cArr) {
        this.f35272a = i2;
        Objects.requireNonNull(mVar);
    }

    a(m mVar, int i2, short[][] sArr) {
        this.f35272a = i2;
        Objects.requireNonNull(mVar);
    }
}
