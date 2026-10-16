package gatewayprotocol.v1;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public final class AdFormatOuterClass {

    public enum AdFormat implements Internal.EnumLite {
        AD_FORMAT_UNSPECIFIED(0),
        AD_FORMAT_INTERSTITIAL(1),
        AD_FORMAT_REWARDED(2),
        AD_FORMAT_BANNER(3),
        AD_FORMAT_MREC(4),
        AD_FORMAT_NATIVE(5),
        UNRECOGNIZED(-1);

        public static final int AD_FORMAT_BANNER_VALUE = 3;
        public static final int AD_FORMAT_INTERSTITIAL_VALUE = 1;
        public static final int AD_FORMAT_MREC_VALUE = 4;
        public static final int AD_FORMAT_NATIVE_VALUE = 5;
        public static final int AD_FORMAT_REWARDED_VALUE = 2;
        public static final int AD_FORMAT_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<AdFormat> internalValueMap = new C2720a();
        private final int value;

        AdFormat(int i5) {
            this.value = i5;
        }

        public static AdFormat forNumber(int i5) {
            if (i5 == 0) {
                return AD_FORMAT_UNSPECIFIED;
            }
            if (i5 == 1) {
                return AD_FORMAT_INTERSTITIAL;
            }
            if (i5 == 2) {
                return AD_FORMAT_REWARDED;
            }
            if (i5 == 3) {
                return AD_FORMAT_BANNER;
            }
            if (i5 == 4) {
                return AD_FORMAT_MREC;
            }
            if (i5 != 5) {
                return null;
            }
            return AD_FORMAT_NATIVE;
        }

        public static Internal.EnumLiteMap<AdFormat> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C2721b.f35842a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static AdFormat valueOf(int i5) {
            return forNumber(i5);
        }
    }

    private AdFormatOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
