package defpackage;

import android.app.PendingIntent;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes.dex */
public final class nwr {
    public static final nwr a;
    public final String b;
    public final boolean c;
    public final CharSequence d;
    public final CharSequence e;
    public final GhIcon f;
    public final Runnable g;
    public final nwq h;
    public final nuo i;
    public final GhIcon j;
    public final GhIcon k;
    public final CarIcon l;
    public final PendingIntent m;
    public final nwt n;
    public final nwt o;
    public final nwt p;
    public final Integer q;
    public final Integer r;
    public final boolean s;
    public final int t;
    public final int u;
    public int v;

    static {
        nwo nwoVar = new nwo("EMPTY_MODEL");
        nwoVar.g = new nwq(new nwp(yzz.UNKNOWN_CONTEXT));
        a = new nwr(nwoVar);
    }

    public nwr(nwo nwoVar) {
        nwq nwqVar = nwoVar.g;
        nwqVar.getClass();
        this.h = nwqVar;
        this.b = nwoVar.a;
        this.c = nwoVar.b;
        this.i = nwoVar.h;
        this.k = nwoVar.j;
        this.l = nwoVar.k;
        this.j = nwoVar.i;
        this.f = nwoVar.e;
        this.d = nwoVar.c;
        this.e = nwoVar.d;
        this.m = nwoVar.l;
        this.n = nwoVar.m;
        this.o = nwoVar.n;
        this.p = nwoVar.o;
        this.g = nwoVar.f;
        this.u = nwoVar.t;
        this.q = nwoVar.p;
        this.r = nwoVar.q;
        this.s = nwoVar.r;
        this.t = nwoVar.s;
        this.v = nwoVar.u;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof nwr)) {
            return false;
        }
        nwr nwrVar = (nwr) obj;
        if (Objects.equals(this.b, nwrVar.b) && this.c == nwrVar.c && nwt.c(this.k, nwrVar.k) && Objects.equals(this.l, nwrVar.l) && nwt.c(this.j, nwrVar.j) && nwt.c(this.f, nwrVar.f)) {
            if (this.d.toString().contentEquals(nwrVar.d.toString())) {
                if (this.e.toString().contentEquals(nwrVar.e.toString()) && Objects.equals(this.m, nwrVar.m) && Objects.equals(this.n, nwrVar.n) && Objects.equals(this.o, nwrVar.o) && Objects.equals(this.p, nwrVar.p) && Objects.equals(this.g, nwrVar.g) && this.u == nwrVar.u && Objects.equals(this.q, nwrVar.q) && Objects.equals(this.r, nwrVar.r) && this.s == nwrVar.s && this.t == nwrVar.t && this.v == nwrVar.v) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Boolean.valueOf(this.c), this.k, this.j, this.f, this.d, this.e, this.m, this.n, this.o, this.p, this.g, Integer.valueOf(this.u), this.q, this.r, Boolean.valueOf(this.s), Integer.valueOf(this.t), Integer.valueOf(this.v));
    }

    public final String toString() {
        char c;
        String str;
        String str2 = this.b;
        Locale locale = Locale.US;
        Boolean boolValueOf = Boolean.valueOf(this.c);
        GhIcon ghIcon = this.k;
        CarIcon carIcon = this.l;
        GhIcon ghIcon2 = this.j;
        GhIcon ghIcon3 = this.f;
        CharSequence charSequence = this.d;
        CharSequence charSequence2 = this.e;
        PendingIntent pendingIntent = this.m;
        nwt nwtVar = this.n;
        nwt nwtVar2 = this.o;
        nwt nwtVar3 = this.p;
        Runnable runnable = this.g;
        int i = this.u;
        String str3 = "null";
        if (i == 1) {
            c = 2;
            str = "SIMPLE";
        } else if (i != 2) {
            c = 2;
            str = i != 3 ? i != 4 ? "null" : "THREE_ACTION" : "FEEDBACK";
        } else {
            c = 2;
            str = "CALL";
        }
        Integer num = this.q;
        Integer num2 = this.r;
        String str4 = str;
        nwq nwqVar = this.h;
        Boolean boolValueOf2 = Boolean.valueOf(this.s);
        Integer numValueOf = Integer.valueOf(this.t);
        switch (this.v) {
            case 1:
                str3 = "NONE";
                break;
            case 2:
                str3 = "CLOSE_BUTTON";
                break;
            case 3:
                str3 = "CONTENT";
                break;
            case 4:
                str3 = "ACTION_1";
                break;
            case 5:
                str3 = "ACTION_2";
                break;
            case 6:
                str3 = "ACTION_3";
                break;
        }
        Object[] objArr = new Object[20];
        objArr[0] = str2;
        objArr[1] = boolValueOf;
        objArr[c] = ghIcon;
        objArr[3] = carIcon;
        objArr[4] = ghIcon2;
        objArr[5] = ghIcon3;
        objArr[6] = charSequence;
        objArr[7] = charSequence2;
        objArr[8] = pendingIntent;
        objArr[9] = nwtVar;
        objArr[10] = nwtVar2;
        objArr[11] = nwtVar3;
        objArr[12] = runnable;
        objArr[13] = str4;
        objArr[14] = num;
        objArr[15] = num2;
        objArr[16] = nwqVar;
        objArr[17] = boolValueOf2;
        objArr[18] = numValueOf;
        objArr[19] = str3;
        return String.format(locale, "HeadsUpViewModel[notificationKey=%s isUserDismissible=%blargeIcon=%s largeCarIcon=%s smallIcon=%s contentIcon=%s titleText=%s descText=%s contentIntent=%s action1=%s action2=%s action3=%s dismissAction=%s templateType=%s backgroundColor=%s themeId=%s TC=%s isWorkData=%b itemCount=%dfocusTarget=%s]", objArr);
    }
}
