package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends v {

    /* renamed from: a, reason: collision with root package name */
    public static final m f15766a = new m();

    private m() {
        super("CredentialEmpty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1621010294;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "CredentialEmpty";
    }
}
