package A7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzpu;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import ka.AbstractC3256n;
import p7.C3773c;
import y3.C4552j;

/* loaded from: classes4.dex */
public final class U1 extends D0 {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f713i = {"firebase_", "google_", "ga_"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f714j = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f715c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f716d;

    /* renamed from: e, reason: collision with root package name */
    public int f717e;

    /* renamed from: f, reason: collision with root package name */
    public e3.d f718f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f719g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f720h;

    public U1(C0273n0 c0273n0) {
        super(c0273n0);
        this.f720h = null;
        this.f716d = new AtomicLong(0L);
    }

    public static void H0(C4552j c4552j, String str, int i5, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        Z0(i5, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i5 == 6 || i5 == 7 || i5 == 2) {
            bundle.putLong("_el", i10);
        }
        c4552j.u(str, "_err", bundle);
    }

    public static boolean K0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC1732v.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean L0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean M0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean Q0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            AbstractC1732v.i(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static boolean R0(String str, String[] strArr) {
        AbstractC1732v.i(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] T0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static boolean V0(Context context) {
        AbstractC1732v.i(context);
        return Build.VERSION.SDK_INT >= 24 ? d1(context, "com.google.android.gms.measurement.AppMeasurementJobService") : d1(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static ArrayList Y0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0242d c0242d = (C0242d) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c0242d.f833a);
            bundle.putString("origin", c0242d.f834b);
            bundle.putLong("creation_timestamp", c0242d.f836d);
            bundle.putString(MediationMetaData.KEY_NAME, c0242d.f835c.f681b);
            Object objZza = c0242d.f835c.zza();
            AbstractC1732v.i(objZza);
            I0.g(objZza, bundle);
            bundle.putBoolean("active", c0242d.f837e);
            String str = c0242d.f838f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C0301x c0301x = c0242d.f839g;
            if (c0301x != null) {
                bundle.putString("timed_out_event_name", c0301x.f1103a);
                C0298w c0298w = c0301x.f1104b;
                if (c0298w != null) {
                    bundle.putBundle("timed_out_event_params", c0298w.W());
                }
            }
            bundle.putLong("trigger_timeout", c0242d.f840h);
            C0301x c0301x2 = c0242d.f841i;
            if (c0301x2 != null) {
                bundle.putString("triggered_event_name", c0301x2.f1103a);
                C0298w c0298w2 = c0301x2.f1104b;
                if (c0298w2 != null) {
                    bundle.putBundle("triggered_event_params", c0298w2.W());
                }
            }
            bundle.putLong("triggered_timestamp", c0242d.f835c.f682c);
            bundle.putLong("time_to_live", c0242d.f842j);
            C0301x c0301x3 = c0242d.k;
            if (c0301x3 != null) {
                bundle.putString("expired_event_name", c0301x3.f1103a);
                C0298w c0298w3 = c0301x3.f1104b;
                if (c0298w3 != null) {
                    bundle.putBundle("expired_event_params", c0298w3.W());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean Z0(int i5, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i5);
        return true;
    }

    public static boolean d1(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean h1(String str) {
        String str2 = (String) AbstractC0304y.f1118A0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean j1(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(Constants.USER_ID_SEPARATOR);
    }

    public static long k0(C0298w c0298w) {
        long length = 0;
        if (c0298w == null) {
            return 0L;
        }
        Bundle bundle = c0298w.f1091a;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            if (bundle.get(it.next()) instanceof Parcelable[]) {
                length += ((Parcelable[]) r3).length;
            }
        }
        return length;
    }

    public static boolean k1(String str) {
        AbstractC1732v.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static long l0(byte[] bArr) {
        AbstractC1732v.i(bArr);
        int i5 = 0;
        AbstractC1732v.l(bArr.length > 0);
        long j8 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j8 += (bArr[length] & 255) << i5;
            i5 += 8;
        }
        return j8;
    }

    public static int m1(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    public static Bundle p0(List list) {
        Bundle bundle = new Bundle();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                R1 r12 = (R1) it.next();
                String str = r12.f684e;
                String str2 = r12.f681b;
                if (str != null) {
                    bundle.putString(str2, str);
                } else {
                    Long l10 = r12.f683d;
                    if (l10 != null) {
                        bundle.putLong(str2, l10.longValue());
                    } else {
                        Double d3 = r12.f686g;
                        if (d3 != null) {
                            bundle.putDouble(str2, d3.doubleValue());
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static MessageDigest q1() {
        MessageDigest messageDigest;
        for (int i5 = 0; i5 < 2; i5++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static String s0(String str, int i5, boolean z2) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i5) {
                return str;
            }
            if (z2) {
                return N0.a.f(str.substring(0, str.offsetByCodePoints(0, i5)), "...");
            }
        }
        return null;
    }

    public static void u0(C0262j1 c0262j1, Bundle bundle, boolean z2) {
        if (bundle == null || c0262j1 == null || (bundle.containsKey("_sc") && !z2)) {
            if (bundle != null && c0262j1 == null && z2) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c0262j1.f917a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c0262j1.f918b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c0262j1.f919c);
    }

    public static void v0(Bundle bundle, int i5, String str, Object obj) {
        if (Z0(i5, bundle)) {
            bundle.putString("_ev", s0(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public final void A0(zzdo zzdoVar, Bundle bundle) {
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e7) {
            N n10 = ((C0273n0) this.f421a).f981i;
            C0273n0.d(n10);
            n10.f608i.d("Error returning bundle value to wrapper", e7);
        }
    }

    public final void B0(zzdo zzdoVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, arrayList);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e7) {
            N n10 = ((C0273n0) this.f421a).f981i;
            C0273n0.d(n10);
            n10.f608i.d("Error returning bundle list to wrapper", e7);
        }
    }

    public final void C0(zzdo zzdoVar, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, z2);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e7) {
            N n10 = ((C0273n0) this.f421a).f981i;
            C0273n0.d(n10);
            n10.f608i.d("Error returning boolean value to wrapper", e7);
        }
    }

    public final void D0(zzdo zzdoVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, bArr);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e7) {
            N n10 = ((C0273n0) this.f421a).f981i;
            C0273n0.d(n10);
            n10.f608i.d("Error returning byte array to wrapper", e7);
        }
    }

    public final void E0(String str, zzdo zzdoVar) {
        try {
            zzdoVar.zza(AbstractC3256n.b(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, str));
        } catch (RemoteException e7) {
            N n10 = ((C0273n0) this.f421a).f981i;
            C0273n0.d(n10);
            n10.f608i.d("Error returning string value to wrapper", e7);
        }
    }

    public final void F0(String str, Object obj, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            zzj().k.b(((C0273n0) this.f421a).f984m.f(str), "Not putting event parameter. Invalid value type. name, type", simpleName);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(java.lang.String r18, java.lang.String r19, android.os.Bundle r20, java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.U1.G0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    public final void I0(Parcelable[] parcelableArr, int i5) {
        AbstractC1732v.i(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (k1(str) && !R0(str, I0.f532j) && (i10 = i10 + 1) > i5) {
                    N nZzj = zzj();
                    String strI = AbstractC0279p0.i(i5, "Param can't contain more than ", " item-scoped custom parameters");
                    C0273n0 c0273n0 = (C0273n0) this.f421a;
                    nZzj.f607h.b(c0273n0.f984m.f(str), strI, c0273n0.f984m.b(bundle));
                    Z0(28, bundle);
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean J0(int i5, String str, String str2) {
        if (str2 == null) {
            zzj().f607h.d("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i5) {
            return true;
        }
        N nZzj = zzj();
        nZzj.f607h.a(str, Integer.valueOf(i5), str2, "Name is too long. Type, maximum supported length, name");
        return false;
    }

    public final boolean N0(String str, double d3) {
        try {
            SharedPreferences.Editor editorEdit = ((C0273n0) this.f421a).f973a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d3));
            return editorEdit.commit();
        } catch (RuntimeException e7) {
            zzj().f605f.d("Failed to persist Deferred Deep Link. exception", e7);
            return false;
        }
    }

    public final boolean O0(String str, int i5, String str2, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        if (strValueOf.codePointCount(0, strValueOf.length()) > i5) {
            N nZzj = zzj();
            nZzj.k.a(str, str2, Integer.valueOf(strValueOf.length()), "Value is too long; discarded. Value kind, name, value length");
            return false;
        }
        return true;
    }

    public final boolean P0(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        if (!zIsEmpty) {
            AbstractC1732v.i(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(c0273n0.f974b)) {
                N nZzj = zzj();
                nZzj.f607h.d("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", N.h0(str));
                return false;
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                AbstractC1732v.i(str2);
                if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                    return true;
                }
                N nZzj2 = zzj();
                nZzj2.f607h.d("Invalid admob_app_id. Analytics disabled.", N.h0(str2));
                return false;
            }
            if (TextUtils.isEmpty(c0273n0.f974b)) {
                zzj().f607h.c("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
        }
        return false;
    }

    public final boolean S0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            zzj().f607h.d("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = f713i;
        for (int i5 = 0; i5 < 3; i5++) {
            if (str2.startsWith(strArr3[i5])) {
                zzj().f607h.b(str, "Name starts with reserved prefix. Type, name", str2);
                return false;
            }
        }
        if (strArr == null || !R0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && R0(str2, strArr2)) {
            return true;
        }
        zzj().f607h.b(str, "Name is reserved. Type, name", str2);
        return false;
    }

    public final boolean U0(int i5) {
        Boolean bool = ((C0273n0) this.f421a).m().f955e;
        if (i1() < i5 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int W0(String str) {
        if (!b1("user property", str)) {
            return 6;
        }
        if (S0("user property", I0.f527e, null, str)) {
            return !J0(24, "user property", str) ? 6 : 0;
        }
        return 15;
    }

    public final Object X0(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        int iMax = 500;
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        if (zEquals) {
            c0273n0.f979g.getClass();
            return r0(Math.max(500, 256), obj, true, true);
        }
        if (j1(str)) {
            c0273n0.f979g.getClass();
            iMax = Math.max(500, 256);
        } else {
            c0273n0.f979g.getClass();
        }
        return r0(iMax, obj, false, true);
    }

    public final boolean a1(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoC = C3773c.a(context).c(64, str);
            if (packageInfoC == null || (signatureArr = packageInfoC.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e7) {
            zzj().f605f.d("Package name not found", e7);
            return true;
        } catch (CertificateException e10) {
            zzj().f605f.d("Error obtaining certificate", e10);
            return true;
        }
    }

    public final boolean b1(String str, String str2) {
        if (str2 == null) {
            zzj().f607h.d("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().f607h.d("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            zzj().f607h.b(str, "Name must start with a letter or _ (underscore). Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzj().f607h.b(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final Object c1(Object obj, String str) {
        return "_ldl".equals(str) ? r0(m1(str), obj, true, false) : r0(m1(str), obj, false, false);
    }

    public final boolean e1(String str, String str2) {
        if (str2 == null) {
            zzj().f607h.d("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().f607h.d("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            zzj().f607h.b(str, "Name must start with a letter. Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzj().f607h.b(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean f1(String str, String str2) {
        boolean zZza = zzpu.zza();
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        if (zZza && c0273n0.f979g.o0(null, AbstractC0304y.f1224y0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return c0273n0.f979g.f0("debug.firebase.analytics.app").equals(str);
    }

    @Override // A7.D0
    public final boolean g0() {
        return true;
    }

    public final boolean g1(String str) {
        c0();
        if (C3773c.a(((C0273n0) this.f421a).f973a).f2782a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzj().f611m.d("Permission not granted", str);
        return false;
    }

    public final int h0(Object obj, String str) {
        return "_ldl".equals(str) ? O0("user property referrer", m1(str), str, obj) : O0("user property", m1(str), str, obj) ? 0 : 7;
    }

    public final int i0(String str) {
        if (!b1("event", str)) {
            return 2;
        }
        if (S0("event", I0.f523a, I0.f524b, str)) {
            return !J0(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    public final int i1() {
        if (this.f720h == null) {
            d7.f fVar = d7.f.f34129b;
            Context context = ((C0273n0) this.f421a).f973a;
            fVar.getClass();
            this.f720h = Integer.valueOf(d7.f.a(context) / 1000);
        }
        return this.f720h.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j0(java.lang.String r12, java.lang.String r13, java.lang.Object r14, android.os.Bundle r15, java.util.List r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.U1.j0(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean l1(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = ((C0273n0) this.f421a).f973a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    public final C0301x m0(String str, Bundle bundle, String str2, long j8, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i0(str) != 0) {
            zzj().f605f.d("Invalid conditional property event name", ((C0273n0) this.f421a).f984m.g(str));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleO0 = o0(str, bundle2, Collections.singletonList("_o"), true);
        if (z2) {
            bundleO0 = n0(bundleO0);
        }
        AbstractC1732v.i(bundleO0);
        return new C0301x(str, new C0298w(bundleO0), str2, j8);
    }

    public final Bundle n0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objX0 = X0(bundle.get(str), str);
                if (objX0 == null) {
                    N nZzj = zzj();
                    nZzj.k.d("Param value can't be null", ((C0273n0) this.f421a).f984m.f(str));
                } else {
                    F0(str, objX0, bundle2);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n1() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.U1.n1():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle o0(java.lang.String r18, android.os.Bundle r19, java.util.List r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.U1.o0(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final long o1() {
        long andIncrement;
        long j8;
        if (this.f716d.get() != 0) {
            synchronized (this.f716d) {
                this.f716d.compareAndSet(-1L, 1L);
                andIncrement = this.f716d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f716d) {
            long jNanoTime = System.nanoTime();
            ((C0273n0) this.f421a).f985n.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i5 = this.f717e + 1;
            this.f717e = i5;
            j8 = jNextLong + i5;
        }
        return j8;
    }

    public final String p1() {
        byte[] bArr = new byte[16];
        r1().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Bundle q0(boolean z2, Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z2 ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z2 || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z2 && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (z2 && !TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e7) {
            zzj().f608i.d("Install referrer url isn't a hierarchical URI", e7);
            return null;
        }
    }

    public final Object r0(int i5, Object obj, boolean z2, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return s0(String.valueOf(obj), i5, z2);
        }
        if (!z10) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleN0 = n0((Bundle) parcelable);
                if (!bundleN0.isEmpty()) {
                    arrayList.add(bundleN0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final SecureRandom r1() {
        c0();
        if (this.f715c == null) {
            this.f715c = new SecureRandom();
        }
        return this.f715c;
    }

    public final void t0(S s10, int i5) {
        Iterator it = new TreeSet(((Bundle) s10.f693e).keySet()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (k1(str) && (i10 = i10 + 1) > i5) {
                String strI = AbstractC0279p0.i(i5, "Event can't contain more than ", " params");
                N nZzj = zzj();
                C0273n0 c0273n0 = (C0273n0) this.f421a;
                String strC = c0273n0.f984m.c((String) s10.f691c);
                Bundle bundle = (Bundle) s10.f693e;
                nZzj.f607h.b(strC, strI, c0273n0.f984m.b(bundle));
                Z0(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void w0(Bundle bundle, long j8) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            N nZzj = zzj();
            nZzj.f608i.d("Params already contained engagement", Long.valueOf(j10));
        }
        bundle.putLong("_et", j8 + j10);
    }

    public final void x0(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                b0().F0(str, bundle2.get(str), bundle);
            }
        }
    }

    public final void y0(zzdo zzdoVar, int i5) {
        Bundle bundle = new Bundle();
        bundle.putInt(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, i5);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e7) {
            N n10 = ((C0273n0) this.f421a).f981i;
            C0273n0.d(n10);
            n10.f608i.d("Error returning int value to wrapper", e7);
        }
    }

    public final void z0(zzdo zzdoVar, long j8) {
        Bundle bundle = new Bundle();
        bundle.putLong(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, j8);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e7) {
            N n10 = ((C0273n0) this.f421a).f981i;
            C0273n0.d(n10);
            n10.f608i.d("Error returning long value to wrapper", e7);
        }
    }
}
