package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class adux {
    public static final Logger a = Logger.getLogger(adux.class.getName());

    private adux() {
    }

    public static Object a(zkn zknVar) throws IOException, NumberFormatException {
        String strE;
        String string;
        double d;
        woy.aa(zknVar.h(), "unexpected end of JSON");
        int i = zknVar.i() - 1;
        boolean z = true;
        if (i == 0) {
            int iA = zknVar.c;
            if (iA == 0) {
                iA = zknVar.a();
            }
            if (iA != 3) {
                throw zknVar.c("BEGIN_ARRAY");
            }
            zknVar.g(1);
            zknVar.i[zknVar.g - 1] = 0;
            zknVar.c = 0;
            ArrayList arrayList = new ArrayList();
            while (zknVar.h()) {
                arrayList.add(a(zknVar));
            }
            woy.aa(zknVar.i() == 2, "Bad token: ".concat(zknVar.j()));
            int iA2 = zknVar.c;
            if (iA2 == 0) {
                iA2 = zknVar.a();
            }
            if (iA2 != 4) {
                throw zknVar.c("END_ARRAY");
            }
            int i2 = zknVar.g;
            zknVar.g = i2 - 1;
            int[] iArr = zknVar.i;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            zknVar.c = 0;
            return DesugarCollections.unmodifiableList(arrayList);
        }
        if (i == 2) {
            int iA3 = zknVar.c;
            if (iA3 == 0) {
                iA3 = zknVar.a();
            }
            if (iA3 != 1) {
                throw zknVar.c("BEGIN_OBJECT");
            }
            zknVar.g(3);
            zknVar.c = 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (zknVar.h()) {
                int iA4 = zknVar.c;
                if (iA4 == 0) {
                    iA4 = zknVar.a();
                }
                if (iA4 == 14) {
                    strE = zknVar.f();
                } else if (iA4 == 12) {
                    strE = zknVar.e('\'');
                } else {
                    if (iA4 != 13) {
                        throw zknVar.c("a name");
                    }
                    strE = zknVar.e('\"');
                }
                zknVar.c = 0;
                zknVar.h[zknVar.g - 1] = strE;
                woy.S(!linkedHashMap.containsKey(strE), "Duplicate key found: %s", strE);
                linkedHashMap.put(strE, a(zknVar));
            }
            woy.aa(zknVar.i() == 4, "Bad token: ".concat(zknVar.j()));
            int iA5 = zknVar.c;
            if (iA5 == 0) {
                iA5 = zknVar.a();
            }
            if (iA5 != 2) {
                throw zknVar.c("END_OBJECT");
            }
            int i4 = zknVar.g;
            int i5 = i4 - 1;
            zknVar.g = i5;
            zknVar.h[i5] = null;
            int[] iArr2 = zknVar.i;
            int i6 = i4 - 2;
            iArr2[i6] = iArr2[i6] + 1;
            zknVar.c = 0;
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        if (i == 5) {
            int iA6 = zknVar.c;
            if (iA6 == 0) {
                iA6 = zknVar.a();
            }
            if (iA6 == 10) {
                string = zknVar.f();
            } else if (iA6 == 8) {
                string = zknVar.e('\'');
            } else if (iA6 == 9) {
                string = zknVar.e('\"');
            } else if (iA6 == 11) {
                string = zknVar.f;
                zknVar.f = null;
            } else if (iA6 == 15) {
                string = Long.toString(zknVar.d);
            } else {
                if (iA6 != 16) {
                    throw zknVar.c("a string");
                }
                String str = new String(zknVar.a, zknVar.b, zknVar.e);
                zknVar.b += zknVar.e;
                string = str;
            }
            zknVar.c = 0;
            int[] iArr3 = zknVar.i;
            int i7 = zknVar.g - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return string;
        }
        if (i != 6) {
            if (i != 7) {
                if (i != 8) {
                    throw new IllegalStateException("Bad token: ".concat(zknVar.j()));
                }
                int iA7 = zknVar.c;
                if (iA7 == 0) {
                    iA7 = zknVar.a();
                }
                if (iA7 != 7) {
                    throw zknVar.c("null");
                }
                zknVar.c = 0;
                int[] iArr4 = zknVar.i;
                int i8 = zknVar.g - 1;
                iArr4[i8] = iArr4[i8] + 1;
                return null;
            }
            int iA8 = zknVar.c;
            if (iA8 == 0) {
                iA8 = zknVar.a();
            }
            if (iA8 == 5) {
                zknVar.c = 0;
                int[] iArr5 = zknVar.i;
                int i9 = zknVar.g - 1;
                iArr5[i9] = iArr5[i9] + 1;
            } else {
                if (iA8 != 6) {
                    throw zknVar.c("a boolean");
                }
                zknVar.c = 0;
                int[] iArr6 = zknVar.i;
                int i10 = zknVar.g - 1;
                iArr6[i10] = iArr6[i10] + 1;
                z = false;
            }
            return Boolean.valueOf(z);
        }
        int iA9 = zknVar.c;
        if (iA9 == 0) {
            iA9 = zknVar.a();
        }
        if (iA9 == 15) {
            zknVar.c = 0;
            int[] iArr7 = zknVar.i;
            int i11 = zknVar.g - 1;
            iArr7[i11] = iArr7[i11] + 1;
            d = zknVar.d;
        } else {
            if (iA9 == 16) {
                char[] cArr = zknVar.a;
                int i12 = zknVar.b;
                int i13 = zknVar.e;
                zknVar.f = new String(cArr, i12, i13);
                zknVar.b = i12 + i13;
            } else if (iA9 == 8 || iA9 == 9) {
                zknVar.f = zknVar.e(iA9 == 8 ? '\'' : '\"');
            } else if (iA9 == 10) {
                zknVar.f = zknVar.f();
            } else if (iA9 != 11) {
                throw zknVar.c("a double");
            }
            zknVar.c = 11;
            try {
                d = Double.parseDouble(zknVar.f);
                if (Double.isNaN(d) || Double.isInfinite(d)) {
                    throw zknVar.b("JSON forbids NaN and infinities: " + d);
                }
                zknVar.f = null;
                zknVar.c = 0;
                int[] iArr8 = zknVar.i;
                int i14 = zknVar.g - 1;
                iArr8[i14] = iArr8[i14] + 1;
            } catch (NumberFormatException e) {
                NumberFormatException numberFormatException = new NumberFormatException("Expected a double but was " + zknVar.f + zknVar.d());
                numberFormatException.initCause(e);
                throw numberFormatException;
            }
        }
        return Double.valueOf(d);
    }
}
