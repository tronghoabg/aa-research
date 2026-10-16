package defpackage;

/* loaded from: classes3.dex */
public abstract class ahvr extends ahvp {
    public boolean getForcePropagationToOverrides() {
        return false;
    }

    @Override // defpackage.ahvp
    public boolean getPropagatesToOverrides() {
        return getForcePropagationToOverrides();
    }
}
