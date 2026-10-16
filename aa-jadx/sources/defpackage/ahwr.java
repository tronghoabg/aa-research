package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahwr extends defpackage.ahwp {
    public boolean getForcePropagationToOverrides() {
        return false;
    }

    @Override // defpackage.ahwp
    public boolean getPropagatesToOverrides() {
        return getForcePropagationToOverrides();
    }
}
