package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraExtensionMetadata;
import androidx.camera.camera2.pipe.CameraMetadata;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Camera2MetadataProvider {
    /* renamed from: awaitCameraExtensionMetadata-0r8Bogc */
    CameraExtensionMetadata mo1046awaitCameraExtensionMetadata0r8Bogc(String str, int i2);

    /* renamed from: awaitCameraMetadata-EfqyGwQ */
    CameraMetadata mo1047awaitCameraMetadataEfqyGwQ(String str);

    /* renamed from: getCameraExtensionMetadata-RzXb1QE */
    Object mo1048getCameraExtensionMetadataRzXb1QE(String str, int i2, h.c.e<? super CameraExtensionMetadata> eVar);

    /* renamed from: getCameraMetadata-0r8Bogc */
    Object mo1049getCameraMetadata0r8Bogc(String str, h.c.e<? super CameraMetadata> eVar);

    /* renamed from: getSupportedCameraExtensions-EfqyGwQ */
    Set<Integer> mo1050getSupportedCameraExtensionsEfqyGwQ(String str);
}
