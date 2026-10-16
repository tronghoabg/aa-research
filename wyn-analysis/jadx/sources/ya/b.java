package ya;

import A7.C;
import D6.C0395s;
import E4.B;
import G6.L;
import G6.U;
import Q1.x;
import Va.Ab;
import Va.AbstractC1152t8;
import Va.C0997h8;
import Va.InterfaceC1142sb;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzdzt;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zznl;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzpu;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b implements C, Le.b, B4.j, InterfaceC1142sb, o2.o {

    /* renamed from: b, reason: collision with root package name */
    public static b f48041b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48042a;

    public /* synthetic */ b(int i5) {
        this.f48042a = i5;
    }

    public static final boolean a(Context context, Intent intent, F6.c cVar, F6.a aVar, boolean z2, zzdzt zzdztVar, String str, Bundle bundle) {
        int iJ;
        if (z2) {
            try {
                iJ = C6.n.f1857D.f1863c.J(context, intent.getData(), bundle);
                if (cVar != null) {
                    cVar.zzl();
                }
            } catch (ActivityNotFoundException e7) {
                String message = e7.getMessage();
                int i5 = L.f4523b;
                H6.l.f(message);
                iJ = 6;
            }
            if (aVar != null) {
                aVar.zzb(iJ);
            }
            return iJ == 5;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 21);
            sb2.append("Launching an intent: ");
            sb2.append(uri);
            L.k(sb2.toString());
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoO)).booleanValue()) {
                U u10 = C6.n.f1857D.f1863c;
                U.v(context, intent, zzdztVar, str);
            } else {
                U u11 = C6.n.f1857D.f1863c;
                U.s(context, intent);
            }
            if (cVar != null) {
                cVar.zzl();
            }
            if (aVar != null) {
                aVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            String message2 = e10.getMessage();
            int i10 = L.f4523b;
            H6.l.f(message2);
            if (aVar != null) {
                aVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, F6.e eVar, F6.c cVar, F6.a aVar, zzdzt zzdztVar, String str) {
        int i5 = 0;
        if (eVar == null) {
            int i10 = L.f4523b;
            H6.l.f("No intent data for launcher overlay.");
            return false;
        }
        zzbix.zza(context);
        Intent intent = eVar.f3960h;
        if (intent != null) {
            return a(context, intent, cVar, aVar, eVar.f3962j, zzdztVar, str, eVar.k);
        }
        Intent intent2 = new Intent();
        String str2 = eVar.f3954b;
        if (TextUtils.isEmpty(str2)) {
            int i11 = L.f4523b;
            H6.l.f("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = eVar.f3955c;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = eVar.f3956d;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = eVar.f3957e;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                int i12 = L.f4523b;
                H6.l.f("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = eVar.f3958f;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i5 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i13 = L.f4523b;
                H6.l.f("Could not parse intent flags.");
            }
            intent2.addFlags(i5);
        }
        zzbio zzbioVar = zzbix.zzfF;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzfE)).booleanValue()) {
                U u10 = C6.n.f1857D.f1863c;
                U.L(context, intent2);
            }
        }
        return a(context, intent2, cVar, aVar, eVar.f3962j, zzdztVar, str, eVar.k);
    }

    @Override // B4.j
    public int e(B4.g gVar) {
        return 1;
    }

    @Override // B4.b
    public boolean g(Object obj, File file, B4.g gVar) throws Throwable {
        try {
            Y4.c.b(((P4.h) ((P4.c) ((B) obj).get()).f9108a.f9107b).f9125a.f328d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e7) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e7);
            return false;
        }
    }

    @Override // o2.o
    public Object t(Uri uri, S1.j jVar) {
        return Long.valueOf(x.N(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    public String toString() {
        switch (this.f48042a) {
            case 23:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    @Override // Va.InterfaceC1142sb
    public Object u(JSONArray jSONArray, int i5) {
        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
        C0997h8 c0997h8 = new C0997h8();
        c0997h8.f14251b = ISAdQualityAdType.UNKNOWN;
        c0997h8.f14250a = AbstractC1152t8.a(jSONObjectOptJSONObject.optString(C0997h8.b(AndroidCharacter.getMirror('0') - '0', 4 - ExpandableListView.getPackedPositionType(0L), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27925)).intern()));
        String strA = AbstractC1152t8.a(jSONObjectOptJSONObject.optString(C0997h8.b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, 6 - KeyEvent.getDeadChar(0, 0), (char) (55473 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern()));
        if (!TextUtils.isEmpty(strA)) {
            c0997h8.f14251b = ISAdQualityAdType.fromInt(Integer.parseInt(strA));
        }
        c0997h8.f14252c = jSONObjectOptJSONObject.optJSONObject(C0997h8.b(10 - Color.argb(0, 0, 0, 0), 6 - (Process.myPid() >> 22), (char) (Process.myTid() >> 22)).intern());
        c0997h8.f14253d = Ab.V(jSONObjectOptJSONObject, C0997h8.b(15 - ((byte) KeyEvent.getModifierMetaStateMask()), 10 - View.resolveSizeAndState(0, 0, 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), new ArrayList());
        c0997h8.f14254e = AbstractC1152t8.a(jSONObjectOptJSONObject.optString(C0997h8.b(26 - Drawable.resolveOpacity(0, 0), 10 - View.resolveSize(0, 0), (char) TextUtils.indexOf("", "", 0)).intern()));
        c0997h8.f14255f = AbstractC1152t8.a(jSONObjectOptJSONObject.optString(C0997h8.b(36 - (ViewConfiguration.getJumpTapTimeout() >> 16), 14 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern()));
        return c0997h8;
    }

    @Override // A7.C
    public Object zza() {
        switch (this.f48042a) {
            case 1:
                return Boolean.valueOf(zzpn.zzk());
            case 2:
                return Boolean.valueOf(zzpt.zza());
            case 3:
                return Integer.valueOf((int) zzng.zzaj());
            case 4:
                return Boolean.valueOf(zzpn.zzg());
            case 5:
                return Long.valueOf(zzng.zzaq());
            case 6:
                return Long.valueOf(zzng.zzr());
            case 7:
                return Integer.valueOf((int) zzng.zzm());
            case 8:
                return Integer.valueOf((int) zzph.zzc());
            case 9:
                return Integer.valueOf((int) zzng.zzi());
            case 10:
                return zzng.zzbc();
            case 11:
                return Boolean.valueOf(zzoe.zzc());
            case 12:
                return Integer.valueOf((int) zznl.zza());
            default:
                return Boolean.valueOf(zzpu.zzb());
        }
    }

    @Override // Le.b, Q1.c
    public void accept(Object obj) {
    }
}
