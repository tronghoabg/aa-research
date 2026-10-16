package fd;

import Va.X7;
import android.util.Base64;
import ba.C1521a;
import ef.C2532p;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jf.C3109i;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;

/* renamed from: fd.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2633d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C2633d f35330a = new C2633d();

    /* renamed from: b, reason: collision with root package name */
    public static final C2532p f35331b = Fe.c.z(new com.moloco.sdk.service_locator.h(25));

    public static InterfaceC4277n a() {
        return (InterfaceC4277n) f35331b.getValue();
    }

    public static void b(InterfaceC4269f binaryMessenger, final C2628H c2628h) {
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        X7 x72 = new X7(binaryMessenger, a(), binaryMessenger.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool");
        Object obj = null;
        if (c2628h != null) {
            final int i5 = 4;
            x72.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i5) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, a(), binaryMessenger.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString");
        if (c2628h != null) {
            final int i10 = 8;
            x73.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i10) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(binaryMessenger, a(), binaryMessenger.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt");
        if (c2628h != null) {
            final int i11 = 9;
            x74.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i11) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(binaryMessenger, a(), binaryMessenger.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble");
        if (c2628h != null) {
            final int i12 = 10;
            x75.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i12) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(binaryMessenger, a(), binaryMessenger.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setStringList");
        if (c2628h != null) {
            final int i13 = 11;
            x76.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i13) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x76.n(null);
        }
        X7 x77 = new X7(binaryMessenger, a(), obj, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString");
        if (c2628h != null) {
            final int i14 = 12;
            x77.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i14) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x77.n(null);
        }
        X7 x78 = new X7(binaryMessenger, a(), obj, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool");
        if (c2628h != null) {
            final int i15 = 0;
            x78.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i15) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x78.n(null);
        }
        X7 x79 = new X7(binaryMessenger, a(), obj, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble");
        if (c2628h != null) {
            final int i16 = 1;
            x79.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i16) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x79.n(null);
        }
        X7 x710 = new X7(binaryMessenger, a(), obj, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt");
        if (c2628h != null) {
            final int i17 = 2;
            x710.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i17) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x710.n(null);
        }
        X7 x711 = new X7(binaryMessenger, a(), obj, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList");
        if (c2628h != null) {
            final int i18 = 3;
            x711.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i18) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x711.n(null);
        }
        X7 x712 = new X7(binaryMessenger, a(), binaryMessenger.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear");
        if (c2628h != null) {
            final int i19 = 5;
            x712.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i19) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x712.n(null);
        }
        X7 x713 = new X7(binaryMessenger, a(), binaryMessenger.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll");
        if (c2628h != null) {
            final int i20 = 6;
            x713.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i20) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        } else {
            x713.n(null);
        }
        X7 x714 = new X7(binaryMessenger, a(), binaryMessenger.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys");
        if (c2628h == null) {
            x714.n(null);
        } else {
            final int i21 = 7;
            x714.n(new InterfaceC4265b() { // from class: fd.c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    ArrayList arrayList;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    long jLongValue;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    switch (i21) {
                        case 0:
                            C2628H c2628h2 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h2.getClass();
                                kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new o(str, c2628h2, g9, null));
                                listF = AbstractC3935e.C((Boolean) g9.f39740a);
                            } catch (Throwable th) {
                                listF = AbstractC3230e0.f(th);
                            }
                            c1521a.c(listF);
                            break;
                        case 1:
                            C2628H c2628h3 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h3.getClass();
                                kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new q(str2, c2628h3, g10, null));
                                listF2 = AbstractC3935e.C((Double) g10.f39740a);
                            } catch (Throwable th2) {
                                listF2 = AbstractC3230e0.f(th2);
                            }
                            c1521a.c(listF2);
                            break;
                        case 2:
                            C2628H c2628h4 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h4.getClass();
                                kotlin.jvm.internal.G g11 = new kotlin.jvm.internal.G();
                                Ef.H.I(C3109i.f38759a, new s(str3, c2628h4, g11, null));
                                listF3 = AbstractC3935e.C((Long) g11.f39740a);
                            } catch (Throwable th3) {
                                listF3 = AbstractC3230e0.f(th3);
                            }
                            c1521a.c(listF3);
                            break;
                        case 3:
                            C2628H c2628h5 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                List list5 = (List) c2628h5.d(c2628h5.c(str4, (C2636g) obj10));
                                if (list5 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list5) {
                                        if (obj11 instanceof String) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                listF4 = AbstractC3935e.C(arrayList);
                            } catch (Throwable th4) {
                                listF4 = AbstractC3230e0.f(th4);
                            }
                            c1521a.c(listF4);
                            break;
                        case 4:
                            C2628H c2628h6 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h6.getClass();
                                Ef.H.I(C3109i.f38759a, new C2621A(str5, c2628h6, zBooleanValue, null));
                                listF5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                listF5 = AbstractC3230e0.f(th5);
                            }
                            c1521a.c(listF5);
                            break;
                        case 5:
                            C2628H c2628h7 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            List list8 = (List) list7.get(0);
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h7.getClass();
                                Ef.H.I(C3109i.f38759a, new C2638i(c2628h7, list8, null));
                                listF6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                listF6 = AbstractC3230e0.f(th6);
                            }
                            c1521a.c(listF6);
                            break;
                        case 6:
                            C2628H c2628h8 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            List list10 = (List) list9.get(0);
                            Object obj16 = list9.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h8.getClass();
                                listF7 = AbstractC3935e.C((Map) Ef.H.I(C3109i.f38759a, new k(c2628h8, list10, null)));
                            } catch (Throwable th7) {
                                listF7 = AbstractC3230e0.f(th7);
                            }
                            c1521a.c(listF7);
                            break;
                        case 7:
                            C2628H c2628h9 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            List list12 = (List) list11.get(0);
                            Object obj17 = list11.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h9.getClass();
                                listF8 = AbstractC3935e.C(ff.o.S0(((Map) Ef.H.I(C3109i.f38759a, new t(c2628h9, list12, null))).keySet()));
                            } catch (Throwable th8) {
                                listF8 = AbstractC3230e0.f(th8);
                            }
                            c1521a.c(listF8);
                            break;
                        case 8:
                            C2628H c2628h10 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj18 = list13.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj18;
                            Object obj19 = list13.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj19;
                            Object obj20 = list13.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h10.getClass();
                                Ef.H.I(C3109i.f38759a, new C2626F(c2628h10, str6, str7, null));
                                listF9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                listF9 = AbstractC3230e0.f(th9);
                            }
                            c1521a.c(listF9);
                            break;
                        case 9:
                            C2628H c2628h11 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj21 = list14.get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj21;
                            Object obj22 = list14.get(1);
                            if (obj22 instanceof Integer) {
                                jLongValue = ((Number) obj22).intValue();
                            } else {
                                AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                                jLongValue = ((Long) obj22).longValue();
                            }
                            Object obj23 = list14.get(2);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h11.getClass();
                                Ef.H.I(C3109i.f38759a, new C2625E(str8, c2628h11, jLongValue, null));
                                listF10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                listF10 = AbstractC3230e0.f(th10);
                            }
                            c1521a.c(listF10);
                            break;
                        case 10:
                            C2628H c2628h12 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj24 = list15.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj24;
                            Object obj25 = list15.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj25).doubleValue();
                            Object obj26 = list15.get(2);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h12.getClass();
                                Ef.H.I(C3109i.f38759a, new C2623C(str9, c2628h12, dDoubleValue, null));
                                listF11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                listF11 = AbstractC3230e0.f(th11);
                            }
                            c1521a.c(listF11);
                            break;
                        case 11:
                            C2628H c2628h13 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj27 = list16.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj27;
                            Object obj28 = list16.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list17 = (List) obj28;
                            Object obj29 = list16.get(2);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c2628h13.f35321b.getClass();
                                AbstractC3340k.e(list17, "list");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(list17);
                                objectOutputStream.flush();
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                                AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
                                Ef.H.I(C3109i.f38759a, new C2627G(c2628h13, str10, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(strEncodeToString), null));
                                listF12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                listF12 = AbstractC3230e0.f(th12);
                            }
                            c1521a.c(listF12);
                            break;
                        default:
                            C2628H c2628h14 = c2628h;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj2;
                            Object obj30 = list18.get(0);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj30;
                            Object obj31 = list18.get(1);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = AbstractC3935e.C(c2628h14.c(str11, (C2636g) obj31));
                            } catch (Throwable th13) {
                                listF13 = AbstractC3230e0.f(th13);
                            }
                            c1521a.c(listF13);
                            break;
                    }
                }
            });
        }
    }
}
