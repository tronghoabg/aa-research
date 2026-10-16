package androidx.core.app;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PictureInPictureProvider extends OnPictureInPictureModeChangedProvider, OnPictureInPictureUiStateChangedProvider, OnUserLeaveHintProvider {
    void enterPictureInPictureMode(PictureInPictureParamsCompat pictureInPictureParamsCompat);

    void setPictureInPictureParams(PictureInPictureParamsCompat pictureInPictureParamsCompat);
}
