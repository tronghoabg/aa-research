package defpackage;

import android.app.PendingIntent;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class nub {
    public final GhIcon a;
    public final GhIcon b;
    public final String c;
    public final String d;
    public final nul e;
    public final nua f;
    public final nul g;
    public final PendingIntent h;
    public final String i;
    private final CarIcon j;
    private final long k;
    private final int[] l;

    public nub(GhIcon ghIcon, CarIcon carIcon, GhIcon ghIcon2, String str, String str2, nul nulVar, nua nuaVar, nul nulVar2, PendingIntent pendingIntent, long j, String str3) {
        this.a = ghIcon;
        this.j = carIcon;
        this.b = ghIcon2;
        this.c = str;
        this.d = str2;
        this.e = nulVar;
        this.f = nuaVar;
        this.g = nulVar2;
        this.h = pendingIntent;
        this.k = j;
        this.i = str3;
        this.l = null;
    }

    public static ntz a() {
        ntz ntzVar = new ntz();
        ntzVar.g = nua.a;
        return ntzVar;
    }

    public final boolean equals(Object obj) {
        nul nulVar;
        PendingIntent pendingIntent;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nub) {
            nub nubVar = (nub) obj;
            GhIcon ghIcon = this.a;
            if (ghIcon != null ? ghIcon.equals(nubVar.a) : nubVar.a == null) {
                CarIcon carIcon = this.j;
                if (carIcon != null ? carIcon.equals(nubVar.j) : nubVar.j == null) {
                    GhIcon ghIcon2 = this.b;
                    if (ghIcon2 != null ? ghIcon2.equals(nubVar.b) : nubVar.b == null) {
                        String str2 = this.c;
                        if (str2 != null ? str2.equals(nubVar.c) : nubVar.c == null) {
                            String str3 = this.d;
                            if (str3 != null ? str3.equals(nubVar.d) : nubVar.d == null) {
                                nul nulVar2 = this.e;
                                if (nulVar2 != null ? nulVar2.equals(nubVar.e) : nubVar.e == null) {
                                    if (this.f.equals(nubVar.f) && ((nulVar = this.g) != null ? nulVar.equals(nubVar.g) : nubVar.g == null) && ((pendingIntent = this.h) != null ? pendingIntent.equals(nubVar.h) : nubVar.h == null) && this.k == nubVar.k && ((str = this.i) != null ? str.equals(nubVar.i) : nubVar.i == null)) {
                                        if (nubVar instanceof nub) {
                                            int[] iArr = nubVar.l;
                                        }
                                        if (Arrays.equals((int[]) null, (int[]) null)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        GhIcon ghIcon = this.a;
        int iHashCode = ghIcon == null ? 0 : ghIcon.hashCode();
        CarIcon carIcon = this.j;
        int iHashCode2 = carIcon == null ? 0 : carIcon.hashCode();
        int i = iHashCode ^ 1000003;
        GhIcon ghIcon2 = this.b;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (ghIcon2 == null ? 0 : ghIcon2.hashCode())) * 1000003;
        String str = this.c;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int iHashCode5 = (iHashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        nul nulVar = this.e;
        int iHashCode6 = (((iHashCode5 ^ (nulVar == null ? 0 : nulVar.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        nul nulVar2 = this.g;
        int iHashCode7 = (iHashCode6 ^ (nulVar2 == null ? 0 : nulVar2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.h;
        int iHashCode8 = pendingIntent == null ? 0 : pendingIntent.hashCode();
        long j = this.k;
        int i2 = (((iHashCode7 ^ iHashCode8) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str3 = this.i;
        return ((i2 ^ (str3 != null ? str3.hashCode() : 0)) * 1000003) ^ Arrays.hashCode((int[]) null);
    }

    public final String toString() {
        PendingIntent pendingIntent = this.h;
        nul nulVar = this.g;
        nua nuaVar = this.f;
        nul nulVar2 = this.e;
        GhIcon ghIcon = this.b;
        CarIcon carIcon = this.j;
        return "DashboardTemplate{largeIcon=" + String.valueOf(this.a) + ", largeCarIcon=" + String.valueOf(carIcon) + ", smallIcon=" + String.valueOf(ghIcon) + ", titleText=" + this.c + ", contentText=" + this.d + ", action=" + String.valueOf(nulVar2) + ", showWhenFormat=" + String.valueOf(nuaVar) + ", action2=" + String.valueOf(nulVar) + ", contentIntent=" + String.valueOf(pendingIntent) + ", timestampMillis=" + this.k + ", packageName=" + this.i + ", actionsBackgroundTintList=" + Arrays.toString((int[]) null) + "}";
    }

    public nub() {
        throw null;
    }
}
