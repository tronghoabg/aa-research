package E4;

import A.C0230x;
import J8.AbstractC0640o;
import J8.I;
import K8.C0706s;
import Yf.H;
import ad.L;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzru;
import com.google.android.gms.internal.mlkit_vision_text_common.zztr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.auth.FirebaseAuth;
import com.moloco.sdk.internal.InterfaceC1881c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import q5.C3866a;
import q5.EnumC3870e;
import t5.C4122q;

/* loaded from: classes.dex */
public class F implements zzub, androidx.lifecycle.F, T8.j, InterfaceC1881c {

    /* renamed from: d, reason: collision with root package name */
    public static F f2851d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2852a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2853b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2854c;

    public /* synthetic */ F(int i5) {
        this.f2852a = i5;
    }

    public static boolean c(String str) {
        boolean z2 = false;
        for (String str2 : fb.a.a()) {
            String strF = N0.a.f(str2, str);
            if (new File(str2, str).exists()) {
                Fe.b.U(strF + " binary detected!");
                z2 = true;
            }
        }
        return z2;
    }

    public static I v(Intent intent) {
        Parcelable.Creator<zzahr> creator = zzahr.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        return I.Y(((zzahr) (byteArrayExtra == null ? null : android.support.v4.media.session.b.c0(byteArrayExtra, creator))).zzc(true));
    }

    public static void w(Context context) {
        F f10 = f2851d;
        f10.f2853b = false;
        if (((BroadcastReceiver) f10.f2854c) != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver((BroadcastReceiver) f2851d.f2854c);
        }
        f2851d.f2854c = null;
    }

    @Override // T8.j
    public void a(T8.i iVar, int i5) {
        boolean z2 = this.f2853b;
        StringBuilder sb2 = (StringBuilder) this.f2854c;
        if (z2) {
            this.f2853b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i5);
    }

    @Override // androidx.lifecycle.F
    public void b(Object obj) {
        this.f2853b = true;
        L l10 = (L) this.f2854c;
        l10.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) l10.f17515b;
        signInHubActivity.setResult(signInHubActivity.f26417e, signInHubActivity.f26418f);
        signInHubActivity.finish();
    }

    public boolean d() {
        return this.f2853b;
    }

    public void e() {
        this.f2853b = true;
    }

    public boolean f(ArrayList arrayList) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = ((Context) this.f2854c).getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                Fe.b.u(str + " ROOT management app detected!");
                z2 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g() {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.F.g():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            r0 = 1
            if (r7 == 0) goto L44
            if (r8 < 0) goto L44
            int r1 = r7.length()
            int r1 = r1 - r8
            if (r1 < 0) goto L44
            java.lang.Object r1 = r6.f2854c
            i1.e r1 = (i1.e) r1
            if (r1 != 0) goto L17
            boolean r7 = r6.d()
            return r7
        L17:
            r1 = 0
            r2 = 2
            r3 = r1
            r4 = r2
        L1b:
            if (r3 >= r8) goto L39
            if (r4 != r2) goto L39
            char r4 = r7.charAt(r3)
            byte r4 = java.lang.Character.getDirectionality(r4)
            E4.F r5 = i1.f.f36716a
            if (r4 == 0) goto L36
            if (r4 == r0) goto L34
            if (r4 == r2) goto L34
            switch(r4) {
                case 14: goto L36;
                case 15: goto L36;
                case 16: goto L34;
                case 17: goto L34;
                default: goto L32;
            }
        L32:
            r4 = r2
            goto L37
        L34:
            r4 = r1
            goto L37
        L36:
            r4 = r0
        L37:
            int r3 = r3 + r0
            goto L1b
        L39:
            if (r4 == 0) goto L43
            if (r4 == r0) goto L42
            boolean r7 = r6.d()
            return r7
        L42:
            return r1
        L43:
            return r0
        L44:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.F.h(java.lang.CharSequence, int):boolean");
    }

    public void i() {
        this.f2853b = false;
    }

    public void j() {
        this.f2853b = false;
    }

    public void k(boolean z2) {
        if (this.f2853b) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f2853b = true;
        N7.e eVar = (N7.e) this.f2854c;
        int i5 = eVar.f8589c - 1;
        eVar.f8589c = i5;
        boolean z10 = z2 | eVar.f8588b;
        eVar.f8588b = z10;
        if (i5 != 0 || z10) {
            return;
        }
        ((Dd.c) eVar.f8591e).N((KeyEvent) eVar.f8590d);
    }

    public void l(byte b5) {
        ((C0230x) this.f2854c).y(String.valueOf(b5));
    }

    public void m(char c10) {
        C0230x c0230x = (C0230x) this.f2854c;
        c0230x.u(c0230x.f187b, 1);
        char[] cArr = (char[]) c0230x.f188c;
        int i5 = c0230x.f187b;
        c0230x.f187b = i5 + 1;
        cArr[i5] = c10;
    }

    public void n(int i5) {
        ((C0230x) this.f2854c).y(String.valueOf(i5));
    }

    public void o(long j8) {
        ((C0230x) this.f2854c).y(String.valueOf(j8));
    }

    public void p(String v2) {
        AbstractC3340k.e(v2, "v");
        ((C0230x) this.f2854c).y(v2);
    }

    public void q(short s10) {
        ((C0230x) this.f2854c).y(String.valueOf(s10));
    }

    public void r(String value) {
        byte b5;
        AbstractC3340k.e(value, "value");
        C0230x c0230x = (C0230x) this.f2854c;
        c0230x.u(c0230x.f187b, value.length() + 2);
        char[] cArr = (char[]) c0230x.f188c;
        int i5 = c0230x.f187b;
        int i10 = i5 + 1;
        cArr[i5] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        int i12 = i10;
        while (i12 < i11) {
            char c10 = cArr[i12];
            byte[] bArr = H.f16833b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = value.length();
                for (int i13 = i12 - i10; i13 < length2; i13++) {
                    c0230x.u(i12, 2);
                    char cCharAt = value.charAt(i13);
                    byte[] bArr2 = H.f16833b;
                    if (cCharAt >= bArr2.length || (b5 = bArr2[cCharAt]) == 0) {
                        int i14 = i12 + 1;
                        ((char[]) c0230x.f188c)[i12] = cCharAt;
                        i12 = i14;
                    } else {
                        if (b5 == 1) {
                            String str = H.f16832a[cCharAt];
                            AbstractC3340k.b(str);
                            c0230x.u(i12, str.length());
                            str.getChars(0, str.length(), (char[]) c0230x.f188c, i12);
                            int length3 = str.length() + i12;
                            c0230x.f187b = length3;
                            i12 = length3;
                        } else {
                            char[] cArr2 = (char[]) c0230x.f188c;
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = (char) b5;
                            i12 += 2;
                            c0230x.f187b = i12;
                        }
                    }
                }
                c0230x.u(i12, 1);
                ((char[]) c0230x.f188c)[i12] = '\"';
                c0230x.f187b = i12 + 1;
                return;
            }
            i12++;
        }
        cArr[i11] = '\"';
        c0230x.f187b = i11 + 1;
    }

    public synchronized void s(B b5, boolean z2) {
        try {
            if (this.f2853b || z2) {
                ((Handler) this.f2854c).obtainMessage(1, b5).sendToTarget();
            } else {
                this.f2853b = true;
                b5.a();
                this.f2853b = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        switch (this.f2852a) {
            case 2:
                return ((L) this.f2854c).toString();
            default:
                return super.toString();
        }
    }

    public void x(zzhe zzheVar) {
        if (this.f2853b) {
            zzb.zzk("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((C4122q) this.f2854c).a(new C3866a(zzheVar, EnumC3870e.f44125a, null), new m9.B(23));
        } catch (Throwable unused) {
            zzb.zzk("BillingLogger", "logging failed.");
        }
    }

    public boolean y(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC0640o abstractC0640o) {
        if (this.f2853b) {
            return false;
        }
        C0706s c0706s = new C0706s(this, activity, taskCompletionSource, firebaseAuth, abstractC0640o);
        this.f2854c = c0706s;
        LocalBroadcastManager.getInstance(activity).registerReceiver(c0706s, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
        this.f2853b = true;
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
    public zztr zza() {
        zzow zzowVar = new zzow();
        zzowVar.zze(this.f2853b ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzru zzruVar = new zzru();
        zzruVar.zzb((zzou) this.f2854c);
        zzowVar.zzg(zzruVar.zzc());
        return zzuf.zzf(zzowVar);
    }

    public /* synthetic */ F(int i5, Object obj, boolean z2) {
        this.f2852a = i5;
        this.f2854c = obj;
    }

    public /* synthetic */ F(Object obj, int i5) {
        this.f2852a = i5;
        this.f2854c = obj;
        this.f2853b = true;
    }

    public /* synthetic */ F(boolean z2, zzou zzouVar) {
        this.f2852a = 1;
        this.f2853b = z2;
        this.f2854c = zzouVar;
    }

    public F() {
        this.f2852a = 0;
        this.f2854c = new Handler(Looper.getMainLooper(), new E(0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(i1.e eVar, boolean z2) {
        this(9, eVar, false);
        this.f2852a = 9;
        this.f2853b = z2;
    }

    public F(N7.e eVar) {
        this.f2852a = 10;
        this.f2854c = eVar;
        this.f2853b = false;
    }

    public F(b7.d dVar, L l10) {
        this.f2852a = 2;
        this.f2853b = false;
        this.f2854c = l10;
    }

    public F(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f2852a = 4;
        this.f2854c = bottomSheetBehavior;
        this.f2853b = z2;
    }

    public void t() {
    }

    public void u() {
    }
}
