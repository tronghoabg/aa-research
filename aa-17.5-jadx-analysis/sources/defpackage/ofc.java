package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Instant;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ofc implements odo {
    public static final /* synthetic */ int b = 0;
    private static final yph c = yph.c("GH.TelecomUtils");
    private static final String[] d = {"display_name", RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "label", "_id"};
    private final HashMap e = new HashMap();
    private final HashMap f = new HashMap();
    private final HashMap g = new HashMap();
    private final HashMap h = new HashMap();
    private final HashMap i = new HashMap();

    private final String T(Context context, String str, String str2) {
        HashMap map = this.i;
        String str3 = (String) map.get(str2);
        if (str3 != null) {
            return str3;
        }
        if (TextUtils.isEmpty(str2)) {
            return context.getString(R.string.unknown);
        }
        String string = ebf.A().C(str2) ? context.getString(R.string.voicemail) : n(context.getContentResolver(), str2);
        if (true != TextUtils.isEmpty(string)) {
            str = string;
        }
        if (TextUtils.isEmpty(str)) {
            str = r(context, str2);
        }
        map.put(str2, str);
        return str;
    }

    private static final String U(Context context, String str, String str2, String str3) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) ? (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) ? (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) ? (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) ? TextUtils.isEmpty(str) ? !TextUtils.isEmpty(str2) ? str2 : TextUtils.isEmpty(str3) ? "" : str3 : str : context.getString(R.string.phone_label_with_info, str2, str3) : context.getString(R.string.phone_label_with_info, str2, str) : context.getString(R.string.phone_label_with_info, str, str3) : context.getString(R.string.phone_label_with_extra_call_message, str2, str, str3);
    }

    private static final String V(long j) {
        if (j <= 0) {
            return "";
        }
        oit.a();
        return DateUtils.formatElapsedTime((Instant.now().toEpochMilli() - j) / 1000);
    }

    private static final boolean W(int i) {
        return i == 0 || i == 9 || i == 1;
    }

    private static final boolean X(Context context, String str) {
        return new tgw(context, acqd.j()).b(str);
    }

    private static String Y(ContentResolver contentResolver, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            ((ype) ((ype) c.f()).ai((char) 5801)).y("empty or null contact number %s", str2);
            return null;
        }
        if (PhoneNumberUtils.formatNumber(str2, Locale.getDefault().getCountry()) == null) {
            ((ype) ((ype) c.f()).ai((char) 5800)).y("invalid number: %s", str2);
            return null;
        }
        try {
            Cursor cursorQuery = contentResolver.query(Uri.withAppendedPath(ContactsContract.PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI, Uri.encode(str2)), new String[]{str}, null, null, str3);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex(str));
                        cursorQuery.close();
                        return string;
                    }
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (SecurityException e) {
            ((ype) ((ype) ((ype) c.h()).p(e)).ai((char) 5798)).u("Contacts permission denied");
        } catch (RuntimeException e2) {
            if (!ogb.k()) {
                throw e2;
            }
            ((ype) ((ype) ((ype) c.g()).p(e2)).ai((char) 5799)).y("Problem reading field %s", str);
        }
        return null;
    }

    @Override // defpackage.odo
    public final Collection A(Context context) {
        ArrayList arrayList = new ArrayList();
        if (H(context)) {
            arrayList.add(acai.x);
        }
        if (B(context)) {
            arrayList.add(acai.y);
        }
        if (X(context, o(context))) {
            arrayList.add(acai.L);
        }
        if (L(context)) {
            arrayList.add(acai.J);
        }
        return arrayList;
    }

    @Override // defpackage.odo
    public final boolean B(Context context) {
        if (dup.c(context, "android.permission.READ_PRIVILEGED_PHONE_STATE") == 0 && Build.VERSION.SDK_INT >= 29) {
            TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
            telecomManager.getClass();
            if (telecomManager.getUserSelectedOutgoingPhoneAccount() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.odo
    public final boolean C(odm odmVar, odm odmVar2) {
        if (odmVar2 != odm.ACTIVE) {
            return false;
        }
        return odmVar == null || odmVar == odm.RINGING || odmVar == odm.DISCONNECTED;
    }

    @Override // defpackage.odo
    public final boolean D(CarCall carCall) {
        return (mcd.A().u() && mcd.A().t(carCall) && (carCall.f.g & 2) != 2) ? false : true;
    }

    @Override // defpackage.odo
    public final boolean E() {
        return Collection.EL.stream(ebf.A().k()).anyMatch(new mrw(13));
    }

    @Override // defpackage.odo
    public final boolean F(int i) {
        return i == 2;
    }

    @Override // defpackage.odo
    public final boolean G(CarCall carCall) {
        return F(carCall.e);
    }

    @Override // defpackage.odo
    public final boolean H(Context context) {
        if (Build.VERSION.SDK_INT >= 30 && lgv.c().k()) {
            TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
            telecomManager.getClass();
            List<PhoneAccountHandle> callCapablePhoneAccounts = telecomManager.getCallCapablePhoneAccounts();
            if (callCapablePhoneAccounts != null && callCapablePhoneAccounts.size() > 1) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.odo
    public final boolean I(int i) {
        return i == 4 || i == 3 || i == 1;
    }

    @Override // defpackage.odo
    public final boolean J(CarCall carCall) {
        return W(carCall.e);
    }

    @Override // defpackage.odo
    public final boolean K(odm odmVar, odm odmVar2) {
        return odmVar2 == odm.ACTIVE && odm.DIALING.equals(odmVar);
    }

    @Override // defpackage.odo
    public final boolean L(Context context) {
        String strO = o(context);
        if (!X(context, strO)) {
            return Build.VERSION.SDK_INT >= 34;
        }
        String str = (String) ((yfy) tgx.d(new nsb(6), acqd.h()).collect(ycm.a(new uzr(20), new zwd(1)))).get(strO);
        if (str != null) {
            strO = str;
        }
        return new tgw(context, acqd.j()).a(strO);
    }

    @Override // defpackage.odo
    public final boolean M(Context context, String str) {
        try {
            return (context.getPackageManager().getApplicationInfo(str, 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            ((ype) ((ype) c.h()).ai((char) 5796)).y("Dialer with package name: %s not found", str);
            return false;
        }
    }

    @Override // defpackage.odo
    public final boolean N(odm odmVar, odm odmVar2) {
        odm odmVar3 = odm.DIALING;
        return odmVar2 == odmVar3 && !odmVar3.equals(odmVar);
    }

    @Override // defpackage.odo
    public final boolean O(odm odmVar, odm odmVar2) {
        odm odmVar3 = odm.RINGING;
        return odmVar2 == odmVar3 && !odmVar3.equals(odmVar);
    }

    @Override // defpackage.odo
    @ResultIgnorabilityUnspecified
    public final int P(ContentResolver contentResolver, String str) {
        String strY = Y(contentResolver, "starred", str, "starred DESC");
        if (strY != null) {
            return true != strY.equals(CloudRecognizerProtocolStrings.DBG_VALUE) ? 3 : 2;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r7 != null) goto L13;
     */
    @Override // defpackage.odo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List Q(android.content.ContentResolver r7, java.lang.String r8) {
        /*
            r6 = this;
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r5 = "data2 LIMIT 1"
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L1b
            yph r7 = defpackage.ofc.c
            yop r7 = r7.g()
            java.lang.String r8 = "You must specify a valid id to get a contact's phone number."
            r0 = 5793(0x16a1, float:8.118E-42)
            defpackage.a.bs(r7, r8, r0)
            return r6
        L1b:
            android.net.Uri r1 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String r0 = "data1"
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
            java.lang.String r3 = "contact_id = ?"
            java.lang.String[] r4 = new java.lang.String[]{r8}     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
            r0 = r7
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
            if (r7 == 0) goto L48
            boolean r8 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L60
            if (r8 == 0) goto L48
        L36:
            r8 = 0
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Throwable -> L60
            r6.add(r8)     // Catch: java.lang.Throwable -> L60
            boolean r8 = r7.moveToNext()     // Catch: java.lang.Throwable -> L60
            if (r8 != 0) goto L36
        L44:
            r7.close()     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
            return r6
        L48:
            yph r8 = defpackage.ofc.c     // Catch: java.lang.Throwable -> L60
            yop r8 = r8.g()     // Catch: java.lang.Throwable -> L60
            ype r8 = (defpackage.ype) r8     // Catch: java.lang.Throwable -> L60
            r0 = 5790(0x169e, float:8.114E-42)
            yop r8 = r8.ai(r0)     // Catch: java.lang.Throwable -> L60
            ype r8 = (defpackage.ype) r8     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "Unable to move phone number cursor to the first item."
            r8.u(r0)     // Catch: java.lang.Throwable -> L60
            if (r7 == 0) goto L94
            goto L44
        L60:
            r0 = move-exception
            r8 = r0
            if (r7 == 0) goto L6d
            r7.close()     // Catch: java.lang.Throwable -> L68
            goto L6d
        L68:
            r0 = move-exception
            r7 = r0
            r8.addSuppressed(r7)     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
        L6d:
            throw r8     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
        L6e:
            r0 = move-exception
            r7 = r0
            boolean r8 = defpackage.ogb.k()
            if (r8 == 0) goto L84
            yph r8 = defpackage.ofc.c
            yop r8 = r8.g()
            java.lang.String r0 = "Problem reading numbers"
            r1 = 5792(0x16a0, float:8.116E-42)
            defpackage.a.bv(r8, r0, r1, r7)
            goto L94
        L84:
            throw r7
        L85:
            r0 = move-exception
            r7 = r0
            yph r8 = defpackage.ofc.c
            yop r8 = r8.h()
            java.lang.String r0 = "Contacts permission denied"
            r1 = 5791(0x169f, float:8.115E-42)
            defpackage.a.bv(r8, r0, r1, r7)
        L94:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofc.Q(android.content.ContentResolver, java.lang.String):java.util.List");
    }

    @Override // defpackage.odo
    public final boolean R() {
        return (woy.at("SAMSUNG", Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 33) || Build.VERSION.SDK_INT >= 34;
    }

    @Override // defpackage.odo
    public final void S(Context context, ComponentName componentName) {
        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f  */
    @Override // defpackage.odo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap a(android.content.ContentResolver r11, java.lang.String r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofc.a(android.content.ContentResolver, java.lang.String):android.graphics.Bitmap");
    }

    @Override // defpackage.odo
    public final Uri b(Context context, CarCall carCall) {
        odp odpVarA = mcd.A();
        if (!odpVarA.u() || !odpVarA.t(carCall)) {
            return jxn.c().b(u(carCall), p(context, carCall));
        }
        Uri uriF = odpVarA.f(carCall);
        return uriF != null ? uriF : jxn.c().a(u(carCall), p(context, carCall));
    }

    @Override // defpackage.lhg
    public final void d() {
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
    }

    @Override // defpackage.odo
    public final CarCall e(int i) {
        for (CarCall carCall : ebf.A().k()) {
            if (carCall.a == i) {
                return carCall;
            }
        }
        return null;
    }

    @Override // defpackage.odo
    public final CarCall f(int... iArr) {
        for (CarCall carCall : ebf.A().k()) {
            for (int i = 0; i < 3; i++) {
                if (carCall.e == iArr[i]) {
                    return carCall;
                }
            }
        }
        return null;
    }

    @Override // defpackage.odo
    public final CarCall g() {
        List listK = ebf.A().k();
        if (listK.isEmpty()) {
            return null;
        }
        CarCall carCall = (CarCall) listK.get(0);
        if (carCall.b != null) {
            return null;
        }
        return carCall;
    }

    @Override // defpackage.odo
    public final CarCall h() {
        List listK = ebf.A().k();
        if (listK.size() < 2) {
            return null;
        }
        CarCall carCall = (CarCall) listK.get(1);
        if (carCall.b != null) {
            return null;
        }
        return carCall;
    }

    @Override // defpackage.odo
    public final rrb i(int i, yzz yzzVar, yzy yzyVar) {
        return j(e(i), yzzVar, yzyVar);
    }

    @Override // defpackage.odo
    public final rrb j(CarCall carCall, yzz yzzVar, yzy yzyVar) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzyVar);
        if (carCall != null) {
            rrbVarH.h(carCall.a);
            rrbVarH.p(mcd.A().b(carCall));
        }
        return rrbVarH;
    }

    @Override // defpackage.odo
    public final rrb k(yzz yzzVar, yzy yzyVar) {
        return j(g(), yzzVar, yzyVar);
    }

    @Override // defpackage.odo
    public final CharSequence l(Context context, CarCall carCall) {
        PhoneAccountHandle phoneAccountHandle = carCall.f.h;
        if (phoneAccountHandle == null) {
            ((ype) ((ype) c.f()).ai((char) 5784)).u("Account name not found (account handle missing from call)");
            return null;
        }
        TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
        telecomManager.getClass();
        PhoneAccount phoneAccount = telecomManager.getPhoneAccount(phoneAccountHandle);
        if (phoneAccount == null) {
            ((ype) ((ype) c.f()).ai((char) 5783)).u("Account name not found (account not found for handle)");
            return null;
        }
        CharSequence label = phoneAccount.getLabel();
        if (label != null) {
            return label;
        }
        ((ype) ((ype) c.f()).ai((char) 5782)).u("Account name not found (account found, but name is null)");
        return null;
    }

    @Override // defpackage.odo
    public final CharSequence m(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap map = this.g;
            if (map.containsKey(str)) {
                return (CharSequence) map.get(str);
            }
            ContentResolver contentResolver = context.getContentResolver();
            Resources resources = context.getResources();
            try {
                Cursor cursorQuery = contentResolver.query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            CharSequence charSequence = (CharSequence) new ntn(ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, cursorQuery.getInt(cursorQuery.getColumnIndex(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA)), cursorQuery.getString(cursorQuery.getColumnIndex("label")))).i("");
                            map.put(str, charSequence);
                            cursorQuery.close();
                            return charSequence;
                        }
                    } finally {
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return "";
                }
            } catch (SecurityException e) {
                ((ype) ((ype) ((ype) c.h()).p(e)).ai((char) 5794)).u("Contacts permission denied");
            } catch (RuntimeException e2) {
                if (!ogb.k()) {
                    throw e2;
                }
                ((ype) ((ype) ((ype) c.g()).p(e2)).ai((char) 5795)).u("Problem reading type");
            }
        }
        return "";
    }

    @Override // defpackage.odo
    public final String n(ContentResolver contentResolver, String str) {
        HashMap map = this.e;
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        String strY = Y(contentResolver, "display_name", str, null);
        map.put(str, strY);
        return strY;
    }

    @Override // defpackage.odo
    public final String o(Context context) {
        TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
        telecomManager.getClass();
        return telecomManager.getDefaultDialerPackage();
    }

    @Override // defpackage.odo
    public final String p(Context context, CarCall carCall) {
        if (carCall.g) {
            return context.getString(R.string.conference_call);
        }
        if (mcd.A().u() && mcd.A().t(carCall)) {
            String str = carCall.f.b;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return T(context, carCall.f.b, u(carCall));
    }

    @Override // defpackage.odo
    public final String q(Context context, String str) {
        return T(context, null, str);
    }

    @Override // defpackage.odo
    public final String r(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        HashMap map = this.h;
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        String simCountryIso = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso();
        if ((TextUtils.isEmpty(simCountryIso) || simCountryIso.length() != 2) && ((simCountryIso = Locale.getDefault().getCountry()) == null || simCountryIso.length() != 2)) {
            simCountryIso = "US";
        }
        String upperCase = simCountryIso.toUpperCase(Locale.US);
        String number = PhoneNumberUtils.formatNumber(str, PhoneNumberUtils.formatNumberToE164(str, upperCase), upperCase);
        if (true == TextUtils.isEmpty(number)) {
            number = str;
        }
        map.put(str, number);
        return number;
    }

    @Override // defpackage.odo
    public final String s(Context context, ComponentName componentName, int i) {
        CarCall carCallE;
        if (!componentName.equals(mkn.b)) {
            PackageManager packageManager = context.getPackageManager();
            try {
                String string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(componentName.getPackageName(), 0)).toString();
                if (!TextUtils.isEmpty(string)) {
                    return context.getString(R.string.notification_incoming_voip_call, string);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                ((ype) ((ype) c.g()).ai((char) 5789)).y("Could not find package info for component %s", componentName.flattenToShortString());
            }
        }
        if (this.H(context) && (carCallE = this.e(i)) != null) {
            CharSequence charSequenceL = this.l(context, carCallE);
            if (!TextUtils.isEmpty(charSequenceL)) {
                return this.z(context, carCallE.e, charSequenceL.toString());
            }
            ((ype) ((ype) c.h()).ai((char) 5788)).u("Failed to generate SIM identification text (can't find account name)");
        }
        return context.getString(R.string.notification_incoming_call);
    }

    @Override // defpackage.odo
    public final String t(Context context, long j, String str) {
        context.getClass();
        return U(context, V(j), context.getString(R.string.phone_muted), str);
    }

    @Override // defpackage.odo
    public final String u(CarCall carCall) {
        CarCall.Details details;
        if (carCall == null || (details = carCall.f) == null) {
            return null;
        }
        Uri uri = details.e;
        if (uri != null) {
            return uri.getSchemeSpecificPart();
        }
        Uri uri2 = details.a;
        if (uri2 != null) {
            return uri2.getSchemeSpecificPart();
        }
        return null;
    }

    @Override // defpackage.odo
    public final String v(Context context, long j, String str) {
        context.getClass();
        return U(context, V(j), context.getString(R.string.phone_on_hold), str);
    }

    @Override // defpackage.odo
    public final String w(Context context, int i, String str) {
        long j;
        CarCall carCallE = e(i);
        if (carCallE != null) {
            z = carCallE.e == 3;
            j = carCallE.f.d;
        } else {
            j = 0;
        }
        long j2 = j;
        return z ? v(context, j2, null) : ebf.A().z(i) ? t(context, j2, null) : x(context, j2, str, null);
    }

    @Override // defpackage.odo
    public final String x(Context context, long j, String str, String str2) {
        context.getClass();
        return U(context, V(j), str, str2);
    }

    @Override // defpackage.odo
    public final String y(Context context, long j) {
        if (j <= 0) {
            return "";
        }
        oni.b();
        return oni.a(context, j);
    }

    @Override // defpackage.odo
    public final String z(Context context, int i, String str) {
        return F(i) ? context.getString(R.string.sim_identifier_incoming_call, str) : W(i) ? context.getString(R.string.sim_identifier_outgoing_call, str) : str;
    }

    @Override // defpackage.lhg
    public final void c() {
    }
}
