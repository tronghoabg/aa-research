package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.c;
import h.g.b.x;
import h.m.k;
import h.n.o;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class NavType<T> {
    private final boolean isNullableAllowed;
    private final String name = "nav_type";
    public static final Companion Companion = new Companion(null);
    public static final NavType<Integer> IntType = new IntNavType();
    public static final NavType<Integer> ReferenceType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateReader.m13269constructorimpl(bundle);
            return Integer.valueOf(SavedStateReader.m13300getIntimpl(bundle, str));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_REFERENCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String str) throws NumberFormatException {
            int i2;
            x.f(str, "value");
            if (o.ah(str, "0x")) {
                String strSubstring = str.substring(2);
                x.e(strSubstring, "substring(...)");
                k.y(16);
                i2 = Integer.parseInt(strSubstring, 16);
            } else {
                i2 = Integer.parseInt(str);
            }
            return Integer.valueOf(i2);
        }

        public void put(Bundle bundle, String str, int i2) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            SavedStateWriter.m13355constructorimpl(bundle);
            SavedStateWriter.m13372putIntimpl(bundle, str, i2);
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }
    };
    public static final NavType<int[]> IntArrayType = new IntArrayNavType();
    public static final NavType<List<Integer>> IntListType = new IntListNavType();
    public static final NavType<Long> LongType = new LongNavType();
    public static final NavType<long[]> LongArrayType = new LongArrayNavType();
    public static final NavType<List<Long>> LongListType = new LongListNavType();
    public static final NavType<Float> FloatType = new FloatNavType();
    public static final NavType<float[]> FloatArrayType = new FloatArrayNavType();
    public static final NavType<List<Float>> FloatListType = new FloatListNavType();
    public static final NavType<Boolean> BoolType = new BoolNavType();
    public static final NavType<boolean[]> BoolArrayType = new BoolArrayNavType();
    public static final NavType<List<Boolean>> BoolListType = new BoolListNavType();
    public static final NavType<String> StringType = new StringNavType();
    public static final NavType<String[]> StringArrayType = new StringArrayNavType();
    public static final NavType<List<String>> StringListType = new StringListNavType();

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class EnumType<D extends Enum> extends SerializableType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumType(Class<D> cls) {
            super(false, cls);
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (cls.isEnum()) {
                this.type = cls;
            } else {
                Objects.toString(cls);
                throw new IllegalArgumentException(String.valueOf(cls).concat(" is not an Enum type."));
            }
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            x.e(name, "getName(...)");
            return name;
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public D parseValue(String str) {
            D d2;
            x.f(str, "value");
            D[] enumConstants = this.type.getEnumConstants();
            x.e(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    d2 = null;
                    break;
                }
                d2 = enumConstants[i2];
                if (o.m(d2.name(), str, true)) {
                    break;
                }
                i2++;
            }
            D d3 = d2;
            if (d3 != null) {
                return d3;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.type.getName() + ".");
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class ParcelableType<D> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableType(Class<D> cls) {
            super(true);
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.type = cls;
            } else {
                Objects.toString(cls);
                throw new IllegalArgumentException(String.valueOf(cls).concat(" does not implement Parcelable or Serializable."));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !x.n(getClass(), obj.getClass())) {
                return false;
            }
            return x.n(this.type, ((ParcelableType) obj).type);
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String str) {
            x.f(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, D d2) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            this.type.cast(d2);
            if (d2 == null || (d2 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d2);
            } else if (d2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d2);
            }
        }
    }

    public NavType(boolean z) {
        this.isNullableAllowed = z;
    }

    public static NavType<?> fromArgType(String str, String str2) {
        return NavType$$ExternalSyntheticDesugaredLibraryBridge0.m(Companion, str, str2);
    }

    public static final NavType<Object> inferFromValue(String str) {
        return Companion.inferFromValue(str);
    }

    public static final NavType<Object> inferFromValueType(Object obj) {
        return Companion.inferFromValueType(obj);
    }

    public abstract T get(Bundle bundle, String str);

    public String getName() {
        return this.name;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    public final T parseAndPut(Bundle bundle, String str, String str2) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        x.f(str2, "value");
        return (T) NavTypeKt.navTypeParseAndPut(this, bundle, str, str2);
    }

    public abstract T parseValue(String str);

    public T parseValue(String str, T t) {
        x.f(str, "value");
        return parseValue(str);
    }

    public abstract void put(Bundle bundle, String str, T t);

    public String serializeAsValue(T t) {
        return String.valueOf(t);
    }

    public String toString() {
        return getName();
    }

    public boolean valueEquals(T t, T t2) {
        return x.n(t, t2);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public NavType<?> fromArgType(String str, String str2) throws ClassNotFoundException {
            String strSubstring;
            NavType<?> navTypeNavTypeFromArgType = NavTypeKt.navTypeFromArgType(str);
            if (navTypeNavTypeFromArgType != null) {
                return navTypeNavTypeFromArgType;
            }
            if (x.n(NavType.ReferenceType.getName(), str)) {
                return NavType.ReferenceType;
            }
            String str3 = str;
            if (str3 == null || str3.length() == 0) {
                return NavType.StringType;
            }
            try {
                if (!o.ah(str, ".") || str2 == null) {
                    strSubstring = str;
                } else {
                    strSubstring = str2 + str;
                }
                boolean zL = o.l(str, "[]", false);
                if (zL) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    x.e(strSubstring, "substring(...)");
                }
                Class<?> cls = Class.forName(strSubstring);
                if (cls == null) {
                    x.g();
                }
                NavType<?> serializableOrParcelableType$navigation_common = parseSerializableOrParcelableType$navigation_common(cls, zL);
                if (serializableOrParcelableType$navigation_common != null) {
                    return serializableOrParcelableType$navigation_common;
                }
                throw new IllegalArgumentException(((Object) strSubstring) + " is not Serializable or Parcelable.");
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        public final NavType<Object> inferFromValue(String str) {
            x.f(str, "value");
            return NavTypeKt.navTypeInferFromValue(str);
        }

        public final NavType<Object> inferFromValueType(Object obj) {
            NavType<Object> navTypeNavTypeInferFromValueType = NavTypeKt.navTypeInferFromValueType(obj);
            if (navTypeNavTypeInferFromValueType != null) {
                return navTypeNavTypeInferFromValueType;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                NavType<String[]> navType = NavType.StringArrayType;
                x.d(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType;
            }
            x.c(obj);
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                x.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    x.d(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new ParcelableArrayType(componentType2);
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                x.c(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    x.d(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new SerializableArrayType(componentType4);
                }
            }
            if (obj instanceof Parcelable) {
                return new ParcelableType(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new EnumType(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new SerializableType(obj.getClass());
            }
            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
        }

        public final NavType<?> parseSerializableOrParcelableType$navigation_common(Class<?> cls, boolean z) {
            x.f(cls, "clazz");
            if (Parcelable.class.isAssignableFrom(cls)) {
                return z ? new ParcelableArrayType(cls) : new ParcelableType(cls);
            }
            if (Enum.class.isAssignableFrom(cls) && !z) {
                return new EnumType(cls);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                return z ? new SerializableArrayType(cls) : new SerializableType(cls);
            }
            return null;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(Class<D> cls) {
            super(true);
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                Objects.toString(cls);
                throw new IllegalArgumentException(String.valueOf(cls).concat(" does not implement Parcelable."));
            }
            try {
                Class<D[]> cls2 = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
                x.d(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.arrayType = cls2;
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !x.n(getClass(), obj.getClass())) {
                return false;
            }
            return x.n(this.arrayType, ((ParcelableArrayType) obj).arrayType);
        }

        @Override // androidx.navigation.NavType
        public D[] get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.arrayType.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D[] parseValue(String str) {
            x.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, D[] dArr) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            this.arrayType.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(D[] dArr, D[] dArr2) {
            return c.g(dArr, dArr2);
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(Class<D> cls) {
            super(true);
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (!Serializable.class.isAssignableFrom(cls)) {
                Objects.toString(cls);
                throw new IllegalArgumentException(String.valueOf(cls).concat(" does not implement Serializable."));
            }
            try {
                Class<D[]> cls2 = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
                x.d(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.arrayType = cls2;
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !x.n(getClass(), obj.getClass())) {
                return false;
            }
            return x.n(this.arrayType, ((SerializableArrayType) obj).arrayType);
        }

        @Override // androidx.navigation.NavType
        public D[] get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.arrayType.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D[] parseValue(String str) {
            x.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, D[] dArr) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            this.arrayType.cast(dArr);
            bundle.putSerializable(str, (Serializable) dArr);
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(D[] dArr, D[] dArr2) {
            return c.g(dArr, dArr2);
        }
    }

    public final T parseAndPut(Bundle bundle, String str, String str2, T t) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        return (T) NavTypeKt.navTypeParseAndPut(this, bundle, str, str2, t);
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public class SerializableType<D extends Serializable> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(Class<D> cls) {
            super(true);
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (!Serializable.class.isAssignableFrom(cls)) {
                Objects.toString(cls);
                throw new IllegalArgumentException(String.valueOf(cls).concat(" does not implement Serializable."));
            }
            if (cls.isEnum()) {
                Objects.toString(cls);
                throw new IllegalArgumentException(String.valueOf(cls).concat(" is an Enum. You should use EnumType instead."));
            }
            this.type = cls;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SerializableType) {
                return x.n(this.type, ((SerializableType) obj).type);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String str) {
            x.f(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, D d2) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            x.f(d2, "value");
            this.type.cast(d2);
            bundle.putSerializable(str, d2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z, Class<D> cls) {
            super(z);
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.type = cls;
            } else {
                Objects.toString(cls);
                throw new IllegalArgumentException(String.valueOf(cls).concat(" does not implement Serializable."));
            }
        }
    }
}
