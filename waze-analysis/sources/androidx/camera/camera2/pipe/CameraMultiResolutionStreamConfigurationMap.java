package androidx.camera.camera2.pipe;

import android.hardware.camera2.params.MultiResolutionStreamInfo;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraMultiResolutionStreamConfigurationMap extends UnsafeWrapper {
    List<StreamFormat> getInputFormats();

    /* renamed from: getInputInfo-hNQ4ISI, reason: not valid java name */
    List<MultiResolutionStreamInfo> mo567getInputInfohNQ4ISI(int i2);

    List<StreamFormat> getOutputFormats();

    /* renamed from: getOutputInfo-hNQ4ISI, reason: not valid java name */
    List<MultiResolutionStreamInfo> mo568getOutputInfohNQ4ISI(int i2);

    /* renamed from: isConcurrentReadersSupported-hNQ4ISI, reason: not valid java name */
    boolean mo569isConcurrentReadersSupportedhNQ4ISI(int i2);
}
