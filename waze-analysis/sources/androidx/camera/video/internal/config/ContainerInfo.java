package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ContainerInfo {
    private final EncoderProfilesProxy compatibleEncoderProfiles;
    private final int outputFormat;

    public ContainerInfo(int i2, EncoderProfilesProxy encoderProfilesProxy) {
        this.outputFormat = i2;
        this.compatibleEncoderProfiles = encoderProfilesProxy;
    }

    public static /* synthetic */ ContainerInfo copy$default(ContainerInfo containerInfo, int i2, EncoderProfilesProxy encoderProfilesProxy, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = containerInfo.outputFormat;
        }
        if ((i3 & 2) != 0) {
            encoderProfilesProxy = containerInfo.compatibleEncoderProfiles;
        }
        return containerInfo.copy(i2, encoderProfilesProxy);
    }

    public final int component1() {
        return this.outputFormat;
    }

    public final EncoderProfilesProxy component2() {
        return this.compatibleEncoderProfiles;
    }

    public final ContainerInfo copy(int i2, EncoderProfilesProxy encoderProfilesProxy) {
        return new ContainerInfo(i2, encoderProfilesProxy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContainerInfo)) {
            return false;
        }
        ContainerInfo containerInfo = (ContainerInfo) obj;
        return this.outputFormat == containerInfo.outputFormat && x.n(this.compatibleEncoderProfiles, containerInfo.compatibleEncoderProfiles);
    }

    public final EncoderProfilesProxy getCompatibleEncoderProfiles() {
        return this.compatibleEncoderProfiles;
    }

    public final int getOutputFormat() {
        return this.outputFormat;
    }

    public int hashCode() {
        EncoderProfilesProxy encoderProfilesProxy = this.compatibleEncoderProfiles;
        return (this.outputFormat * 31) + (encoderProfilesProxy == null ? 0 : encoderProfilesProxy.hashCode());
    }

    public String toString() {
        return "ContainerInfo(outputFormat=" + this.outputFormat + ", compatibleEncoderProfiles=" + this.compatibleEncoderProfiles + ")";
    }

    public static /* synthetic */ void getOutputFormat$annotations() {
    }
}
