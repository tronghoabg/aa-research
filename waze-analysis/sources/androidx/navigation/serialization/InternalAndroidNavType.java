package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class InternalAndroidNavType {
    public static final InternalAndroidNavType INSTANCE = new InternalAndroidNavType();

    /* compiled from: WazeSource */
    public final class EnumNullableType<D extends Enum> extends SerializableNullableType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumNullableType(Class<D> cls) {
            super(cls);
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (cls.isEnum()) {
                this.type = cls;
            } else {
                Objects.toString(cls);
                throw new IllegalArgumentException(String.valueOf(cls).concat(" is not an Enum type."));
            }
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            x.e(name, "getName(...)");
            return name;
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.navigation.NavType
        public D parseValue(String str) {
            x.f(str, "value");
            D d2 = null;
            if (x.n(str, "null")) {
                return null;
            }
            D[] enumConstants = this.type.getEnumConstants();
            x.c(enumConstants);
            int length = enumConstants.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                D d3 = enumConstants[i2];
                D d4 = d3;
                x.c(d4);
                if (o.m(d4.name(), str, true)) {
                    d2 = d3;
                    break;
                }
                i2++;
            }
            D d5 = d2;
            if (d5 != null) {
                return d5;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.type.getName() + ".");
        }
    }

    /* compiled from: WazeSource */
    public class SerializableNullableType<D extends Serializable> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableNullableType(Class<D> cls) {
            super(true);
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            this.type = cls;
            if (Serializable.class.isAssignableFrom(cls)) {
                return;
            }
            Objects.toString(cls);
            throw new IllegalArgumentException(String.valueOf(cls).concat(" does not implement Serializable."));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SerializableNullableType) {
                return x.n(this.type, ((SerializableNullableType) obj).type);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            Object obj = bundle.get(str);
            if (obj instanceof Serializable) {
                return (D) obj;
            }
            return null;
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
            bundle.putSerializable(str, this.type.cast(d2));
        }
    }

    private InternalAndroidNavType() {
    }

    /* compiled from: WazeSource */
    public final class EnumListType<D extends Enum> extends CollectionNavType<List<? extends D>> {
        private final NavType.EnumType<D> enumNavType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumListType(Class<D> cls) {
            super(true);
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            this.enumNavType = new NavType.EnumType<>(cls);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EnumListType) {
                return x.n(this.enumNavType, ((EnumListType) obj).enumNavType);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        public List<D> get(Bundle bundle, String str) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            Object obj = bundle.get(str);
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<" + this.enumNavType.getName() + "}>";
        }

        public int hashCode() {
            return this.enumNavType.hashCode();
        }

        @Override // androidx.navigation.NavType
        public List<D> parseValue(String str, List<? extends D> list) {
            x.f(str, "value");
            return list != null ? i.af(list, parseValue(str)) : parseValue(str);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, List<? extends D> list) {
            x.f(bundle, "bundle");
            x.f(str, "key");
            bundle.putSerializable(str, list != null ? new ArrayList(list) : null);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(List<? extends D> list) {
            if (list == null) {
                return i.h();
            }
            List<? extends D> list2 = list;
            ArrayList arrayList = new ArrayList(i.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Enum) it.next()).toString());
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<? extends D> list, List<? extends D> list2) {
            return x.n(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<D> emptyCollection() {
            return i.h();
        }

        @Override // androidx.navigation.NavType
        public List<D> parseValue(String str) {
            x.f(str, "value");
            return i.d(this.enumNavType.parseValue(str));
        }
    }
}
