package defpackage;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class kwp {
    public final Object a;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[PHI: r9
  0x002c: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:11:0x001e, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kwp(int[] r23, float[] r24, float[][] r25) {
        /*
            r22 = this;
            r0 = r24
            r22.<init>()
            int r1 = r0.length
            int r1 = r1 + (-1)
            ael[][] r2 = new defpackage.ael[r1][]
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r4
            r7 = r6
        Lf:
            if (r5 >= r1) goto L70
            r8 = r23[r5]
            r9 = 3
            if (r8 == 0) goto L2c
            if (r8 == r4) goto L29
            r10 = 2
            if (r8 == r10) goto L27
            if (r8 == r9) goto L25
            r9 = 4
            if (r8 == r9) goto L2c
            r9 = 5
            if (r8 == r9) goto L2c
            r8 = r7
            goto L2d
        L25:
            if (r6 != r4) goto L29
        L27:
            r6 = r10
            goto L2a
        L29:
            r6 = r4
        L2a:
            r8 = r6
            goto L2d
        L2c:
            r8 = r9
        L2d:
            r15 = r25[r5]
            int r16 = r5 + 1
            r17 = r25[r16]
            r9 = r0[r5]
            r10 = r0[r16]
            int r7 = r15.length
            int r11 = r7 >> 1
            r7 = r7 & r4
            int r7 = r7 + r11
            ael[] r11 = new defpackage.ael[r7]
            r12 = r3
        L3f:
            if (r12 >= r7) goto L68
            int r13 = r12 + r12
            r14 = r7
            ael r7 = new ael
            r18 = r11
            r11 = r15[r13]
            int r19 = r13 + 1
            r20 = r12
            r12 = r15[r19]
            r13 = r17[r13]
            r19 = r17[r19]
            r21 = r18
            r18 = r14
            r14 = r19
            r19 = r21
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r19[r20] = r7
            int r12 = r20 + 1
            r7 = r18
            r11 = r19
            goto L3f
        L68:
            r19 = r11
            r2[r5] = r19
            r7 = r8
            r5 = r16
            goto Lf
        L70:
            r5 = r22
            r5.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwp.<init>(int[], float[], float[][]):void");
    }

    public static kwp a() {
        return (kwp) mki.a.i(kwp.class);
    }

    public static kwp e(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return null;
        }
        return new kwp(notificationManager);
    }

    public final bt A() {
        return ((bg) this.a).e;
    }

    public final View B(View view, String str, Context context, AttributeSet attributeSet) {
        return ((bg) this.a).e.d.onCreateView(view, str, context, attributeSet);
    }

    public final void C() {
        ((bg) this.a).e.s();
    }

    public final void D() {
        ((bg) this.a).e.u();
    }

    public final void E() {
        ((bg) this.a).e.v();
    }

    public final void F() {
        ((bg) this.a).e.B();
    }

    public final void G() {
        ((bg) this.a).e.D();
    }

    public final void H() {
        ((bg) this.a).e.E();
    }

    public final void I() {
        ((bg) this.a).e.G();
    }

    public final void J() {
        ((bg) this.a).e.N();
    }

    public final void K() {
        Object obj = this.a;
        bg bgVar = (bg) obj;
        bgVar.e.o(bgVar, (be) obj, null);
    }

    public final void L() {
        ((bg) this.a).e.an(true);
    }

    public final boolean b() {
        return ((nsy) this.a).j();
    }

    public final NotificationChannel c(String str) {
        return ((NotificationManager) this.a).getNotificationChannel(str);
    }

    public final void d(NotificationChannel notificationChannel) {
        ((NotificationManager) this.a).createNotificationChannel(notificationChannel);
    }

    public final zgp f(IOException iOException, wgb wgbVar) {
        return !(iOException.getCause() instanceof abon) ? new zhc(iOException) : zet.g(wgbVar.a(wub.Y(this.a)), IOException.class, new kew(iOException, 17), zfq.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final File g(Uri uri) throws wfh {
        File externalFilesDir;
        Account account;
        if (!uri.getScheme().equals("android")) {
            throw new wfh("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new wfh(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new wfh("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str = (String) arrayList.get(0);
        switch (str.hashCode()) {
            case -1820761141:
                if (str.equals("external")) {
                    externalFilesDir = ((Context) this.a).getExternalFilesDir(null);
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wfh(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str.equals("cache")) {
                    externalFilesDir = ((Context) this.a).getCacheDir();
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wfh(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str.equals("files")) {
                    externalFilesDir = woy.aC((Context) this.a);
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wfh(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str.equals("managed")) {
                    File file = new File(woy.aC((Context) this.a), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str2 = (String) arrayList.get(2);
                            Account account2 = wew.a;
                            if ("shared".equals(str2)) {
                                account = wew.a;
                            } else {
                                int iIndexOf = str2.indexOf(58);
                                aclh.o(iIndexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str2.substring(iIndexOf + 1), str2.substring(0, iIndexOf));
                            }
                            if (!wew.a.equals(account)) {
                                throw new wfh("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e) {
                            throw new wfh(e);
                        }
                    }
                    externalFilesDir = file;
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wfh(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str.equals("directboot-cache")) {
                    externalFilesDir = ((Context) this.a).createDeviceProtectedStorageContext().getCacheDir();
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wfh(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str.equals("directboot-files")) {
                    externalFilesDir = ((Context) this.a).createDeviceProtectedStorageContext().getFilesDir();
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wfh(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new wfh(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    public final ehi h() {
        return (ehi) ((ajab) this.a).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ehi i(defpackage.ehi r6) {
        /*
            r5 = this;
            r6.getClass()
        L3:
            java.lang.Object r0 = r5.a
            ajab r0 = (defpackage.ajab) r0
            java.lang.Object r1 = r0.b()
            r2 = r1
            ehi r2 = (defpackage.ehi) r2
            boolean r3 = r2 instanceof defpackage.egx
            if (r3 != 0) goto L40
            ehl r3 = defpackage.ehl.a
            boolean r3 = defpackage.affa.f(r2, r3)
            if (r3 == 0) goto L1b
            goto L40
        L1b:
            boolean r3 = r2 instanceof defpackage.ees
            if (r3 == 0) goto L29
            int r3 = r6.c
            r4 = r2
            ees r4 = (defpackage.ees) r4
            int r4 = r4.c
            if (r3 <= r4) goto L41
            goto L40
        L29:
            boolean r3 = r2 instanceof defpackage.ego
            if (r3 == 0) goto L2e
            goto L41
        L2e:
            boolean r5 = r2 instanceof defpackage.egv
            if (r5 == 0) goto L3a
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r5.<init>(r6)
            throw r5
        L3a:
            aezs r5 = new aezs
            r5.<init>()
            throw r5
        L40:
            r2 = r6
        L41:
            boolean r0 = r0.e(r1, r2)
            if (r0 == 0) goto L3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwp.i(ehi):ehi");
    }

    public final int j() {
        return ((AtomicInteger) this.a).get();
    }

    public final void k() {
        ((ebe) this.a).a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bwq, java.lang.Object] */
    public final void l(boolean z) {
        this.a.b(Boolean.valueOf(z));
    }

    public final void m() {
        ((HashMap) this.a).clear();
    }

    public final void n(String str) {
        try {
            ((Context) this.a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(a.bq(str, "Can't open ", "."), e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    public final int o() {
        return ((cpj) this.a.a()).a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bwq, java.lang.Object] */
    public final void p(int i) {
        this.a.b(new cpj(i));
    }

    public final void q(int i) {
        int i2 = 6;
        if (i != 6) {
            i2 = 3;
            if (i != 3) {
                if (i == 0) {
                    i2 = 0;
                } else {
                    i2 = 9;
                    if (i != 9) {
                        i2 = 1;
                        if (i != 1) {
                            i2 = -1;
                        }
                    }
                }
            }
        }
        Object obj = this.a;
        int[] iArr = ebm.a;
        if (i2 == -1) {
            i2 = -1;
        }
        if (i2 == -1) {
            return;
        }
        ((View) obj).performHapticFeedback(i2);
    }

    public final Object r(sm smVar) {
        ((czl) this.a).a().setPrimaryClip((ClipData) smVar.a);
        return afak.a;
    }

    public final ayp s(int i, int i2) {
        ayp aypVar = new ayp(i, i2);
        ((byw) this.a).n(aypVar);
        return aypVar;
    }

    public final void t(ayp aypVar) {
        ((byw) this.a).m(aypVar);
    }

    public final boolean u() {
        return ((byw) this.a).b != 0;
    }

    public final void v(Throwable th) {
        byw bywVar = (byw) this.a;
        int i = bywVar.b;
        aitf[] aitfVarArr = new aitf[i];
        for (int i2 = 0; i2 < i; i2++) {
            aitfVarArr[i2] = ((anb) bywVar.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            aitfVarArr[i3].g(th);
        }
        if (bywVar.b == 0) {
            return;
        }
        asl.d("uncancelled requests present");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aey, java.lang.Object] */
    public final agu w() {
        return new agu(this.a);
    }

    public final Object x(Object obj, Object obj2) {
        return ((LinkedHashMap) this.a).put(obj, obj2);
    }

    public final Object y(Object obj) {
        obj.getClass();
        return ((LinkedHashMap) this.a).remove(obj);
    }

    public final boolean z() {
        return ((LinkedHashMap) this.a).isEmpty();
    }

    public kwp(TextView textView) {
        this.a = new emz();
    }

    public kwp(Object obj) {
        this.a = obj;
    }

    public kwp(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public kwp(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new byw(new anb[16]);
    }

    public kwp(byte[] bArr, short[] sArr) {
        this.a = new byw(new ayp[16]);
    }

    public kwp(char[] cArr) {
        this.a = "tiktok_systrace";
    }

    public kwp(int i) {
        this.a = new ParcelableSnapshotMutableState(new cpj(i), bxp.c);
    }

    public kwp(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new AtomicInteger(0);
    }

    public kwp(char[] cArr, char[] cArr2) {
        this.a = new LinkedHashMap(0, 0.75f, true);
    }

    public kwp(short[] sArr) {
        this.a = new AtomicReference(null);
    }

    public kwp() {
        this.a = new ArrayList();
    }

    public kwp(byte[] bArr, byte[] bArr2) {
        this.a = new ajab(ehl.a);
    }

    public kwp(int[] iArr) {
        this.a = new zs(10);
    }

    public kwp(View view) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new eas(view) : new eaq(view);
    }

    public kwp(Context context) {
        this.a = new nsy(context);
    }

    public kwp(Context context, byte[] bArr, byte[] bArr2) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }

    public kwp(byte[] bArr) {
        this.a = new ydx(300);
    }

    public kwp(byte[] bArr, char[] cArr) {
        this.a = new HashMap();
    }

    public kwp(char[] cArr, byte[] bArr) {
        this.a = new ParcelableSnapshotMutableState(false, bxp.c);
    }

    public kwp(String str) {
        this.a = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name cannot be empty");
        }
    }
}
