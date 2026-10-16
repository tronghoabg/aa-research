package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class dta extends duc {
    public PendingIntent a;
    public PendingIntent b;
    public PendingIntent c;
    public boolean d;
    public Integer e;
    public Integer f;
    private int k;
    private duk l;
    private IconCompat m;
    private CharSequence n;

    @Override // defpackage.duc
    protected final String a() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // defpackage.duc
    protected final void b(Bundle bundle) {
        super.b(bundle);
        this.k = bundle.getInt("android.callType");
        this.d = bundle.getBoolean("android.callIsVideo");
        if (bundle.containsKey("android.callPerson")) {
            this.l = dsy.c(hg$$ExternalSyntheticApiModelOutline0.m((Object) bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.l = duk.b(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.m = dtj.d((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.m = IconCompat.h(bundle.getBundle("android.verificationIconCompat"));
        }
        this.n = bundle.getCharSequence("android.verificationText");
        this.a = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.b = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.c = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.e = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.CharSequence] */
    @Override // defpackage.duc
    public final void c(mko mkoVar) throws Resources.NotFoundException {
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (Build.VERSION.SDK_INT >= 31) {
            int i = this.k;
            if (i == 1) {
                callStyleA = dsz.a(dsy.b(this.l), this.b, this.a);
            } else if (i == 2) {
                callStyleA = dsz.b(dsy.b(this.l), this.c);
            } else if (i == 3) {
                callStyleA = dsz.c(dsy.b(this.l), this.c, this.a);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: ".concat(String.valueOf(String.valueOf(this.k))));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder((Notification.Builder) mkoVar.d);
                Integer num = this.e;
                if (num != null) {
                    dsz.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f;
                if (num2 != null) {
                    dsz.e(callStyleA, num2.intValue());
                }
                dsz.h(callStyleA, this.n);
                IconCompat iconCompat = this.m;
                if (iconCompat != null) {
                    dsz.g(callStyleA, dtj.b(iconCompat, this.g.a));
                }
                dsz.f(callStyleA, this.d);
                return;
            }
            return;
        }
        Object obj = mkoVar.d;
        duk dukVar = this.l;
        Notification.Builder builder = (Notification.Builder) obj;
        builder.setContentTitle(dukVar != null ? dukVar.a : null);
        Bundle bundle = this.g.s;
        String charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.g.s.getCharSequence("android.text");
        if (charSequence == null) {
            int i2 = this.k;
            if (i2 == 1) {
                string = this.g.a.getResources().getString(R.string.call_notification_incoming_text);
            } else if (i2 == 2) {
                string = this.g.a.getResources().getString(R.string.call_notification_ongoing_text);
            } else if (i2 == 3) {
                string = this.g.a.getResources().getString(R.string.call_notification_screening_text);
            }
        } else {
            string = charSequence;
        }
        builder.setContentText(string);
        duk dukVar2 = this.l;
        if (dukVar2 != null) {
            IconCompat iconCompat2 = dukVar2.b;
            if (iconCompat2 != null) {
                builder.setLargeIcon(dtj.b(iconCompat2, this.g.a));
            }
            dsy.a(builder, dsy.b(this.l));
        }
        builder.setCategory("call");
    }

    public final dst d(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.g.a.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.g.a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        dst dstVarA = new dss(IconCompat.m(this.g.a, i), spannableStringBuilder, pendingIntent).a();
        dstVarA.a.putBoolean("key_action_priority", true);
        return dstVarA;
    }

    @Override // defpackage.duc
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("android.callType", this.k);
        bundle.putBoolean("android.callIsVideo", this.d);
        duk dukVar = this.l;
        if (dukVar != null) {
            bundle.putParcelable("android.callPerson", dsy.b(dukVar));
        }
        IconCompat iconCompat = this.m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", dtj.b(iconCompat, this.g.a));
        }
        bundle.putCharSequence("android.verificationText", this.n);
        bundle.putParcelable("android.answerIntent", this.a);
        bundle.putParcelable("android.declineIntent", this.b);
        bundle.putParcelable("android.hangUpIntent", this.c);
        Integer num = this.e;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }
}
