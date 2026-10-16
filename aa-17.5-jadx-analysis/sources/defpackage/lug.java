package defpackage;

import android.graphics.Bitmap;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class lug implements Serializable {
    public final String a;
    public final String b;
    public final duk c;
    public final yfq d;
    public final Bitmap e;
    public final boolean f;
    public final boolean g;

    public lug(String str, String str2, duk dukVar, yfq yfqVar, Bitmap bitmap, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = dukVar;
        this.d = yfqVar;
        this.e = bitmap;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        duk dukVar;
        Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lug) {
            lug lugVar = (lug) obj;
            if (this.a.equals(lugVar.a) && this.b.equals(lugVar.b) && ((dukVar = this.c) != null ? dukVar.equals(lugVar.c) : lugVar.c == null) && yrm.W(this.d, lugVar.d) && ((bitmap = this.e) != null ? bitmap.equals(lugVar.e) : lugVar.e == null) && this.f == lugVar.f && this.g == lugVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        duk dukVar = this.c;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (dukVar == null ? 0 : dukVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        Bitmap bitmap = this.e;
        return ((((iHashCode2 ^ (bitmap != null ? bitmap.hashCode() : 0)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final String toString() {
        Bitmap bitmap = this.e;
        yfq yfqVar = this.d;
        return "ConversationModel{id=" + this.a + ", title=" + this.b + ", selfSender=" + String.valueOf(this.c) + ", messages=" + String.valueOf(yfqVar) + ", iconBitmap=" + String.valueOf(bitmap) + ", isRead=" + this.f + ", isGroupConversation=" + this.g + "}";
    }

    public lug() {
        throw null;
    }
}
