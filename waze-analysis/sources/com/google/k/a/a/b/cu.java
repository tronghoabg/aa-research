package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum cu implements com.google.v.eg {
    GROUP_ARTIFACT(1),
    GROUP_LOGICAL(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f11216d;

    cu(int i2) {
        this.f11216d = i2;
    }

    public static cu a(int i2) {
        if (i2 == 1) {
            return GROUP_ARTIFACT;
        }
        if (i2 != 2) {
            return null;
        }
        return GROUP_LOGICAL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11216d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11216d);
    }
}
