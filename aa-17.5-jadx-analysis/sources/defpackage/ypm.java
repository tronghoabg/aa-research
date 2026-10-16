package defpackage;

/* loaded from: classes.dex */
public enum ypm {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);

    public final boolean f;

    ypm(boolean z) {
        this.f = z;
    }
}
