package androidx.constraintlayout.core.state;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface RegistryCallback {
    String currentLayoutInformation();

    String currentMotionScene();

    long getLastModified();

    void onDimensions(int i2, int i3);

    void onNewMotionScene(String str);

    void onProgress(float f2);

    void setDrawDebug(int i2);

    void setLayoutInformationMode(int i2);
}
