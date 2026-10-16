package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface TargetConfig<T> extends ReadableConfig {
    public static final Config.Option<String> OPTION_TARGET_NAME = Config.Option.create("camerax.core.target.name", String.class);
    public static final Config.Option<Class<?>> OPTION_TARGET_CLASS = Config.Option.create("camerax.core.target.class", Class.class);

    /* compiled from: WazeSource */
    public interface Builder<T, B> {
        B setTargetClass(Class<T> cls);

        B setTargetName(String str);
    }

    Class<T> getTargetClass();

    Class<T> getTargetClass(Class<T> cls);

    String getTargetName();

    String getTargetName(String str);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.internal.TargetConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Class $default$getTargetClass(TargetConfig targetConfig) {
            return (Class) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_CLASS);
        }

        public static String $default$getTargetName(TargetConfig targetConfig) {
            return (String) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME);
        }

        public static Class $default$getTargetClass(TargetConfig targetConfig, Class cls) {
            return (Class) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, cls);
        }

        public static String $default$getTargetName(TargetConfig targetConfig, String str) {
            return (String) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME, str);
        }
    }
}
