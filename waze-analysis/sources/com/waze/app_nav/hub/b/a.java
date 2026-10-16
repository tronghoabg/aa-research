package com.waze.app_nav.hub.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final a f15254a = new a(true);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15255b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15256c;

    public a(boolean z) {
        this.f15255b = z;
        this.f15256c = true;
    }

    public final boolean b() {
        return this.f15255b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f15255b != aVar.f15255b) {
            return false;
        }
        boolean z = aVar.f15256c;
        return true;
    }

    public final int hashCode() {
        return (a.a.a(this.f15255b) * 31) + a.a.a(true);
    }

    public final String toString() {
        return "AapConnectionPopupBehavior(continuePresenting=" + this.f15255b + ", dismissOnMobile=true)";
    }

    public a() {
        this((byte[]) null);
    }

    public /* synthetic */ a(byte[] bArr) {
        this(false);
    }
}
