package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes3.dex */
public final class xqi {
    public final Bundle a;

    public xqi(Bundle bundle) {
        this.a = bundle;
    }

    public final int a() {
        return this.a.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA);
    }

    public final Bitmap b() {
        Bundle bundle = this.a;
        if (bundle.containsKey("icon")) {
            return (Bitmap) bundle.getParcelable("icon");
        }
        return null;
    }

    public final CharSequence c() {
        return this.a.getCharSequence("extra1");
    }

    public final CharSequence d() {
        return this.a.getCharSequence("extra2");
    }

    public final CharSequence e() {
        return this.a.getCharSequence("subtitle");
    }

    public final CharSequence f() {
        return this.a.getCharSequence("title");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("type:" + a() + ", ");
        sb.append("icon:" + String.valueOf(b()) + ", ");
        sb.append("title:" + String.valueOf(f()) + ", ");
        sb.append("subtitle:" + String.valueOf(e()) + ", ");
        sb.append("extra1:" + String.valueOf(c()) + ", ");
        sb.append("extra2:" + String.valueOf(d()) + ", ");
        return sb.toString();
    }
}
