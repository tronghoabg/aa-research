package X0;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.Objects;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f15813a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f15814b;

    /* renamed from: c, reason: collision with root package name */
    public String f15815c;

    /* renamed from: d, reason: collision with root package name */
    public String f15816d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15817e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15818f;

    public static Q a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence(MediationMetaData.KEY_NAME);
        IconCompat iconCompatC = bundle2 != null ? IconCompat.c(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        boolean z2 = bundle.getBoolean("isBot");
        boolean z10 = bundle.getBoolean("isImportant");
        Q q4 = new Q();
        q4.f15813a = charSequence;
        q4.f15814b = iconCompatC;
        q4.f15815c = string;
        q4.f15816d = string2;
        q4.f15817e = z2;
        q4.f15818f = z10;
        return q4;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(MediationMetaData.KEY_NAME, this.f15813a);
        IconCompat iconCompat = this.f15814b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.f18067a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f18068b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f18068b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f18068b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f18068b);
                    break;
            }
            bundle.putInt("type", iconCompat.f18067a);
            bundle.putInt("int1", iconCompat.f18071e);
            bundle.putInt("int2", iconCompat.f18072f);
            bundle.putString("string1", iconCompat.f18076j);
            ColorStateList colorStateList = iconCompat.f18073g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f18074h;
            if (mode != IconCompat.k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f15815c);
        bundle2.putString(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, this.f15816d);
        bundle2.putBoolean("isBot", this.f15817e);
        bundle2.putBoolean("isImportant", this.f15818f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Q)) {
            return false;
        }
        Q q4 = (Q) obj;
        String str = this.f15816d;
        String str2 = q4.f15816d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.f15813a), Objects.toString(q4.f15813a)) && Objects.equals(this.f15815c, q4.f15815c) && Boolean.valueOf(this.f15817e).equals(Boolean.valueOf(q4.f15817e)) && Boolean.valueOf(this.f15818f).equals(Boolean.valueOf(q4.f15818f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f15816d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f15813a, this.f15815c, Boolean.valueOf(this.f15817e), Boolean.valueOf(this.f15818f));
    }
}
