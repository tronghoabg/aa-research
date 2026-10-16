package com.waze.ui.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f42324a;

    public e(boolean z) {
        super(null);
        this.f42324a = z;
    }

    public final boolean a() {
        return this.f42324a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f42324a == ((e) obj).f42324a;
    }

    public final int hashCode() {
        return a.a.a(this.f42324a);
    }

    public final String toString() {
        return "DismissUserMessage(closeScreen=" + this.f42324a + ")";
    }

    public e() {
        this((byte[]) null);
    }

    public /* synthetic */ e(byte[] bArr) {
        this(false);
    }
}
