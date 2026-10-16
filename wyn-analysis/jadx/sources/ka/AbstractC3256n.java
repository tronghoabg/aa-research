package ka;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import ef.C2529m;
import ef.C2530n;
import java.util.ArrayList;
import kd.C3305a;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* renamed from: ka.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC3256n {
    public static /* synthetic */ int a(int i5) {
        if (i5 == 1) {
            return 1;
        }
        if (i5 == 2) {
            return -1;
        }
        throw null;
    }

    public static Bundle b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static BillingResult c(int i5, String str) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i5);
        builderNewBuilder.setDebugMessage(str);
        return builderNewBuilder.build();
    }

    public static C2529m d(String str, String str2, String str3) {
        return Fe.e.z(new C3305a(str, str2, str3));
    }

    public static Object e(ArrayList arrayList, int i5) {
        return arrayList.get(arrayList.size() - i5);
    }

    public static String f(char c10, String str, String str2) {
        return str + str2 + c10;
    }

    public static String g(int i5, String str) {
        return str + i5;
    }

    public static String h(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String i(kotlin.jvm.internal.I i5, Class cls, StringBuilder sb2) {
        sb2.append(i5.getOrCreateKotlinClass(cls));
        return sb2.toString();
    }

    public static StringBuilder j(String str, SimpleTypeMarker simpleTypeMarker, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(simpleTypeMarker);
        sb2.append(str2);
        return sb2;
    }

    public static FqName k(String str, FqName fqName, String str2) {
        FqName fqNameChild = fqName.child(Name.identifier(str));
        AbstractC3340k.d(fqNameChild, str2);
        return fqNameChild;
    }

    public static void l(int i5, int i10, int i11, int i12, int i13) {
        AbstractC3230e0.a(i5);
        AbstractC3230e0.a(i10);
        AbstractC3230e0.a(i11);
        AbstractC3230e0.a(i12);
        AbstractC3230e0.a(i13);
    }

    public static /* synthetic */ void m(int i5, String str) {
        if (i5 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(AbstractC3340k.h(str));
        AbstractC3340k.j(nullPointerException, AbstractC3340k.class.getName());
        throw nullPointerException;
    }

    public static void n(C2529m c2529m, tf.l lVar) {
        lVar.invoke(new C2530n(c2529m));
    }

    public static void o(String str, String str2, String str3) {
        Fe.e.z(new C3305a(str, str2, str3));
    }

    public static void p(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static boolean q(Flags.BooleanFlagField booleanFlagField, int i5, String str) {
        Boolean bool = booleanFlagField.get(i5);
        AbstractC3340k.d(bool, str);
        return bool.booleanValue();
    }

    public static /* synthetic */ String r(int i5) {
        if (i5 == 1) {
            return "surface";
        }
        if (i5 == 2) {
            return "texture";
        }
        if (i5 == 3) {
            return "image";
        }
        throw null;
    }

    public static /* synthetic */ String s(int i5) {
        if (i5 == 1) {
            return "opaque";
        }
        if (i5 == 2) {
            return "transparent";
        }
        throw null;
    }

    public static /* synthetic */ String t(int i5) {
        switch (i5) {
            case 1:
                return "NULL_VALUE";
            case 2:
                return "BOOLEAN_VALUE";
            case 3:
                return "INTEGER_VALUE";
            case 4:
                return "DOUBLE_VALUE";
            case 5:
                return "TIMESTAMP_VALUE";
            case 6:
                return "STRING_VALUE";
            case 7:
                return "BYTES_VALUE";
            case 8:
                return "REFERENCE_VALUE";
            case 9:
                return "GEO_POINT_VALUE";
            case 10:
                return "ARRAY_VALUE";
            case 11:
                return "MAP_VALUE";
            case 12:
                return "VALUETYPE_NOT_SET";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int u(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("opaque")) {
            return 1;
        }
        if (str.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(str));
    }
}
