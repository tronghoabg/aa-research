package androidx.camera.camera2.interop;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.Camera2ImplConfigKt;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.ReadableConfig;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CaptureRequestOptions implements ReadableConfig {
    private final Config config;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptureRequestOptions(Config config) {
        this(config, false);
        x.f(config, "config");
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ boolean containsOption(Config.Option option) {
        return getConfig().containsOption(option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        getConfig().findOptions(str, optionMatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ValueT> ValueT getCaptureRequestOption(CaptureRequest.Key<ValueT> key) {
        x.f(key, "key");
        return (ValueT) this.config.retrieveOption(Camera2ImplConfigKt.createCaptureRequestOption(key), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <ValueT> ValueT getCaptureRequestOption$camera_camera2(CaptureRequest.Key<ValueT> key, ValueT valuet) {
        x.f(key, "key");
        return (ValueT) this.config.retrieveOption(Camera2ImplConfigKt.createCaptureRequestOption(key), valuet);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public Config getConfig() {
        return this.config;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return getConfig().getOptionPriority(option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Set getPriorities(Config.Option option) {
        return getConfig().getPriorities(option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Set listOptions() {
        return getConfig().listOptions();
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOption(Config.Option option) {
        return getConfig().retrieveOption(option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
        return getConfig().retrieveOptionWithPriority(option, optionPriority);
    }

    /* compiled from: WazeSource */
    public final class Builder implements ExtendableBuilder<CaptureRequestOptions> {
        public static final Companion Companion = new Companion(null);
        private final MutableOptionsBundle mutableOptionsBundle;

        public Builder() {
            MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
            x.e(mutableOptionsBundleCreate, "create(...)");
            this.mutableOptionsBundle = mutableOptionsBundleCreate;
        }

        public static final Builder from(Config config) {
            return Companion.from(config);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        public CaptureRequestOptions build() {
            OptionsBundle optionsBundleFrom = OptionsBundle.from(this.mutableOptionsBundle);
            x.e(optionsBundleFrom, "from(...)");
            return new CaptureRequestOptions(optionsBundleFrom);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <ValueT> Builder clearCaptureRequestOption(CaptureRequest.Key<ValueT> key) {
            x.f(key, "key");
            this.mutableOptionsBundle.removeOption(Camera2ImplConfigKt.createCaptureRequestOption(key));
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public MutableConfig getMutableConfig() {
            return this.mutableOptionsBundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <ValueT> Builder setCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            x.f(key, "key");
            this.mutableOptionsBundle.insertOption(Camera2ImplConfigKt.createCaptureRequestOption(key), valuet);
            return this;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            static final boolean from$lambda$0(Builder builder, Config config, Config.Option option) {
                x.f(option, "it");
                builder.getMutableConfig().insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
                return true;
            }

            public final Builder from(final Config config) {
                x.f(config, "config");
                final Builder builder = new Builder();
                config.findOptions(Camera2ImplConfig.CAPTURE_REQUEST_ID_STEM, new Config.OptionMatcher() { // from class: androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0
                    @Override // androidx.camera.core.impl.Config.OptionMatcher
                    public final boolean onOptionMatched(Config.Option option) {
                        CaptureRequestOptions.Builder.Companion.from$lambda$0(builder, config, option);
                        return true;
                    }
                });
                return builder;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
        return getConfig().retrieveOption(option, obj);
    }

    private CaptureRequestOptions(Config config, boolean z) {
        this.config = config;
    }
}
