package X0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.wynauto.wyn.R;

/* loaded from: classes.dex */
public final class v extends E {

    /* renamed from: e, reason: collision with root package name */
    public int f15899e;

    /* renamed from: f, reason: collision with root package name */
    public Q f15900f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f15901g;

    /* renamed from: h, reason: collision with root package name */
    public PendingIntent f15902h;

    /* renamed from: i, reason: collision with root package name */
    public PendingIntent f15903i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15904j;
    public Integer k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f15905l;

    /* renamed from: m, reason: collision with root package name */
    public IconCompat f15906m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f15907n;

    @Override // X0.E
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.f15899e);
        bundle.putBoolean("android.callIsVideo", this.f15904j);
        Q q4 = this.f15900f;
        if (q4 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", AbstractC1291t.b(H.d(q4)));
            } else {
                bundle.putParcelable("android.callPersonCompat", q4.b());
            }
        }
        IconCompat iconCompat = this.f15906m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", AbstractC1290s.a(iconCompat.j(((C1289q) this.f15788b).f15874a)));
        }
        bundle.putCharSequence("android.verificationText", this.f15907n);
        bundle.putParcelable("android.answerIntent", this.f15901g);
        bundle.putParcelable("android.declineIntent", this.f15902h);
        bundle.putParcelable("android.hangUpIntent", this.f15903i);
        Integer num = this.k;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f15905l;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // X0.E
    public final void b(N2.j jVar) throws Resources.NotFoundException {
        int i5 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) jVar.f8381d;
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (i5 < 31) {
            Q q4 = this.f15900f;
            builder.setContentTitle(q4 != null ? q4.f15813a : null);
            Bundle bundle = ((C1289q) this.f15788b).f15897y;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : ((C1289q) this.f15788b).f15897y.getCharSequence("android.text");
            if (charSequence == null) {
                int i10 = this.f15899e;
                if (i10 == 1) {
                    string = ((C1289q) this.f15788b).f15874a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i10 == 2) {
                    string = ((C1289q) this.f15788b).f15874a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i10 == 3) {
                    string = ((C1289q) this.f15788b).f15874a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            Q q10 = this.f15900f;
            if (q10 != null) {
                IconCompat iconCompat = q10.f15814b;
                if (iconCompat != null) {
                    AbstractC1290s.b(builder, iconCompat.j(((C1289q) this.f15788b).f15874a));
                }
                if (i5 >= 28) {
                    Q q11 = this.f15900f;
                    q11.getClass();
                    AbstractC1291t.a(builder, H.d(q11));
                } else {
                    r.a(builder, this.f15900f.f15815c);
                }
            }
            r.b(builder, "call");
            return;
        }
        int i11 = this.f15899e;
        if (i11 == 1) {
            Q q12 = this.f15900f;
            q12.getClass();
            callStyleA = AbstractC1292u.a(H.d(q12), this.f15902h, this.f15901g);
        } else if (i11 == 2) {
            Q q13 = this.f15900f;
            q13.getClass();
            callStyleA = AbstractC1292u.b(H.d(q13), this.f15903i);
        } else if (i11 == 3) {
            Q q14 = this.f15900f;
            q14.getClass();
            callStyleA = AbstractC1292u.c(H.d(q14), this.f15903i, this.f15901g);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f15899e));
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(builder);
            Integer num = this.k;
            if (num != null) {
                AbstractC1292u.d(callStyleA, num.intValue());
            }
            Integer num2 = this.f15905l;
            if (num2 != null) {
                AbstractC1292u.e(callStyleA, num2.intValue());
            }
            AbstractC1292u.h(callStyleA, this.f15907n);
            IconCompat iconCompat2 = this.f15906m;
            if (iconCompat2 != null) {
                AbstractC1292u.g(callStyleA, iconCompat2.j(((C1289q) this.f15788b).f15874a));
            }
            AbstractC1292u.f(callStyleA, this.f15904j);
        }
    }

    @Override // X0.E
    public final String c() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // X0.E
    public final void i(Bundle bundle) {
        super.i(bundle);
        this.f15899e = bundle.getInt("android.callType");
        this.f15904j = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f15900f = H.b(A0.j.f(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f15900f = Q.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.f15906m = IconCompat.d((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f15906m = IconCompat.c(bundle.getBundle("android.verificationIconCompat"));
        }
        this.f15907n = bundle.getCharSequence("android.verificationText");
        this.f15901g = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f15902h = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.f15903i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.k = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f15905l = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    public final C1283k j(int i5, int i10, Integer num, int i11, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(Y0.e.getColor(((C1289q) this.f15788b).f15874a, i11));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ((C1289q) this.f15788b).f15874a.getResources().getString(i10));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = ((C1289q) this.f15788b).f15874a;
        PorterDuff.Mode mode = IconCompat.k;
        context.getClass();
        C1283k c1283kA = new C1282j(IconCompat.g(context.getResources(), context.getPackageName(), i5), spannableStringBuilder, pendingIntent).a();
        c1283kA.f15849a.putBoolean("key_action_priority", true);
        return c1283kA;
    }
}
