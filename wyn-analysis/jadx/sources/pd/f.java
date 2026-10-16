package pd;

import A.AbstractC0213f;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import k9.C3212a;
import s2.C;
import t0.C4070r;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class f {
    public static boolean a(vg.b bVar, int i5) {
        char c10;
        if (i5 == 1) {
            c10 = '(';
        } else if (i5 == 2) {
            c10 = 30;
        } else if (i5 == 3) {
            c10 = 20;
        } else if (i5 == 4) {
            c10 = '\n';
        } else {
            if (i5 != 5) {
                throw null;
            }
            c10 = 0;
        }
        if (c10 == 0) {
            return bVar.e();
        }
        if (c10 == '\n') {
            return bVar.b();
        }
        if (c10 == 20) {
            return bVar.d();
        }
        if (c10 == 30) {
            return bVar.a();
        }
        if (c10 == '(') {
            return bVar.n();
        }
        StringBuilder sb2 = new StringBuilder("Level [");
        sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR");
        sb2.append("] not recognized.");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void b(C c10, Q1.o oVar, int i5) {
        c10.f(oVar, i5, 0);
    }

    public static int c(int i5) {
        if (i5 == -16) {
            return 1;
        }
        if (i5 == -8) {
            return 2;
        }
        if (i5 == 0) {
            return 3;
        }
        if (i5 == 8) {
            return 4;
        }
        if (i5 == 16) {
            return 5;
        }
        if (i5 == 24) {
            return 6;
        }
        if (i5 == 32) {
            return 7;
        }
        if (i5 == 40) {
            return 8;
        }
        return i5 == 48 ? 9 : 10;
    }

    public static int d(String str) throws NoSuchFieldException {
        String str2;
        for (int i5 : AbstractC0213f.g(2)) {
            if (i5 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i5 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i5;
            }
        }
        throw new NoSuchFieldException(R8.v.f("No such Brightness: ", str));
    }

    public static int e(String str) throws NoSuchFieldException {
        for (int i5 : AbstractC0213f.g(5)) {
            String str2 = null;
            if (i5 != 1) {
                if (i5 == 2) {
                    str2 = "HapticFeedbackType.lightImpact";
                } else if (i5 == 3) {
                    str2 = "HapticFeedbackType.mediumImpact";
                } else if (i5 == 4) {
                    str2 = "HapticFeedbackType.heavyImpact";
                } else {
                    if (i5 != 5) {
                        throw null;
                    }
                    str2 = "HapticFeedbackType.selectionClick";
                }
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i5;
            }
        }
        throw new NoSuchFieldException(R8.v.f("No such HapticFeedbackType: ", str));
    }

    public static int f(String str) throws NoSuchFieldException {
        String str2;
        for (int i5 : AbstractC0213f.g(2)) {
            if (i5 == 1) {
                str2 = "SystemSoundType.click";
            } else {
                if (i5 != 2) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i5;
            }
        }
        throw new NoSuchFieldException(R8.v.f("No such SoundType: ", str));
    }

    public static final String g(int i5) {
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            return "Activity is missing. This might happen when running a certain function from the background that requires a UI element (e.g. requesting permissions or enabling the location services).";
        }
        if (iF == 1) {
            return "An unexpected error occurred while trying to acquire the device's position.";
        }
        if (iF == 2) {
            return "Location services are disabled. To receive location updates the location services should be enabled.";
        }
        if (iF == 3) {
            return "No location permissions are defined in the manifest. Make sure at least ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION are defined in the manifest.";
        }
        if (iF == 4) {
            return "User denied permissions to access the device's location.";
        }
        if (iF == 5) {
            return "Already listening for location updates. If you want to restart listening please cancel other subscriptions first";
        }
        throw new IndexOutOfBoundsException();
    }

    public static final String h(int i5) {
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            return "ACTIVITY_MISSING";
        }
        if (iF == 1) {
            return "ERROR_WHILE_ACQUIRING_POSITION";
        }
        if (iF == 2) {
            return "LOCATION_SERVICES_DISABLED";
        }
        if (iF == 3) {
            return "PERMISSION_DEFINITIONS_NOT_FOUND";
        }
        if (iF == 4) {
            return "PERMISSION_DENIED";
        }
        if (iF == 5) {
            return "PERMISSION_REQUEST_IN_PROGRESS";
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ int i(int i5) {
        switch (i5) {
            case 1:
                return -16;
            case 2:
                return -8;
            case 3:
                return 0;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 24;
            case 7:
                return 32;
            case 8:
                return 40;
            case 9:
                return 48;
            case 10:
                return 56;
            default:
                throw null;
        }
    }

    public static D0.b j(C4070r c4070r, int i5, int i10, tf.l lVar) {
        ff.w wVar = ff.w.f35433a;
        c4070r.getClass();
        return new D0.b(i5, i10, wVar, c4070r, lVar);
    }

    public static String k(Uri uri, String str) {
        return str + uri;
    }

    public static StringBuilder l(int i5, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i5);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap m(Class cls, C3212a c3212a) {
        HashMap map = new HashMap();
        map.put(cls, c3212a);
        return map;
    }

    public static Map n(HashMap map) {
        return DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public static /* synthetic */ void o(int i5, String str) {
        if (i5 == 0) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static /* synthetic */ String p(int i5) {
        return i5 != 1 ? i5 != 2 ? "null" : "PLAINTEXT" : "TLS";
    }

    public static /* synthetic */ String q(int i5) {
        return i5 != 1 ? i5 != 2 ? "null" : "OUTBOUND" : "INBOUND";
    }

    public static /* synthetic */ String r(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "COMPLETED" : "FAILED" : "RUNNING" : "CREATED";
    }

    public static /* synthetic */ String s(int i5) {
        switch (i5) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String t(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "Idle" : "LayingOut" : "Measuring";
    }
}
