package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import androidx.navigation.NavUriUtils;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.a.c;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class InternalNavType {
    public static final InternalNavType INSTANCE = new InternalNavType();
    private static final NavType<Integer> IntNullableType = new NavType<Integer>() { // from class: androidx.navigation.serialization.InternalNavType$IntNullableType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
                return null;
            }
            return Integer.valueOf(SavedStateReader.m13300getIntimpl(bundle, str));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "integer_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String str) {
            x.f(str, "value");
            if (x.n(str, "null")) {
                return null;
            }
            return NavType.IntType.parseValue(str);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, Integer num) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            if (num != null) {
                NavType.IntType.put(bundle, str, num);
            } else {
                SavedStateWriter.m13355constructorimpl(bundle);
                SavedStateWriter.m13378putNullimpl(bundle, str);
            }
        }
    };
    private static final NavType<Boolean> BoolNullableType = new NavType<Boolean>() { // from class: androidx.navigation.serialization.InternalNavType$BoolNullableType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
                return null;
            }
            return Boolean.valueOf(SavedStateReader.m13278getBooleanimpl(bundle, str));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "boolean_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean parseValue(String str) {
            x.f(str, "value");
            if (x.n(str, "null")) {
                return null;
            }
            return NavType.BoolType.parseValue(str);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, Boolean bool) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            if (bool != null) {
                NavType.BoolType.put(bundle, str, bool);
            } else {
                SavedStateWriter.m13355constructorimpl(bundle);
                SavedStateWriter.m13378putNullimpl(bundle, str);
            }
        }
    };
    private static final NavType<Double> DoubleType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            return Double.valueOf(SavedStateReader.m13292getDoubleimpl(bundle, str));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "double";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double parseValue(String str) {
            x.f(str, "value");
            return Double.valueOf(Double.parseDouble(str));
        }

        public void put(Bundle bundle, String str, double d2) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateWriter.m13355constructorimpl(bundle);
            SavedStateWriter.m13368putDoubleimpl(bundle, str, d2);
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Double d2) {
            put(bundle, str, d2.doubleValue());
        }
    };
    private static final NavType<Double> DoubleNullableType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleNullableType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
                return null;
            }
            return Double.valueOf(SavedStateReader.m13292getDoubleimpl(bundle, str));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "double_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double parseValue(String str) {
            x.f(str, "value");
            if (x.n(str, "null")) {
                return null;
            }
            return InternalNavType.INSTANCE.getDoubleType().parseValue(str);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, Double d2) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            if (d2 != null) {
                InternalNavType.INSTANCE.getDoubleType().put(bundle, str, d2);
            } else {
                SavedStateWriter.m13355constructorimpl(bundle);
                SavedStateWriter.m13378putNullimpl(bundle, str);
            }
        }
    };
    private static final NavType<Float> FloatNullableType = new NavType<Float>() { // from class: androidx.navigation.serialization.InternalNavType$FloatNullableType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
                return null;
            }
            return Float.valueOf(SavedStateReader.m13296getFloatimpl(bundle, str));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "float_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float parseValue(String str) {
            x.f(str, "value");
            if (x.n(str, "null")) {
                return null;
            }
            return NavType.FloatType.parseValue(str);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, Float f2) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            if (f2 != null) {
                NavType.FloatType.put(bundle, str, f2);
            } else {
                SavedStateWriter.m13355constructorimpl(bundle);
                SavedStateWriter.m13378putNullimpl(bundle, str);
            }
        }
    };
    private static final NavType<Long> LongNullableType = new NavType<Long>() { // from class: androidx.navigation.serialization.InternalNavType$LongNullableType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
                return null;
            }
            return Long.valueOf(SavedStateReader.m13310getLongimpl(bundle, str));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "long_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long parseValue(String str) {
            x.f(str, "value");
            if (x.n(str, "null")) {
                return null;
            }
            return NavType.LongType.parseValue(str);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, Long l2) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            if (l2 != null) {
                NavType.LongType.put(bundle, str, l2);
            } else {
                SavedStateWriter.m13355constructorimpl(bundle);
                SavedStateWriter.m13378putNullimpl(bundle, str);
            }
        }
    };
    private static final NavType<String> StringNonNullableType = new NavType<String>() { // from class: androidx.navigation.serialization.InternalNavType$StringNonNullableType$1
        @Override // androidx.navigation.NavType
        public String get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            return (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) ? "null" : SavedStateReader.m13340getStringimpl(bundle, str);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "string_non_nullable";
        }

        @Override // androidx.navigation.NavType
        /* renamed from: parseValue, reason: avoid collision after fix types in other method */
        public String parseValue2(String str) {
            x.f(str, "value");
            return str;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, String str2) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            x.f(str2, "value");
            SavedStateWriter.m13355constructorimpl(bundle);
            SavedStateWriter.m13388putStringimpl(bundle, str, str2);
        }

        @Override // androidx.navigation.NavType
        public String serializeAsValue(String str) {
            x.f(str, "value");
            return NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null);
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ String parseValue(String str) {
            parseValue2(str);
            return str;
        }
    };
    private static final NavType<String[]> StringNullableArrayType = new CollectionNavType<String[]>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableArrayType$1
        @Override // androidx.navigation.NavType
        public String[] get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
                return null;
            }
            String[] strArrM13341getStringArrayimpl = SavedStateReader.m13341getStringArrayimpl(bundle, str);
            ArrayList arrayList = new ArrayList(strArrM13341getStringArrayimpl.length);
            for (String str2 : strArrM13341getStringArrayimpl) {
                arrayList.add(NavType.StringType.parseValue(str2));
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "string_nullable[]";
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String str, String[] strArr) {
            String[] strArr2;
            x.f(str, "value");
            return (strArr == null || (strArr2 = (String[]) c.w(strArr, parseValue(str))) == null) ? parseValue(str) : strArr2;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, String[] strArr) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateWriter.m13355constructorimpl(bundle);
            if (strArr == null) {
                SavedStateWriter.m13378putNullimpl(bundle, str);
                return;
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str2 : strArr) {
                if (str2 == null) {
                    str2 = "null";
                }
                arrayList.add(str2);
            }
            SavedStateWriter.m13389putStringArrayimpl(bundle, str, (String[]) arrayList.toArray(new String[0]));
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(String[] strArr) {
            String strEncode$default;
            if (strArr == null) {
                return i.h();
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                if (str == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null)) == null) {
                    strEncode$default = "null";
                }
                arrayList.add(strEncode$default);
            }
            return arrayList;
        }

        @Override // androidx.navigation.CollectionNavType
        public String[] emptyCollection() {
            return new String[0];
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(String[] strArr, String[] strArr2) {
            return c.g(strArr, strArr2);
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String str) {
            x.f(str, "value");
            return new String[]{NavType.StringType.parseValue(str)};
        }
    };
    private static final NavType<List<String>> StringNullableListType = new CollectionNavType<List<? extends String>>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableListType$1
        @Override // androidx.navigation.NavType
        public List<String> get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
                return null;
            }
            List listX = c.X(SavedStateReader.m13341getStringArrayimpl(bundle, str));
            ArrayList arrayList = new ArrayList(i.q(listX, 10));
            Iterator it = listX.iterator();
            while (it.hasNext()) {
                arrayList.add(NavType.StringType.parseValue((String) it.next()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<String?>";
        }

        @Override // androidx.navigation.NavType
        public List<String> parseValue(String str, List<String> list) {
            x.f(str, "value");
            return list != null ? i.af(list, parseValue(str)) : parseValue(str);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, List<String> list) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateWriter.m13355constructorimpl(bundle);
            if (list == null) {
                SavedStateWriter.m13378putNullimpl(bundle, str);
                return;
            }
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(i.q(list2, 10));
            for (String str2 : list2) {
                if (str2 == null) {
                    str2 = "null";
                }
                arrayList.add(str2);
            }
            SavedStateWriter.m13389putStringArrayimpl(bundle, str, (String[]) arrayList.toArray(new String[0]));
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<String> list) {
            String strEncode$default;
            if (list == null) {
                return i.h();
            }
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(i.q(list2, 10));
            for (String str : list2) {
                if (str == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null)) == null) {
                    strEncode$default = "null";
                }
                arrayList.add(strEncode$default);
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<String> list, List<String> list2) {
            return c.g(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<? extends String> emptyCollection() {
            return i.h();
        }

        @Override // androidx.navigation.NavType
        public List<String> parseValue(String str) {
            x.f(str, "value");
            return i.d(NavType.StringType.parseValue(str));
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends String> list) {
            return serializeAsValues2((List<String>) list);
        }
    };
    private static final NavType<double[]> DoubleArrayType = new CollectionNavType<double[]>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleArrayType$1
        @Override // androidx.navigation.NavType
        public double[] get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
                return null;
            }
            return SavedStateReader.m13293getDoubleArrayimpl(bundle, str);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "double[]";
        }

        @Override // androidx.navigation.NavType
        public double[] parseValue(String str, double[] dArr) {
            x.f(str, "value");
            if (dArr != null) {
                double[] value = parseValue(str);
                x.f(dArr, "<this>");
                x.f(value, "elements");
                int length = dArr.length;
                double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
                System.arraycopy(value, 0, dArrCopyOf, length, 1);
                x.c(dArrCopyOf);
                if (dArrCopyOf != null) {
                    return dArrCopyOf;
                }
            }
            return parseValue(str);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, double[] dArr) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateWriter.m13355constructorimpl(bundle);
            if (dArr == null) {
                SavedStateWriter.m13378putNullimpl(bundle, str);
            } else {
                SavedStateWriter.m13369putDoubleArrayimpl(bundle, str, dArr);
            }
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(double[] dArr) {
            List listT;
            if (dArr == null || (listT = c.T(dArr)) == null) {
                return i.h();
            }
            List list = listT;
            ArrayList arrayList = new ArrayList(i.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(double[] dArr, double[] dArr2) {
            return c.g(dArr != null ? c.q(dArr) : null, dArr2 != null ? c.q(dArr2) : null);
        }

        @Override // androidx.navigation.CollectionNavType
        public double[] emptyCollection() {
            return new double[0];
        }

        @Override // androidx.navigation.NavType
        public double[] parseValue(String str) {
            x.f(str, "value");
            return new double[]{InternalNavType.INSTANCE.getDoubleType().parseValue(str).doubleValue()};
        }
    };
    private static final NavType<List<Double>> DoubleListType = new CollectionNavType<List<? extends Double>>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleListType$1
        @Override // androidx.navigation.NavType
        public List<Double> get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
                return null;
            }
            return c.T(SavedStateReader.m13293getDoubleArrayimpl(bundle, str));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<Double>";
        }

        @Override // androidx.navigation.NavType
        public List<Double> parseValue(String str, List<Double> list) {
            x.f(str, "value");
            return list != null ? i.af(list, parseValue(str)) : parseValue(str);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, List<Double> list) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateWriter.m13355constructorimpl(bundle);
            if (list == null) {
                SavedStateWriter.m13378putNullimpl(bundle, str);
            } else {
                SavedStateWriter.m13369putDoubleArrayimpl(bundle, str, i.ay(list));
            }
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<Double> list) {
            if (list == null) {
                return i.h();
            }
            List<Double> list2 = list;
            ArrayList arrayList = new ArrayList(i.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<Double> list, List<Double> list2) {
            return c.g(list != null ? (Double[]) list.toArray(new Double[0]) : null, list2 != null ? (Double[]) list2.toArray(new Double[0]) : null);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<? extends Double> emptyCollection() {
            return i.h();
        }

        @Override // androidx.navigation.NavType
        public List<Double> parseValue(String str) {
            x.f(str, "value");
            return i.d(InternalNavType.INSTANCE.getDoubleType().parseValue(str));
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Double> list) {
            return serializeAsValues2((List<Double>) list);
        }
    };

    private InternalNavType() {
    }

    public final NavType<Boolean> getBoolNullableType() {
        return BoolNullableType;
    }

    public final NavType<double[]> getDoubleArrayType() {
        return DoubleArrayType;
    }

    public final NavType<List<Double>> getDoubleListType() {
        return DoubleListType;
    }

    public final NavType<Double> getDoubleNullableType() {
        return DoubleNullableType;
    }

    public final NavType<Double> getDoubleType() {
        return DoubleType;
    }

    public final NavType<Float> getFloatNullableType() {
        return FloatNullableType;
    }

    public final NavType<Integer> getIntNullableType() {
        return IntNullableType;
    }

    public final NavType<Long> getLongNullableType() {
        return LongNullableType;
    }

    public final NavType<String> getStringNonNullableType() {
        return StringNonNullableType;
    }

    public final NavType<String[]> getStringNullableArrayType() {
        return StringNullableArrayType;
    }

    public final NavType<List<String>> getStringNullableListType() {
        return StringNullableListType;
    }
}
