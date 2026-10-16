package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Config;
import androidx.core.util.Preconditions;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImageInputConfig extends ReadableConfig {
    public static final Config.Option<Integer> OPTION_INPUT_FORMAT = Config.Option.create("camerax.core.imageInput.inputFormat", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_SECONDARY_INPUT_FORMAT = Config.Option.create("camerax.core.imageInput.secondaryInputFormat", Integer.TYPE);
    public static final Config.Option<DynamicRange> OPTION_INPUT_DYNAMIC_RANGE = Config.Option.create("camerax.core.imageInput.inputDynamicRange", DynamicRange.class);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.ImageInputConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static DynamicRange $default$getDynamicRange(ImageInputConfig imageInputConfig) {
            DynamicRange dynamicRange = (DynamicRange) imageInputConfig.retrieveOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED);
            Preconditions.checkNotNull(dynamicRange);
            return dynamicRange;
        }
    }

    /* compiled from: WazeSource */
    public interface Builder<B> {
        B setDynamicRange(DynamicRange dynamicRange);
    }

    DynamicRange getDynamicRange();

    int getInputFormat();

    int getSecondaryInputFormat();

    boolean hasDynamicRange();
}
