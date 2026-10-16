package com.google.android.libraries.assistant.appintegration.shared;

import com.google.d.d.bn;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AssistantConstants {
    public static final String GMM_PACKAGE_DEV = "com.google.android.apps.gmm.dev";
    public static final String GMM_PACKAGE_CAR = "com.google.android.apps.gmm.car";
    public static final String GMM_PACKAGE_PREVIEW = "com.google.android.apps.gmm.qp";
    public static final String GMM_PACKAGE_FISHFOOD = "com.google.android.apps.gmm.fishfood";
    public static final String GMM_PACKAGE_DOGFOOD = "com.google.android.apps.gmm";
    public static final String GMM_PACKAGE = "com.google.android.apps.maps";
    public static final bn<String> ORDERED_GMM_PACKAGES = bn.u(GMM_PACKAGE_DEV, GMM_PACKAGE_CAR, GMM_PACKAGE_PREVIEW, GMM_PACKAGE_FISHFOOD, GMM_PACKAGE_DOGFOOD, GMM_PACKAGE);

    /* compiled from: WazeSource */
    public @interface ConnectionState {
        public static final int CONNECTED = 3;
        public static final int CONNECTING = 2;
        public static final int DISCONNECTED = 1;
        public static final int UNBOUND = 0;
    }

    /* compiled from: WazeSource */
    public @interface CustomizedSource {
        public static final int COMPOSE = 3;
        public static final int MIC = 1;
        public static final int SUGGESTION = 2;
        public static final int UNKNOWN = 0;
    }

    /* compiled from: WazeSource */
    public final class Done {
        public static final Done DONE = new Done();
        public static final Done INCOMPLETE = new Done();
    }

    /* compiled from: WazeSource */
    public @interface Feature {
        public static final String PHOTO_SHARING = "PHOTO_SHARING";
    }

    /* compiled from: WazeSource */
    public @interface InputModality {
        public static final int TYPING = 2;
        public static final int UNKNOWN = 0;
        public static final int VOICE = 1;
    }

    /* compiled from: WazeSource */
    public @interface MultiAccountPolicy {
        public static final int ALLOWED = 0;
        public static final int NOT_ALLOWED = 1;
    }

    /* compiled from: WazeSource */
    public @interface VoicePlateMode {
        public static final int DEFAULT = 0;

        @Deprecated
        public static final int DRIVING = 3;
        public static final int MINI = 1;
        public static final int MINI_DARK = 2;
    }
}
