package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraColorSpace;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SessionConfigData {
    private final Executor executor;
    private final List<InputConfigData> inputConfiguration;
    private final List<OutputConfigurationWrapper> outputConfigurations;
    private final String sessionColorSpace;
    private final Map<?, Object> sessionParameters;
    private final int sessionTemplateId;
    private final int sessionType;
    private final CameraCaptureSessionWrapper.StateCallback stateCallback;

    /* JADX WARN: Multi-variable type inference failed */
    private SessionConfigData(int i2, List<InputConfigData> list, List<? extends OutputConfigurationWrapper> list2, Executor executor, CameraCaptureSessionWrapper.StateCallback stateCallback, int i3, Map<?, ? extends Object> map, String str) {
        x.f(list2, "outputConfigurations");
        x.f(executor, "executor");
        x.f(stateCallback, "stateCallback");
        x.f(map, "sessionParameters");
        this.sessionType = i2;
        this.inputConfiguration = list;
        this.outputConfigurations = list2;
        this.executor = executor;
        this.stateCallback = stateCallback;
        this.sessionTemplateId = i3;
        this.sessionParameters = map;
        this.sessionColorSpace = str;
    }

    /* renamed from: copy-WTWd9Ag$default, reason: not valid java name */
    public static /* synthetic */ SessionConfigData m1101copyWTWd9Ag$default(SessionConfigData sessionConfigData, int i2, List list, List list2, Executor executor, CameraCaptureSessionWrapper.StateCallback stateCallback, int i3, Map map, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = sessionConfigData.sessionType;
        }
        if ((i4 & 2) != 0) {
            list = sessionConfigData.inputConfiguration;
        }
        if ((i4 & 4) != 0) {
            list2 = sessionConfigData.outputConfigurations;
        }
        if ((i4 & 8) != 0) {
            executor = sessionConfigData.executor;
        }
        if ((i4 & 16) != 0) {
            stateCallback = sessionConfigData.stateCallback;
        }
        if ((i4 & 32) != 0) {
            i3 = sessionConfigData.sessionTemplateId;
        }
        if ((i4 & 64) != 0) {
            map = sessionConfigData.sessionParameters;
        }
        if ((i4 & 128) != 0) {
            str = sessionConfigData.sessionColorSpace;
        }
        Map map2 = map;
        String str2 = str;
        CameraCaptureSessionWrapper.StateCallback stateCallback2 = stateCallback;
        int i5 = i3;
        return sessionConfigData.m1103copyWTWd9Ag(i2, list, list2, executor, stateCallback2, i5, map2, str2);
    }

    public final int component1() {
        return this.sessionType;
    }

    public final List<InputConfigData> component2() {
        return this.inputConfiguration;
    }

    public final List<OutputConfigurationWrapper> component3() {
        return this.outputConfigurations;
    }

    public final Executor component4() {
        return this.executor;
    }

    public final CameraCaptureSessionWrapper.StateCallback component5() {
        return this.stateCallback;
    }

    public final int component6() {
        return this.sessionTemplateId;
    }

    public final Map<?, Object> component7() {
        return this.sessionParameters;
    }

    /* renamed from: component8-dxVZaPA, reason: not valid java name */
    public final String m1102component8dxVZaPA() {
        return this.sessionColorSpace;
    }

    /* renamed from: copy-WTWd9Ag, reason: not valid java name */
    public final SessionConfigData m1103copyWTWd9Ag(int i2, List<InputConfigData> list, List<? extends OutputConfigurationWrapper> list2, Executor executor, CameraCaptureSessionWrapper.StateCallback stateCallback, int i3, Map<?, ? extends Object> map, String str) {
        x.f(list2, "outputConfigurations");
        x.f(executor, "executor");
        x.f(stateCallback, "stateCallback");
        x.f(map, "sessionParameters");
        return new SessionConfigData(i2, list, list2, executor, stateCallback, i3, map, str, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigData)) {
            return false;
        }
        SessionConfigData sessionConfigData = (SessionConfigData) obj;
        if (this.sessionType != sessionConfigData.sessionType || !x.n(this.inputConfiguration, sessionConfigData.inputConfiguration) || !x.n(this.outputConfigurations, sessionConfigData.outputConfigurations) || !x.n(this.executor, sessionConfigData.executor) || !x.n(this.stateCallback, sessionConfigData.stateCallback) || this.sessionTemplateId != sessionConfigData.sessionTemplateId || !x.n(this.sessionParameters, sessionConfigData.sessionParameters)) {
            return false;
        }
        String str = this.sessionColorSpace;
        String str2 = sessionConfigData.sessionColorSpace;
        return str != null ? !(str2 == null || !CameraColorSpace.m393equalsimpl0(str, str2)) : str2 == null;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final List<InputConfigData> getInputConfiguration() {
        return this.inputConfiguration;
    }

    public final List<OutputConfigurationWrapper> getOutputConfigurations() {
        return this.outputConfigurations;
    }

    /* renamed from: getSessionColorSpace-dxVZaPA, reason: not valid java name */
    public final String m1104getSessionColorSpacedxVZaPA() {
        return this.sessionColorSpace;
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
        List<InputConfigData> list = this.inputConfiguration;
        int iHashCode = (((((((((((this.sessionType * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.outputConfigurations.hashCode()) * 31) + this.executor.hashCode()) * 31) + this.stateCallback.hashCode()) * 31) + this.sessionTemplateId) * 31) + this.sessionParameters.hashCode();
        String str = this.sessionColorSpace;
        return (iHashCode * 31) + (str != null ? CameraColorSpace.m395hashCodeimpl(str) : 0);
    }

    public String toString() {
        String str = this.sessionColorSpace;
        String strM397toStringimpl = str == null ? "null" : CameraColorSpace.m397toStringimpl(str);
        Map<?, Object> map = this.sessionParameters;
        int i2 = this.sessionTemplateId;
        CameraCaptureSessionWrapper.StateCallback stateCallback = this.stateCallback;
        Executor executor = this.executor;
        List<OutputConfigurationWrapper> list = this.outputConfigurations;
        List<InputConfigData> list2 = this.inputConfiguration;
        return "SessionConfigData(sessionType=" + this.sessionType + ", inputConfiguration=" + list2 + ", outputConfigurations=" + list + ", executor=" + executor + ", stateCallback=" + stateCallback + ", sessionTemplateId=" + i2 + ", sessionParameters=" + map + ", sessionColorSpace=" + strM397toStringimpl + ")";
    }

    public /* synthetic */ SessionConfigData(int i2, List list, List list2, Executor executor, CameraCaptureSessionWrapper.StateCallback stateCallback, int i3, Map map, String str, o oVar) {
        this(i2, list, list2, executor, stateCallback, i3, map, str);
    }
}
