package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExtensionSessionConfigData {
    private final Executor executor;
    private final Integer extensionMode;
    private final CameraExtensionSessionWrapper.StateCallback extensionStateCallback;
    private final List<OutputConfigurationWrapper> outputConfigurations;
    private final OutputConfigurationWrapper postviewOutputConfiguration;
    private final Map<?, Object> sessionParameters;
    private final int sessionTemplateId;
    private final int sessionType;
    private final CameraCaptureSessionWrapper.StateCallback stateCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtensionSessionConfigData(int i2, List<? extends OutputConfigurationWrapper> list, Executor executor, CameraCaptureSessionWrapper.StateCallback stateCallback, int i3, Map<?, ? extends Object> map, Integer num, CameraExtensionSessionWrapper.StateCallback stateCallback2, OutputConfigurationWrapper outputConfigurationWrapper) {
        x.f(list, "outputConfigurations");
        x.f(executor, "executor");
        x.f(stateCallback, "stateCallback");
        x.f(map, "sessionParameters");
        this.sessionType = i2;
        this.outputConfigurations = list;
        this.executor = executor;
        this.stateCallback = stateCallback;
        this.sessionTemplateId = i3;
        this.sessionParameters = map;
        this.extensionMode = num;
        this.extensionStateCallback = stateCallback2;
        this.postviewOutputConfiguration = outputConfigurationWrapper;
    }

    public static /* synthetic */ ExtensionSessionConfigData copy$default(ExtensionSessionConfigData extensionSessionConfigData, int i2, List list, Executor executor, CameraCaptureSessionWrapper.StateCallback stateCallback, int i3, Map map, Integer num, CameraExtensionSessionWrapper.StateCallback stateCallback2, OutputConfigurationWrapper outputConfigurationWrapper, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = extensionSessionConfigData.sessionType;
        }
        if ((i4 & 2) != 0) {
            list = extensionSessionConfigData.outputConfigurations;
        }
        if ((i4 & 4) != 0) {
            executor = extensionSessionConfigData.executor;
        }
        if ((i4 & 8) != 0) {
            stateCallback = extensionSessionConfigData.stateCallback;
        }
        if ((i4 & 16) != 0) {
            i3 = extensionSessionConfigData.sessionTemplateId;
        }
        if ((i4 & 32) != 0) {
            map = extensionSessionConfigData.sessionParameters;
        }
        if ((i4 & 64) != 0) {
            num = extensionSessionConfigData.extensionMode;
        }
        if ((i4 & 128) != 0) {
            stateCallback2 = extensionSessionConfigData.extensionStateCallback;
        }
        if ((i4 & 256) != 0) {
            outputConfigurationWrapper = extensionSessionConfigData.postviewOutputConfiguration;
        }
        CameraExtensionSessionWrapper.StateCallback stateCallback3 = stateCallback2;
        OutputConfigurationWrapper outputConfigurationWrapper2 = outputConfigurationWrapper;
        Map map2 = map;
        Integer num2 = num;
        int i5 = i3;
        Executor executor2 = executor;
        return extensionSessionConfigData.copy(i2, list, executor2, stateCallback, i5, map2, num2, stateCallback3, outputConfigurationWrapper2);
    }

    public final int component1() {
        return this.sessionType;
    }

    public final List<OutputConfigurationWrapper> component2() {
        return this.outputConfigurations;
    }

    public final Executor component3() {
        return this.executor;
    }

    public final CameraCaptureSessionWrapper.StateCallback component4() {
        return this.stateCallback;
    }

    public final int component5() {
        return this.sessionTemplateId;
    }

    public final Map<?, Object> component6() {
        return this.sessionParameters;
    }

    public final Integer component7() {
        return this.extensionMode;
    }

    public final CameraExtensionSessionWrapper.StateCallback component8() {
        return this.extensionStateCallback;
    }

    public final OutputConfigurationWrapper component9() {
        return this.postviewOutputConfiguration;
    }

    public final ExtensionSessionConfigData copy(int i2, List<? extends OutputConfigurationWrapper> list, Executor executor, CameraCaptureSessionWrapper.StateCallback stateCallback, int i3, Map<?, ? extends Object> map, Integer num, CameraExtensionSessionWrapper.StateCallback stateCallback2, OutputConfigurationWrapper outputConfigurationWrapper) {
        x.f(list, "outputConfigurations");
        x.f(executor, "executor");
        x.f(stateCallback, "stateCallback");
        x.f(map, "sessionParameters");
        return new ExtensionSessionConfigData(i2, list, executor, stateCallback, i3, map, num, stateCallback2, outputConfigurationWrapper);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtensionSessionConfigData)) {
            return false;
        }
        ExtensionSessionConfigData extensionSessionConfigData = (ExtensionSessionConfigData) obj;
        return this.sessionType == extensionSessionConfigData.sessionType && x.n(this.outputConfigurations, extensionSessionConfigData.outputConfigurations) && x.n(this.executor, extensionSessionConfigData.executor) && x.n(this.stateCallback, extensionSessionConfigData.stateCallback) && this.sessionTemplateId == extensionSessionConfigData.sessionTemplateId && x.n(this.sessionParameters, extensionSessionConfigData.sessionParameters) && x.n(this.extensionMode, extensionSessionConfigData.extensionMode) && x.n(this.extensionStateCallback, extensionSessionConfigData.extensionStateCallback) && x.n(this.postviewOutputConfiguration, extensionSessionConfigData.postviewOutputConfiguration);
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final Integer getExtensionMode() {
        return this.extensionMode;
    }

    public final CameraExtensionSessionWrapper.StateCallback getExtensionStateCallback() {
        return this.extensionStateCallback;
    }

    public final List<OutputConfigurationWrapper> getOutputConfigurations() {
        return this.outputConfigurations;
    }

    public final OutputConfigurationWrapper getPostviewOutputConfiguration() {
        return this.postviewOutputConfiguration;
    }

    public final Map<?, Object> getSessionParameters() {
        return this.sessionParameters;
    }

    public final int getSessionTemplateId() {
        return this.sessionTemplateId;
    }

    public final int getSessionType() {
        return this.sessionType;
    }

    public final CameraCaptureSessionWrapper.StateCallback getStateCallback() {
        return this.stateCallback;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.sessionType * 31) + this.outputConfigurations.hashCode()) * 31) + this.executor.hashCode()) * 31) + this.stateCallback.hashCode()) * 31) + this.sessionTemplateId) * 31) + this.sessionParameters.hashCode();
        Integer num = this.extensionMode;
        int iHashCode2 = ((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31;
        CameraExtensionSessionWrapper.StateCallback stateCallback = this.extensionStateCallback;
        int iHashCode3 = (iHashCode2 + (stateCallback == null ? 0 : stateCallback.hashCode())) * 31;
        OutputConfigurationWrapper outputConfigurationWrapper = this.postviewOutputConfiguration;
        return iHashCode3 + (outputConfigurationWrapper != null ? outputConfigurationWrapper.hashCode() : 0);
    }

    public String toString() {
        return "ExtensionSessionConfigData(sessionType=" + this.sessionType + ", outputConfigurations=" + this.outputConfigurations + ", executor=" + this.executor + ", stateCallback=" + this.stateCallback + ", sessionTemplateId=" + this.sessionTemplateId + ", sessionParameters=" + this.sessionParameters + ", extensionMode=" + this.extensionMode + ", extensionStateCallback=" + this.extensionStateCallback + ", postviewOutputConfiguration=" + this.postviewOutputConfiguration + ")";
    }

    public /* synthetic */ ExtensionSessionConfigData(int i2, List list, Executor executor, CameraCaptureSessionWrapper.StateCallback stateCallback, int i3, Map map, Integer num, CameraExtensionSessionWrapper.StateCallback stateCallback2, OutputConfigurationWrapper outputConfigurationWrapper, int i4, o oVar) {
        this(i2, list, executor, stateCallback, i3, map, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? null : stateCallback2, (i4 & 256) != 0 ? null : outputConfigurationWrapper);
    }
}
