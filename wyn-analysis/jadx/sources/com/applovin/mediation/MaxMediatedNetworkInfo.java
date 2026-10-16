package com.applovin.mediation;

/* loaded from: classes.dex */
public interface MaxMediatedNetworkInfo {

    public enum InitializationStatus {
        NOT_INITIALIZED(-4),
        DOES_NOT_APPLY(-3),
        INITIALIZING(-2),
        INITIALIZED_UNKNOWN(-1),
        INITIALIZED_FAILURE(0),
        INITIALIZED_SUCCESS(1);


        /* renamed from: a, reason: collision with root package name */
        private final int f24050a;

        InitializationStatus(int i5) {
            this.f24050a = i5;
        }

        public static InitializationStatus fromCode(int i5) {
            for (InitializationStatus initializationStatus : values()) {
                if (initializationStatus.getCode() == i5) {
                    return initializationStatus;
                }
            }
            return NOT_INITIALIZED;
        }

        public int getCode() {
            return this.f24050a;
        }
    }

    String getAdapterClassName();

    String getAdapterVersion();

    InitializationStatus getInitializationStatus();

    String getName();

    String getSdkVersion();
}
