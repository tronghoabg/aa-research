package androidx.camera.camera2.pipe;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageSourceConfig {
    private final int capacity;
    private final Integer defaultDataSpace;
    private final Integer defaultHardwareBufferFormat;
    private boolean enableConcurrentOutputs;
    private final Long usageFlags;

    public /* synthetic */ ImageSourceConfig(int i2, Long l2, Integer num, Integer num2, int i3, o oVar) {
        this(i2, (i3 & 2) != 0 ? null : l2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2);
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final Integer getDefaultDataSpace() {
        return this.defaultDataSpace;
    }

    public final Integer getDefaultHardwareBufferFormat() {
        return this.defaultHardwareBufferFormat;
    }

    public final boolean getEnableConcurrentOutputs() {
        return this.enableConcurrentOutputs;
    }

    public final Long getUsageFlags() {
        return this.usageFlags;
    }

    public final void setEnableConcurrentOutputs(boolean z) {
        this.enableConcurrentOutputs = z;
    }

    public ImageSourceConfig(int i2, Long l2, Integer num, Integer num2) {
        this.capacity = i2;
        this.usageFlags = l2;
        this.defaultDataSpace = num;
        this.defaultHardwareBufferFormat = num2;
    }
}
