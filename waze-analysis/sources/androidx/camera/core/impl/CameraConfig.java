package androidx.camera.core.impl;

import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.Config;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraConfig extends ReadableConfig {
    public static final int REQUIRED_RULE_COEXISTING_PREVIEW_AND_IMAGE_CAPTURE = 1;
    public static final int REQUIRED_RULE_NONE = 0;
    public static final Config.Option<UseCaseConfigFactory> OPTION_USECASE_CONFIG_FACTORY = Config.Option.create("camerax.core.camera.useCaseConfigFactory", UseCaseConfigFactory.class);
    public static final Config.Option<Identifier> OPTION_COMPATIBILITY_ID = Config.Option.create("camerax.core.camera.compatibilityId", Identifier.class);
    public static final Config.Option<Integer> OPTION_USE_CASE_COMBINATION_REQUIRED_RULE = Config.Option.create("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);
    public static final Config.Option<SessionProcessor> OPTION_SESSION_PROCESSOR = Config.Option.create("camerax.core.camera.SessionProcessor", SessionProcessor.class);
    public static final Config.Option<Boolean> OPTION_ZSL_DISABLED = Config.Option.create("camerax.core.camera.isZslDisabled", Boolean.class);
    public static final Config.Option<Boolean> OPTION_POSTVIEW_SUPPORTED = Config.Option.create("camerax.core.camera.isPostviewSupported", Boolean.class);
    public static final Config.Option<PostviewFormatSelector> OPTION_POSTVIEW_FORMAT_SELECTOR = Config.Option.create("camerax.core.camera.PostviewFormatSelector", PostviewFormatSelector.class);
    public static final Config.Option<Boolean> OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED = Config.Option.create("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);
    public static final PostviewFormatSelector DEFAULT_POSTVIEW_FORMAT_SELECTOR = new PostviewFormatSelector() { // from class: androidx.camera.core.impl.CameraConfig$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.impl.CameraConfig.PostviewFormatSelector
        public final int select(int i2, List list) {
            return CameraConfig.CC.lambda$static$0(i2, list);
        }
    };

    /* compiled from: WazeSource */
    public interface Builder<B> {
        B setCaptureProcessProgressSupported(boolean z);

        B setCompatibilityId(Identifier identifier);

        B setPostviewFormatSelector(PostviewFormatSelector postviewFormatSelector);

        B setPostviewSupported(boolean z);

        B setSessionProcessor(SessionProcessor sessionProcessor);

        B setUseCaseCombinationRequiredRule(int i2);

        B setUseCaseConfigFactory(UseCaseConfigFactory useCaseConfigFactory);

        B setZslDisabled(boolean z);
    }

    /* compiled from: WazeSource */
    public interface PostviewFormatSelector {
        int select(int i2, List<Integer> list);
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequiredRule {
    }

    Identifier getCompatibilityId();

    PostviewFormatSelector getPostviewFormatSelector();

    SessionProcessor getSessionProcessor();

    SessionProcessor getSessionProcessor(SessionProcessor sessionProcessor);

    int getUseCaseCombinationRequiredRule();

    UseCaseConfigFactory getUseCaseConfigFactory();

    boolean isCaptureProcessProgressSupported();

    boolean isPostviewSupported();

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.CameraConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static PostviewFormatSelector $default$getPostviewFormatSelector(CameraConfig cameraConfig) {
            return (PostviewFormatSelector) cameraConfig.retrieveOption(CameraConfig.OPTION_POSTVIEW_FORMAT_SELECTOR, CameraConfig.DEFAULT_POSTVIEW_FORMAT_SELECTOR);
        }

        public static SessionProcessor $default$getSessionProcessor(CameraConfig cameraConfig) {
            return (SessionProcessor) cameraConfig.retrieveOption(CameraConfig.OPTION_SESSION_PROCESSOR);
        }

        public static UseCaseConfigFactory $default$getUseCaseConfigFactory(CameraConfig cameraConfig) {
            return (UseCaseConfigFactory) cameraConfig.retrieveOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, UseCaseConfigFactory.EMPTY_INSTANCE);
        }

        static {
            Config.Option<UseCaseConfigFactory> option = CameraConfig.OPTION_USECASE_CONFIG_FACTORY;
        }

        public static /* synthetic */ int lambda$static$0(int i2, List list) {
            if (list.contains(35)) {
                return 35;
            }
            if (list.contains(256)) {
                return 256;
            }
            return list.contains(4101) ? 4101 : 0;
        }

        public static SessionProcessor $default$getSessionProcessor(CameraConfig cameraConfig, SessionProcessor sessionProcessor) {
            return (SessionProcessor) cameraConfig.retrieveOption(CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
        }
    }
}
