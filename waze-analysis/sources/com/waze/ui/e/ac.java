package com.waze.ui.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f42183a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f42184b;

    public ac(Integer num) {
        this.f42183a = null;
        this.f42184b = num;
    }

    public static /* synthetic */ ac b(ac acVar) {
        return new ac(acVar.f42184b);
    }

    public final Integer a() {
        return this.f42184b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        Integer num = acVar.f42183a;
        return h.g.b.x.n(null, null) && h.g.b.x.n(this.f42184b, acVar.f42184b);
    }

    public final int hashCode() {
        Integer num = this.f42184b;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ResourceAnimationConfig(lottieResId=null, expandedTextResId=" + this.f42184b + ")";
    }

    public ac() {
        this((byte[]) null);
    }

    public /* synthetic */ ac(byte[] bArr) {
        this((Integer) null);
    }
}
