package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dth extends defpackage.duj {
    public android.app.PendingIntent a;
    public android.app.PendingIntent b;
    public android.app.PendingIntent c;
    public boolean d;
    public java.lang.Integer e;
    public java.lang.Integer f;
    private int k;
    private dur l;
    private androidx.core.graphics.drawable.IconCompat m;
    private java.lang.CharSequence n;

    @Override // defpackage.duj
    protected final java.lang.String a() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // defpackage.duj
    protected final void b(android.os.Bundle bundle) {
        super.b(bundle);
        this.k = bundle.getInt("android.callType");
        this.d = bundle.getBoolean("android.callIsVideo");
        if (bundle.containsKey("android.callPerson")) {
            this.l = dtb.e(hh$.ExternalSyntheticApiModelOutline0.m(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.l = dur.b(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.m = defpackage.dtq.d((android.graphics.drawable.Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.m = androidx.core.graphics.drawable.IconCompat.h(bundle.getBundle("android.verificationIconCompat"));
        }
        this.n = bundle.getCharSequence("android.verificationText");
        this.a = (android.app.PendingIntent) bundle.getParcelable("android.answerIntent");
        this.b = (android.app.PendingIntent) bundle.getParcelable("android.declineIntent");
        this.c = (android.app.PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.e = bundle.containsKey("android.answerColor") ? java.lang.Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f = bundle.containsKey("android.declineColor") ? java.lang.Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    @Override // defpackage.duj
    public final void c(defpackage.mku mkuVar) {
        java.lang.CharSequence string = null;
        callStyleA = null;
        android.app.Notification.CallStyle callStyleA = null;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            int i = this.k;
            if (i == 1) {
                callStyleA = dtg.a(dtb.d(this.l), this.b, this.a);
            } else if (i == 2) {
                callStyleA = dtg.b(dtb.d(this.l), this.c);
            } else if (i == 3) {
                callStyleA = dtg.c(dtb.d(this.l), this.c, this.a);
            } else if (android.util.Log.isLoggable("NotifCompat", 3)) {
                android.util.Log.d("NotifCompat", "Unrecognized call type in CallStyle: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.k))));
            }
            if (callStyleA != null) {
                a$.ExternalSyntheticApiModelOutline0.m(callStyleA, (android.app.Notification.Builder) mkuVar.a);
                java.lang.Integer num = this.e;
                if (num != null) {
                    dtg.d(callStyleA, num.intValue());
                }
                java.lang.Integer num2 = this.f;
                if (num2 != null) {
                    dtg.e(callStyleA, num2.intValue());
                }
                dtg.h(callStyleA, this.n);
                androidx.core.graphics.drawable.IconCompat iconCompat = this.m;
                if (iconCompat != null) {
                    dtg.g(callStyleA, defpackage.dtq.b(iconCompat, this.g.a));
                }
                dtg.f(callStyleA, this.d);
                return;
            }
            return;
        }
        java.lang.Object obj = mkuVar.a;
        dur durVar = this.l;
        android.app.Notification.Builder builder = (android.app.Notification.Builder) obj;
        builder.setContentTitle(durVar != null ? durVar.a : null);
        android.os.Bundle bundle = this.g.s;
        java.lang.CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.g.s.getCharSequence("android.text");
        if (charSequence == null) {
            int i2 = this.k;
            if (i2 == 1) {
                string = this.g.a.getResources().getString(2132083261);
            } else if (i2 == 2) {
                string = this.g.a.getResources().getString(2132083262);
            } else if (i2 == 3) {
                string = this.g.a.getResources().getString(2132083263);
            }
        } else {
            string = charSequence;
        }
        builder.setContentText(string);
        dur durVar2 = this.l;
        if (durVar2 != null) {
            androidx.core.graphics.drawable.IconCompat iconCompat2 = durVar2.b;
            if (iconCompat2 != null) {
                builder.setLargeIcon(defpackage.dtq.b(iconCompat2, this.g.a));
            }
            defpackage.dtf.a(builder, dtb.d(this.l));
        }
        builder.setCategory("call");
    }

    public final defpackage.dta d(int i, int i2, java.lang.Integer num, int i3, android.app.PendingIntent pendingIntent) {
        if (num == null) {
            num = java.lang.Integer.valueOf(this.g.a.getColor(i3));
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) this.g.a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        defpackage.dta dtaVarA = new dsz(androidx.core.graphics.drawable.IconCompat.m(this.g.a, i), spannableStringBuilder, pendingIntent).a();
        dtaVarA.a.putBoolean("key_action_priority", true);
        return dtaVarA;
    }

    @Override // defpackage.duj
    public final void e(android.os.Bundle bundle) {
        super.e(bundle);
        bundle.putInt("android.callType", this.k);
        bundle.putBoolean("android.callIsVideo", this.d);
        dur durVar = this.l;
        if (durVar != null) {
            bundle.putParcelable("android.callPerson", dtb.d(durVar));
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = this.m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", defpackage.dtq.b(iconCompat, this.g.a));
        }
        bundle.putCharSequence("android.verificationText", this.n);
        bundle.putParcelable("android.answerIntent", this.a);
        bundle.putParcelable("android.declineIntent", this.b);
        bundle.putParcelable("android.hangUpIntent", this.c);
        java.lang.Integer num = this.e;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        java.lang.Integer num2 = this.f;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }
}
