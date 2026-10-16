package androidx.compose.material;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SnackbarData {
    void dismiss();

    String getActionLabel();

    SnackbarDuration getDuration();

    String getMessage();

    void performAction();
}
