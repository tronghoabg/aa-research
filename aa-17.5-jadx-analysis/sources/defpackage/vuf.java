package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.system.ErrnoException;
import android.system.Os;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.chromium.net.CronetEngine;

/* loaded from: classes3.dex */
public class vuf {
    private static volatile float a;
    private static String b;
    public static volatile long f;
    public static Boolean g;
    public static ykd h;

    public vuf(ThreadFactory threadFactory) {
        if (threadFactory == null) {
            Executors.newSingleThreadScheduledExecutor();
        } else {
            Executors.newSingleThreadScheduledExecutor(threadFactory);
        }
        new vkf();
        new vkf();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0630  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A(defpackage.abxj r21, defpackage.abxk r22, defpackage.wic r23, android.content.Context r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vuf.A(abxj, abxk, wic, android.content.Context, java.lang.String):void");
    }

    public static void B(wic wicVar, Context context, String str) {
        wox woxVar = wia.c;
        if (wia.c(adgs.c(wia.b))) {
            wib wibVarA = wib.a();
            abnp abnpVarN = abwm.a.n();
            abnpVarN.t();
            ((abwm) abnpVarN.b).b = aclh.g(2);
            abnpVarN.t();
            ((abwm) abnpVarN.b).c = aclh.f(6);
            wibVarA.d((abwm) abnpVarN.q(), wicVar.b(), wicVar.a(), context, str);
        }
    }

    public static void C(wic wicVar, Context context, String str) {
        wox woxVar = wia.c;
        if (wia.c(adgs.c(wia.b))) {
            wib wibVarA = wib.a();
            abnp abnpVarN = abwm.a.n();
            abnpVarN.t();
            ((abwm) abnpVarN.b).b = aclh.g(2);
            abnpVarN.t();
            ((abwm) abnpVarN.b).c = aclh.f(8);
            wibVarA.d((abwm) abnpVarN.q(), wicVar.b(), wicVar.a(), context, str);
        }
    }

    public static void D(wic wicVar, Context context, String str) {
        wox woxVar = wia.c;
        if (wia.c(adgs.c(wia.b))) {
            wib wibVarA = wib.a();
            abnp abnpVarN = abwm.a.n();
            abnpVarN.t();
            ((abwm) abnpVarN.b).b = aclh.g(2);
            abnpVarN.t();
            ((abwm) abnpVarN.b).c = aclh.f(7);
            wibVarA.d((abwm) abnpVarN.q(), wicVar.b(), wicVar.a(), context, str);
        }
    }

    public static void E(EditText editText, TextView textView) {
        ebm.o(editText, new whz(editText, textView));
    }

    public static Drawable F(Drawable drawable, Context context, int i) {
        Drawable drawableMutate = drawable.getConstantState().newDrawable(context.getResources()).mutate();
        drawableMutate.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        return drawableMutate;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List G(android.content.Context r13, java.lang.String r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vuf.G(android.content.Context, java.lang.String, android.os.Bundle):java.util.List");
    }

    public static void H(Activity activity, TextView textView, String str, String str2, String str3, String str4, why whyVar) throws Resources.NotFoundException {
        Resources resources = activity.getResources();
        long j = wid.a;
        if (((UiModeManager) wub.L(new vdv(activity, 13)).gu()).getCurrentModeType() == 3) {
            textView.setText(resources.getString(R.string.survey_legal_text_car));
        } else {
            String string = resources.getString(R.string.survey_account_and_system_info);
            String string2 = resources.getString(R.string.survey_privacy);
            String string3 = resources.getString(R.string.survey_terms);
            String string4 = resources.getString(R.string.survey_legal_text, string, string2, string3);
            if (str2 != null) {
                string4 = string4.replace("Google", str2);
            }
            SpannableString spannableString = new SpannableString(string4);
            c(spannableString, string, new whv(whyVar));
            c(spannableString, string2, new whw(str3, activity, str));
            c(spannableString, string3, new whx(activity, str4, str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        wox woxVar = wia.c;
        Context context = wia.b;
        adii adiiVar = adii.a;
        if (wia.c(adiiVar.gu().d(context))) {
            String packageName = activity.getPackageName();
            wox woxVar2 = wia.c;
            if (wid.j(packageName, adiiVar.gu().a(wia.b))) {
                ebm.o(textView, new wie(textView));
            }
        }
    }

    public static void I(Context context, String str) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            Toast.makeText(context, context.getString(R.string.survey_network_request_failed), 0).show();
            return;
        }
        sf sfVar = new sf((byte[]) null);
        sfVar.a(Color.parseColor("#eeeeee"));
        sm smVarB = sfVar.b();
        eez eezVar = new eez();
        eezVar.c = smVarB.a();
        try {
            eezVar.c().a(context, Uri.parse(str));
        } catch (ActivityNotFoundException unused) {
            Log.e("ResourceUtils", "No app found to open URL: ".concat(String.valueOf(str)));
        }
    }

    public static void J(ImageView imageView, Context context, int i) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            imageView.setImageDrawable(F(drawable, context, i));
        }
    }

    public static Drawable K(Context context) {
        return F(context.getDrawable(R.drawable.survey_close_button_icon), context, context.getColor(R.color.survey_close_icon_color));
    }

    public static em L(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? new wou(new ContextThemeWrapper(context, R.style.SurveyMaterialComponentsTheme), R.style.SurveyMaterialAlertDialogStyle) : new em(context, R.style.SurveyAlertDialogTheme);
    }

    @Deprecated
    public static void M(Context context, CronetEngine cronetEngine) {
        htm htmVar = new htm(cronetEngine);
        whl whlVar = whl.a;
        wox woxVar = new wox();
        if (wia.b == null) {
            synchronized (wia.a) {
                if (wia.b == null) {
                    wia.b = context;
                }
            }
        }
        wia.c = woxVar;
        long j = wid.a;
        htm htmVar2 = new htm((Object) context, (byte[]) null);
        whj whjVar = whj.a;
        whjVar.d = htmVar2;
        wib.a().a = new sf((byte[]) null);
        whjVar.c = htmVar;
    }

    public static IOException N(nfh nfhVar, Uri uri, IOException iOException, String str) {
        try {
            wfs wfsVar = new wfs();
            wfsVar.b();
            File file = (File) nfhVar.d(uri, wfsVar);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : file.canRead() ? file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : e(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static File O(Uri uri, kwp kwpVar) throws wfh {
        String scheme = uri.getScheme();
        int iHashCode = scheme.hashCode();
        if (iHashCode != -861391249) {
            if (iHashCode == 3143036 && scheme.equals("file")) {
                return woy.aB(uri);
            }
        } else if (scheme.equals("android")) {
            return kwpVar.g(uri);
        }
        throw new wfh("Couldn't convert URI to path: ".concat(String.valueOf(String.valueOf(uri))));
    }

    public static String P(Bundle bundle) {
        StringBuilder sb = new StringBuilder("Bundle{");
        for (String str : bundle.keySet()) {
            sb.append(" ");
            sb.append(str);
            sb.append(" => ");
            sb.append(bundle.get(str));
            sb.append(";");
        }
        sb.append(" }");
        return sb.toString();
    }

    public static String Q(Context context, String str, long j, int i) throws Resources.NotFoundException, IOException {
        Resources resources = context.getApplicationContext().getResources();
        InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder)));
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenRawResource.skip(j);
            if (i <= 0) {
                i = Alert.DURATION_SHOW_INDEFINITELY;
            }
            while (i > 0) {
                int i2 = inputStreamOpenRawResource.read(bArr, 0, Math.min(i, 1024));
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                i -= i2;
            }
            inputStreamOpenRawResource.close();
            try {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static void R(String str, List list, Set set) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        yflVar.k(list);
        yflVar.i(str);
        set.add(yflVar.g());
    }

    public static String S() {
        String str = b;
        if (str != null) {
            return str;
        }
        String processName = Application.getProcessName();
        b = processName;
        return processName;
    }

    public static void T(Context context) {
        try {
            eez eezVar = new eez();
            ((sf) eezVar.a).a(Color.parseColor("#eeeeee"));
            eezVar.c().a(context, Uri.parse("https://www.google.com/policies/privacy/"));
        } catch (ActivityNotFoundException unused) {
            throw new wdr();
        }
    }

    private static abul a(abxm abxmVar) {
        abnp abnpVarN = abul.a.n();
        for (abxl abxlVar : abxmVar.b) {
            abnp abnpVarN2 = abuk.a.n();
            int i = abxlVar.c;
            abnpVarN2.t();
            ((abuk) abnpVarN2.b).b = i;
            int i2 = abxlVar.d;
            abnpVarN2.t();
            ((abuk) abnpVarN2.b).c = i2;
            String str = abxlVar.e;
            abnpVarN2.t();
            abuk abukVar = (abuk) abnpVarN2.b;
            str.getClass();
            abukVar.d = str;
            boolean z = abxlVar.f;
            abnpVarN2.t();
            ((abuk) abnpVarN2.b).e = z;
            abnpVarN.t();
            abul abulVar = (abul) abnpVarN.b;
            abuk abukVar2 = (abuk) abnpVarN2.q();
            abukVar2.getClass();
            aboh abohVar = abulVar.b;
            if (!abohVar.c()) {
                abulVar.b = abnv.I(abohVar);
            }
            abulVar.b.add(abukVar2);
        }
        return (abul) abnpVarN.q();
    }

    private static void b(int i, String str, List list, Resources resources) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(new dzi(resources.getString(i), str));
    }

    private static void c(Spannable spannable, String str, ClickableSpan clickableSpan) {
        int iIndexOf = spannable.toString().indexOf(str);
        int length = str.length() + iIndexOf;
        if (iIndexOf >= 0) {
            spannable.setSpan(clickableSpan, iIndexOf, length, 0);
        }
    }

    private static IOException d(File file, IOException iOException, String str) throws ErrnoException {
        String strConcat;
        try {
            strConcat = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            try {
                strConcat = strConcat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    private static IOException e(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        return parentFile == null ? d(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? d(file, iOException, str) : d(file, iOException, str) : parentFile.canWrite() ? d(file, iOException, str) : d(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? d(file, iOException, str) : d(file, iOException, str) : parentFile.canWrite() ? d(file, iOException, str) : d(file, iOException, str) : d(file, iOException, str);
    }

    public static xxh l(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return xvy.a;
        }
        float f2 = a;
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            synchronized (vuf.class) {
                f2 = a;
                if (f2 == BitmapDescriptorFactory.HUE_RED) {
                    float refreshRate = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    a = refreshRate;
                    f2 = refreshRate;
                }
            }
        }
        return xxh.h(Float.valueOf(f2));
    }

    public static long m(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static List n(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasTimers(i)) ? Collections.EMPTY_LIST : vrk.a.e(healthStats.getTimers(i));
    }

    public static Map o(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.EMPTY_MAP : healthStats.getStats(i);
    }

    public static ajeo p(String str) {
        abnp abnpVarN = ajeo.a.n();
        abnpVarN.t();
        ajeo ajeoVar = (ajeo) abnpVarN.b;
        ajeoVar.b |= 2;
        ajeoVar.d = str;
        return (ajeo) abnpVarN.q();
    }

    public static ajet q(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return s(null, healthStats.getTimer(i));
    }

    public static ajet r(ajet ajetVar, ajet ajetVar2) {
        if (ajetVar == null || ajetVar2 == null) {
            return ajetVar;
        }
        int i = ajetVar.c - ajetVar2.c;
        long j = ajetVar.d - ajetVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        abnp abnpVarN = ajet.a.n();
        if ((ajetVar.b & 4) != 0) {
            ajeo ajeoVar = ajetVar.e;
            if (ajeoVar == null) {
                ajeoVar = ajeo.a;
            }
            abnpVarN.t();
            ajet ajetVar3 = (ajet) abnpVarN.b;
            ajeoVar.getClass();
            ajetVar3.e = ajeoVar;
            ajetVar3.b |= 4;
        }
        abnpVarN.t();
        ajet ajetVar4 = (ajet) abnpVarN.b;
        ajetVar4.b |= 1;
        ajetVar4.c = i;
        abnpVarN.t();
        ajet ajetVar5 = (ajet) abnpVarN.b;
        ajetVar5.b |= 2;
        ajetVar5.d = j;
        return (ajet) abnpVarN.q();
    }

    public static ajet s(String str, TimerStat timerStat) {
        abnp abnpVarN = ajet.a.n();
        int count = timerStat.getCount();
        abnpVarN.t();
        ajet ajetVar = (ajet) abnpVarN.b;
        ajetVar.b |= 1;
        ajetVar.c = count;
        long time = timerStat.getTime();
        abnpVarN.t();
        ajet ajetVar2 = (ajet) abnpVarN.b;
        ajetVar2.b |= 2;
        ajetVar2.d = time;
        if (ajetVar2.c < 0) {
            abnpVarN.t();
            ajet ajetVar3 = (ajet) abnpVarN.b;
            ajetVar3.b |= 1;
            ajetVar3.c = 0;
        }
        if (str != null) {
            ajeo ajeoVarP = p(str);
            abnpVarN.t();
            ajet ajetVar4 = (ajet) abnpVarN.b;
            ajeoVarP.getClass();
            ajetVar4.e = ajeoVarP;
            ajetVar4.b |= 4;
        }
        ajet ajetVar5 = (ajet) abnpVarN.b;
        if (ajetVar5.c == 0 && ajetVar5.d == 0) {
            return null;
        }
        return (ajet) abnpVarN.q();
    }

    public static boolean t(ajep ajepVar) {
        if (ajepVar != null) {
            return ajepVar.c.size() == 0 && ajepVar.d.size() == 0;
        }
        return true;
    }

    public static boolean u(ajer ajerVar) {
        if (ajerVar != null) {
            return ajerVar.c <= 0 && ajerVar.d <= 0 && ajerVar.e <= 0 && ajerVar.f <= 0 && ajerVar.g <= 0 && ajerVar.h <= 0;
        }
        return true;
    }

    public static boolean v(ajes ajesVar) {
        if (ajesVar != null) {
            return ((long) ajesVar.c) <= 0 && ((long) ajesVar.d) <= 0;
        }
        return true;
    }

    public static boolean w(ajeu ajeuVar) {
        if (ajeuVar != null) {
            return ajeuVar.d <= 0 && ajeuVar.e <= 0 && ajeuVar.f <= 0 && ajeuVar.g <= 0 && ajeuVar.h.size() == 0 && ajeuVar.i.size() == 0 && ajeuVar.j.size() == 0 && ajeuVar.k.size() == 0 && ajeuVar.l.size() == 0 && ajeuVar.m.size() == 0 && ajeuVar.o.size() == 0 && ajeuVar.p.size() == 0 && ajeuVar.q.size() == 0 && ajeuVar.r.size() == 0 && ajeuVar.s <= 0 && ajeuVar.t <= 0 && ajeuVar.u <= 0 && ajeuVar.v <= 0 && ajeuVar.w <= 0 && ajeuVar.x <= 0 && ajeuVar.y <= 0 && ajeuVar.z <= 0 && ajeuVar.A <= 0 && ajeuVar.B <= 0 && ajeuVar.C <= 0 && ajeuVar.D <= 0 && ajeuVar.E <= 0 && ajeuVar.F <= 0 && ajeuVar.H <= 0 && ajeuVar.V <= 0 && ajeuVar.W <= 0 && ajeuVar.X <= 0 && ajeuVar.Y <= 0 && ajeuVar.Z <= 0 && ajeuVar.aa <= 0 && ajeuVar.ab <= 0 && ajeuVar.ac <= 0 && ajeuVar.ad <= 0 && ajeuVar.ae <= 0 && ajeuVar.af <= 0 && ajeuVar.ag <= 0 && ajeuVar.ah <= 0 && ajeuVar.ai <= 0 && ajeuVar.aj <= 0 && ajeuVar.ao <= 0 && ajeuVar.ap <= 0 && ajeuVar.aq <= 0;
        }
        return true;
    }

    public static void x(abnp abnpVar, vre vreVar) {
        DesugarCollections.unmodifiableList(((ajeu) abnpVar.b).h);
        for (int i = 0; i < ((ajeu) abnpVar.b).h.size(); i++) {
            abnpVar.aL(i, vreVar.c(abnpVar.av(i)));
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVar.b).i);
        for (int i2 = 0; i2 < ((ajeu) abnpVar.b).i.size(); i2++) {
            abnpVar.aM(i2, vreVar.c(abnpVar.aw(i2)));
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVar.b).j);
        for (int i3 = 0; i3 < ((ajeu) abnpVar.b).j.size(); i3++) {
            abnpVar.aN(i3, vreVar.c(abnpVar.ax(i3)));
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVar.b).k);
        for (int i4 = 0; i4 < ((ajeu) abnpVar.b).k.size(); i4++) {
            abnpVar.aK(i4, vreVar.c(abnpVar.au(i4)));
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVar.b).l);
        for (int i5 = 0; i5 < ((ajeu) abnpVar.b).l.size(); i5++) {
            abnpVar.aJ(i5, vreVar.c(abnpVar.at(i5)));
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVar.b).m);
        for (int i6 = 0; i6 < ((ajeu) abnpVar.b).m.size(); i6++) {
            abnpVar.aH(i6, vreVar.c(abnpVar.ar(i6)));
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVar.b).o);
        for (int i7 = 0; i7 < ((ajeu) abnpVar.b).o.size(); i7++) {
            abnpVar.aI(i7, vreVar.c(abnpVar.as(i7)));
        }
    }

    @ResultIgnorabilityUnspecified
    public static vrm y(Long l, Long l2, HealthStats healthStats, vuo vuoVar, int i) {
        Object obj;
        abnp abnpVarN = ajeu.a.n();
        long jM = m(healthStats, 10001);
        if (jM != 0) {
            abnpVarN.t();
            ajeu ajeuVar = (ajeu) abnpVarN.b;
            ajeuVar.b |= 1;
            ajeuVar.d = jM;
        }
        long jM2 = m(healthStats, 10002);
        if (jM2 != 0) {
            abnpVarN.t();
            ajeu ajeuVar2 = (ajeu) abnpVarN.b;
            ajeuVar2.b |= 2;
            ajeuVar2.e = jM2;
        }
        long jM3 = m(healthStats, 10003);
        if (jM3 != 0) {
            abnpVarN.t();
            ajeu ajeuVar3 = (ajeu) abnpVarN.b;
            ajeuVar3.b |= 4;
            ajeuVar3.f = jM3;
        }
        long jM4 = m(healthStats, 10004);
        if (jM4 != 0) {
            abnpVarN.t();
            ajeu ajeuVar4 = (ajeu) abnpVarN.b;
            ajeuVar4.b |= 8;
            ajeuVar4.g = jM4;
        }
        abnpVarN.aE(n(healthStats, 10005));
        abnpVarN.aF(n(healthStats, 10006));
        abnpVarN.aG(n(healthStats, 10007));
        abnpVarN.aD(n(healthStats, 10008));
        abnpVarN.aC(n(healthStats, 10009));
        abnpVarN.ay(n(healthStats, 10010));
        ajet ajetVarQ = q(healthStats, 10011);
        if (ajetVarQ != null) {
            abnpVarN.t();
            ajeu ajeuVar5 = (ajeu) abnpVarN.b;
            ajeuVar5.n = ajetVarQ;
            ajeuVar5.b |= 16;
        }
        abnpVarN.az(n(healthStats, 10012));
        abnpVarN.aB(vrh.a.e(o(healthStats, 10014)));
        abnpVarN.aA(vrg.a.e(o(healthStats, 10015)));
        long jM5 = m(healthStats, 10016);
        if (jM5 != 0) {
            abnpVarN.t();
            ajeu ajeuVar6 = (ajeu) abnpVarN.b;
            ajeuVar6.b |= 32;
            ajeuVar6.s = jM5;
        }
        long jM6 = m(healthStats, 10017);
        if (jM6 != 0) {
            abnpVarN.t();
            ajeu ajeuVar7 = (ajeu) abnpVarN.b;
            ajeuVar7.b |= 64;
            ajeuVar7.t = jM6;
        }
        long jM7 = m(healthStats, 10018);
        if (jM7 != 0) {
            abnpVarN.t();
            ajeu ajeuVar8 = (ajeu) abnpVarN.b;
            ajeuVar8.b |= 128;
            ajeuVar8.u = jM7;
        }
        long jM8 = m(healthStats, 10019);
        if (jM8 != 0) {
            abnpVarN.t();
            ajeu ajeuVar9 = (ajeu) abnpVarN.b;
            ajeuVar9.b |= 256;
            ajeuVar9.v = jM8;
        }
        long jM9 = m(healthStats, 10020);
        if (jM9 != 0) {
            abnpVarN.t();
            ajeu ajeuVar10 = (ajeu) abnpVarN.b;
            ajeuVar10.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            ajeuVar10.w = jM9;
        }
        long jM10 = m(healthStats, 10021);
        if (jM10 != 0) {
            abnpVarN.t();
            ajeu ajeuVar11 = (ajeu) abnpVarN.b;
            ajeuVar11.b |= 1024;
            ajeuVar11.x = jM10;
        }
        long jM11 = m(healthStats, 10022);
        if (jM11 != 0) {
            abnpVarN.t();
            ajeu ajeuVar12 = (ajeu) abnpVarN.b;
            ajeuVar12.b |= 2048;
            ajeuVar12.y = jM11;
        }
        long jM12 = m(healthStats, 10023);
        if (jM12 != 0) {
            abnpVarN.t();
            ajeu ajeuVar13 = (ajeu) abnpVarN.b;
            ajeuVar13.b |= 4096;
            ajeuVar13.z = jM12;
        }
        long jM13 = m(healthStats, 10024);
        if (jM13 != 0) {
            abnpVarN.t();
            ajeu ajeuVar14 = (ajeu) abnpVarN.b;
            ajeuVar14.b |= 8192;
            ajeuVar14.A = jM13;
        }
        long jM14 = m(healthStats, 10025);
        if (jM14 != 0) {
            abnpVarN.t();
            ajeu ajeuVar15 = (ajeu) abnpVarN.b;
            ajeuVar15.b |= 16384;
            ajeuVar15.B = jM14;
        }
        long jM15 = m(healthStats, 10026);
        if (jM15 != 0) {
            abnpVarN.t();
            ajeu ajeuVar16 = (ajeu) abnpVarN.b;
            ajeuVar16.b |= 32768;
            ajeuVar16.C = jM15;
        }
        long jM16 = m(healthStats, 10027);
        if (jM16 != 0) {
            abnpVarN.t();
            ajeu ajeuVar17 = (ajeu) abnpVarN.b;
            ajeuVar17.b |= 65536;
            ajeuVar17.D = jM16;
        }
        long jM17 = m(healthStats, 10028);
        if (jM17 != 0) {
            abnpVarN.t();
            ajeu ajeuVar18 = (ajeu) abnpVarN.b;
            ajeuVar18.b |= 131072;
            ajeuVar18.E = jM17;
        }
        long jM18 = m(healthStats, 10029);
        if (jM18 != 0) {
            abnpVarN.t();
            ajeu ajeuVar19 = (ajeu) abnpVarN.b;
            ajeuVar19.b |= 262144;
            ajeuVar19.F = jM18;
        }
        ajet ajetVarQ2 = q(healthStats, 10030);
        if (ajetVarQ2 != null) {
            abnpVarN.t();
            ajeu ajeuVar20 = (ajeu) abnpVarN.b;
            ajeuVar20.G = ajetVarQ2;
            ajeuVar20.b |= 524288;
        }
        long jM19 = m(healthStats, 10031);
        if (jM19 != 0) {
            abnpVarN.t();
            ajeu ajeuVar21 = (ajeu) abnpVarN.b;
            ajeuVar21.b |= 1048576;
            ajeuVar21.H = jM19;
        }
        ajet ajetVarQ3 = q(healthStats, 10032);
        if (ajetVarQ3 != null) {
            abnpVarN.t();
            ajeu ajeuVar22 = (ajeu) abnpVarN.b;
            ajeuVar22.I = ajetVarQ3;
            ajeuVar22.b |= 2097152;
        }
        ajet ajetVarQ4 = q(healthStats, 10033);
        if (ajetVarQ4 != null) {
            abnpVarN.t();
            ajeu ajeuVar23 = (ajeu) abnpVarN.b;
            ajeuVar23.J = ajetVarQ4;
            ajeuVar23.b |= 4194304;
        }
        ajet ajetVarQ5 = q(healthStats, 10034);
        if (ajetVarQ5 != null) {
            abnpVarN.t();
            ajeu ajeuVar24 = (ajeu) abnpVarN.b;
            ajeuVar24.K = ajetVarQ5;
            ajeuVar24.b |= 8388608;
        }
        ajet ajetVarQ6 = q(healthStats, 10035);
        if (ajetVarQ6 != null) {
            abnpVarN.t();
            ajeu ajeuVar25 = (ajeu) abnpVarN.b;
            ajeuVar25.L = ajetVarQ6;
            ajeuVar25.b |= 16777216;
        }
        ajet ajetVarQ7 = q(healthStats, 10036);
        if (ajetVarQ7 != null) {
            abnpVarN.t();
            ajeu ajeuVar26 = (ajeu) abnpVarN.b;
            ajeuVar26.M = ajetVarQ7;
            ajeuVar26.b |= 33554432;
        }
        ajet ajetVarQ8 = q(healthStats, 10037);
        if (ajetVarQ8 != null) {
            abnpVarN.t();
            ajeu ajeuVar27 = (ajeu) abnpVarN.b;
            ajeuVar27.N = ajetVarQ8;
            ajeuVar27.b |= 67108864;
        }
        ajet ajetVarQ9 = q(healthStats, 10038);
        if (ajetVarQ9 != null) {
            abnpVarN.t();
            ajeu ajeuVar28 = (ajeu) abnpVarN.b;
            ajeuVar28.O = ajetVarQ9;
            ajeuVar28.b |= 134217728;
        }
        ajet ajetVarQ10 = q(healthStats, 10039);
        if (ajetVarQ10 != null) {
            abnpVarN.t();
            ajeu ajeuVar29 = (ajeu) abnpVarN.b;
            ajeuVar29.P = ajetVarQ10;
            ajeuVar29.b |= 268435456;
        }
        ajet ajetVarQ11 = q(healthStats, 10040);
        if (ajetVarQ11 != null) {
            abnpVarN.t();
            ajeu ajeuVar30 = (ajeu) abnpVarN.b;
            ajeuVar30.Q = ajetVarQ11;
            ajeuVar30.b |= 536870912;
        }
        ajet ajetVarQ12 = q(healthStats, 10041);
        if (ajetVarQ12 != null) {
            abnpVarN.t();
            ajeu ajeuVar31 = (ajeu) abnpVarN.b;
            ajeuVar31.R = ajetVarQ12;
            ajeuVar31.b |= 1073741824;
        }
        ajet ajetVarQ13 = q(healthStats, 10042);
        if (ajetVarQ13 != null) {
            abnpVarN.t();
            ajeu ajeuVar32 = (ajeu) abnpVarN.b;
            ajeuVar32.S = ajetVarQ13;
            ajeuVar32.b |= Integer.MIN_VALUE;
        }
        ajet ajetVarQ14 = q(healthStats, 10043);
        if (ajetVarQ14 != null) {
            abnpVarN.t();
            ajeu ajeuVar33 = (ajeu) abnpVarN.b;
            ajeuVar33.T = ajetVarQ14;
            ajeuVar33.c |= 1;
        }
        ajet ajetVarQ15 = q(healthStats, 10044);
        if (ajetVarQ15 != null) {
            abnpVarN.t();
            ajeu ajeuVar34 = (ajeu) abnpVarN.b;
            ajeuVar34.U = ajetVarQ15;
            ajeuVar34.c |= 2;
        }
        long jM20 = m(healthStats, 10045);
        if (jM20 != 0) {
            abnpVarN.t();
            ajeu ajeuVar35 = (ajeu) abnpVarN.b;
            ajeuVar35.c |= 4;
            ajeuVar35.V = jM20;
        }
        long jM21 = m(healthStats, 10046);
        if (jM21 != 0) {
            abnpVarN.t();
            ajeu ajeuVar36 = (ajeu) abnpVarN.b;
            ajeuVar36.c |= 8;
            ajeuVar36.W = jM21;
        }
        long jM22 = m(healthStats, 10047);
        if (jM22 != 0) {
            abnpVarN.t();
            ajeu ajeuVar37 = (ajeu) abnpVarN.b;
            ajeuVar37.c |= 16;
            ajeuVar37.X = jM22;
        }
        long jM23 = m(healthStats, 10048);
        if (jM23 != 0) {
            abnpVarN.t();
            ajeu ajeuVar38 = (ajeu) abnpVarN.b;
            ajeuVar38.c |= 32;
            ajeuVar38.Y = jM23;
        }
        long jM24 = m(healthStats, 10049);
        if (jM24 != 0) {
            abnpVarN.t();
            ajeu ajeuVar39 = (ajeu) abnpVarN.b;
            ajeuVar39.c |= 64;
            ajeuVar39.Z = jM24;
        }
        long jM25 = m(healthStats, 10050);
        if (jM25 != 0) {
            abnpVarN.t();
            ajeu ajeuVar40 = (ajeu) abnpVarN.b;
            ajeuVar40.c |= 128;
            ajeuVar40.aa = jM25;
        }
        long jM26 = m(healthStats, 10051);
        if (jM26 != 0) {
            abnpVarN.t();
            ajeu ajeuVar41 = (ajeu) abnpVarN.b;
            ajeuVar41.c |= 256;
            ajeuVar41.ab = jM26;
        }
        long jM27 = m(healthStats, 10052);
        if (jM27 != 0) {
            abnpVarN.t();
            ajeu ajeuVar42 = (ajeu) abnpVarN.b;
            ajeuVar42.c |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            ajeuVar42.ac = jM27;
        }
        long jM28 = m(healthStats, 10053);
        if (jM28 != 0) {
            abnpVarN.t();
            ajeu ajeuVar43 = (ajeu) abnpVarN.b;
            ajeuVar43.c |= 1024;
            ajeuVar43.ad = jM28;
        }
        long jM29 = m(healthStats, 10054);
        if (jM29 != 0) {
            abnpVarN.t();
            ajeu ajeuVar44 = (ajeu) abnpVarN.b;
            ajeuVar44.c |= 2048;
            ajeuVar44.ae = jM29;
        }
        long jM30 = m(healthStats, 10055);
        if (jM30 != 0) {
            abnpVarN.t();
            ajeu ajeuVar45 = (ajeu) abnpVarN.b;
            ajeuVar45.c |= 4096;
            ajeuVar45.af = jM30;
        }
        long jM31 = m(healthStats, 10056);
        if (jM31 != 0) {
            abnpVarN.t();
            ajeu ajeuVar46 = (ajeu) abnpVarN.b;
            ajeuVar46.c |= 8192;
            ajeuVar46.ag = jM31;
        }
        long jM32 = m(healthStats, 10057);
        if (jM32 != 0) {
            abnpVarN.t();
            ajeu ajeuVar47 = (ajeu) abnpVarN.b;
            ajeuVar47.c |= 16384;
            ajeuVar47.ah = jM32;
        }
        long jM33 = m(healthStats, 10058);
        if (jM33 != 0) {
            abnpVarN.t();
            ajeu ajeuVar48 = (ajeu) abnpVarN.b;
            ajeuVar48.c |= 32768;
            ajeuVar48.ai = jM33;
        }
        long jM34 = m(healthStats, 10059);
        if (jM34 != 0) {
            abnpVarN.t();
            ajeu ajeuVar49 = (ajeu) abnpVarN.b;
            ajeuVar49.c = 65536 | ajeuVar49.c;
            ajeuVar49.aj = jM34;
        }
        ajet ajetVarQ16 = q(healthStats, 10061);
        if (ajetVarQ16 != null) {
            abnpVarN.t();
            ajeu ajeuVar50 = (ajeu) abnpVarN.b;
            ajeuVar50.an = ajetVarQ16;
            ajeuVar50.c |= 131072;
        }
        long jM35 = m(healthStats, 10062);
        if (jM35 != 0) {
            abnpVarN.t();
            ajeu ajeuVar51 = (ajeu) abnpVarN.b;
            ajeuVar51.c |= 262144;
            ajeuVar51.ao = jM35;
        }
        long jM36 = m(healthStats, 10063);
        if (jM36 != 0) {
            abnpVarN.t();
            ajeu ajeuVar52 = (ajeu) abnpVarN.b;
            ajeuVar52.c = 524288 | ajeuVar52.c;
            ajeuVar52.ap = jM36;
        }
        long jM37 = m(healthStats, 10064);
        if (jM37 != 0) {
            abnpVarN.t();
            ajeu ajeuVar53 = (ajeu) abnpVarN.b;
            ajeuVar53.c |= 1048576;
            ajeuVar53.aq = jM37;
        }
        abnp abnpVarK = ((ajeu) abnpVarN.q()).K();
        DesugarCollections.unmodifiableList(((ajeu) abnpVarK.b).h);
        int i2 = 0;
        while (true) {
            Object obj2 = vuoVar.c;
            int size = ((ajeu) abnpVarK.b).h.size();
            obj = ((aacq) obj2).a;
            if (i2 >= size) {
                break;
            }
            abnpVarK.aL(i2, ((vre) obj).b(vrd.a, abnpVarK.av(i2)));
            i2++;
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVarK.b).i);
        for (int i3 = 0; i3 < ((ajeu) abnpVarK.b).i.size(); i3++) {
            abnpVarK.aM(i3, ((vre) obj).b(vrd.a, abnpVarK.aw(i3)));
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVarK.b).j);
        for (int i4 = 0; i4 < ((ajeu) abnpVarK.b).j.size(); i4++) {
            abnpVarK.aN(i4, ((vre) obj).b(vrd.a, abnpVarK.ax(i4)));
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVarK.b).k);
        for (int i5 = 0; i5 < ((ajeu) abnpVarK.b).k.size(); i5++) {
            abnpVarK.aK(i5, ((vre) obj).b(vrd.a, abnpVarK.au(i5)));
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVarK.b).l);
        for (int i6 = 0; i6 < ((ajeu) abnpVarK.b).l.size(); i6++) {
            abnpVarK.aJ(i6, ((vre) obj).b(vrd.b, abnpVarK.at(i6)));
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVarK.b).m);
        for (int i7 = 0; i7 < ((ajeu) abnpVarK.b).m.size(); i7++) {
            abnpVarK.aH(i7, ((vre) obj).b(vrd.c, abnpVarK.ar(i7)));
        }
        DesugarCollections.unmodifiableList(((ajeu) abnpVarK.b).o);
        for (int i8 = 0; i8 < ((ajeu) abnpVarK.b).o.size(); i8++) {
            abnpVarK.aI(i8, ((vre) obj).b(vrd.e, abnpVarK.as(i8)));
        }
        return new vrm((ajeu) abnpVarK.q(), l, l2, 959816797L, Long.valueOf(vuoVar.b != null ? ((String) r1).hashCode() : 0L), i, null, null, null);
    }

    public static abuy z(abyc abycVar) {
        abnp abnpVarN = abuy.a.n();
        int i = abycVar.b;
        abnpVarN.t();
        ((abuy) abnpVarN.b).b = i;
        int i2 = abycVar.c;
        abnpVarN.t();
        ((abuy) abnpVarN.b).c = i2;
        String str = abycVar.d;
        abnpVarN.t();
        abuy abuyVar = (abuy) abnpVarN.b;
        str.getClass();
        abuyVar.d = str;
        return (abuy) abnpVarN.q();
    }

    public vuf(byte[] bArr, char[] cArr) {
    }

    private vuf() {
    }
}
