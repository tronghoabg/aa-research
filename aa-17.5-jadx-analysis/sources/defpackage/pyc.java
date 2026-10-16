package defpackage;

/* loaded from: classes2.dex */
public final class pyc extends Throwable {
    public static final int a(Throwable th) {
        String str;
        th.getClass();
        int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 0; i < 11; i++) {
            int i2 = iArr[i];
            switch (i2) {
                case 1:
                    str = "UNKNOWN";
                    break;
                case 2:
                    str = "PHENOTYPE_DISABLED";
                    break;
                case 3:
                    str = "GET_CONFIGURATIONS_FAILED";
                    break;
                case 4:
                    str = "NULL_CONFIGURATION";
                    break;
                case 5:
                    str = "EMPTY_CONFIGURATION";
                    break;
                case 6:
                    str = "CP_BUILD_FAILED";
                    break;
                case 7:
                    str = "NOT_DIVERTED_WITH_RUNTIME_PROPERTIES";
                    break;
                case 8:
                    str = "COMMIT_FAILED";
                    break;
                case 9:
                    str = "NON_MENDEL_RPC_FAILED_WHEN_NOT_BUILDING_CP";
                    break;
                case 10:
                    str = "NON_MENDEL_RPC_FAILED_WHEN_BUILDING_CP";
                    break;
                case 11:
                    str = "PARSE_FLAG_NAME_FAILED";
                    break;
                default:
                    str = "null";
                    break;
            }
            if (i2 == 0) {
                throw null;
            }
            if (affa.f(str, th.getMessage())) {
                return i2;
            }
        }
        return 0;
    }
}
