package vf;

import A.C0208a;
import A0.p;
import A7.AbstractC0279p0;
import Ad.g;
import Af.n;
import Bf.r;
import E0.b;
import E5.Q;
import Jd.B;
import Jd.C;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.P;
import N.V;
import N1.D;
import U1.C0850u;
import Uc.o;
import Uc.y;
import V1.d;
import V1.h;
import V1.i;
import V1.k;
import Va.M6;
import Va.X7;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.w;
import androidx.activity.z;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.X;
import androidx.lifecycle.InterfaceC1457v;
import ba.C1521a;
import c0.C1542g;
import c0.m;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.api.f;
import com.google.protobuf.ByteString;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.internal.ortb.e;
import com.moloco.sdk.publisher.AdFormatType;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import e.AbstractC2437e;
import e.C2433a;
import e.C2434b;
import ef.C2515C;
import ef.C2527k;
import ff.v;
import g1.C2668d;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kd.C3306b;
import kd.C3313i;
import kotlin.jvm.internal.AbstractC3340k;
import l4.EnumC3388d;
import lf.AbstractC3471j;
import m9.G;
import org.apache.tika.metadata.TikaCoreProperties;
import p0.t;
import r7.AbstractC3935e;
import s2.j;
import tf.l;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;
import z1.C4609b;

/* renamed from: vf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4345a {
    public static k A(Context context, C0850u c0850u, boolean z2, String str) {
        MediaMetricsManager mediaMetricsManagerE = h.e(context.getSystemService("media_metrics"));
        i iVar = mediaMetricsManagerE == null ? null : new i(context, mediaMetricsManagerE.createPlaybackSession());
        if (iVar == null) {
            Q1.k.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new k(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z2) {
            c0850u.getClass();
            d dVar = c0850u.f12167r;
            dVar.getClass();
            dVar.f12904f.a(iVar);
        }
        return new k(iVar.f12927c.getSessionId(), str);
    }

    public static ColorStateList B(Context context, int i5, ColorStateList colorStateList) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i5});
        try {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
            if (typedValuePeekValue == null) {
                return colorStateList;
            }
            int i10 = typedValuePeekValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return t(context, typedValuePeekValue.data);
            }
            ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0);
            return colorStateList2 != null ? colorStateList2 : colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static boolean C(Context context, int i5, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i5});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int D(Context context, int i5, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i5});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Drawable E(Context context, int i5) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i5});
        try {
            return typedArrayObtainStyledAttributes.getDrawable(0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static EnumC3388d F(Context context, int i5, EnumC3388d enumC3388d) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i5});
        try {
            int iOrdinal = enumC3388d.ordinal();
            int i10 = typedArrayObtainStyledAttributes.getInt(0, iOrdinal != 1 ? iOrdinal != 2 ? 0 : 2 : 1);
            return i10 != 1 ? i10 != 2 ? EnumC3388d.f39952a : EnumC3388d.f39954c : EnumC3388d.f39953b;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int G(double d3) {
        if (Double.isNaN(d3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d3 > 2.147483647E9d) {
            return f.API_PRIORITY_OTHER;
        }
        if (d3 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d3);
    }

    public static int H(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static long I(double d3) {
        if (Double.isNaN(d3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d3);
    }

    public static void J(Context context, String str, Boolean bool) {
        WeakReference weakReference = new WeakReference(context);
        if (weakReference.get() != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences((Context) weakReference.get()).edit();
            editorEdit.putBoolean(str, bool.booleanValue());
            editorEdit.apply();
        }
    }

    public static void K(y yVar, Exception exc) {
        yVar.b(new o("firebase_firestore", exc.getMessage(), n(exc)));
    }

    public static final void L(B b5, String value) {
        AbstractC3340k.e(b5, "<this>");
        AbstractC3340k.e(value, "value");
        List listU0 = Bf.k.y0(value) ? v.f35432a : value.equals("/") ? C.f6017a : ff.o.U0(Bf.k.H0(value, new char[]{'/'}));
        AbstractC3340k.e(listU0, "<set-?>");
        b5.f6014h = listU0;
    }

    public static void M(InterfaceC4269f binaryMessenger, final C3313i c3313i) {
        C8.i iVar;
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        InterfaceC4277n c3306b = (c3313i == null || (iVar = c3313i.f39663a) == null) ? new C3306b() : iVar.q();
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor");
        if (c3313i != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: kd.G
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3313i c3313i2 = c3313i;
                    switch (i5) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3313i2.f39663a.f1941d).a(((Long) obj3).longValue(), new P(c3313i2));
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p10 = (P) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c3313i2.getClass();
                                p10.f39599c = zBooleanValue;
                                listD2 = AbstractC3935e.C(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p11 = (P) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c3313i2.getClass();
                                p11.f39600d = zBooleanValue2;
                                listD3 = AbstractC3935e.C(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p12 = (P) obj8;
                            Object obj9 = list3.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3313i2.getClass();
                                p12.f39601e = zBooleanValue3;
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p13 = (P) obj10;
                            Object obj11 = list4.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3313i2.getClass();
                                p13.f39602f = zBooleanValue4;
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p14 = (P) obj12;
                            Object obj13 = list5.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3313i2.getClass();
                                p14.f39603g = zBooleanValue5;
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser");
        if (c3313i != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: kd.G
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3313i c3313i2 = c3313i;
                    switch (i10) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3313i2.f39663a.f1941d).a(((Long) obj3).longValue(), new P(c3313i2));
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p10 = (P) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c3313i2.getClass();
                                p10.f39599c = zBooleanValue;
                                listD2 = AbstractC3935e.C(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p11 = (P) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c3313i2.getClass();
                                p11.f39600d = zBooleanValue2;
                                listD3 = AbstractC3935e.C(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p12 = (P) obj8;
                            Object obj9 = list3.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3313i2.getClass();
                                p12.f39601e = zBooleanValue3;
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p13 = (P) obj10;
                            Object obj11 = list4.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3313i2.getClass();
                                p13.f39602f = zBooleanValue4;
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p14 = (P) obj12;
                            Object obj13 = list5.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3313i2.getClass();
                                p14.f39603g = zBooleanValue5;
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage");
        if (c3313i != null) {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: kd.G
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3313i c3313i2 = c3313i;
                    switch (i11) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3313i2.f39663a.f1941d).a(((Long) obj3).longValue(), new P(c3313i2));
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p10 = (P) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c3313i2.getClass();
                                p10.f39599c = zBooleanValue;
                                listD2 = AbstractC3935e.C(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p11 = (P) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c3313i2.getClass();
                                p11.f39600d = zBooleanValue2;
                                listD3 = AbstractC3935e.C(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p12 = (P) obj8;
                            Object obj9 = list3.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3313i2.getClass();
                                p12.f39601e = zBooleanValue3;
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p13 = (P) obj10;
                            Object obj11 = list4.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3313i2.getClass();
                                p13.f39602f = zBooleanValue4;
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p14 = (P) obj12;
                            Object obj13 = list5.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3313i2.getClass();
                                p14.f39603g = zBooleanValue5;
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert");
        if (c3313i != null) {
            final int i12 = 3;
            x75.n(new InterfaceC4265b() { // from class: kd.G
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3313i c3313i2 = c3313i;
                    switch (i12) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3313i2.f39663a.f1941d).a(((Long) obj3).longValue(), new P(c3313i2));
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p10 = (P) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c3313i2.getClass();
                                p10.f39599c = zBooleanValue;
                                listD2 = AbstractC3935e.C(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p11 = (P) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c3313i2.getClass();
                                p11.f39600d = zBooleanValue2;
                                listD3 = AbstractC3935e.C(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p12 = (P) obj8;
                            Object obj9 = list3.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3313i2.getClass();
                                p12.f39601e = zBooleanValue3;
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p13 = (P) obj10;
                            Object obj11 = list4.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3313i2.getClass();
                                p13.f39602f = zBooleanValue4;
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p14 = (P) obj12;
                            Object obj13 = list5.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3313i2.getClass();
                                p14.f39603g = zBooleanValue5;
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm");
        if (c3313i != null) {
            final int i13 = 4;
            x76.n(new InterfaceC4265b() { // from class: kd.G
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3313i c3313i2 = c3313i;
                    switch (i13) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3313i2.f39663a.f1941d).a(((Long) obj3).longValue(), new P(c3313i2));
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p10 = (P) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c3313i2.getClass();
                                p10.f39599c = zBooleanValue;
                                listD2 = AbstractC3935e.C(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p11 = (P) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c3313i2.getClass();
                                p11.f39600d = zBooleanValue2;
                                listD3 = AbstractC3935e.C(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p12 = (P) obj8;
                            Object obj9 = list3.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3313i2.getClass();
                                p12.f39601e = zBooleanValue3;
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p13 = (P) obj10;
                            Object obj11 = list4.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3313i2.getClass();
                                p13.f39602f = zBooleanValue4;
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p14 = (P) obj12;
                            Object obj13 = list5.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3313i2.getClass();
                                p14.f39603g = zBooleanValue5;
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                    }
                }
            });
        } else {
            x76.n(null);
        }
        X7 x77 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt");
        if (c3313i == null) {
            x77.n(null);
        } else {
            final int i14 = 5;
            x77.n(new InterfaceC4265b() { // from class: kd.G
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3313i c3313i2 = c3313i;
                    switch (i14) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3313i2.f39663a.f1941d).a(((Long) obj3).longValue(), new P(c3313i2));
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p10 = (P) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c3313i2.getClass();
                                p10.f39599c = zBooleanValue;
                                listD2 = AbstractC3935e.C(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p11 = (P) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c3313i2.getClass();
                                p11.f39600d = zBooleanValue2;
                                listD3 = AbstractC3935e.C(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p12 = (P) obj8;
                            Object obj9 = list3.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3313i2.getClass();
                                p12.f39601e = zBooleanValue3;
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p13 = (P) obj10;
                            Object obj11 = list4.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3313i2.getClass();
                                p13.f39602f = zBooleanValue4;
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            P p14 = (P) obj12;
                            Object obj13 = list5.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3313i2.getClass();
                                p14.f39603g = zBooleanValue5;
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                    }
                }
            });
        }
    }

    public static U5.f N(int i5, j jVar, Q1.o oVar) throws EOFException, InterruptedIOException, D {
        U5.f fVarC = U5.f.c(jVar, oVar);
        while (true) {
            int i10 = fVarC.f12344a;
            if (i10 == i5) {
                return fVarC;
            }
            N0.a.o(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j8 = fVarC.f12345b;
            long j10 = 8 + j8;
            if (j8 % 2 != 0) {
                j10 = 9 + j8;
            }
            if (j10 > 2147483647L) {
                throw D.c("Chunk is too large (~2GB+) to skip; id: " + i10);
            }
            jVar.j((int) j10);
            fVarC = U5.f.c(jVar, oVar);
        }
    }

    public static String O(int i5) {
        Object[] objArr = {Integer.valueOf(Color.red(i5)), Integer.valueOf(Color.green(i5)), Integer.valueOf(Color.blue(i5)), Double.valueOf(Color.alpha(i5) / 255.0d)};
        int i10 = u6.v.f46721a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final void P(C1542g c1542g) {
        m.a(c1542g);
        P.d dVar = c1542g.f19499c;
        int i5 = dVar.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVar.f8970a;
            int i10 = 0;
            do {
                P((C1542g) objArr[i10]);
                i10++;
            } while (i10 < i5);
        }
    }

    public static final void a(boolean z2, tf.a aVar, C0740o c0740o, int i5) {
        int i10 = 6;
        c0740o.N(-361453782);
        if (((i5 | 6 | (c0740o.e(aVar) ? 32 : 16)) & 91) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            V vI = C0718d.I(aVar, c0740o);
            c0740o.M(-3687241);
            Object objF = c0740o.F();
            P p10 = C0732k.f7800a;
            if (objF == p10) {
                objF = new C2434b(vI);
                c0740o.U(objF);
            }
            c0740o.p(false);
            C2434b c2434b = (C2434b) objF;
            c0740o.M(-3686552);
            boolean zE = c0740o.e(true) | c0740o.e(c2434b);
            Object objF2 = c0740o.F();
            if (zE || objF2 == p10) {
                objF2 = new p(c2434b, 20);
                c0740o.U(objF2);
            }
            c0740o.p(false);
            C0718d.g((tf.a) objF2, c0740o);
            N.D d3 = AbstractC2437e.f34324a;
            c0740o.M(-2068013981);
            androidx.activity.y yVar = (androidx.activity.y) c0740o.j(AbstractC2437e.f34324a);
            c0740o.M(1680121597);
            if (yVar == null) {
                View view = (View) c0740o.j(AndroidCompositionLocals_androidKt.f18016f);
                AbstractC3340k.e(view, "<this>");
                yVar = (androidx.activity.y) n.X(n.d0(n.a0(view, z.f17752j), z.k));
            }
            c0740o.p(false);
            if (yVar == null) {
                Object baseContext = (Context) c0740o.j(AndroidCompositionLocals_androidKt.f18012b);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        baseContext = null;
                        break;
                    } else if (baseContext instanceof androidx.activity.y) {
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                yVar = (androidx.activity.y) baseContext;
            }
            c0740o.p(false);
            if (yVar == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            w onBackPressedDispatcher = yVar.getOnBackPressedDispatcher();
            InterfaceC1457v interfaceC1457v = (InterfaceC1457v) c0740o.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            C0718d.b(interfaceC1457v, onBackPressedDispatcher, new C0208a(onBackPressedDispatcher, interfaceC1457v, c2434b, i10), c0740o);
            z2 = true;
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new C2433a(z2, aVar, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r21, Z.k r22, z0.p r23, tf.l r24, int r25, boolean r26, int r27, N.C0740o r28, int r29) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vf.AbstractC4345a.b(java.lang.String, Z.k, z0.p, tf.l, int, boolean, int, N.o, int):void");
    }

    public static final com.moloco.sdk.internal.publisher.B c(Kd.a aVar, l lVar, String adUnitId, l lVar2, AdFormatType adFormatType, com.moloco.sdk.internal.services.l webViewChecker, c cVar, tf.a aVar2) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(adFormatType, "adFormatType");
        AbstractC3340k.e(webViewChecker, "webViewChecker");
        return new com.moloco.sdk.internal.publisher.B(aVar, lVar, adUnitId, lVar2, (e) com.moloco.sdk.internal.ortb.f.f28679a.getValue(), new X(3), adFormatType, webViewChecker, cVar, aVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r14 = r8.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r2 >= r14) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r6 = (p0.k) r8.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r6.b() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (android.support.v4.media.session.b.k0(r6, r13.f43177e.f43184i, r13.h()) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        r14 = p0.g.f43138c;
        r0.f31948a = r13;
        r0.f31950c = 2;
        r14 = r13.e(r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r14 != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[PHI: r13 r14
  0x004b: PHI (r13v1 p0.s) = (r13v5 p0.s), (r13v8 p0.s) binds: [B:18:0x0048, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r14v2 java.lang.Object) = (r14v8 java.lang.Object), (r14v1 java.lang.Object) binds: [B:18:0x0048, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0093 -> B:36:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(p0.s r13, lf.AbstractC3462a r14) {
        /*
            boolean r0 = r14 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.e
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.e r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.e) r0
            int r1 = r0.f31950c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31950c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.e r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.e
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f31949b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31950c
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            p0.s r13 = r0.f31948a
            Fe.e.U(r14)
            goto L96
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            p0.s r13 = r0.f31948a
            Fe.e.U(r14)
            goto L4b
        L3b:
            Fe.e.U(r14)
        L3e:
            p0.g r14 = p0.g.f43136a
            r0.f31948a = r13
            r0.f31950c = r3
            java.lang.Object r14 = r13.e(r14, r0)
            if (r14 != r1) goto L4b
            goto L95
        L4b:
            p0.f r14 = (p0.f) r14
            java.util.List r2 = r14.f43133a
            int r6 = r2.size()
            r7 = r5
        L54:
            java.util.List r8 = r14.f43133a
            if (r7 >= r6) goto Lb5
            java.lang.Object r9 = r2.get(r7)
            p0.k r9 = (p0.k) r9
            boolean r9 = android.support.v4.media.session.b.O(r9)
            if (r9 != 0) goto Lb2
            int r14 = r8.size()
            r2 = r5
        L69:
            if (r2 >= r14) goto L89
            java.lang.Object r6 = r8.get(r2)
            p0.k r6 = (p0.k) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto Lad
            p0.t r7 = r13.f43177e
            long r9 = r7.f43184i
            long r11 = r13.h()
            boolean r6 = android.support.v4.media.session.b.k0(r6, r9, r11)
            if (r6 == 0) goto L86
            goto Lad
        L86:
            int r2 = r2 + 1
            goto L69
        L89:
            p0.g r14 = p0.g.f43138c
            r0.f31948a = r13
            r0.f31950c = r4
            java.lang.Object r14 = r13.e(r14, r0)
            if (r14 != r1) goto L96
        L95:
            return r1
        L96:
            p0.f r14 = (p0.f) r14
            java.util.List r14 = r14.f43133a
            int r2 = r14.size()
            r6 = r5
        L9f:
            if (r6 >= r2) goto L3e
            java.lang.Object r7 = r14.get(r6)
            p0.k r7 = (p0.k) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Laf
        Lad:
            r13 = 0
            return r13
        Laf:
            int r6 = r6 + 1
            goto L9f
        Lb2:
            int r7 = r7 + 1
            goto L54
        Lb5:
            java.lang.Object r13 = r8.get(r5)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vf.AbstractC4345a.d(p0.s, lf.a):java.lang.Object");
    }

    public static final Object e(t tVar, tf.p pVar, AbstractC3471j abstractC3471j) {
        Object objW = A6.c.w(tVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.d(new C.e(tVar), pVar, null), abstractC3471j);
        return objW == kf.a.f39711a ? objW : C2515C.f34653a;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z r19, final Z.k r20, final tf.a r21, final boolean r22, final long r23, final long r25, final long r27, final com.moloco.sdk.internal.ortb.model.D r29, final tf.a r30, N.C0740o r31, final int r32) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vf.AbstractC4345a.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z, Z.k, tf.a, boolean, long, long, long, com.moloco.sdk.internal.ortb.model.D, tf.a, N.o, int):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void g(B b5, StringBuilder sb2) {
        List listC;
        sb2.append(b5.c().f6020a);
        String str = b5.c().f6020a;
        switch (str.hashCode()) {
            case -1081572750:
                if (str.equals("mailto")) {
                    StringBuilder sb3 = new StringBuilder();
                    String str2 = b5.f6011e;
                    String str3 = b5.f6012f;
                    if (str2 != null) {
                        sb3.append(str2);
                        if (str3 != null) {
                            sb3.append(':');
                            sb3.append(str3);
                        }
                        sb3.append("@");
                    }
                    CharSequence string = sb3.toString();
                    CharSequence charSequence = b5.f6007a;
                    sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    sb2.append(string);
                    sb2.append(charSequence);
                    return;
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    CharSequence charSequence2 = b5.f6007a;
                    sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    sb2.append(charSequence2);
                    return;
                }
                break;
            case 3076010:
                if (str.equals(JsonStorageKeyNames.DATA_KEY)) {
                    CharSequence charSequence3 = b5.f6007a;
                    sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    sb2.append(charSequence3);
                    return;
                }
                break;
            case 3143036:
                if (str.equals("file")) {
                    CharSequence charSequence4 = b5.f6007a;
                    String strV = v(b5);
                    sb2.append("://");
                    sb2.append(charSequence4);
                    if (!Bf.k.K0(strV, '/')) {
                        sb2.append('/');
                    }
                    sb2.append((CharSequence) strV);
                    return;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    CharSequence charSequence5 = b5.f6007a;
                    sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    sb2.append(charSequence5);
                    return;
                }
                break;
        }
        sb2.append("://");
        sb2.append(u(b5));
        String encodedPath = v(b5);
        Jd.z encodedQueryParameters = b5.f6015i;
        boolean z2 = b5.f6008b;
        AbstractC3340k.e(encodedPath, "encodedPath");
        AbstractC3340k.e(encodedQueryParameters, "encodedQueryParameters");
        if (!Bf.k.y0(encodedPath) && !r.k0(encodedPath, "/", false)) {
            sb2.append('/');
        }
        sb2.append((CharSequence) encodedPath);
        if (!((Map) encodedQueryParameters.f421a).isEmpty() || z2) {
            sb2.append("?");
        }
        Set<Map.Entry> setB = encodedQueryParameters.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setB) {
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listC = AbstractC3935e.C(new C2527k(str4, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(ff.p.a0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C2527k(str4, (String) it.next()));
                }
                listC = arrayList2;
            }
            ff.t.e0(listC, arrayList);
        }
        ff.o.v0(arrayList, sb2, "&", null, null, new g(17), 60);
        if (b5.f6013g.length() > 0) {
            sb2.append('#');
            sb2.append(b5.f6013g);
        }
    }

    public static int h(float f10, int i5) {
        return Color.argb(Math.round(Color.alpha(i5) * f10), Color.red(i5), Color.green(i5), Color.blue(i5));
    }

    public static void i(StringBuilder sb2, Object obj, l lVar) {
        AbstractC3340k.e(sb2, "<this>");
        if (lVar != null) {
            sb2.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    public static int j(int i5) {
        if (i5 < 8191) {
            return 13;
        }
        if (i5 < 32767) {
            return 15;
        }
        if (i5 < 65535) {
            return 16;
        }
        if (i5 < 262143) {
            return 18;
        }
        throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Can't represent a size of ", " in Constraints"));
    }

    public static boolean k(j jVar) {
        Q1.o oVar = new Q1.o(8);
        int i5 = U5.f.c(jVar, oVar).f12344a;
        if (i5 != 1380533830 && i5 != 1380333108) {
            return false;
        }
        jVar.c(oVar.f9702a, 0, 4, false);
        oVar.G(0);
        int iH = oVar.h();
        if (iH == 1463899717) {
            return true;
        }
        Q1.k.k("WavHeaderReader", "Unsupported form type: " + iH);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (xg.g.r(r10, r2, kotlin.jvm.internal.AbstractC3340k.a(r8, r3) ? r0.getWidth() : k4.e.d(r8.f36786a, r9), kotlin.jvm.internal.AbstractC3340k.a(r8, r3) ? r0.getHeight() : k4.e.d(r8.f36787b, r9), r9) == 1.0d) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap l(android.graphics.drawable.Drawable r6, android.graphics.Bitmap.Config r7, i4.C2849f r8, int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vf.AbstractC4345a.l(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, i4.f, int, boolean):android.graphics.Bitmap");
    }

    public static long m(int i5, int i10, int i11, int i12) {
        long j8;
        int i13 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int iJ = j(i13);
        int i14 = i10 == Integer.MAX_VALUE ? i5 : i10;
        int iJ2 = j(i14);
        if (iJ + iJ2 > 31) {
            throw new IllegalArgumentException(N0.a.e("Can't represent a width of ", i14, " and height of ", i13, " in Constraints"));
        }
        if (iJ2 == 13) {
            j8 = 3;
        } else if (iJ2 == 18) {
            j8 = 1;
        } else if (iJ2 == 15) {
            j8 = 2;
        } else {
            if (iJ2 != 16) {
                throw new IllegalStateException("Should only have the provided constants.");
            }
            j8 = 0;
        }
        int i15 = i10 == Integer.MAX_VALUE ? 0 : i10 + 1;
        int i16 = i12 != Integer.MAX_VALUE ? i12 + 1 : 0;
        int i17 = L0.a.f6789b[(int) j8];
        return (i15 << 33) | j8 | (i5 << 2) | (i11 << i17) | (i16 << (i17 + 31));
    }

    public static HashMap n(Exception exc) {
        Uc.a aVar;
        HashMap map = new HashMap();
        if (exc != null) {
            if (exc instanceof G) {
                aVar = new Uc.a((G) exc, exc.getCause());
            } else if (exc.getCause() == null || !(exc.getCause() instanceof G)) {
                aVar = null;
            } else {
                aVar = new Uc.a((G) exc.getCause(), exc.getCause().getCause() != null ? exc.getCause().getCause() : exc.getCause());
            }
            if (aVar != null) {
                map.put("code", aVar.f12711a);
                map.put(PglCryptUtils.KEY_MESSAGE, aVar.f12712b);
            }
            if (map.containsKey("code")) {
                String str = (String) map.get("code");
                Objects.requireNonNull(str);
                if (str.equals("unknown")) {
                    Log.e("FLTFirebaseFirestore", "An unknown error occurred", exc);
                }
            }
        }
        return map;
    }

    public static final E0.f o(Context context) {
        return new E0.f(new E0.a(context), new b(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0));
    }

    public static final C1542g p(C1542g c1542g) {
        C1542g c1542gP;
        int iOrdinal = c1542g.f19500d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return null;
                        }
                        throw new Q((byte) 0, 9);
                    }
                }
            }
            C1542g c1542g2 = c1542g.f19501e;
            if (c1542g2 == null || (c1542gP = p(c1542g2)) == null) {
                throw new IllegalStateException("no child");
            }
            return c1542gP;
        }
        return c1542g;
    }

    public static View q(int i5, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewFindViewById = viewGroup.getChildAt(i10).findViewById(i5);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static long r(int i5, int i10) {
        if (i5 < 0 || i10 < 0) {
            throw new IllegalArgumentException(N0.a.e("width(", i5, ") and height(", i10, ") must be >= 0").toString());
        }
        return m(i5, i5, i10, i10);
    }

    public static void s(Nd.j jVar, tf.p pVar) {
        for (Map.Entry entry : jVar.b()) {
            pVar.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static ColorStateList t(Context context, int i5) {
        int iD = D(context, R.attr.textColorPrimary, 0);
        if (i5 == 0) {
            i5 = iD;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{h(0.4f, i5), i5});
    }

    public static final String u(B b5) {
        AbstractC3340k.e(b5, "<this>");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String str = b5.f6011e;
        String str2 = b5.f6012f;
        if (str != null) {
            sb3.append(str);
            if (str2 != null) {
                sb3.append(':');
                sb3.append(str2);
            }
            sb3.append("@");
        }
        sb2.append(sb3.toString());
        sb2.append(b5.f6007a);
        int i5 = b5.f6009c;
        if (i5 != 0 && i5 != b5.c().f6021b) {
            sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb2.append(String.valueOf(b5.f6009c));
        }
        return sb2.toString();
    }

    public static final String v(B b5) {
        AbstractC3340k.e(b5, "<this>");
        List list = b5.f6014h;
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) ff.o.q0(list)).length() == 0 ? "/" : (String) ff.o.q0(list) : ff.o.w0(list, "/", null, null, null, 62);
    }

    public static Object w(Context context, String str) {
        Boolean bool = Boolean.FALSE;
        WeakReference weakReference = new WeakReference(context);
        if (weakReference.get() != null) {
            try {
                return Boolean.valueOf(PreferenceManager.getDefaultSharedPreferences((Context) weakReference.get()).getBoolean(str, bool.booleanValue()));
            } catch (Exception e7) {
                String message = e7.getMessage();
                Objects.requireNonNull(message);
                Log.e("Exception", message);
            }
        }
        return bool;
    }

    public static C2668d x(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new C2668d(new g1.g(Y0.a.e(configuration))) : C2668d.a(configuration.locale);
    }

    public static boolean y(int i5) {
        return 1.0d - (((((double) Color.blue(i5)) * 0.114d) + ((((double) Color.green(i5)) * 0.587d) + (((double) Color.red(i5)) * 0.299d))) / 255.0d) >= 0.5d;
    }

    public static C4609b z(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j8;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i5 = byteBufferDuplicate.getShort() & 65535;
        if (i5 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i5) {
                j8 = -1;
                break;
            }
            int i11 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j8 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j8 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j8 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j10 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i12 = 0; i12 < j10; i12++) {
                int i13 = byteBufferDuplicate.getInt();
                long j11 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    byteBufferDuplicate.position((int) (j11 + j8));
                    C4609b c4609b = new C4609b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c4609b.f35893d = byteBufferDuplicate;
                    c4609b.f35890a = iPosition;
                    int i14 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c4609b.f35891b = i14;
                    c4609b.f35892c = ((ByteBuffer) c4609b.f35893d).getShort(i14);
                    return c4609b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public abstract void Q(ByteString byteString);

    public abstract void R(double d3);

    public abstract void S();

    public abstract void T(long j8);

    public abstract void U(String str);
}
