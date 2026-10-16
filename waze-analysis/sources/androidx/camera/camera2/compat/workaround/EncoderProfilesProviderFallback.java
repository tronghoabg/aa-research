package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.adapter.EncoderProfilesProviderAdapter;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SizeFilteredEncoderProfilesProvider;
import androidx.camera.core.internal.utils.SizeUtil;
import e.b.c;
import h.a.i;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.l;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class EncoderProfilesProviderFallback {
    private final p<String, Quirks, EncoderProfilesProvider> providerFactory;

    public /* synthetic */ EncoderProfilesProviderFallback(p pVar, int i2, o oVar) {
        this((i2 & 1) != 0 ? new p() { // from class: androidx.camera.camera2.compat.workaround.EncoderProfilesProviderFallback$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return EncoderProfilesProviderFallback._init_$lambda$0((String) obj, (Quirks) obj2);
            }
        } : pVar);
    }

    static final EncoderProfilesProviderAdapter _init_$lambda$0(String str, Quirks quirks) {
        x.f(str, "cameraId");
        x.f(quirks, "quirks");
        return new EncoderProfilesProviderAdapter(str, quirks);
    }

    private final EncoderProfilesProvider findProviderWithLargestSize(CameraDevices cameraDevices) {
        Object objA;
        List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy;
        try {
            EncoderProfilesProviderFallback encoderProfilesProviderFallback = this;
            objA = cameraDevices.awaitCameraIds();
        } catch (Throwable th) {
            objA = c.a(th);
        }
        EncoderProfilesProvider encoderProfilesProvider = null;
        if (true == (objA instanceof l)) {
            objA = null;
        }
        List list = (List) objA;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String strM553unboximpl = ((CameraId) it.next()).m553unboximpl();
            EncoderProfilesProvider encoderProfilesProviderInvoke = this.providerFactory.invoke(strM553unboximpl, getQuirks(cameraDevices.mo434awaitCameraMetadataEfqyGwQ(strM553unboximpl)));
            EncoderProfilesProxy all = encoderProfilesProviderInvoke.getAll(1);
            int area = (all == null || (videoProfiles = all.getVideoProfiles()) == null || (videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) i.R(videoProfiles)) == null) ? 0 : SizeUtil.getArea(videoProfileProxy.getWidth(), videoProfileProxy.getHeight());
            if (area > i2) {
                encoderProfilesProvider = encoderProfilesProviderInvoke;
                i2 = area;
            }
        }
        return encoderProfilesProvider;
    }

    private final List<Size> getPrivateFormatSizes(CameraMetadata cameraMetadata) {
        Size[] outputSizes;
        List<Size> listX;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        x.e(key, "SCALER_STREAM_CONFIGURATION_MAP");
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraMetadata.get(key);
        return (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(34)) == null || (listX = h.a.c.X(outputSizes)) == null) ? i.h() : listX;
    }

    private final Quirks getQuirks(CameraMetadata cameraMetadata) {
        if (cameraMetadata == null) {
            return new Quirks(i.h());
        }
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        x.e(key, "SCALER_STREAM_CONFIGURATION_MAP");
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraMetadata.get(key);
        return new CameraQuirks(cameraMetadata, new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(cameraMetadata, streamConfigurationMap))).getQuirks();
    }

    private final boolean isExternalCamera(CameraMetadata cameraMetadata) {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        x.e(key, "LENS_FACING");
        Integer num = (Integer) cameraMetadata.get(key);
        return num != null && num.intValue() == 2;
    }

    private final boolean needFallback(CameraMetadata cameraMetadata, EncoderProfilesProvider encoderProfilesProvider) {
        return isExternalCamera(cameraMetadata) && !encoderProfilesProvider.hasProfile(1);
    }

    public final EncoderProfilesProvider resolveProvider(String str, Quirks quirks, CameraDevices cameraDevices) {
        SizeFilteredEncoderProfilesProvider sizeFilteredEncoderProfilesProviderFindProviderWithLargestSize;
        x.f(str, "cameraId");
        x.f(quirks, "quirks");
        x.f(cameraDevices, "cameraDevices");
        EncoderProfilesProvider encoderProfilesProviderInvoke = this.providerFactory.invoke(str, quirks);
        CameraId.m547constructorimpl(str);
        CameraMetadata cameraMetadataMo434awaitCameraMetadataEfqyGwQ = cameraDevices.mo434awaitCameraMetadataEfqyGwQ(str);
        if (cameraMetadataMo434awaitCameraMetadataEfqyGwQ != null) {
            if (needFallback(cameraMetadataMo434awaitCameraMetadataEfqyGwQ, encoderProfilesProviderInvoke)) {
                sizeFilteredEncoderProfilesProviderFindProviderWithLargestSize = findProviderWithLargestSize(cameraDevices);
                if (sizeFilteredEncoderProfilesProviderFindProviderWithLargestSize != null) {
                    sizeFilteredEncoderProfilesProviderFindProviderWithLargestSize = new SizeFilteredEncoderProfilesProvider(sizeFilteredEncoderProfilesProviderFindProviderWithLargestSize, getPrivateFormatSizes(cameraMetadataMo434awaitCameraMetadataEfqyGwQ));
                }
            } else {
                sizeFilteredEncoderProfilesProviderFindProviderWithLargestSize = null;
            }
            if (sizeFilteredEncoderProfilesProviderFindProviderWithLargestSize != null) {
                return sizeFilteredEncoderProfilesProviderFindProviderWithLargestSize;
            }
        }
        return encoderProfilesProviderInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EncoderProfilesProviderFallback(p<? super String, ? super Quirks, ? extends EncoderProfilesProvider> pVar) {
        x.f(pVar, "providerFactory");
        this.providerFactory = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EncoderProfilesProviderFallback() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
