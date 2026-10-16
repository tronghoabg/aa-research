package androidx.core.widget;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface AutoSizeableTextView {

    @Deprecated
    public static final boolean PLATFORM_SUPPORTS_AUTOSIZE = true;

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5);

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2);

    void setAutoSizeTextTypeWithDefaults(int i2);
}
