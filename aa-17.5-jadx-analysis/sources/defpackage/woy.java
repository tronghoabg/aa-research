package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.lang.Iterable$EL;
import java.io.File;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;

/* loaded from: classes.dex */
public class woy {
    public woy() {
    }

    public static boolean A(Resources.Theme theme, int i, boolean z) {
        TypedValue typedValueX = x(theme, i);
        return (typedValueX == null || typedValueX.type != 18) ? z : typedValueX.data != 0;
    }

    public static int B(Context context, String str) {
        return y(context, R.attr.materialCalendarStyle, str).data;
    }

    public static TimeInterpolator C(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!k(strValueOf, "cubic-bezier") && !k(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!k(strValueOf, "cubic-bezier")) {
            if (k(strValueOf, "path")) {
                return new PathInterpolator(dtd.b(j(strValueOf, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(strValueOf)));
        }
        String[] strArrSplit = j(strValueOf, "cubic-bezier").split(",");
        int length = strArrSplit.length;
        if (length == 4) {
            return new PathInterpolator(g(strArrSplit, 0), g(strArrSplit, 1), g(strArrSplit, 2), g(strArrSplit, 3));
        }
        throw new IllegalArgumentException(a.bp(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
    }

    public static emq D(Context context, int i) {
        TypedValue typedValueW = w(context, R.attr.motionSpringFastSpatial);
        TypedArray typedArrayObtainStyledAttributes = typedValueW == null ? context.obtainStyledAttributes(null, wrl.a, 0, i) : context.obtainStyledAttributes(typedValueW.resourceId, wrl.a);
        emq emqVar = new emq();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            emqVar.e(f);
            emqVar.c(f2);
            return emqVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static float E(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static Rect F(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static InputMethodManager G(View view) {
        return (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
    }

    public static Integer H(View view) {
        ColorStateList colorStateListB = b(view.getBackground());
        if (colorStateListB != null) {
            return Integer.valueOf(colorStateListB.getDefaultColor());
        }
        return null;
    }

    public static void I(View view, wqv wqvVar) {
        wqt wqtVar = new wqt(wqvVar, new wqw(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom()));
        int[] iArr = ebm.a;
        ebe.e(view, wqtVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new wqu());
        }
    }

    public static boolean J(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static Rect K(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static boolean L(boolean z) {
        return r(0) || z;
    }

    public static String M(int i, int i2, String str) {
        if (i < 0) {
            return wub.M("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return wub.M("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.bp(i2, "negative size: "));
    }

    public static void N(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void O(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void P(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(wub.M(str, Character.valueOf(c)));
        }
    }

    public static void Q(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(wub.M(str, Integer.valueOf(i)));
        }
    }

    public static void R(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(wub.M(str, Long.valueOf(j)));
        }
    }

    public static void S(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(wub.M(str, obj));
        }
    }

    public static void T(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(wub.M(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void U(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new IllegalArgumentException(wub.M(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static void V(boolean z, String str, Object obj, int i) {
        if (!z) {
            throw new IllegalArgumentException(wub.M(str, obj, Integer.valueOf(i)));
        }
    }

    public static void W(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(wub.M(str, obj, obj2));
        }
    }

    public static void X(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(wub.M(str, obj, obj2, obj3));
        }
    }

    public static void Y(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? M(i, i3, "start index") : (i2 < 0 || i2 > i3) ? M(i2, i3, "end index") : wub.M("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void Z(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    static void a(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static void aA(wgz wgzVar, HashMap map) {
        String strA = wgzVar.a();
        S(!map.containsKey(strA), "There is already a factory registered for the ID %s", strA);
        map.put(strA, wgzVar);
    }

    public static File aB(Uri uri) throws wfh {
        if (!uri.getScheme().equals("file")) {
            throw new wfh("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new wfh("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new wfh("Did not expect uri to have authority");
    }

    public static File aC(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }

    public static void aD(zgp zgpVar) {
        zgpVar.c(new teg(zgpVar, 10), zfq.a);
    }

    public static /* synthetic */ boolean aE(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        while (!atomicReferenceArray.compareAndSet(i, null, obj)) {
            if (atomicReferenceArray.get(i) != null) {
                return false;
            }
        }
        return true;
    }

    public static int aF(int i) {
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static void aG(Level level, Executor executor, Throwable th, String str, Object... objArr) {
        executor.execute(xur.c(new saq(level, th, str, objArr, 12)));
    }

    public static Object aH(vzw vzwVar) {
        try {
            return vzwVar.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return vzwVar.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static int aI(Object[] objArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static String aJ(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void aK(Object[] objArr, int i) {
        objArr.getClass();
        objArr[i] = null;
    }

    public static void aL(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            aK(objArr, i);
            i++;
        }
    }

    public static boolean aM(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!affa.f(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static Set aN(Set set) {
        ((afce) set).b.e();
        return ((afaw) set).size() > 0 ? set : afce.a;
    }

    public static Set aO(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static Set aP(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(aV(objArr.length));
        dA(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set aQ(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Collection<?> collectionBv = bv(iterable);
        if (collectionBv.isEmpty()) {
            return cl(set);
        }
        if (!(collectionBv instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionBv);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionBv).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set aR(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(aV(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && affa.f(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set aS(Set set, Iterable iterable) {
        int size;
        set.getClass();
        iterable.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            int size2 = set.size();
            size = size2 + size2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(aV(size));
        linkedHashSet.addAll(set);
        cq(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static Set aT(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(aV(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Object aU(Map map, Object obj) {
        if (map instanceof afbl) {
            return ((afbl) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(a.bm(obj, "Key ", " is missing in the map."));
    }

    public static int aV(int i) {
        return i >= 0 ? i < 3 ? i + 1 : i >= 1073741824 ? Alert.DURATION_SHOW_INDEFINITELY : (int) ((i / 0.75f) + 1.0f) : i;
    }

    public static Map aW(aezu aezuVar) {
        aezuVar.getClass();
        Map mapSingletonMap = Collections.singletonMap(aezuVar.a, aezuVar.b);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static SortedMap aX(Map map, Comparator comparator) {
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    public static Object aY(Map map, Object obj) {
        map.getClass();
        return aU(map, obj);
    }

    public static HashMap aZ(aezu... aezuVarArr) {
        HashMap map = new HashMap(aV(aezuVarArr.length));
        bf(map, aezuVarArr);
        return map;
    }

    public static void aa(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void ab(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(wub.M(str, Integer.valueOf(i)));
        }
    }

    public static void ac(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(wub.M(str, Long.valueOf(j)));
        }
    }

    public static void ad(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(wub.M(str, obj));
        }
    }

    public static void ae(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(wub.M(str, objArr));
        }
    }

    public static void af(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(wub.M(str, obj, obj2));
        }
    }

    public static void ag(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(wub.M(str, obj, obj2, obj3));
        }
    }

    public static void ah(boolean z, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalArgumentException(wub.M("Duplicate key: (row=%s, column=%s), values: [%s, %s].", obj, obj2, obj3, obj4));
        }
    }

    public static void ai(int i, int i2) {
        String strM;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM = wub.M("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.bp(i2, "negative size: "));
                }
                strM = wub.M("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM);
        }
    }

    public static void aj(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(M(i, i2, "index"));
        }
    }

    public static String ak(String str) {
        if (am(str)) {
            return null;
        }
        return str;
    }

    public static String al(String str) {
        return str == null ? "" : str;
    }

    public static boolean am(String str) {
        return str == null || str.isEmpty();
    }

    public static xxg an(Class cls) {
        return new xxg(cls.getSimpleName());
    }

    public static xxg ao(Object obj) {
        return new xxg(obj.getClass().getSimpleName());
    }

    public static Object ap(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static char aq(char c) {
        return au(c) ? (char) (c ^ ' ') : c;
    }

    public static String ar(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (av(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (av(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String as(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (au(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (au(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean at(CharSequence charSequence, CharSequence charSequence2) {
        char c;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i) && ((c = (char) ((r4 | ' ') - 97)) >= 26 || c != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean au(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean av(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [xuk] */
    public static xua aw(String str, xue xueVar, boolean z) {
        boolean z2;
        ?? r0;
        xuk xukVarG;
        nrd nrdVar = (nrd) xts.c.get();
        Object obj = nrdVar.c;
        if (obj == xtz.a) {
            Object obj2 = nrdVar.b;
            r0 = 0;
            xts.h(nrdVar, null);
            z2 = true;
        } else {
            z2 = false;
            r0 = obj;
        }
        boolean z3 = z2;
        if (r0 == 0) {
            UUID uuidB = xtt.a.b();
            String strGQ = xtj.gQ(uuidB);
            xtk xtkVar = xtu.a;
            ygr ygrVar = (ygr) xts.a.get();
            if (!ygrVar.isEmpty()) {
                Iterable$EL.forEach(ygrVar, new rcn(15));
            }
            xukVarG = new xtv(uuidB, strGQ, str, xueVar, xtkVar, z, nrdVar);
        } else {
            xukVarG = r0 instanceof xtm ? ((xtm) r0).g(str, xueVar, z, nrdVar) : r0.m(str, xueVar, nrdVar);
        }
        Object obj3 = nrdVar.b;
        xts.h(nrdVar, xukVarG);
        return new xua(xukVarG, z3);
    }

    public static xua ax(String str) {
        return aw(str, xud.a, false);
    }

    public static int ay(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static zgp az(zgp zgpVar) {
        xwy xwyVar = new xwy();
        zfq zfqVar = zfq.a;
        int i = zfb.c;
        zfa zfaVar = new zfa(zgpVar, xwyVar);
        zgpVar.c(zfaVar, yrm.aK(zfqVar, zfaVar));
        return zfaVar;
    }

    public static ColorStateList b(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !qrm$$ExternalSyntheticApiModelOutline1.m416m((Object) drawable)) {
            return null;
        }
        return qrm$$ExternalSyntheticApiModelOutline1.m((Object) drawable).getColorStateList();
    }

    public static Comparable bA(Iterable iterable) {
        afbk afbkVarA = ((afgy) iterable).iterator();
        afgz afgzVar = (afgz) afbkVarA;
        if (!afgzVar.a) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) afbkVarA.next();
        while (afgzVar.a) {
            Comparable comparable2 = (Comparable) afbkVarA.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable bB(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable bC(Iterable iterable) {
        afbk afbkVarA = ((afgy) iterable).iterator();
        afgz afgzVar = (afgz) afbkVarA;
        if (!afgzVar.a) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) afbkVarA.next();
        while (afgzVar.a) {
            Comparable comparable2 = (Comparable) afbkVarA.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Iterable bD(Iterable iterable) {
        iterable.getClass();
        return new afbi(new tim(iterable, 8));
    }

    public static Object bE(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return bF((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object bF(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object bG(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object bH(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object bI(List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static Object bJ(Iterable iterable) {
        if (iterable instanceof List) {
            return bK((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object bK(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static Object bL(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Object bM(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return bN((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object bN(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object bO(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object bP(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List bQ(Iterable iterable) {
        iterable.getClass();
        return cf(ck(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List bR(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.bn(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return cf(iterable);
        }
        int size = iterable.size() - i;
        if (size <= 0) {
            return afbe.a;
        }
        if (size == 1) {
            List listSingletonList = Collections.singletonList(bJ(iterable));
            listSingletonList.getClass();
            return listSingletonList;
        }
        ArrayList arrayList = new ArrayList(size);
        if (iterable instanceof RandomAccess) {
            int size2 = iterable.size();
            while (i < size2) {
                arrayList.add(iterable.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = iterable.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List bS(List list, int i) {
        list.getClass();
        return cd(list, afpt.e(list.size() - i, 0));
    }

    public static List bT(Iterable iterable, afec afecVar) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) afecVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List bU(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List bV(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(bp(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && affa.f(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List bW(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        if (iterable instanceof Collection) {
            return bY((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        cq(arrayList, iterable);
        cq(arrayList, iterable2);
        return arrayList;
    }

    public static List bX(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return bZ((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        cq(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static List bY(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            cq(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List bZ(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Map ba(aezu... aezuVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(aV(aezuVarArr.length));
        bf(linkedHashMap, aezuVarArr);
        return linkedHashMap;
    }

    public static Map bb(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map bc(Iterable iterable) {
        iterable.getClass();
        int size = iterable.size();
        if (size == 0) {
            return afbf.a;
        }
        if (size == 1) {
            return aW((aezu) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(aV(iterable.size()));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aezu aezuVar = (aezu) it.next();
            linkedHashMap.put(aezuVar.a, aezuVar.b);
        }
        return linkedHashMap;
    }

    public static Map bd(Map map) {
        int size = map.size();
        if (size == 0) {
            return afbf.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Map be(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static void bf(Map map, aezu[] aezuVarArr) {
        for (aezu aezuVar : aezuVarArr) {
            map.put(aezuVar.a, aezuVar.b);
        }
    }

    public static List bg(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static int bh(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static List bi(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return afbe.a;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static List bj(Object obj) {
        return obj != null ? bg(obj) : afbe.a;
    }

    public static List bk(Object... objArr) {
        return new ArrayList(new afay(objArr, true));
    }

    public static List bl(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : bg(list.get(0)) : afbe.a;
    }

    public static afha bm(Collection collection) {
        collection.getClass();
        return new afha(0, collection.size() - 1);
    }

    public static void bn() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void bo() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static int bp(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static List bq(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            cq(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static void br(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void bs(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static Object bt(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object bu(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(bh(list));
    }

    public static Collection bv(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : cf(iterable);
    }

    public static int bw(List list, int i) {
        if (i >= 0 && i <= bh(list)) {
            return bh(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new afha(0, bh(list)) + "].");
    }

    public static int bx(List list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new afha(0, list.size()) + "].");
    }

    public static List by(List list) {
        list.getClass();
        return new afbo(list);
    }

    public static Comparable bz(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static PorterDuffColorFilter c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static void cA(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        list.remove(list.size() - 1);
    }

    public static void cB(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(a.bB(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static boolean cC(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        int length = objArr.length;
        if (length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!cC((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else {
                    if ((obj instanceof afab) && (obj2 instanceof afab)) {
                        throw null;
                    }
                    if ((obj instanceof afai) && (obj2 instanceof afai)) {
                        throw null;
                    }
                    if ((obj instanceof afad) && (obj2 instanceof afad)) {
                        throw null;
                    }
                    if ((obj instanceof afaf) && (obj2 instanceof afaf)) {
                        throw null;
                    }
                    if (!affa.f(obj, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static List cD(Object[] objArr) {
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static void cE(Object[] objArr, Object obj, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void cF(Object[] objArr, Comparator comparator) {
        objArr.getClass();
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static byte[] cG(byte[] bArr, int i, int i2) {
        bArr.getClass();
        cB(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static int[] cH(int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        iArrCopyOf.getClass();
        return iArrCopyOf;
    }

    public static Object[] cI(Object[] objArr, int i, int i2) {
        objArr.getClass();
        cB(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static Object[] cJ(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    public static int cK(float[] fArr) {
        return fArr.length - 1;
    }

    public static int cL(int[] iArr) {
        return iArr.length - 1;
    }

    public static int cM(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int cN(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static int cO(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int cP(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (affa.f(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int cQ(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[cL(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Integer cR(int[] iArr, int i) {
        iArr.getClass();
        if (i < iArr.length) {
            return Integer.valueOf(iArr[i]);
        }
        return null;
    }

    public static Iterable cS(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? afbe.a : new airu(objArr, 1);
    }

    public static Iterable cT(Object[] objArr) {
        return new afbi(new tim(objArr, 7));
    }

    public static Object cU(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object cV(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Object cW(Object[] objArr, int i) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static Object cX(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[cN(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object cY(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object cZ(Object[] objArr) {
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List ca(Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return cf(iterable);
        }
        List listCg = cg(iterable);
        Collections.reverse(listCg);
        return listCg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List cb(Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return cf(iterable);
        }
        Object[] array = iterable.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return cD(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List cc(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return cf(iterable);
        }
        Object[] array = iterable.toArray(new Object[0]);
        cF(array, comparator);
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List cd(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.bn(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return afbe.a;
        }
        if (i >= iterable.size()) {
            return cf(iterable);
        }
        if (i == 1) {
            List listSingletonList = Collections.singletonList(bE(iterable));
            listSingletonList.getClass();
            return listSingletonList;
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return bl(arrayList);
    }

    public static List ce(List list, int i) {
        list.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.bn(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return afbe.a;
        }
        int size = list.size();
        if (i >= size) {
            return cf(list);
        }
        if (i == 1) {
            return bg(bK(list));
        }
        int i2 = size - i;
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            while (i2 < size) {
                arrayList.add(list.get(i2));
                i2++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i2);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List cf(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return bl(cg(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return afbe.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        List listSingletonList = Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List cg(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ch((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        cy(iterable, arrayList);
        return arrayList;
    }

    public static List ch(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static List ci(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(bp(iterable, 10), bp(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new aezu(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Set cj(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionBv = bv(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionBv.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static Set ck(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cy(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set cl(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            cy(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return afbg.a;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set setSingleton = Collections.singleton(linkedHashSet.iterator().next());
            setSingleton.getClass();
            return setSingleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return afbg.a;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(aV(collection.size()));
            cy(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set setSingleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        setSingleton2.getClass();
        return setSingleton2;
    }

    public static airp cm(Iterable iterable) {
        iterable.getClass();
        return new afbb(iterable, 2);
    }

    public static boolean cn(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    bo();
                }
                if (affa.f(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
        }
        iIndexOf = ((List) iterable).indexOf(obj);
        return iIndexOf >= 0;
    }

    public static float[] co(Collection collection) {
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] cp(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static void cq(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void cr(Collection collection, Object[] objArr) {
        objArr.getClass();
        collection.addAll(cD(objArr));
    }

    public static /* synthetic */ int cs(List list, Comparable comparable) {
        int size = list.size();
        int size2 = list.size();
        if (size < 0) {
            throw new IllegalArgumentException(a.bn(size, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(a.bB(size2, size, "toIndex (", ") is greater than size (", ")."));
        }
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iX = affa.x((Comparable) list.get(i3), comparable);
            if (iX < 0) {
                i2 = i3 + 1;
            } else {
                if (iX <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static void ct(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, afec afecVar) throws IOException {
        iterable.getClass();
        appendable.getClass();
        appendable.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            a.k(appendable, next, afecVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String cu(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, afec afecVar, int i) throws IOException {
        iterable.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        charSequence4.getClass();
        CharSequence charSequence5 = (i & 2) != 0 ? "" : charSequence2;
        charSequence5.getClass();
        CharSequence charSequence6 = (i & 4) != 0 ? "" : charSequence3;
        charSequence6.getClass();
        CharSequence charSequence7 = (i & 16) != 0 ? "..." : null;
        charSequence7.getClass();
        StringBuilder sb = new StringBuilder();
        ct(iterable, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : afecVar);
        return sb.toString();
    }

    public static void cv(Iterable iterable, afec afecVar) {
        iterable.getClass();
        cz(iterable, afecVar, true);
    }

    public static void cw(List list, afec afecVar) {
        int iBh;
        list.getClass();
        afecVar.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof afgc) && !(list instanceof afge)) {
                affz.c(list, "kotlin.collections.MutableIterable");
            }
            cz(list, afecVar, true);
            return;
        }
        int iBh2 = bh(list);
        int i = 0;
        if (iBh2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) afecVar.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iBh2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iBh = bh(list))) {
            return;
        }
        while (true) {
            list.remove(iBh);
            if (iBh == i) {
                return;
            } else {
                iBh--;
            }
        }
    }

    public static void cx(int i, Object[] objArr) {
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }

    public static void cy(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void cz(Iterable iterable, afec afecVar, boolean z) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) afecVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
            }
        }
    }

    public static Drawable d(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i != -1 && i2 == -1) {
            i2 = -1;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicHeight()) == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static void dA(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static /* synthetic */ void dB(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    public static int dC(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if ((-2147483639) + i3 <= 0) {
            return i3;
        }
        if (i2 > 2147483639) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        return 2147483639;
    }

    public static String dD(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, i);
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = (j >>> 1) / j2;
        long j4 = j3 + j3;
        long j5 = j - (j4 * j2);
        if (j5 >= j2) {
            j4++;
            j5 -= j2;
        }
        String string2 = Long.toString(j4, i);
        string2.getClass();
        String string3 = Long.toString(j5, i);
        string3.getClass();
        return string2.concat(string3);
    }

    public static Object dE(Throwable th) {
        th.getClass();
        return new aezv(th);
    }

    public static void dF(Object obj) throws Throwable {
        if (obj instanceof aezv) {
            throw ((aezv) obj).a;
        }
    }

    public static aezr dG(afdr afdrVar) {
        afdrVar.getClass();
        return new aezy(afdrVar);
    }

    public static aezr dH(int i, afdr afdrVar) {
        afdrVar.getClass();
        return i + (-1) != 1 ? new afal(afdrVar) : new aezx(afdrVar);
    }

    public static void dI(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static int dJ(int i) {
        return i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Alert.DURATION_SHOW_INDEFINITELY;
    }

    public static LinkedHashMap dK(int i) {
        return new LinkedHashMap(dJ(i));
    }

    public static List dL(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }

    public static int dM(int i) {
        int i2 = i % 360;
        return i2 < 0 ? i2 + 360 : i2;
    }

    public static void dN(double d, double d2, Map map) {
        double d3 = d;
        int i = 100;
        int i2 = 0;
        while (i2 < i) {
            int i3 = (i2 + i) / 2;
            double dDY = dY(i3, d3, map);
            int i4 = i3 + 1;
            double dDY2 = dY(i4, d3, map);
            if (dY(i3, d3, map) >= d2 - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    d3 = d;
                    i = i3;
                } else {
                    if (i2 == i3) {
                        new abzv(abzw.b(d3, d2, i2));
                        return;
                    }
                    i2 = i3;
                }
            } else if (dDY < dDY2) {
                d3 = d;
                i2 = i4;
            } else {
                d3 = d;
                i = i3;
            }
        }
        new abzv(abzw.b(d, d2, i2));
    }

    public static int[] dO(List list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((abnz) list.get(i)).a();
        }
        return iArr;
    }

    public static int[] dP(abnz[] abnzVarArr) {
        int[] iArr = new int[abnzVarArr.length];
        for (int i = 0; i < abnzVarArr.length; i++) {
            iArr[i] = abnzVarArr[i].a();
        }
        return iArr;
    }

    public static String dQ(byte[] bArr, int i, int i2) throws abon {
        return i2 == 0 ? "" : dS(bArr, i, i2);
    }

    public static boolean dR(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else {
                if (b < -32) {
                    if (i3 < i2 && b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b >= -16) {
                    if (i3 >= i2 - 2) {
                        return false;
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        int i5 = i + 3;
                        if (bArr[i4] <= -65) {
                            i += 4;
                            if (bArr[i5] > -65) {
                            }
                        }
                    }
                    return false;
                }
                if (i3 >= i2 - 1) {
                    return false;
                }
                int i6 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65 || (b == -32 && b3 < -96)) {
                    return false;
                }
                if (b == -19 && b3 >= -96) {
                    return false;
                }
                i += 3;
                if (bArr[i6] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String dS(byte[] bArr, int i, int i2) throws abon {
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                cArr[i4] = (char) b2;
                i4++;
                i = i5;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (b3 >= 0) {
                        i++;
                        cArr[i4] = (char) b3;
                        i4++;
                    }
                }
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw new abon("Protocol message had invalid UTF-8.");
                }
                int i6 = i4 + 1;
                i += 2;
                byte b4 = bArr[i5];
                if (b2 < -62 || yrm.aw(b4)) {
                    throw new abon("Protocol message had invalid UTF-8.");
                }
                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                i4 = i6;
            } else {
                if (b2 < -16) {
                    if (i5 >= i3 - 1) {
                        throw new abon("Protocol message had invalid UTF-8.");
                    }
                    int i7 = i4 + 1;
                    int i8 = i + 2;
                    byte b5 = bArr[i5];
                    i += 3;
                    byte b6 = bArr[i8];
                    if (!yrm.aw(b5)) {
                        if (b2 == -32) {
                            if (b5 >= -96) {
                                b2 = -32;
                            }
                        }
                        if (b2 == -19) {
                            if (b5 < -96) {
                                b2 = -19;
                            }
                        }
                        if (!yrm.aw(b6)) {
                            cArr[i4] = (char) (((b5 & 63) << 6) | ((b2 & 15) << 12) | (b6 & 63));
                            i4 = i7;
                        }
                    }
                    throw new abon("Protocol message had invalid UTF-8.");
                }
                if (i5 >= i3 - 2) {
                    throw new abon("Protocol message had invalid UTF-8.");
                }
                byte b7 = bArr[i5];
                int i9 = i + 3;
                byte b8 = bArr[i + 2];
                i += 4;
                byte b9 = bArr[i9];
                if (yrm.aw(b7) || (((b2 << 28) + (b7 + 112)) >> 30) != 0 || yrm.aw(b8) || yrm.aw(b9)) {
                    throw new abon("Protocol message had invalid UTF-8.");
                }
                int i10 = ((b7 & 63) << 12) | ((b2 & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i4] = (char) ((i10 >>> 10) + 55232);
                cArr[i4 + 1] = (char) ((i10 & 1023) + 56320);
                i4 += 2;
            }
        }
        return new String(cArr, 0, i4);
    }

    protected static void dT(String str, ByteBuffer byteBuffer) {
        try {
            byteBuffer.put(str.getBytes(StandardCharsets.UTF_8));
        } catch (BufferOverflowException unused) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
    }

    protected static int dU(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, length);
        return i + length;
    }

    public static int dV(String str) throws abqc {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                try {
                    int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new abqc(i2, length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                } catch (abqc unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static int dW(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int length = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (cCharAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i3 - 2) {
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i7 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i7 > i3 - 3) {
                    if (i7 > i3 - 4) {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i4 = i6 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        return dU(str, bArr, i, i2);
                    }
                    i6++;
                    if (i6 != str.length()) {
                        char cCharAt3 = str.charAt(i6);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i8 = i7 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i8] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return dU(str, bArr, i, i2);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i7 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i7 += 3;
            }
            i6++;
        }
        return i7;
    }

    public static void dX(String str, ByteBuffer byteBuffer) {
        int length = str.length();
        int iPosition = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char cCharAt = str.charAt(i);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i, (byte) cCharAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
            }
        }
        if (i == length) {
            byteBuffer.position(iPosition + i);
            return;
        }
        int i2 = iPosition + i;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                byteBuffer.put(i2, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i3 = i2 + 1;
                byteBuffer.put(i2, (byte) ((cCharAt2 >>> 6) | 192));
                byteBuffer.put(i3, (byte) ((cCharAt2 & '?') | 128));
                i2 = i3;
            } else {
                if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                    i++;
                    if (i != length) {
                        char cCharAt3 = str.charAt(i);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            byteBuffer.put(i2, (byte) ((codePoint >>> 18) | 240));
                            int i4 = i2 + 2;
                            byteBuffer.put(i2 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                            i2 += 3;
                            byteBuffer.put(i4, (byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put(i2, (byte) ((codePoint & 63) | 128));
                        }
                    }
                    dT(str, byteBuffer);
                    return;
                }
                int i5 = i2 + 1;
                byteBuffer.put(i2, (byte) ((cCharAt2 >>> '\f') | 224));
                i2 = i5 + 1;
                byteBuffer.put(i5, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(i2, (byte) ((cCharAt2 & '?') | 128));
            }
            i2++;
            i++;
        }
        byteBuffer.position(i2);
    }

    private static double dY(int i, double d, Map map) {
        Integer numValueOf = Integer.valueOf(i);
        if (map.get(numValueOf) == null) {
            map.put(numValueOf, Double.valueOf(new abzv(abzw.b(d, 200.0d, i)).b));
        }
        return ((Double) map.get(numValueOf)).doubleValue();
    }

    public static List da(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        dw(objArr, arrayList);
        return arrayList;
    }

    public static List db(Object[] objArr, Comparator comparator) {
        int length = objArr.length;
        if (length != 0) {
            objArr = Arrays.copyOf(objArr, length);
            objArr.getClass();
            cF(objArr, comparator);
        }
        return cD(objArr);
    }

    public static List dc(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return afbe.a;
        }
        if (length == 1) {
            return bg(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List dd(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return afbe.a;
        }
        if (length == 1) {
            return bg(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List de(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return afbe.a;
        }
        if (length == 1) {
            return bg(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List df(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return afbe.a;
        }
        if (length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        objArrCopyOf.getClass();
        List listAsList = Arrays.asList(objArrCopyOf);
        listAsList.getClass();
        return listAsList;
    }

    public static List dg(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return afbe.a;
        }
        if (length == 1) {
            return bg(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static Set dh(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return afbg.a;
        }
        if (length == 1) {
            return aO(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(aV(length));
        dz(iArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set di(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return afbg.a;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(aV(length));
            dA(objArr, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(objArr[0]);
        setSingleton.getClass();
        return setSingleton;
    }

    public static afha dj(int[] iArr) {
        return new afha(0, cL(iArr));
    }

    public static airp dk(Object[] objArr) {
        return objArr.length == 0 ? airj.a : new afbb(objArr, 0);
    }

    public static boolean dl(int[] iArr, int i) {
        return cO(iArr, i) >= 0;
    }

    public static boolean dm(Object[] objArr, Object obj) {
        objArr.getClass();
        return cP(objArr, obj) >= 0;
    }

    public static void dn(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* renamed from: do, reason: not valid java name */
    public static void m421do(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void dp(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void dq(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void dr(float[] fArr, float[] fArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = fArr.length;
        }
        fArr.getClass();
        System.arraycopy(fArr, 0, fArr2, 0, i);
    }

    public static /* synthetic */ void ds(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, 0, iArr2, i, i2);
    }

    public static /* synthetic */ void du(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static void dw(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static void dx(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, afec afecVar) throws IOException {
        objArr.getClass();
        appendable.append(charSequence2);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= objArr.length) {
                break;
            }
            Object obj = objArr[i2];
            i3++;
            if (i3 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i3 > 0) {
                i = 0;
                break;
            } else {
                a.k(appendable, obj, afecVar);
                i2++;
            }
        }
        if (i >= 0 && i3 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String dy(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, afec afecVar, int i) throws IOException {
        objArr.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        charSequence4.getClass();
        CharSequence charSequence5 = (i & 2) != 0 ? "" : charSequence2;
        charSequence5.getClass();
        CharSequence charSequence6 = (i & 4) != 0 ? "" : charSequence3;
        charSequence6.getClass();
        CharSequence charSequence7 = (i & 16) != 0 ? "..." : null;
        charSequence7.getClass();
        StringBuilder sb = new StringBuilder();
        dx(objArr, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : afecVar);
        return sb.toString();
    }

    public static void dz(int[] iArr, Collection collection) {
        for (int i : iArr) {
            collection.add(Integer.valueOf(i));
        }
    }

    public static void e(Outline outline, Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            a(outline, path);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                wox.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            wox.a(outline, path);
        }
    }

    public static void f(Drawable drawable, int i) {
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
    }

    private static float g(String[] strArr, int i) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalArgumentException(a.bG(f, "Motion easing control point value must be between 0 and 1; instead got: "));
        }
        return f;
    }

    public static int[] h(int[] iArr) {
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = 16842912;
                return iArrCopyOf;
            }
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
            i++;
        }
    }

    public static Drawable i(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    private static String j(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean k(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int l(int i, int i2) {
        return dvd.e(i, (Color.alpha(i) * i2) / 255);
    }

    public static int m(View view, int i) {
        return p(view.getContext(), y(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    public static int n(Context context, int i, int i2) {
        TypedValue typedValueX = x(context.getTheme(), i);
        Integer numValueOf = typedValueX != null ? Integer.valueOf(p(context, typedValueX)) : null;
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static int o(int i, int i2, float f) {
        return dvd.d(dvd.e(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int p(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }

    public static ColorStateList q(Context context, int i) {
        TypedValue typedValueW = w(context, i);
        if (typedValueW == null) {
            return null;
        }
        if (typedValueW.resourceId != 0) {
            return dup.d(context, typedValueW.resourceId);
        }
        if (typedValueW.data != 0) {
            return ColorStateList.valueOf(typedValueW.data);
        }
        return null;
    }

    public static boolean r(int i) {
        if (i == 0) {
            return false;
        }
        double[] dArrG = dvd.g();
        dvd.f(Color.red(i), Color.green(i), Color.blue(i), dArrG);
        return dArrG[1] / 100.0d > 0.5d;
    }

    public static int s(Context context, String str) {
        return p(context, y(context, R.attr.colorSurface, str));
    }

    public static Uri t(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static int u(Context context, int i, int i2) {
        return v(context.getTheme(), i, i2);
    }

    public static int v(Resources.Theme theme, int i, int i2) {
        TypedValue typedValueX = x(theme, i);
        return (typedValueX == null || typedValueX.type != 16) ? i2 : typedValueX.data;
    }

    public static TypedValue w(Context context, int i) {
        return x(context.getTheme(), i);
    }

    public static TypedValue x(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue y(Context context, int i, String str) {
        TypedValue typedValueW = w(context, i);
        if (typedValueW != null) {
            return typedValueW;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean z(Context context, int i, boolean z) {
        return A(context.getTheme(), i, z);
    }

    public woy(char[] cArr, byte[] bArr) {
    }
}
