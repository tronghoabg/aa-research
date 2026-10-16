package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class dvb {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b = new ThreadLocal();
    private static final WeakHashMap c = new WeakHashMap(0);
    private static final Object d = new Object();

    public static float a(Resources resources, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 29) {
            return resources.getFloat(i);
        }
        TypedValue typedValueE = e();
        resources.getValue(i, typedValueE, true);
        if (typedValueE.type == 4) {
            return typedValueE.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValueE.type) + " is not valid");
    }

    public static ColorStateList b(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        ColorStateList colorStateListA;
        Object obj;
        smv smvVar;
        Resources.Theme theme2;
        duy duyVar = new duy(resources, theme);
        synchronized (d) {
            SparseArray sparseArray = (SparseArray) c.get(duyVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (smvVar = (smv) sparseArray.get(i)) == null) {
                obj = null;
            } else if (!((Configuration) smvVar.b).equals(duyVar.a.getConfiguration()) || (!((theme2 = duyVar.b) == null && smvVar.a == 0) && (theme2 == null || smvVar.a != theme2.hashCode()))) {
                sparseArray.remove(i);
                obj = null;
            } else {
                obj = smvVar.c;
            }
        }
        if (obj != null) {
            return (ColorStateList) obj;
        }
        TypedValue typedValueE = e();
        resources.getValue(i, typedValueE, true);
        if (typedValueE.type < 28 || typedValueE.type > 31) {
            try {
                colorStateListA = duv.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (d) {
            WeakHashMap weakHashMap = c;
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(duyVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(duyVar, sparseArray2);
            }
            sparseArray2.append(i, new smv(colorStateListA, duyVar.a.getConfiguration(), theme));
        }
        return colorStateListA;
    }

    public static void c(Context context, int i, duz duzVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            duzVar.c(-4);
        } else {
            d(context, i, new TypedValue(), 0, duzVar, false, false);
        }
    }

    public static Typeface d(Context context, int i, TypedValue typedValue, int i2, duz duzVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceF = f(context, resources, typedValue, i, i2, duzVar, z, z2);
        if (typefaceF != null || duzVar != null || z2) {
            return typefaceF;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    private static TypedValue e() {
        ThreadLocal threadLocal = b;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x02f6, code lost:
    
        r6 = r8.build();
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0208 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0216 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface f(android.content.Context r32, android.content.res.Resources r33, android.util.TypedValue r34, int r35, int r36, defpackage.duz r37, boolean r38, boolean r39) throws org.xmlpull.v1.XmlPullParserException, java.lang.NoSuchFieldException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvb.f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, duz, boolean, boolean):android.graphics.Typeface");
    }
}
