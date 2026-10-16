package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class duk {
    public final CharSequence a;
    public final IconCompat b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public duk(duj dujVar) {
        this.a = dujVar.a;
        this.b = dujVar.b;
        this.c = dujVar.c;
        this.d = dujVar.d;
        this.e = dujVar.e;
        this.f = dujVar.f;
    }

    public static duk b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        duj dujVar = new duj();
        dujVar.a = bundle.getCharSequence("name");
        dujVar.b = bundle2 != null ? IconCompat.h(bundle2) : null;
        dujVar.c = bundle.getString("uri");
        dujVar.d = bundle.getString("key");
        dujVar.e = bundle.getBoolean("isBot");
        dujVar.f = bundle.getBoolean("isImportant");
        return new duk(dujVar);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.g() : null);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof duk)) {
            return false;
        }
        duk dukVar = (duk) obj;
        String str = this.d;
        String str2 = dukVar.d;
        if (str != null || str2 != null) {
            return Objects.equals(str, str2);
        }
        if (Objects.equals(Objects.toString(this.a), Objects.toString(dukVar.a)) && Objects.equals(this.c, dukVar.c)) {
            if (Objects.equals(Boolean.valueOf(this.e), Boolean.valueOf(dukVar.e))) {
                if (Objects.equals(Boolean.valueOf(this.f), Boolean.valueOf(dukVar.f))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
