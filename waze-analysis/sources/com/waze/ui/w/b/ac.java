package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43578a;

    public ac(boolean z) {
        this.f43578a = z;
    }

    public final boolean a() {
        return this.f43578a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac) && this.f43578a == ((ac) obj).f43578a;
    }

    public final int hashCode() {
        return a.a.a(this.f43578a);
    }

    public final String toString() {
        return "ConversationalOnBoardingUiState(useLargeReportMenu=" + this.f43578a + ")";
    }
}
